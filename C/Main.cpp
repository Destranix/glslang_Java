#include <stdbool.h>
#include <stdio.h>
#include <stdint.h>
#include <stdlib.h>
#include <string.h>

#include <jni.h>

#include <Java_Main.h>
#include <glslang/Public/ShaderLang.h>

static void* byteArrayToPointer(JNIEnv* env, jbyteArray array){
	void* p = NULL;
	if (array != NULL) {
		env->GetByteArrayRegion(array,0,sizeof(void*),(jbyte*)&p);
	}
	return p;
}

static jbyteArray pointerToByteArray(JNIEnv* env, const void* ptr){
	jbyteArray arr = env->NewByteArray(sizeof(void*));
	env->SetByteArrayRegion(arr,0,sizeof(void*),(jbyte*)&ptr);
	return arr;
}

JNIEXPORT jint JNICALL Java_Java_Main_ShInitialize
  (JNIEnv* env, jclass self){
	return (jint) ShInitialize();
}

JNIEXPORT jint JNICALL Java_Java_Main_ShFinalize
  (JNIEnv* env, jclass self){
	return (jint) ShFinalize();
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShBinding
  (JNIEnv* env, jclass self, jbyteArray name, jint binding){
	ShBinding* bindingRet = reinterpret_cast<ShBinding*>(malloc(sizeof(ShBinding)));
	if(bindingRet == NULL){
		perror("malloc");
		exit(-1);
	}
	bindingRet->name = reinterpret_cast<const char*>(byteArrayToPointer(env, name));
	bindingRet->binding = (int) binding;
	return pointerToByteArray(env, bindingRet);
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShBindingTable
  (JNIEnv* env, jclass self, jint numBindings, jbyteArray bindings){
	ShBindingTable* bindingTable = reinterpret_cast<ShBindingTable*>(malloc(sizeof(ShBindingTable)));
	if(bindingTable == NULL){
		perror("malloc");
		exit(-1);
	}
	bindingTable->numBindings = (int) numBindings;
	bindingTable->bindings =reinterpret_cast<ShBinding*>(byteArrayToPointer(env, bindings));
	return pointerToByteArray(env, bindingTable);
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShConstructCompiler
  (JNIEnv* env, jclass self, jint language, jint debugOptions){
	return pointerToByteArray(env, ShConstructCompiler(static_cast<EShLanguage>((int) language), (int) debugOptions));
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShConstructLinker
  (JNIEnv* env, jclass self, jint execute, jint debugOptions){
	return pointerToByteArray(env, ShConstructLinker(static_cast<EShExecutable>((int) execute), (int) debugOptions));
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShConstructUniformMap
  (JNIEnv* env, jclass self){
	return pointerToByteArray(env, ShConstructUniformMap());
}

JNIEXPORT void JNICALL Java_Java_Main_ShDestruct
  (JNIEnv* env, jclass self, jbyteArray handle){
	ShDestruct(byteArrayToPointer(env, handle));
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TBuiltInResource
  (JNIEnv* env, jclass self, jintArray values, jbyteArray limits){
	struct TLimits* limitsRet = (struct TLimits*) byteArrayToPointer(env, limits);
	struct TBuiltInResource* data = reinterpret_cast<TBuiltInResource*>(malloc(sizeof(struct TBuiltInResource)));
	if(data == NULL){
		perror("malloc");
		exit(-1);
	}
	int length = (int) (env)->GetArrayLength(values);
	if(length != 93){
		return pointerToByteArray(env, NULL);
	}
	int* fetchedArray = (int*) (env)->GetIntArrayElements(values, NULL);
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
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_TLimits
  (JNIEnv* env, jclass self, jbooleanArray values){
	struct TLimits* data = reinterpret_cast<TLimits*>(malloc(sizeof(struct TLimits)));
	if(data == NULL){
		perror("malloc");
		exit(-1);
	}
	int length = (int) (env)->GetArrayLength(values);
	if(length != 9){
		return pointerToByteArray(env, NULL);
	}
	bool* fetchedArray = (bool*) (env)->GetBooleanArrayElements(values, NULL);
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
}

JNIEXPORT jint JNICALL Java_Java_Main_ShCompile
  (JNIEnv* env, jclass self, jbyteArray handle, jobjectArray shaderStrings, jint numStrings, jint optimizationLevel, jbyteArray resources, jint debugOptions, jint defaultVersion, jboolean forwardCompatible, jint messages){
	char** shaderStringsRetMutable = reinterpret_cast<char**>(calloc((int) numStrings, sizeof(char*)));
	if(shaderStringsRetMutable == NULL){
		perror("calloc");
		exit(-1);
	}
	int* lengths = reinterpret_cast<int*>(calloc((int) numStrings, sizeof(int)));
	if(lengths == NULL){
		perror("calloc");
		exit(-1);
	}
	for(unsigned int i=0;i<(unsigned int)(int) numStrings;++i){
		jobject fetchedShaderString = (env)->GetObjectArrayElement(shaderStrings, i);
		char* shaderStringRef = (char*) (env)->GetStringUTFChars(reinterpret_cast<jstring>(fetchedShaderString), NULL);
		int length = (int) (env)->GetStringUTFLength(reinterpret_cast<jstring>(fetchedShaderString));
		char* shaderString = reinterpret_cast<char*>(calloc(length, sizeof(char)));
		if(shaderString == NULL){
			perror("calloc");
			exit(-1);
		}
		shaderString = strncpy(shaderString, shaderStringRef, length);
		(env)->ReleaseStringUTFChars(reinterpret_cast<jstring>(fetchedShaderString), shaderStringRef);
		shaderStringsRetMutable[i] = shaderString;
		lengths[i] = length;
	}
	const char* const* shaderStringsRet = reinterpret_cast<const char* const*>(shaderStringsRetMutable);
	jint ret = (jint) ShCompile(
			byteArrayToPointer(env, handle),
				shaderStringsRet,
				(int) numStrings,
				lengths,
				static_cast<EShOptimizationLevel>((int) optimizationLevel),
				reinterpret_cast<TBuiltInResource*>(byteArrayToPointer(env, resources)),
				(int) debugOptions,
				(int) defaultVersion,
				(bool) forwardCompatible,
				static_cast<EShMessages>((int) messages)
			);
	for(int i=0;i<(int) numStrings;++i){
		free(shaderStringsRetMutable[i]);
	}
	free((char**)shaderStringsRetMutable);
	free(lengths);
	return ret;
}

JNIEXPORT jint JNICALL Java_Java_Main_ShLinkExt
  (JNIEnv* env, jclass self, jbyteArray handle, jbyteArray h, jint numHandles){
	return (jint) ShLinkExt(byteArrayToPointer(env, handle), reinterpret_cast<void* const*>(byteArrayToPointer(env, h)), (int) numHandles);
}

JNIEXPORT void JNICALL Java_Java_Main_ShSetEncryptionMethod
  (JNIEnv* env, jclass self, jbyteArray handle){
	ShSetEncryptionMethod(byteArrayToPointer(env, handle));
}

JNIEXPORT jstring JNICALL Java_Java_Main_ShGetInfoLog
  (JNIEnv* env, jclass self, jbyteArray handle){
	const char* ret = ShGetInfoLog(byteArrayToPointer(env, handle));
	if(ret == NULL){
		return NULL;
	}
	char* retCpy = reinterpret_cast<char*>(calloc(strlen(ret), sizeof(char)));
	if(retCpy == NULL){
		perror("calloc");
		exit(-1);
	}
	retCpy = strcpy(retCpy, ret);
	jstring retStr = (env)->NewStringUTF(retCpy);
	free(retCpy);
	return retStr;
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_ShGetExecutable
  (JNIEnv* env, jclass self, jbyteArray handle){
	return pointerToByteArray(env, ShGetExecutable(byteArrayToPointer(env, handle)));
}

JNIEXPORT jint JNICALL Java_Java_Main_ShSetVirtualAttributeBindings
  (JNIEnv* env, jclass self, jbyteArray handle, jbyteArray bindingTable){
	return (jint) ShSetVirtualAttributeBindings(byteArrayToPointer(env, handle), reinterpret_cast<ShBindingTable*>(byteArrayToPointer(env, bindingTable)));
}

JNIEXPORT jint JNICALL Java_Java_Main_ShSetFixedAttributeBindings
  (JNIEnv* env, jclass self, jbyteArray handle, jbyteArray bindingTable){
	return (jint) ShSetFixedAttributeBindings(byteArrayToPointer(env, handle), reinterpret_cast<ShBindingTable*>(byteArrayToPointer(env, bindingTable)));
}

JNIEXPORT jint JNICALL Java_Java_Main_ShExcludeAttributes
  (JNIEnv* env, jclass self, jbyteArray handle, jintArray attributes, jint count){
	int* fetchedAttributes = (int*) (env)->GetIntArrayElements(attributes, NULL);
	jint ret =  (jint) ShExcludeAttributes(byteArrayToPointer(env, handle), fetchedAttributes, (int) count);
	(env)->ReleaseIntArrayElements(attributes, (jint*) fetchedAttributes, JNI_ABORT);
	return ret;
}

JNIEXPORT jint JNICALL Java_Java_Main_ShGetUniformLocation
  (JNIEnv* env, jclass self, jbyteArray handle, jstring name){
	char* nameRef = (char*) (env)->GetStringUTFChars(name, NULL);
	int length = (int) (env)->GetStringLength(name);
	char* nameRet = reinterpret_cast<char*>(calloc(length, sizeof(char)));
	if(nameRet == NULL){
		perror("calloc");
		exit(-1);
	}
	nameRet = strncpy(nameRet, nameRef, length);
	(env)->ReleaseStringUTFChars(name, nameRef);
	jint ret = (jint) ShGetUniformLocation(byteArrayToPointer(env, handle), nameRet);
	free(nameRet);
	return ret;
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_allocString
  (JNIEnv* env, jclass self, jstring str){
	char* strRef = (char*) (env)->GetStringUTFChars(str, NULL);
	int length = (int) (env)->GetStringLength(str);
	char* strRet = reinterpret_cast<char*>(calloc(length, sizeof(char)));
	if(strRet == NULL){
		perror("calloc");
		exit(-1);
	}
	strRet = strncpy(strRet, strRef, length);
	(env)->ReleaseStringUTFChars(str, strRef);
	return pointerToByteArray(env, strRet);
}

JNIEXPORT jbyteArray JNICALL Java_Java_Main_createArray
  (JNIEnv* env, jclass self, jobjectArray pointers){
	int length = (env)->GetArrayLength(pointers);
	void** ret = reinterpret_cast<void**>(calloc(length, sizeof(void*)));
	if(ret == NULL){
		perror("calloc");
		exit(-1);
	}
	for(unsigned int i=0;i<(unsigned int)(int) length;++i){
		jobject fetchedPointer = (env)->GetObjectArrayElement(pointers, i);
		ret[i] = byteArrayToPointer(env, reinterpret_cast<jbyteArray>(fetchedPointer));
	}
	return pointerToByteArray(env, ret);
}

JNIEXPORT void JNICALL Java_Java_Main_free
  (JNIEnv* env, jclass self, jbyteArray pointer){
	void* ptr = byteArrayToPointer(env, pointer);
	free(ptr);
}
