
#include <jni.h>

#include <Java_Main.h>

#define ENABLE_HLSL

#include <glslang/MachineIndependent/parseVersions.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1requireStageMask
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint mask, jstring featureDesc){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->requireStage(*$<TSourceLoc*>(env _$ loc), $<EShLanguageMask>(mask), toChars(env, featureDesc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1requireStage
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint language, jstring featureDesc){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->requireStage(*$<TSourceLoc*>(env _$ loc), $<EShLanguage>(language), toChars(env, featureDesc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TParseVersions_1isEsProfile
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->isEsProfile();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1requireProfile
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint profileMask, jstring featureDesc){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->requireProfile(*$<TSourceLoc*>(env _$ loc), profileMask, toChars(env, featureDesc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1profileRequires___3B_3BIII_3Ljava_lang_String_2Ljava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint profileMask, jint minVersion, jobjectArray extensions, jstring featureDesc){
	JNI_METHOD_GUARD_ENTER
	int numExtensions = env->GetArrayLength(extensions);
	TParseVersions* elem = $<TParseVersions*>(env _$ ptr);
	elem->profileRequires(*$<TSourceLoc*>(env _$ loc), profileMask, minVersion, numExtensions, toCharArrays(env, extensions, elem), toChars(env, featureDesc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1profileRequires___3B_3BIILjava_lang_String_2Ljava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint profileMask, jint minVersion, jstring extension, jstring featureDesc){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->profileRequires(*$<TSourceLoc*>(env _$ loc), profileMask, minVersion, toChars(env, extension), toChars(env, featureDesc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1initializeExtensionBehavior
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->initializeExtensionBehavior();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1checkDeprecated
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint queryProfiles, jint depVersion, jstring featureDesc){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->checkDeprecated(*$<TSourceLoc*>(env _$ loc), queryProfiles, depVersion, toChars(env, featureDesc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1requireNotRemoved
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint queryProfiles, jint removedVersion, jstring featureDesc){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->requireNotRemoved(*$<TSourceLoc*>(env _$ loc), queryProfiles, removedVersion, toChars(env, featureDesc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1requireExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jobjectArray extensions, jstring featureDesc){
	JNI_METHOD_GUARD_ENTER
	int numExtensions = env->GetArrayLength(extensions);
	TParseVersions* elem = $<TParseVersions*>(env _$ ptr);
	elem->requireExtensions(*$<TSourceLoc*>(env _$ loc), numExtensions, toCharArrays(env, extensions, elem), toChars(env, featureDesc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1ppRequireExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jobjectArray extensions, jstring featureDesc){
	JNI_METHOD_GUARD_ENTER
	int numExtensions = env->GetArrayLength(extensions);
	TParseVersions* elem = $<TParseVersions*>(env _$ ptr);
	elem->ppRequireExtensions(*$<TSourceLoc*>(env _$ loc), numExtensions, toCharArrays(env, extensions, elem), toChars(env, featureDesc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_TParseVersions_1getExtensionBehavior
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->getExtensionBehavior(toChars(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TParseVersions_1extensionTurnedOn
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring extension){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->extensionTurnedOn(toChars(env, extension));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TParseVersions_1extensionsTurnedOn
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray extensions){
	JNI_METHOD_GUARD_ENTER
	int numExtensions = env->GetArrayLength(extensions);
	TParseVersions* elem = $<TParseVersions*>(env _$ ptr);
	return elem->extensionsTurnedOn(numExtensions, toCharArrays(env, extensions, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1updateExtensionBehavior___3BILjava_lang_String_2Ljava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jint line, jstring extension, jstring behavior){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->updateExtensionBehavior(line, toChars(env, extension), toChars(env, behavior));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1updateExtensionBehavior___3BLjava_lang_String_2I
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring extension, jint b){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->updateExtensionBehavior(toChars(env, extension), $<TExtensionBehavior>(b));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TParseVersions_1checkExtensionsRequested
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jobjectArray extensions, jstring featureDesc){
	JNI_METHOD_GUARD_ENTER
	int numExtensions = env->GetArrayLength(extensions);
	TParseVersions* elem = $<TParseVersions*>(env _$ ptr);
	return elem->checkExtensionsRequested(*$<TSourceLoc*>(env _$ loc), numExtensions, toCharArrays(env, extensions, elem), toChars(env, featureDesc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1checkExtensionStage
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring extension){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->checkExtensionStage(*$<TSourceLoc*>(env _$ loc), toChars(env, extension));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1extensionRequires
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring extension, jstring behavior){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->extensionRequires(*$<TSourceLoc*>(env _$ loc), toChars(env, extension), toChars(env, behavior));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1fullIntegerCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->fullIntegerCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1unimplemented
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring featureDesc){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->unimplemented(*$<TSourceLoc*>(env _$ loc), toChars(env, featureDesc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1doubleCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->doubleCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1float16Check
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->float16Check(*$<TSourceLoc*>(env _$ loc), toChars(env, op), builtIn);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1float16ScalarVectorCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->float16ScalarVectorCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, op), builtIn);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TParseVersions_1float16Arithmetic
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->float16Arithmetic();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1requireFloat16Arithmetic
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jstring featureDesc){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->requireFloat16Arithmetic(*$<TSourceLoc*>(env _$ loc), toChars(env, op), toChars(env, featureDesc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1int16ScalarVectorCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->int16ScalarVectorCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, op), builtIn);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TParseVersions_1int16Arithmetic
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->int16Arithmetic();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1requireInt16Arithmetic
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jstring featureDesc){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->requireInt16Arithmetic(*$<TSourceLoc*>(env _$ loc), toChars(env, op), toChars(env, featureDesc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1int8ScalarVectorCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->int8ScalarVectorCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, op), builtIn);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TParseVersions_1int8Arithmetic
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->int8Arithmetic();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1requireInt8Arithmetic
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jstring featureDesc){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->requireInt8Arithmetic(*$<TSourceLoc*>(env _$ loc), toChars(env, op), toChars(env, featureDesc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1float16OpaqueCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->float16OpaqueCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, op), builtIn);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1int64Check
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->int64Check(*$<TSourceLoc*>(env _$ loc), toChars(env, op), builtIn);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1explicitInt8Check
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->explicitInt8Check(*$<TSourceLoc*>(env _$ loc), toChars(env, op), builtIn);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1explicitInt16Check
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->explicitInt16Check(*$<TSourceLoc*>(env _$ loc), toChars(env, op), builtIn);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1explicitInt32Check
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->explicitInt32Check(*$<TSourceLoc*>(env _$ loc), toChars(env, op), builtIn);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1explicitFloat32Check
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->explicitFloat32Check(*$<TSourceLoc*>(env _$ loc), toChars(env, op), builtIn);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1explicitFloat64Check
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->explicitFloat64Check(*$<TSourceLoc*>(env _$ loc), toChars(env, op), builtIn);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1fcoopmatCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->fcoopmatCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, op), builtIn);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1intcoopmatCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->intcoopmatCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, op), builtIn);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TParseVersions_1relaxedErrors
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->relaxedErrors();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TParseVersions_1suppressWarnings
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->suppressWarnings();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TParseVersions_1isForwardCompatible
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->isForwardCompatible();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1spvRemoved
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->spvRemoved(*$<TSourceLoc*>(env _$ loc), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1vulkanRemoved
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->vulkanRemoved(*$<TSourceLoc*>(env _$ loc), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1requireVulkan
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->requireVulkan(*$<TSourceLoc*>(env _$ loc), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1requireSpv___3B_3BLjava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->requireSpv(*$<TSourceLoc*>(env _$ loc), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1requireSpv___3B_3BLjava_lang_String_2J
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jlong version){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->requireSpv(*$<TSourceLoc*>(env _$ loc), toChars(env, op), version);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1error
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring szReason, jstring szToken, jstring szExtraInfoFormat, jobjectArray additional){
	JNI_METHOD_GUARD_ENTER
	jsize additionLength = (env)->GetArrayLength(additional);
	void** additionalArr = new void*[additionLength];
	for(unsigned int i = 0 ; i < (unsigned int) additionLength; ++i){
		additionalArr[i] = env _$ (jbyteArray) (env)->GetObjectArrayElement(additional, i);
	}
	$<TParseVersions*>(env _$ ptr)->error(*$<TSourceLoc*>(env _$ loc), toChars(env, szReason), toChars(env, szToken), toChars(env, szExtraInfoFormat), additionalArr);
	delete additionalArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1warn
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring szReason, jstring szToken, jstring szExtraInfoFormat, jobjectArray additional){
	JNI_METHOD_GUARD_ENTER
	jsize additionLength = (env)->GetArrayLength(additional);
	void** additionalArr = new void*[additionLength];
	for(unsigned int i = 0 ; i < (unsigned int) additionLength; ++i){
		additionalArr[i] = env _$ (jbyteArray) (env)->GetObjectArrayElement(additional, i);
	}
	$<TParseVersions*>(env _$ ptr)->warn(*$<TSourceLoc*>(env _$ loc), toChars(env, szReason), toChars(env, szToken), toChars(env, szExtraInfoFormat), additionalArr);
	delete additionalArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1ppError
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring szReason, jstring szToken, jstring szExtraInfoFormat, jobjectArray additional){
	JNI_METHOD_GUARD_ENTER
	jsize additionLength = (env)->GetArrayLength(additional);
	void** additionalArr = new void*[additionLength];
	for(unsigned int i = 0 ; i < (unsigned int) additionLength; ++i){
		additionalArr[i] = env _$ (jbyteArray) (env)->GetObjectArrayElement(additional, i);
	}
	$<TParseVersions*>(env _$ ptr)->ppError(*$<TSourceLoc*>(env _$ loc), toChars(env, szReason), toChars(env, szToken), toChars(env, szExtraInfoFormat), additionalArr);
	delete additionalArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1ppWarn
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring szReason, jstring szToken, jstring szExtraInfoFormat, jobjectArray additional){
	JNI_METHOD_GUARD_ENTER
	jsize additionLength = (env)->GetArrayLength(additional);
	void** additionalArr = new void*[additionLength];
	for(unsigned int i = 0 ; i < (unsigned int) additionLength; ++i){
		additionalArr[i] = env _$ (jbyteArray) (env)->GetObjectArrayElement(additional, i);
	}
	$<TParseVersions*>(env _$ ptr)->ppWarn(*$<TSourceLoc*>(env _$ loc), toChars(env, szReason), toChars(env, szToken), toChars(env, szExtraInfoFormat), additionalArr);
	delete additionalArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1addError
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->addError();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_TParseVersions_1getNumErrors
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->getNumErrors();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1setScanner
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray scanner){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->setScanner($<TInputScanner*>(env _$ scanner));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TParseVersions_1getScanner
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseVersions*>(env _$ ptr)->getScanner();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TParseVersions_1getCurrentLoc
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseVersions*>(env _$ ptr)->getCurrentLoc();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1setCurrentLine
  (JNIEnv* env, jclass self, jbyteArray ptr, jint line){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->setCurrentLine(line);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1setCurrentColumn
  (JNIEnv* env, jclass self, jbyteArray ptr, jint col){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->setCurrentColumn(col);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1setCurrentSourceName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->setCurrentSourceName(toChars(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1setCurrentString
  (JNIEnv* env, jclass self, jbyteArray ptr, jint string){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->setCurrentString(string);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_Java_Main_TParseVersions_1getPreamble
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	std::string ret;
	$<TParseVersions*>(env _$ ptr)->getPreamble(ret);
	return toString(env, ret);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TParseVersions_1isReadingHLSL
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->isReadingHLSL();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TParseVersions_1hlslEnable16BitTypes
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->hlslEnable16BitTypes();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TParseVersions_1hlslDX9Compatible
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->hlslDX9Compatible();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1setForwardCompatible
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	 $<TParseVersions*>(env _$ ptr)->forwardCompatible = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1setProfile
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->profile = $<EProfile>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1setInfoSink
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->infoSink = *$<TInfoSink*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1setVersion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->version = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1setLanguage
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->language = $<EShLanguage>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_TParseVersions_1setSpvVersion
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TParseVersions*>(env _$ ptr)->spvVersion = *$<SpvVersion*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_Java_Main_TParseVersions_1getForwardCompatible
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->forwardCompatible;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_TParseVersions_1getProfile
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->profile;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TParseVersions_1getInfoSink
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseVersions*>(env _$ ptr)->infoSink;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_TParseVersions_1getVersion
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->version;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_TParseVersions_1getLanguage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseVersions*>(env _$ ptr)->language;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TParseVersions_1getSpvVersion
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseVersions*>(env _$ ptr)->spvVersion;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TParseVersions_1getIntermediate
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseVersions*>(env _$ ptr)->intermediate;
	JNI_METHOD_GUARD_LEAVE
}
