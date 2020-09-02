
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/MachineIndependent/LiveTraverser.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TLiveTraverser
  (JNIEnv* env, jclass self, jbyteArray i, jboolean traverseAll , jboolean preVisit, jboolean inVisit, jboolean postVisit){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TLiveTraverser*>(nullptr), *$<TIntermediate*>(env _$ i), traverseAll, preVisit, inVisit, postVisit);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TLiveTraverser_1pushFunction
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	$<TLiveTraverser*>(env _$ ptr)->pushFunction(*toTString(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TLiveTraverser_1pushGlobalReference
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	$<TLiveTraverser*>(env _$ ptr)->pushGlobalReference(*toTString(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TLiveTraverser_1setDestinations
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TLiveTraverser*>(env _$ ptr)->destinations = *$<TLiveTraverser::TDestinationStack*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TLiveTraverser_1getDestinations
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TLiveTraverser*>(env _$ ptr)->destinations;
	JNI_METHOD_GUARD_LEAVE
}
