#pragma once

#define JAVA_PACKAGE_PATH(REL) "com/destranix/glslang" #REL

#define GLSLANG_ERROR_NONE 0
#define GLSLANG_ERROR_INVALID_LENGTH 1
#define GLSLANG_ERROR_ARRAY_INDEX_OUT_OF_BOUNDS 2
#define GLSLANG_ERROR_NOT_YET_IMPLEMENTED 3
#define GLSLANG_ERROR_INVALID_ARGUMENT 4

static const char* ERROR_STRINGS[] = {
	"No error occured",
	"Called Method with structure of invalid length",
	"Tried to access array on invalid index",
	"Seems like this function is not yet implemented for some reason",
	"The given argument was invalid"
};

typedef enum {
	GlslangErrorModeNone,
	GlslangErrorModeCode,
	GlslangErrorModeException
} GlslangErrorMode;
#include <stdlib.h>
#include <functional>
#include <typeinfo>
#include <ostream>

#include <jni.h>

#define ENABLE_HLSL

#include <glslang/Include/Common.h>

static std::map<const void*, std::set<std::function<void()>*>*> allocationPool;

#define JNI_METHOD_GUARD_ENTER try{
#ifdef LINUX
	void printCStackTrace(int sig);

	#define JNI_METHOD_GUARD_LEAVE }catch(const std::exception& e){\
		if(getCatchCExceptions()){\
			fprintf(stderr, "An Exception occured: %s\n", e.what());\
			printCStackTrace(-1);\
			abort();\
		}else{\
			throw;\
		}\
	}

#elif WINDOWS
	#include <windows.h>
	void printCStackTrace(const CONTEXT* context);
	class custom_se_exception : public std::exception{
	public:
		const CONTEXT context;

		explicit custom_se_exception(const char* msg, CONTEXT c) : msg_(msg), context(c){}
		explicit custom_se_exception(const std::string msg, CONTEXT c) : msg_(msg), context(c){}
		virtual ~custom_se_exception() throw (){}
		virtual const char* what() const throw (){
			return msg_.c_str();
		}
	protected:
	    std::string msg_;
	};

	#define JNI_METHOD_GUARD_LEAVE }catch(const custom_se_exception& e){\
		if(getCatchCExceptions()){\
			fprintf(stderr, "An Exception occured: %s\n", e.what());\
			printCStackTrace(&e.context);\
			abort();\
		}else{\
			throw;\
		}\
	}catch(const std::exception& e){\
		if(getCatchCExceptions()){\
			fprintf(stderr, "An Exception occured: %s\n", e.what());\
			printCStackTrace(nullptr);\
			abort();\
		}else{\
			throw;\
		}\
	}
#endif

void* byteArrayToPointer(JNIEnv* env, jbyteArray array);

jbyteArray pointerToByteArray(JNIEnv* env, const void* ptr);

const struct _$_ {} _$;
template <typename T> struct _$Proxy{
    public:_$Proxy(T& t) : t_(t){}
    T& t_;
    static void* __$_(JNIEnv* a, const jbyteArray b);
};
template <typename T> _$Proxy<T> operator<(T& lhs, const _$_& rhs){
    return _$Proxy<T>(lhs);
}
inline void* operator>(const _$Proxy<JNIEnv*>& lhs, const jbyteArray& rhs){
    return _$Proxy<JNIEnv*>::__$_(lhs.t_, rhs);
}
template <typename T> inline void* _$Proxy<T>::__$_(JNIEnv* a, const jbyteArray b) {
    return byteArrayToPointer(a, b);
}

