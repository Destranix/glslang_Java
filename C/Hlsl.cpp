
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/HLSL/hlslAttributes.h>
#include <glslang/HLSL/hlslGrammar.h>
#include <glslang/HLSL/hlslOpMap.h>
#include <glslang/HLSL/hlslParseHelper.h>
#include <glslang/HLSL/hlslParseables.h>
#include <glslang/HLSL/hlslScanContext.h>
#include <glslang/HLSL/hlslTokenStream.h>
#include <glslang/HLSL/hlslTokens.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TFunctionDeclarator
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TFunctionDeclarator*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TFunctionDeclarator_1setLoc
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TFunctionDeclarator*>(env _$ ptr)->loc = *$<TSourceLoc*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TFunctionDeclarator_1setFunction
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TFunctionDeclarator*>(env _$ ptr)->function = $<TFunction*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TFunctionDeclarator_1setAttributes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TFunctionDeclarator*>(env _$ ptr)->attributes = *$<TAttributes*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TFunctionDeclarator_1setBody
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TFunctionDeclarator*>(env _$ ptr)->body = $<TVector<HlslToken>*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TFunctionDeclarator_1getLoc
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TFunctionDeclarator*>(env _$ ptr)->loc;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TFunctionDeclarator_1getFunction
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TFunctionDeclarator*>(env _$ ptr)->function;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TFunctionDeclarator_1getAttributes
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TFunctionDeclarator*>(env _$ ptr)->attributes;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TFunctionDeclarator_1getBody
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TFunctionDeclarator*>(env _$ ptr)->body;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslOpMap_1assignment
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return HlslOpMap::assignment($<EHlslTokenClass>(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslOpMap_1binary
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return HlslOpMap::binary($<EHlslTokenClass>(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslOpMap_1preUnary
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return HlslOpMap::preUnary($<EHlslTokenClass>(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslOpMap_1postUnary
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return HlslOpMap::postUnary($<EHlslTokenClass>(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslOpMap_1precedenceLevel
  (JNIEnv* env, jclass self, jint v){
	JNI_METHOD_GUARD_ENTER
	return HlslOpMap::precedenceLevel($<TOperator>(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslGrammar
  (JNIEnv* env, jclass self, jbyteArray scanner, jbyteArray parseContext){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_mallocIndirect($<HlslGrammar*>(nullptr), $<HlslScanContext*>(env _$ scanner), $<HlslParseContext*>(env _$ parseContext));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslGrammar_1parse
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<HlslGrammar*>(env _$ ptr)->parse();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext
  (JNIEnv* env, jclass self, jbyteArray table, jbyteArray inter, jboolean parsingBuiltins, jint version, jint profile, jbyteArray spvVersion, jint language, jbyteArray sink, jstring entryPoint, jboolean forwardCompatible, jint messages){
	JNI_METHOD_GUARD_ENTER
	EProfile profileRef = $<EProfile>(profile);
	EShLanguage languageRef = $<EShLanguage>(language);
	EShMessages messagesRef = $<EShMessages>(messages);
	return env $_ Pool_mallocIndirect($<HlslParseContext*>(nullptr), $<TSymbolTable*>(env _$ table), $<TIntermediate*>(env _$ inter), &parsingBuiltins, &version, &profileRef, $<SpvVersion*>(env _$ spvVersion), &languageRef, $<TInfoSink*>(env _$ sink), toTString(env, entryPoint), &forwardCompatible, &messagesRef);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1initializeExtensionBehavior
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->initializeExtensionBehavior();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1setLimits
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->setLimits(*$<TBuiltInResource*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1parseShaderStrings
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray context, jbyteArray input, jboolean versionWillBeError){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->parseShaderStrings(*$<TPpContext*>(env _$ context), *$<TInputScanner*>(env _$ input), versionWillBeError);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1getGlobalUniformBlockName
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<HlslParseContext*>(env _$ ptr)->getGlobalUniformBlockName());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1setUniformBlockDefaults
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->setUniformBlockDefaults(*$<TType*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1reservedPpErrorCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring name, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->reservedPpErrorCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, name), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1lineContinuationCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jboolean endOfComment){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->lineContinuationCheck(*$<TSourceLoc*>(env _$ loc), endOfComment);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1lineDirectiveShouldSetNextLine
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->lineDirectiveShouldSetNextLine();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1builtInName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring v){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->builtInName(*toTString(env, v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handlePragma
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jobjectArray s){
	JNI_METHOD_GUARD_ENTER
	HlslParseContext* elem = $<HlslParseContext*>(env _$ ptr);
	elem->handlePragma(*$<TSourceLoc*>(env _$ loc), *toTStringTVector(env, s, elem));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleVariable
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring s){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->handleVariable(*$<TSourceLoc*>(env _$ loc), toTString(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleBracketDereference
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray base, jbyteArray index){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->handleBracketDereference(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ base), $<TIntermTyped*>(env _$ index));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleBracketOperator
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray base, jbyteArray index){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->handleBracketOperator(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ base), $<TIntermTyped*>(env _$ index));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleBinaryMath
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring str, jint op, jbyteArray left, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->handleBinaryMath(*$<TSourceLoc*>(env _$ loc), toChars(env, str), $<TOperator>(op), $<TIntermTyped*>(env _$ left), $<TIntermTyped*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleUnaryMath
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring str, jint op, jbyteArray childNode){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->handleUnaryMath(*$<TSourceLoc*>(env _$ loc), toChars(env, str), $<TOperator>(op), $<TIntermTyped*>(env _$ childNode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleDotDereference
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray base, jstring field){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->handleDotDereference(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ base), *toTString(env, field));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1isBuiltInMethod
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray base, jstring field){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->isBuiltInMethod(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ base), *toTString(env, field));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1assignToInterface
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray variable){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->assignToInterface(*$<TVariable*>(env _$ variable));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleFunctionDeclarator
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function, jboolean prototype){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->handleFunctionDeclarator(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ function), prototype);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleFunctionDefinition
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function, jbyteArray attributes, jbyteArray entryPointTree){
	JNI_METHOD_GUARD_ENTER
	TIntermNode* nodePtr = $<TIntermNode*>(env _$ entryPointTree);
	return env $_ $<HlslParseContext*>(env _$ ptr)->handleFunctionDefinition(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ function), *$<TAttributes*>(env _$ attributes), nodePtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1transformEntryPoint
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function, jbyteArray attributes){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->transformEntryPoint(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ attributes), *$<TAttributes*>(env _$ attributes));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleEntryPointAttributes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray attributes){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->handleEntryPointAttributes(*$<TSourceLoc*>(env _$ loc), *$<TAttributes*>(env _$ attributes));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1transferTypeAttributes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray attributes, jbyteArray t, jboolean allowEntry){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->transferTypeAttributes(*$<TSourceLoc*>(env _$ loc), *$<TAttributes*>(env _$ attributes), *$<TType*>(env _$ t), allowEntry);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleFunctionBody
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function, jbyteArray functionBody, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	TIntermNode* nodePtr = $<TIntermNode*>(env _$ node);
	$<HlslParseContext*>(env _$ ptr)->handleFunctionBody(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ function), $<TIntermNode*>(env _$ functionBody), nodePtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1remapEntryPointIO
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray function, jbyteArray returnValue, jbyteArray inputs, jbyteArray outputs){
	JNI_METHOD_GUARD_ENTER
	TVariable* returnValuePtr = $<TVariable*>(env _$ returnValue);
	$<HlslParseContext*>(env _$ ptr)->remapEntryPointIO(*$<TFunction*>(env _$ function), returnValuePtr, *$<TVector<TVariable*>*>(env _$ inputs), *$<TVector<TVariable*>*>(env _$ outputs));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1remapNonEntryPointIO
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray function){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->remapNonEntryPointIO(*$<TFunction*>(env _$ function));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleReturnValue
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->handleReturnValue(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleFunctionArgument
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray function, jbyteArray arguments, jbyteArray newArg){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* argumentsPtr = $<TIntermTyped*>(env _$ arguments);
	$<HlslParseContext*>(env _$ ptr)->handleFunctionArgument($<TFunction*>(env _$ function), argumentsPtr, $<TIntermTyped*>(env _$ newArg));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleAssign
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint op, jbyteArray left, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->handleAssign(*$<TSourceLoc*>(env _$ loc), $<TOperator>(op), $<TIntermTyped*>(env _$ left), $<TIntermTyped*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleAssignToMatrixSwizzle
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint op, jbyteArray left, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->handleAssignToMatrixSwizzle(*$<TSourceLoc*>(env _$ loc), $<TOperator>(op), $<TIntermTyped*>(env _$ left), $<TIntermTyped*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleFunctionCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->handleFunctionCall(*$<TSourceLoc*>(env _$ loc), $<TFunction*>(env _$ function), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1assignClipCullDistance
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint op, jint semanticId, jbyteArray left, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->assignClipCullDistance(*$<TSourceLoc*>(env _$ loc), $<TOperator>(op), semanticId, $<TIntermTyped*>(env _$ left), $<TIntermTyped*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1assignPosition
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint op, jbyteArray left, jbyteArray right){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->assignPosition(*$<TSourceLoc*>(env _$ loc), $<TOperator>(op), $<TIntermTyped*>(env _$ left), $<TIntermTyped*>(env _$ right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1decomposeIntrinsic
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray node, jbyteArray arguments){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* nodePtr = $<TIntermTyped*>(env _$ node);
	$<HlslParseContext*>(env _$ ptr)->decomposeIntrinsic(*$<TSourceLoc*>(env _$ loc), nodePtr, $<TIntermNode*>(env _$ arguments));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1decomposeSampleMethods
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray node, jbyteArray arguments){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* nodePtr = $<TIntermTyped*>(env _$ node);
	$<HlslParseContext*>(env _$ ptr)->decomposeSampleMethods(*$<TSourceLoc*>(env _$ loc), nodePtr, $<TIntermNode*>(env _$ arguments));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1decomposeStructBufferMethods
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray node, jbyteArray arguments){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* nodePtr = $<TIntermTyped*>(env _$ node);
	$<HlslParseContext*>(env _$ ptr)->decomposeStructBufferMethods(*$<TSourceLoc*>(env _$ loc), nodePtr, $<TIntermNode*>(env _$ arguments));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1decomposeGeometryMethods
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray node, jbyteArray arguments){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* nodePtr = $<TIntermTyped*>(env _$ node);
	$<HlslParseContext*>(env _$ ptr)->decomposeGeometryMethods(*$<TSourceLoc*>(env _$ loc), nodePtr, $<TIntermNode*>(env _$ arguments));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1pushFrontArguments
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray front, jbyteArray arguments){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* argumentsPtr = $<TIntermTyped*>(env _$ arguments);
	$<HlslParseContext*>(env _$ ptr)->pushFrontArguments($<TIntermTyped*>(env _$ front), argumentsPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1addInputArgumentConversions
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray function, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* nodePtr = $<TIntermTyped*>(env _$ node);
	$<HlslParseContext*>(env _$ ptr)->addInputArgumentConversions(*$<TFunction*>(env _$ function), nodePtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1expandArguments
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* nodePtr = $<TIntermTyped*>(env _$ node);
	$<HlslParseContext*>(env _$ ptr)->expandArguments(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ function), nodePtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1addOutputArgumentConversions
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray function, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->addOutputArgumentConversions(*$<TFunction*>(env _$ function), *$<TIntermOperator*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1builtInOpCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray function, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->builtInOpCheck(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ function), *$<TIntermOperator*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1makeConstructorCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->makeConstructorCall(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleSemantic
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jint var, jstring upperCase){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->handleSemantic(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), $<TBuiltInVariable>(var), *toTString(env, upperCase));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handlePackOffset
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jstring location, jstring component){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->handlePackOffset(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), *toTString(env, location), toTString(env, component));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleRegister
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jstring profile, jstring desc, jint subComponent, jstring s){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->handleRegister(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), toTString(env, profile), *toTString(env, desc), subComponent, toTString(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1convertConditionalExpression
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray node, jboolean mustBeScalar){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->convertConditionalExpression(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ node), mustBeScalar);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleSamplerTextureCombine
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray argTex, jbyteArray argSampler){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->handleSamplerTextureCombine(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ argTex), $<TIntermTyped*>(env _$ argSampler));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1parseMatrixSwizzleSelector
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring s, jint cols, jint rows, jbyteArray selectors){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->parseMatrixSwizzleSelector(*$<TSourceLoc*>(env _$ loc), *toTString(env, s), cols, rows, *$<TSwizzleSelectors<TMatrixSelector>*>(env _$ selectors));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1getMatrixComponentsColumn
  (JNIEnv* env, jclass self, jbyteArray ptr, jint rows, jbyteArray selectors){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->getMatrixComponentsColumn(rows, *$<TSwizzleSelectors<TMatrixSelector>*>(env _$ selectors));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1assignError
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jstring left, jstring right){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->assignError(*$<TSourceLoc*>(env _$ loc), toChars(env, op), *toTString(env, left), *toTString(env, right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1unaryOpError
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jstring operand){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->unaryOpError(*$<TSourceLoc*>(env _$ loc), toChars(env, op), *toTString(env, operand));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1binaryOpError
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jstring left, jstring right){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->binaryOpError(*$<TSourceLoc*>(env _$ loc), toChars(env, op), *toTString(env, left), *toTString(env, right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1variableCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray nodePtr){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* nodePtrPtr = $<TIntermTyped*>(env _$ nodePtr);
	$<HlslParseContext*>(env _$ ptr)->variableCheck(nodePtrPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1constantValueCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jstring token){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->constantValueCheck($<TIntermTyped*>(env _$ node), toChars(env, token));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1integerCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jstring token){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->integerCheck($<TIntermTyped*>(env _$ node), toChars(env, token));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1globalCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring token){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->globalCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, token));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1constructorError
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray node, jbyteArray function, jint op, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->constructorError(*$<TSourceLoc*>(env _$ loc), $<TIntermNode*>(env _$ node), *$<TFunction*>(env _$ function), $<TOperator>(op), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1arraySizeCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray expr, jbyteArray size){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->arraySizeCheck(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ expr), *$<TArraySize*>(env _$ size));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1arraySizeRequiredCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray sizes){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->arraySizeRequiredCheck(*$<TSourceLoc*>(env _$ loc), *$<TArraySizes*>(env _$ sizes));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1structArrayCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray structure){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->structArrayCheck(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ structure));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1voidErrorCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring s, jint t){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->voidErrorCheck(*$<TSourceLoc*>(env _$ loc), *toTString(env, s), $<TBasicType>(t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1globalQualifierFix
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->globalQualifierFix(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1structQualifierErrorCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray pType){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	return false;
	//FIXME: Throws unresolved reference error. Cannot find any .cpp-File that implements that function.
	//return $<HlslParseContext*>(env _$ ptr)->structQualifierErrorCheck(*$<TSourceLoc*>(env _$ loc), *$<TPublicType*>(env _$ pType));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1mergeQualifiers
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray dst, jbyteArray src){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->mergeQualifiers(*$<TQualifier*>(env _$ dst), *$<TQualifier*>(env _$ src));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1computeSamplerTypeIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray sampler){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->computeSamplerTypeIndex(*$<TSampler*>(env _$ sampler));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1redeclareBuiltinVariable
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring s, jbyteArray qualifier, jbyteArray shaderQualifiers){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->redeclareBuiltinVariable(*$<TSourceLoc*>(env _$ loc), *toTString(env, s), *$<TQualifier*>(env _$ qualifier), *$<TShaderQualifiers*>(env _$ shaderQualifiers));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1paramFix
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray type){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->paramFix(*$<TType*>(env _$ type));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1specializationCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray type, jstring op){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->specializationCheck(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ type), toChars(env, op));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1setLayoutQualifier___3B_3B_3BLjava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jstring s){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->setLayoutQualifier(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), *toTString(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1setLayoutQualifier___3B_3B_3BLjava_lang_String_2_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jstring s, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->setLayoutQualifier(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), *toTString(env, s), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1setSpecConstantId
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jint value){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->setSpecConstantId(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), value);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1mergeObjectLayoutQualifiers
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray dst, jbyteArray src, jboolean inheritOnly){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->mergeObjectLayoutQualifiers(*$<TQualifier*>(env _$ dst), *$<TQualifier*>(env _$ src), inheritOnly);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1checkNoShaderLayouts
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray shaderQualifiers){
	JNI_METHOD_GUARD_ENTER
	setLastError(env, GLSLANG_ERROR_NOT_YET_IMPLEMENTED);
	//FIXME: Throws unresolved reference error. Cannot find any .cpp-File that implements that function.
	//$<HlslParseContext*>(env _$ ptr)->checkNoShaderLayouts(*$<TSourceLoc*>(env _$ loc), *$<TShaderQualifiers*>(env _$ shaderQualifiers));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1findFunction
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray call, jboolean builtIn, jint thisDepth, jbyteArray args){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* argsPtr = $<TIntermTyped*>(env _$ args);
	bool builtInPtr = builtIn;
	int thisDepthPtr = thisDepth;
	return env $_ $<HlslParseContext*>(env _$ ptr)->findFunction(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ call), builtInPtr, thisDepthPtr, argsPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1addGenMulArgumentConversion
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray call, jbyteArray args){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* argsPtr = $<TIntermTyped*>(env _$ args);
	$<HlslParseContext*>(env _$ ptr)->addGenMulArgumentConversion(*$<TSourceLoc*>(env _$ loc), *$<TFunction*>(env _$ call), argsPtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1declareTypedef
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring identifier, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->declareTypedef(*$<TSourceLoc*>(env _$ loc), *toTString(env, identifier), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1declareStruct
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring structName, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->declareStruct(*$<TSourceLoc*>(env _$ loc), *toTString(env, structName), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1lookupUserType
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->lookupUserType(*toTString(env, s), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1declareVariable
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring identifier, jbyteArray t, jbyteArray initializer){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->declareVariable(*$<TSourceLoc*>(env _$ loc), *toTString(env, identifier), *$<TType*>(env _$ t), $<TIntermTyped*>(env _$ initializer));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1lengthenList
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray list, jint size, jbyteArray scalarInit){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->lengthenList(*$<TSourceLoc*>(env _$ loc), *$<TIntermSequence*>(env _$ list), size, $<TIntermTyped*>(env _$ scalarInit));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleConstructor
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray node, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->handleConstructor(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ node), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1addConstructor
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray node, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->addConstructor(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ node), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1convertArray
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->convertArray($<TIntermTyped*>(env _$ node), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1constructAggregate
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray node, jbyteArray t, jint i, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->constructAggregate($<TIntermNode*>(env _$ node), *$<TType*>(env _$ t), i, *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1constructBuiltIn
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray t, jint op, jbyteArray node, jbyteArray loc, jboolean subset){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->constructBuiltIn(*$<TType*>(env _$ t), $<TOperator>(op), $<TIntermTyped*>(env _$ node), *$<TSourceLoc*>(env _$ loc), subset);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1declareBlock
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jstring instanceName ){
	JNI_METHOD_GUARD_ENTER
	 $<HlslParseContext*>(env _$ ptr)->declareBlock(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t), toTString(env, instanceName));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1declareStructBufferCounter
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray bufferType, jstring name){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->declareStructBufferCounter(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ bufferType), *toTString(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1fixBlockLocations
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jbyteArray list, jboolean memberWithLocation, jboolean memberWithoutLocation){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->fixBlockLocations(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), *$<TTypeList*>(env _$ list), memberWithLocation, memberWithoutLocation);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1fixXfbOffsets
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray qualifier, jbyteArray list){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->fixXfbOffsets(*$<TQualifier*>(env _$ qualifier), *$<TTypeList*>(env _$ list));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1fixBlockUniformOffsets
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray qualifier, jbyteArray list){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->fixBlockUniformOffsets(*$<TQualifier*>(env _$ qualifier), *$<TTypeList*>(env _$ list));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1addQualifierToExisting___3B_3B_3BLjava_lang_String_2
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jstring identifier){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->addQualifierToExisting(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), *toTString(env, identifier));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1addQualifierToExisting___3B_3B_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray qualifier, jbyteArray list){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->addQualifierToExisting(*$<TSourceLoc*>(env _$ loc), *$<TQualifier*>(env _$ qualifier), *$<TIdentifierList*>(env _$ list));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1updateStandaloneQualifierDefaults
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->updateStandaloneQualifierDefaults(*$<TSourceLoc*>(env _$ loc), *$<TPublicType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1wrapupSwitchSubsequence
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray statements, jbyteArray branchNode){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->wrapupSwitchSubsequence($<TIntermAggregate*>(env _$ statements), $<TIntermNode*>(env _$ branchNode));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1addSwitch
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray expression, jbyteArray body, jbyteArray attributes){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->addSwitch(*$<TSourceLoc*>(env _$ loc), $<TIntermTyped*>(env _$ expression), $<TIntermAggregate*>(env _$ body), *$<TAttributes*>(env _$ attributes));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1nestLooping
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->nestLooping();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1unnestLooping
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->unnestLooping();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1nestAnnotations
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->nestAnnotations();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1unnestAnnotations
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->unnestAnnotations();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1getAnnotationNestingLevel
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->getAnnotationNestingLevel();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1pushScope
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->pushScope();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1popScope
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->popScope();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1pushThisScope
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray t, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->pushThisScope(*$<TType*>(env _$ t), *$<TVector<TFunctionDeclarator>*>(env _$ v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1popThisScope
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->popThisScope();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1pushImplicitThis
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray thisParameter){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->pushImplicitThis($<TVariable*>(env _$ thisParameter));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1popImplicitThis
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->popImplicitThis();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1getImplicitThis
  (JNIEnv* env, jclass self, jbyteArray ptr, jint thisDepth){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslParseContext*>(env _$ ptr)->getImplicitThis(thisDepth);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1pushNamespace
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->pushNamespace(*toTString(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1popNamespace
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->popNamespace();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1getFullNamespaceName
  (JNIEnv* env, jclass self, jbyteArray ptr, jobjectArray s){
	JNI_METHOD_GUARD_ENTER
	TString* ret;
	$<HlslParseContext*>(env _$ ptr)->getFullNamespaceName(ret);
	(env)->SetObjectArrayElement(s, 0, toString(env, ret));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1addScopeMangler
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->addScopeMangler(*toTString(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1beginParameterParsing
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray function){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->beginParameterParsing(*$<TFunction*>(env _$ function));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1pushSwitchSequence
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray sequence){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->pushSwitchSequence($<TIntermSequence*>(env _$ sequence));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1popSwitchSequence
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->popSwitchSequence();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1growGlobalUniformBlock
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t, jstring memberName, jbyteArray typeList){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->growGlobalUniformBlock(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t), *toTString(env, memberName), $<TTypeList*>(env _$ typeList));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleLvalue
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	TIntermTyped* nodePtr = $<TIntermTyped*>(env _$ node);
	return env $_ $<HlslParseContext*>(env _$ ptr)->handleLvalue(*$<TSourceLoc*>(env _$ loc), toChars(env, op), nodePtr);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1lValueErrorCheck
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jstring op, jbyteArray node){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->lValueErrorCheck(*$<TSourceLoc*>(env _$ loc), toChars(env, op), $<TIntermTyped*>(env _$ node));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1getLayoutFromTxType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->getLayoutFromTxType(*$<TSourceLoc*>(env _$ loc), *$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleOutputGeometry
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint geometry){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->handleOutputGeometry(*$<TSourceLoc*>(env _$ loc), $<TLayoutGeometry>(geometry));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleInputGeometry
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jint geometry){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->handleInputGeometry(*$<TSourceLoc*>(env _$ loc), $<TLayoutGeometry>(geometry));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleSelectionAttributes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray selection, jbyteArray attributes){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->handleSelectionAttributes(*$<TSourceLoc*>(env _$ loc), $<TIntermSelection*>(env _$ selection), *$<TAttributes*>(env _$ attributes));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleSwitchAttributes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray switchNode, jbyteArray attributes){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->handleSwitchAttributes(*$<TSourceLoc*>(env _$ loc), $<TIntermSwitch*>(env _$ switchNode), *$<TAttributes*>(env _$ attributes));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1handleLoopAttributes
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray loc, jbyteArray loop, jbyteArray attributes){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->handleLoopAttributes(*$<TSourceLoc*>(env _$ loc), $<TIntermLoop*>(env _$ loop), *$<TAttributes*>(env _$ attributes));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1shareStructBufferType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray t){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->shareStructBufferType(*$<TType*>(env _$ t));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1setTextureReturnType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray sampler, jbyteArray retType, jbyteArray loc){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->setTextureReturnType(*$<TSampler*>(env _$ sampler), *$<TType*>(env _$ retType), *$<TSourceLoc*>(env _$ loc));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1getTextureReturnType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray sampler, jbyteArray retType){
	JNI_METHOD_GUARD_ENTER
	$<HlslParseContext*>(env _$ ptr)->getTextureReturnType(*$<TSampler*>(env _$ sampler), *$<TType*>(env _$ retType));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslParseContext_1attributeFromName
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring nameSpace, jstring name){
	JNI_METHOD_GUARD_ENTER
	return $<HlslParseContext*>(env _$ ptr)->attributeFromName(*toTString(env, nameSpace), *toTString(env, name));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TBuiltInParseablesHlsl
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ new TBuiltInParseablesHlsl();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TBuiltInParseablesHlsl_1initialize___3BII_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint version, jint profile, jbyteArray spvVersion){
	JNI_METHOD_GUARD_ENTER
	$<TBuiltInParseablesHlsl*>(env _$ ptr)->initialize(version, $<EProfile>(profile), *$<SpvVersion*>(env _$ spvVersion));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TBuiltInParseablesHlsl_1initialize___3B_3BII_3BI
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray resources, jint version, jint profile, jbyteArray spvVersion, jint language){
	JNI_METHOD_GUARD_ENTER
	$<TBuiltInParseablesHlsl*>(env _$ ptr)->initialize(*$<TBuiltInResource*>(env _$ resources), version, $<EProfile>(profile), *$<SpvVersion*>(env _$ spvVersion), $<EShLanguage>(profile));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TBuiltInParseablesHlsl_1identifyBuiltIns___3BII_3BI_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint version, jint profile, jbyteArray spvVersion, jint language, jbyteArray table){
	JNI_METHOD_GUARD_ENTER
	$<TBuiltInParseablesHlsl*>(env _$ ptr)->identifyBuiltIns(version, $<EProfile>(profile), *$<SpvVersion*>(env _$ spvVersion), $<EShLanguage>(profile), *$<TSymbolTable*>(env _$ table));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TBuiltInParseablesHlsl_1identifyBuiltIns___3BII_3BI_3B_3B
  (JNIEnv* env, jclass self, jbyteArray ptr, jint version, jint profile, jbyteArray spvVersion, jint language, jbyteArray table, jbyteArray resources){
	JNI_METHOD_GUARD_ENTER
	$<TBuiltInParseablesHlsl*>(env _$ ptr)->identifyBuiltIns(version, $<EProfile>(profile), *$<SpvVersion*>(env _$ spvVersion), $<EShLanguage>(profile), *$<TSymbolTable*>(env _$ table), *$<TBuiltInResource*>(env _$ resources));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslToken
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<HlslToken*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslToken_1setLoc
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<HlslToken*>(env _$ ptr)->loc = *$<TSourceLoc*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslToken_1setTokenClass
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<HlslToken*>(env _$ ptr)->tokenClass = $<EHlslTokenClass>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslToken_1setString
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring v){
	JNI_METHOD_GUARD_ENTER
	$<HlslToken*>(env _$ ptr)->string = toTString(env, v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslToken_1setI
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<HlslToken*>(env _$ ptr)->i = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslToken_1setU
  (JNIEnv* env, jclass self, jbyteArray ptr, jlong v){
	JNI_METHOD_GUARD_ENTER
	$<HlslToken*>(env _$ ptr)->u = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslToken_1setB
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<HlslToken*>(env _$ ptr)->b = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslToken_1setD
  (JNIEnv* env, jclass self, jbyteArray ptr, jdouble v){
	JNI_METHOD_GUARD_ENTER
	$<HlslToken*>(env _$ ptr)->d = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslToken_1getLoc
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<HlslToken*>(env _$ ptr)->loc;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslToken_1getTokenClass
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<HlslToken*>(env _$ ptr)->tokenClass;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_HlslToken_1getString
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toString(env, $<HlslToken*>(env _$ ptr)->string);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslToken_1getI
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<HlslToken*>(env _$ ptr)->i;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_HlslToken_1getU
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<HlslToken*>(env _$ ptr)->u;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslToken_1getB
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<HlslToken*>(env _$ ptr)->b;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jdouble JNICALL Java_com_destranix_glslang_Main_HlslToken_1getD
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<HlslToken*>(env _$ ptr)->d;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslScanContext
  (JNIEnv* env, jclass self, jbyteArray parseContext, jbyteArray ppContext){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_mallocIndirect($<HlslScanContext*>(nullptr), $<TParseContextBase*>(env _$ parseContext), $<TPpContext*>(env _$ ppContext));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslScanContext_1fillInKeywordMap
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	HlslScanContext::fillInKeywordMap();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslScanContext_1deleteKeywordMap
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	HlslScanContext::deleteKeywordMap();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslScanContext_1tokenize
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray token){
	JNI_METHOD_GUARD_ENTER
	$<HlslScanContext*>(env _$ ptr)->tokenize(*$<HlslToken*>(env _$ token));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslScanContext_1mapSemantic
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring s){
	JNI_METHOD_GUARD_ENTER
	return $<HlslScanContext*>(env _$ ptr)->mapSemantic(toChars(env, s));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_HlslTokenStream
  (JNIEnv* env, jclass self, jbyteArray scanner){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_mallocIndirect($<HlslTokenStream*>(nullptr), $<HlslScanContext*>(env _$ scanner));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslTokenStream_1advanceToken
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<HlslTokenStream*>(env _$ ptr)->advanceToken();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslTokenStream_1recedeToken
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<HlslTokenStream*>(env _$ ptr)->recedeToken();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslTokenStream_1acceptTokenClass
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	return $<HlslTokenStream*>(env _$ ptr)->acceptTokenClass($<EHlslTokenClass>(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslTokenStream_1peek
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<HlslTokenStream*>(env _$ ptr)->peek();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_HlslTokenStream_1peekTokenClass
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	return $<HlslTokenStream*>(env _$ ptr)->peekTokenClass($<EHlslTokenClass>(v));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_HlslTokenStream_1mapSemantic
  (JNIEnv* env, jclass self, jbyteArray ptr, jstring upperCase){
	JNI_METHOD_GUARD_ENTER
	return $<HlslTokenStream*>(env _$ ptr)->mapSemantic(toChars(env, upperCase));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslTokenStream_1pushTokenStream
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray tokens){
	JNI_METHOD_GUARD_ENTER
	$<HlslTokenStream*>(env _$ ptr)->pushTokenStream($<TVector<HlslToken>*>(env _$ tokens));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_HlslTokenStream_1popTokenStream
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	$<HlslTokenStream*>(env _$ ptr)->popTokenStream();
	JNI_METHOD_GUARD_LEAVE
}
