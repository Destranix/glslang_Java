package com.destranix.glslang;

public enum EHlslTokenClass {
	EHTokNone(Main.E_H_TOK_NONE),
	EHTokStatic(Main.E_H_TOK_STATIC),
	EHTokConst(Main.E_H_TOK_CONST),
	EHTokSNorm(Main.E_H_TOK_SNORM),
	EHTokUnorm(Main.E_H_TOK_UNORM),
	EHTokExtern(Main.E_H_TOK_EXTERN),
	EHTokUniform(Main.E_H_TOK_UNIFORM),
	EHTokVolatile(Main.E_H_TOK_VOLATILE),
	EHTokPrecise(Main.E_H_TOK_PRECISE),
	EHTokShared(Main.E_H_TOK_SHARED),
	EHTokGroupShared(Main.E_H_TOK_GROUP_SHARED),
	EHTokLinear(Main.E_H_TOK_LINEAR),
	EHTokCentroid(Main.E_H_TOK_CENTROID),
	EHTokNointerpolation(Main.E_H_TOK_NOINTERPOLATION),
	EHTokNoperspective(Main.E_H_TOK_NOPERSPECTIVE),
	EHTokSample(Main.E_H_TOK_SAMPLE),
	EHTokRowMajor(Main.E_H_TOK_ROW_MAJOR),
	EHTokColumnMajor(Main.E_H_TOK_COLUMN_MAJOR),
	EHTokPackOffset(Main.E_H_TOK_PACK_OFFSET),
	EHTokIn(Main.E_H_TOK_IN),
	EHTokOut(Main.E_H_TOK_OUT),
	EHTokInOut(Main.E_H_TOK_IN_OUT),
	EHTokLayout(Main.E_H_TOK_LAYOUT),
	EHTokGloballyCoherent(Main.E_H_TOK_GLOBALLY_COHERENT),
	EHTokInline(Main.E_H_TOK_INLINE),
	EHTokPoint(Main.E_H_TOK_POINT),
	EHTokLine(Main.E_H_TOK_LINE),
	EHTokTriangle(Main.E_H_TOK_TRIANGLE),
	EHTokLineAdj(Main.E_H_TOK_LINEADJ),
	EHTokTriangleAdj(Main.E_H_TOK_TRIANGLE_ADJ),
	EHTokPointStream(Main.E_H_TOK_POINT_STREAM),
	EHTokLineStream(Main.E_H_TOK_LINE_STREAM),
	EHTokTriangleStream(Main.E_H_TOK_TRIANGLE_STREAM),
	EHTokInputPatch(Main.E_H_TOK_INPUT_PATCH),
	EHTokOutputPatch(Main.E_H_TOK_OUTPUT_PATCH),
	EHTokBuffer(Main.E_H_TOK_BUFFER),
	EHTokVector(Main.E_H_TOK_VECTOR),
	EHTokMatrix(Main.E_H_TOK_MATRIX),
	EHTokVoid(Main.E_H_TOK_VOID),
	EHTokString(Main.E_H_TOK_STRING),
	EHTokBool(Main.E_H_TOK_BOOL),
	EHTokInt(Main.E_H_TOK_INT),
	EHTokUint(Main.E_H_TOK_UINT),
	EHTokUint64(Main.E_H_TOK_UINT64),
	EHTokDword(Main.E_H_TOK_DWORD),
	EHTokHalf(Main.E_H_TOK_HALF),
	EHTokFloat(Main.E_H_TOK_FLOAT),
	EHTokDouble(Main.E_H_TOK_DOUBLE),
	EHTokMin16float(Main.E_H_TOK_MIN16FLOAT),
	EHTokMin10float(Main.E_H_TOK_MIN10FLOAT),
	EHTokMin16int(Main.E_H_TOK_MIN16INT),
	EHTokMin12int(Main.E_H_TOK_MIN12INT),
	EHTokMin16uint(Main.E_H_TOK_MIN16UINT),
	EHTokBool1(Main.E_H_TOK_BOOL1),
	EHTokBool2(Main.E_H_TOK_BOOL2),
	EHTokBool3(Main.E_H_TOK_BOOL3),
	EHTokBool4(Main.E_H_TOK_BOOL4),
	EHTokFloat1(Main.E_H_TOK_FLOAT1),
	EHTokFloat2(Main.E_H_TOK_FLOAT2),
	EHTokFloat3(Main.E_H_TOK_FLOAT3),
	EHTokFloat4(Main.E_H_TOK_FLOAT4),
	EHTokInt1(Main.E_H_TOK_INT1),
	EHTokInt2(Main.E_H_TOK_INT2),
	EHTokInt3(Main.E_H_TOK_INT3),
	EHTokInt4(Main.E_H_TOK_INT4),
	EHTokDouble1(Main.E_H_TOK_DOUBLE1),
	EHTokDouble2(Main.E_H_TOK_DOUBLE2),
	EHTokDouble3(Main.E_H_TOK_DOUBLE3),
	EHTokDouble4(Main.E_H_TOK_DOUBLE4),
	EHTokUint1(Main.E_H_TOK_UINT1),
	EHTokUint2(Main.E_H_TOK_UINT2),
	EHTokUint3(Main.E_H_TOK_UINT3),
	EHTokUint4(Main.E_H_TOK_UINT4),
	EHTokHalf1(Main.E_H_TOK_HALF1),
	EHTokHalf2(Main.E_H_TOK_HALF2),
	EHTokHalf3(Main.E_H_TOK_HALF3),
	EHTokHalf4(Main.E_H_TOK_HALF4),
	EHTokMin16float1(Main.E_H_TOK_MIN16FLOAT1),
	EHTokMin16float2(Main.E_H_TOK_MIN16FLOAT2),
	EHTokMin16float3(Main.E_H_TOK_MIN16FLOAT3),
	EHTokMin16float4(Main.E_H_TOK_MIN16FLOAT4),
	EHTokMin10float1(Main.E_H_TOK_MIN10FLOAT1),
	EHTokMin10float2(Main.E_H_TOK_MIN10FLOAT2),
	EHTokMin10float3(Main.E_H_TOK_MIN10FLOAT3),
	EHTokMin10float4(Main.E_H_TOK_MIN10FLOAT4),
	EHTokMin16int1(Main.E_H_TOK_MIN16INT1),
	EHTokMin16int2(Main.E_H_TOK_MIN16INT2),
	EHTokMin16int3(Main.E_H_TOK_MIN16INT3),
	EHTokMin16int4(Main.E_H_TOK_MIN16INT4),
	EHTokMin12int1(Main.E_H_TOK_MIN12INT1),
	EHTokMin12int2(Main.E_H_TOK_MIN12INT2),
	EHTokMin12int3(Main.E_H_TOK_MIN12INT3),
	EHTokMin12int4(Main.E_H_TOK_MIN12INT4),
	EHTokMin16uint1(Main.E_H_TOK_MIN16UINT1),
	EHTokMin16uint2(Main.E_H_TOK_MIN16UINT2),
	EHTokMin16uint3(Main.E_H_TOK_MIN16UINT3),
	EHTokMin16uint4(Main.E_H_TOK_MIN16UINT4),
	EHTokInt1x1(Main.E_H_TOK_INT1X1),
	EHTokInt1x2(Main.E_H_TOK_INT1X2),
	EHTokInt1x3(Main.E_H_TOK_INT1X3),
	EHTokInt1x4(Main.E_H_TOK_INT1X4),
	EHTokInt2x1(Main.E_H_TOK_INT2X1),
	EHTokInt2x2(Main.E_H_TOK_INT2X2),
	EHTokInt2x3(Main.E_H_TOK_INT2X3),
	EHTokInt2x4(Main.E_H_TOK_INT2X4),
	EHTokInt3x1(Main.E_H_TOK_INT3X1),
	EHTokInt3x2(Main.E_H_TOK_INT3X2),
	EHTokInt3x3(Main.E_H_TOK_INT3X3),
	EHTokInt3x4(Main.E_H_TOK_INT3X4),
	EHTokInt4x1(Main.E_H_TOK_INT4X1),
	EHTokInt4x2(Main.E_H_TOK_INT4X2),
	EHTokInt4x3(Main.E_H_TOK_INT4X3),
	EHTokInt4x4(Main.E_H_TOK_INT4X4),
	EHTokUint1x1(Main.E_H_TOK_UINT1X1),
	EHTokUint1x2(Main.E_H_TOK_UINT1X2),
	EHTokUint1x3(Main.E_H_TOK_UINT1X3),
	EHTokUint1x4(Main.E_H_TOK_UINT1X4),
	EHTokUint2x1(Main.E_H_TOK_UINT2X1),
	EHTokUint2x2(Main.E_H_TOK_UINT2X2),
	EHTokUint2x3(Main.E_H_TOK_UINT2X3),
	EHTokUint2x4(Main.E_H_TOK_UINT2X4),
	EHTokUint3x1(Main.E_H_TOK_UINT3X1),
	EHTokUint3x2(Main.E_H_TOK_UINT3X2),
	EHTokUint3x3(Main.E_H_TOK_UINT3X3),
	EHTokUint3x4(Main.E_H_TOK_UINT3X4),
	EHTokUint4x1(Main.E_H_TOK_UINT4X1),
	EHTokUint4x2(Main.E_H_TOK_UINT4X2),
	EHTokUint4x3(Main.E_H_TOK_UINT4X3),
	EHTokUint4x4(Main.E_H_TOK_UINT4X4),
	EHTokBool1x1(Main.E_H_TOK_BOOL1X1),
	EHTokBool1x2(Main.E_H_TOK_BOOL1X2),
	EHTokBool1x3(Main.E_H_TOK_BOOL1X3),
	EHTokBool1x4(Main.E_H_TOK_BOOL1X4),
	EHTokBool2x1(Main.E_H_TOK_BOOL2X1),
	EHTokBool2x2(Main.E_H_TOK_BOOL2X2),
	EHTokBool2x3(Main.E_H_TOK_BOOL2X3),
	EHTokBool2x4(Main.E_H_TOK_BOOL2X4),
	EHTokBool3x1(Main.E_H_TOK_BOOL3X1),
	EHTokBool3x2(Main.E_H_TOK_BOOL3X2),
	EHTokBool3x3(Main.E_H_TOK_BOOL3X3),
	EHTokBool3x4(Main.E_H_TOK_BOOL3X4),
	EHTokBool4x1(Main.E_H_TOK_BOOL4X1),
	EHTokBool4x2(Main.E_H_TOK_BOOL4X2),
	EHTokBool4x3(Main.E_H_TOK_BOOL4X3),
	EHTokBool4x4(Main.E_H_TOK_BOOL4X4),
	EHTokFloat1x1(Main.E_H_TOK_FLOAT1X1),
	EHTokFloat1x2(Main.E_H_TOK_FLOAT1X2),
	EHTokFloat1x3(Main.E_H_TOK_FLOAT1X3),
	EHTokFloat1x4(Main.E_H_TOK_FLOAT1X4),
	EHTokFloat2x1(Main.E_H_TOK_FLOAT2X1),
	EHTokFloat2x2(Main.E_H_TOK_FLOAT2X2),
	EHTokFloat2x3(Main.E_H_TOK_FLOAT2X3),
	EHTokFloat2x4(Main.E_H_TOK_FLOAT2X4),
	EHTokFloat3x1(Main.E_H_TOK_FLOAT3X1),
	EHTokFloat3x2(Main.E_H_TOK_FLOAT3X2),
	EHTokFloat3x3(Main.E_H_TOK_FLOAT3X3),
	EHTokFloat3x4(Main.E_H_TOK_FLOAT3X4),
	EHTokFloat4x1(Main.E_H_TOK_FLOAT4X1),
	EHTokFloat4x2(Main.E_H_TOK_FLOAT4X2),
	EHTokFloat4x3(Main.E_H_TOK_FLOAT4X3),
	EHTokFloat4x4(Main.E_H_TOK_FLOAT4X4),
	EHTokHalf1x1(Main.E_H_TOK_HALF1X1),
	EHTokHalf1x2(Main.E_H_TOK_HALF1X2),
	EHTokHalf1x3(Main.E_H_TOK_HALF1X3),
	EHTokHalf1x4(Main.E_H_TOK_HALF1X4),
	EHTokHalf2x1(Main.E_H_TOK_HALF2X1),
	EHTokHalf2x2(Main.E_H_TOK_HALF2X2),
	EHTokHalf2x3(Main.E_H_TOK_HALF2X3),
	EHTokHalf2x4(Main.E_H_TOK_HALF2X4),
	EHTokHalf3x1(Main.E_H_TOK_HALF3X1),
	EHTokHalf3x2(Main.E_H_TOK_HALF3X2),
	EHTokHalf3x3(Main.E_H_TOK_HALF3X3),
	EHTokHalf3x4(Main.E_H_TOK_HALF3X4),
	EHTokHalf4x1(Main.E_H_TOK_HALF4X1),
	EHTokHalf4x2(Main.E_H_TOK_HALF4X2),
	EHTokHalf4x3(Main.E_H_TOK_HALF4X3),
	EHTokHalf4x4(Main.E_H_TOK_HALF4X4),
	EHTokDouble1x1(Main.E_H_TOK_DOUBLE1X1),
	EHTokDouble1x2(Main.E_H_TOK_DOUBLE1X2),
	EHTokDouble1x3(Main.E_H_TOK_DOUBLE1X3),
	EHTokDouble1x4(Main.E_H_TOK_DOUBLE1X4),
	EHTokDouble2x1(Main.E_H_TOK_DOUBLE2X1),
	EHTokDouble2x2(Main.E_H_TOK_DOUBLE2X2),
	EHTokDouble2x3(Main.E_H_TOK_DOUBLE2X3),
	EHTokDouble2x4(Main.E_H_TOK_DOUBLE2X4),
	EHTokDouble3x1(Main.E_H_TOK_DOUBLE3X1),
	EHTokDouble3x2(Main.E_H_TOK_DOUBLE3X2),
	EHTokDouble3x3(Main.E_H_TOK_DOUBLE3X3),
	EHTokDouble3x4(Main.E_H_TOK_DOUBLE3X4),
	EHTokDouble4x1(Main.E_H_TOK_DOUBLE4X1),
	EHTokDouble4x2(Main.E_H_TOK_DOUBLE4X2),
	EHTokDouble4x3(Main.E_H_TOK_DOUBLE4X3),
	EHTokDouble4x4(Main.E_H_TOK_DOUBLE4X4),
	EHTokSampler(Main.E_H_TOK_SAMPLER),
	EHTokSampler1d(Main.E_H_TOK_SAMPLER1D),
	EHTokSampler2d(Main.E_H_TOK_SAMPLER2D),
	EHTokSampler3d(Main.E_H_TOK_SAMPLER3D),
	EHTokSamplerCube(Main.E_H_TOK_SAMPLER_CUBE),
	EHTokSamplerState(Main.E_H_TOK_SAMPLER_STATE),
	EHTokSamplerComparisonState(Main.E_H_TOK_SAMPLER_COMPARISON_STATE),
	EHTokTexture(Main.E_H_TOK_TEXTURE),
	EHTokTexture1d(Main.E_H_TOK_TEXTURE1D),
	EHTokTexture1darray(Main.E_H_TOK_TEXTURE1DARRAY),
	EHTokTexture2d(Main.E_H_TOK_TEXTURE2D),
	EHTokTexture2darray(Main.E_H_TOK_TEXTURE2DARRAY),
	EHTokTexture3d(Main.E_H_TOK_TEXTURE3D),
	EHTokTextureCube(Main.E_H_TOK_TEXTURE_CUBE),
	EHTokTextureCubearray(Main.E_H_TOK_TEXTURE_CUBEARRAY),
	EHTokTexture2DMS(Main.E_H_TOK_TEXTURE2D_MS),
	EHTokTexture2DMSarray(Main.E_H_TOK_TEXTURE2D_MSARRAY),
	EHTokRWTexture1d(Main.E_H_TOK_RW_TEXTURE1D),
	EHTokRWTexture1darray(Main.E_H_TOK_RW_TEXTURE1DARRAY),
	EHTokRWTexture2d(Main.E_H_TOK_RW_TEXTURE2D),
	EHTokRWTexture2darray(Main.E_H_TOK_RW_TEXTURE2DARRAY),
	EHTokRWTexture3d(Main.E_H_TOK_RW_TEXTURE3D),
	EHTokRWBuffer(Main.E_H_TOK_RW_BUFFER),
	EHTokSubpassInput(Main.E_H_TOK_SUBPASS_INPUT),
	EHTokSubpassInputMS(Main.E_H_TOK_SUBPASS_INPUT_MS),
	EHTokAppendStructuredBuffer(Main.E_H_TOK_APPEND_STRUCTURED_BUFFER),
	EHTokByteAddressBuffer(Main.E_H_TOK_BYTE_ADDRESS_BUFFER),
	EHTokConsumeStructuredBuffer(Main.E_H_TOK_CONSUME_STRUCTURED_BUFFER),
	EHTokRWByteAddressBuffer(Main.E_H_TOK_RW_BYTE_ADDRESS_BUFFER),
	EHTokRWStructuredBuffer(Main.E_H_TOK_RW_STRUCTURED_BUFFER),
	EHTokStructuredBuffer(Main.E_H_TOK_STRUCTURED_BUFFER),
	EHTokTextureBuffer(Main.E_H_TOK_TEXTURE_BUFFER),
	EHTokIdentifier(Main.E_H_TOK_IDENTIFIER),
	EHTokClass(Main.E_H_TOK_CLASS),
	EHTokStruct(Main.E_H_TOK_STRUCT),
	EHTokCBuffer(Main.E_H_TOK_CBUFFER),
	EHTokTBuffer(Main.E_H_TOK_TBUFFER),
	EHTokTypedef(Main.E_H_TOK_TYPEDEF),
	EHTokThis(Main.E_H_TOK_THIS),
	EHTokNamespace(Main.E_H_TOK_NAMESPACE),
	EHTokConstantBuffer(Main.E_H_TOK_CONSTANT_BUFFER),
	EHTokFloat16Constant(Main.E_H_TOK_FLOAT16_CONSTANT),
	EHTokFloatConstant(Main.E_H_TOK_FLOAT_CONSTANT),
	EHTokDoubleConstant(Main.E_H_TOK_DOUBLE_CONSTANT),
	EHTokIntConstant(Main.E_H_TOK_INT_CONSTANT),
	EHTokUintConstant(Main.E_H_TOK_UINT_CONSTANT),
	EHTokBoolConstant(Main.E_H_TOK_BOOL_CONSTANT),
	EHTokStringConstant(Main.E_H_TOK_STRING_CONSTANT),
	EHTokFor(Main.E_H_TOK_FOR),
	EHTokDo(Main.E_H_TOK_DO),
	EHTokWhile(Main.E_H_TOK_WHILE),
	EHTokBreak(Main.E_H_TOK_BREAK),
	EHTokContinue(Main.E_H_TOK_CONTINUE),
	EHTokIf(Main.E_H_TOK_IF),
	EHTokElse(Main.E_H_TOK_ELSE),
	EHTokDiscard(Main.E_H_TOK_DISCARD),
	EHTokReturn(Main.E_H_TOK_RETURN),
	EHTokSwitch(Main.E_H_TOK_SWITCH),
	EHTokCase(Main.E_H_TOK_CASE),
	EHTokDefault(Main.E_H_TOK_DEFAULT),
	EHTokLeftOp(Main.E_H_TOK_LEFT_OP),
	EHTokRightOp(Main.E_H_TOK_RIGHT_OP),
	EHTokIncOp(Main.E_H_TOK_INC_OP),
	EHTokDecOp(Main.E_H_TOK_DEC_OP),
	EHTokLeOp(Main.E_H_TOK_LE_OP),
	EHTokGeOp(Main.E_H_TOK_GE_OP),
	EHTokEqOp(Main.E_H_TOK_EQ_OP),
	EHTokNeOp(Main.E_H_TOK_NE_OP),
	EHTokAndOp(Main.E_H_TOK_AND_OP),
	EHTokOrOp(Main.E_H_TOK_OR_OP),
	EHTokXorOp(Main.E_H_TOK_XOR_OP),
	EHTokAssign(Main.E_H_TOK_ASSIGN),
	EHTokMulAssign(Main.E_H_TOK_MUL_ASSIGN),
	EHTokDivAssign(Main.E_H_TOK_DIV_ASSIGN),
	EHTokAddAssign(Main.E_H_TOK_ADD_ASSIGN),
	EHTokModAssign(Main.E_H_TOK_MOD_ASSIGN),
	EHTokLeftAssign(Main.E_H_TOK_LEFT_ASSIGN),
	EHTokRightAssign(Main.E_H_TOK_RIGHT_ASSIGN),
	EHTokAndAssign(Main.E_H_TOK_AND_ASSIGN),
	EHTokXorAssign(Main.E_H_TOK_XOR_ASSIGN),
	EHTokOrAssign(Main.E_H_TOK_OR_ASSIGN),
	EHTokSubAssign(Main.E_H_TOK_SUB_ASSIGN),
	EHTokLeftParen(Main.E_H_TOK_LEFT_PAREN),
	EHTokRightParen(Main.E_H_TOK_RIGHT_PAREN),
	EHTokLeftBracket(Main.E_H_TOK_LEFT_BRACKET),
	EHTokRightBracket(Main.E_H_TOK_RIGHT_BRACKET),
	EHTokLeftBrace(Main.E_H_TOK_LEFT_BRACE),
	EHTokRightBrace(Main.E_H_TOK_RIGHT_BRACE),
	EHTokDot(Main.E_H_TOK_DOT),
	EHTokComma(Main.E_H_TOK_COMMA),
	EHTokColon(Main.E_H_TOK_COLON),
	EHTokColonColon(Main.E_H_TOK_COLON_COLON),
	EHTokSemicolon(Main.E_H_TOK_SEMICOLON),
	EHTokBang(Main.E_H_TOK_BANG),
	EHTokDash(Main.E_H_TOK_DASH),
	EHTokTilde(Main.E_H_TOK_TILDE),
	EHTokPlus(Main.E_H_TOK_PLUS),
	EHTokStar(Main.E_H_TOK_STAR),
	EHTokSlash(Main.E_H_TOK_SLASH),
	EHTokPercent(Main.E_H_TOK_PERCENT),
	EHTokLeftAngle(Main.E_H_TOK_LEFT_ANGLE),
	EHTokRightAngle(Main.E_H_TOK_RIGHT_ANGLE),
	EHTokVerticalBar(Main.E_H_TOK_VERTICAL_BAR),
	EHTokCaret(Main.E_H_TOK_CARET),
	EHTokAmpersand(Main.E_H_TOK_AMPERSAND),
	EHTokQuestion(Main.E_H_TOK_QUESTION);