const struct $__ {} $_;
template <typename T> struct $_Proxy{
    public:$_Proxy(T& t) : t_(t){}
    T& t_;
    static jbyteArray _$__(JNIEnv* a, const void* b);
};
template <typename T> $_Proxy<T> operator<(T& lhs, const $__& rhs){
    return $_Proxy<T>(lhs);
}
inline jbyteArray operator>(const $_Proxy<JNIEnv*>& lhs, void* rhs){
    return $_Proxy<JNIEnv*>::_$__(lhs.t_, static_cast<const void*>(rhs));
}
inline jbyteArray operator>(const $_Proxy<JNIEnv*>& lhs, const void* rhs){
    return $_Proxy<JNIEnv*>::_$__(lhs.t_, rhs);
}
template <typename T> jbyteArray operator>(const $_Proxy<JNIEnv*>& lhs, const T& rhs){
    return $_Proxy<JNIEnv*>::_$__(lhs.t_, &rhs);
}
template <typename T> jbyteArray operator>(const $_Proxy<JNIEnv*>& lhs, T* rhs){
    return $_Proxy<JNIEnv*>::_$__(lhs.t_, static_cast<const T*>(rhs));
}
template <typename T> jbyteArray operator>(const $_Proxy<JNIEnv*>& lhs, const T* rhs){
    return $_Proxy<JNIEnv*>::_$__(lhs.t_, rhs);
}
template <typename T> inline jbyteArray $_Proxy<T>::_$__(JNIEnv* a, const void* b) {
    return pointerToByteArray(a, b);
}

//Shorthands to make code easier readable
#define _$ <_$>
#define $_ <$_>
#define $ static_cast

//Allocates new instance.
template<typename T> inline T* Pool_mallocRegister(T* type, const void* key){
	T* ret = new T();
	if(key != nullptr){
		allocationPool.insert(std::make_pair(key, (new std::set<std::function<void()>*>())));
		allocationPool.find(key)->second->insert(new std::function<void()>([ret](){
			delete ret;
		}));
	}
	return ret;
}

template<typename T> inline T* Pool_mallocRegister(T* type, nullptr_t key){
	return Pool_mallocRegister(type, $<const void*>(NULL));
}

template<typename T, typename K> inline T* Pool_mallocRegister(T* type, const K* key){
	return Pool_mallocRegister(type, $<const void*>(key));
}

template<typename T, typename K> inline T* Pool_mallocRegister(T* type, K* key){
	return Pool_mallocRegister(type, $<const void*>(key));
}

template<typename T> inline T* Pool_mallocRegister(T* type, void* key){
	return Pool_mallocRegister(type, $<const void*>(key));
}

template<typename T> inline T* Pool_malloc(T* type){
	T* ret = new T();
	allocationPool.insert(std::make_pair($<void*>(ret), (new std::set<std::function<void()>*>())));
	allocationPool.find($<void*>(ret))->second->insert(new std::function<void()>([ret](){
		delete ret;
	}));
	return ret;
}

template<typename T, typename... Args> inline T* Pool_mallocRegister(T* type, const void* key, Args... a){
	T* ret = new T(a...);
	if(key != nullptr){
		allocationPool.insert(std::make_pair(key, (new std::set<std::function<void()>*>())));
		allocationPool.find(key)->second->insert(new std::function<void()>([ret](){
			delete ret;
		}));
	}
	return ret;
}

template<typename T, typename... Args> inline T* Pool_mallocRegister(T* type, nullptr_t key, Args... a){
	return Pool_mallocRegister(type, $<const void*>(NULL), a...);
}

template<typename T, typename K, typename... Args> inline T* Pool_mallocRegister(T* type, K* key, Args... a){
	return Pool_mallocRegister(type, $<const void*>(key), a...);
}

template<typename T, typename... Args> inline T* Pool_mallocRegister(T* type, void* key, Args... a){
	return Pool_mallocRegister(type, $<const void*>(key), a...);
}


//Indirect Versions needed when passing by reference in Constructorcall not possible(i.e. protected Copy-Constructor)
template<typename T, typename... Args> inline T* Pool_mallocRegisterIndirect(T* type, const void* key, Args*... a){
	T* ret = new T(*a...);
	if(key != nullptr){
		allocationPool.insert(std::make_pair(key, (new std::set<std::function<void()>*>())));
		allocationPool.find(key)->second->insert(new std::function<void()>([ret](){
			delete ret;
		}));
	}
	return ret;
}

template<typename T, typename... Args> inline T* Pool_mallocRegisterIndirect(T* type, nullptr_t key, Args*... a){
	return Pool_mallocRegisterIndirect(type, $<const void*>(NULL), a...);
}

