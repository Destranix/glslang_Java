#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <ostream>
#include <ios>
#include <climits>

#ifdef LINUX
	#include <execinfo.h>
	#include <signal.h>
#elif WINDOWS
	#include <windows.h>
	#include <dbghelp.h>
	#include <eh.h>
	#pragma comment(lib, "dbghelp.lib")
#endif
#include<functional>
#define STACK_SIZE 10
#define TRACE_MAX_FUNCTION_NAME_LENGTH 1024
#define MAX_MODULE_NAME_LENGTH 1024
#define PRINT_STACK_TRACE_ERROR_MSG 0

#include <jni.h>

#define ENABLE_HLSL

#include <glslang/Include/Common.h>

#include <Utils.h>

static JavaVM* jvm = nullptr;

#ifdef LINUX
	void printCStackTrace(int sig) {
		void *array[10];
		size_t size;

		// get void*'s for all entries on the stack
		size = backtrace(array, STACK_SIZE);
		backtrace_symbols_fd(array, size, fileno(stderr));
		exit(1);
	}
	jint JNI_OnLoad(JavaVM *vm, void *reserved){
		jvm = vm;
		return JNI_VERSION_10;
	}
#elif WINDOWS
	static void getErrorText(PTSTR* errorText, DWORD error){
		DWORD  ret = FormatMessage(
			// use system message tables to retrieve error text
			FORMAT_MESSAGE_FROM_SYSTEM
			// allocate buffer on local heap for error text
			|FORMAT_MESSAGE_ALLOCATE_BUFFER
			// Important! will fail otherwise, since we're not
			// (and CANNOT) pass insertion parameters
			|FORMAT_MESSAGE_IGNORE_INSERTS,
			nullptr,    // unused with FORMAT_MESSAGE_FROM_SYSTEM
			error,
			MAKELANGID(LANG_ENGLISH, SUBLANG_DEFAULT),
			(LPTSTR)errorText,  // output
			0, // minimum size for output buffer
			nullptr);   // arguments - see note
		if(ret == 0 && GetLastError() == ERROR_RESOURCE_LANG_NOT_FOUND || GetLastError() == ERROR_MUI_FILE_NOT_FOUND || GetLastError() == ERROR_MUI_FILE_NOT_LOADED){
			FormatMessage(
			// use system message tables to retrieve error text
			FORMAT_MESSAGE_FROM_SYSTEM
			// allocate buffer on local heap for error text
			|FORMAT_MESSAGE_ALLOCATE_BUFFER
			// Important! will fail otherwise, since we're not
			// (and CANNOT) pass insertion parameters
			|FORMAT_MESSAGE_IGNORE_INSERTS,
			nullptr,    // unused with FORMAT_MESSAGE_FROM_SYSTEM
			error,
			MAKELANGID(LANG_NEUTRAL, SUBLANG_DEFAULT),
			(LPTSTR)errorText,  // output
			0, // minimum size for output buffer
			nullptr);   // arguments - see note
		}
	}
	void printCStackTrace(const CONTEXT* contextPtr) {
		CONTEXT* context = nullptr;
		memcpy(&context, &contextPtr, sizeof(CONTEXT*));

		void* array[STACK_SIZE];
		USHORT size = 0;

		SymSetOptions(SYMOPT_DEFERRED_LOADS | SYMOPT_INCLUDE_32BIT_MODULES | SYMOPT_LOAD_LINES);

		HANDLE hProcess = GetCurrentProcess();
		if(!SymInitialize(hProcess, nullptr, FALSE)){
			PTSTR errorText = nullptr;

			DWORD lastError = GetLastError();
			getErrorText(&errorText, lastError);

			if ( nullptr == errorText ){
				fprintf(stderr, "SymInitalize failed with the following error: %d\n", lastError);
			}else{
				fprintf(stderr, "SymInitalize failed with the following error: (Error Code: %d) %s", lastError, errorText);
				LocalFree(errorText);
				errorText = nullptr;
			}
		}

		if(!SymRefreshModuleList(hProcess)){
			PTSTR errorText = nullptr;

			DWORD lastError = GetLastError();
			getErrorText(&errorText, lastError);

			if ( nullptr == errorText ){
				fprintf(stderr, "SymRefreshModuleList failed with the following error: %d\n", lastError);
			}else{
				fprintf(stderr, "SymRefreshModuleList failed with the following error: (Error Code: %d) %s", lastError, errorText);
				LocalFree(errorText);
				errorText = nullptr;
			}
		}

		SYMBOL_INFO *symbol = (SYMBOL_INFO *)malloc(sizeof(SYMBOL_INFO)+(TRACE_MAX_FUNCTION_NAME_LENGTH - 1) * sizeof(TCHAR));
		symbol->MaxNameLen = TRACE_MAX_FUNCTION_NAME_LENGTH;
		symbol->SizeOfStruct = sizeof(SYMBOL_INFO);

		DWORD displacement;
		IMAGEHLP_LINE64 *line = (IMAGEHLP_LINE64 *)malloc(sizeof(IMAGEHLP_LINE64));
		line->SizeOfStruct = sizeof(IMAGEHLP_LINE64);

		if(context != nullptr){
			//SE Exception
			HANDLE thread = GetCurrentThread();

			STACKFRAME64 stack;
			memset(&stack, 0, sizeof(STACKFRAME64));
			#if !defined(_M_AMD64)
				stack.AddrPC.Offset    = (*ctx).Eip;
				stack.AddrPC.Mode      = AddrModeFlat;
				stack.AddrStack.Offset = (*ctx).Esp;
				stack.AddrStack.Mode   = AddrModeFlat;
				stack.AddrFrame.Offset = (*ctx).Ebp;
				stack.AddrFrame.Mode   = AddrModeFlat;
			#endif

			#if defined(_M_AMD64)
				DWORD machineType = IMAGE_FILE_MACHINE_AMD64;
			#else
				DWORD machineType = IMAGE_FILE_MACHINE_I386;
			#endif
			bool result = true;
			for(int i = 0; i < STACK_SIZE && result; ++i, ++size) {
				result = StackWalk64(
					machineType,
					hProcess,
					thread,
					&stack,
					static_cast<PVOID>(context),
					nullptr,
					SymFunctionTableAccess,
					SymGetModuleBase,
					nullptr
				);
				array[i] = (void*) (static_cast<intptr_t>(stack.AddrPC.Offset));
			}
		}else{
			size = CaptureStackBackTrace(0, STACK_SIZE, array, nullptr);
		}

		for (int i = 0; i < size; i++){
			DWORD64 address = (DWORD64)(array[i]);
			if(address != NULL && (i == 0 || array[i-1] != array[i])){
				if(!SymFromAddr(hProcess, address, nullptr, symbol)){
					PTSTR errorText = nullptr;

					DWORD lastError = GetLastError();
					if(PRINT_STACK_TRACE_ERROR_MSG != 0){
						getErrorText(&errorText, lastError);
					}

					HMODULE hModule = nullptr;

					GetModuleHandleExA(GET_MODULE_HANDLE_EX_FLAG_FROM_ADDRESS | GET_MODULE_HANDLE_EX_FLAG_UNCHANGED_REFCOUNT,
															(LPCTSTR)address, &hModule);
					if(PRINT_STACK_TRACE_ERROR_MSG != 0){
						if(hModule != nullptr){
							char moduleName[MAX_MODULE_NAME_LENGTH];
							GetModuleFileNameA(hModule, moduleName, MAX_MODULE_NAME_LENGTH);
							if ( nullptr == errorText ){
								fprintf(stderr, "Could not resolve symbol for address 0x%p in module %s: %d\n", array[i], moduleName, lastError);
							}else{
								fprintf(stderr, "Could not resolve symbol for address 0x%p in module %s: (Error Code: %d) %s", array[i], moduleName, lastError, errorText);
								LocalFree(errorText);
								errorText = nullptr;
							}
						}else{
							if ( nullptr == errorText ){
								fprintf(stderr, "Could not resolve symbol for address 0x%p: %d\n", array[i], lastError);
							}else{
								fprintf(stderr, "Could not resolve symbol for address 0x%p: (Error Code: %d) %s", array[i], lastError, errorText);
								LocalFree(errorText);
								errorText = nullptr;
							}
						}
					}else{
						if(hModule != nullptr){
							char moduleName[MAX_MODULE_NAME_LENGTH];
							GetModuleFileNameA(hModule, moduleName, MAX_MODULE_NAME_LENGTH);
							fprintf(stderr, "\tat ??(0x%llX) in module %s\n", symbol->Address, moduleName);
						}else{
							fprintf(stderr, "\tat ??(0x%llX)\n", symbol->Address);
						}
					}
				}else{
					if (SymGetLineFromAddr(hProcess, address, &displacement, line)){
						fprintf(stderr, "\tat %s(0x%llX) in %s:%lu\n", symbol->Name, symbol->Address, line->FileName, line->LineNumber);
					}else{
						PTSTR errorText = nullptr;

						DWORD lastError = GetLastError();
						if(PRINT_STACK_TRACE_ERROR_MSG != 0){
							getErrorText(&errorText, lastError);
						}

						HMODULE hModule = nullptr;

						GetModuleHandleEx(GET_MODULE_HANDLE_EX_FLAG_FROM_ADDRESS | GET_MODULE_HANDLE_EX_FLAG_UNCHANGED_REFCOUNT,
										(LPCTSTR)symbol->Address, &hModule);
						if(PRINT_STACK_TRACE_ERROR_MSG != 0){
							if(hModule != nullptr){
								char moduleName[MAX_MODULE_NAME_LENGTH];
								GetModuleFileNameA(hModule, moduleName, MAX_MODULE_NAME_LENGTH);
								if ( nullptr == errorText ){
									fprintf(stderr, "Could not fetch line for symbol %s(0x%llX) in module %s: %d\n", symbol->Name, symbol->Address, moduleName, lastError);
								}else{
									fprintf(stderr, "Could not fetch line for symbol %s(0x%llX) in module %s: (Error Code: %d) %s", symbol->Name, symbol->Address, moduleName, lastError, errorText);
									LocalFree(errorText);
									errorText = nullptr;
								}
							}else{
								if ( nullptr == errorText ){
									fprintf(stderr, "Could not fetch line for symbol %s(0x%llX): %d\n", symbol->Name, symbol->Address, lastError);
								}else{
									fprintf(stderr, "Could not fetch line for symbol %s(0x%llX): (Error Code: %d) %s", symbol->Name, symbol->Address, lastError, errorText);
									LocalFree(errorText);
									errorText = nullptr;
								}
							}
						}else{
							if(hModule != nullptr){
								char moduleName[MAX_MODULE_NAME_LENGTH];
								GetModuleFileNameA(hModule, moduleName, MAX_MODULE_NAME_LENGTH);
								fprintf(stderr, "\tat %s(0x%llX) in module %s\n", symbol->Name, symbol->Address, moduleName);
							}else{
								fprintf(stderr, "\tat %s(0x%llX)\n", symbol->Name, symbol->Address);
							}
						}
					}
				}
			}
		}
		free(symbol);
		SymCleanup(hProcess);
		exit(1);
	}
	void custom_se_translator(unsigned int u, EXCEPTION_POINTERS *pExp) {
			std::string error = "SE Exception: ";
			switch (u) {
				case 0xC0000005:
					error += "Access Violation";
					break;
				default:
					char result[11];
					sprintf_s(result, 11, "0x%08X", u);
					error += result;
			};
			throw custom_se_exception(error.c_str(), *pExp->ContextRecord);
	}

	jint JNI_OnLoad(JavaVM *vm, void *reserved){
		_set_se_translator(custom_se_translator);
		jvm = vm;
		return JNI_VERSION_10;
	}