	private final int value;

	private EHlslTokenClass(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static EHlslTokenClass valueByStr(String str) {
		switch (str) {
			case "EHTokNone":
				return EHTokNone;
			case "EHTokStatic":
				return EHTokStatic;
			case "EHTokConst":
				return EHTokConst;
			case "EHTokSNorm":
				return EHTokSNorm;
			case "EHTokUnorm":
				return EHTokUnorm;
			case "EHTokExtern":
				return EHTokExtern;
			case "EHTokUniform":
				return EHTokUniform;
			case "EHTokVolatile":
				return EHTokVolatile;
			case "EHTokPrecise":
				return EHTokPrecise;
			case "EHTokShared":
				return EHTokShared;
			case "EHTokGroupShared":
				return EHTokGroupShared;
			case "EHTokLinear":
				return EHTokLinear;
			case "EHTokCentroid":
				return EHTokCentroid;
			case "EHTokNointerpolation":
				return EHTokNointerpolation;
			case "EHTokNoperspective":
				return EHTokNoperspective;
			case "EHTokSample":
				return EHTokSample;
			case "EHTokRowMajor":
				return EHTokRowMajor;
			case "EHTokColumnMajor":
				return EHTokColumnMajor;
			case "EHTokPackOffset":
				return EHTokPackOffset;
			case "EHTokIn":
				return EHTokIn;
			case "EHTokOut":
				return EHTokOut;
			case "EHTokInOut":
				return EHTokInOut;
			case "EHTokLayout":
				return EHTokLayout;
			case "EHTokGloballyCoherent":
				return EHTokGloballyCoherent;
			case "EHTokInline":
				return EHTokInline;
			case "EHTokPoint":
				return EHTokPoint;
			case "EHTokLine":
				return EHTokLine;
			case "EHTokTriangle":
				return EHTokTriangle;
			case "EHTokLineAdj":
				return EHTokLineAdj;
			case "EHTokTriangleAdj":
				return EHTokTriangleAdj;
			case "EHTokPointStream":
				return EHTokPointStream;
			case "EHTokLineStream":
				return EHTokLineStream;
			case "EHTokTriangleStream":
				return EHTokTriangleStream;
			case "EHTokInputPatch":
				return EHTokInputPatch;
			case "EHTokOutputPatch":
				return EHTokOutputPatch;
			case "EHTokBuffer":
				return EHTokBuffer;
			case "EHTokVector":
				return EHTokVector;
			case "EHTokMatrix":
				return EHTokMatrix;
			case "EHTokVoid":
				return EHTokVoid;
			case "EHTokString":
				return EHTokString;
			case "EHTokBool":
				return EHTokBool;
			case "EHTokInt":
				return EHTokInt;
			case "EHTokUint":
				return EHTokUint;
			case "EHTokUint64":
				return EHTokUint64;
			case "EHTokDword":
				return EHTokDword;
			case "EHTokHalf":
				return EHTokHalf;
			case "EHTokFloat":
				return EHTokFloat;
			case "EHTokDouble":
				return EHTokDouble;
			case "EHTokMin16float":
				return EHTokMin16float;
			case "EHTokMin10float":
				return EHTokMin10float;
			case "EHTokMin16int":
				return EHTokMin16int;
			case "EHTokMin12int":
				return EHTokMin12int;
			case "EHTokMin16uint":
				return EHTokMin16uint;
			case "EHTokBool1":
				return EHTokBool1;
			case "EHTokBool2":
				return EHTokBool2;
			case "EHTokBool3":
				return EHTokBool3;
			case "EHTokBool4":
				return EHTokBool4;
			case "EHTokFloat1":
				return EHTokFloat1;
			case "EHTokFloat2":
				return EHTokFloat2;
			case "EHTokFloat3":
				return EHTokFloat3;
			case "EHTokFloat4":
				return EHTokFloat4;
			case "EHTokInt1":
				return EHTokInt1;
			case "EHTokInt2":
				return EHTokInt2;
			case "EHTokInt3":
				return EHTokInt3;
			case "EHTokInt4":
				return EHTokInt4;
			case "EHTokDouble1":
				return EHTokDouble1;
			case "EHTokDouble2":
				return EHTokDouble2;
			case "EHTokDouble3":
				return EHTokDouble3;
			case "EHTokDouble4":
				return EHTokDouble4;
			case "EHTokUint1":
				return EHTokUint1;
			case "EHTokUint2":
				return EHTokUint2;
			case "EHTokUint3":
				return EHTokUint3;
			case "EHTokUint4":
				return EHTokUint4;
			case "EHTokHalf1":
				return EHTokHalf1;
			case "EHTokHalf2":
				return EHTokHalf2;
			case "EHTokHalf3":
				return EHTokHalf3;
			case "EHTokHalf4":
				return EHTokHalf4;
			case "EHTokMin16float1":
				return EHTokMin16float1;
			case "EHTokMin16float2":
				return EHTokMin16float2;
			case "EHTokMin16float3":
				return EHTokMin16float3;
			case "EHTokMin16float4":
				return EHTokMin16float4;
			case "EHTokMin10float1":
				return EHTokMin10float1;
			case "EHTokMin10float2":
				return EHTokMin10float2;
			case "EHTokMin10float3":
				return EHTokMin10float3;
			case "EHTokMin10float4":
				return EHTokMin10float4;
			case "EHTokMin16int1":
				return EHTokMin16int1;
			case "EHTokMin16int2":
				return EHTokMin16int2;
			case "EHTokMin16int3":
				return EHTokMin16int3;
			case "EHTokMin16int4":
				return EHTokMin16int4;
			case "EHTokMin12int1":
				return EHTokMin12int1;
			case "EHTokMin12int2":
				return EHTokMin12int2;
			case "EHTokMin12int3":
				return EHTokMin12int3;
			case "EHTokMin12int4":
				return EHTokMin12int4;
			case "EHTokMin16uint1":
				return EHTokMin16uint1;
			case "EHTokMin16uint2":
				return EHTokMin16uint2;
			case "EHTokMin16uint3":
				return EHTokMin16uint3;
			case "EHTokMin16uint4":
				return EHTokMin16uint4;
			case "EHTokInt1x1":
				return EHTokInt1x1;
			case "EHTokInt1x2":
				return EHTokInt1x2;
			case "EHTokInt1x3":
				return EHTokInt1x3;
			case "EHTokInt1x4":
				return EHTokInt1x4;
			case "EHTokInt2x1":
				return EHTokInt2x1;
			case "EHTokInt2x2":
				return EHTokInt2x2;
			case "EHTokInt2x3":
				return EHTokInt2x3;
			case "EHTokInt2x4":
				return EHTokInt2x4;
			case "EHTokInt3x1":
				return EHTokInt3x1;
			case "EHTokInt3x2":
				return EHTokInt3x2;
			case "EHTokInt3x3":
				return EHTokInt3x3;
			case "EHTokInt3x4":
				return EHTokInt3x4;
			case "EHTokInt4x1":
				return EHTokInt4x1;
			case "EHTokInt4x2":
				return EHTokInt4x2;
			case "EHTokInt4x3":
				return EHTokInt4x3;
			case "EHTokInt4x4":
				return EHTokInt4x4;
			case "EHTokUint1x1":
				return EHTokUint1x1;
			case "EHTokUint1x2":
				return EHTokUint1x2;
			case "EHTokUint1x3":
				return EHTokUint1x3;
			case "EHTokUint1x4":
				return EHTokUint1x4;
			case "EHTokUint2x1":
				return EHTokUint2x1;
			case "EHTokUint2x2":
				return EHTokUint2x2;
			case "EHTokUint2x3":
				return EHTokUint2x3;
			case "EHTokUint2x4":
				return EHTokUint2x4;
			case "EHTokUint3x1":
				return EHTokUint3x1;
			case "EHTokUint3x2":
				return EHTokUint3x2;
			case "EHTokUint3x3":
				return EHTokUint3x3;
			case "EHTokUint3x4":
				return EHTokUint3x4;
			case "EHTokUint4x1":
				return EHTokUint4x1;
			case "EHTokUint4x2":
				return EHTokUint4x2;
			case "EHTokUint4x3":
				return EHTokUint4x3;
			case "EHTokUint4x4":
				return EHTokUint4x4;
			case "EHTokBool1x1":
				return EHTokBool1x1;
			case "EHTokBool1x2":
				return EHTokBool1x2;
			case "EHTokBool1x3":
				return EHTokBool1x3;
			case "EHTokBool1x4":
				return EHTokBool1x4;
			case "EHTokBool2x1":
				return EHTokBool2x1;
			case "EHTokBool2x2":
				return EHTokBool2x2;
			case "EHTokBool2x3":
				return EHTokBool2x3;
			case "EHTokBool2x4":
				return EHTokBool2x4;
			case "EHTokBool3x1":
				return EHTokBool3x1;
			case "EHTokBool3x2":
				return EHTokBool3x2;
			case "EHTokBool3x3":
				return EHTokBool3x3;
			case "EHTokBool3x4":
				return EHTokBool3x4;
			case "EHTokBool4x1":
				return EHTokBool4x1;
			case "EHTokBool4x2":
				return EHTokBool4x2;
			case "EHTokBool4x3":
				return EHTokBool4x3;
			case "EHTokBool4x4":
				return EHTokBool4x4;
			case "EHTokFloat1x1":
				return EHTokFloat1x1;
			case "EHTokFloat1x2":
				return EHTokFloat1x2;
			case "EHTokFloat1x3":
				return EHTokFloat1x3;
			case "EHTokFloat1x4":
				return EHTokFloat1x4;
			case "EHTokFloat2x1":
				return EHTokFloat2x1;
			case "EHTokFloat2x2":
				return EHTokFloat2x2;
			case "EHTokFloat2x3":
				return EHTokFloat2x3;
			case "EHTokFloat2x4":
				return EHTokFloat2x4;
			case "EHTokFloat3x1":
				return EHTokFloat3x1;
			case "EHTokFloat3x2":
				return EHTokFloat3x2;
			case "EHTokFloat3x3":
				return EHTokFloat3x3;
			case "EHTokFloat3x4":
				return EHTokFloat3x4;
			case "EHTokFloat4x1":
				return EHTokFloat4x1;
			case "EHTokFloat4x2":
				return EHTokFloat4x2;
			case "EHTokFloat4x3":
				return EHTokFloat4x3;
			case "EHTokFloat4x4":
				return EHTokFloat4x4;
			case "EHTokHalf1x1":
				return EHTokHalf1x1;
			case "EHTokHalf1x2":
				return EHTokHalf1x2;
			case "EHTokHalf1x3":
				return EHTokHalf1x3;
			case "EHTokHalf1x4":
				return EHTokHalf1x4;
			case "EHTokHalf2x1":
				return EHTokHalf2x1;
			case "EHTokHalf2x2":
				return EHTokHalf2x2;
			case "EHTokHalf2x3":
				return EHTokHalf2x3;
			case "EHTokHalf2x4":
				return EHTokHalf2x4;
			case "EHTokHalf3x1":
				return EHTokHalf3x1;
			case "EHTokHalf3x2":
				return EHTokHalf3x2;
			case "EHTokHalf3x3":
				return EHTokHalf3x3;
			case "EHTokHalf3x4":
				return EHTokHalf3x4;
			case "EHTokHalf4x1":
				return EHTokHalf4x1;
			case "EHTokHalf4x2":
				return EHTokHalf4x2;
			case "EHTokHalf4x3":
				return EHTokHalf4x3;
			case "EHTokHalf4x4":
				return EHTokHalf4x4;
			case "EHTokDouble1x1":
				return EHTokDouble1x1;
			case "EHTokDouble1x2":
				return EHTokDouble1x2;
			case "EHTokDouble1x3":
				return EHTokDouble1x3;
			case "EHTokDouble1x4":
				return EHTokDouble1x4;
			case "EHTokDouble2x1":
				return EHTokDouble2x1;
			case "EHTokDouble2x2":
				return EHTokDouble2x2;
			case "EHTokDouble2x3":
				return EHTokDouble2x3;
			case "EHTokDouble2x4":
				return EHTokDouble2x4;
			case "EHTokDouble3x1":
				return EHTokDouble3x1;
			case "EHTokDouble3x2":
				return EHTokDouble3x2;
			case "EHTokDouble3x3":
				return EHTokDouble3x3;
			case "EHTokDouble3x4":
				return EHTokDouble3x4;
			case "EHTokDouble4x1":
				return EHTokDouble4x1;
			case "EHTokDouble4x2":
				return EHTokDouble4x2;
			case "EHTokDouble4x3":
				return EHTokDouble4x3;
			case "EHTokDouble4x4":
				return EHTokDouble4x4;
			case "EHTokSampler":
				return EHTokSampler;
			case "EHTokSampler1d":
				return EHTokSampler1d;
			case "EHTokSampler2d":
				return EHTokSampler2d;
			case "EHTokSampler3d":
				return EHTokSampler3d;
			case "EHTokSamplerCube":
				return EHTokSamplerCube;
			case "EHTokSamplerState":
				return EHTokSamplerState;
			case "EHTokSamplerComparisonState":
				return EHTokSamplerComparisonState;
			case "EHTokTexture":
				return EHTokTexture;
			case "EHTokTexture1d":
				return EHTokTexture1d;
			case "EHTokTexture1darray":
				return EHTokTexture1darray;
			case "EHTokTexture2d":
				return EHTokTexture2d;
			case "EHTokTexture2darray":
				return EHTokTexture2darray;
			case "EHTokTexture3d":
				return EHTokTexture3d;
			case "EHTokTextureCube":
				return EHTokTextureCube;
			case "EHTokTextureCubearray":
				return EHTokTextureCubearray;
			case "EHTokTexture2DMS":
				return EHTokTexture2DMS;
			case "EHTokTexture2DMSarray":
				return EHTokTexture2DMSarray;
			case "EHTokRWTexture1d":
				return EHTokRWTexture1d;
			case "EHTokRWTexture1darray":
				return EHTokRWTexture1darray;
			case "EHTokRWTexture2d":
				return EHTokRWTexture2d;
			case "EHTokRWTexture2darray":
				return EHTokRWTexture2darray;
			case "EHTokRWTexture3d":
				return EHTokRWTexture3d;
			case "EHTokRWBuffer":
				return EHTokRWBuffer;
			case "EHTokSubpassInput":
				return EHTokSubpassInput;
			case "EHTokSubpassInputMS":
				return EHTokSubpassInputMS;
			case "EHTokAppendStructuredBuffer":
				return EHTokAppendStructuredBuffer;
			case "EHTokByteAddressBuffer":
				return EHTokByteAddressBuffer;
			case "EHTokConsumeStructuredBuffer":
				return EHTokConsumeStructuredBuffer;
			case "EHTokRWByteAddressBuffer":
				return EHTokRWByteAddressBuffer;
			case "EHTokRWStructuredBuffer":
				return EHTokRWStructuredBuffer;
			case "EHTokStructuredBuffer":
				return EHTokStructuredBuffer;
			case "EHTokTextureBuffer":
				return EHTokTextureBuffer;
			case "EHTokIdentifier":
				return EHTokIdentifier;
			case "EHTokClass":
				return EHTokClass;
			case "EHTokStruct":
				return EHTokStruct;
			case "EHTokCBuffer":
				return EHTokCBuffer;
			case "EHTokTBuffer":
				return EHTokTBuffer;
			case "EHTokTypedef":
				return EHTokTypedef;
			case "EHTokThis":
				return EHTokThis;
			case "EHTokNamespace":
				return EHTokNamespace;
			case "EHTokConstantBuffer":
				return EHTokConstantBuffer;
			case "EHTokFloat16Constant":
				return EHTokFloat16Constant;
			case "EHTokFloatConstant":
				return EHTokFloatConstant;
			case "EHTokDoubleConstant":
				return EHTokDoubleConstant;
			case "EHTokIntConstant":
				return EHTokIntConstant;
			case "EHTokUintConstant":
				return EHTokUintConstant;
			case "EHTokBoolConstant":
				return EHTokBoolConstant;
			case "EHTokStringConstant":
				return EHTokStringConstant;
			case "EHTokFor":
				return EHTokFor;
			case "EHTokDo":
				return EHTokDo;
			case "EHTokWhile":
				return EHTokWhile;
			case "EHTokBreak":
				return EHTokBreak;
			case "EHTokContinue":
				return EHTokContinue;
			case "EHTokIf":
				return EHTokIf;
			case "EHTokElse":
				return EHTokElse;
			case "EHTokDiscard":
				return EHTokDiscard;
			case "EHTokReturn":
				return EHTokReturn;
			case "EHTokSwitch":
				return EHTokSwitch;
			case "EHTokCase":
				return EHTokCase;
			case "EHTokDefault":
				return EHTokDefault;
			case "EHTokLeftOp":
				return EHTokLeftOp;
			case "EHTokRightOp":
				return EHTokRightOp;
			case "EHTokIncOp":
				return EHTokIncOp;
			case "EHTokDecOp":
				return EHTokDecOp;
			case "EHTokLeOp":
				return EHTokLeOp;
			case "EHTokGeOp":
				return EHTokGeOp;
			case "EHTokEqOp":
				return EHTokEqOp;
			case "EHTokNeOp":
				return EHTokNeOp;
			case "EHTokAndOp":
				return EHTokAndOp;
			case "EHTokOrOp":
				return EHTokOrOp;
			case "EHTokXorOp":
				return EHTokXorOp;
			case "EHTokAssign":
				return EHTokAssign;
			case "EHTokMulAssign":
				return EHTokMulAssign;
			case "EHTokDivAssign":
				return EHTokDivAssign;
			case "EHTokAddAssign":
				return EHTokAddAssign;
			case "EHTokModAssign":
				return EHTokModAssign;
			case "EHTokLeftAssign":
				return EHTokLeftAssign;
			case "EHTokRightAssign":
				return EHTokRightAssign;
			case "EHTokAndAssign":
				return EHTokAndAssign;
			case "EHTokXorAssign":
				return EHTokXorAssign;
			case "EHTokOrAssign":
				return EHTokOrAssign;
			case "EHTokSubAssign":
				return EHTokSubAssign;
			case "EHTokLeftParen":
				return EHTokLeftParen;
			case "EHTokRightParen":
				return EHTokRightParen;
			case "EHTokLeftBracket":
				return EHTokLeftBracket;
			case "EHTokRightBracket":
				return EHTokRightBracket;
			case "EHTokLeftBrace":
				return EHTokLeftBrace;
			case "EHTokRightBrace":
				return EHTokRightBrace;
			case "EHTokDot":
				return EHTokDot;
			case "EHTokComma":
				return EHTokComma;
			case "EHTokColon":
				return EHTokColon;
			case "EHTokColonColon":
				return EHTokColonColon;
			case "EHTokSemicolon":
				return EHTokSemicolon;
			case "EHTokBang":
				return EHTokBang;
			case "EHTokDash":
				return EHTokDash;
			case "EHTokTilde":
				return EHTokTilde;
			case "EHTokPlus":
				return EHTokPlus;
			case "EHTokStar":
				return EHTokStar;
			case "EHTokSlash":
				return EHTokSlash;
			case "EHTokPercent":
				return EHTokPercent;
			case "EHTokLeftAngle":
				return EHTokLeftAngle;
			case "EHTokRightAngle":
				return EHTokRightAngle;
			case "EHTokVerticalBar":
				return EHTokVerticalBar;
			case "EHTokCaret":
				return EHTokCaret;
			case "EHTokAmpersand":
				return EHTokAmpersand;
			case "EHTokQuestion":
				return EHTokQuestion;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static EHlslTokenClass valueByConstant(int constant) {
		switch (constant) {
			case Main.E_H_TOK_NONE:
				return EHTokNone;
			case Main.E_H_TOK_STATIC:
				return EHTokStatic;
			case Main.E_H_TOK_CONST:
				return EHTokConst;
			case Main.E_H_TOK_SNORM:
				return EHTokSNorm;
			case Main.E_H_TOK_UNORM:
				return EHTokUnorm;
			case Main.E_H_TOK_EXTERN:
				return EHTokExtern;
			case Main.E_H_TOK_UNIFORM:
				return EHTokUniform;
			case Main.E_H_TOK_VOLATILE:
				return EHTokVolatile;
			case Main.E_H_TOK_PRECISE:
				return EHTokPrecise;
			case Main.E_H_TOK_SHARED:
				return EHTokShared;
			case Main.E_H_TOK_GROUP_SHARED:
				return EHTokGroupShared;
			case Main.E_H_TOK_LINEAR:
				return EHTokLinear;
			case Main.E_H_TOK_CENTROID:
				return EHTokCentroid;
			case Main.E_H_TOK_NOINTERPOLATION:
				return EHTokNointerpolation;
			case Main.E_H_TOK_NOPERSPECTIVE:
				return EHTokNoperspective;
			case Main.E_H_TOK_SAMPLE:
				return EHTokSample;
			case Main.E_H_TOK_ROW_MAJOR:
				return EHTokRowMajor;
			case Main.E_H_TOK_COLUMN_MAJOR:
				return EHTokColumnMajor;
			case Main.E_H_TOK_PACK_OFFSET:
				return EHTokPackOffset;
			case Main.E_H_TOK_IN:
				return EHTokIn;
			case Main.E_H_TOK_OUT:
				return EHTokOut;
			case Main.E_H_TOK_IN_OUT:
				return EHTokInOut;
			case Main.E_H_TOK_LAYOUT:
				return EHTokLayout;
			case Main.E_H_TOK_GLOBALLY_COHERENT:
				return EHTokGloballyCoherent;
			case Main.E_H_TOK_INLINE:
				return EHTokInline;
			case Main.E_H_TOK_POINT:
				return EHTokPoint;
			case Main.E_H_TOK_LINE:
				return EHTokLine;
			case Main.E_H_TOK_TRIANGLE:
				return EHTokTriangle;
			case Main.E_H_TOK_LINEADJ:
				return EHTokLineAdj;
			case Main.E_H_TOK_TRIANGLE_ADJ:
				return EHTokTriangleAdj;
			case Main.E_H_TOK_POINT_STREAM:
				return EHTokPointStream;
			case Main.E_H_TOK_LINE_STREAM:
				return EHTokLineStream;
			case Main.E_H_TOK_TRIANGLE_STREAM:
				return EHTokTriangleStream;
			case Main.E_H_TOK_INPUT_PATCH:
				return EHTokInputPatch;
			case Main.E_H_TOK_OUTPUT_PATCH:
				return EHTokOutputPatch;
			case Main.E_H_TOK_BUFFER:
				return EHTokBuffer;
			case Main.E_H_TOK_VECTOR:
				return EHTokVector;
			case Main.E_H_TOK_MATRIX:
				return EHTokMatrix;
			case Main.E_H_TOK_VOID:
				return EHTokVoid;
			case Main.E_H_TOK_STRING:
				return EHTokString;
			case Main.E_H_TOK_BOOL:
				return EHTokBool;
			case Main.E_H_TOK_INT:
				return EHTokInt;
			case Main.E_H_TOK_UINT:
				return EHTokUint;
			case Main.E_H_TOK_UINT64:
				return EHTokUint64;
			case Main.E_H_TOK_DWORD:
				return EHTokDword;
			case Main.E_H_TOK_HALF:
				return EHTokHalf;
			case Main.E_H_TOK_FLOAT:
				return EHTokFloat;
			case Main.E_H_TOK_DOUBLE:
				return EHTokDouble;
			case Main.E_H_TOK_MIN16FLOAT:
				return EHTokMin16float;
			case Main.E_H_TOK_MIN10FLOAT:
				return EHTokMin10float;
			case Main.E_H_TOK_MIN16INT:
				return EHTokMin16int;
			case Main.E_H_TOK_MIN12INT:
				return EHTokMin12int;
			case Main.E_H_TOK_MIN16UINT:
				return EHTokMin16uint;
			case Main.E_H_TOK_BOOL1:
				return EHTokBool1;
			case Main.E_H_TOK_BOOL2:
				return EHTokBool2;
			case Main.E_H_TOK_BOOL3:
				return EHTokBool3;
			case Main.E_H_TOK_BOOL4:
				return EHTokBool4;
			case Main.E_H_TOK_FLOAT1:
				return EHTokFloat1;
			case Main.E_H_TOK_FLOAT2:
				return EHTokFloat2;
			case Main.E_H_TOK_FLOAT3:
				return EHTokFloat3;
			case Main.E_H_TOK_FLOAT4:
				return EHTokFloat4;
			case Main.E_H_TOK_INT1:
				return EHTokInt1;
			case Main.E_H_TOK_INT2:
				return EHTokInt2;
			case Main.E_H_TOK_INT3:
				return EHTokInt3;
			case Main.E_H_TOK_INT4:
				return EHTokInt4;
			case Main.E_H_TOK_DOUBLE1:
				return EHTokDouble1;
			case Main.E_H_TOK_DOUBLE2:
				return EHTokDouble2;
			case Main.E_H_TOK_DOUBLE3:
				return EHTokDouble3;
			case Main.E_H_TOK_DOUBLE4:
				return EHTokDouble4;
			case Main.E_H_TOK_UINT1:
				return EHTokUint1;
			case Main.E_H_TOK_UINT2:
				return EHTokUint2;
			case Main.E_H_TOK_UINT3:
				return EHTokUint3;
			case Main.E_H_TOK_UINT4:
				return EHTokUint4;
			case Main.E_H_TOK_HALF1:
				return EHTokHalf1;
			case Main.E_H_TOK_HALF2:
				return EHTokHalf2;
			case Main.E_H_TOK_HALF3:
				return EHTokHalf3;
			case Main.E_H_TOK_HALF4:
				return EHTokHalf4;
			case Main.E_H_TOK_MIN16FLOAT1:
				return EHTokMin16float1;
			case Main.E_H_TOK_MIN16FLOAT2:
				return EHTokMin16float2;
			case Main.E_H_TOK_MIN16FLOAT3:
				return EHTokMin16float3;
			case Main.E_H_TOK_MIN16FLOAT4:
				return EHTokMin16float4;
			case Main.E_H_TOK_MIN10FLOAT1:
				return EHTokMin10float1;
			case Main.E_H_TOK_MIN10FLOAT2:
				return EHTokMin10float2;
			case Main.E_H_TOK_MIN10FLOAT3:
				return EHTokMin10float3;
			case Main.E_H_TOK_MIN10FLOAT4:
				return EHTokMin10float4;
			case Main.E_H_TOK_MIN16INT1:
				return EHTokMin16int1;
			case Main.E_H_TOK_MIN16INT2:
				return EHTokMin16int2;
			case Main.E_H_TOK_MIN16INT3:
				return EHTokMin16int3;
			case Main.E_H_TOK_MIN16INT4:
				return EHTokMin16int4;
			case Main.E_H_TOK_MIN12INT1:
				return EHTokMin12int1;
			case Main.E_H_TOK_MIN12INT2:
				return EHTokMin12int2;
			case Main.E_H_TOK_MIN12INT3:
				return EHTokMin12int3;
			case Main.E_H_TOK_MIN12INT4:
				return EHTokMin12int4;
			case Main.E_H_TOK_MIN16UINT1:
				return EHTokMin16uint1;
			case Main.E_H_TOK_MIN16UINT2:
				return EHTokMin16uint2;
			case Main.E_H_TOK_MIN16UINT3:
				return EHTokMin16uint3;
			case Main.E_H_TOK_MIN16UINT4:
				return EHTokMin16uint4;
			case Main.E_H_TOK_INT1X1:
				return EHTokInt1x1;
			case Main.E_H_TOK_INT1X2:
				return EHTokInt1x2;
			case Main.E_H_TOK_INT1X3:
				return EHTokInt1x3;
			case Main.E_H_TOK_INT1X4:
				return EHTokInt1x4;
			case Main.E_H_TOK_INT2X1:
				return EHTokInt2x1;
			case Main.E_H_TOK_INT2X2:
				return EHTokInt2x2;
			case Main.E_H_TOK_INT2X3:
				return EHTokInt2x3;
			case Main.E_H_TOK_INT2X4:
				return EHTokInt2x4;
			case Main.E_H_TOK_INT3X1:
				return EHTokInt3x1;
			case Main.E_H_TOK_INT3X2:
				return EHTokInt3x2;
			case Main.E_H_TOK_INT3X3:
				return EHTokInt3x3;
			case Main.E_H_TOK_INT3X4:
				return EHTokInt3x4;
			case Main.E_H_TOK_INT4X1:
				return EHTokInt4x1;
			case Main.E_H_TOK_INT4X2:
				return EHTokInt4x2;
			case Main.E_H_TOK_INT4X3:
				return EHTokInt4x3;
			case Main.E_H_TOK_INT4X4:
				return EHTokInt4x4;
			case Main.E_H_TOK_UINT1X1:
				return EHTokUint1x1;
			case Main.E_H_TOK_UINT1X2:
				return EHTokUint1x2;
			case Main.E_H_TOK_UINT1X3:
				return EHTokUint1x3;
			case Main.E_H_TOK_UINT1X4:
				return EHTokUint1x4;
			case Main.E_H_TOK_UINT2X1:
				return EHTokUint2x1;
			case Main.E_H_TOK_UINT2X2:
				return EHTokUint2x2;
			case Main.E_H_TOK_UINT2X3:
				return EHTokUint2x3;
			case Main.E_H_TOK_UINT2X4:
				return EHTokUint2x4;
			case Main.E_H_TOK_UINT3X1:
				return EHTokUint3x1;
			case Main.E_H_TOK_UINT3X2:
				return EHTokUint3x2;
			case Main.E_H_TOK_UINT3X3:
				return EHTokUint3x3;
			case Main.E_H_TOK_UINT3X4:
				return EHTokUint3x4;
			case Main.E_H_TOK_UINT4X1:
				return EHTokUint4x1;
			case Main.E_H_TOK_UINT4X2:
				return EHTokUint4x2;
			case Main.E_H_TOK_UINT4X3:
				return EHTokUint4x3;
			case Main.E_H_TOK_UINT4X4:
				return EHTokUint4x4;
			case Main.E_H_TOK_BOOL1X1:
				return EHTokBool1x1;
			case Main.E_H_TOK_BOOL1X2:
				return EHTokBool1x2;
			case Main.E_H_TOK_BOOL1X3:
				return EHTokBool1x3;
			case Main.E_H_TOK_BOOL1X4:
				return EHTokBool1x4;
			case Main.E_H_TOK_BOOL2X1:
				return EHTokBool2x1;
			case Main.E_H_TOK_BOOL2X2:
				return EHTokBool2x2;
			case Main.E_H_TOK_BOOL2X3:
				return EHTokBool2x3;
			case Main.E_H_TOK_BOOL2X4:
				return EHTokBool2x4;
			case Main.E_H_TOK_BOOL3X1:
				return EHTokBool3x1;
			case Main.E_H_TOK_BOOL3X2:
				return EHTokBool3x2;
			case Main.E_H_TOK_BOOL3X3:
				return EHTokBool3x3;
			case Main.E_H_TOK_BOOL3X4:
				return EHTokBool3x4;
			case Main.E_H_TOK_BOOL4X1:
				return EHTokBool4x1;
			case Main.E_H_TOK_BOOL4X2:
				return EHTokBool4x2;
			case Main.E_H_TOK_BOOL4X3:
				return EHTokBool4x3;
			case Main.E_H_TOK_BOOL4X4:
				return EHTokBool4x4;
			case Main.E_H_TOK_FLOAT1X1:
				return EHTokFloat1x1;
			case Main.E_H_TOK_FLOAT1X2:
				return EHTokFloat1x2;
			case Main.E_H_TOK_FLOAT1X3:
				return EHTokFloat1x3;
			case Main.E_H_TOK_FLOAT1X4:
				return EHTokFloat1x4;
			case Main.E_H_TOK_FLOAT2X1:
				return EHTokFloat2x1;
			case Main.E_H_TOK_FLOAT2X2:
				return EHTokFloat2x2;
			case Main.E_H_TOK_FLOAT2X3:
				return EHTokFloat2x3;
			case Main.E_H_TOK_FLOAT2X4:
				return EHTokFloat2x4;
			case Main.E_H_TOK_FLOAT3X1:
				return EHTokFloat3x1;
			case Main.E_H_TOK_FLOAT3X2:
				return EHTokFloat3x2;
			case Main.E_H_TOK_FLOAT3X3:
				return EHTokFloat3x3;
			case Main.E_H_TOK_FLOAT3X4:
				return EHTokFloat3x4;
			case Main.E_H_TOK_FLOAT4X1:
				return EHTokFloat4x1;
			case Main.E_H_TOK_FLOAT4X2:
				return EHTokFloat4x2;
			case Main.E_H_TOK_FLOAT4X3:
				return EHTokFloat4x3;
			case Main.E_H_TOK_FLOAT4X4:
				return EHTokFloat4x4;
			case Main.E_H_TOK_HALF1X1:
				return EHTokHalf1x1;
			case Main.E_H_TOK_HALF1X2:
				return EHTokHalf1x2;
			case Main.E_H_TOK_HALF1X3:
				return EHTokHalf1x3;
			case Main.E_H_TOK_HALF1X4:
				return EHTokHalf1x4;
			case Main.E_H_TOK_HALF2X1:
				return EHTokHalf2x1;
			case Main.E_H_TOK_HALF2X2:
				return EHTokHalf2x2;
			case Main.E_H_TOK_HALF2X3:
				return EHTokHalf2x3;
			case Main.E_H_TOK_HALF2X4:
				return EHTokHalf2x4;
			case Main.E_H_TOK_HALF3X1:
				return EHTokHalf3x1;
			case Main.E_H_TOK_HALF3X2:
				return EHTokHalf3x2;
			case Main.E_H_TOK_HALF3X3:
				return EHTokHalf3x3;
			case Main.E_H_TOK_HALF3X4:
				return EHTokHalf3x4;
			case Main.E_H_TOK_HALF4X1:
				return EHTokHalf4x1;
			case Main.E_H_TOK_HALF4X2:
				return EHTokHalf4x2;
			case Main.E_H_TOK_HALF4X3:
				return EHTokHalf4x3;
			case Main.E_H_TOK_HALF4X4:
				return EHTokHalf4x4;
			case Main.E_H_TOK_DOUBLE1X1:
				return EHTokDouble1x1;
			case Main.E_H_TOK_DOUBLE1X2:
				return EHTokDouble1x2;
			case Main.E_H_TOK_DOUBLE1X3:
				return EHTokDouble1x3;
			case Main.E_H_TOK_DOUBLE1X4:
				return EHTokDouble1x4;
			case Main.E_H_TOK_DOUBLE2X1:
				return EHTokDouble2x1;
			case Main.E_H_TOK_DOUBLE2X2:
				return EHTokDouble2x2;
			case Main.E_H_TOK_DOUBLE2X3:
				return EHTokDouble2x3;
			case Main.E_H_TOK_DOUBLE2X4:
				return EHTokDouble2x4;
			case Main.E_H_TOK_DOUBLE3X1:
				return EHTokDouble3x1;
			case Main.E_H_TOK_DOUBLE3X2:
				return EHTokDouble3x2;
			case Main.E_H_TOK_DOUBLE3X3:
				return EHTokDouble3x3;
			case Main.E_H_TOK_DOUBLE3X4:
				return EHTokDouble3x4;
			case Main.E_H_TOK_DOUBLE4X1:
				return EHTokDouble4x1;
			case Main.E_H_TOK_DOUBLE4X2:
				return EHTokDouble4x2;
			case Main.E_H_TOK_DOUBLE4X3:
				return EHTokDouble4x3;
			case Main.E_H_TOK_DOUBLE4X4:
				return EHTokDouble4x4;
			case Main.E_H_TOK_SAMPLER:
				return EHTokSampler;
			case Main.E_H_TOK_SAMPLER1D:
				return EHTokSampler1d;
			case Main.E_H_TOK_SAMPLER2D:
				return EHTokSampler2d;
			case Main.E_H_TOK_SAMPLER3D:
				return EHTokSampler3d;
			case Main.E_H_TOK_SAMPLER_CUBE:
				return EHTokSamplerCube;
			case Main.E_H_TOK_SAMPLER_STATE:
				return EHTokSamplerState;
			case Main.E_H_TOK_SAMPLER_COMPARISON_STATE:
				return EHTokSamplerComparisonState;
			case Main.E_H_TOK_TEXTURE:
				return EHTokTexture;
			case Main.E_H_TOK_TEXTURE1D:
				return EHTokTexture1d;
			case Main.E_H_TOK_TEXTURE1DARRAY:
				return EHTokTexture1darray;
			case Main.E_H_TOK_TEXTURE2D:
				return EHTokTexture2d;
			case Main.E_H_TOK_TEXTURE2DARRAY:
				return EHTokTexture2darray;
			case Main.E_H_TOK_TEXTURE3D:
				return EHTokTexture3d;
			case Main.E_H_TOK_TEXTURE_CUBE:
				return EHTokTextureCube;
			case Main.E_H_TOK_TEXTURE_CUBEARRAY:
				return EHTokTextureCubearray;
			case Main.E_H_TOK_TEXTURE2D_MS:
				return EHTokTexture2DMS;
			case Main.E_H_TOK_TEXTURE2D_MSARRAY:
				return EHTokTexture2DMSarray;
			case Main.E_H_TOK_RW_TEXTURE1D:
				return EHTokRWTexture1d;
			case Main.E_H_TOK_RW_TEXTURE1DARRAY:
				return EHTokRWTexture1darray;
			case Main.E_H_TOK_RW_TEXTURE2D:
				return EHTokRWTexture2d;
			case Main.E_H_TOK_RW_TEXTURE2DARRAY:
				return EHTokRWTexture2darray;
			case Main.E_H_TOK_RW_TEXTURE3D:
				return EHTokRWTexture3d;
			case Main.E_H_TOK_RW_BUFFER:
				return EHTokRWBuffer;
			case Main.E_H_TOK_SUBPASS_INPUT:
				return EHTokSubpassInput;
			case Main.E_H_TOK_SUBPASS_INPUT_MS:
				return EHTokSubpassInputMS;
			case Main.E_H_TOK_APPEND_STRUCTURED_BUFFER:
				return EHTokAppendStructuredBuffer;
			case Main.E_H_TOK_BYTE_ADDRESS_BUFFER:
				return EHTokByteAddressBuffer;
			case Main.E_H_TOK_CONSUME_STRUCTURED_BUFFER:
				return EHTokConsumeStructuredBuffer;
			case Main.E_H_TOK_RW_BYTE_ADDRESS_BUFFER:
				return EHTokRWByteAddressBuffer;
			case Main.E_H_TOK_RW_STRUCTURED_BUFFER:
				return EHTokRWStructuredBuffer;
			case Main.E_H_TOK_STRUCTURED_BUFFER:
				return EHTokStructuredBuffer;
			case Main.E_H_TOK_TEXTURE_BUFFER:
				return EHTokTextureBuffer;
			case Main.E_H_TOK_IDENTIFIER:
				return EHTokIdentifier;
			case Main.E_H_TOK_CLASS:
				return EHTokClass;
			case Main.E_H_TOK_STRUCT:
				return EHTokStruct;
			case Main.E_H_TOK_CBUFFER:
				return EHTokCBuffer;
			case Main.E_H_TOK_TBUFFER:
				return EHTokTBuffer;
			case Main.E_H_TOK_TYPEDEF:
				return EHTokTypedef;
			case Main.E_H_TOK_THIS:
				return EHTokThis;
			case Main.E_H_TOK_NAMESPACE:
				return EHTokNamespace;
			case Main.E_H_TOK_CONSTANT_BUFFER:
				return EHTokConstantBuffer;
			case Main.E_H_TOK_FLOAT16_CONSTANT:
				return EHTokFloat16Constant;
			case Main.E_H_TOK_FLOAT_CONSTANT:
				return EHTokFloatConstant;
			case Main.E_H_TOK_DOUBLE_CONSTANT:
				return EHTokDoubleConstant;
			case Main.E_H_TOK_INT_CONSTANT:
				return EHTokIntConstant;
			case Main.E_H_TOK_UINT_CONSTANT:
				return EHTokUintConstant;
			case Main.E_H_TOK_BOOL_CONSTANT:
				return EHTokBoolConstant;
			case Main.E_H_TOK_STRING_CONSTANT:
				return EHTokStringConstant;
			case Main.E_H_TOK_FOR:
				return EHTokFor;
			case Main.E_H_TOK_DO:
				return EHTokDo;
			case Main.E_H_TOK_WHILE:
				return EHTokWhile;
			case Main.E_H_TOK_BREAK:
				return EHTokBreak;
			case Main.E_H_TOK_CONTINUE:
				return EHTokContinue;
			case Main.E_H_TOK_IF:
				return EHTokIf;
			case Main.E_H_TOK_ELSE:
				return EHTokElse;
			case Main.E_H_TOK_DISCARD:
				return EHTokDiscard;
			case Main.E_H_TOK_RETURN:
				return EHTokReturn;
			case Main.E_H_TOK_SWITCH:
				return EHTokSwitch;
			case Main.E_H_TOK_CASE:
				return EHTokCase;
			case Main.E_H_TOK_DEFAULT:
				return EHTokDefault;
			case Main.E_H_TOK_LEFT_OP:
				return EHTokLeftOp;
			case Main.E_H_TOK_RIGHT_OP:
				return EHTokRightOp;
			case Main.E_H_TOK_INC_OP:
				return EHTokIncOp;
			case Main.E_H_TOK_DEC_OP:
				return EHTokDecOp;
			case Main.E_H_TOK_LE_OP:
				return EHTokLeOp;
			case Main.E_H_TOK_GE_OP:
				return EHTokGeOp;
			case Main.E_H_TOK_EQ_OP:
				return EHTokEqOp;
			case Main.E_H_TOK_NE_OP:
				return EHTokNeOp;
			case Main.E_H_TOK_AND_OP:
				return EHTokAndOp;
			case Main.E_H_TOK_OR_OP:
				return EHTokOrOp;
			case Main.E_H_TOK_XOR_OP:
				return EHTokXorOp;
			case Main.E_H_TOK_ASSIGN:
				return EHTokAssign;
			case Main.E_H_TOK_MUL_ASSIGN:
				return EHTokMulAssign;
			case Main.E_H_TOK_DIV_ASSIGN:
				return EHTokDivAssign;
			case Main.E_H_TOK_ADD_ASSIGN:
				return EHTokAddAssign;
			case Main.E_H_TOK_MOD_ASSIGN:
				return EHTokModAssign;
			case Main.E_H_TOK_LEFT_ASSIGN:
				return EHTokLeftAssign;
			case Main.E_H_TOK_RIGHT_ASSIGN:
				return EHTokRightAssign;
			case Main.E_H_TOK_AND_ASSIGN:
				return EHTokAndAssign;
			case Main.E_H_TOK_XOR_ASSIGN:
				return EHTokXorAssign;
			case Main.E_H_TOK_OR_ASSIGN:
				return EHTokOrAssign;
			case Main.E_H_TOK_SUB_ASSIGN:
				return EHTokSubAssign;
			case Main.E_H_TOK_LEFT_PAREN:
				return EHTokLeftParen;
			case Main.E_H_TOK_RIGHT_PAREN:
				return EHTokRightParen;
			case Main.E_H_TOK_LEFT_BRACKET:
				return EHTokLeftBracket;
			case Main.E_H_TOK_RIGHT_BRACKET:
				return EHTokRightBracket;
			case Main.E_H_TOK_LEFT_BRACE:
				return EHTokLeftBrace;
			case Main.E_H_TOK_RIGHT_BRACE:
				return EHTokRightBrace;
			case Main.E_H_TOK_DOT:
				return EHTokDot;
			case Main.E_H_TOK_COMMA:
				return EHTokComma;
			case Main.E_H_TOK_COLON:
				return EHTokColon;
			case Main.E_H_TOK_COLON_COLON:
				return EHTokColonColon;
			case Main.E_H_TOK_SEMICOLON:
				return EHTokSemicolon;
			case Main.E_H_TOK_BANG:
				return EHTokBang;
			case Main.E_H_TOK_DASH:
				return EHTokDash;
			case Main.E_H_TOK_TILDE:
				return EHTokTilde;
			case Main.E_H_TOK_PLUS:
				return EHTokPlus;
			case Main.E_H_TOK_STAR:
				return EHTokStar;
			case Main.E_H_TOK_SLASH:
				return EHTokSlash;
			case Main.E_H_TOK_PERCENT:
				return EHTokPercent;
			case Main.E_H_TOK_LEFT_ANGLE:
				return EHTokLeftAngle;
			case Main.E_H_TOK_RIGHT_ANGLE:
				return EHTokRightAngle;
			case Main.E_H_TOK_VERTICAL_BAR:
				return EHTokVerticalBar;
			case Main.E_H_TOK_CARET:
				return EHTokCaret;
			case Main.E_H_TOK_AMPERSAND:
				return EHTokAmpersand;
			case Main.E_H_TOK_QUESTION:
				return EHTokQuestion;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