template<typename T, typename K, typename... Args> inline T* Pool_mallocRegisterIndirect(T* type, K* key, Args*... a){
	return Pool_mallocRegisterIndirect(type, $<const void*>(key), a...);
}

template<typename T, typename... Args> inline T* Pool_mallocRegisterIndirect(T* type, void* key, Args*... a){
	return Pool_mallocRegisterIndirect(type, $<const void*>(key), a...);
}

template<typename T, typename... Args> inline T* Pool_malloc(T* type, Args... a){
	T* ret = new T(a...);
	allocationPool.insert(std::make_pair($<void*>(ret), (new std::set<std::function<void()>*>())));
	allocationPool.find($<void*>(ret))->second->insert(new std::function<void()>([ret](){
		delete ret;
	}));
	return ret;
}

template<typename T, typename... Args> inline T* Pool_mallocIndirect(T* type, Args*... a){
	T* ret = new T(*a...);
	allocationPool.insert(std::make_pair($<void*>(ret), (new std::set<std::function<void()>*>())));
	allocationPool.find($<void*>(ret))->second->insert(new std::function<void()>([ret](){
		delete ret;
	}));
	return ret;
}

template<typename T> inline T* Pool_callocRegister(T* type, const void* key, size_t count){
	T* ret = new T[count];
	if(key != nullptr){
		allocationPool.insert(std::make_pair(key, (new std::set<std::function<void()>*>())));
		allocationPool.find(key)->second->insert(new std::function<void()>([ret](){
			delete[] ret;
		}));
	}
	return ret;
}

template<typename T> inline T* Pool_callocRegister(T* type, nullptr_t key, size_t count){
	return Pool_callocRegister(type, $<const void*>(NULL), count);
}

template<typename T, typename K> inline T* Pool_callocRegister(T* type, const K* key, size_t count){
	return Pool_callocRegister(type, $<const void*>(key), count);
}

template<typename T, typename K> inline T* Pool_callocRegister(T* type, K* key, size_t count){
	return Pool_callocRegister(type, $<const void*>(key), count);
}

template<typename T> inline T* Pool_callocRegister(T* type, void* key, size_t count){
	return Pool_callocRegister(type, $<const void*>(key), count);
}

template<typename T> inline T* Pool_calloc(T* type, size_t count){
	T* ret = new T[count];
	allocationPool.insert(std::make_pair($<void*>(ret), (new std::set<std::function<void()>*>())));
	allocationPool.find($<void*>(ret))->second->insert(new std::function<void()>([ret](){
		delete[] ret;
	}));
	return ret;
}

template<typename T> inline void Pool_register(void* key, T* value){
	if(key != nullptr){
		allocationPool.insert(std::make_pair(key, (new std::set<std::function<void()>*>())));
		allocationPool.find(key)->second->insert(new std::function<void()>([value](){
			delete value;
		}));
	}
}

//Frees instances connected to deleted object
void Pool_cleanup(void* key);

void freeAllocationPool();

jstring toString(JNIEnv* env, const char* chars);

jstring toString(JNIEnv* env, const glslang::TString* chars);

jstring toString(JNIEnv* env, const std::string& chars);

jobjectArray toStringArray(JNIEnv* env, const std::vector<std::string> a);

jobjectArray toStringArray(JNIEnv* env, const glslang::TVector<glslang::TString> a);

jobjectArray toStringArray(JNIEnv* env, const char** a, int length);

glslang::TString* toTString(JNIEnv* env, jstring s);

glslang::TString* toTString(JNIEnv* env, jstring s, int length);

std::string toCString(JNIEnv* env, jstring s);

std::string toCString(JNIEnv* env, jstring s, int length);

const char* toChars(JNIEnv* env, jstring s);

const char* toChars(JNIEnv* env, jstring s, int length);

const char** toCharArrays(JNIEnv* env, jobjectArray s, void* ref);

const char** toCharArrays(JNIEnv* env, jobjectArray s, int* l, void* ref);

std::vector<const char*>* toCharsVector(JNIEnv* env, jobjectArray s, void* ref);
std::vector<std::string>* toCStringVector(JNIEnv* env, jobjectArray s, void* ref);
glslang::TVector<glslang::TString>* toTStringTVector(JNIEnv* env, jobjectArray s, void* ref);

