
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/Include/intermediate.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNode_1getLoc
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNode*>(env _$ ptr)->getLoc();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermNode_1setLoc
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	$<TIntermNode*>(env _$ ptr)->setLoc(*$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermNode_1traverse
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermNode*>(env _$ ptr)->traverse($<TIntermTraverser*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNode_1getAsTyped
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNode*>(env _$ ptr)->getAsTyped();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNode_1getAsOperator
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNode*>(env _$ ptr)->getAsOperator();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNode_1getAsConstantUnion
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNode*>(env _$ ptr)->getAsConstantUnion();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNode_1getAsAggregate
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNode*>(env _$ ptr)->getAsAggregate();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNode_1getAsUnaryNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNode*>(env _$ ptr)->getAsUnaryNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNode_1getAsBinaryNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNode*>(env _$ ptr)->getAsBinaryNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNode_1getAsSelectionNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNode*>(env _$ ptr)->getAsSelectionNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNode_1getAsSwitchNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNode*>(env _$ ptr)->getAsSwitchNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNode_1getAsMethodNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNode*>(env _$ ptr)->getAsMethodNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNode_1getAsSymbolNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNode*>(env _$ ptr)->getAsSymbolNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNode_1getAsBranchNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNode*>(env _$ ptr)->getAsBranchNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNode_1getAsLoopNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNode*>(env _$ ptr)->getAsLoopNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNodePair___3B_3B
  (JNIEnv* env, jclass self, jbyteArray node1, jbyteArray node2){
	JNI_METHOD_GUARD_ENTER
	TIntermNodePair* ret = Pool_malloc($<TIntermNodePair*>(nullptr));
	ret->node1 = $<TIntermNode*>(env _$ node1);
	ret->node2 = $<TIntermNode*>(env _$ node2);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNodePair__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TIntermNodePair*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermNodePair_1setNode1
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermNodePair*>(env _$ ptr)->node1 = $<TIntermNode*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermNodePair_1setNode2
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermNodePair*>(env _$ ptr)->node2 = $<TIntermNode*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNodePair_1getNode1
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNodePair*>(env _$ ptr)->node1;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermNodePair_1getNode2
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermNodePair*>(env _$ ptr)->node2;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1getAsTyped
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermTyped*>(env _$ ptr)->getAsTyped();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1setType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	$<TIntermTyped*>(env _$ ptr)->setType(*$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1getType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermTyped*>(env _$ ptr)->getType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1getWritableType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermTyped*>(env _$ ptr)->getWritableType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1getBasicType
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTyped*>(env _$ ptr)->getBasicType();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1getQualifier
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermTyped*>(env _$ ptr)->getQualifier();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1propagatePrecision
  (JNIEnv* env, jclass self, jbyteArray ptr, jint p){
	JNI_METHOD_GUARD_ENTER
	$<TIntermTyped*>(env _$ ptr)->propagatePrecision($<TPrecisionQualifier>(p));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1getVectorSize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTyped*>(env _$ ptr)->getVectorSize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1getMatrixCols
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTyped*>(env _$ ptr)->getMatrixCols();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1getMatrixRows
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTyped*>(env _$ ptr)->getMatrixRows();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1isMatrix
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTyped*>(env _$ ptr)->isMatrix();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1isArray
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTyped*>(env _$ ptr)->isArray();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1isVector
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTyped*>(env _$ ptr)->isVector();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1isScalar
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTyped*>(env _$ ptr)->isScalar();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1isStruct
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTyped*>(env _$ ptr)->isStruct();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1isFloatingDomain
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTyped*>(env _$ ptr)->isFloatingDomain();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1isIntegerDomain
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTyped*>(env _$ ptr)->isIntegerDomain();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1isAtomic
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTyped*>(env _$ ptr)->isAtomic();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1isReference
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTyped*>(env _$ ptr)->isReference();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TIntermTyped_1getCompleteString
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TIntermTyped*>(env _$ ptr)->getCompleteString();
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermLoop
  (JNIEnv* env, jclass self, jbyteArray aBody, jbyteArray aTest, jbyteArray aTerminal, jboolean testFirst){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TIntermLoop*>(nullptr), $<TIntermNode*>(env _$ aBody), $<TIntermTyped*>(env _$ aTest), $<TIntermTyped*>(env _$ aTerminal), testFirst);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1getAsLoopNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermLoop*>(env _$ ptr)->getAsLoopNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1traverse
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermLoop*>(env _$ ptr)->traverse($<TIntermTraverser*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1getBody
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermLoop*>(env _$ ptr)->getBody();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1getTest
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermLoop*>(env _$ ptr)->getTest();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1getTerminal
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermLoop*>(env _$ ptr)->getTerminal();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1testFirst
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermLoop*>(env _$ ptr)->testFirst();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1setUnroll
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermLoop*>(env _$ ptr)->setUnroll();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1setDontUnroll
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermLoop*>(env _$ ptr)->setDontUnroll();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1getUnroll
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermLoop*>(env _$ ptr)->getUnroll();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1getDontUnroll
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermLoop*>(env _$ ptr)->getDontUnroll();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1setLoopDependency
  (JNIEnv* env, jclass self, jbyteArray ptr, jint d){
	JNI_METHOD_GUARD_ENTER
	$<TIntermLoop*>(env _$ ptr)->setLoopDependency(d);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1getLoopDependency
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermLoop*>(env _$ ptr)->getLoopDependency();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1setMinIterations
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermLoop*>(env _$ ptr)->setMinIterations(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1getMinIterations
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermLoop*>(env _$ ptr)->getMinIterations();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1setMaxIterations
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermLoop*>(env _$ ptr)->setMaxIterations(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1getMaxIterations
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermLoop*>(env _$ ptr)->getMaxIterations();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1setIterationMultiple
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermLoop*>(env _$ ptr)->setIterationMultiple(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1getIterationMultiple
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermLoop*>(env _$ ptr)->getIterationMultiple();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1setPeelCount
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermLoop*>(env _$ ptr)->setPeelCount(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1getPeelCount
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermLoop*>(env _$ ptr)->getPeelCount();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1setPartialCount
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermLoop*>(env _$ ptr)->setPartialCount(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TIntermLoop_1getPartialCount
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermLoop*>(env _$ ptr)->getPartialCount();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermBranch
  (JNIEnv* env, jclass self, jint op, jbyteArray e){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TIntermBranch*>(nullptr), $<TOperator>(op), $<TIntermTyped*>(env _$ e));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermBranch_1getAsBranchNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermBranch*>(env _$ ptr)->getAsBranchNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermBranch_1traverse
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermBranch*>(env _$ ptr)->traverse($<TIntermTraverser*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermBranch_1getFlowOp
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermBranch*>(env _$ ptr)->getFlowOp();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermBranch_1getExpression
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermBranch*>(env _$ ptr)->getExpression();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermBranch_1setExpression
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray pExpression){
	JNI_METHOD_GUARD_ENTER
	$<TIntermBranch*>(env _$ ptr)->setExpression($<TIntermTyped*>(env _$ pExpression));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermBranch_1updatePrecision
  (JNIEnv* env, jclass self, jbyteArray ptr, jint parentPrecision){
	JNI_METHOD_GUARD_ENTER
	$<TIntermBranch*>(env _$ ptr)->updatePrecision($<TPrecisionQualifier>(parentPrecision));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermMethod
  (JNIEnv* env, jclass self, jbyteArray o, jbyteArray t, jstring m){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* oRef = $<TIntermTyped*>(env _$ o);
	return env $_ Pool_mallocIndirect($<TIntermMethod*>(nullptr), &oRef, $<TType*>(env _$ t), toTString(env, m));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermMethod_1getAsMethodNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermMethod*>(env _$ ptr)->getAsMethodNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TIntermMethod_1getMethodName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TIntermMethod*>(env _$ ptr)->getMethodName();
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermMethod_1getObject
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermMethod*>(env _$ ptr)->getObject();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermMethod_1traverse
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermMethod*>(env _$ ptr)->traverse($<TIntermTraverser*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermSymbol
  (JNIEnv* env, jclass self, jint i, jstring n, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_mallocIndirect($<TIntermSymbol*>(nullptr), &i, toTString(env, n), $<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermSymbol_1getId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermSymbol*>(env _$ ptr)->getId();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermSymbol_1changeId
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermSymbol*>(env _$ ptr)->changeId(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TIntermSymbol_1getName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TIntermSymbol*>(env _$ ptr)->getName();
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermSymbol_1traverse
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermSymbol*>(env _$ ptr)->traverse($<TIntermTraverser*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermSymbol_1getAsSymbolNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermSymbol*>(env _$ ptr)->getAsSymbolNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermSymbol_1setConstArray
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray c){
	JNI_METHOD_GUARD_ENTER
	$<TIntermSymbol*>(env _$ ptr)->setConstArray(*$<TConstUnionArray*>(env _$ c));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermSymbol_1getConstArray
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermSymbol*>(env _$ ptr)->getConstArray();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermSymbol_1setConstSubtree
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray subtree){
	JNI_METHOD_GUARD_ENTER
	$<TIntermSymbol*>(env _$ ptr)->setConstSubtree($<TIntermTyped*>(env _$ subtree));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermSymbol_1getConstSubtree
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermSymbol*>(env _$ ptr)->getConstSubtree();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermSymbol_1setFlattenSubset
  (JNIEnv* env, jclass self, jbyteArray ptr, jint subset){
	JNI_METHOD_GUARD_ENTER
	$<TIntermSymbol*>(env _$ ptr)->setFlattenSubset(subset);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermSymbol_1getFlattenSubset
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermSymbol*>(env _$ ptr)->getFlattenSubset();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermSymbol_1switchId
  (JNIEnv* env, jclass self, jbyteArray ptr, jint newId){
	JNI_METHOD_GUARD_ENTER
	$<TIntermSymbol*>(env _$ ptr)->switchId(newId);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermConstantUnion
  (JNIEnv* env, jclass self, jbyteArray ua, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_mallocIndirect($<TIntermConstantUnion*>(nullptr), $<TConstUnionArray*>(env _$ ua), $<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermConstantUnion_1getConstArray
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermConstantUnion*>(env _$ ptr)->getConstArray();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermConstantUnion_1getAsConstantUnion
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermConstantUnion*>(env _$ ptr)->getAsConstantUnion();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermConstantUnion_1traverse
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermConstantUnion*>(env _$ ptr)->traverse($<TIntermTraverser*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermConstantUnion_1foldTyped
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermConstantUnion*>(env _$ ptr)->fold($<TOperator>(op), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermConstantUnion_1fold
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermConstantUnion*>(env _$ ptr)->fold($<TOperator>(op), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermConstantUnion_1setLiteral
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermConstantUnion*>(env _$ ptr)->setLiteral();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermConstantUnion_1setExpression
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermConstantUnion*>(env _$ ptr)->setExpression();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermConstantUnion_1isLiteral
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermConstantUnion*>(env _$ ptr)->isLiteral();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TCrackedTextureOp*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp__ZZZZZZZZZZZ
  (JNIEnv* env, jclass self, jboolean query, jboolean proj, jboolean lod, jboolean fetch, jboolean offset, jboolean offsets, jboolean gather, jboolean grad, jboolean subpass, jboolean lodClamp, jboolean fragMask){
	JNI_METHOD_GUARD_ENTER
	TCrackedTextureOp* ret = Pool_malloc($<TCrackedTextureOp*>(nullptr));
	ret->query = query;
	ret->proj = proj;
	ret->lod = lod;
	ret->fetch = fetch;
	ret->offset = offset;
	ret->offsets = offsets;
	ret->gather = gather;
	ret->grad = grad;
	ret->subpass = subpass;
	ret->lodClamp = lodClamp;
	ret->fragMask = fragMask;
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1setQuery
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TCrackedTextureOp*>(env _$ ptr)->query = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1setProj
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TCrackedTextureOp*>(env _$ ptr)->proj = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1setLod
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TCrackedTextureOp*>(env _$ ptr)->lod = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1setFetch
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TCrackedTextureOp*>(env _$ ptr)->fetch = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1setOffset
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TCrackedTextureOp*>(env _$ ptr)->offset = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1setOffsets
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TCrackedTextureOp*>(env _$ ptr)->offsets = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1setGather
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TCrackedTextureOp*>(env _$ ptr)->gather = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1setGrad
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TCrackedTextureOp*>(env _$ ptr)->grad = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1setSubpass
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TCrackedTextureOp*>(env _$ ptr)->subpass = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1setLodClamp
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TCrackedTextureOp*>(env _$ ptr)->lodClamp = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1setFragMask
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TCrackedTextureOp*>(env _$ ptr)->fragMask = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1getQuery
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCrackedTextureOp*>(env _$ ptr)->query;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1getProj
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCrackedTextureOp*>(env _$ ptr)->proj;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1getLod
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCrackedTextureOp*>(env _$ ptr)->lod;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1getFetch
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCrackedTextureOp*>(env _$ ptr)->fetch;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1getOffset
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCrackedTextureOp*>(env _$ ptr)->offset;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1getOffsets
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCrackedTextureOp*>(env _$ ptr)->offsets;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1getGather
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCrackedTextureOp*>(env _$ ptr)->gather;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1getGrad
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCrackedTextureOp*>(env _$ ptr)->grad;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1getSubpass
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCrackedTextureOp*>(env _$ ptr)->subpass;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1getLodClamp
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCrackedTextureOp*>(env _$ ptr)->lodClamp;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TCrackedTextureOp_1getFragMask
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TCrackedTextureOp*>(env _$ ptr)->fragMask;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1getAsOperator
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermOperator*>(env _$ ptr)->getAsOperator();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1getOp
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermOperator*>(env _$ ptr)->getOp();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1setOp
  (JNIEnv* env, jclass self, jbyteArray ptr, jint op){
	JNI_METHOD_GUARD_ENTER
	$<TIntermOperator*>(env _$ ptr)->setOp($<TOperator>(op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1modifiesState
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermOperator*>(env _$ ptr)->modifiesState();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1isConstructor
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermOperator*>(env _$ ptr)->isConstructor();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1isTexture
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermOperator*>(env _$ ptr)->isTexture();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1isSampling
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermOperator*>(env _$ ptr)->isSampling();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1isImage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermOperator*>(env _$ ptr)->isImage();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1isSparseTexture
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermOperator*>(env _$ ptr)->isSparseTexture();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1isImageFootprint
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermOperator*>(env _$ ptr)->isImageFootprint();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1isSparseImage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermOperator*>(env _$ ptr)->isSparseImage();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1isSubgroup
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermOperator*>(env _$ ptr)->isSubgroup();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1setOperationPrecision
  (JNIEnv* env, jclass self, jbyteArray ptr, jint p){
	JNI_METHOD_GUARD_ENTER
	$<TIntermOperator*>(env _$ ptr)->setOperationPrecision($<TPrecisionQualifier>(p));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1getOperationPrecision
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermOperator*>(env _$ ptr)->getOperationPrecision();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1getCompleteString
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TIntermOperator*>(env _$ ptr)->getCompleteString();
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermOperator_1crackTexture
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray sampler, jbyteArray cracked){
	JNI_METHOD_GUARD_ENTER
	$<TIntermOperator*>(env _$ ptr)->crackTexture(*$<TSampler*>(env _$ sampler), *$<TCrackedTextureOp*>(env _$ cracked));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermBinary
  (JNIEnv* env, jclass self, jint o){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TIntermBinary*>(nullptr), $<TOperator>(o));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermBinary_1traverse
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermBinary*>(env _$ ptr)->traverse($<TIntermTraverser*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermBinary_1setLeft
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray n){
	JNI_METHOD_GUARD_ENTER
	$<TIntermBinary*>(env _$ ptr)->setLeft($<TIntermTyped*>(env _$ n));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermBinary_1setRight
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray n){
	JNI_METHOD_GUARD_ENTER
	$<TIntermBinary*>(env _$ ptr)->setRight($<TIntermTyped*>(env _$ n));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermBinary_1getLeft
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermBinary*>(env _$ ptr)->getLeft();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermBinary_1getRight
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermBinary*>(env _$ ptr)->getRight();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermBinary_1getAsBinaryNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermBinary*>(env _$ ptr)->getAsBinaryNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermBinary_1updatePrecision
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermBinary*>(env _$ ptr)->updatePrecision();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermUnary__I_3B
  (JNIEnv* env, jclass self, jint o, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	TOperator oRef = $<TOperator>(o);
	return env $_ Pool_mallocIndirect($<TIntermUnary*>(nullptr), &oRef, $<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermUnary__I
  (JNIEnv* env, jclass self, jint o){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TIntermUnary*>(nullptr), $<TOperator>(o));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermUnary_1traverse
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermUnary*>(env _$ ptr)->traverse($<TIntermTraverser*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermUnary_1setOperand
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray o){
	JNI_METHOD_GUARD_ENTER
	$<TIntermUnary*>(env _$ ptr)->setOperand($<TIntermTyped*>(env _$ o));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermUnary_1getOperand
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermUnary*>(env _$ ptr)->getOperand();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermUnary_1getAsUnaryNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermUnary*>(env _$ ptr)->getAsUnaryNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermUnary_1updatePrecision
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermUnary*>(env _$ ptr)->updatePrecision();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermAggregate__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TIntermAggregate*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermAggregate__I
  (JNIEnv* env, jclass self, jint o){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TIntermAggregate*>(nullptr), $<TOperator>(o));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1getAsAggregate
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermAggregate*>(env _$ ptr)->getAsAggregate();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1setOperator
  (JNIEnv* env, jclass self, jbyteArray ptr, jint o){
	JNI_METHOD_GUARD_ENTER
	$<TIntermAggregate*>(env _$ ptr)->setOperator($<TOperator>(o));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1getSequence
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermAggregate*>(env _$ ptr)->getSequence();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1setName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring n){
	JNI_METHOD_GUARD_ENTER
	$<TIntermAggregate*>(env _$ ptr)->setName(*toTString(env, n));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1getName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TIntermAggregate*>(env _$ ptr)->getName();
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1traverse
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermAggregate*>(env _$ ptr)->traverse($<TIntermTraverser*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1setUserDefined
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermAggregate*>(env _$ ptr)->setUserDefined();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1isUserDefined
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermAggregate*>(env _$ ptr)->isUserDefined();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jintArray JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1getQualifierList
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	TQualifierList qualifiers = $<TIntermAggregate*>(env _$ ptr)->getQualifierList();
	jintArray ret = env->NewIntArray(qualifiers.size());
	env->SetIntArrayRegion(ret, 0, qualifiers.size(), ((jint*) &qualifiers[0]));
	return ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1setOptimize
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermAggregate*>(env _$ ptr)->setOptimize(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1setDebug
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermAggregate*>(env _$ ptr)->setDebug(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1getOptimize
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermAggregate*>(env _$ ptr)->getOptimize();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1getDebug
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermAggregate*>(env _$ ptr)->getDebug();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1setPragmaTable
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray table){
	JNI_METHOD_GUARD_ENTER
	$<TIntermAggregate*>(env _$ ptr)->setPragmaTable(*$<TPragmaTable*>(env _$ table));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermAggregate_1getPragmaTable
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermAggregate*>(env _$ ptr)->getPragmaTable();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermSelection___3B_3B_3B
  (JNIEnv* env, jclass self, jbyteArray cond, jbyteArray trueB, jbyteArray falseB){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* condRef = $<TIntermTyped*>(env _$ cond);
	TIntermNode* trueBRef = $<TIntermNode*>(env _$ trueB);
	TIntermNode* falseBRef = $<TIntermNode*>(env _$ falseB);
	return env $_ Pool_mallocIndirect($<TIntermSelection*>(nullptr), &condRef, &trueBRef, &falseBRef);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermSelection___3B_3B_3B_3B
  (JNIEnv* env, jclass self, jbyteArray cond, jbyteArray trueB, jbyteArray falseB, jbyteArray type){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* condRef = $<TIntermTyped*>(env _$ cond);
	TIntermNode* trueBRef = $<TIntermNode*>(env _$ trueB);
	TIntermNode* falseBRef = $<TIntermNode*>(env _$ falseB);
	return env $_ Pool_mallocIndirect($<TIntermSelection*>(nullptr), &condRef, &trueBRef, &falseBRef, $<TType*>(env _$ type));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermSelection_1traverse
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermSelection*>(env _$ ptr)->traverse($<TIntermTraverser*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermSelection_1getCondition
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermSelection*>(env _$ ptr)->getCondition();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermSelection_1getTrueBlock
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermSelection*>(env _$ ptr)->getTrueBlock();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermSelection_1getFalseBlock
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermSelection*>(env _$ ptr)->getFalseBlock();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermSelection_1getAsSelectionNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermSelection*>(env _$ ptr)->getAsSelectionNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermSelection_1setNoShortCircuit
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermSelection*>(env _$ ptr)->setNoShortCircuit();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermSelection_1getShortCircuit
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermSelection*>(env _$ ptr)->getShortCircuit();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermSelection_1setFlatten
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermSelection*>(env _$ ptr)->setFlatten();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermSelection_1setDontFlatten
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermSelection*>(env _$ ptr)->setDontFlatten();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermSelection_1getFlatten
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermSelection*>(env _$ ptr)->getFlatten();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermSelection_1getDontFlatten
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermSelection*>(env _$ ptr)->getDontFlatten();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermSwitch
  (JNIEnv* env, jclass self, jbyteArray cond, jbyteArray b){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TIntermSwitch*>(nullptr), $<TIntermTyped*>(env _$ cond), $<TIntermAggregate*>(env _$ b));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermSwitch_1traverse
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermSwitch*>(env _$ ptr)->traverse($<TIntermTraverser*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermSwitch_1getCondition
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermSwitch*>(env _$ ptr)->getCondition();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermSwitch_1getBody
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermSwitch*>(env _$ ptr)->getBody();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermSwitch_1getAsSwitchNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermSwitch*>(env _$ ptr)->getAsSwitchNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermSwitch_1setFlatten
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermSwitch*>(env _$ ptr)->setFlatten();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermSwitch_1setDontFlatten
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermSwitch*>(env _$ ptr)->setDontFlatten();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermSwitch_1getFlatten
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermSwitch*>(env _$ ptr)->getFlatten();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermSwitch_1getDontFlatten
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermSwitch*>(env _$ ptr)->getDontFlatten();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermTraverser
  (JNIEnv* env, jclass self, jboolean preVisit, jboolean inVisit, jboolean postVisit, jboolean rightToLeft){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TIntermTraverser(preVisit, inVisit, postVisit, rightToLeft);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1visitSymbol
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermTraverser*>(env _$ ptr)->visitSymbol($<TIntermSymbol*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1visitConstantUnion
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TIntermTraverser*>(env _$ ptr)->visitConstantUnion($<TIntermConstantUnion*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1visitBinary
  (JNIEnv* env, jclass self, jbyteArray ptr, jint visit, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTraverser*>(env _$ ptr)->visitBinary($<TVisit>(visit), $<TIntermBinary*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1visitUnary
  (JNIEnv* env, jclass self, jbyteArray ptr, jint visit, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTraverser*>(env _$ ptr)->visitUnary($<TVisit>(visit), $<TIntermUnary*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1visitSelection
  (JNIEnv* env, jclass self, jbyteArray ptr, jint visit, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTraverser*>(env _$ ptr)->visitSelection($<TVisit>(visit), $<TIntermSelection*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1visitAggregate
  (JNIEnv* env, jclass self, jbyteArray ptr, jint visit, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTraverser*>(env _$ ptr)->visitAggregate($<TVisit>(visit), $<TIntermAggregate*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1visitLoop
  (JNIEnv* env, jclass self, jbyteArray ptr, jint visit, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTraverser*>(env _$ ptr)->visitLoop($<TVisit>(visit), $<TIntermLoop*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1visitBranch
  (JNIEnv* env, jclass self, jbyteArray ptr, jint visit, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTraverser*>(env _$ ptr)->visitBranch($<TVisit>(visit), $<TIntermBranch*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1visitSwitch
  (JNIEnv* env, jclass self, jbyteArray ptr, jint visit, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTraverser*>(env _$ ptr)->visitSwitch($<TVisit>(visit), $<TIntermSwitch*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1getMaxDepth
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTraverser*>(env _$ ptr)->getMaxDepth();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1incrementDepth
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray current){
	JNI_METHOD_GUARD_ENTER
	$<TIntermTraverser*>(env _$ ptr)->incrementDepth($<TIntermNode *>(env _$ current));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1decrementDepth
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<TIntermTraverser*>(env _$ ptr)->decrementDepth();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1getParentNode
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TIntermTraverser*>(env _$ ptr)->getParentNode();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1getPreVisit
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTraverser*>(env _$ ptr)->preVisit;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1getInVisit
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTraverser*>(env _$ ptr)->inVisit;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1getPostVisit
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTraverser*>(env _$ ptr)->postVisit;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIntermTraverser_1getRightToLeft
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TIntermTraverser*>(env _$ ptr)->rightToLeft;
	JNI_METHOD_GUARD_LEAVE
}
