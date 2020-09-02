
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/MachineIndependent/preprocessor/PpContext.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPpToken
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TPpToken*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpToken_1clear
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TPpToken*>(env _$ ptr)->clear();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpToken_1setLoc
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TPpToken*>(env _$ ptr)->loc = *$<TSourceLoc*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpToken_1setSpace
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TPpToken*>(env _$ ptr)->space = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpToken_1setIval
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TPpToken*>(env _$ ptr)->ival = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpToken_1setDval
  (JNIEnv* env, jclass self, jbyteArray ptr, jdouble v){
	JNI_METHOD_GUARD_ENTER
	$<TPpToken*>(env _$ ptr)->dval = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpToken_1setI64val
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject v){
	JNI_METHOD_GUARD_ENTER
	$<TPpToken*>(env _$ ptr)->i64val = BigIntegerToLongLong(env, v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpToken_1setName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring v){
	JNI_METHOD_GUARD_ENTER
	if(env->GetStringUTFLength(v) > MaxTokenLength){
		setLastError(env, GLSLANG_ERROR_INVALID_LENGTH);
	}else{
		const char* s = toChars(env, v);
		strcpy($<TPpToken*>(env _$ ptr)->name, s);
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPpToken_1getLoc
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TPpToken*>(env _$ ptr)->loc;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPpToken_1getSpace
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPpToken*>(env _$ ptr)->space;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TPpToken_1getIval
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPpToken*>(env _$ ptr)->ival;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jdouble JNICALL Java_com_destranix_glslang_Main_TPpToken_1getDval
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPpToken*>(env _$ ptr)->dval;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jobject JNICALL Java_com_destranix_glslang_Main_TPpToken_1getI64val
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toBigInteger(env, $<TPpToken*>(env _$ ptr)->i64val);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TPpToken_1getName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TPpToken*>(env _$ ptr)->name);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPpToken_1operatorEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TPpToken*>(env _$ ptr) == *$<TPpToken*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPpToken_1operatorNotEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TPpToken*>(env _$ ptr) != *$<TPpToken*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TStringAtomMap
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TStringAtomMap*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TStringAtomMap_1getAtom
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s){
	JNI_METHOD_GUARD_ENTER
	return $<TStringAtomMap*>(env _$ ptr)->getAtom(toChars(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TStringAtomMap_1getAddAtom
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s){
	JNI_METHOD_GUARD_ENTER
	return $<TStringAtomMap*>(env _$ ptr)->getAddAtom(toChars(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TStringAtomMap_1getString
  (JNIEnv* env, jclass self, jbyteArray ptr, jint atom){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TStringAtomMap*>(env _$ ptr)->getString(atom));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPpContext
  (JNIEnv* env, jclass self, jbyteArray base, jstring rootFileName, jbyteArray includer){
	JNI_METHOD_GUARD_ENTER
	std::string rootFileNameRef = toCString(env, rootFileName);
	return env $_ Pool_mallocIndirect($<TPpContext*>(nullptr), $<TParseContextBase*>(env _$ base), &rootFileNameRef, $<TShader::Includer*>(env _$ includer));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1setPreamble
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring preamble){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	/*
	int length = (int) (env)->GetStringUTFLength(preamble);
	$<TPpContext*>(env _$ ptr)->setPreamble(toChars(env, preamble), length);
	*/
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TPpContext_1tokenize
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray ppToken){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext*>(env _$ ptr)->tokenize(*$<TPpToken*>(env _$ ppToken));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TPpContext_1tokenPaste
  (JNIEnv* env, jclass self, jbyteArray ptr, jint token, jbyteArray ppToken){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext*>(env _$ ptr)->tokenPaste(token, *$<TPpToken*>(env _$ ppToken));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1setInput
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray input, jboolean versionWillBeError){
	JNI_METHOD_GUARD_ENTER
	$<TPpContext*>(env _$ ptr)->setInput(*$<TInputScanner*>(env _$ input), versionWillBeError);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1pushInput
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray input){
	JNI_METHOD_GUARD_ENTER
	$<TPpContext*>(env _$ ptr)->pushInput($<TPpContext::tInput*>(env _$ input));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1popInput
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TPpContext*>(env _$ ptr)->popInput();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1setMacroDefs
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TPpContext*>(env _$ ptr)->macroDefs = *$<TPpContext::TSymbolMap*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPpContext_1getMacroDefs
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TPpContext*>(env _$ ptr)->macroDefs;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TPpContext_1tInput_1scan
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray token){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::tInput*>(env _$ ptr)->scan($<TPpToken*>(env _$ token));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TPpContext_1tInput_1getch
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::tInput*>(env _$ ptr)->getch();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1tInput_1ungetch
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TPpContext::tInput*>(env _$ ptr)->ungetch();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPpContext_1tInput_1peekPasting
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::tInput*>(env _$ ptr)->peekPasting();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPpContext_1tInput_1peekContinuedPasting
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::tInput*>(env _$ ptr)->peekContinuedPasting(i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPpContext_1tInput_1endOfReplacementList
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::tInput*>(env _$ ptr)->endOfReplacementList();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPpContext_1tInput_1isMacroInput
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::tInput*>(env _$ ptr)->isMacroInput();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1tInput_1notifyActivated
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TPpContext::tInput*>(env _$ ptr)->notifyActivated();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1tInput_1notifyDeleted
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TPpContext::tInput*>(env _$ ptr)->notifyDeleted();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPpContext_1TokenStream
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TPpContext::TokenStream*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1TokenStream_1putToken
  (JNIEnv* env, jclass self, jbyteArray ptr, jint token, jbyteArray ppToken){
	JNI_METHOD_GUARD_ENTER
	$<TPpContext::TokenStream*>(env _$ ptr)->putToken(token, $<TPpToken*>(env _$ ppToken));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPpContext_1TokenStream_1peekToken
  (JNIEnv* env, jclass self, jbyteArray ptr, jint atom){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::TokenStream*>(env _$ ptr)->peekToken(atom);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPpContext_1TokenStream_1peekContinuedPasting
  (JNIEnv* env, jclass self, jbyteArray ptr, jint atom){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::TokenStream*>(env _$ ptr)->peekContinuedPasting(atom);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TPpContext_1TokenStream_1getToken
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray base, jbyteArray ppToken){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::TokenStream*>(env _$ ptr)->getToken(*$<TParseContextBase*>(env _$ base), $<TPpToken*>(env _$ ppToken));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPpContext_1TokenStream_1atEnd
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::TokenStream*>(env _$ ptr)->atEnd();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPpContext_1TokenStream_1peekTokenizedPasting
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean lastTokenPastes){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::TokenStream*>(env _$ ptr)->peekTokenizedPasting(lastTokenPastes);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPpContext_1TokenStream_1peekUntokenizedPasting
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::TokenStream*>(env _$ ptr)->peekUntokenizedPasting();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1TokenStream_1reset
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TPpContext::TokenStream*>(env _$ ptr)->reset();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPpContext_1TokenStream_1Token
  (JNIEnv* env, jclass self, jint atom, jbyteArray ppToken){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TPpContext::TokenStream::Token*>(nullptr), atom, *$<TPpToken*>(env _$ ppToken));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TPpContext_1TokenStream_1Token_1get
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray ppToken){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::TokenStream::Token*>(env _$ ptr)->get(*$<TPpToken*>(env _$ ppToken));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPpContext_1TokenStream_1Token_1isAtom
  (JNIEnv* env, jclass self, jbyteArray ptr, jint a){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::TokenStream::Token*>(env _$ ptr)->isAtom(a);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TPpContext_1TokenStream_1Token_1getAtom
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::TokenStream::Token*>(env _$ ptr)->getAtom();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPpContext_1TokenStream_1Token_1nonSpaced
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::TokenStream::Token*>(env _$ ptr)->nonSpaced();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPpContext_1MacroSymbol
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TPpContext::MacroSymbol*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1MacroSymbol_1setArgs
  (JNIEnv* env, jclass self, jbyteArray ptr, jintArray v){
	JNI_METHOD_GUARD_ENTER
	TPpContext::MacroSymbol* elem = $<TPpContext::MacroSymbol*>(env _$ ptr);
	int* a = (int*) (env)->GetIntArrayElements(v, nullptr);
	int length = env->GetArrayLength(v);
	TVector<int> vec = *toTVector(a, length, elem);
	(env)->ReleaseIntArrayElements(v, (jint*) a, JNI_ABORT);
	elem->args = vec;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1MacroSymbol_1setBody
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TPpContext::MacroSymbol*>(env _$ ptr)->body = *$<TPpContext::TokenStream*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1MacroSymbol_1setFunctionLike
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TPpContext::MacroSymbol*>(env _$ ptr)->functionLike = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1MacroSymbol_1setBusy
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TPpContext::MacroSymbol*>(env _$ ptr)->busy = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1MacroSymbol_1setUndef
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TPpContext::MacroSymbol*>(env _$ ptr)->undef = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jintArray JNICALL Java_com_destranix_glslang_Main_TPpContext_1MacroSymbol_1getArgs
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TVector<int> args = $<TPpContext::MacroSymbol*>(env _$ ptr)->args;
	jintArray ret = env->NewIntArray(args.size());
	env->SetIntArrayRegion(ret, 0, args.size(), (jint*) &args[0]);
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPpContext_1MacroSymbol_1getBody
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TPpContext::MacroSymbol*>(env _$ ptr)->body;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TPpContext_1MacroSymbol_1getFunctionLike
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::MacroSymbol*>(env _$ ptr)->functionLike;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TPpContext_1MacroSymbol_1getBusy
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::MacroSymbol*>(env _$ ptr)->busy;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TPpContext_1MacroSymbol_1getUndef
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPpContext::MacroSymbol*>(env _$ ptr)->undef;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPpContext_1lookupMacroDef
  (JNIEnv* env, jclass self, jbyteArray ptr, jint atom){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TPpContext*>(env _$ ptr)->lookupMacroDef(atom);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPpContext_1addMacroDef
  (JNIEnv* env, jclass self, jbyteArray ptr, jint atom, jbyteArray macroDef){
	JNI_METHOD_GUARD_ENTER
	$<TPpContext*>(env _$ ptr)->addMacroDef(atom, *$<TPpContext::MacroSymbol*>(env _$ macroDef));
	JNI_METHOD_GUARD_LEAVE
}