#endif

static thread_local int lastError = GLSLANG_ERROR_NONE;
static thread_local GlslangErrorMode errorMode = GlslangErrorModeCode;
#ifdef WINDOWS
	static bool catchCExceptionsVal = true;
#else
	static bool catchCExceptionsVal = false;
#endif

void* byteArrayToPointer(JNIEnv* env, jbyteArray array){
	void* p = nullptr;
	if (array != nullptr) {
		env->GetByteArrayRegion(array,0,sizeof(void*),(jbyte*)&p);
	}
	return p;
}

jbyteArray pointerToByteArray(JNIEnv* env, const void* ptr){
	jbyteArray arr = env->NewByteArray(sizeof(void*));
	env->SetByteArrayRegion(arr,0,sizeof(void*),(jbyte*)&ptr);
	return arr;
}

jstring toString(JNIEnv* env, const glslang::TString* chars){
	return toString(env, chars->c_str());
}

jstring toString(JNIEnv* env, const char* chars){
	return (env)->NewStringUTF(chars);
}

jstring toString(JNIEnv* env, const std::string& chars){
	return toString(env, chars.c_str());
}

jobjectArray toStringArray(JNIEnv* env, const std::vector<std::string> a){
	jclass clazz = env->FindClass("java.lang.String");
	jobjectArray ret = env->NewObjectArray(a.size(), clazz, nullptr);
	for(unsigned int i=0;i<(unsigned int) a.size();++i){
		env->SetObjectArrayElement(ret, i, toString(env, *(&a[i])));
	}
	return ret;
}

