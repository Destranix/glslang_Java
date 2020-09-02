
#include <jni.h>

#include <Java_Main.h>

#define ENABLE_HLSL

#include <glslang/Include/Common.h>
#include <glslang/MachineIndependent/Scan.h>
#include <glslang/MachineIndependent/ScanContext.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TInputScanner
  (JNIEnv* env, jclass self, jint n, jobjectArray s, jlongArray L, jobjectArray names, jint b, jint f, jboolean single){
	JNI_METHOD_GUARD_ENTER
	const char** sArr = toCharArrays(env, s, nullptr);
	int LLength = env->GetArrayLength(L);
	jlong* fetchedL = env->GetLongArrayElements(L, nullptr);
	long* LArr = nullptr;
	LArr = Pool_callocRegister(LArr, nullptr, LLength);
	memcpy(LArr, fetchedL, LLength*sizeof(long));
	env->ReleaseLongArrayElements(L, fetchedL, JNI_ABORT);
	const char** namesArr = toCharArrays(env, names, nullptr);
	TInputScanner* ret = Pool_malloc($<TInputScanner*>(nullptr), n, sArr, (size_t*) LArr, namesArr, b, f, single);
	Pool_register(ret, sArr);
	Pool_register(ret, LArr);
	Pool_register(ret, namesArr);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_TInputScanner_1get
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TInputScanner*>(env _$ ptr)->get();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_TInputScanner_1peek
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TInputScanner*>(env _$ ptr)->peek();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TInputScanner_1unget
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TInputScanner*>(env _$ ptr)->unget();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TInputScanner_1setLine
  (JNIEnv* env, jclass self, jbyteArray ptr, jint newLine){
	JNI_METHOD_GUARD_ENTER
	$<TInputScanner*>(env _$ ptr)->setLine(newLine);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TInputScanner_1setFile___3BLjava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring filename){
	JNI_METHOD_GUARD_ENTER
	$<TInputScanner*>(env _$ ptr)->setFile(toChars(env, filename));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TInputScanner_1setFile___3BLjava_lang_String_2I
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring filename, jint i){
	JNI_METHOD_GUARD_ENTER
	$<TInputScanner*>(env _$ ptr)->setFile(toChars(env, filename), i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TInputScanner_1setString
  (JNIEnv* env, jclass self, jbyteArray ptr, jint newString){
	JNI_METHOD_GUARD_ENTER
	$<TInputScanner*>(env _$ ptr)->setString(newString);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TInputScanner_1setColumn
  (JNIEnv* env, jclass self, jbyteArray ptr, jint col){
	JNI_METHOD_GUARD_ENTER
	$<TInputScanner*>(env _$ ptr)->setColumn(col);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TInputScanner_1setEndOfInput
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TInputScanner*>(env _$ ptr)->setEndOfInput();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TInputScanner_1atEndOfInput
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TInputScanner*>(env _$ ptr)->atEndOfInput();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TInputScanner_1getSourceLoc
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TInputScanner*>(env _$ ptr)->getSourceLoc();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_TInputScanner_1getLastValidSourceIndex
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TInputScanner*>(env _$ ptr)->getLastValidSourceIndex();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TInputScanner_1consumeWhiteSpace
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean foundNonSpaceTab){
	JNI_METHOD_GUARD_ENTER
	bool b = foundNonSpaceTab;
	$<TInputScanner*>(env _$ ptr)->consumeWhiteSpace(b);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TInputScanner_1consumeComment
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TInputScanner*>(env _$ ptr)->consumeComment();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TInputScanner_1consumeWhitespaceComment
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean foundNonSpaceTab){
	JNI_METHOD_GUARD_ENTER
	bool b = foundNonSpaceTab;
	$<TInputScanner*>(env _$ ptr)->consumeWhitespaceComment(b);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TInputScanner_1scanVersion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint version, jint profile, jboolean notFirstToken){
	JNI_METHOD_GUARD_ENTER
	int v = version;
	EProfile p = $<EProfile>(profile);
	bool b = notFirstToken;
	return $<TInputScanner*>(env _$ ptr)->scanVersion(v, p, b);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TScanContext
  (JNIEnv* env, jclass self, jbyteArray pc){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_mallocIndirect($<TScanContext*>(nullptr), $<TParseContextBase*>(env _$ pc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_TScanContext_1tokenize
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray context, jbyteArray token){
	JNI_METHOD_GUARD_ENTER
	return $<TScanContext*>(env _$ ptr)->tokenize($<TPpContext*>(env _$ context), *$<TParserToken*>(env _$ token));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TScanContext_1fillInKeywordMap
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	TScanContext::fillInKeywordMap();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TScanContext_1deleteKeywordMap
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	TScanContext::deleteKeywordMap();
	JNI_METHOD_GUARD_LEAVE
}
