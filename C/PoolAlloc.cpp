
#include <jni.h>

#include <Java_Main.h>

#define ENABLE_HLSL

#include <glslang/Include/PoolAlloc.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TAllocation
  (JNIEnv* env, jclass self, jlong size, jbyteArray mem, jbyteArray prev ){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TAllocation*>(nullptr), size, $<unsigned char*>((env _$ mem)), $<TAllocation*>(env _$ prev));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TAllocation_1check
	(JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TAllocation*>(env _$ ptr)->check();
	JNI_METHOD_GUARD_LEAVE
}


JNIEXPORT void JNICALL Java_Java_Main_TAllocation_1checkAllocList
	(JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TAllocation*>(env _$ ptr)->checkAllocList();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_Java_Main_TAllocation_1allocationSize
  (JNIEnv* env, jclass self, jlong size){
	JNI_METHOD_GUARD_ENTER
	return TAllocation::allocationSize(size);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TAllocation_1offsetAllocation
  (JNIEnv* env, jclass self, jbyteArray m){
	JNI_METHOD_GUARD_ENTER
	return env $_ TAllocation::offsetAllocation($<unsigned char*>((env _$ m)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TPoolAllocator
  (JNIEnv* env, jclass self, jint growthIncrement , jint allocationAlignment ){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TPoolAllocator*>(nullptr), growthIncrement , allocationAlignment);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TPoolAllocator_1push
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TPoolAllocator*>(env _$ ptr)->push();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TPoolAllocator_1pop
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TPoolAllocator*>(env _$ ptr)->pop();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TPoolAllocator_1popAll
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TPoolAllocator*>(env _$ ptr)->popAll();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TPoolAllocator_1allocate
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong numBytes){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TPoolAllocator*>(env _$ ptr)->allocate(numBytes);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_pool_1allocator__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<pool_allocator<void*>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_pool_1allocatorByTPoolAllocator
  (JNIEnv* env, jclass self, jbyteArray a){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_mallocIndirect($<pool_allocator<void*>*>(nullptr), $<TPoolAllocator*>(env _$ a));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_pool_1allocator___3B
  (JNIEnv* env, jclass self, jbyteArray a){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_mallocIndirect($<pool_allocator<void*>*>(nullptr), $<pool_allocator<void*>*>(env _$ a));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_pool_1allocator_1address
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray ref){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<pool_allocator<void*>*>(env _$ ptr)->address((env _$ ref));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_pool_1allocator_1allocate___3BJ
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong n){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<pool_allocator<void*>*>(env _$ ptr)->allocate(n);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_pool_1allocator_1allocate___3BJ_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong n, jbyteArray ref){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<pool_allocator<void*>*>(env _$ ptr)->allocate(n, (env _$ ref));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_pool_1allocator_1deallocate
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray ref, jlong n){
	JNI_METHOD_GUARD_ENTER
	$<pool_allocator<void*>*>(env _$ ptr)->deallocate((env _$ ref), n);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_pool_1allocator_1_1Charalloc
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong n){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<pool_allocator<void*>*>(env _$ ptr)->_Charalloc(n);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_pool_1allocator_1construct
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray ref, jbyteArray val){
	JNI_METHOD_GUARD_ENTER
	void* refPtr = (env _$ ref);
	void* valPtr = (env _$ val);
	$<pool_allocator<void*>*>(env _$ ptr)->construct(&refPtr, *(&valPtr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_pool_1allocator_1destroy
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray ref){
	JNI_METHOD_GUARD_ENTER
	void* refPtr = (env _$ ref);
	$<pool_allocator<void*>*>(env _$ ptr)->destroy(&refPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_Java_Main_pool_1allocator_1max_1size___3B
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<pool_allocator<void*>*>(env _$ ptr)->max_size();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_Java_Main_pool_1allocator_1max_1size___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint size){
	JNI_METHOD_GUARD_ENTER
	return $<pool_allocator<void*>*>(env _$ ptr)->max_size(size);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_pool_1allocator_1getAllocator
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<pool_allocator<void*>*>(env _$ ptr)->getAllocator();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_pool_1allocator_1operatorEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<pool_allocator<void*>*>(env _$ ptr) == *$<pool_allocator<void*>*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_pool_1allocator_1operatorNotEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<pool_allocator<void*>*>(env _$ ptr) != *$<pool_allocator<void*>*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}
