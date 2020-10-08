#include <stdbool.h>
#include <stdio.h>
#include <stdint.h>
#include <stdlib.h>
#include <string.h>

#include <jni.h>

#define ENABLE_HLSL
#define ENABLE_OPT
#define SPV_ENABLE_UTILITY_CODE

#ifdef LINUX
	#pragma GCC diagnostic push
	#pragma GCC diagnostic ignored "-Wpedantic"
	#pragma GCC diagnostic ignored "-Woverflow"
#endif

#include <com_destranix_glslang_Main.h>
#include <glslang/Public/ShaderLang.h>
#include <glslang/Include/ShHandle.h>
#include <glslang/Include/BaseTypes.h>
#include <glslang/Include/Types.h>
#include <glslang/Include/InitializeGlobals.h>
#include <glslang/MachineIndependent/RemoveTree.h>
#include <glslang/MachineIndependent/propagateNoContraction.h>
#include <glslang/Include/arrays.h>
#include <glslang/MachineIndependent/Versions.h>
#include <glslang/MachineIndependent/localintermediate.h>
#include <glslang/SPIRV/GlslangToSpv.h>
#include <glslang/SPIRV/NonSemanticDebugPrintf.h>
#include <glslang/SPIRV/SpvTools.h>
#include <glslang/SPIRV/bitutils.h>
#include <glslang/SPIRV/disassemble.h>
#include <glslang/SPIRV/doc.h>
#include <glslang/SPIRV/spirv.hpp>
#include <glslang/SPIRV/spvIR.h>

#ifdef LINUX
	#pragma GCC diagnostic pop