template<typename T> inline std::vector<T>* toVector(T a[], size_t length, void* ref){
	std::vector<T>* ret = nullptr;
	ret = Pool_mallocRegister(ret, ref);
	for(unsigned int i=0;i<(unsigned int)(int) length;++i){
		ret->push_back(a[i]);
	}
	return ret;
}

template<typename T> inline glslang::TVector<T>* toTVector(T a[], size_t length, void* ref){
	glslang::TVector<T>* ret = nullptr;
	ret = Pool_mallocRegister(ret, ref);
	for(unsigned int i=0;i<(unsigned int)(int) length;++i){
		ret->push_back(a[i]);
	}
	return ret;
}

template<typename T> inline glslang::TList<T>* toTList(T a[], size_t length, void* ref){
	glslang::TList<T>* ret = nullptr;
	ret = Pool_mallocRegister(ret, ref);
	for(unsigned int i=0;i<(unsigned int)(int) length;++i){
		ret->push_back(a[i]);
	}
	return ret;
}

long long BigIntegerToLongLong(JNIEnv* env, jobject v);

unsigned long long BigIntegerToUnsignedLongLong(JNIEnv* env, jobject v);

jobject toBigInteger(JNIEnv* env, long long v);

jobject toBigInteger(JNIEnv* env, unsigned long long v);

std::ostream* toOstream(JNIEnv* env, jobject v, void* ref);

std::vector<unsigned int>* toUnsignedIntVector(jlong* arr, size_t length);

std::vector<jlong>* toJlongVector(unsigned int* arr, size_t length);

JavaVM* getJVM();

class GlobalRef{
public:
	GlobalRef(){}

	GlobalRef(jobject obj){
		JavaVM* jvm = getJVM();

		JNIEnv* env = nullptr;

		jvm->AttachCurrentThread((void**)&env, nullptr);

		ref = env->NewGlobalRef(obj);
	}

	void setRef(jobject obj){
		JavaVM* jvm = getJVM();

		JNIEnv* env = nullptr;

		jvm->AttachCurrentThread((void**)&env, nullptr);

		ref = env->NewGlobalRef(obj);
	}

	jobject getRef(){
		return ref;
	}

	void releaseRef(){
		JavaVM* jvm = getJVM();

		JNIEnv* env = nullptr;

		jvm->AttachCurrentThread((void**)&env, nullptr);

		env->DeleteGlobalRef(ref);

		ref = nullptr;
	}

	~GlobalRef(){
		JavaVM* jvm = getJVM();

		JNIEnv* env = nullptr;

		jvm->AttachCurrentThread((void**)&env, nullptr);

		env->DeleteGlobalRef(ref);
	}
protected:
	jobject ref;
};

template<class R, class... Args> inline std::function<R(Args...)>* createCallback(std::function<R(JNIEnv*, Args...)>& callback, void* elem){
	JavaVM* jvm = getJVM();

	std::function<R(Args...)>* cCallback = nullptr;
	cCallback = Pool_mallocRegister(cCallback, elem);
	*cCallback = [jvm, callback](Args... a){
		JNIEnv* envRef = nullptr;

		jvm->AttachCurrentThread((void**)&envRef, nullptr);
		return callback(envRef, a...);
	};

	return cCallback;
}

template<typename T>
struct IteratorContainer{
	typename T::iterator iter;
};

template<typename V>
class CIterator{
public:
	CIterator(){}

	template<typename T>
	CIterator(T* c){
		init(c);
	}

	template<typename T>
	CIterator(typename T::iterator& it){
		init(it);
	}

