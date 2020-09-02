
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/Include/Common.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVector__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TVector<void*>();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVector___3B
  (JNIEnv* env, jclass self, jbyteArray a){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TVector<void*>(*$<pool_allocator<void*>*>(env _$ a));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVector__I
  (JNIEnv* env, jclass self, jint i){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TVector<void*>(i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVector__I_3B
  (JNIEnv* env, jclass self, jint i, jbyteArray val){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TVector<void*>(i, (env _$ val));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TList
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TList<void*>();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TMap
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TMap<void*, void*>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSourceLoc__Ljava_lang_String_2III
  (JNIEnv* env, jclass self, jstring name, jint s, jint line, jint column){
	JNI_METHOD_GUARD_ENTER
	TSourceLoc* ret = Pool_malloc($<TSourceLoc*>(nullptr));
	ret->name = toTString(env, name);
	ret->string = s;
	ret->line = line;
	ret->column = column;
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSourceLoc__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TSourceLoc*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSourceLoc_1init___3B
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TSourceLoc*>(env _$ ptr)->init();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSourceLoc_1init___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stringNum){
	JNI_METHOD_GUARD_ENTER
	$<TSourceLoc*>(env _$ ptr)->init(stringNum);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TSourceLoc_1getStringNameOrNum
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean quoteStringName ){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TSourceLoc*>(env _$ ptr)->getStringNameOrNum(quoteStringName));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TSourceLoc_1getFilename
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TSourceLoc*>(env _$ ptr)->getFilename());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TSourceLoc_1getFilenameStr
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TSourceLoc*>(env _$ ptr)->getFilenameStr());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSourceLoc_1setName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring v){
	JNI_METHOD_GUARD_ENTER
	$<TSourceLoc*>(env _$ ptr)->name = toTString(env, v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSourceLoc_1setString
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TSourceLoc*>(env _$ ptr)->string = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSourceLoc_1setLine
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TSourceLoc*>(env _$ ptr)->line = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSourceLoc_1setColumn
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TSourceLoc*>(env _$ ptr)->column = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TSourceLoc_1getName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TSourceLoc*>(env _$ ptr)->name);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TSourceLoc_1getString
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSourceLoc*>(env _$ ptr)->string;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TSourceLoc_1getLine
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSourceLoc*>(env _$ ptr)->line;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TSourceLoc_1getColumn
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSourceLoc*>(env _$ ptr)->column;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPragmaTable
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TPragmaTable();
	JNI_METHOD_GUARD_LEAVE
}