#endif

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_GetVersion
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ glslang::GetVersion();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_GetEsslVersionString
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return toString(env, GetEsslVersionString());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_GetGlslVersionString
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return toString(env, GetGlslVersionString());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_GetKhronosToolId
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return (jint) GetKhronosToolId();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_InitializeProcess
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return (jboolean) InitializeProcess();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_FinalizeProcess
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	FinalizeProcess();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_ConstructCompiler
  (JNIEnv* env, jclass self, jint language, jint i){
	JNI_METHOD_GUARD_ENTER
	return env $_ ConstructCompiler($<EShLanguage>(language), i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_ConstructLinker
  (JNIEnv* env, jclass self, jint executable, jint i){
	JNI_METHOD_GUARD_ENTER
	return env $_ ConstructLinker($<EShExecutable>(executable), i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_ConstructBindings
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ ConstructBindings();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_DeleteLinker
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	DeleteLinker($<TShHandleBase*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_DeleteBindingList
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	DeleteBindingList($<TShHandleBase*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_ConstructUniformMap
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ ConstructUniformMap();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_DeleteCompiler
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	DeleteCompiler($<TCompiler*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_DeleteUniformMap
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	DeleteUniformMap($<TUniformMap*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_GetStorageQualifierString
  (JNIEnv* env, jclass self, jint i){
	JNI_METHOD_GUARD_ENTER
	return toString(env, GetStorageQualifierString($<TStorageQualifier>(i)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_GetPrecisionQualifierString
  (JNIEnv* env, jclass self, jint i){
	JNI_METHOD_GUARD_ENTER
	return toString(env, GetPrecisionQualifierString($<TPrecisionQualifier>(i)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_GetBuiltInVariableString
  (JNIEnv* env, jclass self, jint i){
	JNI_METHOD_GUARD_ENTER
	return toString(env, GetBuiltInVariableString($<TBuiltInVariable>(i)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_isTypeSignedInt
  (JNIEnv* env, jclass self, jint i){
	JNI_METHOD_GUARD_ENTER
	return isTypeSignedInt($<TBasicType>(i));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_isTypeUnsignedInt
  (JNIEnv* env, jclass self, jint i){
	JNI_METHOD_GUARD_ENTER
	return isTypeUnsignedInt($<TBasicType>(i));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_isTypeInt
  (JNIEnv* env, jclass self, jint i){
	JNI_METHOD_GUARD_ENTER
	return isTypeInt($<TBasicType>(i));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_isTypeFloat
  (JNIEnv* env, jclass self, jint i){
	JNI_METHOD_GUARD_ENTER
	return isTypeFloat($<TBasicType>(i));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_getTypeRank
  (JNIEnv* env, jclass self, jint i){
	JNI_METHOD_GUARD_ENTER
	return getTypeRank($<TBasicType>(i));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_GetThreadPoolAllocator
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ GetThreadPoolAllocator();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SetThreadPoolAllocator
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	SetThreadPoolAllocator($<TPoolAllocator*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_IsAnonymous
  (JNIEnv* env, jclass self, jstring s){
	JNI_METHOD_GUARD_ENTER
	return IsAnonymous(*toTString(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_RemoveAllTreeNodes
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	RemoveAllTreeNodes($<TIntermNode*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_PropagateNoContraction
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	PropagateNoContraction(*$<TIntermediate*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_SameSpecializationConstants
  (JNIEnv* env, jclass self, jbyteArray t0, jbyteArray t1){
	JNI_METHOD_GUARD_ENTER
	return SameSpecializationConstants($<TIntermTyped*>(env _$ t0), $<TIntermTyped*>(env _$ t1));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_ProfileName
  (JNIEnv* env, jclass self, jint i){
	JNI_METHOD_GUARD_ENTER
	return toString(env, ProfileName($<EProfile>(i)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Min
  (JNIEnv* env, jclass self, jbyteArray t0, jbyteArray t1, jlong classIdentifier){
	JNI_METHOD_GUARD_ENTER
	return env $_ Min(env _$ t0, env _$ t1);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Max
  (JNIEnv* env, jclass self, jbyteArray t0, jbyteArray t1, jlong classIdentifier){
	JNI_METHOD_GUARD_ENTER
	return env $_ Max(env _$ t0, env _$ t1);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_String
  (JNIEnv* env, jclass self, jint i, jint base){
	JNI_METHOD_GUARD_ENTER
	TString tmp = String(i, base);
	return toString(env, &tmp);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPragmaTable_1IsPow2
	(JNIEnv* env, jclass self, jbyteArray powerOf2){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return false;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPragmaTable_1RoundToPow2
	(JNIEnv* env, jclass self, jbyteArray number, jint powerOf2){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPragmaTable_1IsMultipleOfPow2
	(JNIEnv* env, jclass self, jbyteArray number, jint powerOf2){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return false;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_GetSpirvVersion
  (JNIEnv* env, jclass self, jobjectArray s){
	JNI_METHOD_GUARD_ENTER
	std::string sRef;
	GetSpirvVersion(sRef);
	jstring sRet = toString(env, sRef);
	env->SetObjectArrayElement(s, 0, (jobject) sRet);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_GetSpirvGeneratorVersion
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return GetSpirvGeneratorVersion();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_GlslangToSpv___3B_3_3J_3B
  (JNIEnv* env, jclass self, jbyteArray intermediate, jobjectArray spirv, jbyteArray options){
	JNI_METHOD_GUARD_ENTER
	std::vector<unsigned int> spirvRef;
	GlslangToSpv(*$<TIntermediate*>(env _$ intermediate), spirvRef, $<SpvOptions*>(env _$ options));
	jlongArray spirvRet = env->NewLongArray(spirvRef.size());
	std::vector<jlong>* spirvRefCpy = toJlongVector(&(spirvRef[0]), spirvRef.size());
	env->SetLongArrayRegion(spirvRet, 0, spirvRef.size(), (jlong*) &((*spirvRefCpy)[0]));
	delete spirvRefCpy;
	env->SetObjectArrayElement(spirv, 0, (jobject) spirvRet);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_GlslangToSpv___3B_3_3J_3B_3B
  (JNIEnv* env, jclass self, jbyteArray intermediate, jobjectArray spirv, jbyteArray logger, jbyteArray options){
	JNI_METHOD_GUARD_ENTER
	std::vector<unsigned int> spirvRef;
	GlslangToSpv(*$<TIntermediate*>(env _$ intermediate), spirvRef, $<spv::SpvBuildLogger*>(env _$ logger), $<SpvOptions*>(env _$ options));
	jlongArray spirvRet = env->NewLongArray(spirvRef.size());
	std::vector<jlong>* spirvRefCpy = toJlongVector(&(spirvRef[0]), spirvRef.size());
	env->SetLongArrayRegion(spirvRet, 0, spirvRef.size(), (jlong*) &((*spirvRefCpy)[0]));
	delete spirvRefCpy;
	env->SetObjectArrayElement(spirv, 0, (jobject) spirvRet);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_OutputSpvBin
  (JNIEnv* env, jclass self, jlongArray spirv, jstring baseName){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedSpirv = (jlong*) env->GetLongArrayElements(spirv, nullptr);
	std::vector<unsigned int>* spirvArr = toUnsignedIntVector(fetchedSpirv, env->GetArrayLength(spirv));
	env->ReleaseLongArrayElements(spirv, (jlong*) fetchedSpirv, JNI_ABORT);
	OutputSpvBin(*spirvArr, toChars(env, baseName));
	delete spirvArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_OutputSpvHex
  (JNIEnv* env, jclass self, jlongArray spirv, jstring baseName, jstring varName){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedSpirv = env->GetLongArrayElements(spirv, nullptr);
	std::vector<unsigned int>* spirvArr = toUnsignedIntVector(fetchedSpirv, env->GetArrayLength(spirv));
	env->ReleaseLongArrayElements(spirv, fetchedSpirv, JNI_ABORT);
	OutputSpvHex(*spirvArr, toChars(env, baseName), toChars(env, varName));
	delete spirvArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpirvToolsDisassemble
  (JNIEnv* env, jclass self, jobject out, jlongArray spirv){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedSpirv = (jlong*) env->GetLongArrayElements(spirv, nullptr);
	std::vector<unsigned int>* spirvArr = toUnsignedIntVector(fetchedSpirv, env->GetArrayLength(spirv));
	env->ReleaseLongArrayElements(spirv, (jlong*) fetchedSpirv, JNI_ABORT);
	std::ostream* outStream = toOstream(env, out, nullptr);
	SpirvToolsDisassemble(*outStream, *spirvArr);
	delete spirvArr;
	delete outStream;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpirvToolsValidate
  (JNIEnv* env, jclass self, jbyteArray intermediate, jlongArray spirv, jbyteArray logger, jboolean prelegalization){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedSpirv = env->GetLongArrayElements(spirv, nullptr);
	std::vector<unsigned int>* spirvArr = toUnsignedIntVector(fetchedSpirv, env->GetArrayLength(spirv));
	env->ReleaseLongArrayElements(spirv, fetchedSpirv, JNI_ABORT);
	SpirvToolsValidate(*$<TIntermediate*>(env _$ intermediate), *spirvArr, $<spv::SpvBuildLogger*>(env _$ logger), prelegalization);
	delete spirvArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpirvToolsTransform
  (JNIEnv* env, jclass self, jbyteArray intermediate, jlongArray spirv, jbyteArray logger, jbyteArray options){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedSpirv = env->GetLongArrayElements(spirv, nullptr);
	std::vector<unsigned int>* spirvArr = toUnsignedIntVector(fetchedSpirv, env->GetArrayLength(spirv));
	env->ReleaseLongArrayElements(spirv, fetchedSpirv, JNI_ABORT);
	SpirvToolsTransform(*$<TIntermediate*>(env _$ intermediate), *spirvArr, $<spv::SpvBuildLogger*>(env _$ logger), $<SpvOptions*>(env _$ options));
	delete spirvArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpirvToolsStripDebugInfo
  (JNIEnv* env, jclass self, jbyteArray intermediate, jlongArray spirv, jbyteArray logger){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedSpirv = env->GetLongArrayElements(spirv, nullptr);
	std::vector<unsigned int>* spirvArr = toUnsignedIntVector(fetchedSpirv, env->GetArrayLength(spirv));
	env->ReleaseLongArrayElements(spirv, fetchedSpirv, JNI_ABORT);
	SpirvToolsStripDebugInfo(*$<TIntermediate*>(env _$ intermediate), *spirvArr, $<spv::SpvBuildLogger*>(env _$ logger));
	delete spirvArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_BitwiseCast
  (JNIEnv* env, jclass self, jbyteArray source){
	JNI_METHOD_GUARD_ENTER
	return env $_ spvutils::BitwiseCast<void*, void*>(env _$ source);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Disassemble
  (JNIEnv* env, jclass self, jobject out, jlongArray spirv){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedSpirv = env->GetLongArrayElements(spirv, nullptr);
	std::vector<unsigned int>* spirvArr = toUnsignedIntVector(fetchedSpirv, env->GetArrayLength(spirv));
	env->ReleaseLongArrayElements(spirv, fetchedSpirv, JNI_ABORT);
	std::ostream* outStream = toOstream(env, out, nullptr);
	spv::Disassemble(*outStream, *spirvArr);
	delete outStream;
	delete spirvArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Parameterize
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	spv::Parameterize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_SourceString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::SourceString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_AddressingString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::AddressingString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_MemoryString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::MemoryString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_ExecutionModelString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::ExecutionModelString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_ExecutionModeString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::ExecutionModeString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_StorageClassString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::StorageClassString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_DecorationString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::DecorationString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_BuiltInString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::BuiltInString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_DimensionString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::DimensionString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_SelectControlString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::SelectControlString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_LoopControlString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::LoopControlString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_FunctionControlString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::FunctionControlString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_SamplerAddressingModeString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::SamplerAddressingModeString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_SamplerFilterModeString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::SamplerFilterModeString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_ImageFormatString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::ImageFormatString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_ImageChannelOrderString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::ImageChannelOrderString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_ImageChannelTypeString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return NULL;
	//return toString(env, spv::ImageChannelTypeString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_ImageChannelDataTypeString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::ImageChannelDataTypeString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_ImageOperandsString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::ImageOperandsString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_ImageOperands
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return nullptr;
	//return toString(env, spv::ImageOperands(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_FPFastMathString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::FPFastMathString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_FPRoundingModeString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::FPRoundingModeString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_LinkageTypeString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::LinkageTypeString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_FuncParamAttrString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::FuncParamAttrString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_AccessQualifierString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::AccessQualifierString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_MemorySemanticsString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::MemorySemanticsString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_MemoryAccessString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::MemoryAccessString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_ExecutionScopeString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return NULL;
	//return toString(env, spv::ExecutionScopeString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_GroupOperationString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::GroupOperationString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_KernelEnqueueFlagsString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::KernelEnqueueFlagsString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_KernelProfilingInfoString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::KernelProfilingInfoString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_CapabilityString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::CapabilityString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_OpcodeString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::OpcodeString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_ScopeString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, spv::ScopeString(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_GetOperandDesc
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return NULL;
	//return toString(env, spv::GetOperandDesc($<spv::OperandClass>(v)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_PrintImmediateRow
  (JNIEnv* env, jclass self, jint imm, jstring name, jbyteArray enumParams, jboolean caps, jboolean hex){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	//spv::PrintImmediateRow(imm, toChars(env, name), $<spv::EnumParameters*>(env _$ enumParams), caps, hex);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_PrintOperands
  (JNIEnv* env, jclass self, jbyteArray operands, jint reservedOperands){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	//spv::PrintOperands(*$<spv::OperandParameters*>(env _$ operands), reservedOperands);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HasResultAndType
  (JNIEnv* env, jclass self, jint opcode, jbooleanArray hasResult, jbooleanArray hasResultType){
	JNI_METHOD_GUARD_ENTER
	bool hasResultRef = false;
	bool hasResultTypeRef = false;
	spv::HasResultAndType($<spv::Op>(opcode), &hasResultRef, &hasResultTypeRef);
	env->SetBooleanArrayRegion(hasResult, 0, 1, (jboolean*) &hasResultRef);
	env->SetBooleanArrayRegion(hasResultType, 0, 1, (jboolean*) &hasResultTypeRef);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_inReadableOrder
  (JNIEnv* env, jclass self, jbyteArray root, jobject callback){
	JNI_METHOD_GUARD_ENTER
	std::function<void(JNIEnv*, spv::Block*, spv::ReachReason, spv::Block*)> callbackTmp([callback](JNIEnv* env, spv::Block* b0, spv::ReachReason reason, spv::Block* header){
		jclass clazz = env->FindClass(JAVA_PACKAGE_PATH(/Main$Void_BytearrayIntBytearray));
		jmethodID id = env->GetMethodID(clazz, "op", "([BI[B)V");
		env->CallVoidMethod(callback, id, env $_ b0, reason, env $_ header);
	});
	std::function<void(spv::Block*, spv::ReachReason, spv::Block*)>* callbackRef = createCallback(callbackTmp, nullptr);
	spv::inReadableOrder($<spv::Block*>(env _$ root), *callbackRef);
	delete callbackRef;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_InitializePoolIndex
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return InitializePoolIndex();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TString
  (JNIEnv* env, jclass self, jstring s){
	JNI_METHOD_GUARD_ENTER
	return env $_ NewPoolTString(toChars(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TString_1asString
  (JNIEnv* env, jclass self, jbyteArray s){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TString*>(env _$ s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_allocString
  (JNIEnv* env, jclass self, jstring str){
	JNI_METHOD_GUARD_ENTER
	char* strRef = (char*) (env)->GetStringUTFChars(str, nullptr);
	int length = (int) (env)->GetStringUTFLength(str);
	char* strRet = Pool_calloc($<char*>(nullptr), length);
	strRet = strncpy(strRet, strRef, length);
	(env)->ReleaseStringUTFChars(str, strRef);
	return pointerToByteArray(env, strRet);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_createArray
  (JNIEnv* env, jclass self, jobjectArray pointers){
	JNI_METHOD_GUARD_ENTER
	int length = (env)->GetArrayLength(pointers);
	std::vector<void*>* ret = Pool_malloc($<std::vector<void*>*>(nullptr));
	for(unsigned int i=0;i<(unsigned int)(int) length;++i){
		jobject fetchedPointer = (env)->GetObjectArrayElement(pointers, i);
		ret->push_back(byteArrayToPointer(env, $<jbyteArray>(fetchedPointer)));
	}
	return pointerToByteArray(env, ret);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Array_1size
  (JNIEnv* env, jclass self, jbyteArray a){
	JNI_METHOD_GUARD_ENTER
	std::vector<void*>* array = $<std::vector<void*>*>(env _$ a);
	return array->size();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Array_1get
  (JNIEnv* env, jclass self, jbyteArray a, jint i){
	JNI_METHOD_GUARD_ENTER
	std::vector<void*>* array = $<std::vector<void*>*>(env _$ a);
	int size = array->size();
	if(i >= size || i < 0){
		setLastError(env, GLSLANG_ERROR_ARRAY_INDEX_OUT_OF_BOUNDS);
		return nullptr;
	}else{
		return env $_ (*array)[i];
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_delete
  (JNIEnv* env, jclass self, jbyteArray a){
	JNI_METHOD_GUARD_ENTER
	void* elem = (env _$ a);
	Pool_cleanup(elem);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_resetLastErrorCode
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NONE);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_getLastErrorCode
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return getLastError();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_getLastErrorString
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return toString(env, getErrorString(getLastError()));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_getErrorStringFromCode
  (JNIEnv* env, jclass self, jint i){
	JNI_METHOD_GUARD_ENTER
	return toString(env, getErrorString(i));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_setErrorMode
  (JNIEnv* env, jclass self, jint mode){
	JNI_METHOD_GUARD_ENTER
	setErrorMode($<GlslangErrorMode>(mode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_setCatchCExceptions
  (JNIEnv* env, jclass self, jboolean v){
	setCatchCExceptions(v);
}
