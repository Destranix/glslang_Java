
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/MachineIndependent/ParseHelper.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPragma
  (JNIEnv* env, jclass self, jboolean o, jboolean d){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TPragma*>(nullptr), o, d);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPragma_1setOptimize
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TPragma*>(env _$ ptr)->optimize = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPragma_1setDebug
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TPragma*>(env _$ ptr)->debug = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPragma_1setPragmaTable
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TPragma*>(env _$ ptr)->pragmaTable = *$<TPragmaTable*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPragma_1getOptimize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPragma*>(env _$ ptr)->optimize;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPragma_1getDebug
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPragma*>(env _$ ptr)->debug;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPragma_1getPragmaTable
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TPragma*>(env _$ ptr)->pragmaTable;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1error
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring szReason, jstring szToken, jstring szExtraInfoFormat, jobjectArray additional){
	JNI_METHOD_GUARD_ENTER
	jsize additionLength = (env)->GetArrayLength(additional);
	void** additionalArr = new void*[additionLength];
	for(unsigned int i = 0 ; i < (unsigned int) additionLength; ++i){
		additionalArr[i] = env _$ (jbyteArray) (env)->GetObjectArrayElement(additional, i);
	}
	$<TParseContextBase*>(env _$ ptr)->error(*$<TSourceLoc*>(env _$ loc), toChars(env, szReason), toChars(env, szToken), toChars(env, szExtraInfoFormat), additionalArr);
	delete[] additionalArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1warn
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring szReason, jstring szToken, jstring szExtraInfoFormat, jobjectArray additional){
	JNI_METHOD_GUARD_ENTER
	jsize additionLength = (env)->GetArrayLength(additional);
	void** additionalArr = new void*[additionLength];
	for(unsigned int i = 0 ; i < (unsigned int) additionLength; ++i){
		additionalArr[i] = env _$ (jbyteArray) (env)->GetObjectArrayElement(additional, i);
	}
	$<TParseContextBase*>(env _$ ptr)->warn(*$<TSourceLoc*>(env _$ loc), toChars(env, szReason), toChars(env, szToken), toChars(env, szExtraInfoFormat), additionalArr);
	delete[] additionalArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1ppError
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring szReason, jstring szToken, jstring szExtraInfoFormat, jobjectArray additional){
	JNI_METHOD_GUARD_ENTER
	jsize additionLength = (env)->GetArrayLength(additional);
	void** additionalArr = new void*[additionLength];
	for(unsigned int i = 0 ; i < (unsigned int) additionLength; ++i){
		additionalArr[i] = env _$ (jbyteArray) (env)->GetObjectArrayElement(additional, i);
	}
	$<TParseContextBase*>(env _$ ptr)->ppError(*$<TSourceLoc*>(env _$ loc), toChars(env, szReason), toChars(env, szToken), toChars(env, szExtraInfoFormat), additionalArr);
	delete[] additionalArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1ppWarn
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring szReason, jstring szToken, jstring szExtraInfoFormat, jobjectArray additional){
	JNI_METHOD_GUARD_ENTER
	jsize additionLength = (env)->GetArrayLength(additional);
	void** additionalArr = new void*[additionLength];
	for(unsigned int i = 0 ; i < (unsigned int) additionLength; ++i){
		additionalArr[i] = env _$ (jbyteArray) (env)->GetObjectArrayElement(additional, i);
	}
	$<TParseContextBase*>(env _$ ptr)->ppWarn(*$<TSourceLoc*>(env _$ loc), toChars(env, szReason), toChars(env, szToken), toChars(env, szExtraInfoFormat), additionalArr);
	delete[] additionalArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setLimits
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->setLimits(*$<TBuiltInResource*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1checkIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jint index){
	JNI_METHOD_GUARD_ENTER
	int i = index;
	$<TParseContextBase*>(env _$ ptr)->checkIndex(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t), i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getLanguage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContextBase*>(env _$ ptr)->getLanguage();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setScanContext
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray c){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->setScanContext($<TScanContext*>(env _$ c));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getScanContext
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContextBase*>(env _$ ptr)->getScanContext();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setPpContext
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray c){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->setPpContext($<TPpContext*>(env _$ c));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getPpContext
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContextBase*>(env _$ ptr)->getPpContext();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setLineCallback
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject callback){
	JNI_METHOD_GUARD_ENTER
	TParseContextBase* elem = $<TParseContextBase*>(env _$ ptr);
	GlobalRef* ref = nullptr;
	ref = Pool_mallocRegister(ref, elem);
	ref->setRef(callback);
	jobject callbackGlobalRef = ref->getRef();
	std::function<void(JNIEnv*, int, int, bool, int, const char*)> tmp([callbackGlobalRef](JNIEnv* env, int i0, int i1, bool b0, int i2, const char* s0){
		jclass clazz = env->FindClass(JAVA_PACKAGE_PATH(/Main$Void_IntIntBooleanIntString));
		jmethodID id = env->GetMethodID(clazz, "op", "(IIZILjava/lang/String;)V");
		env->CallVoidMethod(callbackGlobalRef, id, i0, i1, b0, i2, toString(env, s0));
	});
	std::function<void(int, int, bool, int, const char*)>* cCallback = createCallback(tmp, elem);
	elem->setLineCallback(*cCallback);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setExtensionCallback
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject callback){
	JNI_METHOD_GUARD_ENTER
	TParseContextBase* elem = $<TParseContextBase*>(env _$ ptr);
	GlobalRef* ref = nullptr;
	ref = Pool_mallocRegister(ref, elem);
	ref->setRef(callback);
	jobject callbackGlobalRef = ref->getRef();
	std::function<void(JNIEnv*, int, const char*, const char*)> tmp([callbackGlobalRef](JNIEnv* env, int i0, const char* s0, const char* s1){
		jclass clazz = env->FindClass(JAVA_PACKAGE_PATH(/Main$Void_IntStringString));
		jmethodID id = env->GetMethodID(clazz, "op", "(ILjava/lang/String;Ljava/lang/String;)V");
		env->CallVoidMethod(callbackGlobalRef, id, toString(env, s0), toString(env, s1));
	});
	std::function<void(int, const char*, const char*)>* cCallback = createCallback(tmp, elem);
	elem->setExtensionCallback(*cCallback);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setVersionCallback
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject callback){
	JNI_METHOD_GUARD_ENTER
	TParseContextBase* elem = $<TParseContextBase*>(env _$ ptr);
	GlobalRef* ref = nullptr;
	ref = Pool_mallocRegister(ref, elem);
	ref->setRef(callback);
	jobject callbackGlobalRef = ref->getRef();
	std::function<void(JNIEnv*, int, int, const char*)> tmp([callbackGlobalRef](JNIEnv* env, int i0, int i1, const char* s0){
		jclass clazz = env->FindClass(JAVA_PACKAGE_PATH(/Main$Void_IntIntString));
		jmethodID id = env->GetMethodID(clazz, "op", "(IILjava/lang/String;)V");
		env->CallVoidMethod(callbackGlobalRef, id, i0, i1, toString(env, s0));
	});
	std::function<void(int, int, const char*)>* cCallback = createCallback(tmp, elem);
	elem->setVersionCallback(*cCallback);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setPragmaCallback
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject callback){
	JNI_METHOD_GUARD_ENTER
	TParseContextBase* elem = $<TParseContextBase*>(env _$ ptr);
	GlobalRef* ref = nullptr;
	ref = Pool_mallocRegister(ref, elem);
	ref->setRef(callback);
	jobject callbackGlobalRef = ref->getRef();
	std::function<void(JNIEnv*, int, const TVector<TString>&)> tmp([callbackGlobalRef](JNIEnv* env, int i0, const TVector<TString>& s0){
		jclass clazz = env->FindClass(JAVA_PACKAGE_PATH(/Main$Void_IntStringarray));
		jmethodID id = env->GetMethodID(clazz, "op", "(I[Ljava/lang/String;)V");
		env->CallVoidMethod(callbackGlobalRef, id, i0, toStringArray(env, s0));
	});
	std::function<void(int, const TVector<TString>&)>* cCallback = createCallback(tmp, elem);
	elem->setPragmaCallback(*cCallback);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setErrorCallback
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject callback){
	JNI_METHOD_GUARD_ENTER
	TParseContextBase* elem = $<TParseContextBase*>(env _$ ptr);
	GlobalRef* ref = nullptr;
	ref = Pool_mallocRegister(ref, elem);
	ref->setRef(callback);
	jobject callbackGlobalRef = ref->getRef();
	std::function<void(JNIEnv*, int, const char*)> tmp([callbackGlobalRef](JNIEnv* env, int i0, const char* s0){
		jclass clazz = env->FindClass(JAVA_PACKAGE_PATH(/Main$Void_IntString));
		jmethodID id = env->GetMethodID(clazz, "op", "(ILjava/lang/String;)V");
		env->CallVoidMethod(callbackGlobalRef, id, i0, toString(env, s0));
	});
	std::function<void(int, const char*)>* cCallback = createCallback(tmp, elem);
	elem->setErrorCallback(*cCallback);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1reservedPpErrorCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring name, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->reservedPpErrorCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, name), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1lineContinuationCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jboolean endOfComment){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContextBase*>(env _$ ptr)->lineContinuationCheck(*$<TSourceLoc*>(env _$ loc), endOfComment);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1lineDirectiveShouldSetNextLine
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContextBase*>(env _$ ptr)->lineDirectiveShouldSetNextLine();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1handlePragma
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jobjectArray s){
	JNI_METHOD_GUARD_ENTER
	TParseContextBase* elem = $<TParseContextBase*>(env _$ ptr);
	elem->handlePragma(*$<TSourceLoc*>(env _$ loc), *toTStringTVector(env, s, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1parseShaderStrings
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray context, jbyteArray input, jboolean versionWillBeError){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContextBase*>(env _$ ptr)->parseShaderStrings(*$<TPpContext*>(env _$ context), *$<TInputScanner*>(env _$ input), versionWillBeError);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1notifyVersion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint line, jint version, jstring type_string){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->notifyVersion(line, version, toChars(env, type_string));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1notifyErrorDirective
  (JNIEnv* env, jclass self, jbyteArray ptr, jint line, jstring error_message){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->notifyErrorDirective(line, toChars(env, error_message));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1notifyLineDirective
  (JNIEnv* env, jclass self, jbyteArray ptr, jint curLineNo, jint newLineNo, jboolean hasSource, jint sourceNum, jstring sourceName){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->notifyLineDirective(curLineNo, newLineNo, hasSource, sourceNum, toChars(env, sourceName));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1notifyExtensionDirective
  (JNIEnv* env, jclass self, jbyteArray ptr, jint line, jstring extension, jstring behavior){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->notifyExtensionDirective(line, toChars(env, extension), toChars(env, behavior));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1growGlobalUniformBlock
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jstring memberName, jbyteArray typeList){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->growGlobalUniformBlock(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t), *toTString(env, memberName), $<TTypeList*>(env _$ typeList));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1renameShaderFunction
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	TString* s = toTString(env, name);
	$<TParseContextBase*>(env _$ ptr)->renameShaderFunction(s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1lValueErrorCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContextBase*>(env _$ ptr)->lValueErrorCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, op), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1rValueErrorCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->rValueErrorCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, op), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setSymbolTable
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->symbolTable = *$<TSymbolTable*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setStatementNestingLevel
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->statementNestingLevel = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setLoopNestingLevel
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->loopNestingLevel = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setStructNestingLevel
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->structNestingLevel = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setControlFlowNestingLevel
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->controlFlowNestingLevel = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setFunctionReturnsValue
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->functionReturnsValue = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setPostEntryPointReturn
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->postEntryPointReturn = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setSwitchSequenceStack
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->switchSequenceStack = *$<TList<TIntermSequence*>*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setSwitchLevel
  (JNIEnv* env, jclass self, jbyteArray ptr, jintArray v){
	JNI_METHOD_GUARD_ENTER
	TParseContextBase* elem = $<TParseContextBase*>(env _$ ptr);
	int* a = (int*) env->GetIntArrayElements(v, nullptr);
	int length = env->GetArrayLength(v);
	TList<int> list = *toTList(a, length, elem);
	env->ReleaseIntArrayElements(v, (jint*) a, JNI_ABORT);
	elem->switchLevel = list;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setContextPragma
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->contextPragma = *$<struct TPragma*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setBeginInvocationInterlockCount
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->beginInvocationInterlockCount = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1setEndInvocationInterlockCount
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContextBase*>(env _$ ptr)->endInvocationInterlockCount = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getScopeMangler
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TParseContextBase*>(env _$ ptr)->scopeMangler);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getSymbolTable
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContextBase*>(env _$ ptr)->symbolTable;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getStatementNestingLevel
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContextBase*>(env _$ ptr)->statementNestingLevel;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getLoopNestingLevel
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContextBase*>(env _$ ptr)->loopNestingLevel;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getStructNestingLevel
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContextBase*>(env _$ ptr)->structNestingLevel;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getControlFlowNestingLevel
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContextBase*>(env _$ ptr)->controlFlowNestingLevel;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getCurrentFunctionType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContextBase*>(env _$ ptr)->currentFunctionType;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getFunctionReturnsValue
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContextBase*>(env _$ ptr)->functionReturnsValue;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getPostEntryPointReturn
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContextBase*>(env _$ ptr)->postEntryPointReturn;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getSwitchSequenceStack
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContextBase*>(env _$ ptr)->switchSequenceStack;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jintArray JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getSwitchLevel
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TList<int> list = $<TParseContextBase*>(env _$ ptr)->switchLevel;
	jint* a = new jint[list.size()];
	copy(list.begin(),list.end(),a);
	jintArray ret = env->NewIntArray(list.size());
	env->SetIntArrayRegion(ret, 0, list.size(), a);
	delete[] a;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getContextPragma
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContextBase*>(env _$ ptr)->contextPragma;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getBeginInvocationInterlockCount
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContextBase*>(env _$ ptr)->beginInvocationInterlockCount;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TParseContextBase_1getEndInvocationInterlockCount
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContextBase*>(env _$ ptr)->endInvocationInterlockCount;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPrecisionManager
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TPrecisionManager*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPrecisionManager_1respectPrecisionQualifiers
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TPrecisionManager*>(env _$ ptr)->respectPrecisionQualifiers();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPrecisionManager_1respectingPrecisionQualifiers
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPrecisionManager*>(env _$ ptr)->respectingPrecisionQualifiers();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPrecisionManager_1shouldWarnAboutDefaults
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPrecisionManager*>(env _$ ptr)->shouldWarnAboutDefaults();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPrecisionManager_1defaultWarningGiven
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TPrecisionManager*>(env _$ ptr)->defaultWarningGiven();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPrecisionManager_1warnAboutDefaults
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TPrecisionManager*>(env _$ ptr)->warnAboutDefaults();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPrecisionManager_1explicitIntDefaultSeen
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TPrecisionManager*>(env _$ ptr)->explicitIntDefaultSeen();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPrecisionManager_1explicitFloatDefaultSeen
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TPrecisionManager*>(env _$ ptr)->explicitFloatDefaultSeen();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext
(JNIEnv* env, jclass self, jbyteArray table, jbyteArray inter, jboolean parsingBuiltins, jint version, jint profile, jbyteArray spvVersion, jint language, jbyteArray sink, jboolean forwardCompatible, jint messages, jstring entryPoint){
	JNI_METHOD_GUARD_ENTER
	EProfile profileRef = $<EProfile>(profile);
	EShLanguage languageRef = $<EShLanguage>(language);
	EShMessages messagesRef = $<EShMessages>(messages);
	TString* entryPointRef = toTString(env, entryPoint);
	return env $_ Pool_mallocIndirect($<TParseContext*>(nullptr), $<TSymbolTable*>(env _$ table), $<TIntermediate*>(env _$ inter), &parsingBuiltins, &version, &profileRef, $<SpvVersion*>(env _$ spvVersion), &languageRef, $<TInfoSink*>(env _$ sink), &forwardCompatible, &messagesRef, &entryPointRef);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1obeyPrecisionQualifiers
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->obeyPrecisionQualifiers();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1setPrecisionDefaults
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->setPrecisionDefaults();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1setLimits
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->setLimits(*$<TBuiltInResource*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1parseShaderStrings
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray context, jbyteArray input, jboolean versionWillBeError){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->parseShaderStrings(*$<TPpContext*>(env _$ context), *$<TInputScanner*>(env _$ input), versionWillBeError);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1parserError
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->parserError(toChars(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1reservedErrorCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring s){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->reservedErrorCheck(*$<TSourceLoc*>(env _$ loc), *toTString(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1reservedPpErrorCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring name, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->reservedPpErrorCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, name), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1lineContinuationCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jboolean endOfComment){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->lineContinuationCheck(*$<TSourceLoc*>(env _$ loc), endOfComment);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1lineDirectiveShouldSetNextLine
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->lineDirectiveShouldSetNextLine();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1builtInName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->builtInName(*toTString(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1handlePragma
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jobjectArray s){
	JNI_METHOD_GUARD_ENTER
	TParseContext* elem = $<TParseContext*>(env _$ ptr);
	elem->handlePragma(*$<TSourceLoc*>(env _$ loc), *toTStringTVector(env, s, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleVariable
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray symbol, jstring s){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->handleVariable(*$<TSourceLoc*>(env _$ loc), $<TSymbol*>(env _$ symbol), toTString(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleBracketDereference
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray base, jbyteArray index){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->handleBracketDereference(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ base), $<TIntermTyped*>(env _$ index));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleIndexLimits
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray base, jbyteArray index){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->handleIndexLimits(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ base), $<TIntermTyped*>(env _$ index));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1makeEditable
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray s){
	JNI_METHOD_GUARD_ENTER
	TSymbol* sRef = $<TSymbol*>(env _$ s);
	$<TParseContext*>(env _$ ptr)->makeEditable(sRef);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1ioArrayCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray type, jstring identifier){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->ioArrayCheck(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ type), *toTString(env, identifier));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1isIoResizeArray
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->isIoResizeArray(*$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1fixIoArraySize
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->fixIoArraySize(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleIoResizeArrayAccess
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray base){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->handleIoResizeArrayAccess(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ base));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1checkIoArraysConsistency
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jboolean tailOnly){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->checkIoArraysConsistency(*$<TSourceLoc*>(env _$ loc), tailOnly);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TParseContext_1getIoArrayImplicitSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray qualifier, jstring featureString){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->getIoArrayImplicitSize(*$<TQualifier*>(env _$ qualifier), toTString(env, featureString));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1checkIoArrayConsistency
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint requiredSize, jstring feature, jbyteArray t, jstring s){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->checkIoArrayConsistency(*$<TSourceLoc*>(env _$ loc), requiredSize, toChars(env, feature), *$<TType*>(env _$ t), *toTString(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleBinaryMath
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring str, jint op, jbyteArray left, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->handleBinaryMath(*$<TSourceLoc*>(env _$ loc), toChars(env, str), $<TOperator>(op), $<TIntermTyped*>(env _$ left), $<TIntermTyped*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleUnaryMath
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring str, jint op, jbyteArray childNode){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->handleUnaryMath(*$<TSourceLoc*>(env _$ loc), toChars(env, str), $<TOperator>(op), $<TIntermTyped*>(env _$ childNode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleDotDereference
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray base, jstring field){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->handleDotDereference(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ base), *toTString(env, field));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleDotSwizzle
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray base, jstring field){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->handleDotSwizzle(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ base), *toTString(env, field));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1blockMemberExtensionCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray base , jint member, jstring memberName){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->blockMemberExtensionCheck(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ base), member, *toTString(env, memberName));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleFunctionDeclarator
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function, jboolean prototype){
	JNI_METHOD_GUARD_ENTER
	return  env $_ $<TParseContext*>(env _$ ptr)->handleFunctionDeclarator(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ function), prototype);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleFunctionDefinition
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->handleFunctionDefinition(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ function));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleFunctionCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->handleFunctionCall(*$<TSourceLoc*>(env _$ loc), $<TFunction*>(env _$ function), $<TIntermNode*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleBuiltInFunctionCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray arguments, jbyteArray function){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->handleBuiltInFunctionCall(*$<TSourceLoc*>(env _$ loc), $<TIntermNode*>(env _$ arguments), *$<TFunction*>(env _$ function));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1computeBuiltinPrecisions
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jbyteArray function){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->computeBuiltinPrecisions(*$<TIntermTyped*>(env _$ node), *$<TFunction*>(env _$ function));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleReturnValue
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->handleReturnValue(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1checkLocation
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint op){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->checkLocation(*$<TSourceLoc*>(env _$ loc), $<TOperator>(op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleLengthMethod
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->handleLengthMethod(*$<TSourceLoc*>(env _$ loc), $<TFunction*>(env _$ function), $<TIntermNode*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1addInputArgumentConversions
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray function, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	TIntermNode* nodePtr = $<TIntermNode*>(env _$ node);
	$<TParseContext*>(env _$ ptr)->addInputArgumentConversions(*$<TFunction*>(env _$ function), nodePtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1addOutputArgumentConversions
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray function, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->addOutputArgumentConversions(*$<TFunction*>(env _$ function), *$<TIntermAggregate*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1addAssign
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint op, jbyteArray left, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->addAssign(*$<TSourceLoc*>(env _$ loc), $<TOperator>(op), $<TIntermTyped*>(env _$ left), $<TIntermTyped*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1builtInOpCheck
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->builtInOpCheck(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ function), *$<TIntermOperator*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1nonOpBuiltInCheck
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->builtInOpCheck(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ function), *$<TIntermAggregate*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1userFunctionCallCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->userFunctionCallCheck(*$<TSourceLoc*>(env _$ loc), *$<TIntermAggregate*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1samplerConstructorLocationCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring token, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->samplerConstructorLocationCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, token), $<TIntermNode*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleConstructorCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->handleConstructorCall(*$<TSourceLoc*>(env _$ loc), *$<TPublicType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1handlePrecisionQualifier
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jint p){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->handlePrecisionQualifier(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), $<TPrecisionQualifier>(p));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1checkPrecisionQualifier
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint p){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->checkPrecisionQualifier(*$<TSourceLoc*>(env _$ loc), $<TPrecisionQualifier>(p));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1memorySemanticsCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function, jbyteArray callNode){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->memorySemanticsCheck(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ function), *$<TIntermOperator*>(env _$ callNode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1assignError
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jstring left, jstring right){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->assignError(*$<TSourceLoc*>(env _$ loc), toChars(env, op), *toTString(env, left), *toTString(env, right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1unaryOpError
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jstring operand){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->unaryOpError(*$<TSourceLoc*>(env _$ loc), toChars(env, op), *toTString(env, operand));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1binaryOpError
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jstring left, jstring right){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->binaryOpError(*$<TSourceLoc*>(env _$ loc), toChars(env, op), *toTString(env, left), *toTString(env, right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1variableCheck
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray nodePtr){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* nodePtrPtr = $<TIntermTyped*>(env _$ nodePtr);
	$<TParseContext*>(env _$ ptr)->variableCheck(nodePtrPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1lValueErrorCheck
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->lValueErrorCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, op), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1rValueErrorCheck
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->rValueErrorCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, op), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1constantValueCheck
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jstring token){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->constantValueCheck($<TIntermTyped*>(env _$ node), toChars(env, token));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1integerCheck
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jstring token){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->integerCheck($<TIntermTyped*>(env _$ node), toChars(env, token));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1globalCheck
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring token){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->globalCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, token));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1constructorError
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray node, jbyteArray function, jint op, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->constructorError(*$<TSourceLoc*>(env _$ loc), $<TIntermNode*>(env _$ node), *$<TFunction*>(env _$ function), $<TOperator>(op), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1constructorTextureSamplerError
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->constructorTextureSamplerError(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ function));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1arraySizeCheck
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray expr, jbyteArray size, jstring sizeType){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->arraySizeCheck(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ expr), *$<TArraySize*>(env _$ size), toChars(env, sizeType));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1arrayQualifierError
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->arrayQualifierError(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1arrayError
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->arrayError(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1arraySizeRequiredCheck
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray sizes){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->arraySizeRequiredCheck(*$<TSourceLoc*>(env _$ loc), *$<TArraySizes*>(env _$ sizes));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1structArrayCheck
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray structure){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->structArrayCheck(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ structure));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1arraySizesCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jbyteArray sizes, jbyteArray initializer, jboolean lastMember){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->arraySizesCheck(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), $<TArraySizes*>(env _$ sizes), $<TIntermTyped*>(env _$ initializer), lastMember);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1arrayOfArrayVersionCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray sizes){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->arrayOfArrayVersionCheck(*$<TSourceLoc*>(env _$ loc), $<TArraySizes*>(env _$ sizes));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1voidErrorCheck
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring s, jint t){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->voidErrorCheck(*$<TSourceLoc*>(env _$ loc), *toTString(env, s), $<TBasicType>(t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1boolCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->boolCheck(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1boolCheckType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->boolCheck(*$<TSourceLoc*>(env _$ loc), *$<TPublicType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1samplerCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jstring identifier, jbyteArray initializer){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->samplerCheck(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t), *toTString(env, identifier), $<TIntermTyped*>(env _$ initializer));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1atomicUintCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jstring identifier){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->atomicUintCheck(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t), *toTString(env, identifier));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1accStructCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jstring identifier){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->accStructCheck(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t), *toTString(env, identifier));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1transparentOpaqueCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jstring identifier){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->transparentOpaqueCheck(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t), *toTString(env, identifier));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1memberQualifierCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->memberQualifierCheck(*$<TPublicType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1globalQualifierFixCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->globalQualifierFixCheck(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1globalQualifierTypeCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->globalQualifierTypeCheck(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), *$<TPublicType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1structQualifierErrorCheck
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray pType){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return false;
	//FIXME: Throws unresolved reference error. Cannot find any .cpp-File that implements that function.
	//return $<TParseContext*>(env _$ ptr)->structQualifierErrorCheck(*$<TSourceLoc*>(env _$ loc), *$<TPublicType*>(env _$ pType));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1mergeQualifiers
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray dst, jbyteArray src, jboolean force){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->mergeQualifiers(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ dst), *$<TQualifier*>(env _$ src), force);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1setDefaultPrecision___3B_3B_3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jint p){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->setDefaultPrecision(*$<TSourceLoc*>(env _$ loc), *$<TPublicType*>(env _$ t), $<TPrecisionQualifier>(p));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TParseContext_1computeSamplerTypeIndex
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray sampler){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->computeSamplerTypeIndex(*$<TSampler*>(env _$ sampler));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TParseContext_1getDefaultPrecision___3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->getDefaultPrecision(*$<TPublicType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1precisionQualifierCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint t, jbyteArray qualifier){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->precisionQualifierCheck(*$<TSourceLoc*>(env _$ loc), $<TBasicType>(t), *$<TQualifier*>(env _$ qualifier));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1parameterTypeCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint qualifier, jbyteArray type){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->parameterTypeCheck(*$<TSourceLoc*>(env _$ loc), $<TStorageQualifier>(qualifier), *$<TType*>(env _$ type));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1containsFieldWithBasicType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray type, jint basicType){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->containsFieldWithBasicType(*$<TType*>(env _$ type), $<TBasicType>(basicType));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1redeclareBuiltinVariable
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring s, jbyteArray qualifier, jbyteArray shaderQualifiers){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->redeclareBuiltinVariable(*$<TSourceLoc*>(env _$ loc), *toTString(env, s), *$<TQualifier*>(env _$ qualifier), *$<TShaderQualifiers*>(env _$ shaderQualifiers));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1redeclareBuiltinBlock
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray typeList, jstring blockName, jstring instanceName, jbyteArray arraySizes){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->redeclareBuiltinBlock(*$<TSourceLoc*>(env _$ loc), *$<TTypeList*>(env _$ typeList), *toTString(env, blockName), toTString(env, instanceName), $<TArraySizes*>(env _$ arraySizes));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1paramCheckFixStorage
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint q, jbyteArray type){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->paramCheckFixStorage(*$<TSourceLoc*>(env _$ loc), $<TStorageQualifier>(q), *$<TType*>(env _$ type));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1paramCheckFix
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jbyteArray type){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->paramCheckFix(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), *$<TType*>(env _$ type));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1nestedBlockCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->nestedBlockCheck(*$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1nestedStructCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->nestedStructCheck(*$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1arrayObjectCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->arrayObjectCheck(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1opaqueCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->opaqueCheck(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1referenceCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->referenceCheck(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1storage16BitAssignmentCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->storage16BitAssignmentCheck(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1specializationCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->specializationCheck(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1structTypeCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->structTypeCheck(*$<TSourceLoc*>(env _$ loc), *$<TPublicType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1inductiveLoopCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray init, jbyteArray loop){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->inductiveLoopCheck(*$<TSourceLoc*>(env _$ loc), $<TIntermNode*>(env _$ init), $<TIntermLoop*>(env _$ loop));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1arrayLimitCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring s, jint size){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->arrayLimitCheck(*$<TSourceLoc*>(env _$ loc), *toTString(env, s), size);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1limitCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint value, jstring limit, jstring feature){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->limitCheck(*$<TSourceLoc*>(env _$ loc), value, toChars(env, limit), toChars(env, feature));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1inductiveLoopBodyCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jint loopIndexId, jbyteArray table){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->inductiveLoopBodyCheck($<TIntermNode*>(env _$ node), loopIndexId, *$<TSymbolTable*>(env _$ table));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1constantIndexExpressionCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->constantIndexExpressionCheck($<TIntermNode*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1setLayoutQualifier___3B_3B_3BLjava_lang_String_2
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jstring s){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->setLayoutQualifier(*$<TSourceLoc*>(env _$ loc), *$<TPublicType*>(env _$ qualifier), *toTString(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1setLayoutQualifier___3B_3B_3BLjava_lang_String_2_3B
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jstring s, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->setLayoutQualifier(*$<TSourceLoc*>(env _$ loc), *$<TPublicType*>(env _$ qualifier), *toTString(env, s), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1mergeObjectLayoutQualifiers
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray dst, jbyteArray src, jboolean inheritOnly){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->mergeObjectLayoutQualifiers(*$<TQualifier*>(env _$ dst), *$<TQualifier*>(env _$ src), inheritOnly);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1layoutObjectCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray s){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->layoutObjectCheck(*$<TSourceLoc*>(env _$ loc), *$<TSymbol*>(env _$ s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1layoutMemberLocationArrayCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jboolean memberWithLocation, jbyteArray arraySizes){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->layoutMemberLocationArrayCheck(*$<TSourceLoc*>(env _$ loc), memberWithLocation, $<TArraySizes*>(env _$ arraySizes));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1layoutTypeCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->layoutTypeCheck(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1layoutQualifierCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->layoutQualifierCheck(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1checkNoShaderLayouts
(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray shaderQualifiers){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	//FIXME: Throws unresolved reference error. Cannot find any .cpp-File that implements that function.
	//$<TParseContext*>(env _$ ptr)->checkNoShaderLayouts(*$<TSourceLoc*>(env _$ loc), *$<TShaderQualifiers*>(env _$ shaderQualifiers));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1fixOffset
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray s){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->fixOffset(*$<TSourceLoc*>(env _$ loc), *$<TSymbol*>(env _$ s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1findFunction
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray call, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	bool builtInPtr = builtIn;
	return env $_ $<TParseContext*>(env _$ ptr)->findFunction(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ call), builtInPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1findFunctionExact
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray call, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	bool builtInPtr = builtIn;
	return env $_ $<TParseContext*>(env _$ ptr)->findFunctionExact(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ call), builtInPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1findFunction120
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray call, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	bool builtInPtr = builtIn;
	return env $_ $<TParseContext*>(env _$ ptr)->findFunction120(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ call), builtInPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1findFunction400
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray call, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	bool builtInPtr = builtIn;
	return env $_ $<TParseContext*>(env _$ ptr)->findFunction400(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ call), builtInPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1findFunctionExplicitTypes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray call, jboolean builtIn){
	JNI_METHOD_GUARD_ENTER
	bool builtInPtr = builtIn;
	return env $_ $<TParseContext*>(env _$ ptr)->findFunctionExplicitTypes(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ call), builtInPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1declareTypeDefaults
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->declareTypeDefaults(*$<TSourceLoc*>(env _$ loc), *$<TPublicType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1declareVariable
(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring identifier, jbyteArray t, jbyteArray typeArray, jbyteArray initializer){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->declareVariable(*$<TSourceLoc*>(env _$ loc), *toTString(env, identifier), *$<TPublicType*>(env _$ t), $<TArraySizes*>(env _$ typeArray), $<TIntermTyped*>(env _$ initializer));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1addConstructor
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray node, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->addConstructor(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ node), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1constructAggregate
(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jbyteArray t, jint i, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->constructAggregate($<TIntermNode*>(env _$ node), *$<TType*>(env _$ t), i, *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1constructBuiltIn
(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray t, jint op, jbyteArray node, jbyteArray loc, jboolean subset){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->constructBuiltIn(*$<TType*>(env _$ t), $<TOperator>(op), $<TIntermTyped*>(env _$ node), *$<TSourceLoc*>(env _$ loc), subset);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1inheritMemoryQualifiers
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray from, jbyteArray to){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->inheritMemoryQualifiers(*$<TQualifier*>(env _$ from), *$<TQualifier*>(env _$ to));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1declareBlock
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray list, jstring instanceName, jbyteArray arraySizes){
	JNI_METHOD_GUARD_ENTER
	 $<TParseContext*>(env _$ ptr)->declareBlock(*$<TSourceLoc*>(env _$ loc), *$<TTypeList*>(env _$ list), toTString(env, instanceName), $<TArraySizes*>(env _$ arraySizes));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1blockStageIoCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->blockStageIoCheck(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1blockQualifierCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jboolean instanceName){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->blockQualifierCheck(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), instanceName);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1fixBlockLocations
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jbyteArray list, jboolean memberWithLocation, jboolean memberWithoutLocation){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->fixBlockLocations(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), *$<TTypeList*>(env _$ list), memberWithLocation, memberWithoutLocation);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1fixXfbOffsets
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray qualifier, jbyteArray list){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->fixXfbOffsets(*$<TQualifier*>(env _$ qualifier), *$<TTypeList*>(env _$ list));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1fixBlockUniformOffsets
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray qualifier, jbyteArray list){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->fixBlockUniformOffsets(*$<TQualifier*>(env _$ qualifier), *$<TTypeList*>(env _$ list));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1fixBlockUniformLayoutMatrix
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray qualifier, jbyteArray list0, jbyteArray list1){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->fixBlockUniformLayoutMatrix(*$<TQualifier*>(env _$ qualifier), $<TTypeList*>(env _$ list0), $<TTypeList*>(env _$ list1));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1fixBlockUniformLayoutPacking
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray qualifier, jbyteArray list0, jbyteArray list1){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->fixBlockUniformLayoutPacking(*$<TQualifier*>(env _$ qualifier), $<TTypeList*>(env _$ list0), $<TTypeList*>(env _$ list1));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1addQualifierToExisting___3B_3B_3BLjava_lang_String_2
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jstring identifier){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->addQualifierToExisting(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), *toTString(env, identifier));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1addQualifierToExisting___3B_3B_3B_3B
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jbyteArray list){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->addQualifierToExisting(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), *$<TIdentifierList*>(env _$ list));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1invariantCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->invariantCheck(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1updateStandaloneQualifierDefaults
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->updateStandaloneQualifierDefaults(*$<TSourceLoc*>(env _$ loc), *$<TPublicType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1wrapupSwitchSubsequence
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray statements, jbyteArray branchNode){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->wrapupSwitchSubsequence($<TIntermAggregate*>(env _$ statements), $<TIntermNode*>(env _$ branchNode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1addSwitch
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray expression, jbyteArray body){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->addSwitch(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ expression), $<TIntermAggregate*>(env _$ body));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1recordStructCopy
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray record, jbyteArray t0, jbyteArray t1){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->recordStructCopy(*$<TStructRecord*>(env _$ record), $<TType*>(env _$ t0), $<TType*>(env _$ t1));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TParseContext_1attributeFromName
	(JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->attributeFromName(*toTString(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1makeAttributes___3BLjava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring identifier){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->makeAttributes(*toTString(env, identifier));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1makeAttributes___3BLjava_lang_String_2_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring identifier, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->makeAttributes(*toTString(env, identifier), $<TIntermNode*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1mergeAttributes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray attr0, jbyteArray attr1){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->mergeAttributes($<TAttributes*>(env _$ attr0), $<TAttributes*>(env _$ attr1));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleSelectionAttributes
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray attributes, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->handleSelectionAttributes(*$<TAttributes*>(env _$ attributes), $<TIntermNode*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleSwitchAttributes
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray attributes, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->handleSwitchAttributes(*$<TAttributes*>(env _$ attributes), $<TIntermNode*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1handleLoopAttributes
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray attributes, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->handleLoopAttributes(*$<TAttributes*>(env _$ attributes), $<TIntermNode*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1checkAndResizeMeshViewDim
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jboolean isBlockMember){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->checkAndResizeMeshViewDim(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t), isBlockMember);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1setInMain
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->inMain = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1setBlockName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->blockName = toTString(env, v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1setCurrentBlockQualifier
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->currentBlockQualifier = *$<TQualifier*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1setDefaultPrecision___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jintArray v){
	JNI_METHOD_GUARD_ENTER
	if(env->GetArrayLength(v) > EbtNumTypes){
		setLastError(env, GLSLANG_ERROR_INVALID_LENGTH);
	}else{
		int* a = (int*) env->GetIntArrayElements(v, nullptr);
		memcpy($<TParseContext*>(env _$ ptr)->defaultPrecision, a, EbtNumTypes);
		env->ReleaseIntArrayElements(v, (jint*) a, JNI_ABORT);
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1setResources
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->resources = *$<TBuiltInResource *>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TParseContext_1setLimitsSetter
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TParseContext*>(env _$ ptr)->limits = *$<TLimits*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TParseContext_1getInMain
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TParseContext*>(env _$ ptr)->inMain;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TParseContext_1getBlockName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TParseContext*>(env _$ ptr)->blockName);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1getCurrentBlockQualifier
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->currentBlockQualifier;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jintArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1getDefaultPrecision___3B
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	jintArray ret = env->NewIntArray(EbtNumTypes);
	env->SetIntArrayRegion(ret, 0, EbtNumTypes, (jint*)$<TParseContext*>(env _$ ptr)->defaultPrecision);
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1getResources
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->resources;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TParseContext_1getLimits
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TParseContext*>(env _$ ptr)->limits;
	JNI_METHOD_GUARD_LEAVE
}