	template<typename T>
	void init(T* c){
		IteratorContainer<T>* tmp = Pool_malloc($<IteratorContainer<T>*>(nullptr));
		tmp->iter = c->begin();
		begin = $<void*>(tmp);
		tmp = new IteratorContainer<T>();
		tmp->iter = c->end();
		end = $<void*>(tmp);
		iterNotEqual = [](void* o0, void* o1){
			return ($<IteratorContainer<T>*>(o0)->iter) != ($<IteratorContainer<T>*>(o1)->iter);
		};
		iterDeref = [](void* o){
			return $<V>(*($<IteratorContainer<T>*>(o)->iter));
		};
		iterInc = [](void* o){
			($<IteratorContainer<T>*>(o)->iter)++;
		};
		tmp = Pool_malloc($<IteratorContainer<T>*>(nullptr));
		tmp->iter = c->begin();
		iter = $<void*>(tmp);
	}

	template<typename T>
	void init(typename T::iterator it){
		IteratorContainer<T>* tmp = Pool_malloc($<IteratorContainer<T>*>(nullptr));
		tmp->iter = it;
		begin = $<void*>(tmp);
		end = nullptr;
		iterNotEqual = [](void* o0, void* o1){
			if(o0 == nullptr && o1 == nullptr){
				return false;
			}else if(o0 == nullptr || o1 == nullptr){
				return true;
			}else{
				return ($<IteratorContainer<T>*>(o0)->iter) != ($<IteratorContainer<T>*>(o1)->iter);
			}
		};
		iterDeref = [](void* o){
			return $<V>(*($<IteratorContainer<T>*>(o)->iter));
		};
		iterInc = [this](void* o){
			this->iter = nullptr;
		};
		iter = begin;
	}

	template<typename T>
	void init(typename T::iterator& it){
		IteratorContainer<T>* tmp = Pool_malloc($<IteratorContainer<T>*>(nullptr));
		tmp->iter = it;
		begin = $<void*>(tmp);
		end = nullptr;
		iterNotEqual = [](void* o0, void* o1){
			if(o0 == nullptr && o1 == nullptr){
				return false;
			}else if(o0 == nullptr || o1 == nullptr){
				return true;
			}else{
				return ($<IteratorContainer<T>*>(o0)->iter) != ($<IteratorContainer<T>*>(o1)->iter);
			}
		};
		iterDeref = [](void* o){
			return $<V>(*($<IteratorContainer<T>*>(o)->iter));
		};
		iterInc = [this](void* o){
			this->iter = nullptr;
		};
		iter = begin;
	}

	bool hasNext(){
		return iterNotEqual(iter, end);
	}

	V next(){
		V ret = iterDeref(iter);
		iterInc(iter);
		return ret;
	}

	virtual ~CIterator(){
		if(iter != nullptr){
			Pool_cleanup(iter);
		}
		if(begin != nullptr){
			Pool_cleanup(begin);
		}
		if(end != nullptr){
			Pool_cleanup(end);
		}
	}
protected:
	void* begin = nullptr;
	void* end = nullptr;
	void* iter = nullptr;
	std::function<bool(void*, void*)> iterNotEqual;
	std::function<V(void*)> iterDeref;
	std::function<void(void*)> iterInc;
};

template<typename V>
class CListIterator : CIterator<V>{
public:
	CListIterator(){}

	template<typename T>
	CListIterator(T* c){
		init(c);
	}

	template<typename T>
	CListIterator(T* c, int index){
		init(c, index);
	}

	template<typename T>
	CListIterator(typename T::iterator& it){
		init(it);
	}

	template<typename T>
	CListIterator(typename T::iterator& it, int index){
		init(it, index);
	}

	template<typename T>
	void init(T* c){
		CIterator<V>::init(c);
		newIter = [c](){
			IteratorContainer<T>* tmp = Pool_malloc($<IteratorContainer<T>*>(nullptr));
			tmp->iter = c->begin();
			return $<void*>(tmp);
		};
		iterDec = [](void* o){
			($<IteratorContainer<T>*>(o)->iter)--;
		};
		erase = [c](void* o){
			$<IteratorContainer<T>*>(o)->iter = c->erase($<IteratorContainer<T>*>(o)->iter);
		};
		insert = [c](void* o, V e){
			$<IteratorContainer<T>*>(o)->iter = c->insert($<IteratorContainer<T>*>(o)->iter, e);
		};
		advance = [](void* o, int index){
			std::advance($<IteratorContainer<T>*>(o)->iter, index);
		};
	}

