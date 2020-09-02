
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/MachineIndependent/Initialize.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TBuiltInParseables_1initialize___3BII_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint version, jint profile, jbyteArray spvVersion){
	JNI_METHOD_GUARD_ENTER
	$<TBuiltInParseables*>(env _$ ptr)->initialize(version, $<EProfile>(profile), *$<SpvVersion*>(env _$ spvVersion));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TBuiltInParseables_1initialize___3B_3BII_3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray resources, jint version, jint profile, jbyteArray spvVersion, jint language){
	JNI_METHOD_GUARD_ENTER
	$<TBuiltInParseables*>(env _$ ptr)->initialize(*$<TBuiltInResource*>(env _$ resources), version, $<EProfile>(profile), *$<SpvVersion*>(env _$ spvVersion), $<EShLanguage>(language));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TBuiltInParseables_1getCommonString
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TBuiltInParseables*>(env _$ ptr)->getCommonString();
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TBuiltInParseables_1getStageString
  (JNIEnv* env, jclass self, jbyteArray ptr, jint language){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TBuiltInParseables*>(env _$ ptr)->getStageString($<EShLanguage>(language));
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TBuiltInParseables_1identifyBuiltIns___3BII_3BI_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint version, jint profile, jbyteArray spvVersion, jint language, jbyteArray symbolTable){
	JNI_METHOD_GUARD_ENTER
	$<TBuiltInParseables*>(env _$ ptr)->identifyBuiltIns(version, $<EProfile>(profile), *$<SpvVersion*>(env _$ spvVersion), $<EShLanguage>(language), *$<TSymbolTable*>(env _$ symbolTable));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TBuiltInParseables_1identifyBuiltIns___3BII_3BI_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint version, jint profile, jbyteArray spvVersion, jint language, jbyteArray symbolTable, jbyteArray resources){
	JNI_METHOD_GUARD_ENTER
	$<TBuiltInParseables*>(env _$ ptr)->identifyBuiltIns(version, $<EProfile>(profile), *$<SpvVersion*>(env _$ spvVersion), $<EShLanguage>(language), *$<TSymbolTable*>(env _$ symbolTable), *$<TBuiltInResource*>(env _$ resources));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TBuiltIns
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TBuiltIns();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TBuiltIns_1initialize___3BII_3B
	(JNIEnv* env, jclass self, jbyteArray ptr, jint version, jint profile, jbyteArray spvVersion){
	JNI_METHOD_GUARD_ENTER
	$<TBuiltIns*>(env _$ ptr)->initialize(version, $<EProfile>(profile), *$<SpvVersion*>(env _$ spvVersion));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TBuiltIns_1initialize___3B_3BII_3BI
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray resources, jint version, jint profile, jbyteArray spvVersion, jint language){
	JNI_METHOD_GUARD_ENTER
	$<TBuiltIns*>(env _$ ptr)->initialize(*$<TBuiltInResource*>(env _$ resources), version, $<EProfile>(profile), *$<SpvVersion*>(env _$ spvVersion), $<EShLanguage>(language));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TBuiltIns_1identifyBuiltIns___3BII_3BI_3B
	(JNIEnv* env, jclass self, jbyteArray ptr, jint version, jint profile, jbyteArray spvVersion, jint language, jbyteArray symbolTable){
	JNI_METHOD_GUARD_ENTER
	$<TBuiltIns*>(env _$ ptr)->identifyBuiltIns(version, $<EProfile>(profile), *$<SpvVersion*>(env _$ spvVersion), $<EShLanguage>(language), *$<TSymbolTable*>(env _$ symbolTable));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TBuiltIns_1identifyBuiltIns___3BII_3BI_3B_3B
	(JNIEnv* env, jclass self, jbyteArray ptr, jint version, jint profile, jbyteArray spvVersion, jint language, jbyteArray symbolTable, jbyteArray resources){
	JNI_METHOD_GUARD_ENTER
	$<TBuiltIns*>(env _$ ptr)->identifyBuiltIns(version, $<EProfile>(profile), *$<SpvVersion*>(env _$ spvVersion), $<EShLanguage>(language), *$<TSymbolTable*>(env _$ symbolTable), *$<TBuiltInResource*>(env _$ resources));
	JNI_METHOD_GUARD_LEAVE
}