jobjectArray toStringArray(JNIEnv* env, const glslang::TVector<glslang::TString> a){
	jclass clazz = env->FindClass("java.lang.String");
	jobjectArray ret = env->NewObjectArray(a.size(), clazz, nullptr);
	for(unsigned int i=0;i<(unsigned int) a.size();++i){
		env->SetObjectArrayElement(ret, i, toString(env, &a[i]));
	}
	return ret;
}

jobjectArray toStringArray(JNIEnv* env, const char** a, int length){
	jclass clazz = env->FindClass("java.lang.String");
	jobjectArray ret = env->NewObjectArray(length, clazz, nullptr);
	for(unsigned int i=0;i<(unsigned int) length;++i){
		env->SetObjectArrayElement(ret, i, toString(env, a[i]));
	}
	return ret;
}

glslang::TString* toTString(JNIEnv* env, jstring s){
	if(s == nullptr){
		return nullptr;
	}
	char* sRef = (char*) (env)->GetStringUTFChars(s, nullptr);
	glslang::TString* ret = glslang::NewPoolTString(sRef);
	(env)->ReleaseStringUTFChars(s, sRef);
	return ret;
}

glslang::TString* toTString(JNIEnv* env, jstring s, int length){
	if(s == nullptr){
		return nullptr;
	}
	char* sRef = (char*) (env)->GetStringUTFChars(s, nullptr);
	char* sRefCpy = new char[length];
	sRefCpy = strncpy(sRefCpy, sRef, length);
	glslang::TString* ret = glslang::NewPoolTString(sRefCpy);
	(env)->ReleaseStringUTFChars(s, sRef);
	delete[] sRefCpy;
	return ret;
}

