package com.destranix.glslang;

public enum TOperator {
	EOpNull(Main.E_OP_NULL),
	EOpSequence(Main.E_OP_SEQUENCE),
	EOpLinkerObjects(Main.E_OP_LINKER_OBJECTS),
	EOpFunctionCall(Main.E_OP_FUNCTION_CALL),
	EOpFunction(Main.E_OP_FUNCTION),
	EOpParameters(Main.E_OP_PARAMETERS),
	EOpNegative(Main.E_OP_NEGATIVE),
	EOpLogicalNot(Main.E_OP_LOGICAL_NOT),
	EOpVectorLogicalNot(Main.E_OP_VECTOR_LOGICAL_NOT),
	EOpBitwiseNot(Main.E_OP_BITWISE_NOT),
	EOpPostIncrement(Main.E_OP_POST_INCREMENT),
	EOpPostDecrement(Main.E_OP_POST_DECREMENT),
	EOpPreIncrement(Main.E_OP_PRE_INCREMENT),
	EOpPreDecrement(Main.E_OP_PRE_DECREMENT),
	EOpCopyObject(Main.E_OP_COPY_OBJECT),
	EOpConvInt8ToBool(Main.E_OP_CONV_INT8_TO_BOOL),
	EOpConvUint8ToBool(Main.E_OP_CONV_UINT8_TO_BOOL),
	EOpConvInt16ToBool(Main.E_OP_CONV_INT16_TO_BOOL),
	EOpConvUint16ToBool(Main.E_OP_CONV_UINT16_TO_BOOL),
	EOpConvIntToBool(Main.E_OP_CONV_INT_TO_BOOL),
	EOpConvUintToBool(Main.E_OP_CONV_UINT_TO_BOOL),
	EOpConvInt64ToBool(Main.E_OP_CONV_INT64_TO_BOOL),
	EOpConvUint64ToBool(Main.E_OP_CONV_UINT64_TO_BOOL),
	EOpConvFloat16ToBool(Main.E_OP_CONV_FLOAT16_TO_BOOL),
	EOpConvFloatToBool(Main.E_OP_CONV_FLOAT_TO_BOOL),
	EOpConvDoubleToBool(Main.E_OP_CONV_DOUBLE_TO_BOOL),
	EOpConvBoolToInt8(Main.E_OP_CONV_BOOL_TO_INT8),
	EOpConvBoolToUint8(Main.E_OP_CONV_BOOL_TO_UINT8),
	EOpConvBoolToInt16(Main.E_OP_CONV_BOOL_TO_INT16),
	EOpConvBoolToUint16(Main.E_OP_CONV_BOOL_TO_UINT16),
	EOpConvBoolToInt(Main.E_OP_CONV_BOOL_TO_INT),
	EOpConvBoolToUint(Main.E_OP_CONV_BOOL_TO_UINT),
	EOpConvBoolToInt64(Main.E_OP_CONV_BOOL_TO_INT64),
	EOpConvBoolToUint64(Main.E_OP_CONV_BOOL_TO_UINT64),
	EOpConvBoolToFloat16(Main.E_OP_CONV_BOOL_TO_FLOAT16),
	EOpConvBoolToFloat(Main.E_OP_CONV_BOOL_TO_FLOAT),
	EOpConvBoolToDouble(Main.E_OP_CONV_BOOL_TO_DOUBLE),
	EOpConvInt8ToInt16(Main.E_OP_CONV_INT8_TO_INT16),
	EOpConvInt8ToInt(Main.E_OP_CONV_INT8_TO_INT),
	EOpConvInt8ToInt64(Main.E_OP_CONV_INT8_TO_INT64),
	EOpConvInt8ToUint8(Main.E_OP_CONV_INT8_TO_UINT8),
	EOpConvInt8ToUint16(Main.E_OP_CONV_INT8_TO_UINT16),
	EOpConvInt8ToUint(Main.E_OP_CONV_INT8_TO_UINT),
	EOpConvInt8ToUint64(Main.E_OP_CONV_INT8_TO_UINT64),
	EOpConvUint8ToInt8(Main.E_OP_CONV_UINT8_TO_INT8),
	EOpConvUint8ToInt16(Main.E_OP_CONV_UINT8_TO_INT16),
	EOpConvUint8ToInt(Main.E_OP_CONV_UINT8_TO_INT),
	EOpConvUint8ToInt64(Main.E_OP_CONV_UINT8_TO_INT64),
	EOpConvUint8ToUint16(Main.E_OP_CONV_UINT8_TO_UINT16),
	EOpConvUint8ToUint(Main.E_OP_CONV_UINT8_TO_UINT),
	EOpConvUint8ToUint64(Main.E_OP_CONV_UINT8_TO_UINT64),
	EOpConvInt8ToFloat16(Main.E_OP_CONV_INT8_TO_FLOAT16),
	EOpConvInt8ToFloat(Main.E_OP_CONV_INT8_TO_FLOAT),
	EOpConvInt8ToDouble(Main.E_OP_CONV_INT8_TO_DOUBLE),
	EOpConvUint8ToFloat16(Main.E_OP_CONV_UINT8_TO_FLOAT16),
	EOpConvUint8ToFloat(Main.E_OP_CONV_UINT8_TO_FLOAT),
	EOpConvUint8ToDouble(Main.E_OP_CONV_UINT8_TO_DOUBLE),
	EOpConvInt16ToInt8(Main.E_OP_CONV_INT16_TO_INT8),
	EOpConvInt16ToInt(Main.E_OP_CONV_INT16_TO_INT),
	EOpConvInt16ToInt64(Main.E_OP_CONV_INT16_TO_INT64),
	EOpConvInt16ToUint8(Main.E_OP_CONV_INT16_TO_UINT8),
	EOpConvInt16ToUint16(Main.E_OP_CONV_INT16_TO_UINT16),
	EOpConvInt16ToUint(Main.E_OP_CONV_INT16_TO_UINT),
	EOpConvInt16ToUint64(Main.E_OP_CONV_INT16_TO_UINT64),
	EOpConvUint16ToInt8(Main.E_OP_CONV_UINT16_TO_INT8),
	EOpConvUint16ToInt16(Main.E_OP_CONV_UINT16_TO_INT16),
	EOpConvUint16ToInt(Main.E_OP_CONV_UINT16_TO_INT),
	EOpConvUint16ToInt64(Main.E_OP_CONV_UINT16_TO_INT64),
	EOpConvUint16ToUint8(Main.E_OP_CONV_UINT16_TO_UINT8),
	EOpConvUint16ToUint(Main.E_OP_CONV_UINT16_TO_UINT),
	EOpConvUint16ToUint64(Main.E_OP_CONV_UINT16_TO_UINT64),
	EOpConvInt16ToFloat16(Main.E_OP_CONV_INT16_TO_FLOAT16),
	EOpConvInt16ToFloat(Main.E_OP_CONV_INT16_TO_FLOAT),
	EOpConvInt16ToDouble(Main.E_OP_CONV_INT16_TO_DOUBLE),
	EOpConvUint16ToFloat16(Main.E_OP_CONV_UINT16_TO_FLOAT16),
	EOpConvUint16ToFloat(Main.E_OP_CONV_UINT16_TO_FLOAT),
	EOpConvUint16ToDouble(Main.E_OP_CONV_UINT16_TO_DOUBLE),
	EOpConvIntToInt8(Main.E_OP_CONV_INT_TO_INT8),
	EOpConvIntToInt16(Main.E_OP_CONV_INT_TO_INT16),
	EOpConvIntToInt64(Main.E_OP_CONV_INT_TO_INT64),
	EOpConvIntToUint8(Main.E_OP_CONV_INT_TO_UINT8),
	EOpConvIntToUint16(Main.E_OP_CONV_INT_TO_UINT16),
	EOpConvIntToUint(Main.E_OP_CONV_INT_TO_UINT),
	EOpConvIntToUint64(Main.E_OP_CONV_INT_TO_UINT64),
	EOpConvUintToInt8(Main.E_OP_CONV_UINT_TO_INT8),
	EOpConvUintToInt16(Main.E_OP_CONV_UINT_TO_INT16),
	EOpConvUintToInt(Main.E_OP_CONV_UINT_TO_INT),
	EOpConvUintToInt64(Main.E_OP_CONV_UINT_TO_INT64),
	EOpConvUintToUint8(Main.E_OP_CONV_UINT_TO_UINT8),
	EOpConvUintToUint16(Main.E_OP_CONV_UINT_TO_UINT16),
	EOpConvUintToUint64(Main.E_OP_CONV_UINT_TO_UINT64),
	EOpConvIntToFloat16(Main.E_OP_CONV_INT_TO_FLOAT16),
	EOpConvIntToFloat(Main.E_OP_CONV_INT_TO_FLOAT),
	EOpConvIntToDouble(Main.E_OP_CONV_INT_TO_DOUBLE),
	EOpConvUintToFloat16(Main.E_OP_CONV_UINT_TO_FLOAT16),
	EOpConvUintToFloat(Main.E_OP_CONV_UINT_TO_FLOAT),
	EOpConvUintToDouble(Main.E_OP_CONV_UINT_TO_DOUBLE),
	EOpConvInt64ToInt8(Main.E_OP_CONV_INT64_TO_INT8),
	EOpConvInt64ToInt16(Main.E_OP_CONV_INT64_TO_INT16),
	EOpConvInt64ToInt(Main.E_OP_CONV_INT64_TO_INT),
	EOpConvInt64ToUint8(Main.E_OP_CONV_INT64_TO_UINT8),
	EOpConvInt64ToUint16(Main.E_OP_CONV_INT64_TO_UINT16),
	EOpConvInt64ToUint(Main.E_OP_CONV_INT64_TO_UINT),
	EOpConvInt64ToUint64(Main.E_OP_CONV_INT64_TO_UINT64),
	EOpConvUint64ToInt8(Main.E_OP_CONV_UINT64_TO_INT8),
	EOpConvUint64ToInt16(Main.E_OP_CONV_UINT64_TO_INT16),
	EOpConvUint64ToInt(Main.E_OP_CONV_UINT64_TO_INT),
	EOpConvUint64ToInt64(Main.E_OP_CONV_UINT64_TO_INT64),
	EOpConvUint64ToUint8(Main.E_OP_CONV_UINT64_TO_UINT8),
	EOpConvUint64ToUint16(Main.E_OP_CONV_UINT64_TO_UINT16),
	EOpConvUint64ToUint(Main.E_OP_CONV_UINT64_TO_UINT),
	EOpConvInt64ToFloat16(Main.E_OP_CONV_INT64_TO_FLOAT16),
	EOpConvInt64ToFloat(Main.E_OP_CONV_INT64_TO_FLOAT),
	EOpConvInt64ToDouble(Main.E_OP_CONV_INT64_TO_DOUBLE),
	EOpConvUint64ToFloat16(Main.E_OP_CONV_UINT64_TO_FLOAT16),
	EOpConvUint64ToFloat(Main.E_OP_CONV_UINT64_TO_FLOAT),
	EOpConvUint64ToDouble(Main.E_OP_CONV_UINT64_TO_DOUBLE),
	EOpConvFloat16ToInt8(Main.E_OP_CONV_FLOAT16_TO_INT8),
	EOpConvFloat16ToInt16(Main.E_OP_CONV_FLOAT16_TO_INT16),
	EOpConvFloat16ToInt(Main.E_OP_CONV_FLOAT16_TO_INT),
	EOpConvFloat16ToInt64(Main.E_OP_CONV_FLOAT16_TO_INT64),
	EOpConvFloat16ToUint8(Main.E_OP_CONV_FLOAT16_TO_UINT8),
	EOpConvFloat16ToUint16(Main.E_OP_CONV_FLOAT16_TO_UINT16),
	EOpConvFloat16ToUint(Main.E_OP_CONV_FLOAT16_TO_UINT),
	EOpConvFloat16ToUint64(Main.E_OP_CONV_FLOAT16_TO_UINT64),
	EOpConvFloat16ToFloat(Main.E_OP_CONV_FLOAT16_TO_FLOAT),
	EOpConvFloat16ToDouble(Main.E_OP_CONV_FLOAT16_TO_DOUBLE),
	EOpConvFloatToInt8(Main.E_OP_CONV_FLOAT_TO_INT8),
	EOpConvFloatToInt16(Main.E_OP_CONV_FLOAT_TO_INT16),
	EOpConvFloatToInt(Main.E_OP_CONV_FLOAT_TO_INT),
	EOpConvFloatToInt64(Main.E_OP_CONV_FLOAT_TO_INT64),
	EOpConvFloatToUint8(Main.E_OP_CONV_FLOAT_TO_UINT8),
	EOpConvFloatToUint16(Main.E_OP_CONV_FLOAT_TO_UINT16),
	EOpConvFloatToUint(Main.E_OP_CONV_FLOAT_TO_UINT),
	EOpConvFloatToUint64(Main.E_OP_CONV_FLOAT_TO_UINT64),
	EOpConvFloatToFloat16(Main.E_OP_CONV_FLOAT_TO_FLOAT16),
	EOpConvFloatToDouble(Main.E_OP_CONV_FLOAT_TO_DOUBLE),
	EOpConvDoubleToInt8(Main.E_OP_CONV_DOUBLE_TO_INT8),
	EOpConvDoubleToInt16(Main.E_OP_CONV_DOUBLE_TO_INT16),
	EOpConvDoubleToInt(Main.E_OP_CONV_DOUBLE_TO_INT),
	EOpConvDoubleToInt64(Main.E_OP_CONV_DOUBLE_TO_INT64),
	EOpConvDoubleToUint8(Main.E_OP_CONV_DOUBLE_TO_UINT8),
	EOpConvDoubleToUint16(Main.E_OP_CONV_DOUBLE_TO_UINT16),
	EOpConvDoubleToUint(Main.E_OP_CONV_DOUBLE_TO_UINT),
	EOpConvDoubleToUint64(Main.E_OP_CONV_DOUBLE_TO_UINT64),
	EOpConvDoubleToFloat16(Main.E_OP_CONV_DOUBLE_TO_FLOAT16),
	EOpConvDoubleToFloat(Main.E_OP_CONV_DOUBLE_TO_FLOAT),
	EOpConvUint64ToPtr(Main.E_OP_CONV_UINT64_TO_PTR),
	EOpConvPtrToUint64(Main.E_OP_CONV_PTR_TO_UINT64),
	EOpConvUvec2ToPtr(Main.E_OP_CONV_UVEC2_TO_PTR),
	EOpConvPtrToUvec2(Main.E_OP_CONV_PTR_TO_UVEC2),
	EOpAdd(Main.E_OP_ADD),
	EOpSub(Main.E_OP_SUB),
	EOpMul(Main.E_OP_MUL),
	EOpDiv(Main.E_OP_DIV),
	EOpMod(Main.E_OP_MOD),
	EOpRightShift(Main.E_OP_RIGHT_SHIFT),
	EOpLeftShift(Main.E_OP_LEFT_SHIFT),
	EOpAnd(Main.E_OP_AND),
	EOpInclusiveOr(Main.E_OP_INCLUSIVE_OR),
	EOpExclusiveOr(Main.E_OP_EXCLUSIVE_OR),
	EOpEqual(Main.E_OP_EQUAL),
	EOpNotEqual(Main.E_OP_NOT_EQUAL),
	EOpVectorEqual(Main.E_OP_VECTOR_EQUAL),
	EOpVectorNotEqual(Main.E_OP_VECTOR_NOT_EQUAL),
	EOpLessThan(Main.E_OP_LESS_THAN),
	EOpGreaterThan(Main.E_OP_GREATER_THAN),
	EOpLessThanEqual(Main.E_OP_LESS_THAN_EQUAL),
	EOpGreaterThanEqual(Main.E_OP_GREATER_THAN_EQUAL),
	EOpComma(Main.E_OP_COMMA),
	EOpVectorTimesScalar(Main.E_OP_VECTOR_TIMES_SCALAR),
	EOpVectorTimesMatrix(Main.E_OP_VECTOR_TIMES_MATRIX),
	EOpMatrixTimesVector(Main.E_OP_MATRIX_TIMES_VECTOR),
	EOpMatrixTimesScalar(Main.E_OP_MATRIX_TIMES_SCALAR),
	EOpLogicalOr(Main.E_OP_LOGICAL_OR),
	EOpLogicalXor(Main.E_OP_LOGICAL_XOR),
	EOpLogicalAnd(Main.E_OP_LOGICAL_AND),
	EOpIndexDirect(Main.E_OP_INDEX_DIRECT),
	EOpIndexIndirect(Main.E_OP_INDEX_INDIRECT),
	EOpIndexDirectStruct(Main.E_OP_INDEX_DIRECT_STRUCT),
	EOpVectorSwizzle(Main.E_OP_VECTOR_SWIZZLE),
	EOpMethod(Main.E_OP_METHOD),
	EOpScoping(Main.E_OP_SCOPING),
	EOpRadians(Main.E_OP_RADIANS),
	EOpDegrees(Main.E_OP_DEGREES),
	EOpSin(Main.E_OP_SIN),
	EOpCos(Main.E_OP_COS),
	EOpTan(Main.E_OP_TAN),
	EOpAsin(Main.E_OP_ASIN),
	EOpAcos(Main.E_OP_ACOS),
	EOpAtan(Main.E_OP_ATAN),
	EOpSinh(Main.E_OP_SINH),
	EOpCosh(Main.E_OP_COSH),
	EOpTanh(Main.E_OP_TANH),
	EOpAsinh(Main.E_OP_ASINH),
	EOpAcosh(Main.E_OP_ACOSH),
	EOpAtanh(Main.E_OP_ATANH),
	EOpPow(Main.E_OP_POW),
	EOpExp(Main.E_OP_EXP),
	EOpLog(Main.E_OP_LOG),
	EOpExp2(Main.E_OP_EXP2),
	EOpLog2(Main.E_OP_LOG2),
	EOpSqrt(Main.E_OP_SQRT),
	EOpInverseSqrt(Main.E_OP_INVERSE_SQRT),
	EOpAbs(Main.E_OP_ABS),
	EOpSign(Main.E_OP_SIGN),
	EOpFloor(Main.E_OP_FLOOR),
	EOpTrunc(Main.E_OP_TRUNC),
	EOpRound(Main.E_OP_ROUND),
	EOpRoundEven(Main.E_OP_ROUND_EVEN),
	EOpCeil(Main.E_OP_CEIL),
	EOpFract(Main.E_OP_FRACT),
	EOpModf(Main.E_OP_MODF),
	EOpMin(Main.E_OP_MIN),
	EOpMax(Main.E_OP_MAX),
	EOpClamp(Main.E_OP_CLAMP),
	EOpMix(Main.E_OP_MIX),
	EOpStep(Main.E_OP_STEP),
	EOpSmoothStep(Main.E_OP_SMOOTH_STEP),
	EOpIsNan(Main.E_OP_IS_NAN),
	EOpIsInf(Main.E_OP_IS_INF),
	EOpFma(Main.E_OP_FMA),
	EOpFrexp(Main.E_OP_FREXP),
	EOpLdexp(Main.E_OP_LDEXP),
	EOpFloatBitsToInt(Main.E_OP_FLOAT_BITS_TO_INT),
	EOpFloatBitsToUint(Main.E_OP_FLOAT_BITS_TO_UINT),
	EOpIntBitsToFloat(Main.E_OP_INT_BITS_TO_FLOAT),
	EOpUintBitsToFloat(Main.E_OP_UINT_BITS_TO_FLOAT),
	EOpDoubleBitsToInt64(Main.E_OP_DOUBLE_BITS_TO_INT64),
	EOpDoubleBitsToUint64(Main.E_OP_DOUBLE_BITS_TO_UINT64),
	EOpInt64BitsToDouble(Main.E_OP_INT64_BITS_TO_DOUBLE),
	EOpUint64BitsToDouble(Main.E_OP_UINT64_BITS_TO_DOUBLE),
	EOpFloat16BitsToInt16(Main.E_OP_FLOAT16_BITS_TO_INT16),
	EOpFloat16BitsToUint16(Main.E_OP_FLOAT16_BITS_TO_UINT16),
	EOpInt16BitsToFloat16(Main.E_OP_INT16_BITS_TO_FLOAT16),
	EOpUint16BitsToFloat16(Main.E_OP_UINT16_BITS_TO_FLOAT16),
	EOpPackSnorm2x16(Main.E_OP_PACK_SNORM2X16),
	EOpUnpackSnorm2x16(Main.E_OP_UNPACK_SNORM2X16),
	EOpPackUnorm2x16(Main.E_OP_PACK_UNORM2X16),
	EOpUnpackUnorm2x16(Main.E_OP_UNPACK_UNORM2X16),
	EOpPackSnorm4x8(Main.E_OP_PACK_SNORM4X8),
	EOpUnpackSnorm4x8(Main.E_OP_UNPACK_SNORM4X8),
	EOpPackUnorm4x8(Main.E_OP_PACK_UNORM4X8),
	EOpUnpackUnorm4x8(Main.E_OP_UNPACK_UNORM4X8),
	EOpPackHalf2x16(Main.E_OP_PACK_HALF2X16),
	EOpUnpackHalf2x16(Main.E_OP_UNPACK_HALF2X16),
	EOpPackDouble2x32(Main.E_OP_PACK_DOUBLE2X32),
	EOpUnpackDouble2x32(Main.E_OP_UNPACK_DOUBLE2X32),
	EOpPackInt2x32(Main.E_OP_PACK_INT2X32),
	EOpUnpackInt2x32(Main.E_OP_UNPACK_INT2X32),
	EOpPackUint2x32(Main.E_OP_PACK_UINT2X32),
	EOpUnpackUint2x32(Main.E_OP_UNPACK_UINT2X32),
	EOpPackFloat2x16(Main.E_OP_PACK_FLOAT2X16),
	EOpUnpackFloat2x16(Main.E_OP_UNPACK_FLOAT2X16),
	EOpPackInt2x16(Main.E_OP_PACK_INT2X16),
	EOpUnpackInt2x16(Main.E_OP_UNPACK_INT2X16),
	EOpPackUint2x16(Main.E_OP_PACK_UINT2X16),
	EOpUnpackUint2x16(Main.E_OP_UNPACK_UINT2X16),
	EOpPackInt4x16(Main.E_OP_PACK_INT4X16),
	EOpUnpackInt4x16(Main.E_OP_UNPACK_INT4X16),
	EOpPackUint4x16(Main.E_OP_PACK_UINT4X16),
	EOpUnpackUint4x16(Main.E_OP_UNPACK_UINT4X16),
	EOpPack16(Main.E_OP_PACK16),
	EOpPack32(Main.E_OP_PACK32),
	EOpPack64(Main.E_OP_PACK64),
	EOpUnpack32(Main.E_OP_UNPACK32),
	EOpUnpack16(Main.E_OP_UNPACK16),
	EOpUnpack8(Main.E_OP_UNPACK8),
	EOpLength(Main.E_OP_LENGTH),
	EOpDistance(Main.E_OP_DISTANCE),
	EOpDot(Main.E_OP_DOT),
	EOpCross(Main.E_OP_CROSS),
	EOpNormalize(Main.E_OP_NORMALIZE),
	EOpFaceForward(Main.E_OP_FACE_FORWARD),
	EOpReflect(Main.E_OP_REFLECT),
	EOpRefract(Main.E_OP_REFRACT),
	EOpMin3(Main.E_OP_MIN3),
	EOpMax3(Main.E_OP_MAX3),
	EOpMid3(Main.E_OP_MID3),
	EOpDPdx(Main.E_OP_DPDX),
	EOpDPdy(Main.E_OP_DPDY),
	EOpFwidth(Main.E_OP_FWIDTH),
	EOpDPdxFine(Main.E_OP_DPDXFINE),
	EOpDPdyFine(Main.E_OP_DPDYFINE),
	EOpFwidthFine(Main.E_OP_FWIDTH_FINE),
	EOpDPdxCoarse(Main.E_OP_DPDXCOARSE),
	EOpDPdyCoarse(Main.E_OP_DPDYCOARSE),
	EOpFwidthCoarse(Main.E_OP_FWIDTH_COARSE),
	EOpInterpolateAtCentroid(Main.E_OP_INTERPOLATE_AT_CENTROID),
	EOpInterpolateAtSample(Main.E_OP_INTERPOLATE_AT_SAMPLE),
	EOpInterpolateAtOffset(Main.E_OP_INTERPOLATE_AT_OFFSET),
	EOpInterpolateAtVertex(Main.E_OP_INTERPOLATE_AT_VERTEX),
	EOpMatrixTimesMatrix(Main.E_OP_MATRIX_TIMES_MATRIX),
	EOpOuterProduct(Main.E_OP_OUTER_PRODUCT),
	EOpDeterminant(Main.E_OP_DETERMINANT),
	EOpMatrixInverse(Main.E_OP_MATRIX_INVERSE),
	EOpTranspose(Main.E_OP_TRANSPOSE),
	EOpFtransform(Main.E_OP_FTRANSFORM),
	EOpNoise(Main.E_OP_NOISE),
	EOpEmitVertex(Main.E_OP_EMIT_VERTEX),
	EOpEndPrimitive(Main.E_OP_END_PRIMITIVE),
	EOpEmitStreamVertex(Main.E_OP_EMIT_STREAM_VERTEX),
	EOpEndStreamPrimitive(Main.E_OP_END_STREAM_PRIMITIVE),
	EOpBarrier(Main.E_OP_BARRIER),
	EOpMemoryBarrier(Main.E_OP_MEMORY_BARRIER),
	EOpMemoryBarrierAtomicCounter(Main.E_OP_MEMORY_BARRIER_ATOMIC_COUNTER),
	EOpMemoryBarrierBuffer(Main.E_OP_MEMORY_BARRIER_BUFFER),
	EOpMemoryBarrierImage(Main.E_OP_MEMORY_BARRIER_IMAGE),
	EOpMemoryBarrierShared(Main.E_OP_MEMORY_BARRIER_SHARED),
	EOpGroupMemoryBarrier(Main.E_OP_GROUP_MEMORY_BARRIER),
	EOpBallot(Main.E_OP_BALLOT),
	EOpReadInvocation(Main.E_OP_READ_INVOCATION),
	EOpReadFirstInvocation(Main.E_OP_READ_FIRST_INVOCATION),
	EOpAnyInvocation(Main.E_OP_ANY_INVOCATION),
	EOpAllInvocations(Main.E_OP_ALL_INVOCATIONS),
	EOpAllInvocationsEqual(Main.E_OP_ALL_INVOCATIONS_EQUAL),
	EOpSubgroupGuardStart(Main.E_OP_SUBGROUP_GUARD_START),
	EOpSubgroupBarrier(Main.E_OP_SUBGROUP_BARRIER),
	EOpSubgroupMemoryBarrier(Main.E_OP_SUBGROUP_MEMORY_BARRIER),
	EOpSubgroupMemoryBarrierBuffer(Main.E_OP_SUBGROUP_MEMORY_BARRIER_BUFFER),
	EOpSubgroupMemoryBarrierImage(Main.E_OP_SUBGROUP_MEMORY_BARRIER_IMAGE),
	EOpSubgroupMemoryBarrierShared(Main.E_OP_SUBGROUP_MEMORY_BARRIER_SHARED),
	EOpSubgroupElect(Main.E_OP_SUBGROUP_ELECT),
	EOpSubgroupAll(Main.E_OP_SUBGROUP_ALL),
	EOpSubgroupAny(Main.E_OP_SUBGROUP_ANY),
	EOpSubgroupAllEqual(Main.E_OP_SUBGROUP_ALL_EQUAL),
	EOpSubgroupBroadcast(Main.E_OP_SUBGROUP_BROADCAST),
	EOpSubgroupBroadcastFirst(Main.E_OP_SUBGROUP_BROADCAST_FIRST),
	EOpSubgroupBallot(Main.E_OP_SUBGROUP_BALLOT),
	EOpSubgroupInverseBallot(Main.E_OP_SUBGROUP_INVERSE_BALLOT),
	EOpSubgroupBallotBitExtract(Main.E_OP_SUBGROUP_BALLOT_BIT_EXTRACT),
	EOpSubgroupBallotBitCount(Main.E_OP_SUBGROUP_BALLOT_BIT_COUNT),
	EOpSubgroupBallotInclusiveBitCount(Main.E_OP_SUBGROUP_BALLOT_INCLUSIVE_BIT_COUNT),
	EOpSubgroupBallotExclusiveBitCount(Main.E_OP_SUBGROUP_BALLOT_EXCLUSIVE_BIT_COUNT),
	EOpSubgroupBallotFindLSB(Main.E_OP_SUBGROUP_BALLOT_FIND_LSB),
	EOpSubgroupBallotFindMSB(Main.E_OP_SUBGROUP_BALLOT_FIND_MSB),
	EOpSubgroupShuffle(Main.E_OP_SUBGROUP_SHUFFLE),
	EOpSubgroupShuffleXor(Main.E_OP_SUBGROUP_SHUFFLE_XOR),
	EOpSubgroupShuffleUp(Main.E_OP_SUBGROUP_SHUFFLE_UP),
	EOpSubgroupShuffleDown(Main.E_OP_SUBGROUP_SHUFFLE_DOWN),
	EOpSubgroupAdd(Main.E_OP_SUBGROUP_ADD),
	EOpSubgroupMul(Main.E_OP_SUBGROUP_MUL),
	EOpSubgroupMin(Main.E_OP_SUBGROUP_MIN),
	EOpSubgroupMax(Main.E_OP_SUBGROUP_MAX),
	EOpSubgroupAnd(Main.E_OP_SUBGROUP_AND),
	EOpSubgroupOr(Main.E_OP_SUBGROUP_OR),
	EOpSubgroupXor(Main.E_OP_SUBGROUP_XOR),
	EOpSubgroupInclusiveAdd(Main.E_OP_SUBGROUP_INCLUSIVE_ADD),
	EOpSubgroupInclusiveMul(Main.E_OP_SUBGROUP_INCLUSIVE_MUL),
	EOpSubgroupInclusiveMin(Main.E_OP_SUBGROUP_INCLUSIVE_MIN),
	EOpSubgroupInclusiveMax(Main.E_OP_SUBGROUP_INCLUSIVE_MAX),
	EOpSubgroupInclusiveAnd(Main.E_OP_SUBGROUP_INCLUSIVE_AND),
	EOpSubgroupInclusiveOr(Main.E_OP_SUBGROUP_INCLUSIVE_OR),
	EOpSubgroupInclusiveXor(Main.E_OP_SUBGROUP_INCLUSIVE_XOR),
	EOpSubgroupExclusiveAdd(Main.E_OP_SUBGROUP_EXCLUSIVE_ADD),
	EOpSubgroupExclusiveMul(Main.E_OP_SUBGROUP_EXCLUSIVE_MUL),
	EOpSubgroupExclusiveMin(Main.E_OP_SUBGROUP_EXCLUSIVE_MIN),
	EOpSubgroupExclusiveMax(Main.E_OP_SUBGROUP_EXCLUSIVE_MAX),
	EOpSubgroupExclusiveAnd(Main.E_OP_SUBGROUP_EXCLUSIVE_AND),
	EOpSubgroupExclusiveOr(Main.E_OP_SUBGROUP_EXCLUSIVE_OR),
	EOpSubgroupExclusiveXor(Main.E_OP_SUBGROUP_EXCLUSIVE_XOR),
	EOpSubgroupClusteredAdd(Main.E_OP_SUBGROUP_CLUSTERED_ADD),
	EOpSubgroupClusteredMul(Main.E_OP_SUBGROUP_CLUSTERED_MUL),
	EOpSubgroupClusteredMin(Main.E_OP_SUBGROUP_CLUSTERED_MIN),
	EOpSubgroupClusteredMax(Main.E_OP_SUBGROUP_CLUSTERED_MAX),
	EOpSubgroupClusteredAnd(Main.E_OP_SUBGROUP_CLUSTERED_AND),
	EOpSubgroupClusteredOr(Main.E_OP_SUBGROUP_CLUSTERED_OR),
	EOpSubgroupClusteredXor(Main.E_OP_SUBGROUP_CLUSTERED_XOR),
	EOpSubgroupQuadBroadcast(Main.E_OP_SUBGROUP_QUAD_BROADCAST),
	EOpSubgroupQuadSwapHorizontal(Main.E_OP_SUBGROUP_QUAD_SWAP_HORIZONTAL),
	EOpSubgroupQuadSwapVertical(Main.E_OP_SUBGROUP_QUAD_SWAP_VERTICAL),
	EOpSubgroupQuadSwapDiagonal(Main.E_OP_SUBGROUP_QUAD_SWAP_DIAGONAL),
	EOpSubgroupPartition(Main.E_OP_SUBGROUP_PARTITION),
	EOpSubgroupPartitionedAdd(Main.E_OP_SUBGROUP_PARTITIONED_ADD),
	EOpSubgroupPartitionedMul(Main.E_OP_SUBGROUP_PARTITIONED_MUL),
	EOpSubgroupPartitionedMin(Main.E_OP_SUBGROUP_PARTITIONED_MIN),
	EOpSubgroupPartitionedMax(Main.E_OP_SUBGROUP_PARTITIONED_MAX),
	EOpSubgroupPartitionedAnd(Main.E_OP_SUBGROUP_PARTITIONED_AND),
	EOpSubgroupPartitionedOr(Main.E_OP_SUBGROUP_PARTITIONED_OR),
	EOpSubgroupPartitionedXor(Main.E_OP_SUBGROUP_PARTITIONED_XOR),
	EOpSubgroupPartitionedInclusiveAdd(Main.E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_ADD),
	EOpSubgroupPartitionedInclusiveMul(Main.E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_MUL),
	EOpSubgroupPartitionedInclusiveMin(Main.E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_MIN),
	EOpSubgroupPartitionedInclusiveMax(Main.E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_MAX),
	EOpSubgroupPartitionedInclusiveAnd(Main.E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_AND),
	EOpSubgroupPartitionedInclusiveOr(Main.E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_OR),
	EOpSubgroupPartitionedInclusiveXor(Main.E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_XOR),
	EOpSubgroupPartitionedExclusiveAdd(Main.E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_ADD),
	EOpSubgroupPartitionedExclusiveMul(Main.E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_MUL),
	EOpSubgroupPartitionedExclusiveMin(Main.E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_MIN),
	EOpSubgroupPartitionedExclusiveMax(Main.E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_MAX),
	EOpSubgroupPartitionedExclusiveAnd(Main.E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_AND),
	EOpSubgroupPartitionedExclusiveOr(Main.E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_OR),
	EOpSubgroupPartitionedExclusiveXor(Main.E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_XOR),
	EOpSubgroupGuardStop(Main.E_OP_SUBGROUP_GUARD_STOP),
	EOpMinInvocations(Main.E_OP_MIN_INVOCATIONS),
	EOpMaxInvocations(Main.E_OP_MAX_INVOCATIONS),
	EOpAddInvocations(Main.E_OP_ADD_INVOCATIONS),
	EOpMinInvocationsNonUniform(Main.E_OP_MIN_INVOCATIONS_NON_UNIFORM),
	EOpMaxInvocationsNonUniform(Main.E_OP_MAX_INVOCATIONS_NON_UNIFORM),
	EOpAddInvocationsNonUniform(Main.E_OP_ADD_INVOCATIONS_NON_UNIFORM),
	EOpMinInvocationsInclusiveScan(Main.E_OP_MIN_INVOCATIONS_INCLUSIVE_SCAN),
	EOpMaxInvocationsInclusiveScan(Main.E_OP_MAX_INVOCATIONS_INCLUSIVE_SCAN),
	EOpAddInvocationsInclusiveScan(Main.E_OP_ADD_INVOCATIONS_INCLUSIVE_SCAN),
	EOpMinInvocationsInclusiveScanNonUniform(Main.E_OP_MIN_INVOCATIONS_INCLUSIVE_SCAN_NON_UNIFORM),
	EOpMaxInvocationsInclusiveScanNonUniform(Main.E_OP_MAX_INVOCATIONS_INCLUSIVE_SCAN_NON_UNIFORM),
	EOpAddInvocationsInclusiveScanNonUniform(Main.E_OP_ADD_INVOCATIONS_INCLUSIVE_SCAN_NON_UNIFORM),
	EOpMinInvocationsExclusiveScan(Main.E_OP_MIN_INVOCATIONS_EXCLUSIVE_SCAN),
	EOpMaxInvocationsExclusiveScan(Main.E_OP_MAX_INVOCATIONS_EXCLUSIVE_SCAN),
	EOpAddInvocationsExclusiveScan(Main.E_OP_ADD_INVOCATIONS_EXCLUSIVE_SCAN),
	EOpMinInvocationsExclusiveScanNonUniform(Main.E_OP_MIN_INVOCATIONS_EXCLUSIVE_SCAN_NON_UNIFORM),
	EOpMaxInvocationsExclusiveScanNonUniform(Main.E_OP_MAX_INVOCATIONS_EXCLUSIVE_SCAN_NON_UNIFORM),
	EOpAddInvocationsExclusiveScanNonUniform(Main.E_OP_ADD_INVOCATIONS_EXCLUSIVE_SCAN_NON_UNIFORM),
	EOpSwizzleInvocations(Main.E_OP_SWIZZLE_INVOCATIONS),
	EOpSwizzleInvocationsMasked(Main.E_OP_SWIZZLE_INVOCATIONS_MASKED),
	EOpWriteInvocation(Main.E_OP_WRITE_INVOCATION),
	EOpMbcnt(Main.E_OP_MBCNT),
	EOpCubeFaceIndex(Main.E_OP_CUBE_FACE_INDEX),
	EOpCubeFaceCoord(Main.E_OP_CUBE_FACE_COORD),
	EOpTime(Main.E_OP_TIME),
	EOpAtomicAdd(Main.E_OP_ATOMIC_ADD),
	EOpAtomicMin(Main.E_OP_ATOMIC_MIN),
	EOpAtomicMax(Main.E_OP_ATOMIC_MAX),
	EOpAtomicAnd(Main.E_OP_ATOMIC_AND),
	EOpAtomicOr(Main.E_OP_ATOMIC_OR),
	EOpAtomicXor(Main.E_OP_ATOMIC_XOR),
	EOpAtomicExchange(Main.E_OP_ATOMIC_EXCHANGE),
	EOpAtomicCompSwap(Main.E_OP_ATOMIC_COMP_SWAP),
	EOpAtomicLoad(Main.E_OP_ATOMIC_LOAD),
	EOpAtomicStore(Main.E_OP_ATOMIC_STORE),
	EOpAtomicCounterIncrement(Main.E_OP_ATOMIC_COUNTER_INCREMENT),
	EOpAtomicCounterDecrement(Main.E_OP_ATOMIC_COUNTER_DECREMENT),
	EOpAtomicCounter(Main.E_OP_ATOMIC_COUNTER),
	EOpAtomicCounterAdd(Main.E_OP_ATOMIC_COUNTER_ADD),
	EOpAtomicCounterSubtract(Main.E_OP_ATOMIC_COUNTER_SUBTRACT),
	EOpAtomicCounterMin(Main.E_OP_ATOMIC_COUNTER_MIN),
	EOpAtomicCounterMax(Main.E_OP_ATOMIC_COUNTER_MAX),
	EOpAtomicCounterAnd(Main.E_OP_ATOMIC_COUNTER_AND),
	EOpAtomicCounterOr(Main.E_OP_ATOMIC_COUNTER_OR),
	EOpAtomicCounterXor(Main.E_OP_ATOMIC_COUNTER_XOR),
	EOpAtomicCounterExchange(Main.E_OP_ATOMIC_COUNTER_EXCHANGE),
	EOpAtomicCounterCompSwap(Main.E_OP_ATOMIC_COUNTER_COMP_SWAP),
	EOpAny(Main.E_OP_ANY),
	EOpAll(Main.E_OP_ALL),
	EOpCooperativeMatrixLoad(Main.E_OP_COOPERATIVE_MATRIX_LOAD),
	EOpCooperativeMatrixStore(Main.E_OP_COOPERATIVE_MATRIX_STORE),
	EOpCooperativeMatrixMulAdd(Main.E_OP_COOPERATIVE_MATRIX_MUL_ADD),
	EOpBeginInvocationInterlock(Main.E_OP_BEGIN_INVOCATION_INTERLOCK),
	EOpEndInvocationInterlock(Main.E_OP_END_INVOCATION_INTERLOCK),
	EOpIsHelperInvocation(Main.E_OP_IS_HELPER_INVOCATION),
	EOpDebugPrintf(Main.E_OP_DEBUG_PRINTF),
	EOpKill(Main.E_OP_KILL),
	EOpReturn(Main.E_OP_RETURN),
	EOpBreak(Main.E_OP_BREAK),
	EOpContinue(Main.E_OP_CONTINUE),
	EOpCase(Main.E_OP_CASE),
	EOpDefault(Main.E_OP_DEFAULT),
	EOpDemote(Main.E_OP_DEMOTE),
	EOpConstructGuardStart(Main.E_OP_CONSTRUCT_GUARD_START),
	EOpConstructInt(Main.E_OP_CONSTRUCT_INT),
	EOpConstructUint(Main.E_OP_CONSTRUCT_UINT),
	EOpConstructInt8(Main.E_OP_CONSTRUCT_INT8),
	EOpConstructUint8(Main.E_OP_CONSTRUCT_UINT8),
	EOpConstructInt16(Main.E_OP_CONSTRUCT_INT16),
	EOpConstructUint16(Main.E_OP_CONSTRUCT_UINT16),
	EOpConstructInt64(Main.E_OP_CONSTRUCT_INT64),
	EOpConstructUint64(Main.E_OP_CONSTRUCT_UINT64),
	EOpConstructBool(Main.E_OP_CONSTRUCT_BOOL),
	EOpConstructFloat(Main.E_OP_CONSTRUCT_FLOAT),
	EOpConstructDouble(Main.E_OP_CONSTRUCT_DOUBLE),
	EOpConstructVec2(Main.E_OP_CONSTRUCT_VEC2),
	EOpConstructVec3(Main.E_OP_CONSTRUCT_VEC3),
	EOpConstructVec4(Main.E_OP_CONSTRUCT_VEC4),
	EOpConstructMat2x2(Main.E_OP_CONSTRUCT_MAT2X2),
	EOpConstructMat2x3(Main.E_OP_CONSTRUCT_MAT2X3),
	EOpConstructMat2x4(Main.E_OP_CONSTRUCT_MAT2X4),
	EOpConstructMat3x2(Main.E_OP_CONSTRUCT_MAT3X2),
	EOpConstructMat3x3(Main.E_OP_CONSTRUCT_MAT3X3),
	EOpConstructMat3x4(Main.E_OP_Construct_Mat3x4),
	EOpConstructMat4x2(Main.E_OP_CONSTRUCT_MAT4X2),
	EOpConstructMat4x3(Main.E_OP_CONSTRUCT_MAT4X3),
	EOpConstructMat4x4(Main.E_OP_CONSTRUCT_MAT4X4),
	EOpConstructDVec2(Main.E_OP_CONSTRUCT_DVEC2),
	EOpConstructDVec3(Main.E_OP_CONSTRUCT_DVEC3),
	EOpConstructDVec4(Main.E_OP_CONSTRUCT_DVEC4),
	EOpConstructBVec2(Main.E_OP_CONSTRUCT_BVEC2),
	EOpConstructBVec3(Main.E_OP_CONSTRUCT_BVEC3),
	EOpConstructBVec4(Main.E_OP_CONSTRUCT_BVEC4),
	EOpConstructI8Vec2(Main.E_OP_CONSTRUCT_I8_VEC2),
	EOpConstructI8Vec3(Main.E_OP_CONSTRUCT_I8_VEC3),
	EOpConstructI8Vec4(Main.E_OP_CONSTRUCT_I8_VEC4),
	EOpConstructU8Vec2(Main.E_OP_CONSTRUCT_U8_VEC2),
	EOpConstructU8Vec3(Main.E_OP_CONSTRUCT_U8_VEC3),
	EOpConstructU8Vec4(Main.E_OP_CONSTRUCT_U8_VEC4),
	EOpConstructI16Vec2(Main.E_OP_CONSTRUCT_I16_VEC2),
	EOpConstructI16Vec3(Main.E_OP_CONSTRUCT_I16_VEC3),
	EOpConstructI16Vec4(Main.E_OP_CONSTRUCT_I16_VEC4),
	EOpConstructU16Vec2(Main.E_OP_CONSTRUCT_U16_VEC2),
	EOpConstructU16Vec3(Main.E_OP_CONSTRUCT_U16_VEC3),
	EOpConstructU16Vec4(Main.E_OP_CONSTRUCT_U16_VEC4),
	EOpConstructIVec2(Main.E_OP_CONSTRUCT_IVEC2),
	EOpConstructIVec3(Main.E_OP_CONSTRUCT_IVEC3),
	EOpConstructIVec4(Main.E_OP_CONSTRUCT_IVEC4),
	EOpConstructUVec2(Main.E_OP_CONSTRUCT_UVEC2),
	EOpConstructUVec3(Main.E_OP_CONSTRUCT_UVEC3),
	EOpConstructUVec4(Main.E_OP_CONSTRUCT_UVEC4),
	EOpConstructI64Vec2(Main.E_OP_CONSTRUCT_I64_VEC2),
	EOpConstructI64Vec3(Main.E_OP_CONSTRUCT_I64_VEC3),
	EOpConstructI64Vec4(Main.E_OP_CONSTRUCT_I64_VEC4),
	EOpConstructU64Vec2(Main.E_OP_CONSTRUCT_U64_VEC2),
	EOpConstructU64Vec3(Main.E_OP_CONSTRUCT_U64_VEC3),
	EOpConstructU64Vec4(Main.E_OP_CONSTRUCT_U64_VEC4),
	EOpConstructDMat2x2(Main.E_OP_CONSTRUCT_DMAT2X2),
	EOpConstructDMat2x3(Main.E_OP_CONSTRUCT_DMAT2X3),
	EOpConstructDMat2x4(Main.E_OP_CONSTRUCT_DMAT2X4),
	EOpConstructDMat3x2(Main.E_OP_CONSTRUCT_DMAT3X2),
	EOpConstructDMat3x3(Main.E_OP_CONSTRUCT_DMAT3X3),
	EOpConstructDMat3x4(Main.E_OP_CONSTRUCT_DMAT3X4),
	EOpConstructDMat4x2(Main.E_OP_CONSTRUCT_DMAT4X2),
	EOpConstructDMat4x3(Main.E_OP_CONSTRUCT_DMAT4X3),
	EOpConstructDMat4x4(Main.E_OP_CONSTRUCT_DMAT4X4),
	EOpConstructIMat2x2(Main.E_OP_CONSTRUCT_IMAT2X2),
	EOpConstructIMat2x3(Main.E_OP_CONSTRUCT_IMAT2X3),
	EOpConstructIMat2x4(Main.E_OP_CONSTRUCT_IMAT2X4),
	EOpConstructIMat3x2(Main.E_OP_CONSTRUCT_IMAT3X2),
	EOpConstructIMat3x3(Main.E_OP_CONSTRUCT_IMAT3X3),
	EOpConstructIMat3x4(Main.E_OP_CONSTRUCT_IMAT3X4),
	EOpConstructIMat4x2(Main.E_OP_CONSTRUCT_IMAT4X2),
	EOpConstructIMat4x3(Main.E_OP_CONSTRUCT_IMAT4X3),
	EOpConstructIMat4x4(Main.E_OP_CONSTRUCT_IMAT4X4),
	EOpConstructUMat2x2(Main.E_OP_CONSTRUCT_UMAT2X2),
	EOpConstructUMat2x3(Main.E_OP_CONSTRUCT_UMAT2X3),
	EOpConstructUMat2x4(Main.E_OP_CONSTRUCT_UMAT2X4),
	EOpConstructUMat3x2(Main.E_OP_CONSTRUCT_UMAT3X2),
	EOpConstructUMat3x3(Main.E_OP_CONSTRUCT_UMAT3X3),
	EOpConstructUMat3x4(Main.E_OP_CONSTRUCT_UMAT3X4),
	EOpConstructUMat4x2(Main.E_OP_CONSTRUCT_UMAT4X2),
	EOpConstructUMat4x3(Main.E_OP_CONSTRUCT_UMAT4X3),
	EOpConstructUMat4x4(Main.E_OP_CONSTRUCT_UMAT4X4),
	EOpConstructBMat2x2(Main.E_OP_CONSTRUCT_BMAT2X2),
	EOpConstructBMat2x3(Main.E_OP_CONSTRUCT_BMAT2X3),
	EOpConstructBMat2x4(Main.E_OP_CONSTRUCT_BMAT2X4),
	EOpConstructBMat3x2(Main.E_OP_CONSTRUCT_BMAT3X2),
	EOpConstructBMat3x3(Main.E_OP_CONSTRUCT_BMAT3X3),
	EOpConstructBMat3x4(Main.E_OP_CONSTRUCT_BMAT3X4),
	EOpConstructBMat4x2(Main.E_OP_CONSTRUCT_BMAT4X2),
	EOpConstructBMat4x3(Main.E_OP_CONSTRUCT_BMAT4X3),
	EOpConstructBMat4x4(Main.E_OP_CONSTRUCT_BMAT4X4),
	EOpConstructFloat16(Main.E_OP_CONSTRUCT_FLOAT16),
	EOpConstructF16Vec2(Main.E_OP_CONSTRUCT_F16_VEC2),
	EOpConstructF16Vec3(Main.E_OP_CONSTRUCT_F16_VEC3),
	EOpConstructF16Vec4(Main.E_OP_CONSTRUCT_F16_VEC4),
	EOpConstructF16Mat2x2(Main.E_OP_CONSTRUCT_F16_MAT2X2),
	EOpConstructF16Mat2x3(Main.E_OP_CONSTRUCT_F16_MAT2X3),
	EOpConstructF16Mat2x4(Main.E_OP_CONSTRUCT_F16_MAT2X4),
	EOpConstructF16Mat3x2(Main.E_OP_CONSTRUCT_F16_MAT3X2),
	EOpConstructF16Mat3x3(Main.E_OP_CONSTRUCT_F16_MAT3X3),
	EOpConstructF16Mat3x4(Main.E_OP_CONSTRUCT_F16_MAT3X4),
	EOpConstructF16Mat4x2(Main.E_OP_CONSTRUCT_F16_MAT4X2),
	EOpConstructF16Mat4x3(Main.E_OP_CONSTRUCT_F16_MAT4X3),
	EOpConstructF16Mat4x4(Main.E_OP_CONSTRUCT_F16_MAT4X4),
	EOpConstructStruct(Main.E_OP_CONSTRUCT_STRUCT),
	EOpConstructTextureSampler(Main.E_OP_CONSTRUCT_TEXTURE_SAMPLER),
	EOpConstructNonuniform(Main.E_OP_CONSTRUCT_NONUNIFORM),
	EOpConstructReference(Main.E_OP_CONSTRUCT_REFERENCE),
	EOpConstructCooperativeMatrix(Main.E_OP_CONSTRUCT_COOPERATIVE_MATRIX),
	EOpConstructGuardEnd(Main.E_OP_CONSTRUCT_GUARD_END),
	EOpAssign(Main.E_OP_ASSIGN),
	EOpAddAssign(Main.E_OP_ADD_ASSIGN),
	EOpSubAssign(Main.E_OP_SUB_ASSIGN),
	EOpMulAssign(Main.E_OP_MUL_ASSIGN),
	EOpVectorTimesMatrixAssign(Main.E_OP_VECTOR_TIMES_MATRIX_ASSIGN),
	EOpVectorTimesScalarAssign(Main.E_OP_VECTOR_TIMES_SCALAR_ASSIGN),
	EOpMatrixTimesScalarAssign(Main.E_OP_MATRIX_TIMES_SCALAR_ASSIGN),
	EOpMatrixTimesMatrixAssign(Main.E_OP_MATRIX_TIMES_MATRIX_ASSIGN),
	EOpDivAssign(Main.E_OP_DIV_ASSIGN),
	EOpModAssign(Main.E_OP_MOD_ASSIGN),
	EOpAndAssign(Main.E_OP_AND_ASSIGN),
	EOpInclusiveOrAssign(Main.E_OP_INCLUSIVE_OR_ASSIGN),
	EOpExclusiveOrAssign(Main.E_OP_EXCLUSIVE_OR_ASSIGN),
	EOpLeftShiftAssign(Main.E_OP_LEFT_SHIFT_ASSIGN),
	EOpRightShiftAssign(Main.E_OP_RIGHT_SHIFT_ASSIGN),
	EOpArrayLength(Main.E_OP_ARRAY_LENGTH),
	EOpImageGuardBegin(Main.E_OP_IMAGE_GUARD_BEGIN),
	EOpImageQuerySize(Main.E_OP_IMAGE_QUERY_SIZE),
	EOpImageQuerySamples(Main.E_OP_IMAGE_QUERY_SAMPLES),
	EOpImageLoad(Main.E_OP_IMAGE_LOAD),
	EOpImageStore(Main.E_OP_IMAGE_STORE),
	EOpImageLoadLod(Main.E_OP_IMAGE_LOAD_LOD),
	EOpImageStoreLod(Main.E_OP_IMAGE_STORE_LOD),
	EOpImageAtomicAdd(Main.E_OP_IMAGE_ATOMIC_ADD),
	EOpImageAtomicMin(Main.E_OP_IMAGE_ATOMIC_MIN),
	EOpImageAtomicMax(Main.E_OP_IMAGE_ATOMIC_MAX),
	EOpImageAtomicAnd(Main.E_OP_IMAGE_ATOMIC_AND),
	EOpImageAtomicOr(Main.E_OP_IMAGE_ATOMIC_OR),
	EOpImageAtomicXor(Main.E_OP_IMAGE_ATOMIC_XOR),
	EOpImageAtomicExchange(Main.E_OP_IMAGE_ATOMIC_EXCHANGE),
	EOpImageAtomicCompSwap(Main.E_OP_IMAGE_ATOMIC_COMP_SWAP),
	EOpImageAtomicLoad(Main.E_OP_IMAGE_ATOMIC_LOAD),
	EOpImageAtomicStore(Main.E_OP_IMAGE_ATOMIC_STORE),
	EOpSubpassLoad(Main.E_OP_SUBPASS_LOAD),
	EOpSubpassLoadMS(Main.E_OP_SUBPASS_LOAD_MS),
	EOpSparseImageLoad(Main.E_OP_SPARSE_IMAGE_LOAD),
	EOpSparseImageLoadLod(Main.E_OP_SPARSE_IMAGE_LOAD_LOD),
	EOpImageGuardEnd(Main.E_OP_IMAGE_GUARD_END),
	EOpTextureGuardBegin(Main.E_OP_TEXTURE_GUARD_BEGIN),
	EOpTextureQuerySize(Main.E_OP_TEXTURE_QUERY_SIZE),
	EOpTextureQueryLod(Main.E_OP_TEXTURE_QUERY_LOD),
	EOpTextureQueryLevels(Main.E_OP_TEXTURE_QUERY_LEVELS),
	EOpTextureQuerySamples(Main.E_OP_TEXTURE_QUERY_SAMPLES),
	EOpSamplingGuardBegin(Main.E_OP_SAMPLING_GUARD_BEGIN),
	EOpTexture(Main.E_OP_TEXTURE),
	EOpTextureProj(Main.E_OP_TEXTURE_PROJ),
	EOpTextureLod(Main.E_OP_TEXTURE_LOD),
	EOpTextureOffset(Main.E_OP_TEXTURE_OFFSET),
	EOpTextureFetch(Main.E_OP_TEXTURE_FETCH),
	EOpTextureFetchOffset(Main.E_OP_TEXTURE_FETCH_OFFSET),
	EOpTextureProjOffset(Main.E_OP_TEXTURE_PROJ_OFFSET),
	EOpTextureLodOffset(Main.E_OP_TEXTURE_LOD_OFFSET),
	EOpTextureProjLod(Main.E_OP_TEXTURE_PROJ_LOD),
	EOpTextureProjLodOffset(Main.E_OP_TEXTURE_PROJ_LOD_OFFSET),
	EOpTextureGrad(Main.E_OP_TEXTURE_GRAD),
	EOpTextureGradOffset(Main.E_OP_TEXTURE_GRAD_OFFSET),
	EOpTextureProjGrad(Main.E_OP_TEXTURE_PROJ_GRAD),
	EOpTextureProjGradOffset(Main.E_OP_TEXTURE_PROJ_GRAD_OFFSET),
	EOpTextureGather(Main.E_OP_TEXTURE_GATHER),
	EOpTextureGatherOffset(Main.E_OP_TEXTURE_GATHER_OFFSET),
	EOpTextureGatherOffsets(Main.E_OP_TEXTURE_GATHER_OFFSETS),
	EOpTextureClamp(Main.E_OP_TEXTURE_CLAMP),
	EOpTextureOffsetClamp(Main.E_OP_TEXTURE_OFFSET_CLAMP),
	EOpTextureGradClamp(Main.E_OP_TEXTURE_GRAD_CLAMP),
	EOpTextureGradOffsetClamp(Main.E_OP_TEXTURE_GRAD_OFFSET_CLAMP),
	EOpTextureGatherLod(Main.E_OP_TEXTURE_GATHER_LOD),
	EOpTextureGatherLodOffset(Main.E_OP_TEXTURE_GATHER_LOD_OFFSET),
	EOpTextureGatherLodOffsets(Main.E_OP_TEXTURE_GATHER_LOD_OFFSETS),
	EOpFragmentMaskFetch(Main.E_OP_FRAGMENT_MASK_FETCH),
	EOpFragmentFetch(Main.E_OP_FRAGMENT_FETCH),
	EOpSparseTextureGuardBegin(Main.E_OP_SPARSE_TEXTURE_GUARD_BEGIN),
	EOpSparseTexture(Main.E_OP_SPARSE_TEXTURE),
	EOpSparseTextureLod(Main.E_OP_SPARSE_TEXTURE_LOD),
	EOpSparseTextureOffset(Main.E_OP_SPARSE_TEXTURE_OFFSET),
	EOpSparseTextureFetch(Main.E_OP_SPARSE_TEXTURE_FETCH),
	EOpSparseTextureFetchOffset(Main.E_OP_SPARSE_TEXTURE_FETCH_OFFSET),
	EOpSparseTextureLodOffset(Main.E_OP_SPARSE_TEXTURE_LOD_OFFSET),
	EOpSparseTextureGrad(Main.E_OP_SPARSE_TEXTURE_GRAD),
	EOpSparseTextureGradOffset(Main.E_OP_SPARSE_TEXTURE_GRAD_OFFSET),
	EOpSparseTextureGather(Main.E_OP_SPARSE_TEXTURE_GATHER),
	EOpSparseTextureGatherOffset(Main.E_OP_SPARSE_TEXTURE_GATHER_OFFSET),
	EOpSparseTextureGatherOffsets(Main.E_OP_SPARSE_TEXTURE_GATHER_OFFSETS),
	EOpSparseTexelsResident(Main.E_OP_SPARSE_TEXELS_RESIDENT),
	EOpSparseTextureClamp(Main.E_OP_SPARSE_TEXTURE_CLAMP),
	EOpSparseTextureOffsetClamp(Main.E_OP_SPARSE_TEXTURE_OFFSET_CLAMP),
	EOpSparseTextureGradClamp(Main.E_OP_SPARSE_TEXTURE_GRAD_CLAMP),
	EOpSparseTextureGradOffsetClamp(Main.E_OP_SPARSE_TEXTURE_GRAD_OFFSET_CLAMP),
	EOpSparseTextureGatherLod(Main.E_OP_SPARSE_TEXTURE_GATHER_LOD),
	EOpSparseTextureGatherLodOffset(Main.E_OP_SPARSE_TEXTURE_GATHER_LOD_OFFSET),
	EOpSparseTextureGatherLodOffsets(Main.E_OP_SPARSE_TEXTURE_GATHER_LOD_OFFSETS),
	EOpSparseTextureGuardEnd(Main.E_OP_SPARSE_TEXTURE_GUARD_END),
	EOpImageFootprintGuardBegin(Main.E_OP_IMAGE_FOOTPRINT_GUARD_BEGIN),
	EOpImageSampleFootprintNV(Main.E_OP_IMAGE_SAMPLE_FOOTPRINT_NV),
	EOpImageSampleFootprintClampNV(Main.E_OP_IMAGE_SAMPLE_FOOTPRINT_CLAMP_NV),
	EOpImageSampleFootprintLodNV(Main.E_OP_IMAGE_SAMPLE_FOOTPRINT_LOD_NV),
	EOpImageSampleFootprintGradNV(Main.E_OP_IMAGE_SAMPLE_FOOTPRINT_GRAD_NV),
	EOpImageSampleFootprintGradClampNV(Main.E_OP_IMAGE_SAMPLE_FOOTPRINT_GRAD_CLAMP_NV),
	EOpImageFootprintGuardEnd(Main.E_OP_IMAGE_FOOTPRINT_GUARD_END),
	EOpSamplingGuardEnd(Main.E_OP_SAMPLING_GUARD_END),
	EOpTextureGuardEnd(Main.E_OP_TEXTURE_GUARD_END),
	EOpAddCarry(Main.E_OP_ADD_CARRY),
	EOpSubBorrow(Main.E_OP_SUB_BORROW),
	EOpUMulExtended(Main.E_OP_UMULEXTENDED),
	EOpIMulExtended(Main.E_OP_IMULEXTENDED),
	EOpBitfieldExtract(Main.E_OP_BITFIELD_EXTRACT),
	EOpBitfieldInsert(Main.E_OP_BITFIELD_INSERT),
	EOpBitFieldReverse(Main.E_OP_BIT_FIELD_REVERSE),
	EOpBitCount(Main.E_OP_BIT_COUNT),
	EOpFindLSB(Main.E_OP_FIND_LSB),
	EOpFindMSB(Main.E_OP_FIND_MSB),
	EOpCountLeadingZeros(Main.E_OP_COUNT_LEADING_ZEROS),
	EOpCountTrailingZeros(Main.E_OP_COUNT_TRAILING_ZEROS),
	EOpAbsDifference(Main.E_OP_ABS_DIFFERENCE),
	EOpAddSaturate(Main.E_OP_ADD_SATURATE),
	EOpSubSaturate(Main.E_OP_SUB_SATURATE),
	EOpAverage(Main.E_OP_AVERAGE),
	EOpAverageRounded(Main.E_OP_AVERAGE_ROUNDED),
	EOpMul32x16(Main.E_OP_MUL32X16),
	EOpTrace(Main.E_OP_TRACE),
	EOpReportIntersection(Main.E_OP_REPORT_INTERSECTION),
	EOpIgnoreIntersection(Main.E_OP_IGNORE_INTERSECTION),
	EOpTerminateRay(Main.E_OP_TERMINATE_RAY),
	EOpExecuteCallable(Main.E_OP_EXECUTE_CALLABLE),
	EOpWritePackedPrimitiveIndices4x8NV(Main.E_OP_WRITE_PACKED_PRIMITIVE_INDICES4X8_NV),
	EOpRayQueryInitialize(Main.E_OP_RAY_QUERY_INITIALIZE),
	EOpRayQueryTerminate(Main.E_OP_RAY_QUERY_TERMINATE),
	EOpRayQueryGenerateIntersection(Main.E_OP_RAY_QUERY_GENERATE_INTERSECTION),
	EOpRayQueryConfirmIntersection(Main.E_OP_RAY_QUERY_CONFIRM_INTERSECTION),
	EOpRayQueryProceed(Main.E_OP_RAY_QUERY_PROCEED),
	EOpRayQueryGetIntersectionType(Main.E_OP_RAY_QUERY_GET_INTERSECTION_TYPE),
	EOpRayQueryGetRayTMin(Main.E_OP_RAY_QUERY_GET_RAY_TMIN),
	EOpRayQueryGetRayFlags(Main.E_OP_RAY_QUERY_GET_RAY_FLAGS),
	EOpRayQueryGetIntersectionT(Main.E_OP_RAY_QUERY_GET_INTERSECTIONT),
	EOpRayQueryGetIntersectionInstanceCustomIndex(Main.E_OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_CUSTOM_INDEX),
	EOpRayQueryGetIntersectionInstanceId(Main.E_OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_ID),
	EOpRayQueryGetIntersectionInstanceShaderBindingTableRecordOffset(
			Main.E_OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_SHADER_BINDING_TABLE_RECORD_OFFSET),
	EOpRayQueryGetIntersectionGeometryIndex(Main.E_OP_RAY_QUERY_GET_INTERSECTION_GEOMETRY_INDEX),
	EOpRayQueryGetIntersectionPrimitiveIndex(Main.E_OP_RAY_QUERY_GET_INTERSECTION_PRIMITIVE_INDEX),
	EOpRayQueryGetIntersectionBarycentrics(Main.E_OP_RAY_QUERY_GET_INTERSECTION_BARYCENTRICS),
	EOpRayQueryGetIntersectionFrontFace(Main.E_OP_RAY_QUERY_GET_INTERSECTION_FRONT_FACE),
	EOpRayQueryGetIntersectionCandidateAABBOpaque(Main.E_OP_RAY_QUERY_GET_INTERSECTION_CANDIDATE_AABBOPAQUE),
	EOpRayQueryGetIntersectionObjectRayDirection(Main.E_OP_RAY_QUERY_GET_INTERSECTION_OBJECT_RAY_DIRECTION),
	EOpRayQueryGetIntersectionObjectRayOrigin(Main.E_OP_RAY_QUERY_GET_INTERSECTION_OBJECT_RAY_ORIGIN),
	EOpRayQueryGetWorldRayDirection(Main.E_OP_RAY_QUERY_GET_WORLD_RAY_DIRECTION),
	EOpRayQueryGetWorldRayOrigin(Main.E_OP_RAY_QUERY_GET_WORLD_RAY_ORIGIN),
	EOpRayQueryGetIntersectionObjectToWorld(Main.E_OP_RAY_QUERY_GET_INTERSECTION_OBJECT_TO_WORLD),
	EOpRayQueryGetIntersectionWorldToObject(Main.E_OP_RAY_QUERY_GET_INTERSECTION_WORLD_TO_OBJECT),
	EOpClip(Main.E_OP_CLIP),
	EOpIsFinite(Main.E_OP_IS_FINITE),
	EOpLog10(Main.E_OP_LOG10),
	EOpRcp(Main.E_OP_RCP),
	EOpSaturate(Main.E_OP_SATURATE),
	EOpSinCos(Main.E_OP_SIN_COS),
	EOpGenMul(Main.E_OP_GEN_MUL),
	EOpDst(Main.E_OP_DST),
	EOpInterlockedAdd(Main.E_OP_INTERLOCKED_ADD),
	EOpInterlockedAnd(Main.E_OP_INTERLOCKED_AND),
	EOpInterlockedCompareExchange(Main.E_OP_INTERLOCKED_COMPARE_EXCHANGE),
	EOpInterlockedCompareStore(Main.E_OP_INTERLOCKED_COMPARE_STORE),
	EOpInterlockedExchange(Main.E_OP_INTERLOCKED_EXCHANGE),
	EOpInterlockedMax(Main.E_OP_INTERLOCKED_MAX),
	EOpInterlockedMin(Main.E_OP_INTERLOCKED_MIN),
	EOpInterlockedOr(Main.E_OP_INTERLOCKED_OR),
	EOpInterlockedXor(Main.E_OP_INTERLOCKED_XOR),
	EOpAllMemoryBarrierWithGroupSync(Main.E_OP_ALL_MEMORY_BARRIER_WITH_GROUP_SYNC),
	EOpDeviceMemoryBarrier(Main.E_OP_DEVICE_MEMORY_BARRIER),
	EOpDeviceMemoryBarrierWithGroupSync(Main.E_OP_DEVICE_MEMORY_BARRIER_WITH_GROUP_SYNC),
	EOpWorkgroupMemoryBarrier(Main.E_OP_WORKGROUP_MEMORY_BARRIER),
	EOpWorkgroupMemoryBarrierWithGroupSync(Main.E_OP_WORKGROUP_MEMORY_BARRIER_WITH_GROUP_SYNC),
	EOpEvaluateAttributeSnapped(Main.E_OP_EVALUATE_ATTRIBUTE_SNAPPED),
	EOpF32tof16(Main.E_OP_F32TOF16),
	EOpF16tof32(Main.E_OP_F16TOF32),
	EOpLit(Main.E_OP_LIT),
	EOpTextureBias(Main.E_OP_TEXTURE_BIAS),
	EOpAsDouble(Main.E_OP_AS_DOUBLE),
	EOpD3DCOLORtoUBYTE4(Main.E_OP_D3D_COLOR_TO_UBYTE4),
	EOpMethodSample(Main.E_OP_METHOD_SAMPLE),
	EOpMethodSampleBias(Main.E_OP_METHOD_SAMPLE_BIAS),
	EOpMethodSampleCmp(Main.E_OP_METHOD_SAMPLE_CMP),
	EOpMethodSampleCmpLevelZero(Main.E_OP_METHOD_SAMPLE_CMP_LEVEL_ZERO),
	EOpMethodSampleGrad(Main.E_OP_METHOD_SAMPLE_GRAD),
	EOpMethodSampleLevel(Main.E_OP_METHOD_SAMPLE_LEVEL),
	EOpMethodLoad(Main.E_OP_METHOD_LOAD),
	EOpMethodGetDimensions(Main.E_OP_METHOD_GET_DIMENSIONS),
	EOpMethodGetSamplePosition(Main.E_OP_METHOD_GET_SAMPLE_POSITION),
	EOpMethodGather(Main.E_OP_METHOD_GATHER),
	EOpMethodCalculateLevelOfDetail(Main.E_OP_METHOD_CALCULATE_LEVEL_OF_DETAIL),
	EOpMethodCalculateLevelOfDetailUnclamped(Main.E_OP_METHOD_CALCULATE_LEVEL_OF_DETAIL_UNCLAMPED),
	EOpMethodLoad2(Main.E_OP_METHOD_LOAD2),
	EOpMethodLoad3(Main.E_OP_METHOD_LOAD3),
	EOpMethodLoad4(Main.E_OP_METHOD_LOAD4),
	EOpMethodStore(Main.E_OP_METHOD_STORE),
	EOpMethodStore2(Main.E_OP_METHOD_STORE2),
	EOpMethodStore3(Main.E_OP_METHOD_STORE3),
	EOpMethodStore4(Main.E_OP_METHOD_STORE4),
	EOpMethodIncrementCounter(Main.E_OP_METHOD_INCREMENT_COUNTER),
	EOpMethodDecrementCounter(Main.E_OP_METHOD_DECREMENT_COUNTER),
	EOpMethodConsume(Main.E_OP_METHOD_CONSUME),
	EOpMethodGatherRed(Main.E_OP_METHOD_GATHER_RED),
	EOpMethodGatherGreen(Main.E_OP_METHOD_GATHER_GREEN),
	EOpMethodGatherBlue(Main.E_OP_METHOD_GATHER_BLUE),
	EOpMethodGatherAlpha(Main.E_OP_METHOD_GATHER_ALPHA),
	EOpMethodGatherCmp(Main.E_OP_METHOD_GATHER_CMP),
	EOpMethodGatherCmpRed(Main.E_OP_METHOD_GATHER_CMP_RED),
	EOpMethodGatherCmpGreen(Main.E_OP_METHOD_GATHER_CMP_GREEN),
	EOpMethodGatherCmpBlue(Main.E_OP_METHOD_GATHER_CMP_BLUE),
	EOpMethodGatherCmpAlpha(Main.E_OP_METHOD_GATHER_CMP_ALPHA),
	EOpMethodAppend(Main.E_OP_METHOD_APPEND),
	EOpMethodRestartStrip(Main.E_OP_METHOD_RESTART_STRIP),
	EOpMatrixSwizzle(Main.E_OP_MATRIX_SWIZZLE),
	EOpWaveGetLaneCount(Main.E_OP_WAVE_GET_LANE_COUNT),
	EOpWaveGetLaneIndex(Main.E_OP_WAVE_GET_LANE_INDEX),
	EOpWaveActiveCountBits(Main.E_OP_WAVE_ACTIVE_COUNT_BITS),
	EOpWavePrefixCountBits(Main.E_OP_WAVE_PREFIX_COUNT_BITS),
	EOpReadClockSubgroupKHR(Main.E_OP_READ_CLOCK_SUBGROUP_KHR),
	EOpReadClockDeviceKHR(Main.E_OP_READ_CLOCK_DEVICE_KHR);

