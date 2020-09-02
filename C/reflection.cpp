
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/MachineIndependent/reflection.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TReflection
  (JNIEnv* env, jclass self, jint opts, jint first, jint last){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TReflection*>(nullptr), $<EShReflectionOptions>(opts), $<EShLanguage>(first), $<EShLanguage>(last));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TReflection_1addStage
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray intermediate){
	JNI_METHOD_GUARD_ENTER
	return $<TReflection*>(env _$ ptr)->addStage($<EShLanguage>(stage), *$<TIntermediate*>(env _$ intermediate));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TReflection_1getNumUniforms
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TReflection*>(env _$ ptr)->getNumUniforms();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TReflection_1getUniform
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TReflection*>(env _$ ptr)->getUniform(i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TReflection_1getNumUniformBlocks
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TReflection*>(env _$ ptr)->getNumUniformBlocks();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TReflection_1getUniformBlock
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TReflection*>(env _$ ptr)->getUniformBlock(i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TReflection_1getNumPipeInputs
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TReflection*>(env _$ ptr)->getNumPipeInputs();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TReflection_1getPipeInput
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TReflection*>(env _$ ptr)->getPipeInput(i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TReflection_1getNumPipeOutputs
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TReflection*>(env _$ ptr)->getNumPipeOutputs();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TReflection_1getPipeOutput
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TReflection*>(env _$ ptr)->getPipeOutput(i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TReflection_1getNumAtomicCounters
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TReflection*>(env _$ ptr)->getNumAtomicCounters();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TReflection_1getAtomicCounter
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TReflection*>(env _$ ptr)->getAtomicCounter(i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TReflection_1getNumBufferVariables
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TReflection*>(env _$ ptr)->getNumBufferVariables();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TReflection_1getBufferVariable
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TReflection*>(env _$ ptr)->getBufferVariable(i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TReflection_1getNumStorageBuffers
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TReflection*>(env _$ ptr)->getNumStorageBuffers();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TReflection_1getStorageBufferBlock
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TReflection*>(env _$ ptr)->getStorageBufferBlock(i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TReflection_1getIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	return $<TReflection*>(env _$ ptr)->getIndex(*toTString(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TReflection_1getPipeIOIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jboolean inOrOut){
	JNI_METHOD_GUARD_ENTER
	return $<TReflection*>(env _$ ptr)->getPipeIOIndex(toChars(env, name), inOrOut);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TReflection_1getLocalSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint dim){
	JNI_METHOD_GUARD_ENTER
	return $<TReflection*>(env _$ ptr)->getLocalSize(dim);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TReflection_1dump
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TReflection*>(env _$ ptr)->dump();
	JNI_METHOD_GUARD_LEAVE
}
