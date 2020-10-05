
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/MachineIndependent/localintermediate.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TMatrixSelector__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TMatrixSelector*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TMatrixSelector__II
  (JNIEnv* env, jclass self, jint coord1, jint coord2){
	JNI_METHOD_GUARD_ENTER
	TMatrixSelector* ret = Pool_malloc($<TMatrixSelector*>(nullptr));
	ret->coord1 = coord1;
	ret->coord2 = coord2;
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TMatrixSelector_1setCoord1
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TMatrixSelector*>(env _$ ptr)->coord1 = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TMatrixSelector_1setCoord2
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TMatrixSelector*>(env _$ ptr)->coord2 = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TMatrixSelector_1getCoord1
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TMatrixSelector*>(env _$ ptr)->coord1;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TMatrixSelector_1getCoord2
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TMatrixSelector*>(env _$ ptr)->coord2;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSwizzleSelectors
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TSwizzleSelectors<void*>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSwizzleSelectors_1push_1back
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray comp){
	JNI_METHOD_GUARD_ENTER
	$<TSwizzleSelectors<void*>*>(env _$ ptr)->push_back($<void*>(env _$ comp));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSwizzleSelectors_1resize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint s){
	JNI_METHOD_GUARD_ENTER
	$<TSwizzleSelectors<void*>*>(env _$ ptr)->resize(s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TSwizzleSelectors_1size
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSwizzleSelectors<void*>*>(env _$ ptr)->size();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSwizzleSelectors_1operatorAt
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	return env $_ ((*$<TSwizzleSelectors<void*>*>(env _$ ptr))[i]);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TSwizzleSelectorsInt
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TSwizzleSelectors<int>*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSwizzleSelectorsInt_1push_1back
	(JNIEnv* env, jclass self, jbyteArray ptr, jint comp){
	JNI_METHOD_GUARD_ENTER
	$<TSwizzleSelectors<int>*>(env _$ ptr)->push_back(comp);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TSwizzleSelectorsInt_1resize
	(JNIEnv* env, jclass self, jbyteArray ptr, jint s){
	JNI_METHOD_GUARD_ENTER
	$<TSwizzleSelectors<int>*>(env _$ ptr)->resize(s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TSwizzleSelectorsInt_1size
	(JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TSwizzleSelectors<int>*>(env _$ ptr)->size();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TSwizzleSelectorsInt_1operatorAt
	(JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	return ((*$<TSwizzleSelectors<int>*>(env _$ ptr))[i]);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TCall
  (JNIEnv* env, jclass self, jstring pCaller, jstring pCallee){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TCall*>(nullptr), *toTString(env, pCaller), *toTString(env, pCallee));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCall_1setCaller
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring v){
	JNI_METHOD_GUARD_ENTER
	$<TCall*>(env _$ ptr)->caller = *toTString(env, v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCall_1setCallee
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring v){
	JNI_METHOD_GUARD_ENTER
	$<TCall*>(env _$ ptr)->callee = *toTString(env, v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCall_1setVisited
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TCall*>(env _$ ptr)->visited = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCall_1setCurrentPath
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TCall*>(env _$ ptr)->currentPath = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCall_1setErrorGiven
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TCall*>(env _$ ptr)->errorGiven = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCall_1setCalleeBodyPosition
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TCall*>(env _$ ptr)->calleeBodyPosition = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TCall_1getCaller
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, &$<TCall*>(env _$ ptr)->caller);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TCall_1getCallee
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, &$<TCall*>(env _$ ptr)->callee);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCall_1getVisited
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCall*>(env _$ ptr)->visited;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCall_1getCurrentPath
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCall*>(env _$ ptr)->currentPath;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCall_1getErrorGiven
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCall*>(env _$ ptr)->errorGiven;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TCall_1getCalleeBodyPosition
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCall*>(env _$ ptr)->calleeBodyPosition;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TRange
  (JNIEnv* env, jclass self, jint start, jint last){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TRange*>(nullptr), start, last);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TRange_1overlap
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return $<TRange*>(env _$ ptr)->overlap(*$<TRange*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TRange_1setStart
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TRange*>(env _$ ptr)->start = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TRange_1setLast
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TRange*>(env _$ ptr)->last = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TRange_1getStart
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TRange*>(env _$ ptr)->start;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TRange_1getLast
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TRange*>(env _$ ptr)->last;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIoRange
  (JNIEnv* env, jclass self, jbyteArray location, jbyteArray component, jint basicType, jint index){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TIoRange*>(nullptr), *$<TRange*>(env _$ location), *$<TRange*>(env _$ component), $<TBasicType>(basicType), index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIoRange_1overlap
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return $<TIoRange*>(env _$ ptr)->overlap(*$<TIoRange*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIoRange_1setLocation
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIoRange*>(env _$ ptr)->location = *$<TRange*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIoRange_1setComponent
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIoRange*>(env _$ ptr)->component = *$<TRange*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIoRange_1setBasicType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TIoRange*>(env _$ ptr)->basicType = $<TBasicType>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIoRange_1setindex
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TIoRange*>(env _$ ptr)->index = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIoRange_1getLocation
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIoRange*>(env _$ ptr)->location;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIoRange_1getComponent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIoRange*>(env _$ ptr)->component;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIoRange_1getBasicType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIoRange*>(env _$ ptr)->basicType;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIoRange_1getIndex
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIoRange*>(env _$ ptr)->index;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TOffsetRange
  (JNIEnv* env, jclass self, jbyteArray binding, jbyteArray offset){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TOffsetRange*>(nullptr), *$<TRange*>(env _$ binding), *$<TRange*>(env _$ offset));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TOffsetRange_1overlap
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	return $<TOffsetRange*>(env _$ ptr)->overlap(*$<TOffsetRange*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TOffsetRange_1setBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TOffsetRange*>(env _$ ptr)->binding = *$<TRange*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TOffsetRange_1setOffset
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TOffsetRange*>(env _$ ptr)->offset = *$<TRange*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TOffsetRange_1getBinding
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TOffsetRange*>(env _$ ptr)->binding;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TOffsetRange_1getOffset
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TOffsetRange*>(env _$ ptr)->offset;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TXfbBuffer
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TXfbBuffer*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TXfBuffer_1setRanges
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TXfbBuffer*>(env _$ ptr)->ranges = *$<std::vector<TRange>*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TXfBuffer_1setStride
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TXfbBuffer*>(env _$ ptr)->stride = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TXfBuffer_1setImplicitStride
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TXfbBuffer*>(env _$ ptr)->implicitStride = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TXfBuffer_1setContains64BitType
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TXfbBuffer*>(env _$ ptr)->contains64BitType = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TXfBuffer_1setContains32BitType
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TXfbBuffer*>(env _$ ptr)->contains32BitType = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TXfBuffer_1setContains16BitType
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TXfbBuffer*>(env _$ ptr)->contains16BitType = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TXfBuffer_1getRanges
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TXfbBuffer*>(env _$ ptr)->ranges;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TXfBuffer_1getStride
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TXfbBuffer*>(env _$ ptr)->stride;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TXfBuffer_1getImplicitStride
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TXfbBuffer*>(env _$ ptr)->implicitStride;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TXfBuffer_1getContains64BitType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TXfbBuffer*>(env _$ ptr)->contains64BitType;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TXfBuffer_1getContains32BitType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TXfbBuffer*>(env _$ ptr)->contains32BitType;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TXfBuffer_1getContains16BitType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TXfbBuffer*>(env _$ ptr)->contains16BitType;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TProcesses
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TProcesses*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TProcesses_1addProcess
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring process){
	JNI_METHOD_GUARD_ENTER
	$<TProcesses*>(env _$ ptr)->addProcess(toChars(env, process));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TProcesses_1addArgument___3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint arg){
	JNI_METHOD_GUARD_ENTER
	$<TProcesses*>(env _$ ptr)->addArgument(arg);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TProcesses_1addArgument___3BLjava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring arg){
	JNI_METHOD_GUARD_ENTER
	$<TProcesses*>(env _$ ptr)->addArgument(toChars(env, arg));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TProcesses_1addIfNonZero
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring process, jint value){
	JNI_METHOD_GUARD_ENTER
	$<TProcesses*>(env _$ ptr)->addIfNonZero(toChars(env, process), value);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jobjectArray JNICALL Java_com_destranix_glslang_Main_TProcesses_1getProcesses
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toStringArray(env, $<TProcesses*>(env _$ ptr)->getProcesses());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIdMaps
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TIdMaps*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIdMaps_1operatorAt
  (JNIEnv* env, jclass self, jbyteArray ptr, jint index){
	JNI_METHOD_GUARD_ENTER
	return env $_ ((*$<TIdMaps*>(env _$ ptr))[index]);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TNumericFeatures__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TNumericFeatures();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TNumericFeatures___3B
  (JNIEnv* env, jclass self, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return nullptr;
	//return env $_ new TNumericFeatures(*$<TNumericFeatures*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TNumericFeatures_1operatorAssign
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray rhs){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return nullptr;
	//return env $_ (*$<TNumericFeatures*>(env _$ ptr) = *$<TNumericFeatures*>(env _$ rhs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TNumericFeatures_1insert
  (JNIEnv* env, jclass self, jbyteArray ptr, jint f){
	JNI_METHOD_GUARD_ENTER
	$<TNumericFeatures*>(env _$ ptr)->insert($<TNumericFeatures::feature>(f));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TNumericFeatures_1erase
  (JNIEnv* env, jclass self, jbyteArray ptr, jint f){
	JNI_METHOD_GUARD_ENTER
	$<TNumericFeatures*>(env _$ ptr)->erase($<TNumericFeatures::feature>(f));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TNumericFeatures_1contains
  (JNIEnv* env, jclass self, jbyteArray ptr, jint f){
	JNI_METHOD_GUARD_ENTER
	return $<TNumericFeatures*>(env _$ ptr)->contains($<TNumericFeatures::feature>(f));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate
  (JNIEnv* env, jclass self, jint l, jint v, jint p){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TIntermediate*>(nullptr), $<EShLanguage>(l), v, $<EProfile>(p));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setVersion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setVersion(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getVersion
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getVersion();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setProfile
  (JNIEnv* env, jclass self, jbyteArray ptr, jint p){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setVersion($<EProfile>(p));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getProfile
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getProfile();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setSpv
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray s){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setSpv(*$<SpvVersion*>(env _$ s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getSpv
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->getSpv();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getStage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getStage();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addRequestedExtension
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring extension){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->addRequestedExtension(toChars(env, extension));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getRequestedExtensions
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TIntermediate* elem = $<TIntermediate*>(env _$ ptr);
	std::set<std::string> set = elem->getRequestedExtensions();
	std::set<TString*>* ret = nullptr;
	ret = Pool_mallocRegister(ret, elem);
	for(auto val : set){
		TString* str = NewPoolTString(val.c_str());
		ret->insert(str);
	}
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setTreeRoot
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray r){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setTreeRoot($<TIntermNode*>(env _$ r));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getTreeRoot
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->getTreeRoot();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1incrementEntryPointCount
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->incrementEntryPointCount();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getNumEntryPoints
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getNumEntryPoints();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getNumErrors
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getNumErrors();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addPushConstantCount
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->addPushConstantCount();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setLimits
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray r){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setLimits(*$<TBuiltInResource*>(env _$ r));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1postProcess
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jint language){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->postProcess($<TIntermNode*>(env _$ node), $<EShLanguage>(language));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1removeTree
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->removeTree();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setEntryPointName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring ep){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setEntryPointName(toChars(env, ep));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setEntryPointMangledName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring ep){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setEntryPointMangledName(toChars(env, ep));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getEntryPointName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TIntermediate*>(env _$ ptr)->getEntryPointName());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getEntryPointMangledName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TIntermediate*>(env _$ ptr)->getEntryPointMangledName());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setInvertY
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean invert){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setInvertY(invert);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getInvertY
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getInvertY();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setSource
  (JNIEnv* env, jclass self, jbyteArray ptr, jint s){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setSource($<EShSource>(s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getSource
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getSource();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1isRecursive
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->isRecursive();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addSymbol___3B_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray t, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addSymbol(*$<TType*>(env _$ t), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addSymbol___3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray symbol){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addSymbol(*$<TIntermSymbol*>(env _$ symbol));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addSymbolVariable___3B_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray variable, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addSymbol(*$<TVariable*>(env _$ variable), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addSymbolVariable___3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray variable){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addSymbol(*$<TVariable*>(env _$ variable));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addConversionType
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray t, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addConversion($<TOperator>(op), *$<TType*>(env _$ t), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addPairConversion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray node0, jbyteArray node1){
	JNI_METHOD_GUARD_ENTER
	std::tuple<TIntermTyped*, TIntermTyped*> ret = $<TIntermediate*>(env _$ ptr)->addPairConversion($<TOperator>(op), $<TIntermTyped*>(env _$ node0), $<TIntermTyped*>(env _$ node1));
	return env $_ std::make_pair(std::get<0>(ret), std::get<1>(ret));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addUniShapeConversion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray t, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addUniShapeConversion($<TOperator>(op), *$<TType*>(env _$ t), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addConversion___3BI_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint convertTo, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addConversion($<TBasicType>(convertTo), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addBiShapeConversion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray lhsNode, jbyteArray rhsNode){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* lhsNodePtr = $<TIntermTyped*>(env _$ lhsNode);
	TIntermTyped* rhsNodePtr = $<TIntermTyped*>(env _$ rhsNode);
	$<TIntermediate*>(env _$ ptr)->addBiShapeConversion($<TOperator>(op), lhsNodePtr, rhsNodePtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addShapeConversion
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray t, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addShapeConversion(*$<TType*>(env _$ t), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addBinaryMath
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray left, jbyteArray right, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addBinaryMath($<TOperator>(op), $<TIntermTyped*>(env _$ left), $<TIntermTyped*>(env _$ right), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addAssign
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray left, jbyteArray right, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addAssign($<TOperator>(op), $<TIntermTyped*>(env _$ left), $<TIntermTyped*>(env _$ right), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray base, jbyteArray index, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addIndex($<TOperator>(op), $<TIntermTyped*>(env _$ base), $<TIntermTyped*>(env _$ index), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addUnaryMath
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray child, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addUnaryMath($<TOperator>(op), $<TIntermTyped*>(env _$ child), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addBuiltInFunctionCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray line, jint op, jboolean unary, jbyteArray node, jbyteArray returnType){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addBuiltInFunctionCall(*$<TSourceLoc*>(env _$ line), $<TOperator>(op), unary, $<TIntermNode*>(env _$ node), *$<TType*>(env _$ returnType));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1canImplicitlyPromote
  (JNIEnv* env, jclass self, jbyteArray ptr, jint from, jint to, jint op){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->canImplicitlyPromote($<TBasicType >(from), $<TBasicType >(to), $<TOperator>(op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1isIntegralPromotion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint from, jint to){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->isIntegralPromotion($<TBasicType >(from), $<TBasicType >(to));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1isFPPromotion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint from, jint to){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->isFPPromotion($<TBasicType >(from), $<TBasicType >(to));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1isIntegralConversion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint from, jint to){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->isIntegralConversion($<TBasicType >(from), $<TBasicType >(to));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1isFPConversion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint from, jint to){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->isFPConversion($<TBasicType >(from), $<TBasicType >(to));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1isFPIntegralConversion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint from, jint to){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->isFPIntegralConversion($<TBasicType >(from), $<TBasicType >(to));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1mapTypeToConstructorOp
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->mapTypeToConstructorOp(*$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1growAggregate___3B_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray left, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->growAggregate($<TIntermNode*>(env _$ left), $<TIntermNode*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1growAggregate___3B_3B_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray left, jbyteArray right, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->growAggregate($<TIntermNode*>(env _$ left), $<TIntermNode*>(env _$ right), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1makeAggregate___3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->makeAggregate($<TIntermNode*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1makeAggregate___3B_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->makeAggregate($<TIntermNode*>(env _$ node), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1makeAggregateLoc
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->makeAggregate(*$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setAggregateOperator
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jint op, jbyteArray type, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->setAggregateOperator($<TIntermNode*>(env _$ node), $<TOperator>(op), *$<TType*>(env _$ type), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1areAllChildConst
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray aggrNode){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->areAllChildConst($<TIntermAggregate*>(env _$ aggrNode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addSelection___3B_3B_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray cond, jbyteArray code, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addSelection($<TIntermTyped*>(env _$ cond), *$<TIntermNodePair*>(env _$ code), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addSelection___3B_3B_3B_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray cond, jbyteArray trueBlock, jbyteArray falseBlock, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addSelection($<TIntermTyped*>(env _$ cond), $<TIntermTyped*>(env _$ falseBlock), $<TIntermTyped*>(env _$ falseBlock), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addComma
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray left, jbyteArray right, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addComma($<TIntermTyped*>(env _$ left), $<TIntermTyped*>(env _$ right), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addMethod
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jbyteArray t, jstring s, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addMethod($<TIntermTyped*>(env _$ node), *$<TType*>(env _$ t), toTString(env, s), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addConstantUnion___3B_3B_3B_3BZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray c, jbyteArray t, jbyteArray loc, jboolean literal){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addConstantUnion(*$<TConstUnionArray*>(env _$ c), *$<TType*>(env _$ t), *$<TSourceLoc*>(env _$ loc), literal);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addConstantUnion___3BB_3BZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyte v, jbyteArray loc, jboolean literal){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addConstantUnion((signed char) v, *$<TSourceLoc*>(env _$ loc), literal);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addConstantUnion___3BS_3BZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jshort v, jbyteArray loc, jboolean literal){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addConstantUnion((unsigned char) v, *$<TSourceLoc*>(env _$ loc), literal);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addConstantUnionUnsignedChar
  (JNIEnv* env, jclass self, jbyteArray ptr, jshort v, jbyteArray loc, jboolean literal){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addConstantUnion((signed short) v, *$<TSourceLoc*>(env _$ loc), literal);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addConstantUnion___3BI_3BZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v, jbyteArray loc, jboolean literal){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addConstantUnion((unsigned short) v, *$<TSourceLoc*>(env _$ loc), literal);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addConstantUnionUnsignedShort
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v, jbyteArray loc, jboolean literal){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addConstantUnion((signed int) v, *$<TSourceLoc*>(env _$ loc), literal);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addConstantUnion___3BJ_3BZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v, jbyteArray loc, jboolean literal){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addConstantUnion((unsigned int) v, *$<TSourceLoc*>(env _$ loc), literal);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addConstantUnion___3BLjava_math_BigInteger_2_3BZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject v, jbyteArray loc, jboolean literal){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addConstantUnion(BigIntegerToLongLong(env, v), *$<TSourceLoc*>(env _$ loc), literal);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addConstantUnionUnsignedLong
  (JNIEnv* env, jclass self, jbyteArray ptr, jobject v, jbyteArray loc, jboolean literal){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addConstantUnion(BigIntegerToUnsignedLongLong(env, v), *$<TSourceLoc*>(env _$ loc), literal);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addConstantUnion___3BZ_3BZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v, jbyteArray loc, jboolean literal){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addConstantUnion(v, *$<TSourceLoc*>(env _$ loc), literal);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addConstantUnion___3BDI_3BZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jdouble v, jint t, jbyteArray loc, jboolean literal){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addConstantUnion((double) v, $<TBasicType>(t), *$<TSourceLoc*>(env _$ loc), literal);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addConstantUnion___3BLjava_lang_String_2_3BZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring v, jbyteArray loc, jboolean literal){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addConstantUnion(toTString(env, v), *$<TSourceLoc*>(env _$ loc), literal);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1promoteConstantUnion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint t, jbyteArray c){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->promoteConstantUnion($<TBasicType>(t), $<TIntermConstantUnion*>(env _$ c));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1parseConstTree
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jbyteArray c, jint op, jbyteArray t, jboolean singleConstantParam){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->parseConstTree($<TIntermNode*>(env _$ node), *$<TConstUnionArray*>(env _$ c), $<TOperator>(op), *$<TType*>(env _$ t), singleConstantParam);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addLoop
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node0, jbyteArray node1, jbyteArray node2, jboolean testFirst, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addLoop($<TIntermNode*>(env _$ node0), $<TIntermTyped*>(env _$ node1), $<TIntermTyped*>(env _$ node2), testFirst, *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addForLoop
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node0, jbyteArray node1, jbyteArray node2, jbyteArray node3, jboolean testFirst, jbyteArray loc, jbyteArray loop){
	JNI_METHOD_GUARD_ENTER
	TIntermLoop* loopPtr = $<TIntermLoop*>(env _$ loop);
	return env $_ $<TIntermediate*>(env _$ ptr)->addForLoop($<TIntermNode*>(env _$ node0), $<TIntermNode*>(env _$ node1), $<TIntermTyped*>(env _$ node2), $<TIntermTyped*>(env _$ node3), testFirst, *$<TSourceLoc*>(env _$ loc), loopPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addBranch___3BI_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addBranch($<TOperator>(op), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addBranch___3BI_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray node, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addBranch($<TOperator>(op), $<TIntermTyped*>(env _$ node), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addSwizzle
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray selectors, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return env $_ nullptr;
	//return env $_ $<TIntermediate*>(env _$ ptr)->addSwizzle(*$<TSwizzleSelectors<void*>*>(env _$ selectors), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addBinaryNode___3BI_3B_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray left, jbyteArray right, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addBinaryNode($<TOperator>(op), $<TIntermTyped*>(env _$ left), $<TIntermTyped*>(env _$ right), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addBinaryNode___3BI_3B_3B_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray left, jbyteArray right, jbyteArray loc, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addBinaryNode($<TOperator>(op), $<TIntermTyped*>(env _$ left), $<TIntermTyped*>(env _$ right), *$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addUnaryNode___3BI_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray child, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addUnaryNode($<TOperator>(op), $<TIntermTyped*>(env _$ child), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addUnaryNode___3BI_3B_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray child, jbyteArray loc, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->addUnaryNode($<TOperator>(op), $<TIntermTyped*>(env _$ child), *$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1fold
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray aggrNode){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->fold($<TIntermAggregate*>(env _$ aggrNode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1foldConstructor
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray aggrNode){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->foldConstructor($<TIntermAggregate*>(env _$ aggrNode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1foldDereference
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jint index, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->foldDereference($<TIntermTyped*>(env _$ node), index, *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1foldSwizzle
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jbyteArray fields, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->foldSwizzle($<TIntermTyped*>(env _$ node), *$<TSwizzleSelectors<TVectorSelector>*>(env _$ fields), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addSymbolLinkageNodes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray linkage, jint language, jbyteArray table){
	JNI_METHOD_GUARD_ENTER
	TIntermAggregate* linkagePtr = $<TIntermAggregate*>(env _$ linkage);
	$<TIntermediate*>(env _$ ptr)->addSymbolLinkageNodes(linkagePtr, $<EShLanguage>(language), *$<TSymbolTable*>(env _$ table));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addSymbolLinkageNode
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray linkage, jbyteArray symbol){
	JNI_METHOD_GUARD_ENTER
	TIntermAggregate* linkagePtr = $<TIntermAggregate*>(env _$ linkage);
	$<TIntermediate*>(env _$ ptr)->addSymbolLinkageNode(linkagePtr, *$<TSymbol*>(env _$ symbol));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setUseStorageBuffer
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setUseStorageBuffer();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1usingStorageBuffer
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->usingStorageBuffer();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setDepthReplacing
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setDepthReplacing();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1isDepthReplacing
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->isDepthReplacing();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setLocalSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint dim, jint size){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->setLocalSize(dim, size);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getLocalSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jint dim){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getLocalSize(dim);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setLocalSizeSpecId
  (JNIEnv* env, jclass self, jbyteArray ptr, jint dim, jint size){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->setLocalSizeSpecId(dim, size);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getLocalSizeSpecId
  (JNIEnv* env, jclass self, jbyteArray ptr, jint dim){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getLocalSizeSpecId(dim);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1output
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray sink, jboolean tree){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->output(*$<TInfoSink*>(env _$ sink), tree);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1isEsProfile
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->isEsProfile();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getXfbMode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getXfbMode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1isMultiStream
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->isMultiStream();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getOutputPrimitive
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getOutputPrimitive();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getPostDepthCoverage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getPostDepthCoverage();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getEarlyFragmentTests
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getEarlyFragmentTests();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getDepth
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getDepth();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getPixelCenterInteger
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getPixelCenterInteger();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setOriginUpperLeft
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setOriginUpperLeft();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getOriginUpperLeft
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getOriginUpperLeft();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getInterlockOrdering
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getInterlockOrdering();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getAutoMapBindings
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getAutoMapBindings();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getAutoMapLocations
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getAutoMapLocations();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getNumPushConstants
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getNumPushConstants();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addShaderRecordCount
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->addShaderRecordCount();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addTaskNVCount
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->addTaskNVCount();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setUseVulkanMemoryModel
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setUseVulkanMemoryModel();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1usingVulkanMemoryModel
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->usingVulkanMemoryModel();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1usingPhysicalStorageBuffer
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->usingPhysicalStorageBuffer();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1usingVariablePointers
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->usingVariablePointers();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getXfbStride
  (JNIEnv* env, jclass self, jbyteArray ptr, jint buffer){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getXfbStride(buffer);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1hasLayoutDerivativeModeNone
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->hasLayoutDerivativeModeNone();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getLayoutDerivativeModeNone
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getLayoutDerivativeModeNone();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setShiftBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jint res, jlong shift){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setShiftBinding($<TResourceType>(res), shift);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getShiftBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jint res){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getShiftBinding($<TResourceType>(res));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setShiftBindingForSet
  (JNIEnv* env, jclass self, jbyteArray ptr, jint res, jlong shift, jlong set){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setShiftBindingForSet($<TResourceType>(res), shift, set);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getShiftBindingForSet
  (JNIEnv* env, jclass self, jbyteArray ptr, jint res, jlong set){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getShiftBindingForSet($<TResourceType>(res), set);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1hasShiftBindingForSet
  (JNIEnv* env, jclass self, jbyteArray ptr, jint res){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->hasShiftBindingForSet($<TResourceType>(res));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setResourceSetBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray shift){
	JNI_METHOD_GUARD_ENTER
	TIntermediate* elem = $<TIntermediate*>(env _$ ptr);
	elem->setResourceSetBinding(*toCStringVector(env, shift, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jobjectArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getResourceSetBinding
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toStringArray(env, $<TIntermediate*>(env _$ ptr)->getResourceSetBinding());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setAutoMapBindings
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean map){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setAutoMapBindings(map);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setAutoMapLocations
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean map){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setAutoMapLocations(map);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setFlattenUniformArrays
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean flatten){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setFlattenUniformArrays(flatten);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getFlattenUniformArrays
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getFlattenUniformArrays();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getNoStorageFormat
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getNoStorageFormat();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addCounterBufferName
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray name){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return env $_ nullptr;
	//return env $_ $<TIntermediate*>(env _$ ptr)->addCounterBufferName(env _$ name);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1hasCounterBufferName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->hasCounterBufferName(*toTString(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setTextureSamplerTransformMode
  (JNIEnv* env, jclass self, jbyteArray ptr, jint mode){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setTextureSamplerTransformMode($<EShTextureSamplerTransformMode>(mode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setInvocations
  (JNIEnv* env, jclass self, jbyteArray ptr, jint i){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->setInvocations(i);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getInvocations
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getInvocations();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setVertices
  (JNIEnv* env, jclass self, jbyteArray ptr, jint m){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->setVertices(m);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getVertices
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getVertices();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getInputPrimitive
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getInputPrimitive();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setVertexSpacing
  (JNIEnv* env, jclass self, jbyteArray ptr, jint s){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->setVertexSpacing($<TVertexSpacing>(s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getVertexSpacing
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getVertexSpacing();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setVertexOrder
  (JNIEnv* env, jclass self, jbyteArray ptr, jint o){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->setVertexOrder($<TVertexOrder>(o));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getVertexOrder
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getVertexOrder();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setPointMode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setPointMode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getPointMode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getPointMode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setInterlockOrdering
  (JNIEnv* env, jclass self, jbyteArray ptr, jint o){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->setInterlockOrdering($<TInterlockOrdering>(o));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setXfbMode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setXfbMode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setMultiStream
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setMultiStream();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setOutputPrimitive
  (JNIEnv* env, jclass self, jbyteArray ptr, jint p){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->setOutputPrimitive($<TLayoutGeometry>(p));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setPostDepthCoverage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setPostDepthCoverage();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setEarlyFragmentTests
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setEarlyFragmentTests();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setDepth
  (JNIEnv* env, jclass self, jbyteArray ptr, jint d){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->setDepth($<TLayoutDepth>(d));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setPixelCenterInteger
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setPixelCenterInteger();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addBlendEquation
  (JNIEnv* env, jclass self, jbyteArray ptr, jint b){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->addBlendEquation($<TBlendEquationShift>(b));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getBlendEquations
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getBlendEquations();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setXfbBufferStride
  (JNIEnv* env, jclass self, jbyteArray ptr, jint buffer, jlong stride){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->setXfbBufferStride(buffer, stride);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addXfbBufferOffset
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->addXfbBufferOffset(*$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TIntermediate_1computeTypeXfbSize___3B_3BZZZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray t, jboolean contains64BitType, jboolean contains32BitType, jboolean contains16BitType){
	JNI_METHOD_GUARD_ENTER
	bool contains64BitTypePtr = contains64BitType;
	bool contains32BitTypePtr = contains32BitType;
	bool contains16BitTypePtr = contains16BitType;
	return $<TIntermediate*>(env _$ ptr)->computeTypeXfbSize(*$<TType*>(env _$ t), contains64BitTypePtr, contains32BitTypePtr, contains16BitTypePtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TIntermediate_1computeTypeXfbSize___3B_3BZ
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray t, jboolean contains64BitType){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return -1;
	//bool contains64BitTypePtr = contains64BitType;
	//return $<TIntermediate*>(env _$ ptr)->computeTypeXfbSize(*$<TType*>(env _$ t), contains64BitTypePtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setLayoutOverrideCoverage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setLayoutOverrideCoverage();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getLayoutOverrideCoverage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getLayoutOverrideCoverage();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setGeoPassthroughEXT
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setGeoPassthroughEXT();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getGeoPassthroughEXT
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getGeoPassthroughEXT();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setLayoutDerivativeMode
  (JNIEnv* env, jclass self, jbyteArray ptr, jint mode){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setLayoutDerivativeMode($<ComputeDerivativeMode>(mode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setLayoutPrimitiveCulling
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setLayoutPrimitiveCulling();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getLayoutPrimitiveCulling
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getLayoutPrimitiveCulling();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setPrimitives
  (JNIEnv* env, jclass self, jbyteArray ptr, jint m){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->setPrimitives(m);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getPrimitives
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getPrimitives();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addSemanticName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TIntermediate*>(env _$ ptr)->addSemanticName(*toTString(env, name)));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addUniformLocationOverride
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring nameStr, jint location){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->addUniformLocationOverride(toChars(env, nameStr), location);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getUniformLocationOverride
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring nameStr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getUniformLocationOverride(toChars(env, nameStr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setUniformLocationBase
  (JNIEnv* env, jclass self, jbyteArray ptr, jint base){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setUniformLocationBase(base);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getUniformLocationBase
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getUniformLocationBase();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setNeedsLegalization
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setNeedsLegalization();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1needsLegalization
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->needsLegalization();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setBinaryDoubleOutput
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setBinaryDoubleOutput();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getBinaryDoubleOutput
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getBinaryDoubleOutput();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setHlslFunctionality1
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setHlslFunctionality1();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setHlslOffsets
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setHlslOffsets();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setHlslIoMapping
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean b){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setHlslIoMapping(b);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getHlslFunctionality1
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getHlslFunctionality1();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1usingHlslOffsets
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->usingHlslOffsets();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1usingHlslIoMapping
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->usingHlslIoMapping();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addToCallGraph
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray sink, jstring caller, jstring callee){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->addToCallGraph(*$<TInfoSink*>(env _$ sink), *toTString(env, caller), *toTString(env, callee));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1merge
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray sink, jbyteArray intermediate){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->merge(*$<TInfoSink*>(env _$ sink), *$<TIntermediate*>(env _$ intermediate));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1finalCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray sink, jboolean keepUncalled){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->finalCheck(*$<TInfoSink*>(env _$ sink), keepUncalled);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1buildConvertOp
  (JNIEnv* env, jclass self, jbyteArray ptr, jint dst, jint src, jint convertOp){
	JNI_METHOD_GUARD_ENTER
	TOperator convertOpPtr = $<TOperator>(convertOp);
	return $<TIntermediate*>(env _$ ptr)->buildConvertOp($<TBasicType>(dst), $<TBasicType>(src), convertOpPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1createConversion
  (JNIEnv* env, jclass self, jbyteArray ptr, jint convertTo, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->createConversion($<TBasicType>(convertTo), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addIoAccessed
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->addIoAccessed(*toTString(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1inIoAccessed
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->inIoAccessed(*toTString(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addUsedLocation
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray qualifier, jbyteArray t, jboolean typeCollision){
	JNI_METHOD_GUARD_ENTER
	bool typeCollisionPtr = typeCollision;
	return $<TIntermediate*>(env _$ ptr)->addUsedLocation(*$<TQualifier*>(env _$ qualifier), *$<TType*>(env _$ t), typeCollisionPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1checkLocationRange
  (JNIEnv* env, jclass self, jbyteArray ptr, jint set, jbyteArray range, jbyteArray t, jboolean typeCollision){
	JNI_METHOD_GUARD_ENTER
	bool typeCollisionPtr = typeCollision;
	return $<TIntermediate*>(env _$ ptr)->checkLocationRange(set, *$<TIoRange*>(env _$ range), *$<TType*>(env _$ t), typeCollisionPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addUsedOffsets
  (JNIEnv* env, jclass self, jbyteArray ptr, jint binding, jint offset, jint numOffsets){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->addUsedOffsets(binding, offset, numOffsets);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addUsedConstantId
  (JNIEnv* env, jclass self, jbyteArray ptr, jint id){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->addUsedConstantId(id);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1promote
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray op){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->promote($<TIntermOperator*>(env _$ op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setNanMinMaxClamp
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean setting){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setNanMinMaxClamp(setting);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getNanMinMaxClamp
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getNanMinMaxClamp();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1setSourceFile
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring file){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->setSourceFile(toChars(env, file));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getSourceFile
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TIntermediate*>(env _$ ptr)->getSourceFile());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addSourceText
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring text, jlong len){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->addSourceText(toChars(env, text), len);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getSourceText
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<TIntermediate*>(env _$ ptr)->getSourceText());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getIncludeText
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermediate*>(env _$ ptr)->getIncludeText();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addIncludeText
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring name, jstring text, jlong len){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->addIncludeText(toChars(env, name), toChars(env, text), len);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addProcesses
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray p){
	JNI_METHOD_GUARD_ENTER
	TIntermediate* elem = $<TIntermediate*>(env _$ ptr);
	elem->addProcesses(*toCStringVector(env, p, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addProcess
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring process){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->addProcess(toCString(env, process));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1addProcessArgument
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring arg){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->addProcessArgument(toCString(env, arg));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jobjectArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getProcesses
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toStringArray(env, $<TIntermediate*>(env _$ ptr)->getProcesses());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getArithemeticInt8Enabled
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getArithemeticInt8Enabled();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getArithemeticInt16Enabled
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getArithemeticInt16Enabled();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getArithemeticFloat16Enabled
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermediate*>(env _$ ptr)->getArithemeticFloat16Enabled();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1updateNumericFeature
  (JNIEnv* env, jclass self, jbyteArray ptr, jint f, jboolean on){
	JNI_METHOD_GUARD_ENTER
	$<TIntermediate*>(env _$ ptr)->updateNumericFeature($<TNumericFeatures::feature>(f), on);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermediate_1findLValueBase
  (JNIEnv* env, jclass self, jbyteArray node, jboolean swizzleOkay){
	JNI_METHOD_GUARD_ENTER
	return env $_ TIntermediate::findLValueBase($<TIntermTyped*>(env _$ node), swizzleOkay);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1computeTypeLocationSize
  (JNIEnv* env, jclass self, jbyteArray t, jint language){
	JNI_METHOD_GUARD_ENTER
	return TIntermediate::computeTypeLocationSize(*$<TType*>(env _$ t), $<EShLanguage>(language));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1computeTypeUniformLocationSize
  (JNIEnv* env, jclass self, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return TIntermediate::computeTypeUniformLocationSize(*$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getBaseAlignmentScalar
  (JNIEnv* env, jclass self, jbyteArray t, jint size){
	JNI_METHOD_GUARD_ENTER
	int sizePtr = size;
	return TIntermediate::getBaseAlignmentScalar(*$<TType*>(env _$ t), sizePtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getBaseAlignment
  (JNIEnv* env, jclass self, jbyteArray t, jint size, jint stride, jint layoutPacking, jboolean rowMajor){
	JNI_METHOD_GUARD_ENTER
	int sizePtr = size;
	int stridePtr = stride;
	return TIntermediate::getBaseAlignment(*$<TType*>(env _$ t), sizePtr, stridePtr, $<TLayoutPacking>(layoutPacking), rowMajor);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getScalarAlignment
  (JNIEnv* env, jclass self, jbyteArray t, jint size, jint stride, jboolean rowMajor){
	JNI_METHOD_GUARD_ENTER
	int sizePtr = size;
	int stridePtr = stride;
	return TIntermediate::getScalarAlignment(*$<TType*>(env _$ t), sizePtr, stridePtr, rowMajor);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getMemberAlignment
  (JNIEnv* env, jclass self, jbyteArray t, jint size, jint stride, jint layoutPacking, jboolean rowMajor){
	JNI_METHOD_GUARD_ENTER
	int sizePtr = size;
	int stridePtr = stride;
	return TIntermediate::getMemberAlignment(*$<TType*>(env _$ t), sizePtr, stridePtr, $<TLayoutPacking>(layoutPacking), rowMajor);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermediate_1improperStraddle
  (JNIEnv* env, jclass self, jbyteArray t, jint size, jint offset){
	JNI_METHOD_GUARD_ENTER
	return TIntermediate::improperStraddle(*$<TType*>(env _$ t), size, offset);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermediate_1updateOffset
  (JNIEnv* env, jclass self, jbyteArray parentType, jbyteArray memberType, jint offset, jint memberSize){
	JNI_METHOD_GUARD_ENTER
	int offsetPtr = offset;
	int memberSizePtr = memberSize;
	return TIntermediate::updateOffset(*$<TType*>(env _$ parentType), *$<TType*>(env _$ memberType), offsetPtr, memberSizePtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getOffset
  (JNIEnv* env, jclass self, jbyteArray t, jint index){
	JNI_METHOD_GUARD_ENTER
	return TIntermediate::getOffset(*$<TType*>(env _$ t), index);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1getBlockSize
  (JNIEnv* env, jclass self, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return TIntermediate::getBlockSize(*$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermediate_1computeBufferReferenceTypeSize
  (JNIEnv* env, jclass self, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return TIntermediate::computeBufferReferenceTypeSize(*$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}