std::string toCString(JNIEnv* env, jstring s){
	if(s == nullptr){
		return NULL;
	}
	return std::string(toChars(env, s));
}

const char* toChars(JNIEnv* env, jstring s){
	if(s == nullptr){
		return NULL;
	}
	return toTString(env, s)->c_str();
}

const char* toChars(JNIEnv* env, jstring s, int length){
	if(s == nullptr){
		return nullptr;
	}
	return toTString(env, s, length)->c_str();
}

const char** toCharArrays(JNIEnv* env, jobjectArray s, void* ref){
	jsize numStrings = (env)->GetArrayLength(s);
	const char** ret = nullptr;
	ret = Pool_callocRegister(ret, ref, numStrings);
	for(unsigned int i=0;i<(unsigned int)(int) numStrings;++i){
		jobject fetchedString = (env)->GetObjectArrayElement(s, i);
		ret[i] = toChars(env, $<jstring>(fetchedString));
	}
	return ret;
}

const char** toCharArrays(JNIEnv* env, jobjectArray s, int* l, void* ref){
	jsize numStrings = (env)->GetArrayLength(s);
	const char** ret = nullptr;
	ret = Pool_callocRegister(ret, ref, numStrings);
	for(unsigned int i=0;i<(unsigned int)(int) numStrings;++i){
		jobject fetchedString = (env)->GetObjectArrayElement(s, i);
		ret[i] = toChars(env, $<jstring>(fetchedString), l[i]);
	}
	return ret;
}

