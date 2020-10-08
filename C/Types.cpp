
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/Include/Types.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSampler
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TSampler*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1is1D
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->is1D();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1isBuffer
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->isBuffer();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1isRect
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->isRect();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1isSubpass
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->isSubpass();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1isCombined
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->isCombined();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1isImage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->isImage();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1isImageClass
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->isImageClass();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1isMultiSample
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->isMultiSample();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1isExternal
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->isExternal();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setExternal
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->setExternal(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1isYuv
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->isYuv();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1isTexture
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->isTexture();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1isPureSampler
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->isPureSampler();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setCombined
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->setCombined(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setBasicType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->setBasicType($<TBasicType>(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TSampler_1getBasicType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->getBasicType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1isShadow
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->isShadow();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1isArrayed
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->isArrayed();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1clear
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->clear();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1set
  (JNIEnv* env, jclass self, jbyteArray ptr, jint t, jint d, jboolean a, jboolean s, jboolean m){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->set($<TBasicType>(t), $<TSamplerDim>(d), a, s, m);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setImage___3BIIZZZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jint t, jint d, jboolean a, jboolean s, jboolean m){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->setImage($<TBasicType>(t), $<TSamplerDim>(d), a, s, m);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setTexture
  (JNIEnv* env, jclass self, jbyteArray ptr, jint t, jint d, jboolean a, jboolean s, jboolean m){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->setTexture($<TBasicType>(t), $<TSamplerDim>(d), a, s, m);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setPureSampler
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->setPureSampler(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setSubpass
  (JNIEnv* env, jclass self, jbyteArray ptr, jint t, jboolean m){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->setSubpass($<TBasicType>(t), m);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setArrayed
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->arrayed = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setShadow
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->shadow = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setMs
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->ms = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setImage___3BZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->image = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setSampler
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->sampler = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setYuv
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->yuv = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setDim
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->dim = $<TSamplerDim>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setVectorSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->vectorSize = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSampler_1setStructReturnIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TSampler*>(env _$ ptr)->structReturnIndex = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TSampler_1getDim
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->dim;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TSampler_1getStructReturnIndex
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->structReturnIndex;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TSampler_1getVectorSize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSampler*>(env _$ ptr)->vectorSize;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TSampler_1getStructReturnIndexBits
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TSampler::structReturnIndexBits;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TSampler_1getStructReturnSlots
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TSampler::structReturnSlots;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TSampler_1getNoReturnStruct
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TSampler::noReturnStruct;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1operatorEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TSampler*>(env _$ ptr) == *$<TSampler*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSampler_1operatorNotEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TSampler*>(env _$ ptr) != *$<TSampler*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TTypeLoc__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TTypeLoc*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TTypeLoc___3B_3B
  (JNIEnv* env, jclass self, jbyteArray type, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	TTypeLoc* ret = Pool_malloc($<TTypeLoc*>(nullptr));
	ret->type = $<TType*>(env _$ type);
	ret->loc = *$<TSourceLoc*>(env _$ loc);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TTypeLoc_1setType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TTypeLoc*>(env _$ ptr)->type = $<TType*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TTypeLoc_1setLoc
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TTypeLoc*>(env _$ ptr)->loc = *$<TSourceLoc*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TTypeLoc_1getType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TTypeLoc*>(env _$ ptr)->type;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TTypeLoc_1getLoc
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TTypeLoc*>(env _$ ptr)->loc;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TQualifier
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TQualifier*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1clear
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->clear();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1makeTemporary
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->makeTemporary();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1clearInterstage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->clearInterstage();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1clearInterpolation
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->clearInterpolation();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1clearMemory
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->clearMemory();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isWriteOnly
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isWriteOnly();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isReadOnly
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isReadOnly();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isRestrict
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isRestrict();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isCoherent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isCoherent();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isVolatile
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isVolatile();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isSample
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isSample();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isMemory
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isMemory();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isMemoryQualifierImageAndSSBOOnly
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isMemoryQualifierImageAndSSBOOnly();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1bufferReferenceNeedsVulkanMemoryModel
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->bufferReferenceNeedsVulkanMemoryModel();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isInterpolation
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isInterpolation();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isExplicitInterpolation
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isExplicitInterpolation();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isAuxiliary
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isAuxiliary();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isPatch
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isPatch();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isNoContraction
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isNoContraction();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setNoContraction
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->setNoContraction();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isPervertexNV
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isPervertexNV();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isPipeInput
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isPipeInput();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isPipeOutput
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isPipeOutput();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isParamInput
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isParamInput();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isParamOutput
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isParamOutput();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isUniformOrBuffer
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isUniformOrBuffer();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isIo
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isIo();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isLinkable
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isLinkable();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isPerPrimitive
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isPerPrimitive();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isPerView
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isPerView();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isTaskMemory
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isTaskMemory();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isArrayedIo
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isArrayedIo($<EShLanguage>(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1clearLayout
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->clearLayout();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1clearInterstageLayout
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->clearInterstageLayout();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1clearStreamLayout
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->clearStreamLayout();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1clearXfbLayout
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->clearXfbLayout();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasNonXfbLayout
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasNonXfbLayout();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasLayout
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasLayout();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasUniformLayout
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasUniformLayout();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1clearUniformLayout
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->clearUniformLayout();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasMatrix
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasMatrix();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasPacking
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasPacking();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasAlign
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasAlign();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasAnyLocation
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasAnyLocation();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasLocation
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasLocation();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasSet
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasSet();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasBinding
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasBinding();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasOffset
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasOffset();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isNonPerspective
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isNonPerspective();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasIndex
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasIndex();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getIndex
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->getIndex();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasComponent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasComponent();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasStream
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasStream();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasFormat
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasFormat();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasXfb
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasXfb();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasXfbBuffer
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasXfbBuffer();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasXfbStride
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasXfbStride();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasXfbOffset
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasXfbOffset();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasAttachment
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasAttachment();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TQualifier_1getFormat
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->getFormat();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isPushConstant
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isPushConstant();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isShaderRecord
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isShaderRecord();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasBufferReference
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasBufferReference();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasBufferReferenceAlign
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasBufferReferenceAlign();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isNonUniform
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isNonUniform();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1hasSpecConstantId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->hasSpecConstantId();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isSpecConstant
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isSpecConstant();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isFrontEndConstant
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isFrontEndConstant();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1isConstant
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->isConstant();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1makeSpecConstant
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->makeSpecConstant();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setSemanticName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->semanticName = toChars(env, v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setStorage
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->storage = $<TStorageQualifier>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setBuiltIn
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->builtIn = $<TBuiltInVariable>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setDeclaredBuiltIn
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->declaredBuiltIn = $<TBuiltInVariable>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setPrecision
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->precision = $<TPrecisionQualifier>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setInvariant
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->invariant = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setCentroid
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->centroid = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setSmooth
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->smooth = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setFlat
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->flat = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setSpecConstant
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->specConstant = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setNonUniform
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->nonUniform = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setExplicitOffset
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->explicitOffset = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setNopersp
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->nopersp = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setExplicitInterp
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->explicitInterp = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setPervertexNV
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->pervertexNV = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setPerPrimitiveNV
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->perPrimitiveNV = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setPerViewNV
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->perViewNV = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setPerTaskNV
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->perTaskNV = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setPatch
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->patch = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setSample
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->sample = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setRestrict
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->restrict = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setReadonly
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->readonly = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setWriteonly
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->writeonly = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setCoherent
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->coherent = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setVolatil
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->volatil = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setDevicecoherent
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->devicecoherent = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setQueuefamilycoherent
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->queuefamilycoherent = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setWorkgroupcoherent
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->workgroupcoherent = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setSubgroupcoherent
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->subgroupcoherent = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setShadercallcoherent
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->shadercallcoherent = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setNonprivate
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->nonprivate = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutMatrix
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutMatrix = $<TLayoutMatrix>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutPacking
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutPacking = $<TLayoutPacking>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutOffset
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutOffset = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutAlign
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutAlign = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutLocation
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutLocation = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutComponent
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutComponent = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutSet
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutSet = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutBinding = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutIndex = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutStream
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutStream = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutXfbBuffer
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutXfbBuffer = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutXfbStride
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutXfbStride = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutXfbOffset
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutXfbOffset = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutAttachment
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutAttachment = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutSpecConstantId
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutSpecConstantId = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutBufferReferenceAlign
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutBufferReferenceAlign = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutFormat
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutFormat = $<TLayoutFormat>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutPushConstant
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutPushConstant = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutBufferReference
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutBufferReference = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutPassthrough
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutPassthrough = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutViewportRelative
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutViewportRelative = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutSecondaryViewportRelativeOffset
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutSecondaryViewportRelativeOffset = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TQualifier_1setLayoutShaderRecord
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TQualifier*>(env _$ ptr)->layoutShaderRecord = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TQualifier_1getSemanticName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TQualifier*>(env _$ ptr)->semanticName);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TQualifier_1getStorage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->storage;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TQualifier_1getBuiltIn
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->builtIn;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TQualifier_1getDeclaredBuiltIn
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->declaredBuiltIn;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TQualifier_1getPrecision
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->precision;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getInvariant
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->invariant;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getCentroid
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->centroid;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getSmooth
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->smooth;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getFlat
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->flat;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getSpecConstant
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->specConstant;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getNonUniform
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->nonUniform;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getExplicitOffset
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->explicitOffset;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getNoContraction
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->noContraction;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getNopersp
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->nopersp;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getExplicitInterp
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->explicitInterp;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getPervertexNV
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->pervertexNV;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getPerPrimitiveNV
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->perPrimitiveNV;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getPerViewNV
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->perViewNV;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getPerTaskNV
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->perTaskNV;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getPatch
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->patch;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getSample
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->sample;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getRestrict
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->restrict;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getReadonly
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->readonly;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getWriteonly
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->writeonly;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getCoherent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->coherent;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getVolatil
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->volatil;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getDevicecoherent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->devicecoherent;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getQueuefamilycoherent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->queuefamilycoherent;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getWorkgroupcoherent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->workgroupcoherent;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getSubgroupcoherent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->subgroupcoherent;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getShadercallcoherent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->shadercallcoherent;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getNonprivate
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->nonprivate;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutMatrix
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutMatrix;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutPacking
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutPacking;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutOffset
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutOffset;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutAlign
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutAlign;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutLocation
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutLocation;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutComponent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutComponent;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutSet
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutSet;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutBinding
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutBinding;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutIndex
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutIndex;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutStream
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutStream;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutXfbBuffer
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutXfbBuffer;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutXfbStride
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutXfbStride;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutXfbOffset
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutXfbOffset;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutAttachment
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutAttachment;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutSpecConstantId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutSpecConstantId;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutBufferReferenceAlign
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutBufferReferenceAlign;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutFormat
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutFormat;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutPushConstant
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutPushConstant;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutBufferReference
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutBufferReference;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutPassthrough
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutPassthrough;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutViewportRelative
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutViewportRelative;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutSecondaryViewportRelativeOffset
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutSecondaryViewportRelativeOffset;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutShaderRecord
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TQualifier*>(env _$ ptr)->layoutShaderRecord;
	JNI_METHOD_GUARD_LEAVE
}


JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutLocationEnd
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TQualifier::layoutLocationEnd;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutComponentEnd
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TQualifier::layoutComponentEnd;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutSetEnd
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TQualifier::layoutSetEnd;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutBindingEnd
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TQualifier::layoutBindingEnd;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutIndexEnd
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TQualifier::layoutIndexEnd;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutStreamEnd
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TQualifier::layoutStreamEnd;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutXfbBufferEnd
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TQualifier::layoutXfbBufferEnd;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutXfbStrideEnd
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TQualifier::layoutXfbStrideEnd;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutXfbOffsetEnd
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TQualifier::layoutXfbOffsetEnd;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutAttachmentEnd
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TQualifier::layoutAttachmentEnd;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutSpecConstantIdEnd
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TQualifier::layoutSpecConstantIdEnd;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutBufferReferenceAlignEnd
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return TQualifier::layoutBufferReferenceAlignEnd;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutPackingString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, TQualifier::getLayoutPackingString($<TLayoutPacking>(v)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutMatrixString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, TQualifier::getLayoutMatrixString($<TLayoutMatrix>(v)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutFormatString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, TQualifier::getLayoutFormatString($<TLayoutFormat>(v)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TQualifier_1getLayoutDepthString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, TQualifier::getLayoutDepthString($<TLayoutDepth>(v)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TQualifier_1getBlendEquationString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, TQualifier::getBlendEquationString($<TBlendEquationShift>(v)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TQualifier_1getGeometryString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, TQualifier::getGeometryString($<TLayoutGeometry>(v)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TQualifier_1getVertexSpacingString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, TQualifier::getVertexSpacingString($<TVertexSpacing>(v)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TQualifier_1getVertexOrderString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, TQualifier::getVertexOrderString($<TVertexOrder>(v)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TQualifier_1mapGeometryToSize
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return TQualifier::mapGeometryToSize($<TLayoutGeometry>(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TQualifier_1getInterlockOrderingString
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return toString(env, TQualifier::getInterlockOrderingString($<TInterlockOrdering>(v)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers__IZZIIIIZ_3I_3Z_3IZZIZIIZZZIZ
  (JNIEnv* env, jclass self, jint geometry, jboolean pixelCenterInteger, jboolean originUpperLeft, jint invocations, jint vertices, jint spacing, jint order, jboolean pointMode, jintArray localSize, jbooleanArray localSizeNotDefault, jintArray localSizeSpecId, jboolean earlyFragmentTests, jboolean postDepthCoverage, jint layoutDepth, jboolean blendEquation, jint numViews, jint interlockOrdering, jboolean layoutOverrideCoverage, jboolean layoutDerivativeGroupQuads, jboolean layoutDerivativeGroupLinear, jint primitives, jboolean layoutPrimitiveCulling){
	JNI_METHOD_GUARD_ENTER
	TShaderQualifiers* ret = Pool_malloc($<TShaderQualifiers*>(nullptr));
	ret->geometry = $<TLayoutGeometry>(geometry);
	ret->pixelCenterInteger = pixelCenterInteger;
	ret->originUpperLeft = originUpperLeft;
	ret->invocations = invocations;
	ret->vertices = vertices;
	ret->spacing = $<TVertexSpacing>(spacing);
	ret->order = $<TVertexOrder>(order);
	ret->pointMode = pointMode;
	if((int) (env)->GetArrayLength(localSize) != 3){
		setLastError(env, GLSLANG_ERROR_INVALID_LENGTH);
		return nullptr;
	}
	int* fetchedLocalSize = (int*) (env)->GetIntArrayElements(localSize, nullptr);
	ret->localSize[0] = fetchedLocalSize[0];
	ret->localSize[1] = fetchedLocalSize[1];
	ret->localSize[2] = fetchedLocalSize[2];
	(env)->ReleaseIntArrayElements(localSize, (jint*) fetchedLocalSize, JNI_ABORT);
	if((int) (env)->GetArrayLength(localSizeNotDefault) != 3){
		setLastError(env, GLSLANG_ERROR_INVALID_LENGTH);
		return nullptr;
	}
	bool* fetchedLocalSizeNotDefault = (bool*) (env)->GetBooleanArrayElements(localSizeNotDefault, nullptr);
	ret->localSizeNotDefault[0] = fetchedLocalSizeNotDefault[0];
	ret->localSizeNotDefault[1] = fetchedLocalSizeNotDefault[1];
	ret->localSizeNotDefault[2] = fetchedLocalSizeNotDefault[2];
	(env)->ReleaseBooleanArrayElements(localSizeNotDefault, (jboolean*) fetchedLocalSizeNotDefault, JNI_ABORT);
	if((int) (env)->GetArrayLength(localSizeSpecId) != 3){
		setLastError(env, GLSLANG_ERROR_INVALID_LENGTH);
		return nullptr;
	}
	int* fetchedLocalSizeSpecId = (int*) (env)->GetIntArrayElements(localSizeSpecId, nullptr);
	ret->localSizeSpecId[0] = fetchedLocalSizeSpecId[0];
	ret->localSizeSpecId[1] = fetchedLocalSizeSpecId[1];
	ret->localSizeSpecId[2] = fetchedLocalSizeSpecId[2];
	(env)->ReleaseIntArrayElements(localSizeSpecId, (jint*) fetchedLocalSizeSpecId, JNI_ABORT);
	ret->earlyFragmentTests = earlyFragmentTests;
	ret->postDepthCoverage = postDepthCoverage;
	ret->layoutDepth = $<TLayoutDepth>(layoutDepth);
	ret->blendEquation = blendEquation;
	ret->numViews = numViews;
	ret->interlockOrdering = $<TInterlockOrdering>(interlockOrdering);
	ret->layoutOverrideCoverage = layoutOverrideCoverage;
	ret->layoutDerivativeGroupQuads = layoutDerivativeGroupQuads;
	ret->layoutDerivativeGroupLinear = layoutDerivativeGroupLinear;
	ret->primitives = primitives;
	ret->layoutPrimitiveCulling = layoutPrimitiveCulling;
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TShaderQualifiers*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getDepth
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->getDepth();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1init
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->init();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1hasBlendEquation
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->hasBlendEquation();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1merge
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray src){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->merge(*$<TShaderQualifiers*>(env _$ src));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setGeometry
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->geometry = $<TLayoutGeometry>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setPixelCenterInteger
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->pixelCenterInteger = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setOriginUpperLeft
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->originUpperLeft = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setInvocations
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->invocations = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setVertices
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->vertices = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setSpacing
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->spacing = $<TVertexSpacing>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setOrder
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->order = $<TVertexOrder>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setPointMode
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->pointMode = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setLocalSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jintArray v){
	JNI_METHOD_GUARD_ENTER
	if((int) (env)->GetArrayLength(v) != 3){
		setLastError(env, GLSLANG_ERROR_INVALID_LENGTH);
	}else{
		int* fetchedLocalSize = (int*) (env)->GetIntArrayElements(v, nullptr);
		$<TShaderQualifiers*>(env _$ ptr)->localSize[0] = fetchedLocalSize[0];
		$<TShaderQualifiers*>(env _$ ptr)->localSize[1] = fetchedLocalSize[1];
		$<TShaderQualifiers*>(env _$ ptr)->localSize[2] = fetchedLocalSize[2];
		(env)->ReleaseIntArrayElements(v, (jint*) fetchedLocalSize, JNI_ABORT);
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setLocalSizeNotDefault
  (JNIEnv* env, jclass self, jbyteArray ptr, jbooleanArray v){
	JNI_METHOD_GUARD_ENTER
	if((int) (env)->GetArrayLength(v) != 3){
		setLastError(env, GLSLANG_ERROR_INVALID_LENGTH);
	}else{
		bool* fetchedLocalSizeNotDefault = (bool*) (env)->GetBooleanArrayElements(v, nullptr);
		$<TShaderQualifiers*>(env _$ ptr)->localSizeNotDefault[0] = fetchedLocalSizeNotDefault[0];
		$<TShaderQualifiers*>(env _$ ptr)->localSizeNotDefault[1] = fetchedLocalSizeNotDefault[1];
		$<TShaderQualifiers*>(env _$ ptr)->localSizeNotDefault[2] = fetchedLocalSizeNotDefault[2];
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setLocalSizeSpecId
  (JNIEnv* env, jclass self, jbyteArray ptr, jintArray v){
	JNI_METHOD_GUARD_ENTER
	if((int) (env)->GetArrayLength(v) != 3){
		setLastError(env, GLSLANG_ERROR_INVALID_LENGTH);
	}else{
		int* fetchedLocalSizeSpecId = (int*) (env)->GetIntArrayElements(v, nullptr);
		$<TShaderQualifiers*>(env _$ ptr)->localSizeSpecId[0] = fetchedLocalSizeSpecId[0];
		$<TShaderQualifiers*>(env _$ ptr)->localSizeSpecId[1] = fetchedLocalSizeSpecId[1];
		$<TShaderQualifiers*>(env _$ ptr)->localSizeSpecId[2] = fetchedLocalSizeSpecId[2];
		(env)->ReleaseIntArrayElements(v, (jint*) fetchedLocalSizeSpecId, JNI_ABORT);
	}
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setEarlyFragmentTests
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->earlyFragmentTests = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setPostDepthCoverage
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->postDepthCoverage = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setLayoutDepth
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->layoutDepth = $<TLayoutDepth>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setBlendEquation
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->blendEquation = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setNumViews
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->numViews = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setInterlockOrdering
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->interlockOrdering = $<TInterlockOrdering>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setLayoutOverrideCoverage
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->layoutOverrideCoverage = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setLayoutDerivativeGroupQuads
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->layoutDerivativeGroupQuads = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setLayoutDerivativeGroupLinear
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->layoutDerivativeGroupLinear = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setPrimitives
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->primitives = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1setLayoutPrimitiveCulling
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TShaderQualifiers*>(env _$ ptr)->layoutPrimitiveCulling = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getGeometry
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->geometry;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getPixelCenterInteger
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->pixelCenterInteger;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getOriginUpperLeft
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->originUpperLeft;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getInvocations
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->invocations;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getVertices
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->vertices;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getSpacing
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->spacing;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getOrder
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->order;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getPointMode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->pointMode;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jintArray JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getLocalSize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	jintArray ret = env->NewIntArray(3);
	env->SetIntArrayRegion(ret, 0, 3, ((jint*) $<TShaderQualifiers*>(env _$ ptr)->localSize));
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbooleanArray JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getLocalSizeNotDefault
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	jbooleanArray ret = env->NewBooleanArray(3);
	env->SetBooleanArrayRegion(ret, 0, 3, ((jboolean*) $<TShaderQualifiers*>(env _$ ptr)->localSizeNotDefault));
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jintArray JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getLocalSizeSpecId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	jintArray ret = env->NewIntArray(3);
	env->SetIntArrayRegion(ret, 0, 3, ((jint*) $<TShaderQualifiers*>(env _$ ptr)->localSizeSpecId));
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getEarlyFragmentTests
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->earlyFragmentTests;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getPostDepthCoverage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->postDepthCoverage;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getLayoutDepth
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->layoutDepth;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getBlendEquation
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->blendEquation;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getNumViews
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->numViews;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getInterlockOrdering
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->interlockOrdering;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getLayoutOverrideCoverage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->layoutOverrideCoverage;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getLayoutDerivativeGroupQuads
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->layoutDerivativeGroupQuads;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getLayoutDerivativeGroupLinear
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->layoutDerivativeGroupLinear;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getPrimitives
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->primitives;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TShaderQualifiers_1getLayoutPrimitiveCulling
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TShaderQualifiers*>(env _$ ptr)->layoutPrimitiveCulling;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPublicType
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TPublicType*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPublicType_1isCoopmat
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPublicType*>(env _$ ptr)->isCoopmat();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1initType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray l){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->initType(*$<TSourceLoc*>(env _$ l));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1initQualifiers
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean global){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->initQualifiers(global);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1init
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray l, jboolean global){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->init(*$<TSourceLoc*>(env _$ l), global);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1setVector
  (JNIEnv* env, jclass self, jbyteArray ptr, jint s){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->setVector(s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1setMatrix
  (JNIEnv* env, jclass self, jbyteArray ptr, jint c, jint r){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->setMatrix(c, r);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPublicType_1isScalar
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPublicType*>(env _$ ptr)->isScalar();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPublicType_1isImage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPublicType*>(env _$ ptr)->isImage();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPublicType_1isSubpass
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPublicType*>(env _$ ptr)->isSubpass();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1setBasicType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->basicType = $<TBasicType>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1setSampler
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->sampler = *$<TSampler*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1setQualifier
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->qualifier = *$<TQualifier*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1setShaderQualifiers
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->shaderQualifiers = *$<TShaderQualifiers*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1setVectorSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->vectorSize = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1setMatrixCols
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->matrixCols = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1setMatrixRows
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->matrixRows = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1setCoopmat
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->coopmat = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1setArraySizes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->arraySizes = $<TArraySizes*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1setUserDef
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->userDef = $<TType*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1setLoc
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->loc = *$<TSourceLoc *>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TPublicType_1setTypeParameters
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TPublicType*>(env _$ ptr)->typeParameters = $<TArraySizes*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TPublicType_1getBasicType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPublicType*>(env _$ ptr)->basicType;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPublicType_1getSampler
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TPublicType*>(env _$ ptr)->sampler;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPublicType_1getQualifier
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TPublicType*>(env _$ ptr)->qualifier;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPublicType_1getShaderQualifiers
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TPublicType*>(env _$ ptr)->shaderQualifiers;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TPublicType_1getVectorSize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPublicType*>(env _$ ptr)->vectorSize;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TPublicType_1getMatrixCols
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPublicType*>(env _$ ptr)->matrixCols;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TPublicType_1getMatrixRows
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPublicType*>(env _$ ptr)->matrixRows;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TPublicType_1getCoopmat
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TPublicType*>(env _$ ptr)->coopmat;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPublicType_1getArraySizes
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TPublicType*>(env _$ ptr)->arraySizes;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPublicType_1getUserDef
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TPublicType*>(env _$ ptr)->userDef;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPublicType_1getLoc
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TPublicType*>(env _$ ptr)->loc;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TPublicType_1getTypeParameters
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TPublicType*>(env _$ ptr)->typeParameters;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType__IIIIIZ
  (JNIEnv* env, jclass self, jint t, jint q, jint vs, jint mc, jint mr, jboolean isVector){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TType($<TBasicType>(t), $<TStorageQualifier>(q), vs, mc, mr, isVector);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType__IIIIIIZ
  (JNIEnv* env, jclass self, jint t, jint q, jint p, jint vs, jint mc, jint mr, jboolean isVector){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TType($<TBasicType>(t), $<TStorageQualifier>(q), $<TPrecisionQualifier>(p), vs, mc, mr, isVector);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType___3B
  (JNIEnv* env, jclass self, jbyteArray p){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TType(*$<TPublicType*>(env _$ p));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType___3BI_3B
  (JNIEnv* env, jclass self, jbyteArray sampler, jint q, jbyteArray as){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TType(*$<TSampler*>(env _$ sampler), $<TStorageQualifier>(q), $<TArraySizes*>(env _$ as));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType___3BIZ
  (JNIEnv* env, jclass self, jbyteArray type, jint derefIndex, jboolean rowMajor){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TType(*$<TType*>(env _$ type), derefIndex, rowMajor);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType___3BLjava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray userDef, jstring n){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TType($<TTypeList*>(env _$ userDef), *toTString(env, n));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType___3BLjava_lang_String_2_3B
  (JNIEnv* env, jclass self, jbyteArray userDef, jstring n, jbyteArray q){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TType($<TTypeList*>(env _$ userDef), *toTString(env, n), *$<TQualifier*>(env _$ q));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType__I_3BLjava_lang_String_2
  (JNIEnv* env, jclass self, jint t, jbyteArray p, jstring n){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TType($<TBasicType>(t), *$<TType*>(env _$ p), *toTString(env, n));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1shallowCopy
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray copyOf){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->shallowCopy(*$<TType*>(env _$ copyOf));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1deepCopy
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray copyOf){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->deepCopy(*$<TType*>(env _$ copyOf));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1makeTemporary
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->makeTemporary();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType_1clone
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TType*>(env _$ ptr)->clone();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1makeVector
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->makeVector();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1hideMember
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->hideMember();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1hiddenMember
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->hiddenMember();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1setFieldName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring n){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->setFieldName(*toTString(env, n));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TType_1getFieldName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TType*>(env _$ ptr)->getFieldName();
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TType_1getShaderInterface
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->getShaderInterface();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TType_1getBasicType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->getBasicType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType_1getSampler
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TType*>(env _$ ptr)->getSampler();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType_1getQualifier
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TType*>(env _$ ptr)->getQualifier();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TType_1getVectorSize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->getVectorSize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TType_1getMatrixCols
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->getMatrixCols();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TType_1getMatrixRows
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->getMatrixRows();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TType_1getOuterArraySize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->getOuterArraySize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType_1getOuterArrayNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TType*>(env _$ ptr)->getOuterArrayNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TType_1getCumulativeArraySize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->getCumulativeArraySize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isArrayOfArrays
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isArrayOfArrays();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TType_1getImplicitArraySize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->getImplicitArraySize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType_1getArraySizes
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TType*>(env _$ ptr)->getArraySizes();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType_1getReferentType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TType*>(env _$ ptr)->getReferentType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType_1getTypeParameters
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TType*>(env _$ ptr)->getTypeParameters();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isScalar
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isScalar();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isScalarOrVec1
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isScalarOrVec1();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isVector
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isVector();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isMatrix
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isMatrix();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isArray
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isArray();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isSizedArray
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isSizedArray();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isUnsizedArray
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isUnsizedArray();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isArrayVariablyIndexed
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isArrayVariablyIndexed();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1setArrayVariablyIndexed
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->setArrayVariablyIndexed();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1updateImplicitArraySize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint size){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->updateImplicitArraySize(size);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isStruct
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isStruct();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isFloatingDomain
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isFloatingDomain();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isIntegerDomain
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isIntegerDomain();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isOpaque
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isOpaque();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isBuiltIn
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isBuiltIn();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isImage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isImage();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isSubpass
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isSubpass();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isTexture
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isTexture();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isUnusableName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isUnusableName();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isParameterized
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isParameterized();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isAtomic
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isAtomic();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isCoopMat
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isCoopMat();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1isReference
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->isReference();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1contains
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray predicate){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return true;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1containsBasicType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint checkType){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->containsBasicType($<TBasicType>(checkType));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1containsArray
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->containsArray();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1containsStructure
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->containsStructure();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1containsUnsizedArray
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->containsUnsizedArray();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1containsOpaque
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->containsOpaque();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1containsBuiltIn
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->containsBuiltIn();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1containsNonOpaque
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->containsNonOpaque();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1containsSpecializationSize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->containsSpecializationSize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1containsDouble
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->containsDouble();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1contains16BitFloat
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->contains16BitFloat();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1contains64BitInt
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->contains64BitInt();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1contains16BitInt
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->contains16BitInt();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1contains8BitInt
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->contains8BitInt();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1containsCoopMat
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->containsCoopMat();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1containsReference
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->containsReference();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1updateArraySizes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray type){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->updateArraySizes(*$<TType*>(env _$ type));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1copyArraySizes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray s){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->copyArraySizes(*$<TArraySizes*>(env _$ s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1transferArraySizes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray s){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->transferArraySizes($<TArraySizes*>(env _$ s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1clearArraySizes
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->clearArraySizes();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1copyArrayInnerSizes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray s){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->copyArrayInnerSizes($<TArraySizes*>(env _$ s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1changeOuterArraySize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint s){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->changeOuterArraySize(s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1adoptImplicitArraySizes
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean skipNonvariablyIndexed){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->adoptImplicitArraySizes(skipNonvariablyIndexed);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1updateTypeParameters
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray type){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->updateTypeParameters(*$<TType*>(env _$ type));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1copyTypeParameters
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray s){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->copyTypeParameters(*$<TArraySizes*>(env _$ s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1transferTypeParameters
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray s){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->transferTypeParameters($<TArraySizes*>(env _$ s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1clearTypeParameters
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->clearTypeParameters();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1copyTypeParametersInnerSizes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray s){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->copyTypeParametersInnerSizes($<TArraySizes*>(env _$ s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TType_1getBasicString___3B
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TType*>(env _$ ptr)->getBasicString();
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TType_1getBasicTypeString
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TType*>(env _$ ptr)->getBasicTypeString();
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TType_1getCompleteString
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TType*>(env _$ ptr)->getCompleteString();
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TType_1getStorageQualifierString
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TType*>(env _$ ptr)->getStorageQualifierString());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TType_1getBuiltInVariableString
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TType*>(env _$ ptr)->getBuiltInVariableString());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TType_1getPrecisionQualifierString
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TType*>(env _$ ptr)->getPrecisionQualifierString());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType_1getStruct
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TType*>(env _$ ptr)->getStruct();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1setStruct
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray s){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->setStruct($<TTypeList*>(env _$ s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TType_1getWritableStruct
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TType*>(env _$ ptr)->getWritableStruct();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1setBasicType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint t){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->setBasicType($<TBasicType>(t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TType_1computeNumComponents
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->computeNumComponents();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TType_1appendMangledName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	$<TType*>(env _$ ptr)->appendMangledName(*toTString(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1sameStructType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->sameStructType(*$<TType*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1sameReferenceType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->sameReferenceType(*$<TType*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1sameElementType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->sameElementType(*$<TType*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1sameArrayness
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->sameArrayness(*$<TType*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1sameInnerArrayness
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->sameInnerArrayness(*$<TType*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1sameTypeParameters
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->sameTypeParameters(*$<TType*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1sameElementShape
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->sameElementShape(*$<TType*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1coopMatParameterOK
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->coopMatParameterOK(*$<TType*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1sameCoopMatBaseType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->sameCoopMatBaseType(*$<TType*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TType_1getBufferReferenceAlignment
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TType*>(env _$ ptr)->getBufferReferenceAlignment();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TType_1getBasicString__I
  (JNIEnv* env, jclass self, jint t){
	JNI_METHOD_GUARD_ENTER
	return toString(env, TType::getBasicString($<TBasicType>(t)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1operatorEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TType*>(env _$ ptr) == *$<TType*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TType_1operatorNotEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TType*>(env _$ ptr) != *$<TType*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}
