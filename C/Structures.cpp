#include <functional>

#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/MachineIndependent/reflection.h>

#include <Utils.h>

template<typename K, typename V>
static int cmap_size(std::map<K, V>* map){
	return map->size();
}

template<typename K, typename V>
static bool cmap_isEmpty(std::map<K, V>* map){
	return map->empty();
}

template<typename K, typename V>
static bool cmap_containsKey(std::map<K, V>* map, K k, std::function<bool(K, K)>& equals){
	return (map->find(k) != map->end()) && (equals(k, map->find(k)->first));
}

template<typename K, typename V>
static bool cmap_containsValue(std::map<K, V>* map, V v, std::function<bool(V, V)>& equals){
	for(auto entry : *map){
		V val = entry.second;
		if(equals(v, val)){
			return true;
		}
	}
	return false;
}

template<typename K, typename V>
static V cmap_get(std::map<K, V>* map, K k, std::function<bool(K, K)>& equals){
	auto entry = map->find(k);
	if(equals(k, entry->first)){
		return entry->second;
	}else{
		return NULL;
	}
}

template<typename K>
static int cmap_get(std::map<K, int>* map, K k, std::function<bool(K, K)>& equals){
	auto entry = map->find(k);
	if(equals(k, entry->first)){
		return entry->second;
	}else{
		return -1;
	}
}

template<typename K, typename V>
static void cmap_insert_or_assign(std::map<K, V>* map, K k, V v){
	auto retPtr = map->find(k);
	if(retPtr == map->end()){
		map->insert(std::make_pair(k, v));
	}else{
		retPtr = map->erase(retPtr);
		map->insert(std::make_pair(k, v));
	}
}

template<typename K, typename V>
static V cmap_put(std::map<K, V>* map, K k, V v){
	auto retPtr = map->find(k);
	V ret = NULL;
	if(retPtr != map->end()){
		ret = retPtr->second;
	}
	cmap_insert_or_assign(map, k, v);
	return ret;
}

template<typename K>
static int cmap_put(std::map<K, int>* map, K k, int v){
	auto retPtr = map->find(k);
	int ret = -1;
	if(retPtr != map->end()){
		ret = retPtr->second;
	}
	cmap_insert_or_assign(map, k, v);
	return ret;
}

template<typename K, typename V>
static V cmap_remove(std::map<K, V>* map, K k){
	auto retPtr = map->find(k);
	V ret = NULL;
	if(retPtr != map->end()){
		ret = retPtr->second;
	}
	map->erase(k);
	return ret;
}

template<typename K>
static int cmap_remove(std::map<K, int>* map, K k){
	auto retPtr = map->find(k);
	int ret = -1;
	if(retPtr != map->end()){
		ret = retPtr->second;
	}
	map->erase(k);
	return ret;
}

template<typename K, typename V>
static void cmap_clear(std::map<K, V>* map){
	map->clear();
}

template<typename K, typename V>
static K* cmap_keys(std::map<K, V>* map){
	K* ret = NULL;
	ret = Pool_callocRegister(ret, map, map->size());
	int i=0;
	for(auto entry : *map){
		ret[i] = entry.first;
		++i;
	}
	return ret;
}

template<typename K, typename V>
static V* cmap_values(std::map<K, V>* map){
	V* ret = NULL;
	ret = Pool_callocRegister(ret, map, map->size());
	int i=0;
	for(auto entry : *map){
		ret[i] = entry.second;
		++i;
	}
	return ret;
}

template<typename K, typename V>
static std::pair<const K, V>** cmap_entries(std::map<K, V>* map){
	std::pair<const K, V>** ret = nullptr;
	ret = Pool_callocRegister(ret, map, map->size());
	int i=0;
	for(auto entry : *map){
		std::pair<const K, V>* entryCpy = nullptr;
		entryCpy = Pool_mallocRegister(entryCpy, map, entry);
		ret[i] = entryCpy;
		++i;
	}
	return ret;
}

template<typename K, typename V>
static K centry_getKey(std::pair<K, V>* entry){
	return entry->first;
}

template<typename K, typename V>
static V centry_getValue(std::pair<K, V>* entry){
	return entry->second;
}

template<typename K, typename V>
static V centry_setValue(std::pair<K, V>* entry, V v){
	V ret = entry->second;
	entry->second = v;
	return ret;
}