std::vector<const char*>* toCharsVector(JNIEnv* env, jobjectArray s, void* ref){
	jsize numStrings = (env)->GetArrayLength(s);
	std::vector<const char*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, ref);
	for(unsigned int i=0;i<(unsigned int)(int) numStrings;++i){
		jobject fetchedString = (env)->GetObjectArrayElement(s, i);
		ret->push_back(toChars(env, $<jstring>(fetchedString)));
	}
	return ret;
}

std::vector<std::string>* toCStringVector(JNIEnv* env, jobjectArray s, void* ref){
	jsize numStrings = (env)->GetArrayLength(s);
	std::vector<std::string>* ret = nullptr;
	ret = Pool_mallocRegister(ret, ref);
	for(unsigned int i=0;i<(unsigned int)(int) numStrings;++i){
		jobject fetchedString = (env)->GetObjectArrayElement(s, i);
		ret->push_back(std::string(toChars(env, $<jstring>(fetchedString))));
	}
	return ret;
}

glslang::TVector<glslang::TString>* toTStringTVector(JNIEnv* env, jobjectArray s, void* ref){
	jsize numStrings = (env)->GetArrayLength(s);
	glslang::TVector<glslang::TString>* ret = nullptr;
	ret = Pool_mallocRegister(ret, ref);
	for(unsigned int i=0;i<(unsigned int)(int) numStrings;++i){
		jobject fetchedString = (env)->GetObjectArrayElement(s, i);
		ret->push_back(*toTString(env, $<jstring>(fetchedString)));
	}
	return ret;
}

#define ENDIANESS_CHECK_FALLBACK \
		int num = 1;\
		return (*(char*)&num == 1);
static bool littleEndian(){
	#ifdef LINUX
		#ifdef __LITTLE_ENDIAN__
			return true;
		#elif __BIG_ENDIAN__
			return false;
		#else
			ENDIANESS_CHECK_FALLBACK
		#endif
	#elif WINDOWS
		return true;
	#else
		ENDIANESS_CHECK_FALLBACK
	#endif
}

static jbyteArray BigIntegerToByteArray(JNIEnv* env, jobject v){
	jclass clazz = env->FindClass("java/math/BigInteger");
	jmethodID id = env->GetMethodID(clazz, "toByteArray", "()[B");
	return $<jbyteArray>(env->CallObjectMethod(v, id));
}

long long BigIntegerToLongLong(JNIEnv* env, jobject v){
	jbyteArray arr = BigIntegerToByteArray(env, v);
	int length = env->GetArrayLength(arr);
	long long ret = 0;
	env->GetByteArrayRegion(arr, 0, length, (jbyte*)(((char*) &ret)+(sizeof(long long)-length)));
	if(littleEndian()){
		std::reverse((char*)&ret, ((char*)&ret)+sizeof(long long));
	}
	return ret;
}

