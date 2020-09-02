#include <stdbool.h>
#include <stdio.h>
#include <stdint.h>
#include <stdlib.h>
#include <string.h>

#include <jni.h>

#define ENABLE_HLSL

#include <Java_Main.h>
#include <glslang/Public/ShaderLang.h>

#include <Utils.h>

JNIEXPORT jint JNICALL Java_Java_Main_ShInitialize
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return (jint) ShInitialize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_ShFinalize
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return (jint) ShFinalize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShBinding__Ljava_lang_String_2I
  (JNIEnv* env, jclass self, jstring name, jint binding){
	JNI_METHOD_GUARD_ENTER
	ShBinding* ret = Pool_malloc($<ShBinding*>(nullptr));
	ret->name = toChars(env, name);
	ret->binding = binding;
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShBinding__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<ShBinding*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_ShBinding_1setName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	$<ShBinding*>(env _$ ptr)->name = toChars(env, name);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_ShBinding_1setBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jint binding){
	JNI_METHOD_GUARD_ENTER
	$<ShBinding*>(env _$ ptr)->binding = binding;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_Java_Main_ShBinding_1getName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<ShBinding*>(env _$ ptr)->name);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_ShBinding_1getBinding
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<ShBinding*>(env _$ ptr)->binding;
	JNI_METHOD_GUARD_LEAVE
}


JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShBindingTable__I_3B
  (JNIEnv* env, jclass self, jint numBindings, jbyteArray bindings){
	JNI_METHOD_GUARD_ENTER
	ShBindingTable* bindingTable = Pool_malloc($<ShBindingTable*>(nullptr));
	bindingTable->numBindings = (int) numBindings;
	bindingTable->bindings =static_cast<ShBinding*>(byteArrayToPointer(env, bindings));
	return pointerToByteArray(env, bindingTable);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShBindingTable__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<ShBindingTable*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_ShBindingTable_1setNumBindings
  (JNIEnv* env, jclass self, jbyteArray ptr, jint numBindings){
	JNI_METHOD_GUARD_ENTER
	$<ShBindingTable*>(env _$ ptr)->numBindings = numBindings;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_ShBindingTable_1setBindings
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray bindings){
	JNI_METHOD_GUARD_ENTER
	$<ShBindingTable*>(env _$ ptr)->bindings = $<ShBinding*>(env _$ bindings);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_ShBindingTable_1getNumBindings
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<ShBindingTable*>(env _$ ptr)->numBindings;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShBindingTable_1getBindings
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<ShBindingTable*>(env _$ ptr)->bindings;
	JNI_METHOD_GUARD_LEAVE
}


JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShConstructCompiler
  (JNIEnv* env, jclass self, jint language, jint debugOptions){
	JNI_METHOD_GUARD_ENTER
	return pointerToByteArray(env, ShConstructCompiler(static_cast<EShLanguage>((int) language), (int) debugOptions));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShConstructLinker
  (JNIEnv* env, jclass self, jint execute, jint debugOptions){
	JNI_METHOD_GUARD_ENTER
	return env $_ ShConstructLinker(static_cast<EShExecutable>((int) execute), (int) debugOptions);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShConstructUniformMap
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return pointerToByteArray(env, ShConstructUniformMap());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_ShDestruct
  (JNIEnv* env, jclass self, jbyteArray handle){
	JNI_METHOD_GUARD_ENTER
	ShDestruct(byteArrayToPointer(env, handle));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TBuiltInResource__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TBuiltInResource*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TBuiltInResource___3I_3B
  (JNIEnv* env, jclass self, jintArray values, jbyteArray limits){
	JNI_METHOD_GUARD_ENTER
	struct TLimits* limitsRet = (struct TLimits*) byteArrayToPointer(env, limits);
	struct TBuiltInResource* data = Pool_malloc($<TBuiltInResource*>(nullptr));
	int length = (int) (env)->GetArrayLength(values);
	if(length != 93){
		setLastError(env, GLSLANG_ERROR_INVALID_LENGTH);
		return pointerToByteArray(env, nullptr);
	}
	int* fetchedArray = (int*) (env)->GetIntArrayElements(values, nullptr);
	int* fetchedArraySaved = fetchedArray;
	data->maxLights = *(fetchedArray++);
	data->maxClipPlanes = *(fetchedArray++);
	data->maxTextureUnits = *(fetchedArray++);
	data->maxTextureCoords = *(fetchedArray++);
	data->maxVertexAttribs = *(fetchedArray++);
	data->maxVertexUniformComponents = *(fetchedArray++);
	data->maxVaryingFloats = *(fetchedArray++);
	data->maxVertexTextureImageUnits = *(fetchedArray++);
	data->maxCombinedTextureImageUnits = *(fetchedArray++);
	data->maxTextureImageUnits = *(fetchedArray++);
	data->maxFragmentUniformComponents = *(fetchedArray++);
	data->maxDrawBuffers = *(fetchedArray++);
	data->maxVertexUniformVectors = *(fetchedArray++);
	data->maxVaryingVectors = *(fetchedArray++);
	data->maxFragmentUniformVectors = *(fetchedArray++);
	data->maxVertexOutputVectors = *(fetchedArray++);
	data->maxFragmentInputVectors = *(fetchedArray++);
	data->minProgramTexelOffset = *(fetchedArray++);
	data->maxProgramTexelOffset = *(fetchedArray++);
	data->maxClipDistances = *(fetchedArray++);
	data->maxComputeWorkGroupCountX = *(fetchedArray++);
	data->maxComputeWorkGroupCountY = *(fetchedArray++);
	data->maxComputeWorkGroupCountZ = *(fetchedArray++);
	data->maxComputeWorkGroupSizeX = *(fetchedArray++);
	data->maxComputeWorkGroupSizeY = *(fetchedArray++);
	data->maxComputeWorkGroupSizeZ = *(fetchedArray++);
	data->maxComputeUniformComponents = *(fetchedArray++);
	data->maxComputeTextureImageUnits = *(fetchedArray++);
	data->maxComputeImageUniforms = *(fetchedArray++);
	data->maxComputeAtomicCounters = *(fetchedArray++);
	data->maxComputeAtomicCounterBuffers = *(fetchedArray++);
	data->maxVaryingComponents = *(fetchedArray++);
	data->maxVertexOutputComponents = *(fetchedArray++);
	data->maxGeometryInputComponents = *(fetchedArray++);
	data->maxGeometryOutputComponents = *(fetchedArray++);
	data->maxFragmentInputComponents = *(fetchedArray++);
	data->maxImageUnits = *(fetchedArray++);
	data->maxCombinedImageUnitsAndFragmentOutputs = *(fetchedArray++);
	data->maxCombinedShaderOutputResources = *(fetchedArray++);
	data->maxImageSamples = *(fetchedArray++);
	data->maxVertexImageUniforms = *(fetchedArray++);
	data->maxTessControlImageUniforms = *(fetchedArray++);
	data->maxTessEvaluationImageUniforms =*(fetchedArray++);
	data->maxGeometryImageUniforms = *(fetchedArray++);
	data->maxFragmentImageUniforms = *(fetchedArray++);
	data->maxCombinedImageUniforms = *(fetchedArray++);
	data->maxGeometryTextureImageUnits = *(fetchedArray++);
	data->maxGeometryOutputVertices = *(fetchedArray++);
	data->maxGeometryTotalOutputComponents = *(fetchedArray++);
	data->maxGeometryUniformComponents = *(fetchedArray++);
	data->maxGeometryVaryingComponents = *(fetchedArray++);
	data->maxTessControlInputComponents = *(fetchedArray++);
	data->maxTessControlOutputComponents = *(fetchedArray++);
	data->maxTessControlTextureImageUnits = *(fetchedArray++);
	data->maxTessControlUniformComponents = *(fetchedArray++);
	data->maxTessControlTotalOutputComponents = *(fetchedArray++);
	data->maxTessEvaluationInputComponents = *(fetchedArray++);
	data->maxTessEvaluationOutputComponents = *(fetchedArray++);
	data->maxTessEvaluationTextureImageUnits = *(fetchedArray++);
	data->maxTessEvaluationUniformComponents = *(fetchedArray++);
	data->maxTessPatchComponents = *(fetchedArray++);
	data->maxPatchVertices = *(fetchedArray++);
	data->maxTessGenLevel = *(fetchedArray++);
	data->maxViewports = *(fetchedArray++);
	data->maxVertexAtomicCounters = *(fetchedArray++);
	data->maxTessControlAtomicCounters = *(fetchedArray++);
	data->maxTessEvaluationAtomicCounters = *(fetchedArray++);
	data->maxGeometryAtomicCounters = *(fetchedArray++);
	data->maxFragmentAtomicCounters = *(fetchedArray++);
	data->maxCombinedAtomicCounters = *(fetchedArray++);
	data->maxAtomicCounterBindings = *(fetchedArray++);
	data->maxVertexAtomicCounterBuffers = *(fetchedArray++);
	data->maxTessControlAtomicCounterBuffers = *(fetchedArray++);
	data->maxTessEvaluationAtomicCounterBuffers = *(fetchedArray++);
	data->maxGeometryAtomicCounterBuffers = *(fetchedArray++);
	data->maxFragmentAtomicCounterBuffers = *(fetchedArray++);
	data->maxCombinedAtomicCounterBuffers = *(fetchedArray++);
	data->maxAtomicCounterBufferSize = *(fetchedArray++);
	data->maxTransformFeedbackBuffers = *(fetchedArray++);
	data->maxTransformFeedbackInterleavedComponents = *(fetchedArray++);
	data->maxCullDistances = *(fetchedArray++);
	data->maxCombinedClipAndCullDistances = *(fetchedArray++);
	data->maxSamples = *(fetchedArray++);
	data->maxMeshOutputVerticesNV = *(fetchedArray++);
	data->maxMeshOutputPrimitivesNV = *(fetchedArray++);
	data->maxMeshWorkGroupSizeX_NV = *(fetchedArray++);
	data->maxMeshWorkGroupSizeY_NV = *(fetchedArray++);
	data->maxMeshWorkGroupSizeZ_NV = *(fetchedArray++);
	data->maxTaskWorkGroupSizeX_NV = *(fetchedArray++);
	data->maxTaskWorkGroupSizeY_NV = *(fetchedArray++);
	data->maxTaskWorkGroupSizeZ_NV = *(fetchedArray++);
	data->maxMeshViewCountNV = *(fetchedArray++);
	data->maxDualSourceDrawBuffersEXT = *(fetchedArray++);
	fetchedArray = fetchedArraySaved;
	(env)->ReleaseIntArrayElements(values, (jint*) fetchedArray, JNI_ABORT);
	data->limits = *limitsRet;
	return pointerToByteArray(env, data);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TLimits__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TLimits*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TLimits___3Z
  (JNIEnv* env, jclass self, jbooleanArray values){
	JNI_METHOD_GUARD_ENTER
	struct TLimits* data = Pool_malloc($<TLimits*>(nullptr));
	int length = (int) (env)->GetArrayLength(values);
	if(length != 9){
		setLastError(env, GLSLANG_ERROR_INVALID_LENGTH);
		return pointerToByteArray(env, nullptr);
	}
	bool* fetchedArray = (bool*) (env)->GetBooleanArrayElements(values, nullptr);
	bool* fetchedArraySaved = fetchedArray;
	data->nonInductiveForLoops = *(fetchedArray++);
	data->whileLoops = *(fetchedArray++);
	data->doWhileLoops = *(fetchedArray++);
	data->generalUniformIndexing = *(fetchedArray++);
	data->generalAttributeMatrixVectorIndexing = *(fetchedArray++);
	data->generalVaryingIndexing = *(fetchedArray++);
	data->generalSamplerIndexing = *(fetchedArray++);
	data->generalVariableIndexing = *(fetchedArray++);
	data->generalConstantMatrixVectorIndexing = *(fetchedArray++);
	fetchedArray = fetchedArraySaved;
	(env)->ReleaseBooleanArrayElements(values, (jboolean*) fetchedArray, JNI_ABORT);
	return pointerToByteArray(env, data);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_ShCompile
  (JNIEnv* env, jclass self, jbyteArray handle, jobjectArray shaderStrings, jint numStrings, jint optimizationLevel, jbyteArray resources, jint debugOptions, jint defaultVersion, jboolean forwardCompatible, jint messages){
	JNI_METHOD_GUARD_ENTER
	char** shaderStringsRetMutable = new char*[numStrings];
	int* lengths = new int[numStrings];
	for(unsigned int i=0;i<(unsigned int)(int) numStrings;++i){
		jobject fetchedShaderString = (env)->GetObjectArrayElement(shaderStrings, i);
		char* shaderStringRef = (char*) (env)->GetStringUTFChars(static_cast<jstring>(fetchedShaderString), nullptr);
		int length = (int) (env)->GetStringUTFLength(static_cast<jstring>(fetchedShaderString));
		char* shaderString = new char[length];
		shaderString = strncpy(shaderString, shaderStringRef, length);
		(env)->ReleaseStringUTFChars(static_cast<jstring>(fetchedShaderString), shaderStringRef);
		shaderStringsRetMutable[i] = shaderString;
		lengths[i] = length;
	}
	const char* const* shaderStringsRet = static_cast<const char* const*>(shaderStringsRetMutable);
	jint ret = (jint) ShCompile(
			byteArrayToPointer(env, handle),
				shaderStringsRet,
				(int) numStrings,
				lengths,
				static_cast<EShOptimizationLevel>((int) optimizationLevel),
				static_cast<TBuiltInResource*>(byteArrayToPointer(env, resources)),
				(int) debugOptions,
				(int) defaultVersion,
				(bool) forwardCompatible,
				static_cast<EShMessages>((int) messages)
			);
	for(int i=0;i<(int) numStrings;++i){
		delete shaderStringsRetMutable[i];
	}
	delete ((char**)shaderStringsRetMutable);
	delete lengths;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_ShLinkExt
  (JNIEnv* env, jclass self, jbyteArray handle, jbyteArray h, jint numHandles){
	JNI_METHOD_GUARD_ENTER
	const ShHandle* hPtr = &((*static_cast<std::vector<void*>*>(env _$ h))[0]);
	return (jint) ShLinkExt(env _$ handle, $<const ShHandle*>(hPtr), (int) numHandles);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_Java_Main_ShSetEncryptionMethod
  (JNIEnv* env, jclass self, jbyteArray handle){
	JNI_METHOD_GUARD_ENTER
	ShSetEncryptionMethod(byteArrayToPointer(env, handle));
	JNI_METHOD_GUARD_LEAVE}

JNIEXPORT jstring JNICALL Java_Java_Main_ShGetInfoLog
  (JNIEnv* env, jclass self, jbyteArray handle){
	JNI_METHOD_GUARD_ENTER
	const char* ret = ShGetInfoLog(byteArrayToPointer(env, handle));
	if(ret == nullptr){
		return NULL;
	}
	char* retCpy = new char[strlen(ret)+1];

	retCpy = strcpy(retCpy, ret);
	jstring retStr = (env)->NewStringUTF(retCpy);
	delete retCpy;
	return retStr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShGetExecutable
  (JNIEnv* env, jclass self, jbyteArray handle){
	JNI_METHOD_GUARD_ENTER
	return pointerToByteArray(env, ShGetExecutable(byteArrayToPointer(env, handle)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_ShSetVirtualAttributeBindings
  (JNIEnv* env, jclass self, jbyteArray handle, jbyteArray bindingTable){
	JNI_METHOD_GUARD_ENTER
	return (jint) ShSetVirtualAttributeBindings(byteArrayToPointer(env, handle), static_cast<ShBindingTable*>(byteArrayToPointer(env, bindingTable)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_ShSetFixedAttributeBindings
  (JNIEnv* env, jclass self, jbyteArray handle, jbyteArray bindingTable){
	JNI_METHOD_GUARD_ENTER
	return (jint) ShSetFixedAttributeBindings(byteArrayToPointer(env, handle), static_cast<ShBindingTable*>(byteArrayToPointer(env, bindingTable)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_ShExcludeAttributes
  (JNIEnv* env, jclass self, jbyteArray handle, jintArray attributes, jint count){
	JNI_METHOD_GUARD_ENTER
	int* fetchedAttributes = (int*) (env)->GetIntArrayElements(attributes, nullptr);
	jint ret =  (jint) ShExcludeAttributes(byteArrayToPointer(env, handle), fetchedAttributes, (int) count);
	(env)->ReleaseIntArrayElements(attributes, (jint*) fetchedAttributes, JNI_ABORT);
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_Java_Main_ShGetUniformLocation
  (JNIEnv* env, jclass self, jbyteArray handle, jstring name){
	JNI_METHOD_GUARD_ENTER
	char* nameRef = (char*) (env)->GetStringUTFChars(name, nullptr);
	int length = (int) (env)->GetStringLength(name);
	char* nameRet = new char[length];
	if(nameRet == nullptr){
		perror("calloc");
		exit(-1);
	}
	nameRet = strncpy(nameRet, nameRef, length);
	(env)->ReleaseStringUTFChars(name, nameRef);
	jint ret = (jint) ShGetUniformLocation(byteArrayToPointer(env, handle), nameRet);
	delete nameRet;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}