template<typename T>
static int clist_indexOf(std::list<T>* list, T v, std::function<bool(T, T)>& equals){
	int i = 0;
	for(auto elem : *list){
		if(equals(v, elem)){
			return i;
		}
		++i;
	}
	return -1;
}

template<typename T>
static int clist_indexOf(std::list<T>* list, typename std::list<T>::iterator iter){
	int index = 0;
	for(typename std::list<T>::iterator i = list->begin(); i != list->end() && i != iter; ++i){
		index++;
	}
	return index;
}

template<typename T>
static int clist_lastIndexOf(std::list<T>* list, T v, std::function<bool(T, T)>& equals){
	int index = list->size()-1;
	for(typename std::list<T>::iterator i = --(list->end()); i != list->begin(); --i){
		if(equals(v, *i)){
			return index;
		}
		index--;
	}
	return -1;
}

template<typename T>
static bool clist_contains(std::list<T>* list, T v, std::function<bool(T, T)>& equals){
	for(auto elem : *list){
		if(equals(v, elem)){
			return true;
		}
	}
	return false;
}


template<typename T>
static T clist_get(std::list<T>* list, int index){
	typename std::list<T>::iterator iter = list->begin();
	std::advance(iter, index);
	return *iter;
}

template<typename T>
static int cvector_indexOf(std::vector<T>* vector, T v, std::function<bool(T, T)>& equals){
	int i = 0;
	for(auto elem : *vector){
		if(equals(v, elem)){
			return i;
		}
		++i;
	}
	return -1;
}

template<typename T>
static int cvector_indexOf(std::vector<T>* vector, typename std::vector<T>::iterator iter){
	int index = 0;
	for(typename std::vector<T>::iterator i = vector->begin(); i != vector->end() && i != iter; ++i){
		index++;
	}
	return index;
}

template<typename T>
static int cvector_lastIndexOf(std::vector<T>* vector, T v, std::function<bool(T, T)>& equals){
	int index = vector->size()-1;
	for(typename std::vector<T>::iterator i = --(vector->end()); i != vector->begin(); --i){
		if(equals(v, *i)){
			return index;
		}
		index--;
	}
	return -1;
}