unsigned long long BigIntegerToUnsignedLongLong(JNIEnv* env, jobject v){
	jbyteArray arr = BigIntegerToByteArray(env, v);
	int length = env->GetArrayLength(arr);
	unsigned long long ret = 0;
	env->GetByteArrayRegion(arr, sizeof(unsigned long long)-length, length, (jbyte*)(((char*) &ret)+(sizeof(unsigned long long)-length)));
	if(littleEndian()){
		std::reverse((char*)&ret, ((char*)&ret)+sizeof(unsigned long long));
	}
	ret = ~(ret-1);
	return ret;
}

static jobject toBigInteger(JNIEnv* env, jbyteArray v){
	jclass clazz = env->FindClass("java/math/BigInteger");
	jmethodID id = env->GetMethodID(clazz, "<init>", "([B)V");
	return env->NewObject(clazz, id, v);
}

jobject toBigInteger(JNIEnv* env, long long v){
	long long vTmp = v;
	if(littleEndian()){
		std::reverse((char*)&vTmp, ((char*)&vTmp)+sizeof(long long));
	}
	jbyteArray arr = env->NewByteArray(sizeof(long long));
	env->SetByteArrayRegion(arr, 0, sizeof(long long), (jbyte*)&vTmp);
	return toBigInteger(env, arr);
}

jobject toBigInteger(JNIEnv* env, unsigned long long v){
	unsigned long long vTmp = (~v)+1;
	if(littleEndian()){
		std::reverse((char*)&vTmp, ((char*)&vTmp)+sizeof(unsigned long long));
	}
	jbyteArray arr = env->NewByteArray(sizeof(unsigned long long));
	env->SetByteArrayRegion(arr, 0, sizeof(unsigned long long), (jbyte*)&vTmp);
	return toBigInteger(env, arr);
}

class CStreambuf : public std::streambuf{
public:
	CStreambuf(jobject v){
		streamRef = new GlobalRef(v);
		GlobalRef* streamRefTmp = streamRef;
		std::function<bool(JNIEnv*, int)> writeTmp([streamRefTmp](JNIEnv* env, int v){
			jclass clazz = env->FindClass("java/io/OutputStream");
			jmethodID id = env->GetMethodID(clazz, "write", "(I)V");
			env->CallObjectMethod(streamRefTmp->getRef(), id, v);
			if (env->ExceptionCheck()) {
				return false;
			}else{
				return true;
			}
		});
		std::function<bool(JNIEnv*, const char*, int, int)> writeAreaTmp([streamRefTmp](JNIEnv* env, const char* s, int off, int len){
			int size = len-off;
			if(size < 0){
				return false;
			}
			jbyteArray b = env->NewByteArray(size);
			env->SetByteArrayRegion(b, 0, size, (jbyte*) s+off);
			jclass clazz = env->FindClass("java/io/OutputStream");
			jmethodID id = env->GetMethodID(clazz, "write", "([BII)V");
			env->CallObjectMethod(streamRefTmp->getRef(), id, b, 0, len);
			if (env->ExceptionCheck()) {
				return false;
			}else{
				return true;
			}
		});
		std::function<void(JNIEnv*)> flushTmp([streamRefTmp](JNIEnv* env){
			jclass clazz = env->FindClass("java/io/OutputStream");
			jmethodID id = env->GetMethodID(clazz, "flush", "()V");
			env->CallObjectMethod(streamRefTmp->getRef(), id);
			if (env->ExceptionCheck()) {
				return false;
			}else{
				return true;
			}
		});
		writeRef = createCallback(writeTmp, nullptr);
		writeAreaRef = createCallback(writeAreaTmp, nullptr);
		flushRef = createCallback(flushTmp, nullptr);
		write = *writeRef;
		writeArea = *writeAreaRef;
		flush = *flushRef;
	}

