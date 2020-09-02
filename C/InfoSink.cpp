
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/Include/InfoSink.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TInfoSinkBase
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TInfoSinkBase*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TInfoSinkBase_1erase
	(JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TInfoSinkBase*>(env _$ ptr)->erase();
	JNI_METHOD_GUARD_LEAVE
}
JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TInfoSinkBase_1c_1str
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TInfoSinkBase*>(env _$ ptr)->c_str());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TInfoSinkBase_1prefix
  (JNIEnv* env, jclass self, jbyteArray ptr, jint message){
	JNI_METHOD_GUARD_ENTER
	$<TInfoSinkBase*>(env _$ ptr)->prefix($<TPrefixType>(message));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TInfoSinkBase_1location
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	$<TInfoSinkBase*>(env _$ ptr)->location(*$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TInfoSinkBase_1message___3BILjava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jint message, jstring s){
	JNI_METHOD_GUARD_ENTER
	$<TInfoSinkBase*>(env _$ ptr)->message($<TPrefixType>(message), toChars(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TInfoSinkBase_1message___3BILjava_lang_String_2_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint message, jstring s, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	$<TInfoSinkBase*>(env _$ ptr)->message($<TPrefixType>(message), toChars(env, s), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TInfoSinkBase_1setOutputStream
  (JNIEnv* env, jclass self, jbyteArray ptr, jint output ){
	JNI_METHOD_GUARD_ENTER
	$<TInfoSinkBase*>(env _$ ptr)->setOutputStream(output);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TInfoSinkBase_1operatorShiftLeft___3BC
  (JNIEnv* env, jclass self, jbyteArray ptr, jchar rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TInfoSinkBase*>(env _$ ptr) << rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TInfoSinkBase_1operatorShiftLeft___3BLjava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TInfoSinkBase*>(env _$ ptr) << toChars(env, rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TInfoSinkBase_1operatorShiftLeft___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TInfoSinkBase*>(env _$ ptr) << rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TInfoSinkBase_1operatorShiftLeft___3BJ
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TInfoSinkBase*>(env _$ ptr) << $<unsigned int>(rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TInfoSinkBase_1operatorShiftLeft___3BF
  (JNIEnv* env, jclass self, jbyteArray ptr, jfloat rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TInfoSinkBase*>(env _$ ptr) << rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TInfoSinkBase_1operatorPlus
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TInfoSinkBase*>(env _$ ptr) + toChars(env, rhs));
	JNI_METHOD_GUARD_LEAVE
}


JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TInfoSink
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TInfoSink*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TInfoSink_1setInfo
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TInfoSink*>(env _$ ptr)->info = *$<TInfoSinkBase*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TInfoSink_1setDebug
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TInfoSink*>(env _$ ptr)->debug = *$<TInfoSinkBase*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TInfoSink_1getInfo
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TInfoSink*>(env _$ ptr)->info;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TInfoSink_1getDebug
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TInfoSink*>(env _$ ptr)->debug;
	JNI_METHOD_GUARD_LEAVE
}
