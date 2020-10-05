#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL
#define ENABLE_OPT
#define SPV_ENABLE_UTILITY_CODE

#ifdef LINUX
	#pragma GCC diagnostic push
	#pragma GCC diagnostic ignored "-Wpedantic"
	#pragma GCC diagnostic ignored "-Woverflow"
#endif

#include <glslang/SPIRV/Logger.h>
#include <glslang/SPIRV/SPVRemapper.h>
#include <glslang/SPIRV/SpvBuilder.h>
#include <glslang/SPIRV/SpvTools.h>
#include <glslang/SPIRV/doc.h>
#include <glslang/SPIRV/spvIR.h>

#ifdef LINUX
	#pragma GCC diagnostic pop
#endif

#include <Utils.h>

using namespace spv;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_SpvBuildLogger
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<SpvBuildLogger*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpvBuildLogger_1tbdFunctionality
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring f){
	JNI_METHOD_GUARD_ENTER
	$<SpvBuildLogger*>(env _$ ptr)->tbdFunctionality(toCString(env, f));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpvBuildLogger_1missingFunctionality
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring f){
	JNI_METHOD_GUARD_ENTER
	$<SpvBuildLogger*>(env _$ ptr)->missingFunctionality(toCString(env, f));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpvBuildLogger_1warning
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring w){
	JNI_METHOD_GUARD_ENTER
	$<SpvBuildLogger*>(env _$ ptr)->warning(toCString(env, w));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpvBuildLogger_1error
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring e){
	JNI_METHOD_GUARD_ENTER
	$<SpvBuildLogger*>(env _$ ptr)->error(toCString(env, e));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_SpvBuildLogger_1getAllMessages
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<SpvBuildLogger*>(env _$ ptr)->getAllMessages());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_spirvbin_1t
  (JNIEnv* env, jclass self, jint verbose){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<spirvbin_t*>(nullptr), verbose);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_spirvbin_1t_1remap
  (JNIEnv* env, jclass self, jbyteArray ptr, jlongArray spv, jlong opts){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedSpv = env->GetLongArrayElements(spv, nullptr);
	std::vector<uint32_t>* spvArr = toUnsignedIntVector(fetchedSpv, env->GetArrayLength(spv));
	env->ReleaseLongArrayElements(spv, fetchedSpv, JNI_ABORT);
	$<spirvbin_t*>(env _$ ptr)->remap(*spvArr, opts);
	delete spvArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_spirvbin_1t_1registerErrorHandler
  (JNIEnv* env, jclass self, jobject callback){
	JNI_METHOD_GUARD_ENTER
	GlobalRef* ref = new GlobalRef(callback);
	jobject callbackGlobalRef = ref->getRef();
	std::function<void(JNIEnv*, const std::string&)> tmp([callbackGlobalRef](JNIEnv* env, const std::string& s){
		jclass clazz = env->FindClass(JAVA_PACKAGE_PATH(/Main$Void_String));
		jmethodID id = env->GetMethodID(clazz, "op", "(Ljava/lang/String;)V");
		env->CallVoidMethod(callbackGlobalRef, id, toString(env, s));
	});
	std::function<void(const std::string&)>* cCallback = createCallback(tmp, nullptr);
	spirvbin_t::registerErrorHandler(*cCallback);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_spirvbin_1t_1registerLogHandler
  (JNIEnv* env, jclass self, jobject callback){
	JNI_METHOD_GUARD_ENTER
	GlobalRef* ref = nullptr;
	ref = Pool_mallocRegister(ref, nullptr);
	ref->setRef(callback);
	jobject callbackGlobalRef = ref->getRef();
	std::function<void(JNIEnv*, const std::string&)> tmp([callbackGlobalRef](JNIEnv* env, const std::string& s){
		jclass clazz = env->FindClass(JAVA_PACKAGE_PATH(/Main$Void_String));
		jmethodID id = env->GetMethodID(clazz, "op", "(Ljava/lang/String;)V");
		env->CallVoidMethod(callbackGlobalRef, id, toString(env, s));
	});
	std::function<void(const std::string&)>* cCallback = createCallback(tmp, nullptr);
	spirvbin_t::registerLogHandler(*cCallback);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder
  (JNIEnv* env, jclass self, jlong spvVersion, jlong userNumber, jbyteArray logger){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<Builder*>(nullptr), spvVersion, userNumber, $<SpvBuildLogger*>(env _$ logger));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1getSpvVersion
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getSpvVersion();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1setSource
  (JNIEnv* env, jclass self, jbyteArray ptr, jint lang, jint version){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->setSource($<SourceLanguage>(lang), version);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1getStringId
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring str){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getStringId(toCString(env, str));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1setSourceFile
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring file){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->setSourceFile(toCString(env, file));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1setSourceText
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring text){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->setSourceText(toCString(env, text));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addSourceExtension
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring ext){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addSourceExtension(toChars(env, ext));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addModuleProcessed
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring p){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addModuleProcessed(toCString(env, p));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1setEmitOpLines
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->setEmitOpLines();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addExtension
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring ext){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addExtension(toChars(env, ext));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1removeExtension
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring ext){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->removeExtension(toChars(env, ext));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addIncorporatedExtension
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring ext, jint incorporatedVersion){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addIncorporatedExtension(toChars(env, ext), $<SpvVersion>(incorporatedVersion));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1promoteIncorporatedExtension
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring baseExt, jstring promoExt, jint incorporatedVersion){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->promoteIncorporatedExtension(toChars(env, baseExt), toChars(env, promoExt), $<SpvVersion>(incorporatedVersion));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addInclude
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jstring text){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addInclude(toCString(env, name), toCString(env, text));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1import
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->import(toChars(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1setMemoryModel
  (JNIEnv* env, jclass self, jbyteArray ptr, jint addr, jint mem){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->setMemoryModel($<AddressingModel>(addr), $<MemoryModel>(mem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addCapability
  (JNIEnv* env, jclass self, jbyteArray ptr, jint cap){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addCapability($<Capability>(cap));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1getUniqueId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getUniqueId();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1getUniqueIds
  (JNIEnv* env, jclass self, jbyteArray ptr, jint numIds){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getUniqueIds(numIds);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1setLine___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint line){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->setLine(line);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1setLine___3BILjava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jint line, jstring filename){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->setLine(line, toChars(env, filename));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addLine
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong fileName, jint line, jint column){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addLine(fileName, line, column);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeVoidType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeVoidType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeBoolType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeBoolType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makePointer
  (JNIEnv* env, jclass self, jbyteArray ptr, jint storageClass, jlong pointee){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makePointer($<StorageClass>(storageClass), pointee);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeForwardPointer
  (JNIEnv* env, jclass self, jbyteArray ptr, jint storageClass){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeForwardPointer($<StorageClass>(storageClass));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makePointerFromForwardPointer
  (JNIEnv* env, jclass self, jbyteArray ptr, jint storageClass, jlong forwardPointerType, jlong pointee){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makePointerFromForwardPointer($<StorageClass>(storageClass), forwardPointerType, pointee);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeIntegerType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint width, jboolean hasSign){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeIntegerType(width, hasSign);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeIntType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint width){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeIntType(width);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeUintType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint width){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeUintType(width);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeFloatType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint width){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeFloatType(width);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeStructType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlongArray members, jstring s){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedMembers = env->GetLongArrayElements(members, nullptr);
	std::vector<unsigned int>* membersArr = toUnsignedIntVector(fetchedMembers, env->GetArrayLength(members));
	env->ReleaseLongArrayElements(members, fetchedMembers, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->makeStructType(*membersArr, toChars(env, s));
	delete membersArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeStructResultType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong type0, jlong type1){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeStructResultType(type0, type1);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeVectorType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong component, jint size){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeVectorType(component, size);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeMatrixType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong component, jint cols, jint rows){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeMatrixType(component, cols, rows);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeArrayType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong element, jlong sizeId, jint stride){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeArrayType(element, sizeId, stride);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeRuntimeArray
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong element){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeRuntimeArray(element);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeFunctionType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong returnType, jlongArray paramTypes){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedParamTypes = env->GetLongArrayElements(paramTypes, nullptr);
	std::vector<unsigned int>* paramTypesArr = toUnsignedIntVector(fetchedParamTypes, env->GetArrayLength(paramTypes));
	env->ReleaseLongArrayElements(paramTypes, fetchedParamTypes, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->makeFunctionType(returnType, *paramTypesArr);
	delete paramTypesArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeImageType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong sampledType, jint dim, jboolean depth, jboolean arrayed, jboolean ms, jlong sampled, jint format){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeImageType(sampledType, $<Dim>(dim), depth, arrayed, ms, sampled, $<ImageFormat>(format));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeSamplerType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeSamplerType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeSampledImageType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong imageType){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeSampledImageType(imageType);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeCooperativeMatrixType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong component, jlong scope, jlong rows, jlong cols){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeCooperativeMatrixType(component, scope, rows, cols);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeAccelerationStructureType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeAccelerationStructureType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeRayQueryType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeRayQueryType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1getTypeId
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getTypeId(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1getDerefTypeId
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getDerefTypeId(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getOpCode
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getOpCode(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getTypeClass
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getTypeClass(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getMostBasicTypeClass
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getMostBasicTypeClass(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getNumComponents
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getNumComponents(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getNumTypeConstituents
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getNumTypeConstituents(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getNumTypeComponents
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getNumTypeComponents(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1getScalarTypeId
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getScalarTypeId(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1getContainedTypeId___3BJ
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getContainedTypeId(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1getContainedTypeId___3BJI
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jint i){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getContainedTypeId(id, i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getTypeStorageClass
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getTypeStorageClass(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getImageTypeFormat
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getImageTypeFormat(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isPointer
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isPointer(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isScalar
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isScalar(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isVector
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isVector(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isMatrix
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isMatrix(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isCooperativeMatrix
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isCooperativeMatrix(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isAggregate
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isAggregate(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isSampledImage
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isSampledImage(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isBoolType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isBoolType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isIntType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isIntType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isUintType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isUintType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isFloatType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isFloatType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isPointerType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isPointerType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isScalarType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isScalarType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isVectorType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isVectorType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isMatrixType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isMatrixType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isStructType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isStructType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isArrayType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isArrayType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isCooperativeMatrixType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isCooperativeMatrixType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isAggregateType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isAggregateType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isImageType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isImageType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isSamplerType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isSamplerType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isSampledImageType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isSampledImageType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1containsType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jint typeOp, jlong width){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->containsType(id, $<Op>(typeOp), width);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1containsPhysicalStorageBufferOrArray
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->containsPhysicalStorageBufferOrArray(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isConstantOpCode
  (JNIEnv* env, jclass self, jbyteArray ptr, jint opcode){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isConstantOpCode($<Op>(opcode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isSpecConstantOpCode
  (JNIEnv* env, jclass self, jbyteArray ptr, jint opcode){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isSpecConstantOpCode($<Op>(opcode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isConstant
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isConstant(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isConstantScalar
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isConstantScalar(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isSpecConstant
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isSpecConstant(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1getConstantScalar
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getConstantScalar(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getStorageClass
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getStorageClass(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isVariableOpCode
  (JNIEnv* env, jclass self, jbyteArray ptr, jint opcode){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isVariableOpCode($<Op>(opcode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isVariable
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isVariable(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isGlobalStorage
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isGlobalStorage(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isGlobalVariable
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isGlobalVariable(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isValidInitializer
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isValidInitializer(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getScalarTypeWidth
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getScalarTypeWidth(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getTypeNumColumns
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getTypeNumColumns(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getNumColumns
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getNumColumns(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getTypeNumRows
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getTypeNumRows(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getNumRows
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getNumRows(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Builder_1getTypeDimensionality
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getTypeDimensionality(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1getImageType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->getImageType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isArrayedImageType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isArrayedImageType(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeBoolConstant
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v, jboolean specConstant){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeBoolConstant(v, specConstant);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeInt8Constant
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v, jboolean specConstant){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeInt8Constant(v, specConstant);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeUint8Constant
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v, jboolean specConstant){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeUint8Constant(v, specConstant);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeInt16Constant
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v, jboolean specConstant){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeInt16Constant(v, specConstant);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeUint16Constant
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v, jboolean specConstant){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeUint16Constant(v, specConstant);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeIntConstant
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v, jboolean specConstant){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeIntConstant(v, specConstant);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeUintConstant
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v, jboolean specConstant){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeUintConstant(v, specConstant);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeInt64Constant
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject v, jboolean specConstant){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeInt64Constant(BigIntegerToLongLong(env, v), specConstant);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeUint64Constant
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject v, jboolean specConstant){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeUint64Constant(BigIntegerToUnsignedLongLong(env, v), specConstant);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeFloatConstant
  (JNIEnv* env, jclass self, jbyteArray ptr, jfloat v, jboolean specConstant){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeFloatConstant(v, specConstant);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeDoubleConstant
  (JNIEnv* env, jclass self, jbyteArray ptr, jdouble v, jboolean specConstant){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeDoubleConstant(v, specConstant);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeFloat16Constant
  (JNIEnv* env, jclass self, jbyteArray ptr, jfloat v, jboolean specConstant){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeFloat16Constant(v, specConstant);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeFpConstant
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong type, jdouble d, jboolean specConstant){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->makeFpConstant(type, d, specConstant);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1makeCompositeConstant
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong type, jlongArray comps, jboolean specConstant){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedComps = env->GetLongArrayElements(comps, nullptr);
	std::vector<unsigned int>* compsArr = toUnsignedIntVector(fetchedComps, env->GetArrayLength(comps));
	env->ReleaseLongArrayElements(comps, fetchedComps, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->makeCompositeConstant(type, *compsArr, specConstant);
	delete compsArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1addEntryPoint
  (JNIEnv* env, jclass self, jbyteArray ptr, jint executionModel, jbyteArray func, jstring name){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Builder*>(env _$ ptr)->addEntryPoint($<ExecutionModel>(executionModel), $<Function*>(env _$ func), toChars(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addExecutionMode___3B_3BIIII
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray func, jint mode, jint v1, jint v2, jint v3){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addExecutionMode($<Function*>(env _$ func), $<ExecutionMode>(mode), v1, v2, v3);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addExecutionMode___3B_3BI_3J
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray func, jint mode, jlongArray literals){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedLiterals = env->GetLongArrayElements(literals, nullptr);
	std::vector<unsigned int>* literalsArr = toUnsignedIntVector(fetchedLiterals, env->GetArrayLength(literals));
	env->ReleaseLongArrayElements(literals, fetchedLiterals, JNI_ABORT);
	$<Builder*>(env _$ ptr)->addExecutionMode($<Function*>(env _$ func), $<ExecutionMode>(mode), *literalsArr);
	delete literalsArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addExecutionModeId
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray func, jint mode, jlongArray operandIds){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedOperandIds = env->GetLongArrayElements(operandIds, nullptr);
	std::vector<Id>* operandIdsArr = toUnsignedIntVector(fetchedOperandIds, env->GetArrayLength(operandIds));
	env->ReleaseLongArrayElements(operandIds, fetchedOperandIds, JNI_ABORT);
	$<Builder*>(env _$ ptr)->addExecutionModeId($<Function*>(env _$ func), $<ExecutionMode>(mode), *operandIdsArr);
	delete operandIdsArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addName
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jstring name){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addName(id, toChars(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addMemberName
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jint member, jstring name){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addMemberName(id, member, toChars(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addDecoration___3BJII
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jint decoration, jint num){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addDecoration(id, $<Decoration>(decoration), num);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addDecoration___3BJILjava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jint decoration, jstring s){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addDecoration(id, $<Decoration>(decoration), toChars(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addDecoration___3BJI_3J
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jint decoration, jlongArray literals){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedLiterals = env->GetLongArrayElements(literals, nullptr);
	std::vector<unsigned int>* literalsArr = toUnsignedIntVector(fetchedLiterals, env->GetArrayLength(literals));
	env->ReleaseLongArrayElements(literals, fetchedLiterals, JNI_ABORT);
	$<Builder*>(env _$ ptr)->addDecoration(id, $<Decoration>(decoration), *literalsArr);
	delete literalsArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addDecoration___3BJI_3Ljava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jint decoration, jobjectArray strings){
	JNI_METHOD_GUARD_ENTER
	Builder* elem = $<Builder*>(env _$ ptr);
	elem->addDecoration(id, $<Decoration>(decoration), *toCharsVector(env, strings, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addDecorationId___3BJIJ
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jint decoration, jlong idDecoration){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addDecorationId(id, $<Decoration>(decoration), idDecoration);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addDecorationId___3BJI_3J
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jint decoration, jlongArray operandIds){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedOperandIds = env->GetLongArrayElements(operandIds, nullptr);
	std::vector<Id>* operandIdsArr = toUnsignedIntVector(fetchedOperandIds, env->GetArrayLength(operandIds));
	env->ReleaseLongArrayElements(operandIds, fetchedOperandIds, JNI_ABORT);
	$<Builder*>(env _$ ptr)->addDecorationId(id, $<Decoration>(decoration), *operandIdsArr);
	delete operandIdsArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addMemberDecoration___3BJJII
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jlong member, jint decoration, jint num){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addMemberDecoration(id, member, $<Decoration>(decoration), num);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addMemberDecoration___3BJJILjava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jlong member, jint decoration, jstring s){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addMemberDecoration(id, member, $<Decoration>(decoration), toChars(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addMemberDecoration___3BJJI_3J
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jlong member, jint decoration, jlongArray literals){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedLiterals = env->GetLongArrayElements(literals, nullptr);
	std::vector<unsigned int>* literalsArr = toUnsignedIntVector(fetchedLiterals, env->GetArrayLength(literals));
	env->ReleaseLongArrayElements(literals, fetchedLiterals, JNI_ABORT);
	$<Builder*>(env _$ ptr)->addMemberDecoration(id, member, $<Decoration>(decoration), *literalsArr);
	delete literalsArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addMemberDecoration___3BJJI_3Ljava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jlong member, jint decoration, jobjectArray strings){
	JNI_METHOD_GUARD_ENTER
	Builder* elem = $<Builder*>(env _$ ptr);
	elem->addMemberDecoration(id, member, $<Decoration>(decoration), *toCharsVector(env, strings, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1setBuildPoint
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray bp){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->setBuildPoint($<Block*>(env _$ bp));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1getBuildPoint
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Builder*>(env _$ ptr)->getBuildPoint();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1makeEntryPoint
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Builder*>(env _$ ptr)->makeEntryPoint(toChars(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1makeFunctionEntry
  (JNIEnv* env, jclass self, jbyteArray ptr, jint precision, jlong returnType, jstring name, jlongArray paramTypes, jobjectArray precisions, jobjectArray entry){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedParamTypes = env->GetLongArrayElements(paramTypes, nullptr);
	std::vector<unsigned int>* paramTypesArr = toUnsignedIntVector(fetchedParamTypes, env->GetArrayLength(paramTypes));
	env->ReleaseLongArrayElements(paramTypes, fetchedParamTypes, JNI_ABORT);
	std::vector<std::vector<Decoration>>* precisionsArr = new std::vector<std::vector<Decoration>>();
	int precisionsLength = env->GetArrayLength(precisions);
	for(int i=0;i<precisionsLength;++i){
		jintArray current = (jintArray) env->GetObjectArrayElement(precisions, i);
		Decoration* fetchedCurrent = (Decoration*) env->GetIntArrayElements(current, nullptr);
		std::vector<Decoration>* currentArr = new std::vector<Decoration>(fetchedCurrent, fetchedCurrent+env->GetArrayLength(current));
		precisionsArr->push_back(*currentArr);
		env->ReleaseIntArrayElements(current, (jint*) fetchedCurrent, JNI_ABORT);
	}
	Block* entryRef = nullptr;
	void* ret = $<Builder*>(env _$ ptr)->makeFunctionEntry($<Decoration>(precision), returnType, toChars(env, name), *paramTypesArr, *precisionsArr, &entryRef);
	delete precisionsArr;
	for(std::vector<Decoration> elem : *precisionsArr){
		delete &elem;
	}
	delete precisionsArr;
	env->SetObjectArrayElement(entry, 0, env $_ entryRef);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1makeReturn
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean implicit, jlong retVal){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->makeReturn(implicit, retVal);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1leaveFunction
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->leaveFunction();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1makeDiscard
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->makeDiscard();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createVariable
  (JNIEnv* env, jclass self, jbyteArray ptr, jint precision, jint storageClass, jlong type, jstring name, jlong initializer){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createVariable($<Decoration>(precision), $<StorageClass>(storageClass), type, toChars(env, name), initializer);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createUndefined
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong type){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createUndefined(type);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1createStore
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong rValue, jlong lValue, jint memoryAccess, jint scope, jlong alignment){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->createStore(rValue, lValue, $<MemoryAccessMask>(memoryAccess), $<Scope>(scope), alignment);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createLoad
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong lValue, jint precision, jint memoryAccess, jint scope, jlong alignment){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createLoad(lValue, $<Decoration>(precision), $<MemoryAccessMask>(memoryAccess), $<Scope>(scope), alignment);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createAccessChain
  (JNIEnv* env, jclass self, jbyteArray ptr, jint storageClass, jlong base, jlongArray offsets){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedOffsets = env->GetLongArrayElements(offsets, nullptr);
	std::vector<unsigned int>* offsetsArr = toUnsignedIntVector(fetchedOffsets, env->GetArrayLength(offsets));
	env->ReleaseLongArrayElements(offsets, fetchedOffsets, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->createAccessChain($<StorageClass>(storageClass), base, *offsetsArr);
	delete offsetsArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createArrayLength
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong base, jlong member){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createArrayLength(base, member);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createCooperativeMatrixLength
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong type){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createCooperativeMatrixLength(type);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createCompositeExtract___3BJJJ
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong composite, jlong typeId, jlong index){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createCompositeExtract(composite, typeId, index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createCompositeExtract___3BJJ_3J
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong composite, jlong typeId, jlongArray indexes){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedIndexes = env->GetLongArrayElements(indexes, nullptr);
	std::vector<unsigned int>* indexesArr = toUnsignedIntVector(fetchedIndexes, env->GetArrayLength(indexes));
	env->ReleaseLongArrayElements(indexes, fetchedIndexes, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->createCompositeExtract(composite, typeId, *indexesArr);
	delete indexesArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createCompositeInsert___3BJJJJ
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong object, jlong composite, jlong typeId, jlong index){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createCompositeInsert(object, composite, typeId, index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createCompositeInsert___3BJJJ_3J
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong object, jlong composite, jlong typeId, jlongArray indexes){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedIndexes = env->GetLongArrayElements(indexes, nullptr);
	std::vector<unsigned int>* indexesArr = toUnsignedIntVector(fetchedIndexes, env->GetArrayLength(indexes));
	env->ReleaseLongArrayElements(indexes, fetchedIndexes, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->createCompositeInsert(object, composite, typeId, *indexesArr);
	delete indexesArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createVectorExtractDynamic
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong vector, jlong typeId, jlong componentIndex){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createVectorExtractDynamic(vector, typeId, componentIndex);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createVectorInsertDynamic
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong vector, jlong typeId, jlong component, jlong componentIndex){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createVectorInsertDynamic(vector, typeId, component, componentIndex);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1createNoResultOp___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->createNoResultOp($<Op>(op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1createNoResultOp___3BIJ
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jlong operand){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->createNoResultOp($<Op>(op), operand);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1createNoResultOp___3BI_3J
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jlongArray operands){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedOperands = env->GetLongArrayElements(operands, nullptr);
	std::vector<unsigned int>* operandsArr = toUnsignedIntVector(fetchedOperands, env->GetArrayLength(operands));
	env->ReleaseLongArrayElements(operands, fetchedOperands, JNI_ABORT);
	$<Builder*>(env _$ ptr)->createNoResultOp($<Op>(op), *operandsArr);
	delete operandsArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1createNoResultOp___3BI_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray operands){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->createNoResultOp($<Op>(op), *$<std::vector<IdImmediate>*>(env _$ operands));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1createControlBarrier
  (JNIEnv* env, jclass self, jbyteArray ptr, jint execution, jint memory, jint mask){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->createControlBarrier($<Scope>(execution), $<Scope>(memory), $<MemorySemanticsMask>(mask));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1createMemoryBarrier
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong executionScope, jlong memorySemantics){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->createMemoryBarrier(executionScope, memorySemantics);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createUnaryOp
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jlong typeId, jlong operand){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createUnaryOp($<Op>(op), typeId, operand);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createBinOp
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jlong typeId, jlong operand1, jlong operand2){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createBinOp($<Op>(op), typeId, operand1, operand2);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createTriOp
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jlong typeId, jlong operand1, jlong operand2, jlong operand3){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createTriOp($<Op>(op), typeId, operand1, operand2, operand3);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createOp___3BIJ_3J
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jlong typeId, jlongArray operands){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedOperands = env->GetLongArrayElements(operands, nullptr);
	std::vector<unsigned int>* operandsArr = toUnsignedIntVector(fetchedOperands, env->GetArrayLength(operands));
	env->ReleaseLongArrayElements(operands, fetchedOperands, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->createOp($<Op>(op), typeId, *operandsArr);
	delete operandsArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createOp___3BIJ_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jlong typeId, jbyteArray operands){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createOp($<Op>(op), typeId, *$<std::vector<IdImmediate>*>(env _$ operands));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createFunctionCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray func, jlongArray operands){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedOperands = env->GetLongArrayElements(operands, nullptr);
	std::vector<unsigned int>* operandsArr = toUnsignedIntVector(fetchedOperands, env->GetArrayLength(operands));
	env->ReleaseLongArrayElements(operands, fetchedOperands, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->createFunctionCall($<Function*>(env _$ func), *operandsArr);
	delete operandsArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createSpecConstantOp
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jlong typeId, jlongArray operands, jlongArray literals){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedOperands = env->GetLongArrayElements(operands, nullptr);
	std::vector<unsigned int>* operandsArr = toUnsignedIntVector(fetchedOperands, env->GetArrayLength(operands));
	env->ReleaseLongArrayElements(operands, fetchedOperands, JNI_ABORT);
	jlong* fetchedLiterals = env->GetLongArrayElements(literals, nullptr);
	std::vector<unsigned int>* literalsArr = toUnsignedIntVector(fetchedLiterals, env->GetArrayLength(literals));
	env->ReleaseLongArrayElements(literals, fetchedLiterals, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->createSpecConstantOp($<Op>(op), typeId, *operandsArr, *literalsArr);
	delete literalsArr;
	delete operandsArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createRvalueSwizzle
  (JNIEnv* env, jclass self, jbyteArray ptr, jint precision, jlong typeId, jlong source, jlongArray channels){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedChannels = env->GetLongArrayElements(channels, nullptr);
	std::vector<unsigned int>* channelsArr = toUnsignedIntVector(fetchedChannels, env->GetArrayLength(channels));
	env->ReleaseLongArrayElements(channels, fetchedChannels, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->createRvalueSwizzle($<Decoration>(precision), typeId, source, *channelsArr);
	delete channelsArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createLvalueSwizzle
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong typeId, jlong target, jlong source, jlongArray channels){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedChannels = env->GetLongArrayElements(channels, nullptr);
	std::vector<unsigned int>* channelsArr = toUnsignedIntVector(fetchedChannels, env->GetArrayLength(channels));
	env->ReleaseLongArrayElements(channels, fetchedChannels, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->createLvalueSwizzle(typeId, target, source, *channelsArr);
	delete channelsArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1setPrecision
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id, jint precision){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->setPrecision(id, $<Decoration>(precision));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1promoteScalar
  (JNIEnv* env, jclass self, jbyteArray ptr, jint precision, jlongArray left, jlongArray right){
	JNI_METHOD_GUARD_ENTER
	Id* fetchedLeft = (Id*) env->GetLongArrayElements(left, nullptr);
	Id* fetchedRight = (Id*) env->GetLongArrayElements(right, nullptr);
	Id leftRef = fetchedLeft[0];
	Id rightRef = fetchedRight[0];
	$<Builder*>(env _$ ptr)->promoteScalar($<Decoration>(precision), leftRef, rightRef);
	env->ReleaseLongArrayElements(left, (jlong*) fetchedLeft, JNI_ABORT);
	env->ReleaseLongArrayElements(right, (jlong*) fetchedRight, JNI_ABORT);
	jlong leftRefCpy = (jlong) leftRef;
	jlong rightRefCpy = (jlong) rightRef;
	env->SetLongArrayRegion(left, 0, 1, (jlong*) &leftRefCpy);
	env->SetLongArrayRegion(right, 0, 1, (jlong*) &rightRefCpy);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1smearScalar
  (JNIEnv* env, jclass self, jbyteArray ptr, jint precision, jlong scalarVal, jlong vectorType){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->smearScalar($<Decoration>(precision), scalarVal, vectorType);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createBuiltinCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong resultType, jlong builtins, jint entryPoint, jlongArray args){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedArgs = env->GetLongArrayElements(args, nullptr);
	std::vector<unsigned int>* argsArr = toUnsignedIntVector(fetchedArgs, env->GetArrayLength(args));
	env->ReleaseLongArrayElements(args, fetchedArgs, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->createBuiltinCall(resultType, builtins, entryPoint, *argsArr);
	delete argsArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createTextureCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jint precision, jlong resultType, jboolean sparse, jboolean fetch, jboolean proj, jboolean gather, jboolean noImplicit, jbyteArray parameters, jint mask){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createTextureCall($<Decoration>(precision), resultType, sparse, fetch, proj, gather, noImplicit, *$<Builder::TextureParameters*>(env _$ parameters), $<ImageOperandsMask>(mask));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createTextureQueryCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray parameters, jboolean isUnsignedResult){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createTextureQueryCall($<Op>(op), *$<Builder::TextureParameters*>(env _$ parameters), isUnsignedResult);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createSamplePositionCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jint precision, jlong id0, jlong id1){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return -1;
	//return $<Builder*>(env _$ ptr)->createSamplePositionCall($<Decoration>(precision), id0, id1);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createBitFieldExtractCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jint precision, jlong id0, jlong id1, jlong id2, jboolean isSigned){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return -1;
	//return $<Builder*>(env _$ ptr)->createBitFieldExtractCall($<Decoration>(precision), id0, id1, id2, isSigned);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createBitFieldInsertCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jint precision, jlong id0, jlong id1, jlong id2, jlong id3){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return -1;
	//return $<Builder*>(env _$ ptr)->createBitFieldInsertCall($<Decoration>(precision), id0, id1, id2, id3);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createCompositeCompare
  (JNIEnv* env, jclass self, jbyteArray ptr, jint precision, jlong id0, jlong id1, jboolean equal){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->createCompositeCompare($<Decoration>(precision), id0, id1, equal);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createCompositeConstruct
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong typeId, jlongArray constituents){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedConstituents = env->GetLongArrayElements(constituents, nullptr);
	std::vector<unsigned int>* constituentsArr = toUnsignedIntVector(fetchedConstituents, env->GetArrayLength(constituents));
	env->ReleaseLongArrayElements(constituents, fetchedConstituents, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->createCompositeConstruct(typeId, *constituentsArr);
	delete constituentsArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createConstructor
  (JNIEnv* env, jclass self, jbyteArray ptr, jint precision, jlongArray sources, jlong resultTypeId){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedSources = env->GetLongArrayElements(sources, nullptr);
	std::vector<unsigned int>* sourcesArr = toUnsignedIntVector(fetchedSources, env->GetArrayLength(sources));
	env->ReleaseLongArrayElements(sources, fetchedSources, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->createConstructor($<Decoration>(precision), *sourcesArr, resultTypeId);
	delete sourcesArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1createMatrixConstructor
  (JNIEnv* env, jclass self, jbyteArray ptr, jint precision, jlongArray sources, jlong constructee){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedSources = env->GetLongArrayElements(sources, nullptr);
	std::vector<unsigned int>* sourcesArr = toUnsignedIntVector(fetchedSources, env->GetArrayLength(sources));
	env->ReleaseLongArrayElements(sources, fetchedSources, JNI_ABORT);
	Id ret = $<Builder*>(env _$ ptr)->createMatrixConstructor($<Decoration>(precision), *sourcesArr, constructee);
	delete sourcesArr;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1makeSwitch
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong condition, jlong control, jint numSegments, jintArray caseValues, jintArray valueToSegment, jint defaultSegment, jbyteArray segmentBB){
	JNI_METHOD_GUARD_ENTER
	int* fetchedValueToSegment = (int*) env->GetIntArrayElements(valueToSegment, nullptr);
	std::vector<int>* valueToSegmentArr = new std::vector<int>(fetchedValueToSegment, fetchedValueToSegment+env->GetArrayLength(valueToSegment));
	int* fetchedCaseValues = (int*) env->GetIntArrayElements(caseValues, nullptr);
	std::vector<int>* caseValuesArr = new std::vector<int>(fetchedCaseValues, fetchedCaseValues+env->GetArrayLength(caseValues));
	$<Builder*>(env _$ ptr)->makeSwitch(condition, control, numSegments, *caseValuesArr, *valueToSegmentArr, defaultSegment, *$<std::vector<Block*>*>(env _$ segmentBB));
	delete caseValuesArr;
	env->ReleaseIntArrayElements(caseValues, (jint*) fetchedCaseValues, JNI_ABORT);
	delete valueToSegmentArr;
	env->ReleaseIntArrayElements(valueToSegment, (jint*) fetchedValueToSegment, JNI_ABORT);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1addSwitchBreak
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->addSwitchBreak();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1nextSwitchSegment
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray segmentBB, jint segment){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->nextSwitchSegment(*$<std::vector<Block*>*>(env _$ segmentBB), segment);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1endSwitch
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray segmentBB){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->endSwitch(*$<std::vector<Block*>*>(env _$ segmentBB));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1makeNewLoop
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Builder*>(env _$ ptr)->makeNewLoop();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1makeNewBlock
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Builder*>(env _$ ptr)->makeNewBlock();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1createLoopContinue
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->createLoopContinue();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1createLoopExit
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->createLoopExit();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1closeLoop
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->closeLoop();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1getAccessChain
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Builder*>(env _$ ptr)->getAccessChain();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1setAccessChain
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray newChain){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->setAccessChain(*$<Builder::AccessChain*>(env _$ newChain));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1clearAccessChain
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->clearAccessChain();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1setAccessChainLValue
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong lValue){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->setAccessChainLValue(lValue);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1setAccessChainRValue
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong rValue){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->setAccessChainRValue(rValue);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1accessChainPush
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong offset, jbyteArray coherentFlags, jlong alignment){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->accessChainPush(offset, *$<Builder::AccessChain::CoherentFlags*>(env _$ coherentFlags), alignment);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1accessChainPushSwizzle
  (JNIEnv* env, jclass self, jbyteArray ptr, jlongArray swizzle, jlong preSwizzleBaseType, jbyteArray coherentFlags, jlong alignment){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedSwizzle = env->GetLongArrayElements(swizzle, nullptr);
	std::vector<unsigned int>* swizzleArr = toUnsignedIntVector(fetchedSwizzle, env->GetArrayLength(swizzle));
	env->ReleaseLongArrayElements(swizzle, fetchedSwizzle, JNI_ABORT);
	$<Builder*>(env _$ ptr)->accessChainPushSwizzle(*swizzleArr, preSwizzleBaseType, *$<Builder::AccessChain::CoherentFlags*>(env _$ coherentFlags), alignment);
	delete swizzleArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1accessChainPushComponent
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong component, jlong preSwizzleBaseType, jbyteArray coherentFlags, jlong alignment){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->accessChainPushComponent(component, preSwizzleBaseType, *$<Builder::AccessChain::CoherentFlags*>(env _$ coherentFlags), alignment);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1accessChainStore
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong rValue, jint memoryAccess, jint scope, jlong alignment){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->accessChainStore(rValue, $<MemoryAccessMask>(memoryAccess), $<Scope>(scope), alignment);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1accessChainLoad
  (JNIEnv* env, jclass self, jbyteArray ptr, jint precision, jint nonUniform, jlong ResultType, jint memoryAccess, jint scope, jlong alignment){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->accessChainLoad($<Decoration>(precision), $<Decoration>(nonUniform), ResultType, $<MemoryAccessMask>(memoryAccess), $<Scope>(scope), alignment);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isSpvLvalue
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isSpvLvalue();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1accessChainGetLValue
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->accessChainGetLValue();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1accessChainGetInferredType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->accessChainGetInferredType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1postProcess___3B
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->postProcess();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1postProcessCFG
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->postProcessCFG();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1postProcessFeatures
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->postProcessFeatures();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1postProcess___3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray instruction){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->postProcess(*$<Instruction*>(env _$ instruction));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1postProcessType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray instruction, jlong typeId){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->postProcessType(*$<Instruction*>(env _$ instruction), typeId);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1dump
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray out){
	JNI_METHOD_GUARD_ENTER
	std::vector<unsigned int> outRef;
	$<Builder*>(env _$ ptr)->dump(outRef);
	jlongArray outRet = env->NewLongArray(outRef.size());
	std::vector<jlong>* outRefCpy = toJlongVector(&(outRef[0]), outRef.size());
	env->SetLongArrayRegion(outRet, 0, outRef.size(), (jlong*) &((*outRefCpy)[0]));
	delete outRefCpy;
	env->SetObjectArrayElement(out, 0, (jobject) outRet);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1createBranch
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray block){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->createBranch($<Block*>(env _$ block));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1createConditionalBranch
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong condition, jbyteArray thenBlock, jbyteArray elseBlock){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->createConditionalBranch(condition, $<Block*>(env _$ thenBlock), $<Block*>(env _$ elseBlock));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1createLoopMerge
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray mergeBlock, jbyteArray continueBlock, jlong control, jlongArray operands){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedOperands = env->GetLongArrayElements(operands, nullptr);
	std::vector<unsigned int>* operandsArr = toUnsignedIntVector(fetchedOperands, env->GetArrayLength(operands));
	env->ReleaseLongArrayElements(operands, fetchedOperands, JNI_ABORT);
	$<Builder*>(env _$ ptr)->createLoopMerge($<Block*>(env _$ mergeBlock), $<Block*>(env _$ continueBlock), control, *operandsArr);
	delete operandsArr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1setToSpecConstCodeGenMode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->setToSpecConstCodeGenMode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1setToNormalCodeGenMode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder*>(env _$ ptr)->setToNormalCodeGenMode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1isInSpecConstCodeGenMode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder*>(env _$ ptr)->isInSpecConstCodeGenMode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<Builder::TextureParameters*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters__JJJJJJJJJJJJJJJZZ
  (JNIEnv* env, jclass self, jlong sampler, jlong coords, jlong bias, jlong lod, jlong Dref, jlong offset, jlong offsets, jlong gradX, jlong gradY, jlong sample, jlong component, jlong texelOut, jlong lodClamp, jlong granularity, jlong coarse, jboolean nonprivate, jboolean volatil){
	JNI_METHOD_GUARD_ENTER
	Builder::TextureParameters* ret = Pool_malloc($<Builder::TextureParameters*>(nullptr));
	ret->sampler = sampler;
	ret->coords = coords;
	ret->bias = bias;
	ret->lod = lod;
	ret->Dref = Dref;
	ret->offset = offset;
	ret->offsets = offsets;
	ret->gradX = gradX;
	ret->gradY = gradY;
	ret->sample = sample;
	ret->component = component;
	ret->texelOut = texelOut;
	ret->lodClamp = lodClamp;
	ret->granularity = granularity;
	ret->coarse = coarse;
	ret->nonprivate = nonprivate;
	ret->volatil = volatil;
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setSampler
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->sampler = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setCoords
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->coords = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setBias
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->bias = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setLod
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->lod = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setDref
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->Dref = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setOffset
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->offset = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setOffsets
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->offsets = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setGradX
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->gradX = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setGradY
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->gradY = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setSample
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->sample = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setComponent
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->component = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setLodClamp
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->lodClamp = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setGranularity
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->granularity = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setCoarse
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->coarse = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setNonprivate
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->nonprivate = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1setVolatil
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::TextureParameters*>(env _$ ptr)->volatil = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getSampler
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->sampler;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getCoords
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->coords;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getBias
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->bias;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getLod
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->lod;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getDref
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->Dref;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getOffset
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->offset;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getOffsets
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->offsets;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getGradX
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->gradX;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getGradY
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->gradY;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getSample
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->sample;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getComponent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->component;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getLodClamp
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->lodClamp;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getGranularity
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->granularity;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getCoarse
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->coarse;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getNonprivate
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->nonprivate;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1TextureParameters_1getVolatil
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::TextureParameters*>(env _$ ptr)->volatil;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1If
  (JNIEnv* env, jclass self, jlong condition, jlong ctrl, jbyteArray builder){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_mallocIndirect($<Builder::If*>(nullptr), &condition, &ctrl, $<Builder*>(env _$ builder));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1If_1makeBeginElse
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder::If*>(env _$ ptr)->makeBeginElse();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1If_1makeEndIf
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder::If*>(env _$ ptr)->makeEndIf();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1LoopBlocks
  (JNIEnv* env, jclass self, jbyteArray head, jbyteArray body, jbyteArray merge, jbyteArray continue_target){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_mallocIndirect($<Builder::LoopBlocks*>(nullptr), $<Block*>(env _$ head), $<Block*>(env _$ body), $<Block*>(env _$ merge), $<Block*>(env _$ continue_target));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1LoopBlocks_1getHead
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Builder::LoopBlocks*>(env _$ ptr)->head;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1LoopBlocks_1getBody
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Builder::LoopBlocks*>(env _$ ptr)->body;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1LoopBlocks_1getMerge
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Builder::LoopBlocks*>(env _$ ptr)->merge;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1LoopBlocks_1getContinue_1target
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Builder::LoopBlocks*>(env _$ ptr)->continue_target;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<Builder::AccessChain*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain__J_3JJ_3JJJZJ_3B
  (JNIEnv* env, jclass self, jlong base, jlongArray indexChain, jlong instr, jlongArray swizzle, jlong component, jlong preSwizzleBaseType, jboolean isRValue, jlong alignment, jbyteArray coherentFlags){
	JNI_METHOD_GUARD_ENTER
	Builder::AccessChain* ret = Pool_malloc($<Builder::AccessChain*>(nullptr));
	ret->base = base;
	jlong* fetchedIndexChain = (jlong*) env->GetLongArrayElements(swizzle, nullptr);
	std::vector<Id>* indexChainArr = nullptr;
	indexChainArr = Pool_mallocRegister(indexChainArr, ret);
	int indexChainLength = env->GetArrayLength(indexChain);
	for(int i=0;i<indexChainLength;++i){
		indexChainArr->push_back((Id)fetchedIndexChain[i]);
	}
	ret->indexChain = *indexChainArr;
	env->ReleaseLongArrayElements(swizzle, (jlong*) fetchedIndexChain, JNI_ABORT);
	ret->instr = instr;
	jlong* fetchedSwizzle =  env->GetLongArrayElements(swizzle, nullptr);
	std::vector<unsigned>* swizzleArr = nullptr;
	swizzleArr = Pool_mallocRegister(swizzleArr, ret);
	int swizzleLength = env->GetArrayLength(swizzle);
	for(int i=0;i<swizzleLength;++i){
		swizzleArr->push_back((unsigned)fetchedSwizzle[i]);
	}
	ret->swizzle = *swizzleArr;
	env->ReleaseLongArrayElements(swizzle, (jlong*) fetchedSwizzle, JNI_ABORT);
	ret->component = component;
	ret->preSwizzleBaseType = preSwizzleBaseType;
	ret->isRValue = isRValue;
	ret->alignment = alignment;
	ret->coherentFlags = *$<Builder::AccessChain::CoherentFlags*>(env _$ coherentFlags);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1setBase
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain*>(env _$ ptr)->base = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1setIndexChain
  (JNIEnv* env, jclass self, jbyteArray ptr, jlongArray v){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedV = (jlong*) env->GetLongArrayElements(v, nullptr);
	std::vector<Id>* vArr = nullptr;
	vArr = Pool_mallocRegister(vArr, $<Builder::AccessChain*>(env _$ ptr));
	int vLength = env->GetArrayLength(v);
	for(int i=0;i<vLength;++i){
		vArr->push_back((Id)fetchedV[i]);
	}
	$<Builder::AccessChain*>(env _$ ptr)->indexChain = *vArr;
	env->ReleaseLongArrayElements(v, (jlong*) fetchedV, JNI_ABORT);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1setInstr
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain*>(env _$ ptr)->instr = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1setSwizzle
  (JNIEnv* env, jclass self, jbyteArray ptr, jlongArray v){
	JNI_METHOD_GUARD_ENTER
	jlong* fetchedV = (jlong*) env->GetLongArrayElements(v, nullptr);
	std::vector<unsigned>* vArr = nullptr;
	vArr = Pool_mallocRegister(vArr, $<Builder::AccessChain*>(env _$ ptr));
	int vLength = env->GetArrayLength(v);
	for(int i=0;i<vLength;++i){
		vArr->push_back((unsigned)fetchedV[i]);
	}
	$<Builder::AccessChain*>(env _$ ptr)->swizzle = *vArr;
	env->ReleaseLongArrayElements(v, (jlong*) fetchedV, JNI_ABORT);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1setComponent
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain*>(env _$ ptr)->component = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1setPreSwizzleBaseType
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain*>(env _$ ptr)->preSwizzleBaseType = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1setIsRValue
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain*>(env _$ ptr)->isRValue = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1setAlignment
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain*>(env _$ ptr)->alignment = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1setCoherentFlags
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain*>(env _$ ptr)->coherentFlags = *$<Builder::AccessChain::CoherentFlags*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1getBase
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain*>(env _$ ptr)->base;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlongArray JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1getIndexChain
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	jlongArray ret = env->NewLongArray($<Builder::AccessChain*>(env _$ ptr)->indexChain.size());
	std::vector<jlong>* indexChainCpy = toJlongVector(&($<Builder::AccessChain*>(env _$ ptr)->indexChain[0]), $<Builder::AccessChain*>(env _$ ptr)->indexChain.size());
	env->SetLongArrayRegion(ret, 0 , $<Builder::AccessChain*>(env _$ ptr)->indexChain.size(), (jlong*) &((*indexChainCpy)[0]));
	delete indexChainCpy;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1getInstr
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain*>(env _$ ptr)->instr;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlongArray JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1getSwizzle
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	jlongArray ret = env->NewLongArray($<Builder::AccessChain*>(env _$ ptr)->swizzle.size());
	std::vector<jlong>* swizzleCpy = toJlongVector(&($<Builder::AccessChain*>(env _$ ptr)->swizzle[0]), $<Builder::AccessChain*>(env _$ ptr)->swizzle.size());
	env->SetLongArrayRegion(ret, 0 , $<Builder::AccessChain*>(env _$ ptr)->swizzle.size(), (jlong*) &((*swizzleCpy)[0]));
	delete swizzleCpy;
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1getComponent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain*>(env _$ ptr)->component;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1getPreSwizzleBaseType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain*>(env _$ ptr)->preSwizzleBaseType;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1getIsRValue
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain*>(env _$ ptr)->isRValue;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1getAlignment
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain*>(env _$ ptr)->alignment;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1getCoherentFlags
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Builder::AccessChain*>(env _$ ptr)->coherentFlags;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<Builder::AccessChain::CoherentFlags*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1isVolatile
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->isVolatile();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1operatorBitwiseOrAssign
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<Builder::AccessChain::CoherentFlags*>(env _$ ptr) |= *$<Builder::AccessChain::CoherentFlags*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1anyCoherent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->anyCoherent();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1clear
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->clear();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1setCoherent
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->coherent = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1setDevicecoherent
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->devicecoherent = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1setQueuefamilycoherent
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->queuefamilycoherent = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1setWorkgroupcoherent
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->workgroupcoherent = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1setSubgroupcoherent
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->subgroupcoherent = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1setShadercallcoherent
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->shadercallcoherent = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1setNonprivate
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->nonprivate = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1setVolatil
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->volatil = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1setIsImage
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->isImage = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1getCoherent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->coherent;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1getDevicecoherent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->devicecoherent;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1getQueuefamilycoherent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->queuefamilycoherent;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1getWorkgroupcoherent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->workgroupcoherent;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1getSubgroupcoherent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->subgroupcoherent;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1getShadercallcoherent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->shadercallcoherent;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1getNonprivate
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->nonprivate;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1getVolatil
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->volatil;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Builder_1AccessChain_1CoherentFlags_1getIsImage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Builder::AccessChain::CoherentFlags*>(env _$ ptr)->isImage;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_SpvOptions
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<glslang::SpvOptions*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpvOptions_1setGenerateDebugInfo
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<glslang::SpvOptions*>(env _$ ptr)->generateDebugInfo = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpvOptions_1setStripDebugInfo
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<glslang::SpvOptions*>(env _$ ptr)->stripDebugInfo = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpvOptions_1setDisableOptimizer
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<glslang::SpvOptions*>(env _$ ptr)->disableOptimizer = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpvOptions_1setOptimizeSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<glslang::SpvOptions*>(env _$ ptr)->optimizeSize = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpvOptions_1setDisassemble
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<glslang::SpvOptions*>(env _$ ptr)->disassemble = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_SpvOptions_1setValidate
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<glslang::SpvOptions*>(env _$ ptr)->validate = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_SpvOptions_1getGenerateDebugInfo
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<glslang::SpvOptions*>(env _$ ptr)->generateDebugInfo;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_SpvOptions_1getStripDebugInfo
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<glslang::SpvOptions*>(env _$ ptr)->stripDebugInfo;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_SpvOptions_1getDisableOptimizer
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<glslang::SpvOptions*>(env _$ ptr)->disableOptimizer;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_SpvOptions_1getOptimizeSize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<glslang::SpvOptions*>(env _$ ptr)->optimizeSize;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_SpvOptions_1getDisassemble
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<glslang::SpvOptions*>(env _$ ptr)->disassemble;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_SpvOptions_1getValidate
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<glslang::SpvOptions*>(env _$ ptr)->validate;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_OperandParameters
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<OperandParameters*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_OperandParameters_1push
  (JNIEnv* env, jclass self, jbyteArray ptr, jint oc, jstring d, jboolean opt){
	JNI_METHOD_GUARD_ENTER
	$<OperandParameters*>(env _$ ptr)->push($<OperandClass>(oc), toChars(env, d), opt);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_OperandParameters_1setOptional
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	//$<OperandParameters*>(env _$ ptr)->setOptional();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_OperandParameters_1getClass
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op){
	JNI_METHOD_GUARD_ENTER
	return $<OperandParameters*>(env _$ ptr)->getClass(op);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_OperandParameters_1getDesc
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<OperandParameters*>(env _$ ptr)->getDesc(op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_OperandParameters_1isOptional
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op){
	JNI_METHOD_GUARD_ENTER
	return $<OperandParameters*>(env _$ ptr)->isOptional(op);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_OperandParameters_1getNum
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<OperandParameters*>(env _$ ptr)->getNum();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_EnumParameters
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<EnumParameters*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_EnumParameters_1setDesc
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring v){
	JNI_METHOD_GUARD_ENTER
	$<EnumParameters*>(env _$ ptr)->desc = toChars(env, v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_EnumParameters_1getDesc
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<EnumParameters*>(env _$ ptr)->desc);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_EnumDefinition
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<EnumDefinition*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_EnumDefinition_1set
  (JNIEnv* env, jclass self, jbyteArray ptr, jint ceil, jobject func, jbyteArray ep, jboolean mask){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);//Dynamic function pointers are not supported, so this Function cannot be implemented(Not safely)
	/*EnumDefinition* elem = $<EnumDefinition*>(env _$ ptr);
	GlobalRef* ref = nullptr;
	ref = Pool_mallocRegister(ref, elem);
	ref->setRef(func);
	jobject funcRef = ref->getRef();
	std::function<const char*(JNIEnv*, int)> tmp([funcRef](JNIEnv* env, int i){
		jclass clazz = env->FindClassJAVA_PACKAGE_PATH(/Main$String_Int));
		jmethodID id = env->GetMethodID(clazz, "op", "(I)Ljava/lang/String;");
		return toChars(env, (jstring) env->CallObjectMethod(funcRef, id, i));
	});
	std::function<const char*(int)>* cFunc = createCallback(tmp, elem);
	getNameMap.insert_or_assign(elem, cFunc);
	elem->set(ceil, &getName, $<EnumParameters*>(env _$ ep), mask);
	*/
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_EnumDefinition_1setOperands
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray op){
	JNI_METHOD_GUARD_ENTER
	$<EnumDefinition*>(env _$ ptr)->setOperands($<OperandParameters*>(env _$ op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_EnumDefinition_1setCeiling
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<EnumDefinition*>(env _$ ptr)->ceiling = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_EnumDefinition_1setBitmask
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<EnumDefinition*>(env _$ ptr)->bitmask = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_EnumDefinition_1setGetName
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject v){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);//Dynamic function pointers are not supported, so this Function cannot be implemented(Not safely)
	/*EnumDefinition* elem = $<EnumDefinition*>(env _$ ptr);
	GlobalRef* ref = nullptr;
	ref = Pool_mallocRegister(ref, elem);
	ref->setRef(v);
	jobject funcRef = ref->getRef();
	std::function<const char*(JNIEnv*, int)> tmp([funcRef](JNIEnv* env, int i){
		jclass clazz = env->FindClass(JAVA_PACKAGE_PATH(/Main$String_Int));
		jmethodID id = env->GetMethodID(clazz, "op", "(I)Ljava/lang/String;");
		return toChars(env, (jstring) env->CallObjectMethod(funcRef, id, i));
	});
	std::function<const char*(int)>* cFunc = createCallback(tmp, elem);
	getNameMap.insert_or_assign(std::make_pair(elem, cFunc));
	elem->getName = &getName;*/
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_EnumDefinition_1setEnumParams
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<EnumDefinition*>(env _$ ptr)->enumParams = $<EnumParameters*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_EnumDefinition_1setOperandParams
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<EnumDefinition*>(env _$ ptr)->operandParams = $<OperandParameters*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_EnumDefinition_1getCeiling
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<EnumDefinition*>(env _$ ptr)->ceiling;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_EnumDefinition_1getBitmask
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<EnumDefinition*>(env _$ ptr)->bitmask;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_EnumDefinition_1getGetName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_mallocRegister($<std::function<const char*(int)>*>(nullptr), $<EnumDefinition*>(env _$ ptr), $<EnumDefinition*>(env _$ ptr)->getName);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_EnumDefinition_1getEnumParams
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<EnumDefinition*>(env _$ ptr)->enumParams;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_EnumDefinition_1getOperandParams
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<EnumDefinition*>(env _$ ptr)->operandParams;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_InstructionParameters
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<InstructionParameters*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_InstructionParameters_1setResultAndType
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean r, jboolean t){
	JNI_METHOD_GUARD_ENTER
	$<InstructionParameters*>(env _$ ptr)->setResultAndType(r, t);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_InstructionParameters_1hasResult
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<InstructionParameters*>(env _$ ptr)->hasResult();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_InstructionParameters_1hasType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<InstructionParameters*>(env _$ ptr)->hasType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_InstructionParameters_1setOpDesc
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring v){
	JNI_METHOD_GUARD_ENTER
	$<InstructionParameters*>(env _$ ptr)->opDesc = toChars(env, v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_InstructionParameters_1setOpClass
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<InstructionParameters*>(env _$ ptr)->opClass = $<OpcodeClass>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_InstructionParameters_1setOperands
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<InstructionParameters*>(env _$ ptr)->operands = *$<OperandParameters*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_InstructionParameters_1getOpDesc
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<InstructionParameters*>(env _$ ptr)->opDesc);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_InstructionParameters_1getOpClass
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<InstructionParameters*>(env _$ ptr)->opClass;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_InstructionParameters_1getOperands
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<InstructionParameters*>(env _$ ptr)->operands;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_IdImmediate
  (JNIEnv* env, jclass self, jboolean i, jlong w){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<IdImmediate*>(nullptr), i, w);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_IdImmediate_1setIsId
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<IdImmediate*>(env _$ ptr)->isId = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_IdImmediate_1setWord
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<IdImmediate*>(env _$ ptr)->word = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_IdImmediate_1getIsId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<IdImmediate*>(env _$ ptr)->isId;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_IdImmediate_1getWord
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<IdImmediate*>(env _$ ptr)->word;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Instruction__JJI
  (JNIEnv* env, jclass self, jlong resultId, jlong typeId, jint opCode){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<Instruction*>(nullptr), resultId, typeId, $<Op>(opCode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Instruction__I
  (JNIEnv* env, jclass self, jint opCode){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<Instruction*>(nullptr), $<Op>(opCode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Instruction_1addIdOperand
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	$<Instruction*>(env _$ ptr)->addIdOperand(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Instruction_1addImmediateOperand
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong immediate){
	JNI_METHOD_GUARD_ENTER
	$<Instruction*>(env _$ ptr)->addImmediateOperand(immediate);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Instruction_1setImmediateOperand
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong idx, jlong immediate){
	JNI_METHOD_GUARD_ENTER
	$<Instruction*>(env _$ ptr)->setImmediateOperand(idx, immediate);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Instruction_1addStringOperand
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring str){
	JNI_METHOD_GUARD_ENTER
	$<Instruction*>(env _$ ptr)->addStringOperand(toChars(env, str));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Instruction_1isIdOperand
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op){
	JNI_METHOD_GUARD_ENTER
	return $<Instruction*>(env _$ ptr)->isIdOperand(op);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Instruction_1setBlock
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray b){
	JNI_METHOD_GUARD_ENTER
	$<Instruction*>(env _$ ptr)->setBlock($<Block*>(env _$ b));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Instruction_1getBlock
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Instruction*>(env _$ ptr)->getBlock();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Instruction_1getOpCode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Instruction*>(env _$ ptr)->getOpCode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Instruction_1getNumOperands
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Instruction*>(env _$ ptr)->getNumOperands();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Instruction_1getResultId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Instruction*>(env _$ ptr)->getResultId();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Instruction_1getTypeId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Instruction*>(env _$ ptr)->getTypeId();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Instruction_1getIdOperand
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op){
	JNI_METHOD_GUARD_ENTER
	return $<Instruction*>(env _$ ptr)->getIdOperand(op);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Instruction_1getImmediateOperand
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op){
	JNI_METHOD_GUARD_ENTER
	return $<Instruction*>(env _$ ptr)->getIdOperand(op);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Instruction_1dump
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray out){
	JNI_METHOD_GUARD_ENTER
	std::vector<unsigned int> outRef;
	$<Instruction*>(env _$ ptr)->dump(outRef);
	jlongArray outRet = env->NewLongArray(outRef.size());
	std::vector<jlong>* outRefCpy = toJlongVector(&(outRef[0]), outRef.size());
	env->SetLongArrayRegion(outRet, 0, outRef.size(), (jlong*) &((*outRefCpy)[0]));
	delete outRefCpy;
	env->SetObjectArrayElement(out, 0, (jobject) outRet);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Block
  (JNIEnv* env, jclass self, jlong id, jbyteArray parent){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_mallocIndirect($<Block*>(nullptr), &id, $<Function*>(env _$ parent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Block_1getId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Block*>(env _$ ptr)->getId();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Block_1getParent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Block*>(env _$ ptr)->getParent();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Block_1addInstruction
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray inst){
	JNI_METHOD_GUARD_ENTER
	Block* elem = $<Block*>(env _$ ptr);
	std::unique_ptr<Instruction>* instUnique = nullptr;
	instUnique = Pool_mallocRegister(instUnique, elem, $<Instruction*>(env _$ inst));
	elem->addInstruction(std::move(*instUnique));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Block_1addPredecessor
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray pred){
	JNI_METHOD_GUARD_ENTER
	$<Block*>(env _$ ptr)->addPredecessor($<Block*>(env _$ pred));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Block_1addLocalVariable
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray inst){
	JNI_METHOD_GUARD_ENTER
	Block* elem = $<Block*>(env _$ ptr);
	std::unique_ptr<Instruction>* instUnique = nullptr;
	instUnique = Pool_mallocRegister(instUnique, elem, $<Instruction*>(env _$ inst));
	elem->addLocalVariable(std::move(*instUnique));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Block_1getPredecessors
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Block*>(env _$ ptr)->getPredecessors();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Block_1getSuccessors
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Block*>(env _$ ptr)->getSuccessors();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Block_1getInstructions
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Block*>(env _$ ptr)->getInstructions();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Block_1getLocalVariables
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Block*>(env _$ ptr)->getLocalVariables();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Block_1setUnreachable
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Block*>(env _$ ptr)->setUnreachable();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Block_1isUnreachable
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Block*>(env _$ ptr)->isUnreachable();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Block_1getMergeInstruction
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Block*>(env _$ ptr)->getMergeInstruction();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Block_1rewriteAsCanonicalUnreachableMerge
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Block*>(env _$ ptr)->rewriteAsCanonicalUnreachableMerge();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Block_1rewriteAsCanonicalUnreachableContinue
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray header){
	JNI_METHOD_GUARD_ENTER
	$<Block*>(env _$ ptr)->rewriteAsCanonicalUnreachableContinue($<Block*>(env _$ header));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Block_1isTerminated
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Block*>(env _$ ptr)->isTerminated();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Block_1dump
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray out){
	JNI_METHOD_GUARD_ENTER
	std::vector<unsigned int> outRef;
	$<Block*>(env _$ ptr)->dump(outRef);
	jlongArray outRet = env->NewLongArray(outRef.size());
	std::vector<jlong>* outRefCpy = toJlongVector(&(outRef[0]), outRef.size());
	env->SetLongArrayRegion(outRet, 0, outRef.size(), (jlong*) &((*outRefCpy)[0]));
	delete outRefCpy;
	env->SetObjectArrayElement(out, 0, (jobject) outRet);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Function
  (JNIEnv* env, jclass self, jlong id, jlong resultType, jlong functionType, jlong firstParam, jbyteArray parent){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_mallocIndirect($<Function*>(nullptr), &id, &resultType, &functionType, &firstParam, $<Module*>(env _$ parent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Function_1getId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Function*>(env _$ ptr)->getId();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Function_1getParamId
  (JNIEnv* env, jclass self, jbyteArray ptr, jint p){
	JNI_METHOD_GUARD_ENTER
	return $<Function*>(env _$ ptr)->getParamId(p);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Function_1getParamType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint p){
	JNI_METHOD_GUARD_ENTER
	return $<Function*>(env _$ ptr)->getParamType(p);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Function_1addBlock
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray block){
	JNI_METHOD_GUARD_ENTER
	$<Function*>(env _$ ptr)->addBlock($<Block*>(env _$ block));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Function_1removeBlock
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray block){
	JNI_METHOD_GUARD_ENTER
	$<Function*>(env _$ ptr)->removeBlock($<Block*>(env _$ block));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Function_1getParent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Function*>(env _$ ptr)->getParent();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Function_1getEntryBlock
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Function*>(env _$ ptr)->getEntryBlock();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Function_1getLastBlock
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Function*>(env _$ ptr)->getLastBlock();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Function_1getBlocks
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Function*>(env _$ ptr)->getBlocks();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Function_1addLocalVariable
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray inst){
	JNI_METHOD_GUARD_ENTER
	Function* elem = $<Function*>(env _$ ptr);
	std::unique_ptr<Instruction>* instUnique = nullptr;
	instUnique = Pool_mallocRegister(instUnique, elem, $<Instruction*>(env _$ inst));
	elem->addLocalVariable(std::move(*instUnique));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Function_1getReturnType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Function*>(env _$ ptr)->getReturnType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Function_1setReturnPrecision
  (JNIEnv* env, jclass self, jbyteArray ptr, jint precision){
	JNI_METHOD_GUARD_ENTER
	$<Function*>(env _$ ptr)->setReturnPrecision($<Decoration>(precision));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Function_1getReturnPrecision
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Function*>(env _$ ptr)->getReturnPrecision();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Function_1setImplicitThis
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<Function*>(env _$ ptr)->setImplicitThis();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_Function_1hasImplicitThis
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<Function*>(env _$ ptr)->hasImplicitThis();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Function_1addParamPrecision
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong param, jint precision){
	JNI_METHOD_GUARD_ENTER
	$<Function*>(env _$ ptr)->addParamPrecision(param, $<Decoration>(precision));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Function_1getParamPrecision
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong param){
	JNI_METHOD_GUARD_ENTER
	return $<Function*>(env _$ ptr)->getParamPrecision(param);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Function_1dump
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray out){
	JNI_METHOD_GUARD_ENTER
	std::vector<unsigned int> outRef;
	$<Function*>(env _$ ptr)->dump(outRef);
	jlongArray outRet = env->NewLongArray(outRef.size());
	std::vector<jlong>* outRefCpy = toJlongVector(&(outRef[0]), outRef.size());
	env->SetLongArrayRegion(outRet, 0, outRef.size(), (jlong*) &((*outRefCpy)[0]));
	delete outRefCpy;
	env->SetObjectArrayElement(out, 0, (jobject) outRet);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Module
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<Module*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Module_1addFunction
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray fun){
	JNI_METHOD_GUARD_ENTER
	$<Module*>(env _$ ptr)->addFunction($<Function*>(env _$ fun));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Module_1mapInstruction
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray instruction){
	JNI_METHOD_GUARD_ENTER
	$<Module*>(env _$ ptr)->mapInstruction($<Instruction*>(env _$ instruction));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Module_1getInstruction
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong id){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Module*>(env _$ ptr)->getInstruction(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_Module_1getFunctions
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<Module*>(env _$ ptr)->getFunctions();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_Module_1getTypeId
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong resultId){
	JNI_METHOD_GUARD_ENTER
	return $<Module*>(env _$ ptr)->getTypeId(resultId);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_Module_1getStorageClass
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong typeId){
	JNI_METHOD_GUARD_ENTER
	return $<Module*>(env _$ ptr)->getStorageClass(typeId);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_Module_1dump
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray out){
	JNI_METHOD_GUARD_ENTER
	std::vector<unsigned int> outRef;
	$<Module*>(env _$ ptr)->dump(outRef);
	jlongArray outRet = env->NewLongArray(outRef.size());
	std::vector<jlong>* outRefCpy = toJlongVector(&(outRef[0]), outRef.size());
	env->SetLongArrayRegion(outRet, 0, outRef.size(), (jlong*) &((*outRefCpy)[0]));
	delete outRefCpy;
	env->SetObjectArrayElement(out, 0, (jobject) outRet);
	JNI_METHOD_GUARD_LEAVE
}