	template<typename T>
	void init(T* c, int index){
		init(c);
		advance(CIterator<V>::iter, index);
	}

	template<typename T>
	void init(typename T::iterator it){
		CIterator<V>::init(it);
		newIter = [it](){
			IteratorContainer<T>* tmp = Pool_malloc($<IteratorContainer<T>*>(nullptr));
			tmp->iter = it;
			return $<void*>(tmp);
		};
		iterDec = [](void* o){
			//Do nothing
		};
		erase = [](void* o){
			throw new std::runtime_error("Unsupported operation: erase");
		};
		insert = [](void* o, V e){
			throw new std::runtime_error("Unsupported operation: insert");
		};
		advance = [this](void* o, int index){
			if(index != 0){
				this->iter = nullptr;
			}
		};
	}

	template<typename T>
	void init(typename T::iterator& it){
		CIterator<V>::init(it);
		newIter = [it](){
			IteratorContainer<T>* tmp = Pool_malloc($<IteratorContainer<T>*>(nullptr));
			tmp->iter = it;
			return $<void*>(tmp);
		};
		iterDec = [](void* o){
			//Do nothing
		};
		erase = [](void* o){
			throw new std::runtime_error("Unsupported operation: erase");
		};
		insert = [](void* o, V e){
			throw new std::runtime_error("Unsupported operation: insert");
		};
		advance = [this](void* o, int index){
			if(index != 0){
				this->iter = nullptr;
			}
		};
	}

	template<typename T>
	void init(typename T::iterator it, int index){
		init(it);
		advance(CIterator<V>::iter, index);
	}

	template<typename T>
	void init(typename T::iterator& it, int index){
		init(it);
		advance(CIterator<V>::iter, index);
	}

	bool hasPrevious(){
		return CIterator<V>::iterNotEqual(CIterator<V>::iter, CIterator<V>::begin);
	}

	V previous(){
		iterDec(CIterator<V>::iter);
		return CIterator<V>::iterDeref(CIterator<V>::iter);
	}

	int nextIndex(){
		int index = 0;
		void* searchIter = newIter();
		while(CIterator<V>::iterNotEqual(searchIter, CIterator<V>::iter) && CIterator<V>::iterNotEqual(searchIter, CIterator<V>::end)){
			index++;
			CIterator<V>::iterInc(searchIter);
		}
		Pool_cleanup(searchIter);
		return index;
	}

	int previousIndex(){
		return nextIndex()-1;
	}

	void remove(){
		erase(CIterator<V>::iter);
	}

	void set(V obj){
		erase(CIterator<V>::iter);
		insert(CIterator<V>::iter, obj);
	}

	void add(V obj){
		insert(CIterator<V>::iter, obj);
	}
protected:
	std::function<void*()> newIter;
	std::function<void(void*)> iterDec;
	std::function<void(void*)> erase;
	std::function<void(void*,V)> insert;
	std::function<void(void*, int)> advance;
};
/*
template<typename V>
struct CIterator{
	const std::type_info typeId;
	CIterator(): typeId(typeid(CIteratorIntern<V>)){}
	CIteratorIntern<V>* iter = nullptr;
};

template<typename V>
struct CListIterator{
	const std::type_info typeId;
	CListIterator(): typeId(typeid(CListIteratorIntern<V>)){}
	CListIteratorIntern<V>* iter = nullptr;
};

//Should make it possible to pass iterators directly to some functions.
template<typename V>
static inline bool isCIterator(void* obj){
	return reinterpret_cast<CIterator<V>*>(obj)->typeId == typeid(CIteratorIntern<V>);
}

template<typename V>
static inline  bool isCListIterator(void* obj){
	return reinterpret_cast<CListIterator<V>*>(obj)->typeId == typeid(CListIteratorIntern<V>);
}
*/
void setLastError(JNIEnv* env, int error);

int getLastError();

inline const char* getErrorString(int code){
	return ERROR_STRINGS[code];
}

void setErrorMode(GlslangErrorMode mode);

void setCatchCExceptions(bool v);

bool getCatchCExceptions();

void throwException(JNIEnv* env, const char* name, const char* message);
