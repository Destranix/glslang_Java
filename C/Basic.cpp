//Everything left from ShaderLang.h and ShHandle.h and Versions.h and attribute.h

#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/Public/ShaderLang.h>
#include <glslang/Include/ShHandle.h>
#include <glslang/MachineIndependent/localintermediate.h>
#include <glslang/MachineIndependent/Versions.h>
#include <glslang/MachineIndependent/attribute.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TInputLanguage__IIII
  (JNIEnv* env, jclass self, jint languageFamily, jint stage, jint dialect, jint dialectVersion){
	JNI_METHOD_GUARD_ENTER
	TInputLanguage* ret = Pool_malloc($<TInputLanguage*>(nullptr));
	ret->languageFamily = $<EShSource>(languageFamily);
	ret->stage = $<EShLanguage>(stage);
	ret->dialect = $<EShClient>(dialect);
	ret->dialectVersion = dialectVersion;
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TInputLanguage__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TInputLanguage*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TInputLanguage_1setLanguageFamily
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TInputLanguage*>(env _$ ptr)->languageFamily = $<EShSource>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TInputLanguage_1setStage
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TInputLanguage*>(env _$ ptr)->stage = $<EShLanguage>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TInputLanguage_1setDialect
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TInputLanguage*>(env _$ ptr)->dialect = $<EShClient>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TInputLanguage_1setDialectVersion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TInputLanguage*>(env _$ ptr)->dialectVersion = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TInputLanguage_1getLanguageFamily
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TInputLanguage*>(env _$ ptr)->languageFamily;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TInputLanguage_1getStage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TInputLanguage*>(env _$ ptr)->stage;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TInputLanguage_1getDialect
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TInputLanguage*>(env _$ ptr)->dialect;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TInputLanguage_1getDialectVersion
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TInputLanguage*>(env _$ ptr)->dialectVersion;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TClient__II
  (JNIEnv* env, jclass self, jint client, jint version){
	JNI_METHOD_GUARD_ENTER
	TClient* ret = Pool_malloc($<TClient*>(nullptr));
	ret->client = $<EShClient>(client);
	ret->version = $<EShTargetClientVersion>(version);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TClient__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TClient*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TClient_1setClient
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TClient*>(env _$ ptr)->client = $<EShClient>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TClient_1setVersion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TClient*>(env _$ ptr)->version = $<EShTargetClientVersion>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TClient_1getClient
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TClient*>(env _$ ptr)->client;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TClient_1getVersion
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TClient*>(env _$ ptr)->version;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TTarget__IIZ
  (JNIEnv* env, jclass self, jint language, jint version, jboolean hlslFunctionality1){
	JNI_METHOD_GUARD_ENTER
	TTarget* ret = Pool_malloc($<TTarget*>(nullptr));
	ret->language = $<EShTargetLanguage>(language);
	ret->version = $<EShTargetLanguageVersion>(version);
	ret->hlslFunctionality1 = hlslFunctionality1;
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TTarget__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TTarget*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TTarget_1setLanguage
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TTarget*>(env _$ ptr)->language = $<EShTargetLanguage>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TTarget_1setVersion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TTarget*>(env _$ ptr)->version = $<EShTargetLanguageVersion>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TTarget_1setHlslFunctionality1
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TTarget*>(env _$ ptr)->hlslFunctionality1 = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TTarget_1getLanguage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TTarget*>(env _$ ptr)->language;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TTarget_1getVersion
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TTarget*>(env _$ ptr)->version;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TTarget_1getHlslFunctionality1
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TTarget*>(env _$ ptr)->hlslFunctionality1;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TEnvironment___3B_3B_3B
  (JNIEnv* env, jclass self, jbyteArray input, jbyteArray client, jbyteArray target){
	JNI_METHOD_GUARD_ENTER
	TEnvironment* ret = Pool_malloc($<TEnvironment*>(nullptr));
	ret->input = *$<TInputLanguage*>(env _$ input);
	ret->client = *$<TClient*>(env _$ client);
	ret->target = *$<TTarget*>(env _$ target);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TEnvironment__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TEnvironment*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TEnvironment_1setInput
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TEnvironment*>(env _$ ptr)->input = *$<TInputLanguage*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TEnvironment_1setClient
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TEnvironment*>(env _$ ptr)->client = *$<TClient*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TEnvironment_1setTarget
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TEnvironment*>(env _$ ptr)->target = *$<TTarget*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TEnvironment_1getInput
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TEnvironment*>(env _$ ptr)->input;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TEnvironment_1getClient
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TEnvironment*>(env _$ ptr)->client;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TEnvironment_1getTarget
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TEnvironment*>(env _$ ptr)->target;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Version__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<Version*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Version__IIILjava_lang_String_2
  (JNIEnv* env, jclass self, jint major, jint minor, jint patch, jstring flavor){
	JNI_METHOD_GUARD_ENTER
	Version* ret = Pool_malloc($<Version*>(nullptr));
	ret->major = major;
	ret->minor = minor;
	ret->patch = patch;
	ret->flavor = toChars(env, flavor);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Version_1setMajor
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<Version*>(env _$ ptr)->major = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Version_1setMinor
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<Version*>(env _$ ptr)->minor = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Version_1setPatch
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<Version*>(env _$ ptr)->patch = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Version_1getMajor
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Version*>(env _$ ptr)->major;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Version_1getMinor
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Version*>(env _$ ptr)->minor;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Version_1getPatch
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Version*>(env _$ ptr)->patch;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_Version_1getFlavor
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<Version*>(env _$ ptr)->flavor);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TShader
  (JNIEnv* env, jclass self, jint language){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TShader*>(nullptr), $<EShLanguage>(language));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setStrings
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray s, jint n){
	JNI_METHOD_GUARD_ENTER
	TShader* elem = $<TShader*>(env _$ ptr);
	elem->setStrings(toCharArrays(env, s, elem), n);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setStringsWithLengths
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray s, jintArray l, jint n){
	JNI_METHOD_GUARD_ENTER
	TShader* elem = $<TShader*>(env _$ ptr);
	int* lengths = (int*) (env)->GetIntArrayElements(l, nullptr);
	elem->setStringsWithLengths(toCharArrays(env, s, lengths, elem), lengths, n);
	(env)->ReleaseIntArrayElements(l, (jint*) lengths, JNI_ABORT);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setStringsWithLengthsAndNames
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray s, jintArray l, jobjectArray names, jint n){
	JNI_METHOD_GUARD_ENTER
	TShader* elem = $<TShader*>(env _$ ptr);
	int* lengths = (int*) (env)->GetIntArrayElements(l, nullptr);
	elem->setStringsWithLengthsAndNames(toCharArrays(env, s, lengths, elem), lengths, toCharArrays(env, names, elem), n);
	(env)->ReleaseIntArrayElements(l, (jint*) lengths, JNI_ABORT);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setPreamble
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setPreamble(toChars(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setEntryPoint
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setEntryPoint(toChars(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setSourceEntryPoint
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setSourceEntryPoint(toChars(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1addProcesses
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray s){
	JNI_METHOD_GUARD_ENTER
	TShader* elem = $<TShader*>(env _$ ptr);
	elem->addProcesses(*toCStringVector(env, s, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setShiftBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jint res, jlong base){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setShiftBinding($<TResourceType>(res), (unsigned int) base);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setShiftSamplerBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong base){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setShiftSamplerBinding((unsigned int) base);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setShiftTextureBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong base){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setShiftTextureBinding((unsigned int) base);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setShiftImageBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong base){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setShiftImageBinding((unsigned int) base);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setShiftUboBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong base){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setShiftUboBinding((unsigned int) base);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setShiftUavBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong base){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setShiftUavBinding((unsigned int) base);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setShiftCbufferBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong base){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setShiftCbufferBinding((unsigned int) base);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setShiftSsboBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong base){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setShiftSsboBinding((unsigned int) base);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setShiftBindingForSet
  (JNIEnv* env, jclass self, jbyteArray ptr, jint res, jlong base, jlong set){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setShiftBindingForSet($<TResourceType>(res), (unsigned int) base, (unsigned int) set);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setResourceSetBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray base){
	JNI_METHOD_GUARD_ENTER
	TShader* elem = $<TShader*>(env _$ ptr);
	elem->setResourceSetBinding(*toCStringVector(env, base, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setAutoMapBindings
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean map){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setAutoMapBindings(map);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setAutoMapLocations
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean map){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setAutoMapLocations(map);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1addUniformLocationOverride
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s, jint i){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->addUniformLocationOverride(toChars(env, s), i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setUniformLocationBase
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setUniformLocationBase(i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setInvertY
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean b){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setInvertY(b);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setHlslIoMapping
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean b){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setHlslIoMapping(b);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setFlattenUniformArrays
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean b){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setFlattenUniformArrays(b);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setNoStorageFormat
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean b){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setNoStorageFormat(b);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setNanMinMaxClamp
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean b){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setNanMinMaxClamp(b);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setTextureSamplerTransformMode
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setTextureSamplerTransformMode($<EShTextureSamplerTransformMode>(i));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setEnvInput
  (JNIEnv* env, jclass self, jbyteArray ptr, jint src, jint lang, jint client, jint version){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setEnvInput($<EShSource>(src), $<EShLanguage>(lang), $<EShClient>(client), version);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setEnvClient
  (JNIEnv* env, jclass self, jbyteArray ptr, jint client, jint version){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setEnvClient($<EShClient>(client), $<EShTargetClientVersion>(version));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setEnvTarget
  (JNIEnv* env, jclass self, jbyteArray ptr, jint lang, jint version){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setEnvTarget($<EShTargetLanguage>(lang), $<EShTargetLanguageVersion>(version));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jobjectArray JNICALL Java_com_destranix_glslang_Main_TShader_1getStrings
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	const char* const* strings;
	int count;
	$<TShader*>(env _$ ptr)->getStrings(strings, count);
	jobjectArray ret = (env)->NewObjectArray(count, (env)->FindClass("java/lang/String"), nullptr);
	for(int i=0;i<count;++i){
		(env)->SetObjectArrayElement(ret, i, toString(env, strings[i]));
	}
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1setEnvTargetHlslFunctionality1
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TShader*>(env _$ ptr)->setEnvTargetHlslFunctionality1();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShader_1getEnvTargetHlslFunctionality1
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShader*>(env _$ ptr)->getEnvTargetHlslFunctionality1();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TShader_1Includer_1IncludeResult
  (JNIEnv* env, jclass self, jstring headerName, jstring headerData, jlong headerlength, jbyteArray userData){
	JNI_METHOD_GUARD_ENTER
	return env $_ TShader::Includer::IncludeResult(toCString(env, headerName), toChars(env, headerData), headerlength, env _$ userData);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1Includer_1IncludeResult_1setUserData
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TShader::Includer::IncludeResult*>(env _$ ptr)->userData = env _$ v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TShader_1Includer_1IncludeResult_1getHeaderName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TShader::Includer::IncludeResult*>(env _$ ptr)->headerName);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TShader_1Includer_1IncludeResult_1getHeaderData
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TShader::Includer::IncludeResult*>(env _$ ptr)->headerData);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TShader_1Includer_1IncludeResult_1getHeaderLength
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return (jlong) $<TShader::Includer::IncludeResult*>(env _$ ptr)->headerLength;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TShader_1Includer_1IncludeResult_1getUserData
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TShader::Includer::IncludeResult*>(env _$ ptr)->userData;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TShader_1ForbidIncluder
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ TShader::ForbidIncluder();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TShader_1ForbidIncluder_1includeSystem
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring headerName, jstring includerName, jlong inclusionDepth){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TShader::ForbidIncluder*>(env _$ ptr)->includeSystem(toChars(env, headerName), toChars(env, includerName), inclusionDepth);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TShader_1ForbidIncluder_1includeLocal
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring headerName, jstring includerName, jlong inclusionDepth){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TShader::ForbidIncluder*>(env _$ ptr)->includeLocal(toChars(env, headerName), toChars(env, includerName), inclusionDepth);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShader_1ForbidIncluder_1releaseInclude
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray include){
	JNI_METHOD_GUARD_ENTER
	$<TShader::ForbidIncluder*>(env _$ ptr)->releaseInclude($<TShader::Includer::IncludeResult*>(env _$ include));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShader_1parse___3B_3BIIZZI_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray res, jint ver, jint pro, jboolean forceDefault, jboolean forwardCompatible, jint messages, jbyteArray includer){
	JNI_METHOD_GUARD_ENTER
	return $<TShader*>(env _$ ptr)->parse($<TBuiltInResource*>(env _$ res), ver, $<EProfile>(pro), forceDefault, forwardCompatible, $<EShMessages>(messages), *$<TShader::Includer*>(env _$ includer));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShader_1parse___3B_3BIIZZI
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray res, jint ver, jint pro, jboolean forceDefault, jboolean forwardCompatible, jint messages){
	JNI_METHOD_GUARD_ENTER
	return $<TShader*>(env _$ ptr)->parse($<TBuiltInResource*>(env _$ res), ver, $<EProfile>(pro), forceDefault, forwardCompatible, $<EShMessages>(messages));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShader_1parse___3B_3BIZI
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray res, jint ver, jboolean forwardCompatible, jint messages){
	JNI_METHOD_GUARD_ENTER
	return $<TShader*>(env _$ ptr)->parse($<TBuiltInResource*>(env _$ res), ver, forwardCompatible, $<EShMessages>(messages));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShader_1parse___3B_3BIZI_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray res, jint ver, jboolean forwardCompatible, jint messages, jbyteArray includer){
	JNI_METHOD_GUARD_ENTER
	return $<TShader*>(env _$ ptr)->parse($<TBuiltInResource*>(env _$ res), ver, forwardCompatible, $<EShMessages>(messages), *$<TShader::Includer*>(env _$ includer));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShader_1preprocess
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray res, jint ver, jint pro, jboolean forceDefault, jboolean forwardCompatible, jint messages, jobjectArray outputString, jbyteArray includer){
	JNI_METHOD_GUARD_ENTER
	std::string stringRef;
	jboolean ret = $<TShader*>(env _$ ptr)->preprocess($<TBuiltInResource*>(env _$ res), ver, $<EProfile>(pro), forceDefault, forwardCompatible, $<EShMessages>(messages), &stringRef, *$<TShader::Includer*>(env _$ includer));
	(env)->SetObjectArrayElement(outputString, 0, toString(env, stringRef));
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TShader_1getInfoLog
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TShader*>(env _$ ptr)->getInfoLog());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TShader_1getInfoDebugLog
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TShader*>(env _$ ptr)->getInfoDebugLog());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TShader_1getStage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShader*>(env _$ ptr)->getStage();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TShader_1getIntermediate
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TShader*>(env _$ ptr)->getIntermediate();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TObjectReflection
  (JNIEnv* env, jclass self, jstring pName, jbyteArray pType, jint pOffset, jint pGLDefineType, jint pSize, jint pIndex){
	JNI_METHOD_GUARD_ENTER
	std::string pNameRef = toCString(env, pName);
	return env $_ Pool_mallocIndirect($<TObjectReflection*>(nullptr), &pNameRef, $<TType*>(env _$ pType), &pOffset, &pGLDefineType, &pSize, &pIndex);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1getType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TObjectReflection*>(env _$ ptr)->getType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1getBinding
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TObjectReflection*>(env _$ ptr)->getBinding();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1dump
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TObjectReflection*>(env _$ ptr)->dump();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1setName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring v){
	JNI_METHOD_GUARD_ENTER
	$<TObjectReflection*>(env _$ ptr)->name = toCString(env, v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1setOffset
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TObjectReflection*>(env _$ ptr)->offset = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1setGlDefineType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TObjectReflection*>(env _$ ptr)->glDefineType = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1setSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TObjectReflection*>(env _$ ptr)->size = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1setIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TObjectReflection*>(env _$ ptr)->index = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1setCounterIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TObjectReflection*>(env _$ ptr)->counterIndex = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1setNumMembers
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TObjectReflection*>(env _$ ptr)->numMembers = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1setArrayStride
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TObjectReflection*>(env _$ ptr)->arrayStride = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1setTopLevelArraySize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TObjectReflection*>(env _$ ptr)->topLevelArraySize = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1setTopLevelArrayStride
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TObjectReflection*>(env _$ ptr)->topLevelArrayStride = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1setStages
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TObjectReflection*>(env _$ ptr)->stages = $<EShLanguageMask>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1getName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TObjectReflection*>(env _$ ptr)->name);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1getOffset
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TObjectReflection*>(env _$ ptr)->offset;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1getGlDefineType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TObjectReflection*>(env _$ ptr)->glDefineType;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1getSize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TObjectReflection*>(env _$ ptr)->size;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1getIndex
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TObjectReflection*>(env _$ ptr)->index;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1getCounterIndex
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TObjectReflection*>(env _$ ptr)->counterIndex;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1getNumMembers
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TObjectReflection*>(env _$ ptr)->numMembers;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1getArrayStride
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TObjectReflection*>(env _$ ptr)->arrayStride;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1getTopLevelArraySize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TObjectReflection*>(env _$ ptr)->topLevelArraySize;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1getTopLevelArrayStride
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TObjectReflection*>(env _$ ptr)->topLevelArrayStride;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1getStages
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TObjectReflection*>(env _$ ptr)->stages;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TObjectReflection_1badReflection
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ TObjectReflection::badReflection();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TProgram
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TProgram*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TProgram_1addShader
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray shader){
	JNI_METHOD_GUARD_ENTER
	$<TProgram*>(env _$ ptr)->addShader($<TShader*>(env _$ shader));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TProgram_1getShaders
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TProgram*>(env _$ ptr)->getShaders($<EShLanguage>(stage));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TProgram_1link
  (JNIEnv* env, jclass self, jbyteArray ptr, jint messages){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->link($<EShMessages>(messages));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TProgram_1getInfoLog
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TProgram*>(env _$ ptr)->getInfoLog());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TProgram_1getInfoDebugLog
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TProgram*>(env _$ ptr)->getInfoDebugLog());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TProgram_1getIntermediate
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TProgram*>(env _$ ptr)->getIntermediate($<EShLanguage>(stage));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TProgram_1buildReflection
  (JNIEnv* env, jclass self, jbyteArray ptr, jint opts){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->buildReflection(opts);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TProgram_1getLocalSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint dim){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getLocalSize(dim);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getReflectionIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getReflectionIndex(toChars(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getReflectionPipeIOIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jboolean inOrOut){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getReflectionPipeIOIndex(toChars(env, name), inOrOut);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getNumUniformVariables
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getNumUniformVariables();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniform
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TProgram*>(env _$ ptr)->getUniform(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getNumUniformBlocks
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getNumUniformVariables();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformBlock
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TProgram*>(env _$ ptr)->getUniformBlock(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getNumPipeInputs
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getNumPipeInputs();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TProgram_1getPipeInput
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TProgram*>(env _$ ptr)->getPipeInput(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getNumPipeOutputs
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getNumPipeOutputs();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TProgram_1getPipeOutput
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TProgram*>(env _$ ptr)->getPipeOutput(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getNumBufferVariables
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getNumBufferVariables();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TProgram_1getBufferVariable
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TProgram*>(env _$ ptr)->getBufferVariable(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getNumBufferBlocks
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getNumBufferBlocks();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TProgram_1getBufferBlock
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TProgram*>(env _$ ptr)->getBufferBlock(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getNumAtomicCounters
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getNumAtomicCounters();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TProgram_1getAtomicCounter
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TProgram*>(env _$ ptr)->getAtomicCounter(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getNumLiveUniformVariables
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getNumLiveUniformVariables();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getNumLiveUniformBlocks
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getNumLiveUniformBlocks();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getNumLiveAttributes
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getNumLiveAttributes();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getUniformIndex(toChars(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getPipeIOIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jboolean inOrOut){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getPipeIOIndex(toChars(env, name), inOrOut);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformName
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TProgram*>(env _$ ptr)->getUniformName(index));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getUniformBinding(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformStages
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getUniformStages(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformBlockIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getUniformBlockIndex(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getUniformType(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformBufferOffset
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getUniformBufferOffset(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformArraySize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getUniformArraySize(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformTType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TProgram*>(env _$ ptr)->getUniformTType(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformBlockName
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TProgram*>(env _$ ptr)->getUniformBlockName(index));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformBlockSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getUniformBlockSize(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformBlockBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getUniformBlockBinding(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformBlockCounterIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getUniformBlockCounterIndex(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TProgram_1getUniformBlockTType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TProgram*>(env _$ ptr)->getUniformBlockTType(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TProgram_1getAttributeName
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TProgram*>(env _$ ptr)->getAttributeName(index));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TProgram_1getAttributeType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->getAttributeType(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TProgram_1getAttributeTType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TProgram*>(env _$ ptr)->getAttributeTType(index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TProgram_1dumpReflection
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TProgram*>(env _$ ptr)->dumpReflection();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TProgram_1mapIO
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray pResolver, jbyteArray pIoMapper ){
	JNI_METHOD_GUARD_ENTER
	return $<TProgram*>(env _$ ptr)->mapIO($<TIoMapResolver*>(env _$ pResolver), $<TIoMapper*>(env _$ pIoMapper));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TShHandleBase
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TShHandleBase*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TShHandleBase_1getAsCompiler
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TShHandleBase*>(env _$ ptr)->getAsCompiler();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TShHandleBase_1getAsLinker
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TShHandleBase*>(env _$ ptr)->getAsLinker();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TShHandleBase_1getAsUniformMap
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TShHandleBase*>(env _$ ptr)->getAsUniformMap();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TShHandleBase_1getPool
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TShHandleBase*>(env _$ ptr)->getPool();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TUniformMap_1getAsUniformMap
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TUniformMap*>(env _$ ptr)->getAsUniformMap();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TUniformMap_1getInfoSink
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TUniformMap*>(env _$ ptr)->getInfoSink();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TUniformMap_1setInfoSink
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray sink){
	JNI_METHOD_GUARD_ENTER
	$<TUniformMap*>(env _$ ptr)->infoSink = *$<TInfoSink*>(env _$ sink);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TCompiler_1getLanguage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCompiler*>(env _$ ptr)->getLanguage();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TCompiler_1getInfoSink
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TCompiler*>(env _$ ptr)->getInfoSink();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TCompiler_1getAsCompiler
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TCompiler*>(env _$ ptr)->getAsCompiler();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCompiler_1linkable
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCompiler*>(env _$ ptr)->linkable();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCompiler_1setInfoSink
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray sink){
	JNI_METHOD_GUARD_ENTER
	$<TCompiler*>(env _$ ptr)->infoSink = *$<TInfoSink*>(env _$ sink);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TLinker_1getAsLinker
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TLinker*>(env _$ ptr)->getAsLinker();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TLinker_1link___3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray handleList){
	JNI_METHOD_GUARD_ENTER
	return $<TLinker*>(env _$ ptr)->link(*$<THandleList*>(env _$ handleList));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TLinker_1setAppAttributeBindings
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	 $<TLinker*>(env _$ ptr)->setAppAttributeBindings($<ShBindingTable*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TLinker_1setFixedAttributeBindings
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	 $<TLinker*>(env _$ ptr)->setFixedAttributeBindings($<ShBindingTable*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TLinker_1setExcludedAttributes
  (JNIEnv* env, jclass self, jbyteArray ptr, jintArray attributes, jint count){
	JNI_METHOD_GUARD_ENTER
	int* fetchedAttributes = (int*) (env)->GetIntArrayElements(attributes, nullptr);
	$<TLinker*>(env _$ ptr)->setExcludedAttributes(fetchedAttributes, count);
	(env)->ReleaseIntArrayElements(attributes, (jint*) fetchedAttributes, JNI_ABORT);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TLinker_1getUniformBindings
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TLinker*>(env _$ ptr)->getUniformBindings();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TLinker_1getObjectCode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TLinker*>(env _$ ptr)->getObjectCode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TLinker_1getInfoSink
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TLinker*>(env _$ ptr)->getInfoSink();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TLinker_1setInfoSink
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TLinker*>(env _$ ptr)->infoSink = *$<TInfoSink*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_SpvVersion
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<SpvVersion*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpvVersion_1setSpv
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<SpvVersion*>(env _$ ptr)->spv = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpvVersion_1setVulkanGlsl
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<SpvVersion*>(env _$ ptr)->vulkanGlsl = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpvVersion_1setVulkan
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<SpvVersion*>(env _$ ptr)->vulkan = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpvVersion_1setOpenGl
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<SpvVersion*>(env _$ ptr)->openGl = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_SpvVersion_1getSpv
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<SpvVersion*>(env _$ ptr)->spv;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_SpvVersion_1getVulkanGlsl
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<SpvVersion*>(env _$ ptr)->vulkanGlsl;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_SpvVersion_1getVulkan
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<SpvVersion*>(env _$ ptr)->vulkan;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_SpvVersion_1getOpenGl
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<SpvVersion*>(env _$ ptr)->openGl;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TAttributeArgs__I_3B
  (JNIEnv* env, jclass self, jint name, jbyteArray args){
	JNI_METHOD_GUARD_ENTER
	TAttributeArgs* ret = Pool_malloc($<TAttributeArgs*>(nullptr));
	ret->name = $<TAttributeType>(name);
	ret->args = $<TIntermAggregate*>(env _$ args);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TAttributeArgs__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TAttributeArgs*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TAttributeArgs_1getInt
  (JNIEnv* env, jclass self, jbyteArray ptr, jint value, jint argNum){
	JNI_METHOD_GUARD_ENTER
	int valuePtr = value;
	return $<TAttributeArgs*>(env _$ ptr)->getInt(valuePtr, argNum);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TAttributeArgs_1getString
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring value, jint argNum, jboolean convertToLower ){
	JNI_METHOD_GUARD_ENTER
	return $<TAttributeArgs*>(env _$ ptr)->getString(*toTString(env, value), argNum, convertToLower );
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TAttributeArgs_1size
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TAttributeArgs*>(env _$ ptr)->size();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TAttributeArgs_1setName
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TAttributeArgs*>(env _$ ptr)->name = $<TAttributeType>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TAttributeArgs_1getName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TAttributeArgs*>(env _$ ptr)->name;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TAttributeArgs_1getArgs
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TAttributeArgs*>(env _$ ptr)->args;
	JNI_METHOD_GUARD_LEAVE
}
