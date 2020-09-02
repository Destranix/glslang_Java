
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/Include/ConstantUnion.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnion
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TConstUnion();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TConstUnion_1setI8Const
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyte v){
	JNI_METHOD_GUARD_ENTER
	$<TConstUnion*>(env _$ ptr)->setI8Const(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TConstUnion_1setU8Const
  (JNIEnv* env, jclass self, jbyteArray ptr, jshort v){
	JNI_METHOD_GUARD_ENTER
	$<TConstUnion*>(env _$ ptr)->setU8Const(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TConstUnion_1setI16Const
  (JNIEnv* env, jclass self, jbyteArray ptr, jshort v){
	JNI_METHOD_GUARD_ENTER
	$<TConstUnion*>(env _$ ptr)->setI16Const(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TConstUnion_1setU16Const
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TConstUnion*>(env _$ ptr)->setU16Const(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TConstUnion_1setIConst
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TConstUnion*>(env _$ ptr)->setIConst(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TConstUnion_1setUConst
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TConstUnion*>(env _$ ptr)->setUConst(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TConstUnion_1setI64Const
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject v){
	JNI_METHOD_GUARD_ENTER
	$<TConstUnion*>(env _$ ptr)->setI64Const(BigIntegerToLongLong(env, v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TConstUnion_1setU64Const
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject v){
	JNI_METHOD_GUARD_ENTER
	$<TConstUnion*>(env _$ ptr)->setU64Const(BigIntegerToUnsignedLongLong(env, v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TConstUnion_1setDConst
  (JNIEnv* env, jclass self, jbyteArray ptr, jdouble v){
	JNI_METHOD_GUARD_ENTER
	$<TConstUnion*>(env _$ ptr)->setDConst(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TConstUnion_1setBConst
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TConstUnion*>(env _$ ptr)->setBConst(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TConstUnion_1setSConst
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring v){
	JNI_METHOD_GUARD_ENTER
	$<TConstUnion*>(env _$ ptr)->setSConst(toTString(env, v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyte JNICALL Java_com_destranix_glslang_Main_TConstUnion_1getI8Const
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TConstUnion*>(env _$ ptr)->getI8Const();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jshort JNICALL Java_com_destranix_glslang_Main_TConstUnion_1getU8Const
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TConstUnion*>(env _$ ptr)->getU8Const();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jshort JNICALL Java_com_destranix_glslang_Main_TConstUnion_1getI16Const
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TConstUnion*>(env _$ ptr)->getI16Const();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TConstUnion_1getU16Const
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TConstUnion*>(env _$ ptr)->getU16Const();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TConstUnion_1getIConst
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TConstUnion*>(env _$ ptr)->getIConst();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TConstUnion_1getUConst
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TConstUnion*>(env _$ ptr)->getUConst();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jobject JNICALL Java_com_destranix_glslang_Main_TConstUnion_1getI64Const
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toBigInteger(env, $<TConstUnion*>(env _$ ptr)->getI64Const());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jobject JNICALL Java_com_destranix_glslang_Main_TConstUnion_1getU64Const
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toBigInteger(env, $<TConstUnion*>(env _$ ptr)->getU64Const());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jdouble JNICALL Java_com_destranix_glslang_Main_TConstUnion_1getDConst
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TConstUnion*>(env _$ ptr)->getDConst();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1getBConst
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TConstUnion*>(env _$ ptr)->getBConst();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TConstUnion_1getSConst
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TConstUnion*>(env _$ ptr)->getSConst());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TConstUnion_1getType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TConstUnion*>(env _$ ptr)->getType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorEqual___3BB
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyte rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) == rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorEqualUnsigned___3BS
  (JNIEnv* env, jclass self, jbyteArray ptr, jshort rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) == rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorEqual___3BS
  (JNIEnv* env, jclass self, jbyteArray ptr, jshort rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) == rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorEqualUnsigned___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) == rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorEqual___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) == rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorEqual___3BJ
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) == (unsigned int)rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorEqual___3BLjava_math_BigInteger_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) == BigIntegerToLongLong(env, rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorEqualUnsigned___3BLjava_math_BigInteger_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) == BigIntegerToUnsignedLongLong(env, rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorEqual___3BD
  (JNIEnv* env, jclass self, jbyteArray ptr, jdouble rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) == rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorEqual___3BZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) == rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorEqual___3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) == *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorNotEqual___3BB
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyte rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) != rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorNotEqualUnsigned___3BS
  (JNIEnv* env, jclass self, jbyteArray ptr, jshort rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) != rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorNotEqual___3BS
  (JNIEnv* env, jclass self, jbyteArray ptr, jshort rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) != rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorNotEqualUnsigned___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) != rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorNotEqual___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) != rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorNotEqual___3BJ
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) != (unsigned int) rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorNotEqual___3BLjava_math_BigInteger_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) != BigIntegerToLongLong(env, rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorNotEqualUnsigned___3BLjava_math_BigInteger_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) != BigIntegerToUnsignedLongLong(env, rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorNotEqual___3BF
  (JNIEnv* env, jclass self, jbyteArray ptr, jfloat rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) != rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorNotEqual___3BZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) != rhs);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorNotEqual___3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) != *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorGreaterThan
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) > *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorLowerThan
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnion*>(env _$ ptr) < *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorPlus
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TConstUnion*>(env _$ ptr) + *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorMinus
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TConstUnion*>(env _$ ptr) - *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorMul
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TConstUnion*>(env _$ ptr) * *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorMod
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TConstUnion*>(env _$ ptr) % *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorShiftRight
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TConstUnion*>(env _$ ptr) << *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorShiftLeft
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TConstUnion*>(env _$ ptr) >> *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorBitwiseAnd
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TConstUnion*>(env _$ ptr) & *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorBitwiseOr
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TConstUnion*>(env _$ ptr) | *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorBitwiseXor
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TConstUnion*>(env _$ ptr) ^ *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorBitwiseInvert
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ ~(*$<TConstUnion*>(env _$ ptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorAnd
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TConstUnion*>(env _$ ptr) && *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnion_1operatorOr
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TConstUnion*>(env _$ ptr) || *$<TConstUnion*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnionArray__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TConstUnionArray();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnionArray__I
  (JNIEnv* env, jclass self, jint size){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TConstUnionArray(size);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnionArray___3B
  (JNIEnv* env, jclass self, jbyteArray a){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TConstUnionArray(*$<TConstUnionArray*>(env _$ a));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnionArray___3BII
  (JNIEnv* env, jclass self, jbyteArray a, jint start, jint size){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TConstUnionArray(*$<TConstUnionArray*>(env _$ a), start, size);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnionArray__I_3B
  (JNIEnv* env, jclass self, jint size, jbyteArray val){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TConstUnionArray(size, *$<TConstUnion*>(env _$ val));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TConstUnionArray_1size
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TConstUnionArray*>(env _$ ptr)->size();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jdouble JNICALL Java_com_destranix_glslang_Main_TConstUnionArray_1dot
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return $<TConstUnionArray*>(env _$ ptr)->dot(*$<TConstUnionArray*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnionArray_1empty
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TConstUnionArray*>(env _$ ptr)->empty();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TConstUnionArray_1operatorAt
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong index){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TConstUnionArray*>(env _$ ptr))[index];
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnionArray_1operatorEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnionArray*>(env _$ ptr) == *$<TConstUnionArray*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TConstUnionArray_1operatorNotEqual
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return (*$<TConstUnionArray*>(env _$ ptr) != *$<TConstUnionArray*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}
