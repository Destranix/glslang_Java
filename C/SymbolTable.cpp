
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/MachineIndependent/SymbolTable.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSymbol_1clone
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TSymbol*>(env _$ ptr)->clone();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TSymbol_1getName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TSymbol*>(env _$ ptr)->getName();
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbol_1changeName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring newName){
	JNI_METHOD_GUARD_ENTER
	$<TSymbol*>(env _$ ptr)->changeName(toTString(env, newName));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbol_1addPrefix
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring prefix){
	JNI_METHOD_GUARD_ENTER
	$<TSymbol*>(env _$ ptr)->addPrefix(toChars(env, prefix));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TSymbol_1getMangledName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TSymbol*>(env _$ ptr)->getMangledName();
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSymbol_1getAsFunction
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TSymbol*>(env _$ ptr)->getAsFunction();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSymbol_1getAsVariable
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TSymbol*>(env _$ ptr)->getAsVariable();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSymbol_1getAsAnonMember
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TSymbol*>(env _$ ptr)->getAsAnonMember();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSymbol_1getType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TSymbol*>(env _$ ptr)->getType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSymbol_1getWritableType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TSymbol*>(env _$ ptr)->getWritableType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbol_1setUniqueId
  (JNIEnv* env, jclass self, jbyteArray ptr, jint id){
	JNI_METHOD_GUARD_ENTER
	$<TSymbol*>(env _$ ptr)->setUniqueId(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TSymbol_1getUniqueId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbol*>(env _$ ptr)->getUniqueId();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbol_1setExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray exts){
	JNI_METHOD_GUARD_ENTER
	int numExts = env->GetArrayLength(exts);
	TSymbol* elem = $<TSymbol*>(env _$ ptr);
	elem->setExtensions(numExts, toCharArrays(env, exts, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TSymbol_1getNumExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbol*>(env _$ ptr)->getNumExtensions();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jobjectArray JNICALL Java_com_destranix_glslang_Main_TSymbol_1getExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toStringArray(env, $<TSymbol*>(env _$ ptr)->getExtensions(), $<TSymbol*>(env _$ ptr)->getNumExtensions());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbol_1dump
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray infoSink, jboolean complete){
	JNI_METHOD_GUARD_ENTER
	$<TSymbol*>(env _$ ptr)->dump(*$<TInfoSink*>(env _$ infoSink), complete);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbol_1dumpExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray infoSink){
	JNI_METHOD_GUARD_ENTER
	$<TSymbol*>(env _$ ptr)->dumpExtensions(*$<TInfoSink*>(env _$ infoSink));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSymbol_1isReadOnly
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbol*>(env _$ ptr)->isReadOnly();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbol_1makeReadOnly
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TSymbol*>(env _$ ptr)->makeReadOnly();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVariable
  (JNIEnv* env, jclass self, jstring name, jbyteArray t, jboolean uT){
	JNI_METHOD_GUARD_ENTER
	TString* nameRef = toTString(env, name);
	return env $_ Pool_mallocIndirect($<TVariable*>(nullptr), &nameRef, $<TType*>(env _$ t), &uT);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVariable_1clone
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TVariable*>(env _$ ptr)->clone();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVariable_1getAsVariable
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TVariable*>(env _$ ptr)->getAsVariable();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVariable_1getType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TVariable*>(env _$ ptr)->getType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVariable_1getWritableType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TVariable*>(env _$ ptr)->getWritableType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TVariable_1isUserType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TVariable*>(env _$ ptr)->isUserType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVariable_1getConstArray
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TVariable*>(env _$ ptr)->getConstArray();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVariable_1getWritableConstArray
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TVariable*>(env _$ ptr)->getWritableConstArray();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TVariable_1setConstArray
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray array){
	JNI_METHOD_GUARD_ENTER
	$<TVariable*>(env _$ ptr)->setConstArray(*$<TConstUnionArray*>(env _$ array));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TVariable_1setConstSubtree
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray subtree){
	JNI_METHOD_GUARD_ENTER
	$<TVariable*>(env _$ ptr)->setConstSubtree($<TIntermTyped*>(env _$ subtree));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVariable_1getConstSubtree
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TVariable*>(env _$ ptr)->getConstSubtree();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TVariable_1setAnonId
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	$<TVariable*>(env _$ ptr)->setAnonId(i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TVariable_1getAnonId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TVariable*>(env _$ ptr)->getAnonId();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TVariable_1setMemberExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr, jint member, jobjectArray exts){
	JNI_METHOD_GUARD_ENTER
	int numExts = env->GetArrayLength(exts);
	TVariable* elem = $<TVariable*>(env _$ ptr);
	elem->setMemberExtensions(member, numExts, toCharArrays(env, exts, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TVariable_1hasMemberExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TVariable*>(env _$ ptr)->hasMemberExtensions();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TVariable_1getNumMemberExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr, jint member){
	JNI_METHOD_GUARD_ENTER
	return $<TVariable*>(env _$ ptr)->getNumMemberExtensions(member);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jobjectArray JNICALL Java_com_destranix_glslang_Main_TVariable_1getMemberExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr, jint member){
	JNI_METHOD_GUARD_ENTER
	return toStringArray(env, $<TVariable*>(env _$ ptr)->getMemberExtensions(member), $<TVariable*>(env _$ ptr)->getNumMemberExtensions(member));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TVariable_1dump
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray infoSink, jboolean complete){
	JNI_METHOD_GUARD_ENTER
	$<TVariable*>(env _$ ptr)->dump(*$<TInfoSink*>(env _$ infoSink), complete);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParameter__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TParameter*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParameter__Ljava_lang_String_2_3B_3B
  (JNIEnv* env, jclass self, jstring name, jbyteArray type, jbyteArray defaultValue){
	JNI_METHOD_GUARD_ENTER
	TParameter* ret = Pool_malloc($<TParameter*>(nullptr));
	ret->name = toTString(env, name);
	ret->type = $<TType*>(env _$ type);
	ret->defaultValue = $<TIntermTyped*>(env _$ defaultValue);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParameter_1copyParam
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray param){
	JNI_METHOD_GUARD_ENTER
	$<TParameter*>(env _$ ptr)->copyParam(*$<TParameter*>(env _$ param));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TParameter_1getDeclaredBuiltIn
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParameter*>(env _$ ptr)->getDeclaredBuiltIn();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParameter_1setName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring v){
	JNI_METHOD_GUARD_ENTER
	$<TParameter*>(env _$ ptr)->name = toTString(env, v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParameter_1setType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TParameter*>(env _$ ptr)->type = $<TType*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParameter_1setDefaultValue
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TParameter*>(env _$ ptr)->defaultValue = $<TIntermTyped*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TParameter_1getName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TParameter*>(env _$ ptr)->name);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParameter_1getType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParameter*>(env _$ ptr)->type;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParameter_1getDefaultValue
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParameter*>(env _$ ptr)->defaultValue;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TFunction__I
  (JNIEnv* env, jclass self, jint o){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TFunction*>(nullptr), $<TOperator>(o));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TFunction__Ljava_lang_String_2_3BI
  (JNIEnv* env, jclass self, jstring name, jbyteArray retType, jint tOp){
	JNI_METHOD_GUARD_ENTER
	TString* nameRef = toTString(env, name);
	TOperator tOpRef = $<TOperator>(tOp);
	return env $_ Pool_mallocIndirect($<TFunction*>(nullptr), &nameRef, $<TType*>(env _$ retType), &tOpRef);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TFunction_1clone
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TFunction*>(env _$ ptr)->clone();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TFunction_1getAsFunction
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TFunction*>(env _$ ptr)->getAsFunction();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TFunction_1addParameter
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray p){
	JNI_METHOD_GUARD_ENTER
	$<TFunction*>(env _$ ptr)->addParameter(*$<TParameter*>(env _$ p));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TFunction_1addThisParameter
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray type, jstring name){
	JNI_METHOD_GUARD_ENTER
	$<TFunction*>(env _$ ptr)->addThisParameter(*$<TType*>(env _$ type), toChars(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TFunction_1addPrefix
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring prefix){
	JNI_METHOD_GUARD_ENTER
	$<TFunction*>(env _$ ptr)->addPrefix(toChars(env, prefix));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TFunction_1removePrefix
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring prefix){
	JNI_METHOD_GUARD_ENTER
	$<TFunction*>(env _$ ptr)->removePrefix(*toTString(env, prefix));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TFunction_1getMangledName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TFunction*>(env _$ ptr)->getMangledName();
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TFunction_1getType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TFunction*>(env _$ ptr)->getType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TFunction_1getDeclaredBuiltInType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TFunction*>(env _$ ptr)->getDeclaredBuiltInType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TFunction_1getWritableType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TFunction*>(env _$ ptr)->getWritableType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TFunction_1relateToOperator
  (JNIEnv* env, jclass self, jbyteArray ptr, jint o){
	JNI_METHOD_GUARD_ENTER
	$<TFunction*>(env _$ ptr)->relateToOperator($<TOperator>(o));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TFunction_1getBuiltInOp
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TFunction*>(env _$ ptr)->getBuiltInOp();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TFunction_1setDefined
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TFunction*>(env _$ ptr)->setDefined();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TFunction_1isDefined
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TFunction*>(env _$ ptr)->isDefined();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TFunction_1setPrototyped
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TFunction*>(env _$ ptr)->setPrototyped();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TFunction_1isPrototyped
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TFunction*>(env _$ ptr)->isPrototyped();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TFunction_1setImplicitThis
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TFunction*>(env _$ ptr)->setImplicitThis();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TFunction_1hasImplicitThis
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TFunction*>(env _$ ptr)->hasImplicitThis();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TFunction_1setIllegalImplicitThis
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TFunction*>(env _$ ptr)->setIllegalImplicitThis();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TFunction_1hasIllegalImplicitThis
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TFunction*>(env _$ ptr)->hasIllegalImplicitThis();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TFunction_1getParamCount
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TFunction*>(env _$ ptr)->getParamCount();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TFunction_1getDefaultParamCount
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TFunction*>(env _$ ptr)->getDefaultParamCount();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TFunction_1getFixedParamCount
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TFunction*>(env _$ ptr)->getFixedParamCount();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TFunction_1dump
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray infoSink, jboolean complete){
	JNI_METHOD_GUARD_ENTER
	$<TFunction*>(env _$ ptr)->dump(*$<TInfoSink*>(env _$ infoSink), complete);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TFunction_1operatorAt
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TFunction*>(env _$ ptr))[index];
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TAnonMember
  (JNIEnv* env, jclass self, jstring n, jlong m, jbyteArray a, jint an){
	JNI_METHOD_GUARD_ENTER
	TString* nameRef = toTString(env, n);
	return env $_ Pool_mallocIndirect($<TAnonMember*>(nullptr), &nameRef, &m, $<TVariable*>(env _$ a), &an);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TAnonMember_1clone
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TAnonMember*>(env _$ ptr)->clone();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TAnonMember_1getAsAnonMember
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TAnonMember*>(env _$ ptr)->getAsAnonMember();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TAnonMember_1getAnonContainer
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TAnonMember*>(env _$ ptr)->getAnonContainer();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TAnonMember_1getMemberNumber
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TAnonMember*>(env _$ ptr)->getMemberNumber();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TAnonMember_1getType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TAnonMember*>(env _$ ptr)->getType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TAnonMember_1getWritableType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TAnonMember*>(env _$ ptr)->getWritableType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TAnonMember_1setExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray exts){
	JNI_METHOD_GUARD_ENTER
	int numExts = env->GetArrayLength(exts);
	TAnonMember* elem = $<TAnonMember*>(env _$ ptr);
	elem->setExtensions(numExts, toCharArrays(env, exts, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TAnonMember_1getNumExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TAnonMember*>(env _$ ptr)->getNumExtensions();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jobjectArray JNICALL Java_com_destranix_glslang_Main_TAnonMember_1getExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toStringArray(env, $<TAnonMember*>(env _$ ptr)->getExtensions(), $<TAnonMember*>(env _$ ptr)->getNumExtensions());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TAnonMember_1getAnonId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TAnonMember*>(env _$ ptr)->getAnonId();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TAnonMember_1dump
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray infoSink, jboolean complete){
	JNI_METHOD_GUARD_ENTER
	$<TAnonMember*>(env _$ ptr)->dump(*$<TInfoSink*>(env _$ infoSink), complete);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TSymbolTableLevel();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1insert
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray symbol, jboolean separateNameSpaces){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbolTableLevel*>(env _$ ptr)->insert(*$<TSymbol*>(env _$ symbol), separateNameSpaces);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1amend
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray symbol, jint firstNewMember){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbolTableLevel*>(env _$ ptr)->amend(*$<TSymbol*>(env _$ symbol), firstNewMember);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1insertAnonymousMembers
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray symbol, jint firstMember){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbolTableLevel*>(env _$ ptr)->insertAnonymousMembers(*$<TSymbol*>(env _$ symbol), firstMember);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1find
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TSymbolTableLevel*>(env _$ ptr)->find(*toTString(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1findFunctionNameList
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jbyteArray list){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTableLevel*>(env _$ ptr)->findFunctionNameList(*toTString(env, name), *$<TVector<const TFunction*>*>(env _$ list));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1hasFunctionName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbolTableLevel*>(env _$ ptr)->hasFunctionName(*toTString(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1findFunctionVariableName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jboolean variable){
	JNI_METHOD_GUARD_ENTER
	bool b = variable;
	return $<TSymbolTableLevel*>(env _$ ptr)->findFunctionVariableName(*toTString(env, name), b);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1setPreviousDefaultPrecisions
  (JNIEnv* env, jclass self, jbyteArray ptr, jint p){
	JNI_METHOD_GUARD_ENTER
	TPrecisionQualifier pPtr = $<TPrecisionQualifier>(p);
	$<TSymbolTableLevel*>(env _$ ptr)->setPreviousDefaultPrecisions(&pPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1getPreviousDefaultPrecisions
  (JNIEnv* env, jclass self, jbyteArray ptr, jint p){
	JNI_METHOD_GUARD_ENTER
	TPrecisionQualifier pPtr = $<TPrecisionQualifier>(p);
	$<TSymbolTableLevel*>(env _$ ptr)->getPreviousDefaultPrecisions(&pPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1relateToOperator
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jint op){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTableLevel*>(env _$ ptr)->relateToOperator(toChars(env, name), $<TOperator>(op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1setFunctionExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jobjectArray extensions){
	JNI_METHOD_GUARD_ENTER
	int numExts = env->GetArrayLength(extensions);
	TSymbolTableLevel* elem = $<TSymbolTableLevel*>(env _$ ptr);
	elem->setFunctionExtensions(toChars(env, name), numExts, toCharArrays(env, extensions, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1dump
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray infoSink, jboolean complete){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTableLevel*>(env _$ ptr)->dump(*$<TInfoSink*>(env _$ infoSink), complete);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1clone
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TSymbolTableLevel*>(env _$ ptr)->clone();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1readOnly
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTableLevel*>(env _$ ptr)->readOnly();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1setThisLevel
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTableLevel*>(env _$ ptr)->setThisLevel();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSymbolTableLevel_1isThisLevel
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbolTableLevel*>(env _$ ptr)->isThisLevel();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSymbolTable
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TSymbolTable*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1adoptLevels
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray symTable){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTable*>(env _$ ptr)->adoptLevels(*$<TSymbolTable*>(env _$ symTable));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1isEmpty
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbolTable*>(env _$ ptr)->isEmpty();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1atBuiltInLevel
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbolTable*>(env _$ ptr)->atBuiltInLevel();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1atGlobalLevel
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbolTable*>(env _$ ptr)->atGlobalLevel();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1setNoBuiltInRedeclarations
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTable*>(env _$ ptr)->setNoBuiltInRedeclarations();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1setSeparateNameSpaces
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTable*>(env _$ ptr)->setSeparateNameSpaces();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1push
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTable*>(env _$ ptr)->push();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1pushThis
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray thisSymbol){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTable*>(env _$ ptr)->pushThis(*$<TSymbol*>(env _$ thisSymbol));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1pop
  (JNIEnv* env, jclass self, jbyteArray ptr, jint p){
	JNI_METHOD_GUARD_ENTER
	TPrecisionQualifier pPtr = $<TPrecisionQualifier>(p);
	$<TSymbolTable*>(env _$ ptr)->pop(&pPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1insert
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray symbol){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbolTable*>(env _$ ptr)->insert(*$<TSymbol*>(env _$ symbol));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1amend
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray symbol, jint firstNewMember){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbolTable*>(env _$ ptr)->amend(*$<TSymbol*>(env _$ symbol), firstNewMember);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1makeInternalVariable
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray symbol){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTable*>(env _$ ptr)->makeInternalVariable(*$<TSymbol*>(env _$ symbol));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1copyUpDeferredInsert
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray shared){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TSymbolTable*>(env _$ ptr)->copyUpDeferredInsert($<TSymbol*>(env _$ shared));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1copyUp
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray shared){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TSymbolTable*>(env _$ ptr)->copyUp($<TSymbol*>(env _$ shared));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1find___3BLjava_lang_String_2ZZI
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jboolean builtIn , jboolean currentScope , jint thisDepthP ){
	JNI_METHOD_GUARD_ENTER
	bool builtInPtr = builtIn;
	bool currentScopePtr = currentScope;
	int thisDepthPPtr = thisDepthP;
	return env $_ $<TSymbolTable*>(env _$ ptr)->find(*toTString(env, name), &builtInPtr, &currentScopePtr, &thisDepthPPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1find___3BLjava_lang_String_2I
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jint thisDepth){
	JNI_METHOD_GUARD_ENTER
	int thisDepthPtr = thisDepth;
	return env $_ $<TSymbolTable*>(env _$ ptr)->find(*toTString(env, name), thisDepthPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1isFunctionNameVariable
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbolTable*>(env _$ ptr)->isFunctionNameVariable(*toTString(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1findFunctionNameList
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jbyteArray list, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	bool builtInPtr = builtIn;
	$<TSymbolTable*>(env _$ ptr)->findFunctionNameList(*toTString(env, name), *$<TVector<const TFunction*>*>(env _$ list), builtInPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1relateToOperator
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jint op){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTable*>(env _$ ptr)->relateToOperator(toChars(env, name), $<TOperator>(op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1setFunctionExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jobjectArray extensions){
	JNI_METHOD_GUARD_ENTER
	int numExts = env->GetArrayLength(extensions);
	TSymbolTable* elem = $<TSymbolTable*>(env _$ ptr);
	elem->setFunctionExtensions(toChars(env, name), numExts, toCharArrays(env, extensions, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1setVariableExtensions___3BLjava_lang_String_2I_3Ljava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jobjectArray extensions){
	JNI_METHOD_GUARD_ENTER
	int numExts = env->GetArrayLength(extensions);
	TSymbolTable* elem = $<TSymbolTable*>(env _$ ptr);
	elem->setVariableExtensions(toChars(env, name), numExts, toCharArrays(env, extensions, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1setVariableExtensions___3BLjava_lang_String_2Ljava_lang_String_2I_3Ljava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring blockName, jstring name, jobjectArray extensions){
	JNI_METHOD_GUARD_ENTER
	int numExts = env->GetArrayLength(extensions);
	TSymbolTable* elem = $<TSymbolTable*>(env _$ ptr);
	elem->setVariableExtensions(toChars(env, blockName), toChars(env, name), numExts, toCharArrays(env, extensions, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1getMaxSymbolId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSymbolTable*>(env _$ ptr)->getMaxSymbolId();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1dump
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray infoSink, jboolean complete){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTable*>(env _$ ptr)->dump(*$<TInfoSink*>(env _$ infoSink), complete);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1copyTable
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray copyOf){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTable*>(env _$ ptr)->copyTable(*$<TSymbolTable*>(env _$ copyOf));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1setPreviousDefaultPrecisions
  (JNIEnv* env, jclass self, jbyteArray ptr, jint p){
	JNI_METHOD_GUARD_ENTER
	TPrecisionQualifier pPtr = $<TPrecisionQualifier>(p);
	$<TSymbolTable*>(env _$ ptr)->setPreviousDefaultPrecisions(&pPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSymbolTable_1readOnly
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TSymbolTable*>(env _$ ptr)->readOnly();
	JNI_METHOD_GUARD_LEAVE
}
