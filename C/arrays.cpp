
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/Include/Common.h>
#include <glslang/Include/arrays.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TArraySize__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TArraySize*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TArraySize__J_3B
  (JNIEnv* env, jclass self, jlong size, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	TArraySize* ret = Pool_malloc($<TArraySize*>(nullptr));
	ret->size = size;
	ret->node = $<TIntermTyped*>(env _$ node);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TArraySize_1setSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TArraySize*>(env _$ ptr)->size = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TArraySize_1setNode
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TArraySize*>(env _$ ptr)->node = $<TIntermTyped*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TArraySize_1getSize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TArraySize*>(env _$ ptr)->size;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TArraySize_1getNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TArraySize*>(env _$ ptr)->node;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TArraySize_1operatorEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TArraySize*>(env _$ ptr) == *$<TArraySize*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TSmallArrayVector();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector_1size
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSmallArrayVector*>(env _$ ptr)->size();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector_1frontSize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSmallArrayVector*>(env _$ ptr)->frontSize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector_1frontNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TSmallArrayVector*>(env _$ ptr)->frontNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector_1changeFront
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong s){
	JNI_METHOD_GUARD_ENTER
	$<TSmallArrayVector*>(env _$ ptr)->changeFront(s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector_1push_1back___3BJ_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong e, jbyteArray n){
	JNI_METHOD_GUARD_ENTER
	$<TSmallArrayVector*>(env _$ ptr)->push_back(e, $<TIntermTyped*>(env _$ n));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector_1push_1back___3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray newDims){
	JNI_METHOD_GUARD_ENTER
	$<TSmallArrayVector*>(env _$ ptr)->push_back(*$<TSmallArrayVector*>(env _$ newDims));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector_1pop_1front
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TSmallArrayVector*>(env _$ ptr)->pop_front();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector_1copyNonFront
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	$<TSmallArrayVector*>(env _$ ptr)->copyNonFront(*$<TSmallArrayVector*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector_1getDimSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	return $<TSmallArrayVector*>(env _$ ptr)->getDimSize(i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector_1setDimSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i, jlong size){
	JNI_METHOD_GUARD_ENTER
	$<TSmallArrayVector*>(env _$ ptr)->setDimSize(i, size);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector_1getDimNode
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TSmallArrayVector*>(env _$ ptr)->getDimNode(i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector_1operatorAssign
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray from){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TSmallArrayVector*>(env _$ ptr) = *$<TSmallArrayVector*>(env _$ from));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector_1operatorEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TSmallArrayVector*>(env _$ ptr) == *$<TSmallArrayVector*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TSmallArrayVector_1operatorNotEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TSmallArrayVector*>(env _$ ptr) != *$<TSmallArrayVector*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TArraySizes
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TArraySizes();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TArraySizes_1getNumDims
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TArraySizes*>(env _$ ptr)->getNumDims();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TArraySizes_1getDimSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint dim){
	JNI_METHOD_GUARD_ENTER
	return $<TArraySizes*>(env _$ ptr)->getDimSize(dim);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TArraySizes_1getDimNode
  (JNIEnv* env, jclass self, jbyteArray ptr, jint dim){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TArraySizes*>(env _$ ptr)->getDimNode(dim);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TArraySizes_1setDimSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint dim, jint size){
	JNI_METHOD_GUARD_ENTER
	$<TArraySizes*>(env _$ ptr)->setDimSize(dim, size);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TArraySizes_1getOuterSize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TArraySizes*>(env _$ ptr)->getOuterSize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TArraySizes_1getOuterNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TArraySizes*>(env _$ ptr)->getOuterNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TArraySizes_1getCumulativeSize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TArraySizes*>(env _$ ptr)->getCumulativeSize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TArraySizes_1addInnerSize___3B
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TArraySizes*>(env _$ ptr)->addInnerSize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TArraySizes_1addInnerSize___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint s){
	JNI_METHOD_GUARD_ENTER
	$<TArraySizes*>(env _$ ptr)->addInnerSize(s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TArraySizes_1addInnerSize___3BI_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint s, jbyteArray n){
	JNI_METHOD_GUARD_ENTER
	$<TArraySizes*>(env _$ ptr)->addInnerSize(s, $<TIntermTyped*>(env _$ n));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TArraySizes_1addInnerSize___3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray pair){
	JNI_METHOD_GUARD_ENTER
	$<TArraySizes*>(env _$ ptr)->addInnerSize(*$<TArraySize *>(env _$ pair));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TArraySizes_1addInnerSizes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray s){
	JNI_METHOD_GUARD_ENTER
	$<TArraySizes*>(env _$ ptr)->addInnerSizes(*$<TArraySizes*>(env _$ s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TArraySizes_1changeOuterSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint s){
	JNI_METHOD_GUARD_ENTER
	$<TArraySizes*>(env _$ ptr)->changeOuterSize(s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TArraySizes_1getImplicitSize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TArraySizes*>(env _$ ptr)->getImplicitSize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TArraySizes_1updateImplicitSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint s){
	JNI_METHOD_GUARD_ENTER
	$<TArraySizes*>(env _$ ptr)->updateImplicitSize(s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TArraySizes_1isInnerUnsized
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TArraySizes*>(env _$ ptr)->isInnerUnsized();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TArraySizes_1clearInnerUnsized
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TArraySizes*>(env _$ ptr)->clearInnerUnsized();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TArraySizes_1isInnerSpecialization
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TArraySizes*>(env _$ ptr)->isInnerSpecialization();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TArraySizes_1isOuterSpecialization
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TArraySizes*>(env _$ ptr)->isOuterSpecialization();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TArraySizes_1hasUnsized
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TArraySizes*>(env _$ ptr)->hasUnsized();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TArraySizes_1isSized
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TArraySizes*>(env _$ ptr)->isSized();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TArraySizes_1dereference
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TArraySizes*>(env _$ ptr)->dereference();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TArraySizes_1copyDereferenced
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	$<TArraySizes*>(env _$ ptr)->copyDereferenced(*$<TArraySizes*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TArraySizes_1sameInnerArrayness
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return $<TArraySizes*>(env _$ ptr)->sameInnerArrayness(*$<TArraySizes*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TArraySizes_1setVariablyIndexed
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TArraySizes*>(env _$ ptr)->setVariablyIndexed();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TArraySizes_1isVariablyIndexed
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TArraySizes*>(env _$ ptr)->isVariablyIndexed();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TArraySizes_1operatorAssign
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray from){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TArraySizes*>(env _$ ptr) = *$<TArraySizes*>(env _$ from));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TArraySizes_1operatorEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TArraySizes*>(env _$ ptr) == *$<TArraySizes*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TArraySizes_1operatorNotEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TArraySizes*>(env _$ ptr) != *$<TArraySizes*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}