	private final int value;

	private TOperator(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TOperator valueByStr(String str) {
		switch (str) {
			case "EOpNull":
				return EOpNull;
			case "EOpSequence":
				return EOpSequence;
			case "EOpLinkerObjects":
				return EOpLinkerObjects;
			case "EOpFunctionCall":
				return EOpFunctionCall;
			case "EOpFunction":
				return EOpFunction;
			case "EOpParameters":
				return EOpParameters;
			case "EOpNegative":
				return EOpNegative;
			case "EOpLogicalNot":
				return EOpLogicalNot;
			case "EOpVectorLogicalNot":
				return EOpVectorLogicalNot;
			case "EOpBitwiseNot":
				return EOpBitwiseNot;
			case "EOpPostIncrement":
				return EOpPostIncrement;
			case "EOpPostDecrement":
				return EOpPostDecrement;
			case "EOpPreIncrement":
				return EOpPreIncrement;
			case "EOpPreDecrement":
				return EOpPreDecrement;
			case "EOpCopyObject":
				return EOpCopyObject;
			case "EOpConvInt8ToBool":
				return EOpConvInt8ToBool;
			case "EOpConvUint8ToBool":
				return EOpConvUint8ToBool;
			case "EOpConvInt16ToBool":
				return EOpConvInt16ToBool;
			case "EOpConvUint16ToBool":
				return EOpConvUint16ToBool;
			case "EOpConvIntToBool":
				return EOpConvIntToBool;
			case "EOpConvUintToBool":
				return EOpConvUintToBool;
			case "EOpConvInt64ToBool":
				return EOpConvInt64ToBool;
			case "EOpConvUint64ToBool":
				return EOpConvUint64ToBool;
			case "EOpConvFloat16ToBool":
				return EOpConvFloat16ToBool;
			case "EOpConvFloatToBool":
				return EOpConvFloatToBool;
			case "EOpConvDoubleToBool":
				return EOpConvDoubleToBool;
			case "EOpConvBoolToInt8":
				return EOpConvBoolToInt8;
			case "EOpConvBoolToUint8":
				return EOpConvBoolToUint8;
			case "EOpConvBoolToInt16":
				return EOpConvBoolToInt16;
			case "EOpConvBoolToUint16":
				return EOpConvBoolToUint16;
			case "EOpConvBoolToInt":
				return EOpConvBoolToInt;
			case "EOpConvBoolToUint":
				return EOpConvBoolToUint;
			case "EOpConvBoolToInt64":
				return EOpConvBoolToInt64;
			case "EOpConvBoolToUint64":
				return EOpConvBoolToUint64;
			case "EOpConvBoolToFloat16":
				return EOpConvBoolToFloat16;
			case "EOpConvBoolToFloat":
				return EOpConvBoolToFloat;
			case "EOpConvBoolToDouble":
				return EOpConvBoolToDouble;
			case "EOpConvInt8ToInt16":
				return EOpConvInt8ToInt16;
			case "EOpConvInt8ToInt":
				return EOpConvInt8ToInt;
			case "EOpConvInt8ToInt64":
				return EOpConvInt8ToInt64;
			case "EOpConvInt8ToUint8":
				return EOpConvInt8ToUint8;
			case "EOpConvInt8ToUint16":
				return EOpConvInt8ToUint16;
			case "EOpConvInt8ToUint":
				return EOpConvInt8ToUint;
			case "EOpConvInt8ToUint64":
				return EOpConvInt8ToUint64;
			case "EOpConvUint8ToInt8":
				return EOpConvUint8ToInt8;
			case "EOpConvUint8ToInt16":
				return EOpConvUint8ToInt16;
			case "EOpConvUint8ToInt":
				return EOpConvUint8ToInt;
			case "EOpConvUint8ToInt64":
				return EOpConvUint8ToInt64;
			case "EOpConvUint8ToUint16":
				return EOpConvUint8ToUint16;
			case "EOpConvUint8ToUint":
				return EOpConvUint8ToUint;
			case "EOpConvUint8ToUint64":
				return EOpConvUint8ToUint64;
			case "EOpConvInt8ToFloat16":
				return EOpConvInt8ToFloat16;
			case "EOpConvInt8ToFloat":
				return EOpConvInt8ToFloat;
			case "EOpConvInt8ToDouble":
				return EOpConvInt8ToDouble;
			case "EOpConvUint8ToFloat16":
				return EOpConvUint8ToFloat16;
			case "EOpConvUint8ToFloat":
				return EOpConvUint8ToFloat;
			case "EOpConvUint8ToDouble":
				return EOpConvUint8ToDouble;
			case "EOpConvInt16ToInt8":
				return EOpConvInt16ToInt8;
			case "EOpConvInt16ToInt":
				return EOpConvInt16ToInt;
			case "EOpConvInt16ToInt64":
				return EOpConvInt16ToInt64;
			case "EOpConvInt16ToUint8":
				return EOpConvInt16ToUint8;
			case "EOpConvInt16ToUint16":
				return EOpConvInt16ToUint16;
			case "EOpConvInt16ToUint":
				return EOpConvInt16ToUint;
			case "EOpConvInt16ToUint64":
				return EOpConvInt16ToUint64;
			case "EOpConvUint16ToInt8":
				return EOpConvUint16ToInt8;
			case "EOpConvUint16ToInt16":
				return EOpConvUint16ToInt16;
			case "EOpConvUint16ToInt":
				return EOpConvUint16ToInt;
			case "EOpConvUint16ToInt64":
				return EOpConvUint16ToInt64;
			case "EOpConvUint16ToUint8":
				return EOpConvUint16ToUint8;
			case "EOpConvUint16ToUint":
				return EOpConvUint16ToUint;
			case "EOpConvUint16ToUint64":
				return EOpConvUint16ToUint64;
			case "EOpConvInt16ToFloat16":
				return EOpConvInt16ToFloat16;
			case "EOpConvInt16ToFloat":
				return EOpConvInt16ToFloat;
			case "EOpConvInt16ToDouble":
				return EOpConvInt16ToDouble;
			case "EOpConvUint16ToFloat16":
				return EOpConvUint16ToFloat16;
			case "EOpConvUint16ToFloat":
				return EOpConvUint16ToFloat;
			case "EOpConvUint16ToDouble":
				return EOpConvUint16ToDouble;
			case "EOpConvIntToInt8":
				return EOpConvIntToInt8;
			case "EOpConvIntToInt16":
				return EOpConvIntToInt16;
			case "EOpConvIntToInt64":
				return EOpConvIntToInt64;
			case "EOpConvIntToUint8":
				return EOpConvIntToUint8;
			case "EOpConvIntToUint16":
				return EOpConvIntToUint16;
			case "EOpConvIntToUint":
				return EOpConvIntToUint;
			case "EOpConvIntToUint64":
				return EOpConvIntToUint64;
			case "EOpConvUintToInt8":
				return EOpConvUintToInt8;
			case "EOpConvUintToInt16":
				return EOpConvUintToInt16;
			case "EOpConvUintToInt":
				return EOpConvUintToInt;
			case "EOpConvUintToInt64":
				return EOpConvUintToInt64;
			case "EOpConvUintToUint8":
				return EOpConvUintToUint8;
			case "EOpConvUintToUint16":
				return EOpConvUintToUint16;
			case "EOpConvUintToUint64":
				return EOpConvUintToUint64;
			case "EOpConvIntToFloat16":
				return EOpConvIntToFloat16;
			case "EOpConvIntToFloat":
				return EOpConvIntToFloat;
			case "EOpConvIntToDouble":
				return EOpConvIntToDouble;
			case "EOpConvUintToFloat16":
				return EOpConvUintToFloat16;
			case "EOpConvUintToFloat":
				return EOpConvUintToFloat;
			case "EOpConvUintToDouble":
				return EOpConvUintToDouble;
			case "EOpConvInt64ToInt8":
				return EOpConvInt64ToInt8;
			case "EOpConvInt64ToInt16":
				return EOpConvInt64ToInt16;
			case "EOpConvInt64ToInt":
				return EOpConvInt64ToInt;
			case "EOpConvInt64ToUint8":
				return EOpConvInt64ToUint8;
			case "EOpConvInt64ToUint16":
				return EOpConvInt64ToUint16;
			case "EOpConvInt64ToUint":
				return EOpConvInt64ToUint;
			case "EOpConvInt64ToUint64":
				return EOpConvInt64ToUint64;
			case "EOpConvUint64ToInt8":
				return EOpConvUint64ToInt8;
			case "EOpConvUint64ToInt16":
				return EOpConvUint64ToInt16;
			case "EOpConvUint64ToInt":
				return EOpConvUint64ToInt;
			case "EOpConvUint64ToInt64":
				return EOpConvUint64ToInt64;
			case "EOpConvUint64ToUint8":
				return EOpConvUint64ToUint8;
			case "EOpConvUint64ToUint16":
				return EOpConvUint64ToUint16;
			case "EOpConvUint64ToUint":
				return EOpConvUint64ToUint;
			case "EOpConvInt64ToFloat16":
				return EOpConvInt64ToFloat16;
			case "EOpConvInt64ToFloat":
				return EOpConvInt64ToFloat;
			case "EOpConvInt64ToDouble":
				return EOpConvInt64ToDouble;
			case "EOpConvUint64ToFloat16":
				return EOpConvUint64ToFloat16;
			case "EOpConvUint64ToFloat":
				return EOpConvUint64ToFloat;
			case "EOpConvUint64ToDouble":
				return EOpConvUint64ToDouble;
			case "EOpConvFloat16ToInt8":
				return EOpConvFloat16ToInt8;
			case "EOpConvFloat16ToInt16":
				return EOpConvFloat16ToInt16;
			case "EOpConvFloat16ToInt":
				return EOpConvFloat16ToInt;
			case "EOpConvFloat16ToInt64":
				return EOpConvFloat16ToInt64;
			case "EOpConvFloat16ToUint8":
				return EOpConvFloat16ToUint8;
			case "EOpConvFloat16ToUint16":
				return EOpConvFloat16ToUint16;
			case "EOpConvFloat16ToUint":
				return EOpConvFloat16ToUint;
			case "EOpConvFloat16ToUint64":
				return EOpConvFloat16ToUint64;
			case "EOpConvFloat16ToFloat":
				return EOpConvFloat16ToFloat;
			case "EOpConvFloat16ToDouble":
				return EOpConvFloat16ToDouble;
			case "EOpConvFloatToInt8":
				return EOpConvFloatToInt8;
			case "EOpConvFloatToInt16":
				return EOpConvFloatToInt16;
			case "EOpConvFloatToInt":
				return EOpConvFloatToInt;
			case "EOpConvFloatToInt64":
				return EOpConvFloatToInt64;
			case "EOpConvFloatToUint8":
				return EOpConvFloatToUint8;
			case "EOpConvFloatToUint16":
				return EOpConvFloatToUint16;
			case "EOpConvFloatToUint":
				return EOpConvFloatToUint;
			case "EOpConvFloatToUint64":
				return EOpConvFloatToUint64;
			case "EOpConvFloatToFloat16":
				return EOpConvFloatToFloat16;
			case "EOpConvFloatToDouble":
				return EOpConvFloatToDouble;
			case "EOpConvDoubleToInt8":
				return EOpConvDoubleToInt8;
			case "EOpConvDoubleToInt16":
				return EOpConvDoubleToInt16;
			case "EOpConvDoubleToInt":
				return EOpConvDoubleToInt;
			case "EOpConvDoubleToInt64":
				return EOpConvDoubleToInt64;
			case "EOpConvDoubleToUint8":
				return EOpConvDoubleToUint8;
			case "EOpConvDoubleToUint16":
				return EOpConvDoubleToUint16;
			case "EOpConvDoubleToUint":
				return EOpConvDoubleToUint;
			case "EOpConvDoubleToUint64":
				return EOpConvDoubleToUint64;
			case "EOpConvDoubleToFloat16":
				return EOpConvDoubleToFloat16;
			case "EOpConvDoubleToFloat":
				return EOpConvDoubleToFloat;
			case "EOpConvUint64ToPtr":
				return EOpConvUint64ToPtr;
			case "EOpConvPtrToUint64":
				return EOpConvPtrToUint64;
			case "EOpConvUvec2ToPtr":
				return EOpConvUvec2ToPtr;
			case "EOpConvPtrToUvec2":
				return EOpConvPtrToUvec2;
			case "EOpAdd":
				return EOpAdd;
			case "EOpSub":
				return EOpSub;
			case "EOpMul":
				return EOpMul;
			case "EOpDiv":
				return EOpDiv;
			case "EOpMod":
				return EOpMod;
			case "EOpRightShift":
				return EOpRightShift;
			case "EOpLeftShift":
				return EOpLeftShift;
			case "EOpAnd":
				return EOpAnd;
			case "EOpInclusiveOr":
				return EOpInclusiveOr;
			case "EOpExclusiveOr":
				return EOpExclusiveOr;
			case "EOpEqual":
				return EOpEqual;
			case "EOpNotEqual":
				return EOpNotEqual;
			case "EOpVectorEqual":
				return EOpVectorEqual;
			case "EOpVectorNotEqual":
				return EOpVectorNotEqual;
			case "EOpLessThan":
				return EOpLessThan;
			case "EOpGreaterThan":
				return EOpGreaterThan;
			case "EOpLessThanEqual":
				return EOpLessThanEqual;
			case "EOpGreaterThanEqual":
				return EOpGreaterThanEqual;
			case "EOpComma":
				return EOpComma;
			case "EOpVectorTimesScalar":
				return EOpVectorTimesScalar;
			case "EOpVectorTimesMatrix":
				return EOpVectorTimesMatrix;
			case "EOpMatrixTimesVector":
				return EOpMatrixTimesVector;
			case "EOpMatrixTimesScalar":
				return EOpMatrixTimesScalar;
			case "EOpLogicalOr":
				return EOpLogicalOr;
			case "EOpLogicalXor":
				return EOpLogicalXor;
			case "EOpLogicalAnd":
				return EOpLogicalAnd;
			case "EOpIndexDirect":
				return EOpIndexDirect;
			case "EOpIndexIndirect":
				return EOpIndexIndirect;
			case "EOpIndexDirectStruct":
				return EOpIndexDirectStruct;
			case "EOpVectorSwizzle":
				return EOpVectorSwizzle;
			case "EOpMethod":
				return EOpMethod;
			case "EOpScoping":
				return EOpScoping;
			case "EOpRadians":
				return EOpRadians;
			case "EOpDegrees":
				return EOpDegrees;
			case "EOpSin":
				return EOpSin;
			case "EOpCos":
				return EOpCos;
			case "EOpTan":
				return EOpTan;
			case "EOpAsin":
				return EOpAsin;
			case "EOpAcos":
				return EOpAcos;
			case "EOpAtan":
				return EOpAtan;
			case "EOpSinh":
				return EOpSinh;
			case "EOpCosh":
				return EOpCosh;
			case "EOpTanh":
				return EOpTanh;
			case "EOpAsinh":
				return EOpAsinh;
			case "EOpAcosh":
				return EOpAcosh;
			case "EOpAtanh":
				return EOpAtanh;
			case "EOpPow":
				return EOpPow;
			case "EOpExp":
				return EOpExp;
			case "EOpLog":
				return EOpLog;
			case "EOpExp2":
				return EOpExp2;
			case "EOpLog2":
				return EOpLog2;
			case "EOpSqrt":
				return EOpSqrt;
			case "EOpInverseSqrt":
				return EOpInverseSqrt;
			case "EOpAbs":
				return EOpAbs;
			case "EOpSign":
				return EOpSign;
			case "EOpFloor":
				return EOpFloor;
			case "EOpTrunc":
				return EOpTrunc;
			case "EOpRound":
				return EOpRound;
			case "EOpRoundEven":
				return EOpRoundEven;
			case "EOpCeil":
				return EOpCeil;
			case "EOpFract":
				return EOpFract;
			case "EOpModf":
				return EOpModf;
			case "EOpMin":
				return EOpMin;
			case "EOpMax":
				return EOpMax;
			case "EOpClamp":
				return EOpClamp;
			case "EOpMix":
				return EOpMix;
			case "EOpStep":
				return EOpStep;
			case "EOpSmoothStep":
				return EOpSmoothStep;
			case "EOpIsNan":
				return EOpIsNan;
			case "EOpIsInf":
				return EOpIsInf;
			case "EOpFma":
				return EOpFma;
			case "EOpFrexp":
				return EOpFrexp;
			case "EOpLdexp":
				return EOpLdexp;
			case "EOpFloatBitsToInt":
				return EOpFloatBitsToInt;
			case "EOpFloatBitsToUint":
				return EOpFloatBitsToUint;
			case "EOpIntBitsToFloat":
				return EOpIntBitsToFloat;
			case "EOpUintBitsToFloat":
				return EOpUintBitsToFloat;
			case "EOpDoubleBitsToInt64":
				return EOpDoubleBitsToInt64;
			case "EOpDoubleBitsToUint64":
				return EOpDoubleBitsToUint64;
			case "EOpInt64BitsToDouble":
				return EOpInt64BitsToDouble;
			case "EOpUint64BitsToDouble":
				return EOpUint64BitsToDouble;
			case "EOpFloat16BitsToInt16":
				return EOpFloat16BitsToInt16;
			case "EOpFloat16BitsToUint16":
				return EOpFloat16BitsToUint16;
			case "EOpInt16BitsToFloat16":
				return EOpInt16BitsToFloat16;
			case "EOpUint16BitsToFloat16":
				return EOpUint16BitsToFloat16;
			case "EOpPackSnorm2x16":
				return EOpPackSnorm2x16;
			case "EOpUnpackSnorm2x16":
				return EOpUnpackSnorm2x16;
			case "EOpPackUnorm2x16":
				return EOpPackUnorm2x16;
			case "EOpUnpackUnorm2x16":
				return EOpUnpackUnorm2x16;
			case "EOpPackSnorm4x8":
				return EOpPackSnorm4x8;
			case "EOpUnpackSnorm4x8":
				return EOpUnpackSnorm4x8;
			case "EOpPackUnorm4x8":
				return EOpPackUnorm4x8;
			case "EOpUnpackUnorm4x8":
				return EOpUnpackUnorm4x8;
			case "EOpPackHalf2x16":
				return EOpPackHalf2x16;
			case "EOpUnpackHalf2x16":
				return EOpUnpackHalf2x16;
			case "EOpPackDouble2x32":
				return EOpPackDouble2x32;
			case "EOpUnpackDouble2x32":
				return EOpUnpackDouble2x32;
			case "EOpPackInt2x32":
				return EOpPackInt2x32;
			case "EOpUnpackInt2x32":
				return EOpUnpackInt2x32;
			case "EOpPackUint2x32":
				return EOpPackUint2x32;
			case "EOpUnpackUint2x32":
				return EOpUnpackUint2x32;
			case "EOpPackFloat2x16":
				return EOpPackFloat2x16;
			case "EOpUnpackFloat2x16":
				return EOpUnpackFloat2x16;
			case "EOpPackInt2x16":
				return EOpPackInt2x16;
			case "EOpUnpackInt2x16":
				return EOpUnpackInt2x16;
			case "EOpPackUint2x16":
				return EOpPackUint2x16;
			case "EOpUnpackUint2x16":
				return EOpUnpackUint2x16;
			case "EOpPackInt4x16":
				return EOpPackInt4x16;
			case "EOpUnpackInt4x16":
				return EOpUnpackInt4x16;
			case "EOpPackUint4x16":
				return EOpPackUint4x16;
			case "EOpUnpackUint4x16":
				return EOpUnpackUint4x16;
			case "EOpPack16":
				return EOpPack16;
			case "EOpPack32":
				return EOpPack32;
			case "EOpPack64":
				return EOpPack64;
			case "EOpUnpack32":
				return EOpUnpack32;
			case "EOpUnpack16":
				return EOpUnpack16;
			case "EOpUnpack8":
				return EOpUnpack8;
			case "EOpLength":
				return EOpLength;
			case "EOpDistance":
				return EOpDistance;
			case "EOpDot":
				return EOpDot;
			case "EOpCross":
				return EOpCross;
			case "EOpNormalize":
				return EOpNormalize;
			case "EOpFaceForward":
				return EOpFaceForward;
			case "EOpReflect":
				return EOpReflect;
			case "EOpRefract":
				return EOpRefract;
			case "EOpMin3":
				return EOpMin3;
			case "EOpMax3":
				return EOpMax3;
			case "EOpMid3":
				return EOpMid3;
			case "EOpDPdx":
				return EOpDPdx;
			case "EOpDPdy":
				return EOpDPdy;
			case "EOpFwidth":
				return EOpFwidth;
			case "EOpDPdxFine":
				return EOpDPdxFine;
			case "EOpDPdyFine":
				return EOpDPdyFine;
			case "EOpFwidthFine":
				return EOpFwidthFine;
			case "EOpDPdxCoarse":
				return EOpDPdxCoarse;
			case "EOpDPdyCoarse":
				return EOpDPdyCoarse;
			case "EOpFwidthCoarse":
				return EOpFwidthCoarse;
			case "EOpInterpolateAtCentroid":
				return EOpInterpolateAtCentroid;
			case "EOpInterpolateAtSample":
				return EOpInterpolateAtSample;
			case "EOpInterpolateAtOffset":
				return EOpInterpolateAtOffset;
			case "EOpInterpolateAtVertex":
				return EOpInterpolateAtVertex;
			case "EOpMatrixTimesMatrix":
				return EOpMatrixTimesMatrix;
			case "EOpOuterProduct":
				return EOpOuterProduct;
			case "EOpDeterminant":
				return EOpDeterminant;
			case "EOpMatrixInverse":
				return EOpMatrixInverse;
			case "EOpTranspose":
				return EOpTranspose;
			case "EOpFtransform":
				return EOpFtransform;
			case "EOpNoise":
				return EOpNoise;
			case "EOpEmitVertex":
				return EOpEmitVertex;
			case "EOpEndPrimitive":
				return EOpEndPrimitive;
			case "EOpEmitStreamVertex":
				return EOpEmitStreamVertex;
			case "EOpEndStreamPrimitive":
				return EOpEndStreamPrimitive;
			case "EOpBarrier":
				return EOpBarrier;
			case "EOpMemoryBarrier":
				return EOpMemoryBarrier;
			case "EOpMemoryBarrierAtomicCounter":
				return EOpMemoryBarrierAtomicCounter;
			case "EOpMemoryBarrierBuffer":
				return EOpMemoryBarrierBuffer;
			case "EOpMemoryBarrierImage":
				return EOpMemoryBarrierImage;
			case "EOpMemoryBarrierShared":
				return EOpMemoryBarrierShared;
			case "EOpGroupMemoryBarrier":
				return EOpGroupMemoryBarrier;
			case "EOpBallot":
				return EOpBallot;
			case "EOpReadInvocation":
				return EOpReadInvocation;
			case "EOpReadFirstInvocation":
				return EOpReadFirstInvocation;
			case "EOpAnyInvocation":
				return EOpAnyInvocation;
			case "EOpAllInvocations":
				return EOpAllInvocations;
			case "EOpAllInvocationsEqual":
				return EOpAllInvocationsEqual;
			case "EOpSubgroupGuardStart":
				return EOpSubgroupGuardStart;
			case "EOpSubgroupBarrier":
				return EOpSubgroupBarrier;
			case "EOpSubgroupMemoryBarrier":
				return EOpSubgroupMemoryBarrier;
			case "EOpSubgroupMemoryBarrierBuffer":
				return EOpSubgroupMemoryBarrierBuffer;
			case "EOpSubgroupMemoryBarrierImage":
				return EOpSubgroupMemoryBarrierImage;
			case "EOpSubgroupMemoryBarrierShared":
				return EOpSubgroupMemoryBarrierShared;
			case "EOpSubgroupElect":
				return EOpSubgroupElect;
			case "EOpSubgroupAll":
				return EOpSubgroupAll;
			case "EOpSubgroupAny":
				return EOpSubgroupAny;
			case "EOpSubgroupAllEqual":
				return EOpSubgroupAllEqual;
			case "EOpSubgroupBroadcast":
				return EOpSubgroupBroadcast;
			case "EOpSubgroupBroadcastFirst":
				return EOpSubgroupBroadcastFirst;
			case "EOpSubgroupBallot":
				return EOpSubgroupBallot;
			case "EOpSubgroupInverseBallot":
				return EOpSubgroupInverseBallot;
			case "EOpSubgroupBallotBitExtract":
				return EOpSubgroupBallotBitExtract;
			case "EOpSubgroupBallotBitCount":
				return EOpSubgroupBallotBitCount;
			case "EOpSubgroupBallotInclusiveBitCount":
				return EOpSubgroupBallotInclusiveBitCount;
			case "EOpSubgroupBallotExclusiveBitCount":
				return EOpSubgroupBallotExclusiveBitCount;
			case "EOpSubgroupBallotFindLSB":
				return EOpSubgroupBallotFindLSB;
			case "EOpSubgroupBallotFindMSB":
				return EOpSubgroupBallotFindMSB;
			case "EOpSubgroupShuffle":
				return EOpSubgroupShuffle;
			case "EOpSubgroupShuffleXor":
				return EOpSubgroupShuffleXor;
			case "EOpSubgroupShuffleUp":
				return EOpSubgroupShuffleUp;
			case "EOpSubgroupShuffleDown":
				return EOpSubgroupShuffleDown;
			case "EOpSubgroupAdd":
				return EOpSubgroupAdd;
			case "EOpSubgroupMul":
				return EOpSubgroupMul;
			case "EOpSubgroupMin":
				return EOpSubgroupMin;
			case "EOpSubgroupMax":
				return EOpSubgroupMax;
			case "EOpSubgroupAnd":
				return EOpSubgroupAnd;
			case "EOpSubgroupOr":
				return EOpSubgroupOr;
			case "EOpSubgroupXor":
				return EOpSubgroupXor;
			case "EOpSubgroupInclusiveAdd":
				return EOpSubgroupInclusiveAdd;
			case "EOpSubgroupInclusiveMul":
				return EOpSubgroupInclusiveMul;
			case "EOpSubgroupInclusiveMin":
				return EOpSubgroupInclusiveMin;
			case "EOpSubgroupInclusiveMax":
				return EOpSubgroupInclusiveMax;
			case "EOpSubgroupInclusiveAnd":
				return EOpSubgroupInclusiveAnd;
			case "EOpSubgroupInclusiveOr":
				return EOpSubgroupInclusiveOr;
			case "EOpSubgroupInclusiveXor":
				return EOpSubgroupInclusiveXor;
			case "EOpSubgroupExclusiveAdd":
				return EOpSubgroupExclusiveAdd;
			case "EOpSubgroupExclusiveMul":
				return EOpSubgroupExclusiveMul;
			case "EOpSubgroupExclusiveMin":
				return EOpSubgroupExclusiveMin;
			case "EOpSubgroupExclusiveMax":
				return EOpSubgroupExclusiveMax;
			case "EOpSubgroupExclusiveAnd":
				return EOpSubgroupExclusiveAnd;
			case "EOpSubgroupExclusiveOr":
				return EOpSubgroupExclusiveOr;
			case "EOpSubgroupExclusiveXor":
				return EOpSubgroupExclusiveXor;
			case "EOpSubgroupClusteredAdd":
				return EOpSubgroupClusteredAdd;
			case "EOpSubgroupClusteredMul":
				return EOpSubgroupClusteredMul;
			case "EOpSubgroupClusteredMin":
				return EOpSubgroupClusteredMin;
			case "EOpSubgroupClusteredMax":
				return EOpSubgroupClusteredMax;
			case "EOpSubgroupClusteredAnd":
				return EOpSubgroupClusteredAnd;
			case "EOpSubgroupClusteredOr":
				return EOpSubgroupClusteredOr;
			case "EOpSubgroupClusteredXor":
				return EOpSubgroupClusteredXor;
			case "EOpSubgroupQuadBroadcast":
				return EOpSubgroupQuadBroadcast;
			case "EOpSubgroupQuadSwapHorizontal":
				return EOpSubgroupQuadSwapHorizontal;
			case "EOpSubgroupQuadSwapVertical":
				return EOpSubgroupQuadSwapVertical;
			case "EOpSubgroupQuadSwapDiagonal":
				return EOpSubgroupQuadSwapDiagonal;
			case "EOpSubgroupPartition":
				return EOpSubgroupPartition;
			case "EOpSubgroupPartitionedAdd":
				return EOpSubgroupPartitionedAdd;
			case "EOpSubgroupPartitionedMul":
				return EOpSubgroupPartitionedMul;
			case "EOpSubgroupPartitionedMin":
				return EOpSubgroupPartitionedMin;
			case "EOpSubgroupPartitionedMax":
				return EOpSubgroupPartitionedMax;
			case "EOpSubgroupPartitionedAnd":
				return EOpSubgroupPartitionedAnd;
			case "EOpSubgroupPartitionedOr":
				return EOpSubgroupPartitionedOr;
			case "EOpSubgroupPartitionedXor":
				return EOpSubgroupPartitionedXor;
			case "EOpSubgroupPartitionedInclusiveAdd":
				return EOpSubgroupPartitionedInclusiveAdd;
			case "EOpSubgroupPartitionedInclusiveMul":
				return EOpSubgroupPartitionedInclusiveMul;
			case "EOpSubgroupPartitionedInclusiveMin":
				return EOpSubgroupPartitionedInclusiveMin;
			case "EOpSubgroupPartitionedInclusiveMax":
				return EOpSubgroupPartitionedInclusiveMax;
			case "EOpSubgroupPartitionedInclusiveAnd":
				return EOpSubgroupPartitionedInclusiveAnd;
			case "EOpSubgroupPartitionedInclusiveOr":
				return EOpSubgroupPartitionedInclusiveOr;
			case "EOpSubgroupPartitionedInclusiveXor":
				return EOpSubgroupPartitionedInclusiveXor;
			case "EOpSubgroupPartitionedExclusiveAdd":
				return EOpSubgroupPartitionedExclusiveAdd;
			case "EOpSubgroupPartitionedExclusiveMul":
				return EOpSubgroupPartitionedExclusiveMul;
			case "EOpSubgroupPartitionedExclusiveMin":
				return EOpSubgroupPartitionedExclusiveMin;
			case "EOpSubgroupPartitionedExclusiveMax":
				return EOpSubgroupPartitionedExclusiveMax;
			case "EOpSubgroupPartitionedExclusiveAnd":
				return EOpSubgroupPartitionedExclusiveAnd;
			case "EOpSubgroupPartitionedExclusiveOr":
				return EOpSubgroupPartitionedExclusiveOr;
			case "EOpSubgroupPartitionedExclusiveXor":
				return EOpSubgroupPartitionedExclusiveXor;
			case "EOpSubgroupGuardStop":
				return EOpSubgroupGuardStop;
			case "EOpMinInvocations":
				return EOpMinInvocations;
			case "EOpMaxInvocations":
				return EOpMaxInvocations;
			case "EOpAddInvocations":
				return EOpAddInvocations;
			case "EOpMinInvocationsNonUniform":
				return EOpMinInvocationsNonUniform;
			case "EOpMaxInvocationsNonUniform":
				return EOpMaxInvocationsNonUniform;
			case "EOpAddInvocationsNonUniform":
				return EOpAddInvocationsNonUniform;
			case "EOpMinInvocationsInclusiveScan":
				return EOpMinInvocationsInclusiveScan;
			case "EOpMaxInvocationsInclusiveScan":
				return EOpMaxInvocationsInclusiveScan;
			case "EOpAddInvocationsInclusiveScan":
				return EOpAddInvocationsInclusiveScan;
			case "EOpMinInvocationsInclusiveScanNonUniform":
				return EOpMinInvocationsInclusiveScanNonUniform;
			case "EOpMaxInvocationsInclusiveScanNonUniform":
				return EOpMaxInvocationsInclusiveScanNonUniform;
			case "EOpAddInvocationsInclusiveScanNonUniform":
				return EOpAddInvocationsInclusiveScanNonUniform;
			case "EOpMinInvocationsExclusiveScan":
				return EOpMinInvocationsExclusiveScan;
			case "EOpMaxInvocationsExclusiveScan":
				return EOpMaxInvocationsExclusiveScan;
			case "EOpAddInvocationsExclusiveScan":
				return EOpAddInvocationsExclusiveScan;
			case "EOpMinInvocationsExclusiveScanNonUniform":
				return EOpMinInvocationsExclusiveScanNonUniform;
			case "EOpMaxInvocationsExclusiveScanNonUniform":
				return EOpMaxInvocationsExclusiveScanNonUniform;
			case "EOpAddInvocationsExclusiveScanNonUniform":
				return EOpAddInvocationsExclusiveScanNonUniform;
			case "EOpSwizzleInvocations":
				return EOpSwizzleInvocations;
			case "EOpSwizzleInvocationsMasked":
				return EOpSwizzleInvocationsMasked;
			case "EOpWriteInvocation":
				return EOpWriteInvocation;
			case "EOpMbcnt":
				return EOpMbcnt;
			case "EOpCubeFaceIndex":
				return EOpCubeFaceIndex;
			case "EOpCubeFaceCoord":
				return EOpCubeFaceCoord;
			case "EOpTime":
				return EOpTime;
			case "EOpAtomicAdd":
				return EOpAtomicAdd;
			case "EOpAtomicMin":
				return EOpAtomicMin;
			case "EOpAtomicMax":
				return EOpAtomicMax;
			case "EOpAtomicAnd":
				return EOpAtomicAnd;
			case "EOpAtomicOr":
				return EOpAtomicOr;
			case "EOpAtomicXor":
				return EOpAtomicXor;
			case "EOpAtomicExchange":
				return EOpAtomicExchange;
			case "EOpAtomicCompSwap":
				return EOpAtomicCompSwap;
			case "EOpAtomicLoad":
				return EOpAtomicLoad;
			case "EOpAtomicStore":
				return EOpAtomicStore;
			case "EOpAtomicCounterIncrement":
				return EOpAtomicCounterIncrement;
			case "EOpAtomicCounterDecrement":
				return EOpAtomicCounterDecrement;
			case "EOpAtomicCounter":
				return EOpAtomicCounter;
			case "EOpAtomicCounterAdd":
				return EOpAtomicCounterAdd;
			case "EOpAtomicCounterSubtract":
				return EOpAtomicCounterSubtract;
			case "EOpAtomicCounterMin":
				return EOpAtomicCounterMin;
			case "EOpAtomicCounterMax":
				return EOpAtomicCounterMax;
			case "EOpAtomicCounterAnd":
				return EOpAtomicCounterAnd;
			case "EOpAtomicCounterOr":
				return EOpAtomicCounterOr;
			case "EOpAtomicCounterXor":
				return EOpAtomicCounterXor;
			case "EOpAtomicCounterExchange":
				return EOpAtomicCounterExchange;
			case "EOpAtomicCounterCompSwap":
				return EOpAtomicCounterCompSwap;
			case "EOpAny":
				return EOpAny;
			case "EOpAll":
				return EOpAll;
			case "EOpCooperativeMatrixLoad":
				return EOpCooperativeMatrixLoad;
			case "EOpCooperativeMatrixStore":
				return EOpCooperativeMatrixStore;
			case "EOpCooperativeMatrixMulAdd":
				return EOpCooperativeMatrixMulAdd;
			case "EOpBeginInvocationInterlock":
				return EOpBeginInvocationInterlock;
			case "EOpEndInvocationInterlock":
				return EOpEndInvocationInterlock;
			case "EOpIsHelperInvocation":
				return EOpIsHelperInvocation;
			case "EOpDebugPrintf":
				return EOpDebugPrintf;
			case "EOpKill":
				return EOpKill;
			case "EOpReturn":
				return EOpReturn;
			case "EOpBreak":
				return EOpBreak;
			case "EOpContinue":
				return EOpContinue;
			case "EOpCase":
				return EOpCase;
			case "EOpDefault":
				return EOpDefault;
			case "EOpDemote":
				return EOpDemote;
			case "EOpConstructGuardStart":
				return EOpConstructGuardStart;
			case "EOpConstructInt":
				return EOpConstructInt;
			case "EOpConstructUint":
				return EOpConstructUint;
			case "EOpConstructInt8":
				return EOpConstructInt8;
			case "EOpConstructUint8":
				return EOpConstructUint8;
			case "EOpConstructInt16":
				return EOpConstructInt16;
			case "EOpConstructUint16":
				return EOpConstructUint16;
			case "EOpConstructInt64":
				return EOpConstructInt64;
			case "EOpConstructUint64":
				return EOpConstructUint64;
			case "EOpConstructBool":
				return EOpConstructBool;
			case "EOpConstructFloat":
				return EOpConstructFloat;
			case "EOpConstructDouble":
				return EOpConstructDouble;
			case "EOpConstructVec2":
				return EOpConstructVec2;
			case "EOpConstructVec3":
				return EOpConstructVec3;
			case "EOpConstructVec4":
				return EOpConstructVec4;
			case "EOpConstructMat2x2":
				return EOpConstructMat2x2;
			case "EOpConstructMat2x3":
				return EOpConstructMat2x3;
			case "EOpConstructMat2x4":
				return EOpConstructMat2x4;
			case "EOpConstructMat3x2":
				return EOpConstructMat3x2;
			case "EOpConstructMat3x3":
				return EOpConstructMat3x3;
			case "EOpConstructMat3x4":
				return EOpConstructMat3x4;
			case "EOpConstructMat4x2":
				return EOpConstructMat4x2;
			case "EOpConstructMat4x3":
				return EOpConstructMat4x3;
			case "EOpConstructMat4x4":
				return EOpConstructMat4x4;
			case "EOpConstructDVec2":
				return EOpConstructDVec2;
			case "EOpConstructDVec3":
				return EOpConstructDVec3;
			case "EOpConstructDVec4":
				return EOpConstructDVec4;
			case "EOpConstructBVec2":
				return EOpConstructBVec2;
			case "EOpConstructBVec3":
				return EOpConstructBVec3;
			case "EOpConstructBVec4":
				return EOpConstructBVec4;
			case "EOpConstructI8Vec2":
				return EOpConstructI8Vec2;
			case "EOpConstructI8Vec3":
				return EOpConstructI8Vec3;
			case "EOpConstructI8Vec4":
				return EOpConstructI8Vec4;
			case "EOpConstructU8Vec2":
				return EOpConstructU8Vec2;
			case "EOpConstructU8Vec3":
				return EOpConstructU8Vec3;
			case "EOpConstructU8Vec4":
				return EOpConstructU8Vec4;
			case "EOpConstructI16Vec2":
				return EOpConstructI16Vec2;
			case "EOpConstructI16Vec3":
				return EOpConstructI16Vec3;
			case "EOpConstructI16Vec4":
				return EOpConstructI16Vec4;
			case "EOpConstructU16Vec2":
				return EOpConstructU16Vec2;
			case "EOpConstructU16Vec3":
				return EOpConstructU16Vec3;
			case "EOpConstructU16Vec4":
				return EOpConstructU16Vec4;
			case "EOpConstructIVec2":
				return EOpConstructIVec2;
			case "EOpConstructIVec3":
				return EOpConstructIVec3;
			case "EOpConstructIVec4":
				return EOpConstructIVec4;
			case "EOpConstructUVec2":
				return EOpConstructUVec2;
			case "EOpConstructUVec3":
				return EOpConstructUVec3;
			case "EOpConstructUVec4":
				return EOpConstructUVec4;
			case "EOpConstructI64Vec2":
				return EOpConstructI64Vec2;
			case "EOpConstructI64Vec3":
				return EOpConstructI64Vec3;
			case "EOpConstructI64Vec4":
				return EOpConstructI64Vec4;
			case "EOpConstructU64Vec2":
				return EOpConstructU64Vec2;
			case "EOpConstructU64Vec3":
				return EOpConstructU64Vec3;
			case "EOpConstructU64Vec4":
				return EOpConstructU64Vec4;
			case "EOpConstructDMat2x2":
				return EOpConstructDMat2x2;
			case "EOpConstructDMat2x3":
				return EOpConstructDMat2x3;
			case "EOpConstructDMat2x4":
				return EOpConstructDMat2x4;
			case "EOpConstructDMat3x2":
				return EOpConstructDMat3x2;
			case "EOpConstructDMat3x3":
				return EOpConstructDMat3x3;
			case "EOpConstructDMat3x4":
				return EOpConstructDMat3x4;
			case "EOpConstructDMat4x2":
				return EOpConstructDMat4x2;
			case "EOpConstructDMat4x3":
				return EOpConstructDMat4x3;
			case "EOpConstructDMat4x4":
				return EOpConstructDMat4x4;
			case "EOpConstructIMat2x2":
				return EOpConstructIMat2x2;
			case "EOpConstructIMat2x3":
				return EOpConstructIMat2x3;
			case "EOpConstructIMat2x4":
				return EOpConstructIMat2x4;
			case "EOpConstructIMat3x2":
				return EOpConstructIMat3x2;
			case "EOpConstructIMat3x3":
				return EOpConstructIMat3x3;
			case "EOpConstructIMat3x4":
				return EOpConstructIMat3x4;
			case "EOpConstructIMat4x2":
				return EOpConstructIMat4x2;
			case "EOpConstructIMat4x3":
				return EOpConstructIMat4x3;
			case "EOpConstructIMat4x4":
				return EOpConstructIMat4x4;
			case "EOpConstructUMat2x2":
				return EOpConstructUMat2x2;
			case "EOpConstructUMat2x3":
				return EOpConstructUMat2x3;
			case "EOpConstructUMat2x4":
				return EOpConstructUMat2x4;
			case "EOpConstructUMat3x2":
				return EOpConstructUMat3x2;
			case "EOpConstructUMat3x3":
				return EOpConstructUMat3x3;
			case "EOpConstructUMat3x4":
				return EOpConstructUMat3x4;
			case "EOpConstructUMat4x2":
				return EOpConstructUMat4x2;
			case "EOpConstructUMat4x3":
				return EOpConstructUMat4x3;
			case "EOpConstructUMat4x4":
				return EOpConstructUMat4x4;
			case "EOpConstructBMat2x2":
				return EOpConstructBMat2x2;
			case "EOpConstructBMat2x3":
				return EOpConstructBMat2x3;
			case "EOpConstructBMat2x4":
				return EOpConstructBMat2x4;
			case "EOpConstructBMat3x2":
				return EOpConstructBMat3x2;
			case "EOpConstructBMat3x3":
				return EOpConstructBMat3x3;
			case "EOpConstructBMat3x4":
				return EOpConstructBMat3x4;
			case "EOpConstructBMat4x2":
				return EOpConstructBMat4x2;
			case "EOpConstructBMat4x3":
				return EOpConstructBMat4x3;
			case "EOpConstructBMat4x4":
				return EOpConstructBMat4x4;
			case "EOpConstructFloat16":
				return EOpConstructFloat16;
			case "EOpConstructF16Vec2":
				return EOpConstructF16Vec2;
			case "EOpConstructF16Vec3":
				return EOpConstructF16Vec3;
			case "EOpConstructF16Vec4":
				return EOpConstructF16Vec4;
			case "EOpConstructF16Mat2x2":
				return EOpConstructF16Mat2x2;
			case "EOpConstructF16Mat2x3":
				return EOpConstructF16Mat2x3;
			case "EOpConstructF16Mat2x4":
				return EOpConstructF16Mat2x4;
			case "EOpConstructF16Mat3x2":
				return EOpConstructF16Mat3x2;
			case "EOpConstructF16Mat3x3":
				return EOpConstructF16Mat3x3;
			case "EOpConstructF16Mat3x4":
				return EOpConstructF16Mat3x4;
			case "EOpConstructF16Mat4x2":
				return EOpConstructF16Mat4x2;
			case "EOpConstructF16Mat4x3":
				return EOpConstructF16Mat4x3;
			case "EOpConstructF16Mat4x4":
				return EOpConstructF16Mat4x4;
			case "EOpConstructStruct":
				return EOpConstructStruct;
			case "EOpConstructTextureSampler":
				return EOpConstructTextureSampler;
			case "EOpConstructNonuniform":
				return EOpConstructNonuniform;
			case "EOpConstructReference":
				return EOpConstructReference;
			case "EOpConstructCooperativeMatrix":
				return EOpConstructCooperativeMatrix;
			case "EOpConstructGuardEnd":
				return EOpConstructGuardEnd;
			case "EOpAssign":
				return EOpAssign;
			case "EOpAddAssign":
				return EOpAddAssign;
			case "EOpSubAssign":
				return EOpSubAssign;
			case "EOpMulAssign":
				return EOpMulAssign;
			case "EOpVectorTimesMatrixAssign":
				return EOpVectorTimesMatrixAssign;
			case "EOpVectorTimesScalarAssign":
				return EOpVectorTimesScalarAssign;
			case "EOpMatrixTimesScalarAssign":
				return EOpMatrixTimesScalarAssign;
			case "EOpMatrixTimesMatrixAssign":
				return EOpMatrixTimesMatrixAssign;
			case "EOpDivAssign":
				return EOpDivAssign;
			case "EOpModAssign":
				return EOpModAssign;
			case "EOpAndAssign":
				return EOpAndAssign;
			case "EOpInclusiveOrAssign":
				return EOpInclusiveOrAssign;
			case "EOpExclusiveOrAssign":
				return EOpExclusiveOrAssign;
			case "EOpLeftShiftAssign":
				return EOpLeftShiftAssign;
			case "EOpRightShiftAssign":
				return EOpRightShiftAssign;
			case "EOpArrayLength":
				return EOpArrayLength;
			case "EOpImageGuardBegin":
				return EOpImageGuardBegin;
			case "EOpImageQuerySize":
				return EOpImageQuerySize;
			case "EOpImageQuerySamples":
				return EOpImageQuerySamples;
			case "EOpImageLoad":
				return EOpImageLoad;
			case "EOpImageStore":
				return EOpImageStore;
			case "EOpImageLoadLod":
				return EOpImageLoadLod;
			case "EOpImageStoreLod":
				return EOpImageStoreLod;
			case "EOpImageAtomicAdd":
				return EOpImageAtomicAdd;
			case "EOpImageAtomicMin":
				return EOpImageAtomicMin;
			case "EOpImageAtomicMax":
				return EOpImageAtomicMax;
			case "EOpImageAtomicAnd":
				return EOpImageAtomicAnd;
			case "EOpImageAtomicOr":
				return EOpImageAtomicOr;
			case "EOpImageAtomicXor":
				return EOpImageAtomicXor;
			case "EOpImageAtomicExchange":
				return EOpImageAtomicExchange;
			case "EOpImageAtomicCompSwap":
				return EOpImageAtomicCompSwap;
			case "EOpImageAtomicLoad":
				return EOpImageAtomicLoad;
			case "EOpImageAtomicStore":
				return EOpImageAtomicStore;
			case "EOpSubpassLoad":
				return EOpSubpassLoad;
			case "EOpSubpassLoadMS":
				return EOpSubpassLoadMS;
			case "EOpSparseImageLoad":
				return EOpSparseImageLoad;
			case "EOpSparseImageLoadLod":
				return EOpSparseImageLoadLod;
			case "EOpImageGuardEnd":
				return EOpImageGuardEnd;
			case "EOpTextureGuardBegin":
				return EOpTextureGuardBegin;
			case "EOpTextureQuerySize":
				return EOpTextureQuerySize;
			case "EOpTextureQueryLod":
				return EOpTextureQueryLod;
			case "EOpTextureQueryLevels":
				return EOpTextureQueryLevels;
			case "EOpTextureQuerySamples":
				return EOpTextureQuerySamples;
			case "EOpSamplingGuardBegin":
				return EOpSamplingGuardBegin;
			case "EOpTexture":
				return EOpTexture;
			case "EOpTextureProj":
				return EOpTextureProj;
			case "EOpTextureLod":
				return EOpTextureLod;
			case "EOpTextureOffset":
				return EOpTextureOffset;
			case "EOpTextureFetch":
				return EOpTextureFetch;
			case "EOpTextureFetchOffset":
				return EOpTextureFetchOffset;
			case "EOpTextureProjOffset":
				return EOpTextureProjOffset;
			case "EOpTextureLodOffset":
				return EOpTextureLodOffset;
			case "EOpTextureProjLod":
				return EOpTextureProjLod;
			case "EOpTextureProjLodOffset":
				return EOpTextureProjLodOffset;
			case "EOpTextureGrad":
				return EOpTextureGrad;
			case "EOpTextureGradOffset":
				return EOpTextureGradOffset;
			case "EOpTextureProjGrad":
				return EOpTextureProjGrad;
			case "EOpTextureProjGradOffset":
				return EOpTextureProjGradOffset;
			case "EOpTextureGather":
				return EOpTextureGather;
			case "EOpTextureGatherOffset":
				return EOpTextureGatherOffset;
			case "EOpTextureGatherOffsets":
				return EOpTextureGatherOffsets;
			case "EOpTextureClamp":
				return EOpTextureClamp;
			case "EOpTextureOffsetClamp":
				return EOpTextureOffsetClamp;
			case "EOpTextureGradClamp":
				return EOpTextureGradClamp;
			case "EOpTextureGradOffsetClamp":
				return EOpTextureGradOffsetClamp;
			case "EOpTextureGatherLod":
				return EOpTextureGatherLod;
			case "EOpTextureGatherLodOffset":
				return EOpTextureGatherLodOffset;
			case "EOpTextureGatherLodOffsets":
				return EOpTextureGatherLodOffsets;
			case "EOpFragmentMaskFetch":
				return EOpFragmentMaskFetch;
			case "EOpFragmentFetch":
				return EOpFragmentFetch;
			case "EOpSparseTextureGuardBegin":
				return EOpSparseTextureGuardBegin;
			case "EOpSparseTexture":
				return EOpSparseTexture;
			case "EOpSparseTextureLod":
				return EOpSparseTextureLod;
			case "EOpSparseTextureOffset":
				return EOpSparseTextureOffset;
			case "EOpSparseTextureFetch":
				return EOpSparseTextureFetch;
			case "EOpSparseTextureFetchOffset":
				return EOpSparseTextureFetchOffset;
			case "EOpSparseTextureLodOffset":
				return EOpSparseTextureLodOffset;
			case "EOpSparseTextureGrad":
				return EOpSparseTextureGrad;
			case "EOpSparseTextureGradOffset":
				return EOpSparseTextureGradOffset;
			case "EOpSparseTextureGather":
				return EOpSparseTextureGather;
			case "EOpSparseTextureGatherOffset":
				return EOpSparseTextureGatherOffset;
			case "EOpSparseTextureGatherOffsets":
				return EOpSparseTextureGatherOffsets;
			case "EOpSparseTexelsResident":
				return EOpSparseTexelsResident;
			case "EOpSparseTextureClamp":
				return EOpSparseTextureClamp;
			case "EOpSparseTextureOffsetClamp":
				return EOpSparseTextureOffsetClamp;
			case "EOpSparseTextureGradClamp":
				return EOpSparseTextureGradClamp;
			case "EOpSparseTextureGradOffsetClamp":
				return EOpSparseTextureGradOffsetClamp;
			case "EOpSparseTextureGatherLod":
				return EOpSparseTextureGatherLod;
			case "EOpSparseTextureGatherLodOffset":
				return EOpSparseTextureGatherLodOffset;
			case "EOpSparseTextureGatherLodOffsets":
				return EOpSparseTextureGatherLodOffsets;
			case "EOpSparseTextureGuardEnd":
				return EOpSparseTextureGuardEnd;
			case "EOpImageFootprintGuardBegin":
				return EOpImageFootprintGuardBegin;
			case "EOpImageSampleFootprintNV":
				return EOpImageSampleFootprintNV;
			case "EOpImageSampleFootprintClampNV":
				return EOpImageSampleFootprintClampNV;
			case "EOpImageSampleFootprintLodNV":
				return EOpImageSampleFootprintLodNV;
			case "EOpImageSampleFootprintGradNV":
				return EOpImageSampleFootprintGradNV;
			case "EOpImageSampleFootprintGradClampNV":
				return EOpImageSampleFootprintGradClampNV;
			case "EOpImageFootprintGuardEnd":
				return EOpImageFootprintGuardEnd;
			case "EOpSamplingGuardEnd":
				return EOpSamplingGuardEnd;
			case "EOpTextureGuardEnd":
				return EOpTextureGuardEnd;
			case "EOpAddCarry":
				return EOpAddCarry;
			case "EOpSubBorrow":
				return EOpSubBorrow;
			case "EOpUMulExtended":
				return EOpUMulExtended;
			case "EOpIMulExtended":
				return EOpIMulExtended;
			case "EOpBitfieldExtract":
				return EOpBitfieldExtract;
			case "EOpBitfieldInsert":
				return EOpBitfieldInsert;
			case "EOpBitFieldReverse":
				return EOpBitFieldReverse;
			case "EOpBitCount":
				return EOpBitCount;
			case "EOpFindLSB":
				return EOpFindLSB;
			case "EOpFindMSB":
				return EOpFindMSB;
			case "EOpCountLeadingZeros":
				return EOpCountLeadingZeros;
			case "EOpCountTrailingZeros":
				return EOpCountTrailingZeros;
			case "EOpAbsDifference":
				return EOpAbsDifference;
			case "EOpAddSaturate":
				return EOpAddSaturate;
			case "EOpSubSaturate":
				return EOpSubSaturate;
			case "EOpAverage":
				return EOpAverage;
			case "EOpAverageRounded":
				return EOpAverageRounded;
			case "EOpMul32x16":
				return EOpMul32x16;
			case "EOpTrace":
				return EOpTrace;
			case "EOpReportIntersection":
				return EOpReportIntersection;
			case "EOpIgnoreIntersection":
				return EOpIgnoreIntersection;
			case "EOpTerminateRay":
				return EOpTerminateRay;
			case "EOpExecuteCallable":
				return EOpExecuteCallable;
			case "EOpWritePackedPrimitiveIndices4x8NV":
				return EOpWritePackedPrimitiveIndices4x8NV;
			case "EOpRayQueryInitialize":
				return EOpRayQueryInitialize;
			case "EOpRayQueryTerminate":
				return EOpRayQueryTerminate;
			case "EOpRayQueryGenerateIntersection":
				return EOpRayQueryGenerateIntersection;
			case "EOpRayQueryConfirmIntersection":
				return EOpRayQueryConfirmIntersection;
			case "EOpRayQueryProceed":
				return EOpRayQueryProceed;
			case "EOpRayQueryGetIntersectionType":
				return EOpRayQueryGetIntersectionType;
			case "EOpRayQueryGetRayTMin":
				return EOpRayQueryGetRayTMin;
			case "EOpRayQueryGetRayFlags":
				return EOpRayQueryGetRayFlags;
			case "EOpRayQueryGetIntersectionT":
				return EOpRayQueryGetIntersectionT;
			case "EOpRayQueryGetIntersectionInstanceCustomIndex":
				return EOpRayQueryGetIntersectionInstanceCustomIndex;
			case "EOpRayQueryGetIntersectionInstanceId":
				return EOpRayQueryGetIntersectionInstanceId;
			case "EOpRayQueryGetIntersectionInstanceShaderBindingTableRecordOffset":
				return EOpRayQueryGetIntersectionInstanceShaderBindingTableRecordOffset;
			case "EOpRayQueryGetIntersectionGeometryIndex":
				return EOpRayQueryGetIntersectionGeometryIndex;
			case "EOpRayQueryGetIntersectionPrimitiveIndex":
				return EOpRayQueryGetIntersectionPrimitiveIndex;
			case "EOpRayQueryGetIntersectionBarycentrics":
				return EOpRayQueryGetIntersectionBarycentrics;
			case "EOpRayQueryGetIntersectionFrontFace":
				return EOpRayQueryGetIntersectionFrontFace;
			case "EOpRayQueryGetIntersectionCandidateAABBOpaque":
				return EOpRayQueryGetIntersectionCandidateAABBOpaque;
			case "EOpRayQueryGetIntersectionObjectRayDirection":
				return EOpRayQueryGetIntersectionObjectRayDirection;
			case "EOpRayQueryGetIntersectionObjectRayOrigin":
				return EOpRayQueryGetIntersectionObjectRayOrigin;
			case "EOpRayQueryGetWorldRayDirection":
				return EOpRayQueryGetWorldRayDirection;
			case "EOpRayQueryGetWorldRayOrigin":
				return EOpRayQueryGetWorldRayOrigin;
			case "EOpRayQueryGetIntersectionObjectToWorld":
				return EOpRayQueryGetIntersectionObjectToWorld;
			case "EOpRayQueryGetIntersectionWorldToObject":
				return EOpRayQueryGetIntersectionWorldToObject;
			case "EOpClip":
				return EOpClip;
			case "EOpIsFinite":
				return EOpIsFinite;
			case "EOpLog10":
				return EOpLog10;
			case "EOpRcp":
				return EOpRcp;
			case "EOpSaturate":
				return EOpSaturate;
			case "EOpSinCos":
				return EOpSinCos;
			case "EOpGenMul":
				return EOpGenMul;
			case "EOpDst":
				return EOpDst;
			case "EOpInterlockedAdd":
				return EOpInterlockedAdd;
			case "EOpInterlockedAnd":
				return EOpInterlockedAnd;
			case "EOpInterlockedCompareExchange":
				return EOpInterlockedCompareExchange;
			case "EOpInterlockedCompareStore":
				return EOpInterlockedCompareStore;
			case "EOpInterlockedExchange":
				return EOpInterlockedExchange;
			case "EOpInterlockedMax":
				return EOpInterlockedMax;
			case "EOpInterlockedMin":
				return EOpInterlockedMin;
			case "EOpInterlockedOr":
				return EOpInterlockedOr;
			case "EOpInterlockedXor":
				return EOpInterlockedXor;
			case "EOpAllMemoryBarrierWithGroupSync":
				return EOpAllMemoryBarrierWithGroupSync;
			case "EOpDeviceMemoryBarrier":
				return EOpDeviceMemoryBarrier;
			case "EOpDeviceMemoryBarrierWithGroupSync":
				return EOpDeviceMemoryBarrierWithGroupSync;
			case "EOpWorkgroupMemoryBarrier":
				return EOpWorkgroupMemoryBarrier;
			case "EOpWorkgroupMemoryBarrierWithGroupSync":
				return EOpWorkgroupMemoryBarrierWithGroupSync;
			case "EOpEvaluateAttributeSnapped":
				return EOpEvaluateAttributeSnapped;
			case "EOpF32tof16":
				return EOpF32tof16;
			case "EOpF16tof32":
				return EOpF16tof32;
			case "EOpLit":
				return EOpLit;
			case "EOpTextureBias":
				return EOpTextureBias;
			case "EOpAsDouble":
				return EOpAsDouble;
			case "EOpD3DCOLORtoUBYTE4":
				return EOpD3DCOLORtoUBYTE4;
			case "EOpMethodSample":
				return EOpMethodSample;
			case "EOpMethodSampleBias":
				return EOpMethodSampleBias;
			case "EOpMethodSampleCmp":
				return EOpMethodSampleCmp;
			case "EOpMethodSampleCmpLevelZero":
				return EOpMethodSampleCmpLevelZero;
			case "EOpMethodSampleGrad":
				return EOpMethodSampleGrad;
			case "EOpMethodSampleLevel":
				return EOpMethodSampleLevel;
			case "EOpMethodLoad":
				return EOpMethodLoad;
			case "EOpMethodGetDimensions":
				return EOpMethodGetDimensions;
			case "EOpMethodGetSamplePosition":
				return EOpMethodGetSamplePosition;
			case "EOpMethodGather":
				return EOpMethodGather;
			case "EOpMethodCalculateLevelOfDetail":
				return EOpMethodCalculateLevelOfDetail;
			case "EOpMethodCalculateLevelOfDetailUnclamped":
				return EOpMethodCalculateLevelOfDetailUnclamped;
			case "EOpMethodLoad2":
				return EOpMethodLoad2;
			case "EOpMethodLoad3":
				return EOpMethodLoad3;
			case "EOpMethodLoad4":
				return EOpMethodLoad4;
			case "EOpMethodStore":
				return EOpMethodStore;
			case "EOpMethodStore2":
				return EOpMethodStore2;
			case "EOpMethodStore3":
				return EOpMethodStore3;
			case "EOpMethodStore4":
				return EOpMethodStore4;
			case "EOpMethodIncrementCounter":
				return EOpMethodIncrementCounter;
			case "EOpMethodDecrementCounter":
				return EOpMethodDecrementCounter;
			case "EOpMethodConsume":
				return EOpMethodConsume;
			case "EOpMethodGatherRed":
				return EOpMethodGatherRed;
			case "EOpMethodGatherGreen":
				return EOpMethodGatherGreen;
			case "EOpMethodGatherBlue":
				return EOpMethodGatherBlue;
			case "EOpMethodGatherAlpha":
				return EOpMethodGatherAlpha;
			case "EOpMethodGatherCmp":
				return EOpMethodGatherCmp;
			case "EOpMethodGatherCmpRed":
				return EOpMethodGatherCmpRed;
			case "EOpMethodGatherCmpGreen":
				return EOpMethodGatherCmpGreen;
			case "EOpMethodGatherCmpBlue":
				return EOpMethodGatherCmpBlue;
			case "EOpMethodGatherCmpAlpha":
				return EOpMethodGatherCmpAlpha;
			case "EOpMethodAppend":
				return EOpMethodAppend;
			case "EOpMethodRestartStrip":
				return EOpMethodRestartStrip;
			case "EOpMatrixSwizzle":
				return EOpMatrixSwizzle;
			case "EOpWaveGetLaneCount":
				return EOpWaveGetLaneCount;
			case "EOpWaveGetLaneIndex":
				return EOpWaveGetLaneIndex;
			case "EOpWaveActiveCountBits":
				return EOpWaveActiveCountBits;
			case "EOpWavePrefixCountBits":
				return EOpWavePrefixCountBits;
			case "EOpReadClockSubgroupKHR":
				return EOpReadClockSubgroupKHR;
			case "EOpReadClockDeviceKHR":
				return EOpReadClockDeviceKHR;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TOperator valueByConstant(int constant) {
		switch (constant) {
			case Main.E_OP_NULL:
				return EOpNull;
			case Main.E_OP_SEQUENCE:
				return EOpSequence;
			case Main.E_OP_LINKER_OBJECTS:
				return EOpLinkerObjects;
			case Main.E_OP_FUNCTION_CALL:
				return EOpFunctionCall;
			case Main.E_OP_FUNCTION:
				return EOpFunction;
			case Main.E_OP_PARAMETERS:
				return EOpParameters;
			case Main.E_OP_NEGATIVE:
				return EOpNegative;
			case Main.E_OP_LOGICAL_NOT:
				return EOpLogicalNot;
			case Main.E_OP_VECTOR_LOGICAL_NOT:
				return EOpVectorLogicalNot;
			case Main.E_OP_BITWISE_NOT:
				return EOpBitwiseNot;
			case Main.E_OP_POST_INCREMENT:
				return EOpPostIncrement;
			case Main.E_OP_POST_DECREMENT:
				return EOpPostDecrement;
			case Main.E_OP_PRE_INCREMENT:
				return EOpPreIncrement;
			case Main.E_OP_PRE_DECREMENT:
				return EOpPreDecrement;
			case Main.E_OP_COPY_OBJECT:
				return EOpCopyObject;
			case Main.E_OP_CONV_INT8_TO_BOOL:
				return EOpConvInt8ToBool;
			case Main.E_OP_CONV_UINT8_TO_BOOL:
				return EOpConvUint8ToBool;
			case Main.E_OP_CONV_INT16_TO_BOOL:
				return EOpConvInt16ToBool;
			case Main.E_OP_CONV_UINT16_TO_BOOL:
				return EOpConvUint16ToBool;
			case Main.E_OP_CONV_INT_TO_BOOL:
				return EOpConvIntToBool;
			case Main.E_OP_CONV_UINT_TO_BOOL:
				return EOpConvUintToBool;
			case Main.E_OP_CONV_INT64_TO_BOOL:
				return EOpConvInt64ToBool;
			case Main.E_OP_CONV_UINT64_TO_BOOL:
				return EOpConvUint64ToBool;
			case Main.E_OP_CONV_FLOAT16_TO_BOOL:
				return EOpConvFloat16ToBool;
			case Main.E_OP_CONV_FLOAT_TO_BOOL:
				return EOpConvFloatToBool;
			case Main.E_OP_CONV_DOUBLE_TO_BOOL:
				return EOpConvDoubleToBool;
			case Main.E_OP_CONV_BOOL_TO_INT8:
				return EOpConvBoolToInt8;
			case Main.E_OP_CONV_BOOL_TO_UINT8:
				return EOpConvBoolToUint8;
			case Main.E_OP_CONV_BOOL_TO_INT16:
				return EOpConvBoolToInt16;
			case Main.E_OP_CONV_BOOL_TO_UINT16:
				return EOpConvBoolToUint16;
			case Main.E_OP_CONV_BOOL_TO_INT:
				return EOpConvBoolToInt;
			case Main.E_OP_CONV_BOOL_TO_UINT:
				return EOpConvBoolToUint;
			case Main.E_OP_CONV_BOOL_TO_INT64:
				return EOpConvBoolToInt64;
			case Main.E_OP_CONV_BOOL_TO_UINT64:
				return EOpConvBoolToUint64;
			case Main.E_OP_CONV_BOOL_TO_FLOAT16:
				return EOpConvBoolToFloat16;
			case Main.E_OP_CONV_BOOL_TO_FLOAT:
				return EOpConvBoolToFloat;
			case Main.E_OP_CONV_BOOL_TO_DOUBLE:
				return EOpConvBoolToDouble;
			case Main.E_OP_CONV_INT8_TO_INT16:
				return EOpConvInt8ToInt16;
			case Main.E_OP_CONV_INT8_TO_INT:
				return EOpConvInt8ToInt;
			case Main.E_OP_CONV_INT8_TO_INT64:
				return EOpConvInt8ToInt64;
			case Main.E_OP_CONV_INT8_TO_UINT8:
				return EOpConvInt8ToUint8;
			case Main.E_OP_CONV_INT8_TO_UINT16:
				return EOpConvInt8ToUint16;
			case Main.E_OP_CONV_INT8_TO_UINT:
				return EOpConvInt8ToUint;
			case Main.E_OP_CONV_INT8_TO_UINT64:
				return EOpConvInt8ToUint64;
			case Main.E_OP_CONV_UINT8_TO_INT8:
				return EOpConvUint8ToInt8;
			case Main.E_OP_CONV_UINT8_TO_INT16:
				return EOpConvUint8ToInt16;
			case Main.E_OP_CONV_UINT8_TO_INT:
				return EOpConvUint8ToInt;
			case Main.E_OP_CONV_UINT8_TO_INT64:
				return EOpConvUint8ToInt64;
			case Main.E_OP_CONV_UINT8_TO_UINT16:
				return EOpConvUint8ToUint16;
			case Main.E_OP_CONV_UINT8_TO_UINT:
				return EOpConvUint8ToUint;
			case Main.E_OP_CONV_UINT8_TO_UINT64:
				return EOpConvUint8ToUint64;
			case Main.E_OP_CONV_INT8_TO_FLOAT16:
				return EOpConvInt8ToFloat16;
			case Main.E_OP_CONV_INT8_TO_FLOAT:
				return EOpConvInt8ToFloat;
			case Main.E_OP_CONV_INT8_TO_DOUBLE:
				return EOpConvInt8ToDouble;
			case Main.E_OP_CONV_UINT8_TO_FLOAT16:
				return EOpConvUint8ToFloat16;
			case Main.E_OP_CONV_UINT8_TO_FLOAT:
				return EOpConvUint8ToFloat;
			case Main.E_OP_CONV_UINT8_TO_DOUBLE:
				return EOpConvUint8ToDouble;
			case Main.E_OP_CONV_INT16_TO_INT8:
				return EOpConvInt16ToInt8;
			case Main.E_OP_CONV_INT16_TO_INT:
				return EOpConvInt16ToInt;
			case Main.E_OP_CONV_INT16_TO_INT64:
				return EOpConvInt16ToInt64;
			case Main.E_OP_CONV_INT16_TO_UINT8:
				return EOpConvInt16ToUint8;
			case Main.E_OP_CONV_INT16_TO_UINT16:
				return EOpConvInt16ToUint16;
			case Main.E_OP_CONV_INT16_TO_UINT:
				return EOpConvInt16ToUint;
			case Main.E_OP_CONV_INT16_TO_UINT64:
				return EOpConvInt16ToUint64;
			case Main.E_OP_CONV_UINT16_TO_INT8:
				return EOpConvUint16ToInt8;
			case Main.E_OP_CONV_UINT16_TO_INT16:
				return EOpConvUint16ToInt16;
			case Main.E_OP_CONV_UINT16_TO_INT:
				return EOpConvUint16ToInt;
			case Main.E_OP_CONV_UINT16_TO_INT64:
				return EOpConvUint16ToInt64;
			case Main.E_OP_CONV_UINT16_TO_UINT8:
				return EOpConvUint16ToUint8;
			case Main.E_OP_CONV_UINT16_TO_UINT:
				return EOpConvUint16ToUint;
			case Main.E_OP_CONV_UINT16_TO_UINT64:
				return EOpConvUint16ToUint64;
			case Main.E_OP_CONV_INT16_TO_FLOAT16:
				return EOpConvInt16ToFloat16;
			case Main.E_OP_CONV_INT16_TO_FLOAT:
				return EOpConvInt16ToFloat;
			case Main.E_OP_CONV_INT16_TO_DOUBLE:
				return EOpConvInt16ToDouble;
			case Main.E_OP_CONV_UINT16_TO_FLOAT16:
				return EOpConvUint16ToFloat16;
			case Main.E_OP_CONV_UINT16_TO_FLOAT:
				return EOpConvUint16ToFloat;
			case Main.E_OP_CONV_UINT16_TO_DOUBLE:
				return EOpConvUint16ToDouble;
			case Main.E_OP_CONV_INT_TO_INT8:
				return EOpConvIntToInt8;
			case Main.E_OP_CONV_INT_TO_INT16:
				return EOpConvIntToInt16;
			case Main.E_OP_CONV_INT_TO_INT64:
				return EOpConvIntToInt64;
			case Main.E_OP_CONV_INT_TO_UINT8:
				return EOpConvIntToUint8;
			case Main.E_OP_CONV_INT_TO_UINT16:
				return EOpConvIntToUint16;
			case Main.E_OP_CONV_INT_TO_UINT:
				return EOpConvIntToUint;
			case Main.E_OP_CONV_INT_TO_UINT64:
				return EOpConvIntToUint64;
			case Main.E_OP_CONV_UINT_TO_INT8:
				return EOpConvUintToInt8;
			case Main.E_OP_CONV_UINT_TO_INT16:
				return EOpConvUintToInt16;
			case Main.E_OP_CONV_UINT_TO_INT:
				return EOpConvUintToInt;
			case Main.E_OP_CONV_UINT_TO_INT64:
				return EOpConvUintToInt64;
			case Main.E_OP_CONV_UINT_TO_UINT8:
				return EOpConvUintToUint8;
			case Main.E_OP_CONV_UINT_TO_UINT16:
				return EOpConvUintToUint16;
			case Main.E_OP_CONV_UINT_TO_UINT64:
				return EOpConvUintToUint64;
			case Main.E_OP_CONV_INT_TO_FLOAT16:
				return EOpConvIntToFloat16;
			case Main.E_OP_CONV_INT_TO_FLOAT:
				return EOpConvIntToFloat;
			case Main.E_OP_CONV_INT_TO_DOUBLE:
				return EOpConvIntToDouble;
			case Main.E_OP_CONV_UINT_TO_FLOAT16:
				return EOpConvUintToFloat16;
			case Main.E_OP_CONV_UINT_TO_FLOAT:
				return EOpConvUintToFloat;
			case Main.E_OP_CONV_UINT_TO_DOUBLE:
				return EOpConvUintToDouble;
			case Main.E_OP_CONV_INT64_TO_INT8:
				return EOpConvInt64ToInt8;
			case Main.E_OP_CONV_INT64_TO_INT16:
				return EOpConvInt64ToInt16;
			case Main.E_OP_CONV_INT64_TO_INT:
				return EOpConvInt64ToInt;
			case Main.E_OP_CONV_INT64_TO_UINT8:
				return EOpConvInt64ToUint8;
			case Main.E_OP_CONV_INT64_TO_UINT16:
				return EOpConvInt64ToUint16;
			case Main.E_OP_CONV_INT64_TO_UINT:
				return EOpConvInt64ToUint;
			case Main.E_OP_CONV_INT64_TO_UINT64:
				return EOpConvInt64ToUint64;
			case Main.E_OP_CONV_UINT64_TO_INT8:
				return EOpConvUint64ToInt8;
			case Main.E_OP_CONV_UINT64_TO_INT16:
				return EOpConvUint64ToInt16;
			case Main.E_OP_CONV_UINT64_TO_INT:
				return EOpConvUint64ToInt;
			case Main.E_OP_CONV_UINT64_TO_INT64:
				return EOpConvUint64ToInt64;
			case Main.E_OP_CONV_UINT64_TO_UINT8:
				return EOpConvUint64ToUint8;
			case Main.E_OP_CONV_UINT64_TO_UINT16:
				return EOpConvUint64ToUint16;
			case Main.E_OP_CONV_UINT64_TO_UINT:
				return EOpConvUint64ToUint;
			case Main.E_OP_CONV_INT64_TO_FLOAT16:
				return EOpConvInt64ToFloat16;
			case Main.E_OP_CONV_INT64_TO_FLOAT:
				return EOpConvInt64ToFloat;
			case Main.E_OP_CONV_INT64_TO_DOUBLE:
				return EOpConvInt64ToDouble;
			case Main.E_OP_CONV_UINT64_TO_FLOAT16:
				return EOpConvUint64ToFloat16;
			case Main.E_OP_CONV_UINT64_TO_FLOAT:
				return EOpConvUint64ToFloat;
			case Main.E_OP_CONV_UINT64_TO_DOUBLE:
				return EOpConvUint64ToDouble;
			case Main.E_OP_CONV_FLOAT16_TO_INT8:
				return EOpConvFloat16ToInt8;
			case Main.E_OP_CONV_FLOAT16_TO_INT16:
				return EOpConvFloat16ToInt16;
			case Main.E_OP_CONV_FLOAT16_TO_INT:
				return EOpConvFloat16ToInt;
			case Main.E_OP_CONV_FLOAT16_TO_INT64:
				return EOpConvFloat16ToInt64;
			case Main.E_OP_CONV_FLOAT16_TO_UINT8:
				return EOpConvFloat16ToUint8;
			case Main.E_OP_CONV_FLOAT16_TO_UINT16:
				return EOpConvFloat16ToUint16;
			case Main.E_OP_CONV_FLOAT16_TO_UINT:
				return EOpConvFloat16ToUint;
			case Main.E_OP_CONV_FLOAT16_TO_UINT64:
				return EOpConvFloat16ToUint64;
			case Main.E_OP_CONV_FLOAT16_TO_FLOAT:
				return EOpConvFloat16ToFloat;
			case Main.E_OP_CONV_FLOAT16_TO_DOUBLE:
				return EOpConvFloat16ToDouble;
			case Main.E_OP_CONV_FLOAT_TO_INT8:
				return EOpConvFloatToInt8;
			case Main.E_OP_CONV_FLOAT_TO_INT16:
				return EOpConvFloatToInt16;
			case Main.E_OP_CONV_FLOAT_TO_INT:
				return EOpConvFloatToInt;
			case Main.E_OP_CONV_FLOAT_TO_INT64:
				return EOpConvFloatToInt64;
			case Main.E_OP_CONV_FLOAT_TO_UINT8:
				return EOpConvFloatToUint8;
			case Main.E_OP_CONV_FLOAT_TO_UINT16:
				return EOpConvFloatToUint16;
			case Main.E_OP_CONV_FLOAT_TO_UINT:
				return EOpConvFloatToUint;
			case Main.E_OP_CONV_FLOAT_TO_UINT64:
				return EOpConvFloatToUint64;
			case Main.E_OP_CONV_FLOAT_TO_FLOAT16:
				return EOpConvFloatToFloat16;
			case Main.E_OP_CONV_FLOAT_TO_DOUBLE:
				return EOpConvFloatToDouble;
			case Main.E_OP_CONV_DOUBLE_TO_INT8:
				return EOpConvDoubleToInt8;
			case Main.E_OP_CONV_DOUBLE_TO_INT16:
				return EOpConvDoubleToInt16;
			case Main.E_OP_CONV_DOUBLE_TO_INT:
				return EOpConvDoubleToInt;
			case Main.E_OP_CONV_DOUBLE_TO_INT64:
				return EOpConvDoubleToInt64;
			case Main.E_OP_CONV_DOUBLE_TO_UINT8:
				return EOpConvDoubleToUint8;
			case Main.E_OP_CONV_DOUBLE_TO_UINT16:
				return EOpConvDoubleToUint16;
			case Main.E_OP_CONV_DOUBLE_TO_UINT:
				return EOpConvDoubleToUint;
			case Main.E_OP_CONV_DOUBLE_TO_UINT64:
				return EOpConvDoubleToUint64;
			case Main.E_OP_CONV_DOUBLE_TO_FLOAT16:
				return EOpConvDoubleToFloat16;
			case Main.E_OP_CONV_DOUBLE_TO_FLOAT:
				return EOpConvDoubleToFloat;
			case Main.E_OP_CONV_UINT64_TO_PTR:
				return EOpConvUint64ToPtr;
			case Main.E_OP_CONV_PTR_TO_UINT64:
				return EOpConvPtrToUint64;
			case Main.E_OP_CONV_UVEC2_TO_PTR:
				return EOpConvUvec2ToPtr;
			case Main.E_OP_CONV_PTR_TO_UVEC2:
				return EOpConvPtrToUvec2;
			case Main.E_OP_ADD:
				return EOpAdd;
			case Main.E_OP_SUB:
				return EOpSub;
			case Main.E_OP_MUL:
				return EOpMul;
			case Main.E_OP_DIV:
				return EOpDiv;
			case Main.E_OP_MOD:
				return EOpMod;
			case Main.E_OP_RIGHT_SHIFT:
				return EOpRightShift;
			case Main.E_OP_LEFT_SHIFT:
				return EOpLeftShift;
			case Main.E_OP_AND:
				return EOpAnd;
			case Main.E_OP_INCLUSIVE_OR:
				return EOpInclusiveOr;
			case Main.E_OP_EXCLUSIVE_OR:
				return EOpExclusiveOr;
			case Main.E_OP_EQUAL:
				return EOpEqual;
			case Main.E_OP_NOT_EQUAL:
				return EOpNotEqual;
			case Main.E_OP_VECTOR_EQUAL:
				return EOpVectorEqual;
			case Main.E_OP_VECTOR_NOT_EQUAL:
				return EOpVectorNotEqual;
			case Main.E_OP_LESS_THAN:
				return EOpLessThan;
			case Main.E_OP_GREATER_THAN:
				return EOpGreaterThan;
			case Main.E_OP_LESS_THAN_EQUAL:
				return EOpLessThanEqual;
			case Main.E_OP_GREATER_THAN_EQUAL:
				return EOpGreaterThanEqual;
			case Main.E_OP_COMMA:
				return EOpComma;
			case Main.E_OP_VECTOR_TIMES_SCALAR:
				return EOpVectorTimesScalar;
			case Main.E_OP_VECTOR_TIMES_MATRIX:
				return EOpVectorTimesMatrix;
			case Main.E_OP_MATRIX_TIMES_VECTOR:
				return EOpMatrixTimesVector;
			case Main.E_OP_MATRIX_TIMES_SCALAR:
				return EOpMatrixTimesScalar;
			case Main.E_OP_LOGICAL_OR:
				return EOpLogicalOr;
			case Main.E_OP_LOGICAL_XOR:
				return EOpLogicalXor;
			case Main.E_OP_LOGICAL_AND:
				return EOpLogicalAnd;
			case Main.E_OP_INDEX_DIRECT:
				return EOpIndexDirect;
			case Main.E_OP_INDEX_INDIRECT:
				return EOpIndexIndirect;
			case Main.E_OP_INDEX_DIRECT_STRUCT:
				return EOpIndexDirectStruct;
			case Main.E_OP_VECTOR_SWIZZLE:
				return EOpVectorSwizzle;
			case Main.E_OP_METHOD:
				return EOpMethod;
			case Main.E_OP_SCOPING:
				return EOpScoping;
			case Main.E_OP_RADIANS:
				return EOpRadians;
			case Main.E_OP_DEGREES:
				return EOpDegrees;
			case Main.E_OP_SIN:
				return EOpSin;
			case Main.E_OP_COS:
				return EOpCos;
			case Main.E_OP_TAN:
				return EOpTan;
			case Main.E_OP_ASIN:
				return EOpAsin;
			case Main.E_OP_ACOS:
				return EOpAcos;
			case Main.E_OP_ATAN:
				return EOpAtan;
			case Main.E_OP_SINH:
				return EOpSinh;
			case Main.E_OP_COSH:
				return EOpCosh;
			case Main.E_OP_TANH:
				return EOpTanh;
			case Main.E_OP_ASINH:
				return EOpAsinh;
			case Main.E_OP_ACOSH:
				return EOpAcosh;
			case Main.E_OP_ATANH:
				return EOpAtanh;
			case Main.E_OP_POW:
				return EOpPow;
			case Main.E_OP_EXP:
				return EOpExp;
			case Main.E_OP_LOG:
				return EOpLog;
			case Main.E_OP_EXP2:
				return EOpExp2;
			case Main.E_OP_LOG2:
				return EOpLog2;
			case Main.E_OP_SQRT:
				return EOpSqrt;
			case Main.E_OP_INVERSE_SQRT:
				return EOpInverseSqrt;
			case Main.E_OP_ABS:
				return EOpAbs;
			case Main.E_OP_SIGN:
				return EOpSign;
			case Main.E_OP_FLOOR:
				return EOpFloor;
			case Main.E_OP_TRUNC:
				return EOpTrunc;
			case Main.E_OP_ROUND:
				return EOpRound;
			case Main.E_OP_ROUND_EVEN:
				return EOpRoundEven;
			case Main.E_OP_CEIL:
				return EOpCeil;
			case Main.E_OP_FRACT:
				return EOpFract;
			case Main.E_OP_MODF:
				return EOpModf;
			case Main.E_OP_MIN:
				return EOpMin;
			case Main.E_OP_MAX:
				return EOpMax;
			case Main.E_OP_CLAMP:
				return EOpClamp;
			case Main.E_OP_MIX:
				return EOpMix;
			case Main.E_OP_STEP:
				return EOpStep;
			case Main.E_OP_SMOOTH_STEP:
				return EOpSmoothStep;
			case Main.E_OP_IS_NAN:
				return EOpIsNan;
			case Main.E_OP_IS_INF:
				return EOpIsInf;
			case Main.E_OP_FMA:
				return EOpFma;
			case Main.E_OP_FREXP:
				return EOpFrexp;
			case Main.E_OP_LDEXP:
				return EOpLdexp;
			case Main.E_OP_FLOAT_BITS_TO_INT:
				return EOpFloatBitsToInt;
			case Main.E_OP_FLOAT_BITS_TO_UINT:
				return EOpFloatBitsToUint;
			case Main.E_OP_INT_BITS_TO_FLOAT:
				return EOpIntBitsToFloat;
			case Main.E_OP_UINT_BITS_TO_FLOAT:
				return EOpUintBitsToFloat;
			case Main.E_OP_DOUBLE_BITS_TO_INT64:
				return EOpDoubleBitsToInt64;
			case Main.E_OP_DOUBLE_BITS_TO_UINT64:
				return EOpDoubleBitsToUint64;
			case Main.E_OP_INT64_BITS_TO_DOUBLE:
				return EOpInt64BitsToDouble;
			case Main.E_OP_UINT64_BITS_TO_DOUBLE:
				return EOpUint64BitsToDouble;
			case Main.E_OP_FLOAT16_BITS_TO_INT16:
				return EOpFloat16BitsToInt16;
			case Main.E_OP_FLOAT16_BITS_TO_UINT16:
				return EOpFloat16BitsToUint16;
			case Main.E_OP_INT16_BITS_TO_FLOAT16:
				return EOpInt16BitsToFloat16;
			case Main.E_OP_UINT16_BITS_TO_FLOAT16:
				return EOpUint16BitsToFloat16;
			case Main.E_OP_PACK_SNORM2X16:
				return EOpPackSnorm2x16;
			case Main.E_OP_UNPACK_SNORM2X16:
				return EOpUnpackSnorm2x16;
			case Main.E_OP_PACK_UNORM2X16:
				return EOpPackUnorm2x16;
			case Main.E_OP_UNPACK_UNORM2X16:
				return EOpUnpackUnorm2x16;
			case Main.E_OP_PACK_SNORM4X8:
				return EOpPackSnorm4x8;
			case Main.E_OP_UNPACK_SNORM4X8:
				return EOpUnpackSnorm4x8;
			case Main.E_OP_PACK_UNORM4X8:
				return EOpPackUnorm4x8;
			case Main.E_OP_UNPACK_UNORM4X8:
				return EOpUnpackUnorm4x8;
			case Main.E_OP_PACK_HALF2X16:
				return EOpPackHalf2x16;
			case Main.E_OP_UNPACK_HALF2X16:
				return EOpUnpackHalf2x16;
			case Main.E_OP_PACK_DOUBLE2X32:
				return EOpPackDouble2x32;
			case Main.E_OP_UNPACK_DOUBLE2X32:
				return EOpUnpackDouble2x32;
			case Main.E_OP_PACK_INT2X32:
				return EOpPackInt2x32;
			case Main.E_OP_UNPACK_INT2X32:
				return EOpUnpackInt2x32;
			case Main.E_OP_PACK_UINT2X32:
				return EOpPackUint2x32;
			case Main.E_OP_UNPACK_UINT2X32:
				return EOpUnpackUint2x32;
			case Main.E_OP_PACK_FLOAT2X16:
				return EOpPackFloat2x16;
			case Main.E_OP_UNPACK_FLOAT2X16:
				return EOpUnpackFloat2x16;
			case Main.E_OP_PACK_INT2X16:
				return EOpPackInt2x16;
			case Main.E_OP_UNPACK_INT2X16:
				return EOpUnpackInt2x16;
			case Main.E_OP_PACK_UINT2X16:
				return EOpPackUint2x16;
			case Main.E_OP_UNPACK_UINT2X16:
				return EOpUnpackUint2x16;
			case Main.E_OP_PACK_INT4X16:
				return EOpPackInt4x16;
			case Main.E_OP_UNPACK_INT4X16:
				return EOpUnpackInt4x16;
			case Main.E_OP_PACK_UINT4X16:
				return EOpPackUint4x16;
			case Main.E_OP_UNPACK_UINT4X16:
				return EOpUnpackUint4x16;
			case Main.E_OP_PACK16:
				return EOpPack16;
			case Main.E_OP_PACK32:
				return EOpPack32;
			case Main.E_OP_PACK64:
				return EOpPack64;
			case Main.E_OP_UNPACK32:
				return EOpUnpack32;
			case Main.E_OP_UNPACK16:
				return EOpUnpack16;
			case Main.E_OP_UNPACK8:
				return EOpUnpack8;
			case Main.E_OP_LENGTH:
				return EOpLength;
			case Main.E_OP_DISTANCE:
				return EOpDistance;
			case Main.E_OP_DOT:
				return EOpDot;
			case Main.E_OP_CROSS:
				return EOpCross;
			case Main.E_OP_NORMALIZE:
				return EOpNormalize;
			case Main.E_OP_FACE_FORWARD:
				return EOpFaceForward;
			case Main.E_OP_REFLECT:
				return EOpReflect;
			case Main.E_OP_REFRACT:
				return EOpRefract;
			case Main.E_OP_MIN3:
				return EOpMin3;
			case Main.E_OP_MAX3:
				return EOpMax3;
			case Main.E_OP_MID3:
				return EOpMid3;
			case Main.E_OP_DPDX:
				return EOpDPdx;
			case Main.E_OP_DPDY:
				return EOpDPdy;
			case Main.E_OP_FWIDTH:
				return EOpFwidth;
			case Main.E_OP_DPDXFINE:
				return EOpDPdxFine;
			case Main.E_OP_DPDYFINE:
				return EOpDPdyFine;
			case Main.E_OP_FWIDTH_FINE:
				return EOpFwidthFine;
			case Main.E_OP_DPDXCOARSE:
				return EOpDPdxCoarse;
			case Main.E_OP_DPDYCOARSE:
				return EOpDPdyCoarse;
			case Main.E_OP_FWIDTH_COARSE:
				return EOpFwidthCoarse;
			case Main.E_OP_INTERPOLATE_AT_CENTROID:
				return EOpInterpolateAtCentroid;
			case Main.E_OP_INTERPOLATE_AT_SAMPLE:
				return EOpInterpolateAtSample;
			case Main.E_OP_INTERPOLATE_AT_OFFSET:
				return EOpInterpolateAtOffset;
			case Main.E_OP_INTERPOLATE_AT_VERTEX:
				return EOpInterpolateAtVertex;
			case Main.E_OP_MATRIX_TIMES_MATRIX:
				return EOpMatrixTimesMatrix;
			case Main.E_OP_OUTER_PRODUCT:
				return EOpOuterProduct;
			case Main.E_OP_DETERMINANT:
				return EOpDeterminant;
			case Main.E_OP_MATRIX_INVERSE:
				return EOpMatrixInverse;
			case Main.E_OP_TRANSPOSE:
				return EOpTranspose;
			case Main.E_OP_FTRANSFORM:
				return EOpFtransform;
			case Main.E_OP_NOISE:
				return EOpNoise;
			case Main.E_OP_EMIT_VERTEX:
				return EOpEmitVertex;
			case Main.E_OP_END_PRIMITIVE:
				return EOpEndPrimitive;
			case Main.E_OP_EMIT_STREAM_VERTEX:
				return EOpEmitStreamVertex;
			case Main.E_OP_END_STREAM_PRIMITIVE:
				return EOpEndStreamPrimitive;
			case Main.E_OP_BARRIER:
				return EOpBarrier;
			case Main.E_OP_MEMORY_BARRIER:
				return EOpMemoryBarrier;
			case Main.E_OP_MEMORY_BARRIER_ATOMIC_COUNTER:
				return EOpMemoryBarrierAtomicCounter;
			case Main.E_OP_MEMORY_BARRIER_BUFFER:
				return EOpMemoryBarrierBuffer;
			case Main.E_OP_MEMORY_BARRIER_IMAGE:
				return EOpMemoryBarrierImage;
			case Main.E_OP_MEMORY_BARRIER_SHARED:
				return EOpMemoryBarrierShared;
			case Main.E_OP_GROUP_MEMORY_BARRIER:
				return EOpGroupMemoryBarrier;
			case Main.E_OP_BALLOT:
				return EOpBallot;
			case Main.E_OP_READ_INVOCATION:
				return EOpReadInvocation;
			case Main.E_OP_READ_FIRST_INVOCATION:
				return EOpReadFirstInvocation;
			case Main.E_OP_ANY_INVOCATION:
				return EOpAnyInvocation;
			case Main.E_OP_ALL_INVOCATIONS:
				return EOpAllInvocations;
			case Main.E_OP_ALL_INVOCATIONS_EQUAL:
				return EOpAllInvocationsEqual;
			case Main.E_OP_SUBGROUP_GUARD_START:
				return EOpSubgroupGuardStart;
			case Main.E_OP_SUBGROUP_BARRIER:
				return EOpSubgroupBarrier;
			case Main.E_OP_SUBGROUP_MEMORY_BARRIER:
				return EOpSubgroupMemoryBarrier;
			case Main.E_OP_SUBGROUP_MEMORY_BARRIER_BUFFER:
				return EOpSubgroupMemoryBarrierBuffer;
			case Main.E_OP_SUBGROUP_MEMORY_BARRIER_IMAGE:
				return EOpSubgroupMemoryBarrierImage;
			case Main.E_OP_SUBGROUP_MEMORY_BARRIER_SHARED:
				return EOpSubgroupMemoryBarrierShared;
			case Main.E_OP_SUBGROUP_ELECT:
				return EOpSubgroupElect;
			case Main.E_OP_SUBGROUP_ALL:
				return EOpSubgroupAll;
			case Main.E_OP_SUBGROUP_ANY:
				return EOpSubgroupAny;
			case Main.E_OP_SUBGROUP_ALL_EQUAL:
				return EOpSubgroupAllEqual;
			case Main.E_OP_SUBGROUP_BROADCAST:
				return EOpSubgroupBroadcast;
			case Main.E_OP_SUBGROUP_BROADCAST_FIRST:
				return EOpSubgroupBroadcastFirst;
			case Main.E_OP_SUBGROUP_BALLOT:
				return EOpSubgroupBallot;
			case Main.E_OP_SUBGROUP_INVERSE_BALLOT:
				return EOpSubgroupInverseBallot;
			case Main.E_OP_SUBGROUP_BALLOT_BIT_EXTRACT:
				return EOpSubgroupBallotBitExtract;
			case Main.E_OP_SUBGROUP_BALLOT_BIT_COUNT:
				return EOpSubgroupBallotBitCount;
			case Main.E_OP_SUBGROUP_BALLOT_INCLUSIVE_BIT_COUNT:
				return EOpSubgroupBallotInclusiveBitCount;
			case Main.E_OP_SUBGROUP_BALLOT_EXCLUSIVE_BIT_COUNT:
				return EOpSubgroupBallotExclusiveBitCount;
			case Main.E_OP_SUBGROUP_BALLOT_FIND_LSB:
				return EOpSubgroupBallotFindLSB;
			case Main.E_OP_SUBGROUP_BALLOT_FIND_MSB:
				return EOpSubgroupBallotFindMSB;
			case Main.E_OP_SUBGROUP_SHUFFLE:
				return EOpSubgroupShuffle;
			case Main.E_OP_SUBGROUP_SHUFFLE_XOR:
				return EOpSubgroupShuffleXor;
			case Main.E_OP_SUBGROUP_SHUFFLE_UP:
				return EOpSubgroupShuffleUp;
			case Main.E_OP_SUBGROUP_SHUFFLE_DOWN:
				return EOpSubgroupShuffleDown;
			case Main.E_OP_SUBGROUP_ADD:
				return EOpSubgroupAdd;
			case Main.E_OP_SUBGROUP_MUL:
				return EOpSubgroupMul;
			case Main.E_OP_SUBGROUP_MIN:
				return EOpSubgroupMin;
			case Main.E_OP_SUBGROUP_MAX:
				return EOpSubgroupMax;
			case Main.E_OP_SUBGROUP_AND:
				return EOpSubgroupAnd;
			case Main.E_OP_SUBGROUP_OR:
				return EOpSubgroupOr;
			case Main.E_OP_SUBGROUP_XOR:
				return EOpSubgroupXor;
			case Main.E_OP_SUBGROUP_INCLUSIVE_ADD:
				return EOpSubgroupInclusiveAdd;
			case Main.E_OP_SUBGROUP_INCLUSIVE_MUL:
				return EOpSubgroupInclusiveMul;
			case Main.E_OP_SUBGROUP_INCLUSIVE_MIN:
				return EOpSubgroupInclusiveMin;
			case Main.E_OP_SUBGROUP_INCLUSIVE_MAX:
				return EOpSubgroupInclusiveMax;
			case Main.E_OP_SUBGROUP_INCLUSIVE_AND:
				return EOpSubgroupInclusiveAnd;
			case Main.E_OP_SUBGROUP_INCLUSIVE_OR:
				return EOpSubgroupInclusiveOr;
			case Main.E_OP_SUBGROUP_INCLUSIVE_XOR:
				return EOpSubgroupInclusiveXor;
			case Main.E_OP_SUBGROUP_EXCLUSIVE_ADD:
				return EOpSubgroupExclusiveAdd;
			case Main.E_OP_SUBGROUP_EXCLUSIVE_MUL:
				return EOpSubgroupExclusiveMul;
			case Main.E_OP_SUBGROUP_EXCLUSIVE_MIN:
				return EOpSubgroupExclusiveMin;
			case Main.E_OP_SUBGROUP_EXCLUSIVE_MAX:
				return EOpSubgroupExclusiveMax;
			case Main.E_OP_SUBGROUP_EXCLUSIVE_AND:
				return EOpSubgroupExclusiveAnd;
			case Main.E_OP_SUBGROUP_EXCLUSIVE_OR:
				return EOpSubgroupExclusiveOr;
			case Main.E_OP_SUBGROUP_EXCLUSIVE_XOR:
				return EOpSubgroupExclusiveXor;
			case Main.E_OP_SUBGROUP_CLUSTERED_ADD:
				return EOpSubgroupClusteredAdd;
			case Main.E_OP_SUBGROUP_CLUSTERED_MUL:
				return EOpSubgroupClusteredMul;
			case Main.E_OP_SUBGROUP_CLUSTERED_MIN:
				return EOpSubgroupClusteredMin;
			case Main.E_OP_SUBGROUP_CLUSTERED_MAX:
				return EOpSubgroupClusteredMax;
			case Main.E_OP_SUBGROUP_CLUSTERED_AND:
				return EOpSubgroupClusteredAnd;
			case Main.E_OP_SUBGROUP_CLUSTERED_OR:
				return EOpSubgroupClusteredOr;
			case Main.E_OP_SUBGROUP_CLUSTERED_XOR:
				return EOpSubgroupClusteredXor;
			case Main.E_OP_SUBGROUP_QUAD_BROADCAST:
				return EOpSubgroupQuadBroadcast;
			case Main.E_OP_SUBGROUP_QUAD_SWAP_HORIZONTAL:
				return EOpSubgroupQuadSwapHorizontal;
			case Main.E_OP_SUBGROUP_QUAD_SWAP_VERTICAL:
				return EOpSubgroupQuadSwapVertical;
			case Main.E_OP_SUBGROUP_QUAD_SWAP_DIAGONAL:
				return EOpSubgroupQuadSwapDiagonal;
			case Main.E_OP_SUBGROUP_PARTITION:
				return EOpSubgroupPartition;
			case Main.E_OP_SUBGROUP_PARTITIONED_ADD:
				return EOpSubgroupPartitionedAdd;
			case Main.E_OP_SUBGROUP_PARTITIONED_MUL:
				return EOpSubgroupPartitionedMul;
			case Main.E_OP_SUBGROUP_PARTITIONED_MIN:
				return EOpSubgroupPartitionedMin;
			case Main.E_OP_SUBGROUP_PARTITIONED_MAX:
				return EOpSubgroupPartitionedMax;
			case Main.E_OP_SUBGROUP_PARTITIONED_AND:
				return EOpSubgroupPartitionedAnd;
			case Main.E_OP_SUBGROUP_PARTITIONED_OR:
				return EOpSubgroupPartitionedOr;
			case Main.E_OP_SUBGROUP_PARTITIONED_XOR:
				return EOpSubgroupPartitionedXor;
			case Main.E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_ADD:
				return EOpSubgroupPartitionedInclusiveAdd;
			case Main.E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_MUL:
				return EOpSubgroupPartitionedInclusiveMul;
			case Main.E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_MIN:
				return EOpSubgroupPartitionedInclusiveMin;
			case Main.E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_MAX:
				return EOpSubgroupPartitionedInclusiveMax;
			case Main.E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_AND:
				return EOpSubgroupPartitionedInclusiveAnd;
			case Main.E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_OR:
				return EOpSubgroupPartitionedInclusiveOr;
			case Main.E_OP_SUBGROUP_PARTITIONED_INCLUSIVE_XOR:
				return EOpSubgroupPartitionedInclusiveXor;
			case Main.E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_ADD:
				return EOpSubgroupPartitionedExclusiveAdd;
			case Main.E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_MUL:
				return EOpSubgroupPartitionedExclusiveMul;
			case Main.E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_MIN:
				return EOpSubgroupPartitionedExclusiveMin;
			case Main.E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_MAX:
				return EOpSubgroupPartitionedExclusiveMax;
			case Main.E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_AND:
				return EOpSubgroupPartitionedExclusiveAnd;
			case Main.E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_OR:
				return EOpSubgroupPartitionedExclusiveOr;
			case Main.E_OP_SUBGROUP_PARTITIONED_EXCLUSIVE_XOR:
				return EOpSubgroupPartitionedExclusiveXor;
			case Main.E_OP_SUBGROUP_GUARD_STOP:
				return EOpSubgroupGuardStop;
			case Main.E_OP_MIN_INVOCATIONS:
				return EOpMinInvocations;
			case Main.E_OP_MAX_INVOCATIONS:
				return EOpMaxInvocations;
			case Main.E_OP_ADD_INVOCATIONS:
				return EOpAddInvocations;
			case Main.E_OP_MIN_INVOCATIONS_NON_UNIFORM:
				return EOpMinInvocationsNonUniform;
			case Main.E_OP_MAX_INVOCATIONS_NON_UNIFORM:
				return EOpMaxInvocationsNonUniform;
			case Main.E_OP_ADD_INVOCATIONS_NON_UNIFORM:
				return EOpAddInvocationsNonUniform;
			case Main.E_OP_MIN_INVOCATIONS_INCLUSIVE_SCAN:
				return EOpMinInvocationsInclusiveScan;
			case Main.E_OP_MAX_INVOCATIONS_INCLUSIVE_SCAN:
				return EOpMaxInvocationsInclusiveScan;
			case Main.E_OP_ADD_INVOCATIONS_INCLUSIVE_SCAN:
				return EOpAddInvocationsInclusiveScan;
			case Main.E_OP_MIN_INVOCATIONS_INCLUSIVE_SCAN_NON_UNIFORM:
				return EOpMinInvocationsInclusiveScanNonUniform;
			case Main.E_OP_MAX_INVOCATIONS_INCLUSIVE_SCAN_NON_UNIFORM:
				return EOpMaxInvocationsInclusiveScanNonUniform;
			case Main.E_OP_ADD_INVOCATIONS_INCLUSIVE_SCAN_NON_UNIFORM:
				return EOpAddInvocationsInclusiveScanNonUniform;
			case Main.E_OP_MIN_INVOCATIONS_EXCLUSIVE_SCAN:
				return EOpMinInvocationsExclusiveScan;
			case Main.E_OP_MAX_INVOCATIONS_EXCLUSIVE_SCAN:
				return EOpMaxInvocationsExclusiveScan;
			case Main.E_OP_ADD_INVOCATIONS_EXCLUSIVE_SCAN:
				return EOpAddInvocationsExclusiveScan;
			case Main.E_OP_MIN_INVOCATIONS_EXCLUSIVE_SCAN_NON_UNIFORM:
				return EOpMinInvocationsExclusiveScanNonUniform;
			case Main.E_OP_MAX_INVOCATIONS_EXCLUSIVE_SCAN_NON_UNIFORM:
				return EOpMaxInvocationsExclusiveScanNonUniform;
			case Main.E_OP_ADD_INVOCATIONS_EXCLUSIVE_SCAN_NON_UNIFORM:
				return EOpAddInvocationsExclusiveScanNonUniform;
			case Main.E_OP_SWIZZLE_INVOCATIONS:
				return EOpSwizzleInvocations;
			case Main.E_OP_SWIZZLE_INVOCATIONS_MASKED:
				return EOpSwizzleInvocationsMasked;
			case Main.E_OP_WRITE_INVOCATION:
				return EOpWriteInvocation;
			case Main.E_OP_MBCNT:
				return EOpMbcnt;
			case Main.E_OP_CUBE_FACE_INDEX:
				return EOpCubeFaceIndex;
			case Main.E_OP_CUBE_FACE_COORD:
				return EOpCubeFaceCoord;
			case Main.E_OP_TIME:
				return EOpTime;
			case Main.E_OP_ATOMIC_ADD:
				return EOpAtomicAdd;
			case Main.E_OP_ATOMIC_MIN:
				return EOpAtomicMin;
			case Main.E_OP_ATOMIC_MAX:
				return EOpAtomicMax;
			case Main.E_OP_ATOMIC_AND:
				return EOpAtomicAnd;
			case Main.E_OP_ATOMIC_OR:
				return EOpAtomicOr;
			case Main.E_OP_ATOMIC_XOR:
				return EOpAtomicXor;
			case Main.E_OP_ATOMIC_EXCHANGE:
				return EOpAtomicExchange;
			case Main.E_OP_ATOMIC_COMP_SWAP:
				return EOpAtomicCompSwap;
			case Main.E_OP_ATOMIC_LOAD:
				return EOpAtomicLoad;
			case Main.E_OP_ATOMIC_STORE:
				return EOpAtomicStore;
			case Main.E_OP_ATOMIC_COUNTER_INCREMENT:
				return EOpAtomicCounterIncrement;
			case Main.E_OP_ATOMIC_COUNTER_DECREMENT:
				return EOpAtomicCounterDecrement;
			case Main.E_OP_ATOMIC_COUNTER:
				return EOpAtomicCounter;
			case Main.E_OP_ATOMIC_COUNTER_ADD:
				return EOpAtomicCounterAdd;
			case Main.E_OP_ATOMIC_COUNTER_SUBTRACT:
				return EOpAtomicCounterSubtract;
			case Main.E_OP_ATOMIC_COUNTER_MIN:
				return EOpAtomicCounterMin;
			case Main.E_OP_ATOMIC_COUNTER_MAX:
				return EOpAtomicCounterMax;
			case Main.E_OP_ATOMIC_COUNTER_AND:
				return EOpAtomicCounterAnd;
			case Main.E_OP_ATOMIC_COUNTER_OR:
				return EOpAtomicCounterOr;
			case Main.E_OP_ATOMIC_COUNTER_XOR:
				return EOpAtomicCounterXor;
			case Main.E_OP_ATOMIC_COUNTER_EXCHANGE:
				return EOpAtomicCounterExchange;
			case Main.E_OP_ATOMIC_COUNTER_COMP_SWAP:
				return EOpAtomicCounterCompSwap;
			case Main.E_OP_ANY:
				return EOpAny;
			case Main.E_OP_ALL:
				return EOpAll;
			case Main.E_OP_COOPERATIVE_MATRIX_LOAD:
				return EOpCooperativeMatrixLoad;
			case Main.E_OP_COOPERATIVE_MATRIX_STORE:
				return EOpCooperativeMatrixStore;
			case Main.E_OP_COOPERATIVE_MATRIX_MUL_ADD:
				return EOpCooperativeMatrixMulAdd;
			case Main.E_OP_BEGIN_INVOCATION_INTERLOCK:
				return EOpBeginInvocationInterlock;
			case Main.E_OP_END_INVOCATION_INTERLOCK:
				return EOpEndInvocationInterlock;
			case Main.E_OP_IS_HELPER_INVOCATION:
				return EOpIsHelperInvocation;
			case Main.E_OP_DEBUG_PRINTF:
				return EOpDebugPrintf;
			case Main.E_OP_KILL:
				return EOpKill;
			case Main.E_OP_RETURN:
				return EOpReturn;
			case Main.E_OP_BREAK:
				return EOpBreak;
			case Main.E_OP_CONTINUE:
				return EOpContinue;
			case Main.E_OP_CASE:
				return EOpCase;
			case Main.E_OP_DEFAULT:
				return EOpDefault;
			case Main.E_OP_DEMOTE:
				return EOpDemote;
			case Main.E_OP_CONSTRUCT_GUARD_START:
				return EOpConstructGuardStart;
			case Main.E_OP_CONSTRUCT_INT:
				return EOpConstructInt;
			case Main.E_OP_CONSTRUCT_UINT:
				return EOpConstructUint;
			case Main.E_OP_CONSTRUCT_INT8:
				return EOpConstructInt8;
			case Main.E_OP_CONSTRUCT_UINT8:
				return EOpConstructUint8;
			case Main.E_OP_CONSTRUCT_INT16:
				return EOpConstructInt16;
			case Main.E_OP_CONSTRUCT_UINT16:
				return EOpConstructUint16;
			case Main.E_OP_CONSTRUCT_INT64:
				return EOpConstructInt64;
			case Main.E_OP_CONSTRUCT_UINT64:
				return EOpConstructUint64;
			case Main.E_OP_CONSTRUCT_BOOL:
				return EOpConstructBool;
			case Main.E_OP_CONSTRUCT_FLOAT:
				return EOpConstructFloat;
			case Main.E_OP_CONSTRUCT_DOUBLE:
				return EOpConstructDouble;
			case Main.E_OP_CONSTRUCT_VEC2:
				return EOpConstructVec2;
			case Main.E_OP_CONSTRUCT_VEC3:
				return EOpConstructVec3;
			case Main.E_OP_CONSTRUCT_VEC4:
				return EOpConstructVec4;
			case Main.E_OP_CONSTRUCT_MAT2X2:
				return EOpConstructMat2x2;
			case Main.E_OP_CONSTRUCT_MAT2X3:
				return EOpConstructMat2x3;
			case Main.E_OP_CONSTRUCT_MAT2X4:
				return EOpConstructMat2x4;
			case Main.E_OP_CONSTRUCT_MAT3X2:
				return EOpConstructMat3x2;
			case Main.E_OP_CONSTRUCT_MAT3X3:
				return EOpConstructMat3x3;
			case Main.E_OP_Construct_Mat3x4:
				return EOpConstructMat3x4;
			case Main.E_OP_CONSTRUCT_MAT4X2:
				return EOpConstructMat4x2;
			case Main.E_OP_CONSTRUCT_MAT4X3:
				return EOpConstructMat4x3;
			case Main.E_OP_CONSTRUCT_MAT4X4:
				return EOpConstructMat4x4;
			case Main.E_OP_CONSTRUCT_DVEC2:
				return EOpConstructDVec2;
			case Main.E_OP_CONSTRUCT_DVEC3:
				return EOpConstructDVec3;
			case Main.E_OP_CONSTRUCT_DVEC4:
				return EOpConstructDVec4;
			case Main.E_OP_CONSTRUCT_BVEC2:
				return EOpConstructBVec2;
			case Main.E_OP_CONSTRUCT_BVEC3:
				return EOpConstructBVec3;
			case Main.E_OP_CONSTRUCT_BVEC4:
				return EOpConstructBVec4;
			case Main.E_OP_CONSTRUCT_I8_VEC2:
				return EOpConstructI8Vec2;
			case Main.E_OP_CONSTRUCT_I8_VEC3:
				return EOpConstructI8Vec3;
			case Main.E_OP_CONSTRUCT_I8_VEC4:
				return EOpConstructI8Vec4;
			case Main.E_OP_CONSTRUCT_U8_VEC2:
				return EOpConstructU8Vec2;
			case Main.E_OP_CONSTRUCT_U8_VEC3:
				return EOpConstructU8Vec3;
			case Main.E_OP_CONSTRUCT_U8_VEC4:
				return EOpConstructU8Vec4;
			case Main.E_OP_CONSTRUCT_I16_VEC2:
				return EOpConstructI16Vec2;
			case Main.E_OP_CONSTRUCT_I16_VEC3:
				return EOpConstructI16Vec3;
			case Main.E_OP_CONSTRUCT_I16_VEC4:
				return EOpConstructI16Vec4;
			case Main.E_OP_CONSTRUCT_U16_VEC2:
				return EOpConstructU16Vec2;
			case Main.E_OP_CONSTRUCT_U16_VEC3:
				return EOpConstructU16Vec3;
			case Main.E_OP_CONSTRUCT_U16_VEC4:
				return EOpConstructU16Vec4;
			case Main.E_OP_CONSTRUCT_IVEC2:
				return EOpConstructIVec2;
			case Main.E_OP_CONSTRUCT_IVEC3:
				return EOpConstructIVec3;
			case Main.E_OP_CONSTRUCT_IVEC4:
				return EOpConstructIVec4;
			case Main.E_OP_CONSTRUCT_UVEC2:
				return EOpConstructUVec2;
			case Main.E_OP_CONSTRUCT_UVEC3:
				return EOpConstructUVec3;
			case Main.E_OP_CONSTRUCT_UVEC4:
				return EOpConstructUVec4;
			case Main.E_OP_CONSTRUCT_I64_VEC2:
				return EOpConstructI64Vec2;
			case Main.E_OP_CONSTRUCT_I64_VEC3:
				return EOpConstructI64Vec3;
			case Main.E_OP_CONSTRUCT_I64_VEC4:
				return EOpConstructI64Vec4;
			case Main.E_OP_CONSTRUCT_U64_VEC2:
				return EOpConstructU64Vec2;
			case Main.E_OP_CONSTRUCT_U64_VEC3:
				return EOpConstructU64Vec3;
			case Main.E_OP_CONSTRUCT_U64_VEC4:
				return EOpConstructU64Vec4;
			case Main.E_OP_CONSTRUCT_DMAT2X2:
				return EOpConstructDMat2x2;
			case Main.E_OP_CONSTRUCT_DMAT2X3:
				return EOpConstructDMat2x3;
			case Main.E_OP_CONSTRUCT_DMAT2X4:
				return EOpConstructDMat2x4;
			case Main.E_OP_CONSTRUCT_DMAT3X2:
				return EOpConstructDMat3x2;
			case Main.E_OP_CONSTRUCT_DMAT3X3:
				return EOpConstructDMat3x3;
			case Main.E_OP_CONSTRUCT_DMAT3X4:
				return EOpConstructDMat3x4;
			case Main.E_OP_CONSTRUCT_DMAT4X2:
				return EOpConstructDMat4x2;
			case Main.E_OP_CONSTRUCT_DMAT4X3:
				return EOpConstructDMat4x3;
			case Main.E_OP_CONSTRUCT_DMAT4X4:
				return EOpConstructDMat4x4;
			case Main.E_OP_CONSTRUCT_IMAT2X2:
				return EOpConstructIMat2x2;
			case Main.E_OP_CONSTRUCT_IMAT2X3:
				return EOpConstructIMat2x3;
			case Main.E_OP_CONSTRUCT_IMAT2X4:
				return EOpConstructIMat2x4;
			case Main.E_OP_CONSTRUCT_IMAT3X2:
				return EOpConstructIMat3x2;
			case Main.E_OP_CONSTRUCT_IMAT3X3:
				return EOpConstructIMat3x3;
			case Main.E_OP_CONSTRUCT_IMAT3X4:
				return EOpConstructIMat3x4;
			case Main.E_OP_CONSTRUCT_IMAT4X2:
				return EOpConstructIMat4x2;
			case Main.E_OP_CONSTRUCT_IMAT4X3:
				return EOpConstructIMat4x3;
			case Main.E_OP_CONSTRUCT_IMAT4X4:
				return EOpConstructIMat4x4;
			case Main.E_OP_CONSTRUCT_UMAT2X2:
				return EOpConstructUMat2x2;
			case Main.E_OP_CONSTRUCT_UMAT2X3:
				return EOpConstructUMat2x3;
			case Main.E_OP_CONSTRUCT_UMAT2X4:
				return EOpConstructUMat2x4;
			case Main.E_OP_CONSTRUCT_UMAT3X2:
				return EOpConstructUMat3x2;
			case Main.E_OP_CONSTRUCT_UMAT3X3:
				return EOpConstructUMat3x3;
			case Main.E_OP_CONSTRUCT_UMAT3X4:
				return EOpConstructUMat3x4;
			case Main.E_OP_CONSTRUCT_UMAT4X2:
				return EOpConstructUMat4x2;
			case Main.E_OP_CONSTRUCT_UMAT4X3:
				return EOpConstructUMat4x3;
			case Main.E_OP_CONSTRUCT_UMAT4X4:
				return EOpConstructUMat4x4;
			case Main.E_OP_CONSTRUCT_BMAT2X2:
				return EOpConstructBMat2x2;
			case Main.E_OP_CONSTRUCT_BMAT2X3:
				return EOpConstructBMat2x3;
			case Main.E_OP_CONSTRUCT_BMAT2X4:
				return EOpConstructBMat2x4;
			case Main.E_OP_CONSTRUCT_BMAT3X2:
				return EOpConstructBMat3x2;
			case Main.E_OP_CONSTRUCT_BMAT3X3:
				return EOpConstructBMat3x3;
			case Main.E_OP_CONSTRUCT_BMAT3X4:
				return EOpConstructBMat3x4;
			case Main.E_OP_CONSTRUCT_BMAT4X2:
				return EOpConstructBMat4x2;
			case Main.E_OP_CONSTRUCT_BMAT4X3:
				return EOpConstructBMat4x3;
			case Main.E_OP_CONSTRUCT_BMAT4X4:
				return EOpConstructBMat4x4;
			case Main.E_OP_CONSTRUCT_FLOAT16:
				return EOpConstructFloat16;
			case Main.E_OP_CONSTRUCT_F16_VEC2:
				return EOpConstructF16Vec2;
			case Main.E_OP_CONSTRUCT_F16_VEC3:
				return EOpConstructF16Vec3;
			case Main.E_OP_CONSTRUCT_F16_VEC4:
				return EOpConstructF16Vec4;
			case Main.E_OP_CONSTRUCT_F16_MAT2X2:
				return EOpConstructF16Mat2x2;
			case Main.E_OP_CONSTRUCT_F16_MAT2X3:
				return EOpConstructF16Mat2x3;
			case Main.E_OP_CONSTRUCT_F16_MAT2X4:
				return EOpConstructF16Mat2x4;
			case Main.E_OP_CONSTRUCT_F16_MAT3X2:
				return EOpConstructF16Mat3x2;
			case Main.E_OP_CONSTRUCT_F16_MAT3X3:
				return EOpConstructF16Mat3x3;
			case Main.E_OP_CONSTRUCT_F16_MAT3X4:
				return EOpConstructF16Mat3x4;
			case Main.E_OP_CONSTRUCT_F16_MAT4X2:
				return EOpConstructF16Mat4x2;
			case Main.E_OP_CONSTRUCT_F16_MAT4X3:
				return EOpConstructF16Mat4x3;
			case Main.E_OP_CONSTRUCT_F16_MAT4X4:
				return EOpConstructF16Mat4x4;
			case Main.E_OP_CONSTRUCT_STRUCT:
				return EOpConstructStruct;
			case Main.E_OP_CONSTRUCT_TEXTURE_SAMPLER:
				return EOpConstructTextureSampler;
			case Main.E_OP_CONSTRUCT_NONUNIFORM:
				return EOpConstructNonuniform;
			case Main.E_OP_CONSTRUCT_REFERENCE:
				return EOpConstructReference;
			case Main.E_OP_CONSTRUCT_COOPERATIVE_MATRIX:
				return EOpConstructCooperativeMatrix;
			case Main.E_OP_CONSTRUCT_GUARD_END:
				return EOpConstructGuardEnd;
			case Main.E_OP_ASSIGN:
				return EOpAssign;
			case Main.E_OP_ADD_ASSIGN:
				return EOpAddAssign;
			case Main.E_OP_SUB_ASSIGN:
				return EOpSubAssign;
			case Main.E_OP_MUL_ASSIGN:
				return EOpMulAssign;
			case Main.E_OP_VECTOR_TIMES_MATRIX_ASSIGN:
				return EOpVectorTimesMatrixAssign;
			case Main.E_OP_VECTOR_TIMES_SCALAR_ASSIGN:
				return EOpVectorTimesScalarAssign;
			case Main.E_OP_MATRIX_TIMES_SCALAR_ASSIGN:
				return EOpMatrixTimesScalarAssign;
			case Main.E_OP_MATRIX_TIMES_MATRIX_ASSIGN:
				return EOpMatrixTimesMatrixAssign;
			case Main.E_OP_DIV_ASSIGN:
				return EOpDivAssign;
			case Main.E_OP_MOD_ASSIGN:
				return EOpModAssign;
			case Main.E_OP_AND_ASSIGN:
				return EOpAndAssign;
			case Main.E_OP_INCLUSIVE_OR_ASSIGN:
				return EOpInclusiveOrAssign;
			case Main.E_OP_EXCLUSIVE_OR_ASSIGN:
				return EOpExclusiveOrAssign;
			case Main.E_OP_LEFT_SHIFT_ASSIGN:
				return EOpLeftShiftAssign;
			case Main.E_OP_RIGHT_SHIFT_ASSIGN:
				return EOpRightShiftAssign;
			case Main.E_OP_ARRAY_LENGTH:
				return EOpArrayLength;
			case Main.E_OP_IMAGE_GUARD_BEGIN:
				return EOpImageGuardBegin;
			case Main.E_OP_IMAGE_QUERY_SIZE:
				return EOpImageQuerySize;
			case Main.E_OP_IMAGE_QUERY_SAMPLES:
				return EOpImageQuerySamples;
			case Main.E_OP_IMAGE_LOAD:
				return EOpImageLoad;
			case Main.E_OP_IMAGE_STORE:
				return EOpImageStore;
			case Main.E_OP_IMAGE_LOAD_LOD:
				return EOpImageLoadLod;
			case Main.E_OP_IMAGE_STORE_LOD:
				return EOpImageStoreLod;
			case Main.E_OP_IMAGE_ATOMIC_ADD:
				return EOpImageAtomicAdd;
			case Main.E_OP_IMAGE_ATOMIC_MIN:
				return EOpImageAtomicMin;
			case Main.E_OP_IMAGE_ATOMIC_MAX:
				return EOpImageAtomicMax;
			case Main.E_OP_IMAGE_ATOMIC_AND:
				return EOpImageAtomicAnd;
			case Main.E_OP_IMAGE_ATOMIC_OR:
				return EOpImageAtomicOr;
			case Main.E_OP_IMAGE_ATOMIC_XOR:
				return EOpImageAtomicXor;
			case Main.E_OP_IMAGE_ATOMIC_EXCHANGE:
				return EOpImageAtomicExchange;
			case Main.E_OP_IMAGE_ATOMIC_COMP_SWAP:
				return EOpImageAtomicCompSwap;
			case Main.E_OP_IMAGE_ATOMIC_LOAD:
				return EOpImageAtomicLoad;
			case Main.E_OP_IMAGE_ATOMIC_STORE:
				return EOpImageAtomicStore;
			case Main.E_OP_SUBPASS_LOAD:
				return EOpSubpassLoad;
			case Main.E_OP_SUBPASS_LOAD_MS:
				return EOpSubpassLoadMS;
			case Main.E_OP_SPARSE_IMAGE_LOAD:
				return EOpSparseImageLoad;
			case Main.E_OP_SPARSE_IMAGE_LOAD_LOD:
				return EOpSparseImageLoadLod;
			case Main.E_OP_IMAGE_GUARD_END:
				return EOpImageGuardEnd;
			case Main.E_OP_TEXTURE_GUARD_BEGIN:
				return EOpTextureGuardBegin;
			case Main.E_OP_TEXTURE_QUERY_SIZE:
				return EOpTextureQuerySize;
			case Main.E_OP_TEXTURE_QUERY_LOD:
				return EOpTextureQueryLod;
			case Main.E_OP_TEXTURE_QUERY_LEVELS:
				return EOpTextureQueryLevels;
			case Main.E_OP_TEXTURE_QUERY_SAMPLES:
				return EOpTextureQuerySamples;
			case Main.E_OP_SAMPLING_GUARD_BEGIN:
				return EOpSamplingGuardBegin;
			case Main.E_OP_TEXTURE:
				return EOpTexture;
			case Main.E_OP_TEXTURE_PROJ:
				return EOpTextureProj;
			case Main.E_OP_TEXTURE_LOD:
				return EOpTextureLod;
			case Main.E_OP_TEXTURE_OFFSET:
				return EOpTextureOffset;
			case Main.E_OP_TEXTURE_FETCH:
				return EOpTextureFetch;
			case Main.E_OP_TEXTURE_FETCH_OFFSET:
				return EOpTextureFetchOffset;
			case Main.E_OP_TEXTURE_PROJ_OFFSET:
				return EOpTextureProjOffset;
			case Main.E_OP_TEXTURE_LOD_OFFSET:
				return EOpTextureLodOffset;
			case Main.E_OP_TEXTURE_PROJ_LOD:
				return EOpTextureProjLod;
			case Main.E_OP_TEXTURE_PROJ_LOD_OFFSET:
				return EOpTextureProjLodOffset;
			case Main.E_OP_TEXTURE_GRAD:
				return EOpTextureGrad;
			case Main.E_OP_TEXTURE_GRAD_OFFSET:
				return EOpTextureGradOffset;
			case Main.E_OP_TEXTURE_PROJ_GRAD:
				return EOpTextureProjGrad;
			case Main.E_OP_TEXTURE_PROJ_GRAD_OFFSET:
				return EOpTextureProjGradOffset;
			case Main.E_OP_TEXTURE_GATHER:
				return EOpTextureGather;
			case Main.E_OP_TEXTURE_GATHER_OFFSET:
				return EOpTextureGatherOffset;
			case Main.E_OP_TEXTURE_GATHER_OFFSETS:
				return EOpTextureGatherOffsets;
			case Main.E_OP_TEXTURE_CLAMP:
				return EOpTextureClamp;
			case Main.E_OP_TEXTURE_OFFSET_CLAMP:
				return EOpTextureOffsetClamp;
			case Main.E_OP_TEXTURE_GRAD_CLAMP:
				return EOpTextureGradClamp;
			case Main.E_OP_TEXTURE_GRAD_OFFSET_CLAMP:
				return EOpTextureGradOffsetClamp;
			case Main.E_OP_TEXTURE_GATHER_LOD:
				return EOpTextureGatherLod;
			case Main.E_OP_TEXTURE_GATHER_LOD_OFFSET:
				return EOpTextureGatherLodOffset;
			case Main.E_OP_TEXTURE_GATHER_LOD_OFFSETS:
				return EOpTextureGatherLodOffsets;
			case Main.E_OP_FRAGMENT_MASK_FETCH:
				return EOpFragmentMaskFetch;
			case Main.E_OP_FRAGMENT_FETCH:
				return EOpFragmentFetch;
			case Main.E_OP_SPARSE_TEXTURE_GUARD_BEGIN:
				return EOpSparseTextureGuardBegin;
			case Main.E_OP_SPARSE_TEXTURE:
				return EOpSparseTexture;
			case Main.E_OP_SPARSE_TEXTURE_LOD:
				return EOpSparseTextureLod;
			case Main.E_OP_SPARSE_TEXTURE_OFFSET:
				return EOpSparseTextureOffset;
			case Main.E_OP_SPARSE_TEXTURE_FETCH:
				return EOpSparseTextureFetch;
			case Main.E_OP_SPARSE_TEXTURE_FETCH_OFFSET:
				return EOpSparseTextureFetchOffset;
			case Main.E_OP_SPARSE_TEXTURE_LOD_OFFSET:
				return EOpSparseTextureLodOffset;
			case Main.E_OP_SPARSE_TEXTURE_GRAD:
				return EOpSparseTextureGrad;
			case Main.E_OP_SPARSE_TEXTURE_GRAD_OFFSET:
				return EOpSparseTextureGradOffset;
			case Main.E_OP_SPARSE_TEXTURE_GATHER:
				return EOpSparseTextureGather;
			case Main.E_OP_SPARSE_TEXTURE_GATHER_OFFSET:
				return EOpSparseTextureGatherOffset;
			case Main.E_OP_SPARSE_TEXTURE_GATHER_OFFSETS:
				return EOpSparseTextureGatherOffsets;
			case Main.E_OP_SPARSE_TEXELS_RESIDENT:
				return EOpSparseTexelsResident;
			case Main.E_OP_SPARSE_TEXTURE_CLAMP:
				return EOpSparseTextureClamp;
			case Main.E_OP_SPARSE_TEXTURE_OFFSET_CLAMP:
				return EOpSparseTextureOffsetClamp;
			case Main.E_OP_SPARSE_TEXTURE_GRAD_CLAMP:
				return EOpSparseTextureGradClamp;
			case Main.E_OP_SPARSE_TEXTURE_GRAD_OFFSET_CLAMP:
				return EOpSparseTextureGradOffsetClamp;
			case Main.E_OP_SPARSE_TEXTURE_GATHER_LOD:
				return EOpSparseTextureGatherLod;
			case Main.E_OP_SPARSE_TEXTURE_GATHER_LOD_OFFSET:
				return EOpSparseTextureGatherLodOffset;
			case Main.E_OP_SPARSE_TEXTURE_GATHER_LOD_OFFSETS:
				return EOpSparseTextureGatherLodOffsets;
			case Main.E_OP_SPARSE_TEXTURE_GUARD_END:
				return EOpSparseTextureGuardEnd;
			case Main.E_OP_IMAGE_FOOTPRINT_GUARD_BEGIN:
				return EOpImageFootprintGuardBegin;
			case Main.E_OP_IMAGE_SAMPLE_FOOTPRINT_NV:
				return EOpImageSampleFootprintNV;
			case Main.E_OP_IMAGE_SAMPLE_FOOTPRINT_CLAMP_NV:
				return EOpImageSampleFootprintClampNV;
			case Main.E_OP_IMAGE_SAMPLE_FOOTPRINT_LOD_NV:
				return EOpImageSampleFootprintLodNV;
			case Main.E_OP_IMAGE_SAMPLE_FOOTPRINT_GRAD_NV:
				return EOpImageSampleFootprintGradNV;
			case Main.E_OP_IMAGE_SAMPLE_FOOTPRINT_GRAD_CLAMP_NV:
				return EOpImageSampleFootprintGradClampNV;
			case Main.E_OP_IMAGE_FOOTPRINT_GUARD_END:
				return EOpImageFootprintGuardEnd;
			case Main.E_OP_SAMPLING_GUARD_END:
				return EOpSamplingGuardEnd;
			case Main.E_OP_TEXTURE_GUARD_END:
				return EOpTextureGuardEnd;
			case Main.E_OP_ADD_CARRY:
				return EOpAddCarry;
			case Main.E_OP_SUB_BORROW:
				return EOpSubBorrow;
			case Main.E_OP_UMULEXTENDED:
				return EOpUMulExtended;
			case Main.E_OP_IMULEXTENDED:
				return EOpIMulExtended;
			case Main.E_OP_BITFIELD_EXTRACT:
				return EOpBitfieldExtract;
			case Main.E_OP_BITFIELD_INSERT:
				return EOpBitfieldInsert;
			case Main.E_OP_BIT_FIELD_REVERSE:
				return EOpBitFieldReverse;
			case Main.E_OP_BIT_COUNT:
				return EOpBitCount;
			case Main.E_OP_FIND_LSB:
				return EOpFindLSB;
			case Main.E_OP_FIND_MSB:
				return EOpFindMSB;
			case Main.E_OP_COUNT_LEADING_ZEROS:
				return EOpCountLeadingZeros;
			case Main.E_OP_COUNT_TRAILING_ZEROS:
				return EOpCountTrailingZeros;
			case Main.E_OP_ABS_DIFFERENCE:
				return EOpAbsDifference;
			case Main.E_OP_ADD_SATURATE:
				return EOpAddSaturate;
			case Main.E_OP_SUB_SATURATE:
				return EOpSubSaturate;
			case Main.E_OP_AVERAGE:
				return EOpAverage;
			case Main.E_OP_AVERAGE_ROUNDED:
				return EOpAverageRounded;
			case Main.E_OP_MUL32X16:
				return EOpMul32x16;
			case Main.E_OP_TRACE:
				return EOpTrace;
			case Main.E_OP_REPORT_INTERSECTION:
				return EOpReportIntersection;
			case Main.E_OP_IGNORE_INTERSECTION:
				return EOpIgnoreIntersection;
			case Main.E_OP_TERMINATE_RAY:
				return EOpTerminateRay;
			case Main.E_OP_EXECUTE_CALLABLE:
				return EOpExecuteCallable;
			case Main.E_OP_WRITE_PACKED_PRIMITIVE_INDICES4X8_NV:
				return EOpWritePackedPrimitiveIndices4x8NV;
			case Main.E_OP_RAY_QUERY_INITIALIZE:
				return EOpRayQueryInitialize;
			case Main.E_OP_RAY_QUERY_TERMINATE:
				return EOpRayQueryTerminate;
			case Main.E_OP_RAY_QUERY_GENERATE_INTERSECTION:
				return EOpRayQueryGenerateIntersection;
			case Main.E_OP_RAY_QUERY_CONFIRM_INTERSECTION:
				return EOpRayQueryConfirmIntersection;
			case Main.E_OP_RAY_QUERY_PROCEED:
				return EOpRayQueryProceed;
			case Main.E_OP_RAY_QUERY_GET_INTERSECTION_TYPE:
				return EOpRayQueryGetIntersectionType;
			case Main.E_OP_RAY_QUERY_GET_RAY_TMIN:
				return EOpRayQueryGetRayTMin;
			case Main.E_OP_RAY_QUERY_GET_RAY_FLAGS:
				return EOpRayQueryGetRayFlags;
			case Main.E_OP_RAY_QUERY_GET_INTERSECTIONT:
				return EOpRayQueryGetIntersectionT;
			case Main.E_OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_CUSTOM_INDEX:
				return EOpRayQueryGetIntersectionInstanceCustomIndex;
			case Main.E_OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_ID:
				return EOpRayQueryGetIntersectionInstanceId;
			case Main.E_OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_SHADER_BINDING_TABLE_RECORD_OFFSET:
				return EOpRayQueryGetIntersectionInstanceShaderBindingTableRecordOffset;
			case Main.E_OP_RAY_QUERY_GET_INTERSECTION_GEOMETRY_INDEX:
				return EOpRayQueryGetIntersectionGeometryIndex;
			case Main.E_OP_RAY_QUERY_GET_INTERSECTION_PRIMITIVE_INDEX:
				return EOpRayQueryGetIntersectionPrimitiveIndex;
			case Main.E_OP_RAY_QUERY_GET_INTERSECTION_BARYCENTRICS:
				return EOpRayQueryGetIntersectionBarycentrics;
			case Main.E_OP_RAY_QUERY_GET_INTERSECTION_FRONT_FACE:
				return EOpRayQueryGetIntersectionFrontFace;
			case Main.E_OP_RAY_QUERY_GET_INTERSECTION_CANDIDATE_AABBOPAQUE:
				return EOpRayQueryGetIntersectionCandidateAABBOpaque;
			case Main.E_OP_RAY_QUERY_GET_INTERSECTION_OBJECT_RAY_DIRECTION:
				return EOpRayQueryGetIntersectionObjectRayDirection;
			case Main.E_OP_RAY_QUERY_GET_INTERSECTION_OBJECT_RAY_ORIGIN:
				return EOpRayQueryGetIntersectionObjectRayOrigin;
			case Main.E_OP_RAY_QUERY_GET_WORLD_RAY_DIRECTION:
				return EOpRayQueryGetWorldRayDirection;
			case Main.E_OP_RAY_QUERY_GET_WORLD_RAY_ORIGIN:
				return EOpRayQueryGetWorldRayOrigin;
			case Main.E_OP_RAY_QUERY_GET_INTERSECTION_OBJECT_TO_WORLD:
				return EOpRayQueryGetIntersectionObjectToWorld;
			case Main.E_OP_RAY_QUERY_GET_INTERSECTION_WORLD_TO_OBJECT:
				return EOpRayQueryGetIntersectionWorldToObject;
			case Main.E_OP_CLIP:
				return EOpClip;
			case Main.E_OP_IS_FINITE:
				return EOpIsFinite;
			case Main.E_OP_LOG10:
				return EOpLog10;
			case Main.E_OP_RCP:
				return EOpRcp;
			case Main.E_OP_SATURATE:
				return EOpSaturate;
			case Main.E_OP_SIN_COS:
				return EOpSinCos;
			case Main.E_OP_GEN_MUL:
				return EOpGenMul;
			case Main.E_OP_DST:
				return EOpDst;
			case Main.E_OP_INTERLOCKED_ADD:
				return EOpInterlockedAdd;
			case Main.E_OP_INTERLOCKED_AND:
				return EOpInterlockedAnd;
			case Main.E_OP_INTERLOCKED_COMPARE_EXCHANGE:
				return EOpInterlockedCompareExchange;
			case Main.E_OP_INTERLOCKED_COMPARE_STORE:
				return EOpInterlockedCompareStore;
			case Main.E_OP_INTERLOCKED_EXCHANGE:
				return EOpInterlockedExchange;
			case Main.E_OP_INTERLOCKED_MAX:
				return EOpInterlockedMax;
			case Main.E_OP_INTERLOCKED_MIN:
				return EOpInterlockedMin;
			case Main.E_OP_INTERLOCKED_OR:
				return EOpInterlockedOr;
			case Main.E_OP_INTERLOCKED_XOR:
				return EOpInterlockedXor;
			case Main.E_OP_ALL_MEMORY_BARRIER_WITH_GROUP_SYNC:
				return EOpAllMemoryBarrierWithGroupSync;
			case Main.E_OP_DEVICE_MEMORY_BARRIER:
				return EOpDeviceMemoryBarrier;
			case Main.E_OP_DEVICE_MEMORY_BARRIER_WITH_GROUP_SYNC:
				return EOpDeviceMemoryBarrierWithGroupSync;
			case Main.E_OP_WORKGROUP_MEMORY_BARRIER:
				return EOpWorkgroupMemoryBarrier;
			case Main.E_OP_WORKGROUP_MEMORY_BARRIER_WITH_GROUP_SYNC:
				return EOpWorkgroupMemoryBarrierWithGroupSync;
			case Main.E_OP_EVALUATE_ATTRIBUTE_SNAPPED:
				return EOpEvaluateAttributeSnapped;
			case Main.E_OP_F32TOF16:
				return EOpF32tof16;
			case Main.E_OP_F16TOF32:
				return EOpF16tof32;
			case Main.E_OP_LIT:
				return EOpLit;
			case Main.E_OP_TEXTURE_BIAS:
				return EOpTextureBias;
			case Main.E_OP_AS_DOUBLE:
				return EOpAsDouble;
			case Main.E_OP_D3D_COLOR_TO_UBYTE4:
				return EOpD3DCOLORtoUBYTE4;
			case Main.E_OP_METHOD_SAMPLE:
				return EOpMethodSample;
			case Main.E_OP_METHOD_SAMPLE_BIAS:
				return EOpMethodSampleBias;
			case Main.E_OP_METHOD_SAMPLE_CMP:
				return EOpMethodSampleCmp;
			case Main.E_OP_METHOD_SAMPLE_CMP_LEVEL_ZERO:
				return EOpMethodSampleCmpLevelZero;
			case Main.E_OP_METHOD_SAMPLE_GRAD:
				return EOpMethodSampleGrad;
			case Main.E_OP_METHOD_SAMPLE_LEVEL:
				return EOpMethodSampleLevel;
			case Main.E_OP_METHOD_LOAD:
				return EOpMethodLoad;
			case Main.E_OP_METHOD_GET_DIMENSIONS:
				return EOpMethodGetDimensions;
			case Main.E_OP_METHOD_GET_SAMPLE_POSITION:
				return EOpMethodGetSamplePosition;
			case Main.E_OP_METHOD_GATHER:
				return EOpMethodGather;
			case Main.E_OP_METHOD_CALCULATE_LEVEL_OF_DETAIL:
				return EOpMethodCalculateLevelOfDetail;
			case Main.E_OP_METHOD_CALCULATE_LEVEL_OF_DETAIL_UNCLAMPED:
				return EOpMethodCalculateLevelOfDetailUnclamped;
			case Main.E_OP_METHOD_LOAD2:
				return EOpMethodLoad2;
			case Main.E_OP_METHOD_LOAD3:
				return EOpMethodLoad3;
			case Main.E_OP_METHOD_LOAD4:
				return EOpMethodLoad4;
			case Main.E_OP_METHOD_STORE:
				return EOpMethodStore;
			case Main.E_OP_METHOD_STORE2:
				return EOpMethodStore2;
			case Main.E_OP_METHOD_STORE3:
				return EOpMethodStore3;
			case Main.E_OP_METHOD_STORE4:
				return EOpMethodStore4;
			case Main.E_OP_METHOD_INCREMENT_COUNTER:
				return EOpMethodIncrementCounter;
			case Main.E_OP_METHOD_DECREMENT_COUNTER:
				return EOpMethodDecrementCounter;
			case Main.E_OP_METHOD_CONSUME:
				return EOpMethodConsume;
			case Main.E_OP_METHOD_GATHER_RED:
				return EOpMethodGatherRed;
			case Main.E_OP_METHOD_GATHER_GREEN:
				return EOpMethodGatherGreen;
			case Main.E_OP_METHOD_GATHER_BLUE:
				return EOpMethodGatherBlue;
			case Main.E_OP_METHOD_GATHER_ALPHA:
				return EOpMethodGatherAlpha;
			case Main.E_OP_METHOD_GATHER_CMP:
				return EOpMethodGatherCmp;
			case Main.E_OP_METHOD_GATHER_CMP_RED:
				return EOpMethodGatherCmpRed;
			case Main.E_OP_METHOD_GATHER_CMP_GREEN:
				return EOpMethodGatherCmpGreen;
			case Main.E_OP_METHOD_GATHER_CMP_BLUE:
				return EOpMethodGatherCmpBlue;
			case Main.E_OP_METHOD_GATHER_CMP_ALPHA:
				return EOpMethodGatherCmpAlpha;
			case Main.E_OP_METHOD_APPEND:
				return EOpMethodAppend;
			case Main.E_OP_METHOD_RESTART_STRIP:
				return EOpMethodRestartStrip;
			case Main.E_OP_MATRIX_SWIZZLE:
				return EOpMatrixSwizzle;
			case Main.E_OP_WAVE_GET_LANE_COUNT:
				return EOpWaveGetLaneCount;
			case Main.E_OP_WAVE_GET_LANE_INDEX:
				return EOpWaveGetLaneIndex;
			case Main.E_OP_WAVE_ACTIVE_COUNT_BITS:
				return EOpWaveActiveCountBits;
			case Main.E_OP_WAVE_PREFIX_COUNT_BITS:
				return EOpWavePrefixCountBits;
			case Main.E_OP_READ_CLOCK_SUBGROUP_KHR:
				return EOpReadClockSubgroupKHR;
			case Main.E_OP_READ_CLOCK_DEVICE_KHR:
				return EOpReadClockDeviceKHR;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