template<typename T>
static bool cvector_contains(std::vector<T>* vector, T v, std::function<bool(T, T)>& equals){
	for(auto elem : *vector){
		if(equals(v, elem)){
			return true;
		}
	}
	return false;
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCMap
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::map<int, std::vector<int>*>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCMap_1size
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return cmap_size($<std::map<int, std::vector<int>*>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCMap_1isEmpty
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return cmap_isEmpty($<std::map<int, std::vector<int>*>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCMap_1containsKey
  (JNIEnv* env, jclass self, jbyteArray ptr, jint k){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(int, int)> equals = [](int v1, int v2){
		return v1 == v2;
	};
	return cmap_containsKey($<std::map<int, std::vector<int>*>*>(env _$ ptr), (int) k, equals);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCMap_1containsValue
  (JNIEnv* env, jclass self, jbyteArray ptr, jintArray v){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(std::vector<int>*, std::vector<int>*)> equals = [](std::vector<int>* v1, std::vector<int>* v2){
		if(v1->size() != v2->size()){
			return false;
		}else{
			std::vector<int>::iterator iter1 = v1->begin();
			std::vector<int>::iterator iter2 = v2->begin();
			while(iter1 != v1->end()){
				if(*iter1 != *iter2){
					return false;
				}
				++iter1;
				++iter2;
			}
			return true;
		}
	};
	int* fetchedVArr = (int*) env->GetIntArrayElements(v, nullptr);
	std::vector<int>* fetchedV = new std::vector<int>(fetchedVArr, fetchedVArr+env->GetArrayLength(v));
	bool ret = cmap_containsValue($<std::map<int, std::vector<int>*>*>(env _$ ptr), fetchedV, equals);
	delete fetchedV;
	env->ReleaseIntArrayElements(v, (jint*) fetchedVArr, JNI_ABORT);
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jintArray JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCMap_1get
  (JNIEnv* env, jclass self, jbyteArray ptr, jint k){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(int, int)> equals = [](int v1, int v2){
		return v1 == v2;
	};
	std::vector<int>* retPtr = cmap_get($<std::map<int, std::vector<int>*>*>(env _$ ptr), (int) k, equals);
	if(retPtr == nullptr){
		return NULL;
	}else{
		jintArray ret = env->NewIntArray(retPtr->size());
		env->SetIntArrayRegion(ret, 0, retPtr->size(), (jint*) &((*retPtr)[0]));
		return ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jintArray JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCMap_1put
  (JNIEnv* env, jclass self, jbyteArray ptr, jint k, jintArray v){
	JNI_METHOD_GUARD_ENTER
	int* fetchedV = (int*) env->GetIntArrayElements(v, nullptr);
	int length = env->GetArrayLength(v);
	std::vector<int>* vPtr = nullptr;
	vPtr = Pool_mallocRegister(vPtr, $<std::map<int, std::vector<int>*>*>(env _$ ptr));
	for(unsigned int i = 0; i < (unsigned int) length; ++i){
		vPtr->push_back(fetchedV[i]);
	}
	env->ReleaseIntArrayElements(v, (jint*) fetchedV, JNI_ABORT);
	std::vector<int>* retPtr = cmap_put($<std::map<int, std::vector<int>*>*>(env _$ ptr), (int) k, vPtr);
	if(retPtr == nullptr){
		return NULL;
	}else{
		jintArray ret = env->NewIntArray(retPtr->size());
		env->SetIntArrayRegion(ret, 0, retPtr->size(), (jint*) &((*retPtr)[0]));
		Pool_cleanup(retPtr);
		return ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jintArray JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCMap_1remove
  (JNIEnv* env, jclass self, jbyteArray ptr, jint k){
	JNI_METHOD_GUARD_ENTER
	std::vector<int>* retPtr = cmap_remove($<std::map<int, std::vector<int>*>*>(env _$ ptr), (int) k);
	if(retPtr == nullptr){
		return NULL;
	}else{
		jintArray ret = env->NewIntArray(retPtr->size());
		env->SetIntArrayRegion(ret, 0, retPtr->size(), (jint*) &((*retPtr)[0]));
		Pool_cleanup(retPtr);
		return ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCMap_1clear
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	cmap_clear($<std::map<int, std::vector<int>*>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jintArray JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCMap_1keys
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	int* retPtr = cmap_keys($<std::map<int, std::vector<int>*>*>(env _$ ptr));
	jintArray ret = env->NewIntArray($<std::map<int, std::vector<int>*>*>(env _$ ptr)->size());
	env->SetIntArrayRegion(ret, 0, $<std::map<int, std::vector<int>*>*>(env _$ ptr)->size(), (jint*) retPtr);
	delete retPtr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jobjectArray JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCMap_1values
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::vector<int>** retPtr = cmap_values($<std::map<int, std::vector<int>*>*>(env _$ ptr));
	jclass clazz = env->FindClass("[I");
	jobjectArray ret = env->NewObjectArray($<std::map<int, std::vector<int>*>*>(env _$ ptr)->size(), clazz, nullptr);
	for(unsigned int i=0;i<(unsigned int) $<std::map<int, std::vector<int>*>*>(env _$ ptr)->size();++i){
		jintArray arr = env->NewIntArray(retPtr[i]->size());
		env->SetIntArrayRegion(arr, 0, retPtr[i]->size(), (jint*) &((*(retPtr[i]))[0]));
		env->SetObjectArrayElement(ret, i, arr);
	}
	delete retPtr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCMap_1entries
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::pair<const int, std::vector<int>*>** retPtr = cmap_entries($<std::map<int, std::vector<int>*>*>(env _$ ptr));
	return env $_ Pool_malloc($<std::vector<std::pair<const int, std::vector<int>*>*>*>(nullptr), retPtr, retPtr+$<std::map<int, std::vector<int>*>*>(env _$ ptr)->size());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCEntry
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::pair<int, std::vector<int>*>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCEntry_1getKey
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return centry_getKey($<std::pair<int, std::vector<int>*>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jintArray JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCEntry_1getValue
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::vector<int>* retPtr = centry_getValue($<std::pair<int, std::vector<int>*>*>(env _$ ptr));
	if(retPtr == nullptr){
		return NULL;
	}else{
		jintArray ret = env->NewIntArray(retPtr->size());
		env->SetIntArrayRegion(ret, 0, retPtr->size(), (jint*) &((*retPtr)[0]));
		return ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jintArray JNICALL Java_com_destranix_glslang_Main_IntKeyedIntArrayCEntry_1setValue
  (JNIEnv* env, jclass self, jbyteArray ptr, jintArray v){
	JNI_METHOD_GUARD_ENTER
	int* fetchedV = (int*) env->GetIntArrayElements(v, nullptr);
	int length = env->GetArrayLength(v);
	std::vector<int>* vPtr = nullptr;
	vPtr = Pool_mallocRegister(vPtr, $<std::map<int, std::vector<int>*>*>(env _$ ptr));
	for(unsigned int i = 0; i < (unsigned int) length; ++i){
		vPtr->push_back(fetchedV[i]);
	}
	env->ReleaseIntArrayElements(v, (jint*) fetchedV, JNI_ABORT);
	std::vector<int>* retPtr = centry_setValue($<std::pair<int, std::vector<int>*>*>(env _$ ptr), vPtr);
	if(retPtr == nullptr){
		return NULL;
	}else{
		jintArray ret = env->NewIntArray(retPtr->size());
		env->SetIntArrayRegion(ret, 0, retPtr->size(), (jint*) &((*retPtr)[0]));
		Pool_cleanup(retPtr);
		return ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntKeyedCMap
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::map<int, void*>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_IntKeyedCMap_1size
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return cmap_size($<std::map<int, void*>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_IntKeyedCMap_1isEmpty
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return cmap_isEmpty($<std::map<int, void*>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_IntKeyedCMap_1containsKey
  (JNIEnv* env, jclass self, jbyteArray ptr, jint k){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(int, int)> equals = [](int v1, int v2){
		return v1 == v2;
	};
	return cmap_containsKey($<std::map<int, void*>*>(env _$ ptr), (int) k, equals);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_IntKeyedCMap_1containsValue
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(void*, void*)> equals = [](void* v1, void* v2){
		return v1 == v2;
	};
	return cmap_containsValue($<std::map<int, void*>*>(env _$ ptr), env _$ v, equals);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntKeyedCMap_1get
  (JNIEnv* env, jclass self, jbyteArray ptr, jint k){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(int, int)> equals = [](int v1, int v2){
		return v1 == v2;
	};
	void* ret = cmap_get($<std::map<int, void*>*>(env _$ ptr), (int) k, equals);
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntKeyedCMap_1put
  (JNIEnv* env, jclass self, jbyteArray ptr, jint k, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	void* ret = cmap_put($<std::map<int, void*>*>(env _$ ptr), (int) k, env _$ v);
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntKeyedCMap_1remove
  (JNIEnv* env, jclass self, jbyteArray ptr, jint k){
	JNI_METHOD_GUARD_ENTER
	void* ret = cmap_remove($<std::map<int, void*>*>(env _$ ptr), (int) k);
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_IntKeyedCMap_1clear
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	cmap_clear($<std::map<int, void*>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jintArray JNICALL Java_com_destranix_glslang_Main_IntKeyedCMap_1keys
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	int* retPtr = cmap_keys($<std::map<int, void*>*>(env _$ ptr));
	jintArray ret = env->NewIntArray($<std::map<int, void*>*>(env _$ ptr)->size());
	env->SetIntArrayRegion(ret, 0, $<std::map<int, void*>*>(env _$ ptr)->size(), (jint*) retPtr);
	delete retPtr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntKeyedCMap_1values
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::list<void*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, $<std::map<int, void*>*>(env _$ ptr));
	void** retPtr = cmap_values($<std::map<int, void*>*>(env _$ ptr));
	for(unsigned int i = 0; i < (unsigned int) $<std::map<int, void*>*>(env _$ ptr)->size(); ++i){
		ret->push_back(retPtr[i]);
	}
	delete retPtr;
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntKeyedCMap_1entries
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::pair<const int, void*>** retPtr = cmap_entries($<std::map<int, void*>*>(env _$ ptr));
	std::vector<std::pair<const int, void*>*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, $<std::map<int, void*>*>(env _$ ptr));
	for(unsigned int i = 0; i < (unsigned int) $<std::map<int, void*>*>(env _$ ptr)->size(); ++i){
		ret->push_back(retPtr[i]);
	}
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntKeyedCEntry
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::pair<int, void*>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_IntKeyedCEntry_1getKey
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return centry_getKey($<std::pair<int, void*>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntKeyedCEntry_1getValue
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ centry_getValue($<std::pair<int, void*>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntKeyedCEntry_1setValue
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	void* ret = centry_setValue($<std::pair<int, void*>*>(env _$ ptr), env _$ v);
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntCMap
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::map<void*, int>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_IntCMap_1size
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return cmap_size($<std::map<void*, int>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_IntCMap_1isEmpty
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return cmap_isEmpty($<std::map<void*, int>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_IntCMap_1containsKey
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray k){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(void*, void*)> equals = [](void* v1, void* v2){
		return v1 == v2;
	};
	return cmap_containsKey($<std::map<void*, int>*>(env _$ ptr), env _$ k, equals);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_IntCMap_1containsValue
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(int, int)> equals = [](int v1, int v2){
		return v1 == v2;
	};
	return cmap_containsValue($<std::map<void*, int>*>(env _$ ptr), (int) v, equals);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_IntCMap_1get
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray k){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(void*, void*)> equals = [](void* v1, void* v2){
		return v1 == v2;
	};
	return cmap_get($<std::map<void*, int>*>(env _$ ptr), env _$ k, equals);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_IntCMap_1put
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray k, jint v){
	JNI_METHOD_GUARD_ENTER
	return cmap_put($<std::map<void*, int>*>(env _$ ptr), env _$ k, (int) v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_IntCMap_1remove
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray k){
	JNI_METHOD_GUARD_ENTER
	return cmap_remove($<std::map<void*, int>*>(env _$ ptr), env _$ k);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_IntCMap_1clear
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	cmap_clear($<std::map<void*, int>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntCMap_1keySet
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::set<void*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, $<std::map<void*, int>*>(env _$ ptr));
	void** retPtr = cmap_keys($<std::map<void*, int>*>(env _$ ptr));
	for(void** i= retPtr; i < retPtr+$<std::map<void*, int>*>(env _$ ptr)->size(); ++i){
		ret->insert(*retPtr);
	}
	delete retPtr;
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jintArray JNICALL Java_com_destranix_glslang_Main_IntCMap_1values
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	int* retPtr = cmap_values($<std::map<void*, int>*>(env _$ ptr));
	jintArray ret = env->NewIntArray($<std::map<void*, int>*>(env _$ ptr)->size());
	env->SetIntArrayRegion(ret, 0, $<std::map<void*, int>*>(env _$ ptr)->size(), (jint*) retPtr);
	delete retPtr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntCMap_1entries
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::pair<void*, int>** retPtr = reinterpret_cast<std::pair<void*, int>**>(cmap_entries($<std::map<void*, int>*>(env _$ ptr)));
	std::vector<std::pair<void*, int>*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, $<std::map<void*, int>*>(env _$ ptr));
	for(unsigned int i = 0; i < (unsigned int) $<std::map<void*, int>*>(env _$ ptr)->size(); ++i){
		ret->push_back(retPtr[i]);
	}
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntCEntry
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::pair<void*, int>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IntCEntry_1getKey
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ centry_getKey($<std::pair<void*, int>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_IntCEntry_1getValue
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return centry_getValue($<std::pair<void*, int>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_IntCEntry_1setValue
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	return centry_setValue($<std::pair<void*, int>*>(env _$ ptr), (int) v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CMap
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::map<void*, void*>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_CMap_1size
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return cmap_size($<std::map<void*, void*>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CMap_1isEmpty
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return cmap_isEmpty($<std::map<void*, void*>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CMap_1containsKey
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray k){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(void*, void*)> equals = [](void* v1, void* v2){
		return v1 == v2;
	};
	return cmap_containsKey($<std::map<void*, void*>*>(env _$ ptr), env _$ k, equals);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CMap_1containsValue
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(void*, void*)> equals = [](void* v1, void* v2){
		return v1 == v2;
	};
	return cmap_containsValue($<std::map<void*, void*>*>(env _$ ptr), env _$ v, equals);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CMap_1get
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray k){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(void*, void*)> equals = [](void* v1, void* v2){
		return v1 == v2;
	};
	void* ret = cmap_get($<std::map<void*, void*>*>(env _$ ptr), env _$ k, equals);
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CMap_1put
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray k, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	void* ret = cmap_put($<std::map<void*, void*>*>(env _$ ptr), env _$ k, env _$ v);
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CMap_1remove
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray k){
	JNI_METHOD_GUARD_ENTER
	void* ret = cmap_remove($<std::map<void*, void*>*>(env _$ ptr), env _$ k);
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_CMap_1clear
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	cmap_clear($<std::map<void*, void*>*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CMap_1keySet
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::set<void*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, $<std::map<void*, void*>*>(env _$ ptr));
	void** retPtr = cmap_keys($<std::map<void*, void*>*>(env _$ ptr));
	for(void** i= retPtr; i < retPtr+$<std::map<void*, void*>*>(env _$ ptr)->size(); ++i){
		ret->insert(*retPtr);
	}
	delete retPtr;
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CMap_1values
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::list<void*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, $<std::map<void*, void*>*>(env _$ ptr));
	void** retPtr = cmap_values($<std::map<void*, void*>*>(env _$ ptr));
	for(unsigned int i = 0; i < (unsigned int) $<std::map<void*, void*>*>(env _$ ptr)->size(); ++i){
		ret->push_back(retPtr[i]);
	}
	delete retPtr;
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CMap_1entries
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::pair<void*, void*>** retPtr = reinterpret_cast<std::pair<void*, void*>**>(cmap_entries($<std::map<void*, void*>*>(env _$ ptr)));
	std::vector<std::pair<void*, void*>*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, $<std::map<void*, void*>*>(env _$ ptr));
	for(unsigned int i = 0; i < (unsigned int) $<std::map<void*, void*>*>(env _$ ptr)->size(); ++i){
		ret->push_back(retPtr[i]);
	}
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CEntry
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::pair<void*, void*>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CEntry_1getKey
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	void* ret = centry_getKey($<std::pair<void*, void*>*>(env _$ ptr));
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CEntry_1getValue
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	void* ret = centry_getValue($<std::pair<void*, void*>*>(env _$ ptr));
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CEntry_1setValue
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	void* ret = centry_setValue($<std::pair<void*, void*>*>(env _$ ptr), env _$ v);
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CPair
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::pair<void*, void*>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CPair_1getFirst
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	void* ret = $<std::pair<void*, void*>*>(env _$ ptr)->first;
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CPair_1getLast
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	void* ret = $<std::pair<void*, void*>*>(env _$ ptr)->second;
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CPair_1setFirst
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	void* ret = $<std::pair<void*, void*>*>(env _$ ptr)->first;
	$<std::pair<void*, void*>*>(env _$ ptr)->first = env _$ v;
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CPair_1setLast
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	void* ret = $<std::pair<void*, void*>*>(env _$ ptr)->second;
	$<std::pair<void*, void*>*>(env _$ ptr)->second = env _$ v;
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CList
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::list<void*>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_CList_1size
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<std::list<void**>*>(env _$ ptr)->size();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CList_1isEmpty
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<std::list<void*>*>(env _$ ptr)->empty();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CList_1contains
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(void*, void*)> equals = [](void* v1, void* v2){
		return v1 == v2;
	};
	return clist_contains($<std::list<void*>*>(env _$ ptr), env _$ v, equals);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CList_1iterator
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::list<void*>* elem = $<std::list<void*>*>(env _$ ptr);
	CIterator<void*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, elem);
	ret->init(elem);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CList_1add___3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<std::list<void*>*>(env _$ ptr)->push_back(env _$ v);
	return true;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CList_1remove___3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(void*, void*)> equals = [](void* v1, void* v2){
		return v1 == v2;
	};
	int index = clist_indexOf($<std::list<void*>*>(env _$ ptr), env _$ v, equals);
	if(index != -1){
		std::list<void*>::iterator iter = $<std::list<void*>*>(env _$ ptr)->begin();
		std::advance(iter, index);
		$<std::list<void*>*>(env _$ ptr)->erase(iter);
		return true;
	}else{
		return false;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_CList_1insert
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	std::list<void*>::iterator iter = $<std::list<void*>*>(env _$ ptr)->begin();
	std::advance(iter, index);
	$<std::list<void*>*>(env _$ ptr)->insert(iter, env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_CList_1clear
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<std::list<void*>*>(env _$ ptr)->clear();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CList_1get
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	void* ret = clist_get($<std::list<void*>*>(env _$ ptr), index);
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CList_1set
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	void* ret = clist_get($<std::list<void*>*>(env _$ ptr), index);
	std::list<void*>::iterator iter = $<std::list<void*>*>(env _$ ptr)->begin();
	std::advance(iter, index);
	iter = $<std::list<void*>*>(env _$ ptr)->erase(iter);
	$<std::list<void*>*>(env _$ ptr)->insert(iter, env _$ v);
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_CList_1add___3BI_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	std::list<void*>::iterator iter = $<std::list<void*>*>(env _$ ptr)->begin();
	std::advance(iter, index);
	$<std::list<void*>*>(env _$ ptr)->insert(iter, env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CList_1remove___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	void* ret = clist_get($<std::list<void*>*>(env _$ ptr), index);
	std::list<void*>::iterator iter = $<std::list<void*>*>(env _$ ptr)->begin();
	std::advance(iter, index);
	$<std::list<void*>*>(env _$ ptr)->erase(iter);
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_CList_1indexOf
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(void*, void*)> equals = [](void* v1, void* v2){
		return v1 == v2;
	};
	return clist_indexOf($<std::list<void*>*>(env _$ ptr), env _$ v, equals);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_CList_1lastIndexOf
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(void*, void*)> equals = [](void* v1, void* v2){
		return v1 == v2;
	};
	return clist_lastIndexOf($<std::list<void*>*>(env _$ ptr), env _$ v, equals);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CList_1listIterator___3B
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::list<void*>* elem = $<std::list<void*>*>(env _$ ptr);
	CListIterator<void*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, elem);
	ret->init(elem);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CList_1listIterator___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	std::list<void*>* elem = $<std::list<void*>*>(env _$ ptr);
	CListIterator<void*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, elem);
	ret->init(elem, index);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CVector
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::vector<void*>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_CVector_1size
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<std::vector<void*>*>(env _$ ptr)->size();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CVector_1isEmpty
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<std::vector<void*>*>(env _$ ptr)->empty();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CVector_1contains
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(void*, void*)> equals = [](void* v1, void* v2){
		return v1 == v2;
	};
	return cvector_contains($<std::vector<void*>*>(env _$ ptr), env _$ v, equals);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CVector_1iterator
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::vector<void*>* elem = $<std::vector<void*>*>(env _$ ptr);
	CIterator<void*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, elem);
	ret->init(elem);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CVector_1add___3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<std::vector<void*>*>(env _$ ptr)->push_back(env _$ v);
	return true;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CVector_1remove___3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(void*, void*)> equals = [](void* v1, void* v2){
		return v1 == v2;
	};
	int index = cvector_indexOf($<std::vector<void*>*>(env _$ ptr), env _$ v, equals);
	if(index != -1){
		std::vector<void*>::iterator iter = $<std::vector<void*>*>(env _$ ptr)->begin();
		std::advance(iter, index);
		$<std::vector<void*>*>(env _$ ptr)->erase(iter);
		return true;
	}else{
		return false;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_CVector_1insert
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	std::vector<void*>::iterator iter = $<std::vector<void*>*>(env _$ ptr)->begin();
	std::advance(iter, index);
	$<std::vector<void*>*>(env _$ ptr)->insert(iter, env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_CVector_1clear
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<std::vector<void*>*>(env _$ ptr)->clear();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CVector_1get
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	void* ret = (*$<std::vector<void*>*>(env _$ ptr))[index];
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CVector_1set
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	void* ret = (*$<std::vector<void*>*>(env _$ ptr))[index];
	std::vector<void*>::iterator iter = $<std::vector<void*>*>(env _$ ptr)->begin();
	std::advance(iter, index);
	iter = $<std::vector<void*>*>(env _$ ptr)->erase(iter);
	$<std::vector<void*>*>(env _$ ptr)->insert(iter, env _$ v);
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_CVector_1add___3BI_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	std::vector<void*>::iterator iter = $<std::vector<void*>*>(env _$ ptr)->begin();
	std::advance(iter, index);
	$<std::vector<void*>*>(env _$ ptr)->insert(iter, env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CVector_1remove___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	void* ret = (*$<std::vector<void*>*>(env _$ ptr))[index];
	std::vector<void*>::iterator iter = $<std::vector<void*>*>(env _$ ptr)->begin();
	std::advance(iter, index);
	$<std::vector<void*>*>(env _$ ptr)->erase(iter);
	if(ret == nullptr){
		return NULL;
	}else{
		return env $_ ret;
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_CVector_1indexOf
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(void*, void*)> equals = [](void* v1, void* v2){
		return v1 == v2;
	};
	return cvector_indexOf($<std::vector<void*>*>(env _$ ptr), env _$ v, equals);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_CVector_1lastIndexOf
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	std::function<bool(void*, void*)> equals = [](void* v1, void* v2){
		return v1 == v2;
	};
	return cvector_lastIndexOf($<std::vector<void*>*>(env _$ ptr), env _$ v, equals);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CVector_1listIterator___3B
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::vector<void*>* elem = $<std::vector<void*>*>(env _$ ptr);
	CListIterator<void*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, elem);
	ret->init(elem);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CVector_1listIterator___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	std::vector<void*>* elem = $<std::vector<void*>*>(env _$ ptr);
	CListIterator<void*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, elem);
	ret->init(elem, index);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CSet
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::set<void*>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_CSet_1size
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<std::set<void*>*>(env _$ ptr)->size();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CSet_1isEmpty
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<std::set<void*>*>(env _$ ptr)->empty();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CSet_1contains
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	return ($<std::set<void*>*>(env _$ ptr)->find(env _$ v) != $<std::set<void*>*>(env _$ ptr)->end());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CSet_1iterator
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::set<void*>* elem = $<std::set<void*>*>(env _$ ptr);
	CIterator<void*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, elem);
	ret->init(elem);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CSet_1add
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	return $<std::set<void*>*>(env _$ ptr)->insert(env _$ v).second;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CSet_1remove
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	bool ret = ($<std::set<void*>*>(env _$ ptr)->find(env _$ v) != $<std::set<void*>*>(env _$ ptr)->end());
	$<std::set<void*>*>(env _$ ptr)->erase(env _$ v);
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_CSet_1clear
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<std::set<void*>*>(env _$ ptr)->clear();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CIterator_1hasNext
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<CIterator<void*>*>(env _$ ptr)->hasNext();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CIterator_1next
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	if(!$<CIterator<void*>*>(env _$ ptr)->hasNext()){
		throwException(env, "java/util/NoSuchElementException", "No more elements!");
		return NULL;
	}else{
		return env $_ $<CIterator<void*>*>(env _$ ptr)->next();
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CListIterator_1hasPrevious
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<CListIterator<void*>*>(env _$ ptr)->hasPrevious();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_CListIterator_1previous
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	if(!$<CListIterator<void*>*>(env _$ ptr)->hasPrevious()){
		throwException(env, "java/util/NoSuchElementException", "No more elements!");
		return NULL;
	}else{
		return env $_ $<CListIterator<void*>*>(env _$ ptr)->previous();
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_CListIterator_1nextIndex
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<CListIterator<void*>*>(env _$ ptr)->nextIndex();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_CListIterator_1previousIndex
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<CListIterator<void*>*>(env _$ ptr)->previousIndex();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_CListIterator_1remove
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	try{
		$<CListIterator<void*>*>(env _$ ptr)->remove();
	}catch(std::exception& e){
		throwException(env, "java/lang/UnsupportedOperationException", "Operation ist illegal for this Iterator!");
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_CListIterator_1set
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	try{
		$<CListIterator<void*>*>(env _$ ptr)->set(env _$ v);
	}catch(std::exception& e){
		throwException(env, "java/lang/UnsupportedOperationException", "Operation ist illegal for this Iterator!");
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_CListIterator_1add
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	try{
		$<CListIterator<void*>*>(env _$ ptr)->add(env _$ v);
	}catch(std::exception& e){
		throwException(env, "java/lang/UnsupportedOperationException", "Operation ist illegal for this Iterator!");
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CPrimitiveIterator_1OfDouble_1hasNext
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<CIterator<double>*>(env _$ ptr)->hasNext();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jdouble JNICALL Java_com_destranix_glslang_Main_CPrimitiveIterator_1OfDouble_1next
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	if(!$<CIterator<double>*>(env _$ ptr)->hasNext()){
		throwException(env, "java/util/NoSuchElementException", "No more elements!");
		return -1;
	}else{
		return $<CIterator<double>*>(env _$ ptr)->next();
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CPrimitiveIterator_1OfInt_1hasNext
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<CIterator<int>*>(env _$ ptr)->hasNext();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_CPrimitiveIterator_1OfInt_1next
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	if(!$<CIterator<int>*>(env _$ ptr)->hasNext()){
		throwException(env, "java/util/NoSuchElementException", "No more elements!");
		return -1;
	}else{
		return $<CIterator<int>*>(env _$ ptr)->next();
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_CPrimitiveIterator_1OfLong_1hasNext
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<CIterator<long>*>(env _$ ptr)->hasNext();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_CPrimitiveIterator_1OfLong_1next
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	if(!$<CIterator<long>*>(env _$ ptr)->hasNext()){
		throwException(env, "java/util/NoSuchElementException", "No more elements!");
		return -1;
	}else{
		return $<CIterator<long>*>(env _$ ptr)->next();
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_CString_1Int_1op
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	return toString(env, (*$<std::function<const char*(int)>*>(env _$ ptr))(i));
}