	int sputc(char ch){
		if(write(ch)){
			return std::char_traits<char>::to_int_type(ch);
		}else{
			return std::char_traits<char>::eof();
		}
	}

	~CStreambuf(){
		flush();
		delete writeRef;
		delete writeAreaRef;
		delete flushRef;
		delete streamRef;
	}

protected:
	GlobalRef* streamRef;
	std::function<bool(int)>* writeRef;
	std::function<bool(const char*, int, int)>* writeAreaRef;
	std::function<void()>* flushRef;
	std::function<bool(int)> write;
		std::function<bool(const char*, int, int)> writeArea;
		std::function<void()> flush;

	std::streamsize xsputn(const char* s, std::streamsize count){
		std::streamsize countLeft = count;
		std::streamsize off = 0;
		while(countLeft > 0){
			int writeSize = -1;
			if(count > INT_MAX){
				writeSize = INT_MAX;
			}else{
				writeSize = (int)count;
			}
			if(!writeArea(s, off, writeSize)){
				return off;
			}
			countLeft -= writeSize;
			off += writeSize;
		}
		return count;
	}
};

class COstream : public std::ostream{
public:
	COstream(CStreambuf* v) : std::ostream(v){
		streambuf = v;
	}

	~COstream(){
		delete streambuf;
	}

protected:
	CStreambuf* streambuf;
};

std::ostream* toOstream(JNIEnv* env, jobject v, void* ref){
	COstream* ret = nullptr;
	ret = Pool_mallocRegister(ret, ref, new CStreambuf(v));
	return ret;
}

std::vector<unsigned int>* toUnsignedIntVector(jlong* arr, size_t length){
	std::vector<unsigned int>* ret = new std::vector<unsigned int>();
	for(size_t i=0;i<length;++i){
		ret->push_back((unsigned int) arr[i]);
	}
	return ret;
}

std::vector<jlong>* toJlongVector(unsigned int* arr, size_t length){
	std::vector<jlong>* ret = new std::vector<jlong>();
	for(size_t i=0;i<length;++i){
		ret->push_back((jlong) arr[i]);
	}
	return ret;
}

JavaVM* getJVM(){
	return jvm;
}

void setLastError(JNIEnv* env, int error){
	switch(errorMode){
		case GlslangErrorModeNone:
		case GlslangErrorModeCode:
			lastError = error;
			break;
		case GlslangErrorModeException:
			lastError = error;
			throwException(env, "java/lang/RuntimeException", getErrorString(error));
			break;
		default:
			fprintf(stderr, "Reached unreachable state!");
			exit(-1);
	}
}

int getLastError(){
	switch(errorMode){
		case GlslangErrorModeNone:
			return GLSLANG_ERROR_NONE;
		case GlslangErrorModeCode:
		case GlslangErrorModeException:
			return lastError;
		default:
			fprintf(stderr, "Reached unreachable state!");
			exit(-1);
	}
}

void setErrorMode(GlslangErrorMode mode){
	errorMode = mode;
}

void setCatchCExceptions(bool v){
#ifdef LINUX
	if(v){
		signal(SIGSEGV, &printCStackTrace);
	}else{
		signal(SIGSEGV, SIG_DFL);
	}
#endif
	catchCExceptionsVal = v;
}

bool getCatchCExceptions(){
	return catchCExceptionsVal;
}

void throwException(JNIEnv* env, const char* name, const char* message){
	jclass clazz = env->FindClass(name);
	env->ThrowNew(clazz, message);
}

//Frees instances connected to deleted object
void Pool_cleanup(void* key){
	auto entry = allocationPool.find(key);
	if(entry != allocationPool.end()){
		std::set<std::function<void()>*>* elements = entry->second;
		for(std::function<void()>* elem : *elements){
			(*elem)();
			delete elem;
		}
		delete elements;
		allocationPool.erase(key);
	}
}
