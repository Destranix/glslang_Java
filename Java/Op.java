package Java;

public enum Op {
	OpNop(Main.OP_NOP),
	OpUndef(Main.OP_UNDEF),
	OpSourceContinued(Main.OP_SOURCE_CONTINUED),
	OpSource(Main.OP_SOURCE),
	OpSourceExtension(Main.OP_SOURCE_EXTENSION),
	OpName(Main.OP_NAME),
	OpMemberName(Main.OP_MEMBER_NAME),
	OpString(Main.OP_STRING),
	OpLine(Main.OP_LINE),
	OpExtension(Main.OP_EXTENSION),
	OpExtInstImport(Main.OP_EXT_INST_IMPORT),
	OpExtInst(Main.OP_EXT_INST),
	OpMemoryModel(Main.OP_MEMORY_MODEL),
	OpEntryPoint(Main.OP_ENTRY_POINT),
	OpExecutionMode(Main.OP_EXECUTION_MODE),
	OpCapability(Main.OP_CAPABILITY),
	OpTypeVoid(Main.OP_TYPE_VOID),
	OpTypeBool(Main.OP_TYPE_BOOL),
	OpTypeInt(Main.OP_TYPE_INT),
	OpTypeFloat(Main.OP_TYPE_FLOAT),
	OpTypeVector(Main.OP_TYPE_VECTOR),
	OpTypeMatrix(Main.OP_TYPE_MATRIX),
	OpTypeImage(Main.OP_TYPE_IMAGE),
	OpTypeSampler(Main.OP_TYPE_SAMPLER),
	OpTypeSampledImage(Main.OP_TYPE_SAMPLED_IMAGE),
	OpTypeArray(Main.OP_TYPE_ARRAY),
	OpTypeRuntimeArray(Main.OP_TYPE_RUNTIME_ARRAY),
	OpTypeStruct(Main.OP_TYPE_STRUCT),
	OpTypeOpaque(Main.OP_TYPE_OPAQUE),
	OpTypePointer(Main.OP_TYPE_POINTER),
	OpTypeFunction(Main.OP_TYPE_FUNCTION),
	OpTypeEvent(Main.OP_TYPE_EVENT),
	OpTypeDeviceEvent(Main.OP_TYPE_DEVICE_EVENT),
	OpTypeReserveId(Main.OP_TYPE_RESERVEID),
	OpTypeQueue(Main.OP_TYPE_QUEUE),
	OpTypePipe(Main.OP_TYPE_PIPE),
	OpTypeForwardPointer(Main.OP_TYPE_FORWARD_POINTER),
	OpConstantTrue(Main.OP_CONSTANT_TRUE),
	OpConstantFalse(Main.OP_CONSTANT_FALSE),
	OpConstant(Main.OP_CONSTANT),
	OpConstantComposite(Main.OP_CONSTANT_COMPOSITE),
	OpConstantSampler(Main.OP_CONSTANT_SAMPLER),
	OpConstantNull(Main.Op_Constant_Null),
	OpSpecConstantTrue(Main.OP_SPEC_CONSTANT_TRUE),
	OpSpecConstantFalse(Main.Op_Spec_Constant_False),
	OpSpecConstant(Main.OP_SPEC_CONSTANT),
	OpSpecConstantComposite(Main.OP_SPEC_CONSTANT_COMPOSITE),
	OpSpecConstantOp(Main.OP_SPEC_CONSTANT_OP),
	OpFunction(Main.OP_FUNCTION),
	OpFunctionParameter(Main.OP_FUNCTION_PARAMETER),
	OpFunctionEnd(Main.OP_FUNCTION_END),
	OpFunctionCall(Main.OP_FUNCTION_CALL),
	OpVariable(Main.OP_VARIABLE),
	OpImageTexelPointer(Main.OP_IMAGE_TEXEL_POINTER),
	OpLoad(Main.OP_LOAD),
	OpStore(Main.OP_STORE),
	OpCopyMemory(Main.OP_COPY_MEMORY),
	OpCopyMemorySized(Main.OP_COPY_MEMORY_SIZED),
	OpAccessChain(Main.OP_ACCESS_CHAIN),
	OpInBoundsAccessChain(Main.OP_IN_BOUNDS_ACCESS_CHAIN),
	OpPtrAccessChain(Main.OP_PTR_ACCESS_CHAIN),
	OpArrayLength(Main.OP_ARRAY_LENGTH),
	OpGenericPtrMemSemantics(Main.OP_GENERIC_PTR_MEM_SEMANTICS),
	OpInBoundsPtrAccessChain(Main.OP_IN_BOUNDS_PTR_ACCESS_CHAIN),
	OpDecorate(Main.OP_DECORATE),
	OpMemberDecorate(Main.OP_MEMBER_DECORATE),
	OpDecorationGroup(Main.OP_DECORATION_GROUP),
	OpGroupDecorate(Main.OP_GROUP_DECORATE),
	OpGroupMemberDecorate(Main.OP_GROUP_MEMBER_DECORATE),
	OpVectorExtractDynamic(Main.OP_VECTOR_EXTRACT_DYNAMIC),
	OpVectorInsertDynamic(Main.OP_VECTOR_INSERT_DYNAMIC),
	OpVectorShuffle(Main.OP_VECTOR_SHUFFLE),
	OpCompositeConstruct(Main.OP_COMPOSITE_CONSTRUCT),
	OpCompositeExtract(Main.OP_COMPOSITE_EXTRACT),
	OpCompositeInsert(Main.OP_COMPOSITE_INSERT),
	OpCopyObject(Main.OP_COPY_OBJECT),
	OpTranspose(Main.OP_TRANSPOSE),
	OpSampledImage(Main.OP_SAMPLED_IMAGE),
	OpImageSampleImplicitLod(Main.OP_IMAGE_SAMPLE_IMPLICIT_LOD),
	OpImageSampleExplicitLod(Main.OP_IMAGE_SAMPLE_EXPLICIT_LOD),
	OpImageSampleDrefImplicitLod(Main.OP_IMAGE_SAMPLE_DREF_IMPLICIT_LOD),
	OpImageSampleDrefExplicitLod(Main.OP_IMAGE_SAMPLE_DREF_EXPLICIT_LOD),
	OpImageSampleProjImplicitLod(Main.OP_IMAGE_SAMPLE_PROJ_IMPLICIT_LOD),
	OpImageSampleProjExplicitLod(Main.OP_IMAGE_SAMPLE_PROJ_EXPLICIT_LOD),
	OpImageSampleProjDrefImplicitLod(Main.OP_IMAGE_SAMPLE_PROJ_DREF_IMPLICIT_LOD),
	OpImageSampleProjDrefExplicitLod(Main.OP_IMAGE_SAMPLE_PROJ_DREF_EXPLICIT_LOD),
	OpImageFetch(Main.Op_Image_Fetch),
	OpImageGather(Main.Op_Image_Gather),
	OpImageDrefGather(Main.OP_IMAGE_DREF_GATHER),
	OpImageRead(Main.OP_IMAGE_READ),
	OpImageWrite(Main.OP_IMAGE_WRITE),
	OpImage(Main.OP_IMAGE),
	OpImageQueryFormat(Main.OP_IMAGE_QUERY_FORMAT),
	OpImageQueryOrder(Main.OP_IMAGE_QUERY_ORDER),
	OpImageQuerySizeLod(Main.OP_IMAGE_QUERY_SIZE_LOD),
	OpImageQuerySize(Main.OP_IMAGE_QUERY_SIZE),
	OpImageQueryLod(Main.OP_IMAGE_QUERY_LOD),
	OpImageQueryLevels(Main.OP_IMAGE_QUERY_LEVELS),
	OpImageQuerySamples(Main.OP_IMAGE_QUERY_SAMPLES),
	OpConvertFToU(Main.OP_CONVERT_F_TO_U),
	OpConvertFToS(Main.OP_CONVERT_F_TO_S),
	OpConvertSToF(Main.OP_CONVERT_S_TO_F),
	OpConvertUToF(Main.OP_CONVERT_U_TO_F),
	OpUConvert(Main.OP_U_CONVERT),
	OpSConvert(Main.OP_S_CONVERT),
	OpFConvert(Main.OP_F_CONVERT),
	OpQuantizeToF16(Main.OP_QUANTIZE_TO_F16),
	OpConvertPtrToU(Main.OP_CONVERT_PTR_TO_U),
	OpSatConvertSToU(Main.Op_Sat_Convert_S_To_U),
	OpSatConvertUToS(Main.OP_SAT_CONVERT_U_TO_S),
	OpConvertUToPtr(Main.OP_CONVERT_U_TO_PTR),
	OpPtrCastToGeneric(Main.OP_PTR_CAST_TO_GENERIC),
	OpGenericCastToPtr(Main.OP_GENERIC_CAST_TO_PTR),
	OpGenericCastToPtrExplicit(Main.OP_GENERIC_CAST_TO_PTR_EXPLICIT),
	OpBitcast(Main.OP_BITCAST),
	OpSNegate(Main.OP_S_NEGATE),
	OpFNegate(Main.OP_F_NEGATE),
	OpIAdd(Main.OP_I_ADD),
	OpFAdd(Main.OP_F_ADD),
	OpISub(Main.OP_I_SUB),
	OpFSub(Main.OP_F_SUB),
	OpIMul(Main.OP_I_MUL),
	OpFMul(Main.OP_F_MUL),
	OpUDiv(Main.OP_U_DIV),
	OpSDiv(Main.OP_S_DIV),
	OpFDiv(Main.OP_F_DIV),
	OpUMod(Main.OP_U_MOD),
	OpSRem(Main.OP_S_REM),
	OpSMod(Main.OP_S_MOD),
	OpFRem(Main.OP_F_REM),
	OpFMod(Main.OP_F_MOD),
	OpVectorTimesScalar(Main.OP_VECTOR_TIMES_SCALAR),
	OpMatrixTimesScalar(Main.OP_MATRIX_TIMES_SCALAR),
	OpVectorTimesMatrix(Main.OP_VECTOR_TIMES_MATRIX),
	OpMatrixTimesVector(Main.OP_MATRIX_TIMES_VECTOR),
	OpMatrixTimesMatrix(Main.OP_MATRIX_TIMES_MATRIX),
	OpOuterProduct(Main.OP_OUTER_PRODUCT),
	OpDot(Main.OP_DOT),
	OpIAddCarry(Main.OP_I_ADD_CARRY),
	OpISubBorrow(Main.OP_I_SUB_BORROW),
	OpUMulExtended(Main.OP_U_MUL_EXTENDED),
	OpSMulExtended(Main.OP_S_MUL_EXTENDED),
	OpAny(Main.OP_ANY),
	OpAll(Main.OP_ALL),
	OpIsNan(Main.OP_IS_NAN),
	OpIsInf(Main.OP_IS_INF),
	OpIsFinite(Main.OP_IS_FINITE),
	OpIsNormal(Main.OP_IS_NORMAL),
	OpSignBitSet(Main.OP_SIGN_BIT_SET),
	OpLessOrGreater(Main.OP_LESS_OR_GREATER),
	OpOrdered(Main.OP_ORDERED),
	OpUnordered(Main.OP_UNORDERED),
	OpLogicalEqual(Main.OP_LOGICAL_EQUAL),
	OpLogicalNotEqual(Main.OP_LOGICAL_NOT_EQUAL),
	OpLogicalOr(Main.OP_LOGICAL_OR),
	OpLogicalAnd(Main.OP_LOGICAL_AND),
	OpLogicalNot(Main.OP_LOGICAL_NOT),
	OpSelect(Main.OP_SELECT),
	OpIEqual(Main.OP_I_EQUAL),
	OpINotEqual(Main.OP_I_NOT_EQUAL),
	OpUGreaterThan(Main.OP_U_GREATER_THAN),
	OpSGreaterThan(Main.OP_S_GREATER_THAN),
	OpUGreaterThanEqual(Main.OP_U_GREATER_THAN_EQUAL),
	OpSGreaterThanEqual(Main.OP_S_GREATER_THAN_EQUAL),
	OpULessThan(Main.OP_U_LESS_THAN),
	OpSLessThan(Main.OP_S_LESS_THAN),
	OpULessThanEqual(Main.OP_U_LESS_THAN_EQUAL),
	OpSLessThanEqual(Main.OP_S_LESS_THAN_EQUAL),
	OpFOrdEqual(Main.OP_F_ORD_EQUAL),
	OpFUnordEqual(Main.OP_F_UNORD_EQUAL),
	OpFOrdNotEqual(Main.OP_F_ORD_NOT_EQUAL),
	OpFUnordNotEqual(Main.OP_F_UNORD_NOT_EQUAL),
	OpFOrdLessThan(Main.OP_F_ORD_LESS_THAN),
	OpFUnordLessThan(Main.OP_F_UNORD_LESS_THAN),
	OpFOrdGreaterThan(Main.OP_F_ORD_GREATER_THAN),
	OpFUnordGreaterThan(Main.OP_F_UNORD_GREATER_THAN),
	OpFOrdLessThanEqual(Main.OP_F_ORD_LESS_THAN_EQUAL),
	OpFUnordLessThanEqual(Main.OP_F_UNORD_LESS_THAN_EQUAL),
	OpFOrdGreaterThanEqual(Main.OP_F_ORD_GREATER_THAN_EQUAL),
	OpFUnordGreaterThanEqual(Main.OP_F_UNORD_GREATER_THAN_EQUAL),
	OpShiftRightLogical(Main.OP_SHIFT_RIGHT_LOGICAL),
	OpShiftRightArithmetic(Main.OP_SHIFT_RIGHT_ARITHMETIC),
	OpShiftLeftLogical(Main.OP_SHIFT_LEFT_LOGICAL),
	OpBitwiseOr(Main.OP_BITWISE_OR),
	OpBitwiseXor(Main.OP_BITWISE_XOR),
	OpBitwiseAnd(Main.OP_BITWISE_AND),
	OpNot(Main.OP_NOT),
	OpBitFieldInsert(Main.OP_BIT_FIELD_INSERT),
	OpBitFieldSExtract(Main.OP_BIT_FIELD_S_EXTRACT),
	OpBitFieldUExtract(Main.OP_BIT_FIELD_U_EXTRACT),
	OpBitReverse(Main.OP_BIT_REVERSE),
	OpBitCount(Main.OP_BIT_COUNT),
	OpDPdx(Main.OP_DPDX),
	OpDPdy(Main.OP_DPDY),
	OpFwidth(Main.OP_F_WIDTH),
	OpDPdxFine(Main.OP_DPDX_FINE),
	OpDPdyFine(Main.OP_DPDY_FINE),
	OpFwidthFine(Main.OP_F_WIDTH_FINE),
	OpDPdxCoarse(Main.OP_DPDX_COARSE),
	OpDPdyCoarse(Main.OP_DPDY_COARSE),
	OpFwidthCoarse(Main.OP_F_WIDTH_COARSE),
	OpEmitVertex(Main.OP_EMIT_VERTEX),
	OpEndPrimitive(Main.OP_END_PRIMITIVE),
	OpEmitStreamVertex(Main.OP_EMIT_STREAM_VERTEX),
	OpEndStreamPrimitive(Main.OP_END_STREAM_PRIMITIVE),
	OpControlBarrier(Main.OP_CONTROL_BARRIER),
	OpMemoryBarrier(Main.OP_MEMORY_BARRIER),
	OpAtomicLoad(Main.OP_ATOMIC_LOAD),
	OpAtomicStore(Main.OP_ATOMIC_STORE),
	OpAtomicExchange(Main.OP_ATOMIC_EXCHANGE),
	OpAtomicCompareExchange(Main.OP_ATOMIC_COMPARE_EXCHANGE),
	OpAtomicCompareExchangeWeak(Main.OP_ATOMIC_COMPARE_EXCHANGE_WEAK),
	OpAtomicIIncrement(Main.OP_ATOMIC_I_INCREMENT),
	OpAtomicIDecrement(Main.OP_ATOMIC_I_DECREMENT),
	OpAtomicIAdd(Main.OP_ATOMIC_I_ADD),
	OpAtomicISub(Main.OP_ATOMIC_I_SUB),
	OpAtomicSMin(Main.OP_ATOMIC_S_MIN),
	OpAtomicUMin(Main.OP_ATOMIC_U_MIN),
	OpAtomicSMax(Main.OP_ATOMIC_S_MAX),
	OpAtomicUMax(Main.OP_ATOMIC_U_MAX),
	OpAtomicAnd(Main.OP_ATOMIC_AND),
	OpAtomicOr(Main.OP_ATOMIC_OR),
	OpAtomicXor(Main.OP_ATOMIC_XOR),
	OpPhi(Main.OP_PHI),
	OpLoopMerge(Main.OP_LOOP_MERGE),
	OpSelectionMerge(Main.OP_SELECTION_MERGE),
	OpLabel(Main.OP_LABEL),
	OpBranch(Main.OP_BRANCH),
	OpBranchConditional(Main.OP_BRANCH_CONDITIONAL),
	OpSwitch(Main.OP_SWITCH),
	OpKill(Main.OP_KILL),
	OpReturn(Main.OP_RETURN),
	OpReturnValue(Main.OP_RETURN_VALUE),
	OpUnreachable(Main.OP_UNREACHABLE),
	OpLifetimeStart(Main.OP_LIFETIME_START),
	OpLifetimeStop(Main.OP_LIFETIME_STOP),
	OpGroupAsyncCopy(Main.OP_GROUP_ASYNC_COPY),
	OpGroupWaitEvents(Main.OP_GROUP_WAIT_EVENTS),
	OpGroupAll(Main.OP_GROUP_ALL),
	OpGroupAny(Main.OP_GROUP_ANY),
	OpGroupBroadcast(Main.Op_Group_Broadcast),
	OpGroupIAdd(Main.OP_GROUP_I_ADD),
	OpGroupFAdd(Main.OP_GROUP_F_ADD),
	OpGroupFMin(Main.OP_GROUP_F_MIN),
	OpGroupUMin(Main.OP_GROUP_U_MIN),
	OpGroupSMin(Main.OP_GROUP_S_MIN),
	OpGroupFMax(Main.OP_GROUP_F_MAX),
	OpGroupUMax(Main.OP_GROUP_U_MAX),
	OpGroupSMax(Main.OP_GROUP_S_MAX),
	OpReadPipe(Main.OP_READ_PIPE),
	OpWritePipe(Main.OP_WRITE_PIPE),
	OpReservedReadPipe(Main.Op_ReservEd_Read_Pipe),
	OpReservedWritePipe(Main.OP_RESERVED_WRITE_PIPE),
	OpReserveReadPipePackets(Main.OP_RESERVE_READ_PIPE_PACKETS),
	OpReserveWritePipePackets(Main.OP_RESERVE_WRITE_PIPE_PACKETS),
	OpCommitReadPipe(Main.OP_COMMIT_READ_PIPE),
	OpCommitWritePipe(Main.OP_COMMIT_WRITE_PIPE),
	OpIsValidReserveId(Main.OP_IS_VALID_RESERVE_ID),
	OpGetNumPipePackets(Main.OP_GET_NUM_PIPE_PACKETS),
	OpGetMaxPipePackets(Main.OP_GET_MAX_PIPE_PACKETS),
	OpGroupReserveReadPipePackets(Main.OP_GROUP_RESERVE_READ_PIPE_PACKETS),
	OpGroupReserveWritePipePackets(Main.OP_GROUP_RESERVE_WRITE_PIPE_PACKETS),
	OpGroupCommitReadPipe(Main.OP_GROUP_COMMIT_READ_PIPE),
	OpGroupCommitWritePipe(Main.OP_GROUP_COMMIT_WRITE_PIPE),
	OpEnqueueMarker(Main.OP_ENQUEUE_MARKER),
	OpEnqueueKernel(Main.OP_ENQUEUE_KERNEL),
	OpGetKernelNDrangeSubGroupCount(Main.OP_GET_KERNEL_NDRANGE_SUB_GROUP_COUNT),
	OpGetKernelNDrangeMaxSubGroupSize(Main.OP_GET_KERNEL_NDRANGE_MAX_SUB_GROUP_SIZE),
	OpGetKernelWorkGroupSize(Main.OP_GET_KERNEL_WORK_GROUP_SIZE),
	OpGetKernelPreferredWorkGroupSizeMultiple(Main.OP_GET_KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE),
	OpRetainEvent(Main.OP_RETAIN_EVENT),
	OpReleaseEvent(Main.OP_RELEASE_EVENT),
	OpCreateUserEvent(Main.OP_CREATE_USER_EVENT),
	OpIsValidEvent(Main.OP_IS_VALID_EVENT),
	OpSetUserEventStatus(Main.OP_SET_USER_EVENT_STATUS),
	OpCaptureEventProfilingInfo(Main.OP_CAPTURE_EVENT_PROFILING_INFO),
	OpGetDefaultQueue(Main.OP_GET_DEFAULT_QUEUE),
	OpBuildNDRange(Main.OP_BUILD_ND_RANGE),
	OpImageSparseSampleImplicitLod(Main.OP_IMAGE_SPARSE_SAMPLE_IMPLICIT_LOD),
	OpImageSparseSampleExplicitLod(Main.OP_IMAGE_SPARSE_SAMPLE_EXPLICIT_LOD),
	OpImageSparseSampleDrefImplicitLod(Main.OP_IMAGE_SPARSE_SAMPLE_DREF_IMPLICIT_LOD),
	OpImageSparseSampleDrefExplicitLod(Main.OP_IMAGE_SPARSE_SAMPLE_DREF_EXPLICIT_LOD),
	OpImageSparseSampleProjImplicitLod(Main.OP_IMAGE_SPARSE_SAMPLE_PROJ_IMPLICIT_LOD),
	OpImageSparseSampleProjExplicitLod(Main.OP_IMAGE_SPARSE_SAMPLE_PROJ_EXPLICIT_LOD),
	OpImageSparseSampleProjDrefImplicitLod(Main.OP_IMAGE_SPARSE_SAMPLE_PROJ_DREF_IMPLICIT_LOD),
	OpImageSparseSampleProjDrefExplicitLod(Main.OP_IMAGE_SPARSE_SAMPLE_PROJ_DREF_EXPLICIT_LOD),
	OpImageSparseFetch(Main.OP_IMAGE_SPARSE_FETCH),
	OpImageSparseGather(Main.OP_IMAGE_SPARSE_GATHER),
	OpImageSparseDrefGather(Main.OP_IMAGE_SPARSE_DREF_GATHER),
	OpImageSparseTexelsResident(Main.OP_IMAGE_SPARSE_TEXELS_RESIDENT),
	OpNoLine(Main.OP_NO_LINE),
	OpAtomicFlagTestAndSet(Main.OP_ATOMIC_FLAG_TEST_AND_SET),
	OpAtomicFlagClear(Main.OP_ATOMIC_FLAG_CLEAR),
	OpImageSparseRead(Main.OP_IMAGE_SPARSE_READ),
	OpSizeOf(Main.OP_SIZE_OF),
	OpTypePipeStorage(Main.OP_TYPE_PIPE_STORAGE),
	OpConstantPipeStorage(Main.OP_CONSTANT_PIPE_STORAGE),
	OpCreatePipeFromPipeStorage(Main.OP_CREATE_PIPE_FROM_PIPE_STORAGE),
	OpGetKernelLocalSizeForSubgroupCount(Main.OP_GET_KERNEL_LOCAL_SIZE_FOR_SUBGROUP_COUNT),
	OpGetKernelMaxNumSubgroups(Main.OP_GET_KERNEL_MAX_NUM_SUBGROUPS),
	OpTypeNamedBarrier(Main.OP_TYPE_NAMED_BARRIER),
	OpNamedBarrierInitialize(Main.OP_NAMED_BARRIER_INITIALIZE),
	OpMemoryNamedBarrier(Main.OP_MEMORY_NAMED_BARRIER),
	OpModuleProcessed(Main.OP_MODULE_PROCESSED),
	OpExecutionModeId(Main.OP_EXECUTION_MODE_ID),
	OpDecorateId(Main.OP_DECORATE_ID),
	OpGroupNonUniformElect(Main.OP_GROUP_NON_UNIFORM_ELECT),
	OpGroupNonUniformAll(Main.OP_GROUP_NON_UNIFORM_ALL),
	OpGroupNonUniformAny(Main.OP_GROUP_NON_UNIFORM_ANY),
	OpGroupNonUniformAllEqual(Main.OP_GROUP_NON_UNIFORM_ALL_EQUAL),
	OpGroupNonUniformBroadcast(Main.OP_GROUP_NON_UNIFORM_BROADCAST),
	OpGroupNonUniformBroadcastFirst(Main.OP_GROUP_NON_UNIFORM_BROADCAST_FIRST),
	OpGroupNonUniformBallot(Main.OP_GROUP_NON_UNIFORM_BALLOT),
	OpGroupNonUniformInverseBallot(Main.OP_GROUP_NON_UNIFORM_INVERSE_BALLOT),
	OpGroupNonUniformBallotBitExtract(Main.OP_GROUP_NON_UNIFORM_BALLOT_BIT_EXTRACT),
	OpGroupNonUniformBallotBitCount(Main.OP_GROUP_NON_UNIFORM_BALLOT_BIT_COUNT),
	OpGroupNonUniformBallotFindLSB(Main.OP_GROUP_NON_UNIFORM_BALLOT_FIND_LSB),
	OpGroupNonUniformBallotFindMSB(Main.OP_GROUP_NON_UNIFORM_BALLOT_FIND_MSB),
	OpGroupNonUniformShuffle(Main.OP_GROUP_NON_UNIFORM_SHUFFLE),
	OpGroupNonUniformShuffleXor(Main.OP_GROUP_NON_UNIFORM_SHUFFLE_XOR),
	OpGroupNonUniformShuffleUp(Main.OP_GROUP_NON_UNIFORM_SHUFFLE_UP),
	OpGroupNonUniformShuffleDown(Main.OP_GROUP_NON_UNIFORM_SHUFFLE_DOWN),
	OpGroupNonUniformIAdd(Main.OP_GROUP_NON_UNIFORM_I_ADD),
	OpGroupNonUniformFAdd(Main.OP_GROUP_NON_UNIFORM_F_ADD),
	OpGroupNonUniformIMul(Main.OP_GROUP_NON_UNIFORM_I_MUL),
	OpGroupNonUniformFMul(Main.OP_GROUP_NON_UNIFORM_F_MUL),
	OpGroupNonUniformSMin(Main.OP_GROUP_NON_UNIFORM_S_MIN),
	OpGroupNonUniformUMin(Main.OP_GROUP_NON_UNIFORM_U_MIN),
	OpGroupNonUniformFMin(Main.OP_GROUP_NON_UNIFORM_F_MIN),
	OpGroupNonUniformSMax(Main.OP_GROUP_NON_UNIFORM_S_MAX),
	OpGroupNonUniformUMax(Main.OP_GROUP_NON_UNIFORM_U_MAX),
	OpGroupNonUniformFMax(Main.OP_GROUP_NON_UNIFORM_F_MAX),
	OpGroupNonUniformBitwiseAnd(Main.OP_GROUP_NON_UNIFORM_BITWISE_AND),
	OpGroupNonUniformBitwiseOr(Main.OP_GROUP_NON_UNIFORM_BITWISE_OR),
	OpGroupNonUniformBitwiseXor(Main.OP_GROUP_NON_UNIFORM_BITWISE_XOR),
	OpGroupNonUniformLogicalAnd(Main.OP_GROUP_NON_UNIFORM_LOGICAL_AND),
	OpGroupNonUniformLogicalOr(Main.OP_GROUP_NON_UNIFORM_LOGICAL_OR),
	OpGroupNonUniformLogicalXor(Main.OP_GROUP_NON_UNIFORM_LOGICAL_XOR),
	OpGroupNonUniformQuadBroadcast(Main.OP_GROUP_NON_UNIFORM_QUAD_BROADCAST),
	OpGroupNonUniformQuadSwap(Main.OP_GROUP_NON_UNIFORM_QUAD_SWAP),
	OpCopyLogical(Main.OP_COPY_LOGICAL),
	OpPtrEqual(Main.OP_PTR_EQUAL),
	OpPtrNotEqual(Main.OP_PTR_NOT_EQUAL),
	OpPtrDiff(Main.OP_PTR_DIFF),
	OpSubgroupBallotKHR(Main.OP_SUBGROUP_BALLOT_KHR),
	OpSubgroupFirstInvocationKHR(Main.OP_SUBGROUP_FIRST_INVOCATION_KHR),
	OpSubgroupAllKHR(Main.OP_SUBGROUP_ALL_KHR),
	OpSubgroupAnyKHR(Main.OP_SUBGROUP_ANY_KHR),
	OpSubgroupAllEqualKHR(Main.OP_SUBGROUP_ALL_EQUAL_KHR),
	OpSubgroupReadInvocationKHR(Main.OP_SUBGROUP_READ_INVOCATION_KHR),
	OpTypeRayQueryProvisionalKHR(Main.Op_Type_Ray_Query_Provisional_KHR),
	OpRayQueryInitializeKHR(Main.OP_RAY_QUERY_INITIALIZE_KHR),
	OpRayQueryTerminateKHR(Main.OP_RAY_QUERY_TERMINATE_KHR),
	OpRayQueryGenerateIntersectionKHR(Main.OP_RAY_QUERY_GENERATE_INTERSECTION_KHR),
	OpRayQueryConfirmIntersectionKHR(Main.OP_RAY_QUERY_CONFIRM_INTERSECTION_KHR),
	OpRayQueryProceedKHR(Main.OP_RAY_QUERY_PROCEED_KHR),
	OpRayQueryGetIntersectionTypeKHR(Main.OP_RAY_QUERY_GET_INTERSECTION_TYPE_KHR),
	OpGroupIAddNonUniformAMD(Main.OP_GROUP_I_ADD_NON_UNIFORM_AMD),
	OpGroupFAddNonUniformAMD(Main.OP_GROUP_F_ADD_NON_UNIFORM_AMD),
	OpGroupFMinNonUniformAMD(Main.OP_GROUP_F_MIN_NON_UNIFORM_AMD),
	OpGroupUMinNonUniformAMD(Main.OP_GROUP_U_MIN_NON_UNIFORM_AMD),
	OpGroupSMinNonUniformAMD(Main.OP_GROUP_S_MIN_NON_UNIFORM_AMD),
	OpGroupFMaxNonUniformAMD(Main.OP_GROUP_F_MAX_NON_UNIFORM_AMD),
	OpGroupUMaxNonUniformAMD(Main.OP_GROUP_U_MAX_NON_UNIFORM_AMD),
	OpGroupSMaxNonUniformAMD(Main.OP_GROUP_S_MAX_NON_UNIFORM_AMD),
	OpFragmentMaskFetchAMD(Main.OP_FRAGMENT_MASK_FETCH_AMD),
	OpFragmentFetchAMD(Main.OP_FRAGMENT_FETCH_AMD),
	OpReadClockKHR(Main.OP_READ_CLOCK_KHR),
	OpImageSampleFootprintNV(Main.OP_IMAGE_SAMPLE_FOOTPRINT_NV),
	OpGroupNonUniformPartitionNV(Main.OP_GROUP_NON_UNIFORM_PARTITION_NV),
	OpWritePackedPrimitiveIndices4x8NV(Main.OP_WRITE_PACKED_PRIMITIVE_INDICES_4X8_NV),
	OpReportIntersectionKHR(Main.OP_REPORT_INTERSECTION_KHR),
	OpReportIntersectionNV(Main.OP_REPORT_INTERSECTION_NV),
	OpIgnoreIntersectionKHR(Main.OP_IGNORE_INTERSECTION_KHR),
	OpIgnoreIntersectionNV(Main.OP_IGNORE_INTERSECTION_NV),
	OpTerminateRayKHR(Main.OP_TERMINATE_RAY_KHR),
	OpTerminateRayNV(Main.OP_TERMINATE_RAY_NV),
	OpTraceNV(Main.OP_TRACE_NV),
	OpTraceRayKHR(Main.OP_TRACE_RAY_KHR),
	OpTypeAccelerationStructureKHR(Main.OP_TYPE_ACCELERATION_STRUCTURE_KHR),
	OpTypeAccelerationStructureNV(Main.OP_TYPE_ACCELERATION_STRUCTURE_NV),
	OpExecuteCallableKHR(Main.OP_EXECUTE_CALLABLE_KHR),
	OpExecuteCallableNV(Main.OP_EXECUTE_CALLABLE_NV),
	OpTypeCooperativeMatrixNV(Main.OP_TYPE_COOPERATIVE_MATRIX_NV),
	OpCooperativeMatrixLoadNV(Main.OP_COOPERATIVE_MATRIX_LOAD_NV),
	OpCooperativeMatrixStoreNV(Main.OP_COOPERATIVE_MATRIX_STORE_NV),
	OpCooperativeMatrixMulAddNV(Main.OP_COOPERATIVE_MATRIX_MUL_ADD_NV),
	OpCooperativeMatrixLengthNV(Main.OP_COOPERATIVE_MATRIX_LENGTH_NV),
	OpBeginInvocationInterlockEXT(Main.OP_BEGIN_INVOCATION_INTERLOCK_EXT),
	OpEndInvocationInterlockEXT(Main.OP_END_INVOCATION_INTERLOCK_EXT),
	OpDemoteToHelperInvocationEXT(Main.OP_DEMOTE_TO_HELPER_INVOCATION_EXT),
	OpIsHelperInvocationEXT(Main.OP_IS_HELPER_INVOCATION_EXT),
	OpSubgroupShuffleINTEL(Main.OP_SUBGROUP_SHUFFLE_INTEL),
	OpSubgroupShuffleDownINTEL(Main.OP_SUBGROUP_SHUFFLE_DOWN_INTEL),
	OpSubgroupShuffleUpINTEL(Main.OP_SUBGROUP_SHUFFLE_UP_INTEL),
	OpSubgroupShuffleXorINTEL(Main.OP_SUBGROUP_SHUFFLE_XOR_INTEL),
	OpSubgroupBlockReadINTEL(Main.OP_SUBGROUP_BLOCK_READ_INTEL),
	OpSubgroupBlockWriteINTEL(Main.OP_SUBGROUP_BLOCK_WRITE_INTEL),
	OpSubgroupImageBlockReadINTEL(Main.OP_SUBGROUP_IMAGE_BLOCK_READ_INTEL),
	OpSubgroupImageBlockWriteINTEL(Main.OP_SUBGROUP_IMAGE_BLOCK_WRITE_INTEL),
	OpSubgroupImageMediaBlockReadINTEL(Main.OP_SUBGROUP_IMAGE_MEDIA_BLOCK_READ_INTEL),
	OpSubgroupImageMediaBlockWriteINTEL(Main.OP_SUBGROUP_IMAGE_MEDIA_BLOCK_WRITE_INTEL),
	OpUCountLeadingZerosINTEL(Main.OP_U_COUNT_LEADING_ZEROS_INTEL),
	OpUCountTrailingZerosINTEL(Main.OP_U_COUNT_TRAILING_ZEROS_INTEL),
	OpAbsISubINTEL(Main.OP_ABS_I_SUB_INTEL),
	OpAbsUSubINTEL(Main.OP_ABS_U_SUB_INTEL),
	OpIAddSatINTEL(Main.OP_I_ADD_SAT_INTEL),
	OpUAddSatINTEL(Main.OP_U_ADD_SAT_INTEL),
	OpIAverageINTEL(Main.OP_I_AVERAGE_INTEL),
	OpUAverageINTEL(Main.OP_U_AVERAGE_INTEL),
	OpIAverageRoundedINTEL(Main.OP_I_AVERAGE_ROUNDED_INTEL),
	OpUAverageRoundedINTEL(Main.OP_U_AVERAGE_ROUNDED_INTEL),
	OpISubSatINTEL(Main.OP_I_SUB_SAT_INTEL),
	OpUSubSatINTEL(Main.OP_U_SUB_SAT_INTEL),
	OpIMul32x16INTEL(Main.OP_I_MUL_32X16_INTEL),
	OpUMul32x16INTEL(Main.OP_U_MUL_32X16_INTEL),
	OpFunctionPointerINTEL(Main.OP_FUNCTION_POINTER_INTEL),
	OpFunctionPointerCallINTEL(Main.OP_FUNCTION_POINTER_CALL_INTEL),
	OpDecorateString(Main.OP_DECORATE_STRING),
	OpDecorateStringGOOGLE(Main.OP_DECORATE_STRING_GOOGLE),
	OpMemberDecorateString(Main.OP_MEMBER_DECORATE_STRING),
	OpMemberDecorateStringGOOGLE(Main.OP_MEMBER_DECORATE_STRING_GOOGLE),
	OpVmeImageINTEL(Main.OP_VME_IMAGE_INTEL),
	OpTypeVmeImageINTEL(Main.OP_TYPE_VME_IMAGE_INTEL),
	OpTypeAvcImePayloadINTEL(Main.OP_TYPE_AVC_IME_PAYLOAD_INTEL),
	OpTypeAvcRefPayloadINTEL(Main.OP_TYPE_AVC_REF_PAYLOAD_INTEL),
	OpTypeAvcSicPayloadINTEL(Main.OP_TYPE_AVC_SIC_PAYLOAD_INTEL),
	OpTypeAvcMcePayloadINTEL(Main.OP_TYPE_AVC_MCE_PAYLOAD_INTEL),
	OpTypeAvcMceResultINTEL(Main.OP_TYPE_AVC_MCE_RESULT_INTEL),
	OpTypeAvcImeResultINTEL(Main.OP_TYPE_AVC_IME_RESULT_INTEL),
	OpTypeAvcImeResultSingleReferenceStreamoutINTEL(Main.OP_TYPE_AVC_IME_RESULT_SINGLE_REFERENCE_STREAMOUT_INTEL),
	OpTypeAvcImeResultDualReferenceStreamoutINTEL(Main.OP_TYPE_AVC_IME_RESULT_DUAL_REFERENCE_STREAMOUT_INTEL),
	OpTypeAvcImeSingleReferenceStreaminINTEL(Main.OP_TYPE_AVC_IME_SINGLE_REFERENCE_STREAMIN_INTEL),
	OpTypeAvcImeDualReferenceStreaminINTEL(Main.OP_TYPE_AVC_IME_DUAL_REFERENCE_STREAMIN_INTEL),
	OpTypeAvcRefResultINTEL(Main.OP_TYPE_AVC_REF_RESULT_INTEL),
	OpTypeAvcSicResultINTEL(Main.OP_TYPE_AVC_SIC_RESULT_INTEL),
	OpSubgroupAvcMceGetDefaultInterBaseMultiReferencePenaltyINTEL(
			Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTER_BASE_MULTI_REFERENCE_PENALTY_INTEL),
	OpSubgroupAvcMceSetInterBaseMultiReferencePenaltyINTEL(
			Main.OP_SUBGROUP_AVC_MCE_SET_INTER_BASE_MULTI_REFERENCE_PENALTY_INTEL),
	OpSubgroupAvcMceGetDefaultInterShapePenaltyINTEL(Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTER_SHAPE_PENALTY_INTEL),
	OpSubgroupAvcMceSetInterShapePenaltyINTEL(Main.OP_SUBGROUP_AVC_MCE_SET_INTER_SHAPE_PENALTY_INTEL),
	OpSubgroupAvcMceGetDefaultInterDirectionPenaltyINTEL(
			Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTER_DIRECTION_PENALTY_INTEL),
	OpSubgroupAvcMceSetInterDirectionPenaltyINTEL(Main.OP_SUBGROUP_AVC_MCE_SET_INTE_DIRECTION_PENALTY_INTEL),
	OpSubgroupAvcMceGetDefaultIntraLumaShapePenaltyINTEL(
			Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTRA_LUMA_SHAPE_PENALTY_INTEL),
	OpSubgroupAvcMceGetDefaultInterMotionVectorCostTableINTEL(
			Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTER_MOTION_VECTOR_COST_TABLE_INTEL),
	OpSubgroupAvcMceGetDefaultHighPenaltyCostTableINTEL(
			Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_HIGH_PENALTY_COST_TABLE_INTEL),
	OpSubgroupAvcMceGetDefaultMediumPenaltyCostTableINTEL(
			Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_MEDIUM_PENALTY_COST_TABLE_INTEL),
	OpSubgroupAvcMceGetDefaultLowPenaltyCostTableINTEL(
			Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_LOW_PENALTY_COST_TABLE_INTEL),
	OpSubgroupAvcMceSetMotionVectorCostFunctionINTEL(Main.OP_SUBGROUP_AVC_MCE_SET_MOTION_VECTOR_COST_FUNCTION_INTEL),
	OpSubgroupAvcMceGetDefaultIntraLumaModePenaltyINTEL(
			Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTRA_LUMA_MODE_PENALTY_INTEL),
	OpSubgroupAvcMceGetDefaultNonDcLumaIntraPenaltyINTEL(
			Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_NON_DC_LUMA_INTRA_PENALTY_INTEL),
	OpSubgroupAvcMceGetDefaultIntraChromaModeBasePenaltyINTEL(
			Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTRA_CHROMA_MODE_BASE_PENALTY_INTEL),
	OpSubgroupAvcMceSetAcOnlyHaarINTEL(Main.OP_SUBGROUP_AVC_MCE_SET_AC_ONLY_HAAR_INTEL),
	OpSubgroupAvcMceSetSourceInterlacedFieldPolarityINTEL(
			Main.OP_SUBGROUP_AVC_MCE_SET_SOURCE_INTERLACED_FIELD_POLARITY_INTEL),
	OpSubgroupAvcMceSetSingleReferenceInterlacedFieldPolarityINTEL(
			Main.OP_SUBGROUP_AVC_MCE_SET_SINGLE_REFERENCE_INTERLACED_FIELD_POLARITY_INTEL),
	OpSubgroupAvcMceSetDualReferenceInterlacedFieldPolaritiesINTEL(
			Main.OP_SUBGROUP_AVC_MCE_SET_DUAL_REFERENCE_INTERLACED_FIELD_POLARITIES_INTEL),
	OpSubgroupAvcMceConvertToImePayloadINTEL(Main.OP_SUBGROUP_AVC_MCE_CONVERT_TO_IME_PAYLOAD_INTEL),
	OpSubgroupAvcMceConvertToImeResultINTEL(Main.OP_SUBGROUP_AVC_MCE_CONVERT_TO_IME_RESULT_INTEL),
	OpSubgroupAvcMceConvertToRefPayloadINTEL(Main.OP_SUBGROUP_AVC_MCE_CONVERT_TO_REF_PAYLOAD_INTEL),
	OpSubgroupAvcMceConvertToRefResultINTEL(Main.OP_SUBGROUP_AVC_MCE_CONVERT_TO_REF_RESULT_INTEL),
	OpSubgroupAvcMceConvertToSicPayloadINTEL(Main.OP_SUBGROUP_AVC_MCE_CONVERT_TO_SIC_PAYLOAD_INTEL),
	OpSubgroupAvcMceConvertToSicResultINTEL(Main.OP_SUBGROUP_AVC_MCE_CONVERT_TO_SIC_RESULT_INTEL),
	OpSubgroupAvcMceGetMotionVectorsINTEL(Main.OP_SUBGROUP_AVC_MCE_GET_MOTION_VECTORS_INTEL),
	OpSubgroupAvcMceGetInterDistortionsINTEL(Main.OP_SUBGROUP_AVC_MCE_GET_INTER_DISTORTIONS_INTEL),
	OpSubgroupAvcMceGetBestInterDistortionsINTEL(Main.OP_SUBGROUP_AVC_MCE_GET_BEST_INTER_DISTORTIONS_INTEL),
	OpSubgroupAvcMceGetInterMajorShapeINTEL(Main.OP_SUBGROUP_AVC_MCE_GET_INTER_MAJOR_SHAPE_INTEL),
	OpSubgroupAvcMceGetInterMinorShapeINTEL(Main.OP_SUBGROUP_AVC_MCE_GET_INTER_MINOR_SHAPE_INTEL),
	OpSubgroupAvcMceGetInterDirectionsINTEL(Main.OP_SUBGROUP_AVC_MCE_GET_INTER_DIRECTIONS_INTEL),
	OpSubgroupAvcMceGetInterMotionVectorCountINTEL(Main.OP_SUBGROUP_AVC_MCE_GET_INTER_MOTION_VECTOR_COUNT_INTEL),
	OpSubgroupAvcMceGetInterReferenceIdsINTEL(Main.OP_SUBGROUP_AVC_MCE_GET_INTER_REFERENCE_IDS_INTEL),
	OpSubgroupAvcMceGetInterReferenceInterlacedFieldPolaritiesINTEL(
			Main.OP_SUBGROUP_AVC_MCE_GET_INTER_REFERENCE_INTERLACED_FIELD_POLARITIES_INTEL),
	OpSubgroupAvcImeInitializeINTEL(Main.Op_Subgroup_Avc_Ime_Initialize_INTEL),
	OpSubgroupAvcImeSetSingleReferenceINTEL(Main.OP_SUBGROUP_AVC_IME_SET_SINGLE_REFERENCE_INTEL),
	OpSubgroupAvcImeSetDualReferenceINTEL(Main.OP_SUBGROUP_AVC_IME_SET_DUAL_REFERENCE_INTEL),
	OpSubgroupAvcImeRefWindowSizeINTEL(Main.OP_SUBGROUP_AVC_IME_REF_WINDOW_SIZE_INTEL),
	OpSubgroupAvcImeAdjustRefOffsetINTEL(Main.OP_SUBGROUP_AVC_IME_ADJUST_REF_OFFSET_INTEL),
	OpSubgroupAvcImeConvertToMcePayloadINTEL(Main.OP_SUBGROUP_AVC_IME_CONVERT_TO_MCE_PAYLOAD_INTEL),
	OpSubgroupAvcImeSetMaxMotionVectorCountINTEL(Main.OP_SUBGROUP_AVC_IME_SET_MAX_MOTION_VECTOR_COUNT_INTEL),
	OpSubgroupAvcImeSetUnidirectionalMixDisableINTEL(Main.OP_SUBGROUP_AVC_IME_SET_UNIDIRECTIONAL_MIX_DISABLE_INTEL),
	OpSubgroupAvcImeSetEarlySearchTerminationThresholdINTEL(
			Main.OP_SUBGROUP_AVC_IME_SET_EARLY_SEARCH_TERMINATION_THRESHOLD_INTEL),
	OpSubgroupAvcImeSetWeightedSadINTEL(Main.OP_SUBGROUP_AVC_IME_SET_WEIGHTED_SAD_INTEL),
	OpSubgroupAvcImeEvaluateWithSingleReferenceINTEL(Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_SINGLE_REFERENCE_INTEL),
	OpSubgroupAvcImeEvaluateWithDualReferenceINTEL(Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_DUAL_REFERENCE_INTEL),
	OpSubgroupAvcImeEvaluateWithSingleReferenceStreaminINTEL(
			Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_SINGLE_REFERENCE_STREAMIN_INTEL),
	OpSubgroupAvcImeEvaluateWithDualReferenceStreaminINTEL(
			Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_DUAL_REFERENCE_STREAMIN_INTEL),
	OpSubgroupAvcImeEvaluateWithSingleReferenceStreamoutINTEL(
			Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_SINGLE_REFERENCE_STREAMOUT_INTEL),
	OpSubgroupAvcImeEvaluateWithDualReferenceStreamoutINTEL(
			Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_DUAL_REFERENCE_STREAMOUT_INTEL),
	OpSubgroupAvcImeEvaluateWithSingleReferenceStreaminoutINTEL(
			Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_SINGLE_REFERENCE_STREAMINOUT_INTEL),
	OpSubgroupAvcImeEvaluateWithDualReferenceStreaminoutINTEL(
			Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_DUAL_REFERENCE_STREAMINOUT_INTEL),
	OpSubgroupAvcImeConvertToMceResultINTEL(Main.OP_SUBGROUP_AVC_IME_CONVERT_TO_MCE_RESULT_INTEL),
	OpSubgroupAvcImeGetSingleReferenceStreaminINTEL(Main.OP_SUBGROUP_AVC_IME_GET_SINGLE_REFERENCE_STREAMIN_INTEL),
	OpSubgroupAvcImeGetDualReferenceStreaminINTEL(Main.OP_SUBGROUP_AVC_IME_GET_DUAL_REFERENCE_STREAMIN_INTEL),
	OpSubgroupAvcImeStripSingleReferenceStreamoutINTEL(Main.OP_SUBGROUP_AVC_IME_STRIP_SINGLE_REFERENCE_STREAMOUT_INTEL),
	OpSubgroupAvcImeStripDualReferenceStreamoutINTEL(Main.OP_SUBGROUP_AVC_IME_STRIP_DUAL_REFERENCE_STREAMOUT_INTEL),
	OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeMotionVectorsINTEL(
			Main.OP_SUBGROUP_AVC_IME_GET_STREAMOUT_SINGLE_REFERENCE_MAJOR_SHAPE_MOTION_VECTORS_INTEL),
	OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeDistortionsINTEL(
			Main.OP_SUBGROUP_AVC_IME_GET_STREAMOUT_SINGLE_REFERENCE_MAJOR_SHAPE_DISTORTIONS_INTEL),
	OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeReferenceIdsINTEL(
			Main.OP_SUBGROUP_AVC_IME_GET_STREAMOUT_SINGLE_REFERENCE_MAJOR_SHAPE_REFERENCE_IDS_INTEL),
	OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeMotionVectorsINTEL(
			Main.OP_SUBGROUP_AVC_IME_GET_STREAMOUT_DUAL_REFERENCE_MAJOR_SHAPE_MOTION_VECTORS_INTEL),
	OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeDistortionsINTEL(
			Main.OP_SUBGROUP_AVC_IME_GET_STREAMOUT_DUAL_REFERENCE_MAJOR_SHAPE_DISTORTIONS_INTEL),
	OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeReferenceIdsINTEL(
			Main.OP_SUBGROUP_AVC_IME_GET_STREAMOUT_DUAL_REFERENCE_MAJOR_SHAPE_REFERENCE_IDS_INTEL),
	OpSubgroupAvcImeGetBorderReachedINTEL(Main.OP_SUBGROUP_AVC_IME_GET_BORDER_REACHED_INTEL),
	OpSubgroupAvcImeGetTruncatedSearchIndicationINTEL(Main.OP_SUBGROUP_AVC_IME_GET_TRUNCATED_SEARCH_INDICATION_INTEL),
	OpSubgroupAvcImeGetUnidirectionalEarlySearchTerminationINTEL(
			Main.OP_SUBGROUP_AVC_IME_GET_UNIDIRECTIONAL_EARLY_SEARCH_TERMINATION_INTEL),
	OpSubgroupAvcImeGetWeightingPatternMinimumMotionVectorINTEL(
			Main.OP_SUBGROUP_AVC_IME_GET_WEIGHTING_PATTERN_MINIMUM_MOTION_VECTOR_INTEL),
	OpSubgroupAvcImeGetWeightingPatternMinimumDistortionINTEL(
			Main.OP_SUBGROUP_AVC_IME_GET_WEIGHTING_PATTERN_MINIMUM_DISTORTION_INTEL),
	OpSubgroupAvcFmeInitializeINTEL(Main.OP_SUBGROUP_AVC_FME_INITIALIZE_INTEL),
	OpSubgroupAvcBmeInitializeINTEL(Main.OP_SUBGROUP_AVC_BME_INITIALIZE_INTEL),
	OpSubgroupAvcRefConvertToMcePayloadINTEL(Main.OP_SUBGROUP_AVC_REF_CONVERT_TO_MCE_PAYLOAD_INTEL),
	OpSubgroupAvcRefSetBidirectionalMixDisableINTEL(Main.OP_SUBGROUP_AVC_REF_SET_BIDIRECTIONAL_MIX_DISABLE_INTEL),
	OpSubgroupAvcRefSetBilinearFilterEnableINTEL(Main.OP_SUBGROUP_AVC_REF_SET_BILINEAR_FILTER_ENABLE_INTEL),
	OpSubgroupAvcRefEvaluateWithSingleReferenceINTEL(Main.OP_SUBGROUP_AVC_REF_EVALUATE_WITH_SINGLE_REFERENCE_INTEL),
	OpSubgroupAvcRefEvaluateWithDualReferenceINTEL(Main.OP_SUBGROUP_AVC_REF_EVALUATE_WITH_DUAL_REFERENCE_INTEL),
	OpSubgroupAvcRefEvaluateWithMultiReferenceINTEL(Main.OP_SUBGROUP_AVC_REF_EVALUATE_WITH_MULTI_REFERENCE_INTEL),
	OpSubgroupAvcRefEvaluateWithMultiReferenceInterlacedINTEL(
			Main.OP_SUBGROUP_AVC_REF_EVALUATE_WITH_MULTI_REFERENCE_INTERLACED_INTEL),
	OpSubgroupAvcRefConvertToMceResultINTEL(Main.OP_SUBGROUP_AVC_REF_CONVERT_TO_MCE_RESULT_INTEL),
	OpSubgroupAvcSicInitializeINTEL(Main.OP_SUBGROUP_AVC_SIC_INITIALIZE_INTEL),
	OpSubgroupAvcSicConfigureSkcINTEL(Main.OP_SUBGROUP_AVC_SIC_CONFIGURE_SKC_INTEL),
	OpSubgroupAvcSicConfigureIpeLumaINTEL(Main.OP_SUBGROUP_AVC_SIC_CONFIGURE_IPE_LUMA_INTEL),
	OpSubgroupAvcSicConfigureIpeLumaChromaINTEL(Main.OP_SUBGROUP_AVC_SIC_CONFIGURE_IPE_LUMA_CHROMA_INTEL),
	OpSubgroupAvcSicGetMotionVectorMaskINTEL(Main.OP_SUBGROUP_AVC_SIC_GET_MOTION_VECTOR_MASK_INTEL),
	OpSubgroupAvcSicConvertToMcePayloadINTEL(Main.OP_SUBGROUP_AVC_SIC_CONVERT_TO_MCE_PAYLOAD_INTEL),
	OpSubgroupAvcSicSetIntraLumaShapePenaltyINTEL(Main.OP_SUBGROUP_AVC_SIC_SET_INTRA_LUMA_SHAPE_PENALTY_INTEL),
	OpSubgroupAvcSicSetIntraLumaModeCostFunctionINTEL(Main.OP_SUBGROUP_AVC_SIC_SET_INTRA_LUMA_MODE_COST_FUNCTION_INTEL),
	OpSubgroupAvcSicSetIntraChromaModeCostFunctionINTEL(
			Main.OP_SUBGROUP_AVC_SIC_SET_INTRA_CHROMA_MODE_COST_FUNCTION_INTEL),
	OpSubgroupAvcSicSetBilinearFilterEnableINTEL(Main.OP_SUBGROUP_AVC_SIC_SET_BILINEAR_FILTER_ENABLE_INTEL),
	OpSubgroupAvcSicSetSkcForwardTransformEnableINTEL(Main.OP_SUBGROUP_AVC_SIC_SET_SKC_FORWARD_TRANSFORM_ENABLE_INTEL),
	OpSubgroupAvcSicSetBlockBasedRawSkipSadINTEL(Main.OP_SUBGROUP_AVC_SIC_SET_BLOCK_BASED_RAW_SKIP_SAD_INTEL),
	OpSubgroupAvcSicEvaluateIpeINTEL(Main.OP_SUBGROUP_AVC_SIC_EVALUATE_IPE_INTEL),
	OpSubgroupAvcSicEvaluateWithSingleReferenceINTEL(Main.OP_SUBGROUP_AVC_SIC_EVALUATE_WITH_SINGLE_REFERENCE_INTEL),
	OpSubgroupAvcSicEvaluateWithDualReferenceINTEL(Main.OP_SUBGROUP_AVC_SIC_EVALUATE_WITH_DUAL_REFERENCE_INTEL),
	OpSubgroupAvcSicEvaluateWithMultiReferenceINTEL(Main.OP_SUBGROUP_AVC_SIC_EVALUATE_WITH_MULTI_REFERENCE_INTEL),
	OpSubgroupAvcSicEvaluateWithMultiReferenceInterlacedINTEL(
			Main.OP_SUBGROUP_AVC_SIC_EVALUATE_WITH_MULTI_REFERENCE_INTERLACED_INTEL),
	OpSubgroupAvcSicConvertToMceResultINTEL(Main.OP_SUBGROUP_AVC_SIC_CONVERT_TO_MCE_RESULT_INTEL),
	OpSubgroupAvcSicGetIpeLumaShapeINTEL(Main.OP_SUBGROUP_AVC_SIC_GET_IPE_LUMA_SHAPE_INTEL),
	OpSubgroupAvcSicGetBestIpeLumaDistortionINTEL(Main.OP_SUBGROUP_AVC_SIC_GET_BEST_IPE_LUMA_DISTORTION_INTEL),
	OpSubgroupAvcSicGetBestIpeChromaDistortionINTEL(Main.OP_SUBGROUP_AVC_SIC_GET_BEST_IPE_CHROMA_DISTORTION_INTEL),
	OpSubgroupAvcSicGetPackedIpeLumaModesINTEL(Main.OP_SUBGROUP_AVC_SIC_GET_PACKED_IPE_LUMA_MODES_INTEL),
	OpSubgroupAvcSicGetIpeChromaModeINTEL(Main.OP_SUBGROUP_AVC_SIC_GET_IPE_CHROMA_MODE_INTEL),
	OpSubgroupAvcSicGetPackedSkcLumaCountThresholdINTEL(
			Main.OP_SUBGROUP_AVC_SIC_GET_PACKED_SKC_LUMA_COUNT_THRESHOLD_INTEL),
	OpSubgroupAvcSicGetPackedSkcLumaSumThresholdINTEL(Main.OP_SUBGROUP_AVC_SIC_GET_PACKED_SKC_LUMA_SUM_THRESHOLD_INTEL),
	OpSubgroupAvcSicGetInterRawSadsINTEL(Main.OP_SUBGROUP_AVC_SIC_GET_INTER_RAW_SADS_INTEL),
	OpLoopControlINTEL(Main.OP_LOOP_CONTROL_INTEL),
	OpReadPipeBlockingINTEL(Main.OP_READ_PIPE_BLOCKING_INTEL),
	OpWritePipeBlockingINTEL(Main.OP_WRITE_PIPE_BLOCKING_INTEL),
	OpFPGARegINTEL(Main.OP_FPGA_REG_INTEL),
	OpRayQueryGetRayTMinKHR(Main.OP_RAY_QUERY_GET_RAYTMIN_KHR),
	OpRayQueryGetRayFlagsKHR(Main.OP_RAY_QUERY_GET_RAYFLAGS_KHR),
	OpRayQueryGetIntersectionTKHR(Main.OP_RAY_QUERY_GET_INTERSECTION_T_KHR),
	OpRayQueryGetIntersectionInstanceCustomIndexKHR(Main.OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_CUSTOM_INDEX_KHR),
	OpRayQueryGetIntersectionInstanceIdKHR(Main.OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_ID_KHR),
	OpRayQueryGetIntersectionInstanceShaderBindingTableRecordOffsetKHR(
			Main.OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_SHADER_BINDING_TABLE_RECORD_OFFSET_KHR),
	OpRayQueryGetIntersectionGeometryIndexKHR(Main.OP_RAY_QUERY_GET_INTERSECTION_GEOMETRY_INDEX_KHR),
	OpRayQueryGetIntersectionPrimitiveIndexKHR(Main.OP_RAY_QUERY_GET_INTERSECTION_PRIMITIVE_INDEX_KHR),
	OpRayQueryGetIntersectionBarycentricsKHR(Main.OP_RAY_QUERY_GET_INTERSECTION_BARYCENTRICS_KHR),
	OpRayQueryGetIntersectionFrontFaceKHR(Main.OP_RAY_QUERY_GET_INTERSECTION_FRONT_FACE_KHR),
	OpRayQueryGetIntersectionCandidateAABBOpaqueKHR(Main.OP_RAY_QUERY_GET_INTERSECTION_CANDIDATE_AABB_OPAQUE_KHR),
	OpRayQueryGetIntersectionObjectRayDirectionKHR(Main.OP_RAY_QUERY_GET_INTERSECTION_OBJECT_RAY_DIRECTION_KHR),
	OpRayQueryGetIntersectionObjectRayOriginKHR(Main.OP_RAY_QUERY_GET_INTERSECTION_OBJECT_RAY_ORIGIN_KHR),
	OpRayQueryGetWorldRayDirectionKHR(Main.OP_RAY_QUERY_GET_WORLD_RAY_DIRECTION_KHR),
	OpRayQueryGetWorldRayOriginKHR(Main.OP_RAY_QUERY_GET_WORLD_RAY_ORIGIN_KHR),
	OpRayQueryGetIntersectionObjectToWorldKHR(Main.OP_RAY_QUERY_GET_INTERSECTION_OBJECT_TO_WORLD_KHR),
	OpRayQueryGetIntersectionWorldToObjectKHR(Main.OP_RAY_QUERY_GET_INTERSECTION_WORLD_TO_OBJECT_KHR),
	OpAtomicFAddEXT(Main.OP_ATOMIC_F_ADD_EXT),
	OpMax(Main.OP_MAX);

	private final int value;

	private Op(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static Op valueByStr(String str) {
		switch (str) {
			case "OpNop":
				return OpNop;
			case "OpUndef":
				return OpUndef;
			case "OpSourceContinued":
				return OpSourceContinued;
			case "OpSource":
				return OpSource;
			case "OpSourceExtension":
				return OpSourceExtension;
			case "OpName":
				return OpName;
			case "OpMemberName":
				return OpMemberName;
			case "OpString":
				return OpString;
			case "OpLine":
				return OpLine;
			case "OpExtension":
				return OpExtension;
			case "OpExtInstImport":
				return OpExtInstImport;
			case "OpExtInst":
				return OpExtInst;
			case "OpMemoryModel":
				return OpMemoryModel;
			case "OpEntryPoint":
				return OpEntryPoint;
			case "OpExecutionMode":
				return OpExecutionMode;
			case "OpCapability":
				return OpCapability;
			case "OpTypeVoid":
				return OpTypeVoid;
			case "OpTypeBool":
				return OpTypeBool;
			case "OpTypeInt":
				return OpTypeInt;
			case "OpTypeFloat":
				return OpTypeFloat;
			case "OpTypeVector":
				return OpTypeVector;
			case "OpTypeMatrix":
				return OpTypeMatrix;
			case "OpTypeImage":
				return OpTypeImage;
			case "OpTypeSampler":
				return OpTypeSampler;
			case "OpTypeSampledImage":
				return OpTypeSampledImage;
			case "OpTypeArray":
				return OpTypeArray;
			case "OpTypeRuntimeArray":
				return OpTypeRuntimeArray;
			case "OpTypeStruct":
				return OpTypeStruct;
			case "OpTypeOpaque":
				return OpTypeOpaque;
			case "OpTypePointer":
				return OpTypePointer;
			case "OpTypeFunction":
				return OpTypeFunction;
			case "OpTypeEvent":
				return OpTypeEvent;
			case "OpTypeDeviceEvent":
				return OpTypeDeviceEvent;
			case "OpTypeReserveId":
				return OpTypeReserveId;
			case "OpTypeQueue":
				return OpTypeQueue;
			case "OpTypePipe":
				return OpTypePipe;
			case "OpTypeForwardPointer":
				return OpTypeForwardPointer;
			case "OpConstantTrue":
				return OpConstantTrue;
			case "OpConstantFalse":
				return OpConstantFalse;
			case "OpConstant":
				return OpConstant;
			case "OpConstantComposite":
				return OpConstantComposite;
			case "OpConstantSampler":
				return OpConstantSampler;
			case "OpConstantNull":
				return OpConstantNull;
			case "OpSpecConstantTrue":
				return OpSpecConstantTrue;
			case "OpSpecConstantFalse":
				return OpSpecConstantFalse;
			case "OpSpecConstant":
				return OpSpecConstant;
			case "OpSpecConstantComposite":
				return OpSpecConstantComposite;
			case "OpSpecConstantOp":
				return OpSpecConstantOp;
			case "OpFunction":
				return OpFunction;
			case "OpFunctionParameter":
				return OpFunctionParameter;
			case "OpFunctionEnd":
				return OpFunctionEnd;
			case "OpFunctionCall":
				return OpFunctionCall;
			case "OpVariable":
				return OpVariable;
			case "OpImageTexelPointer":
				return OpImageTexelPointer;
			case "OpLoad":
				return OpLoad;
			case "OpStore":
				return OpStore;
			case "OpCopyMemory":
				return OpCopyMemory;
			case "OpCopyMemorySized":
				return OpCopyMemorySized;
			case "OpAccessChain":
				return OpAccessChain;
			case "OpInBoundsAccessChain":
				return OpInBoundsAccessChain;
			case "OpPtrAccessChain":
				return OpPtrAccessChain;
			case "OpArrayLength":
				return OpArrayLength;
			case "OpGenericPtrMemSemantics":
				return OpGenericPtrMemSemantics;
			case "OpInBoundsPtrAccessChain":
				return OpInBoundsPtrAccessChain;
			case "OpDecorate":
				return OpDecorate;
			case "OpMemberDecorate":
				return OpMemberDecorate;
			case "OpDecorationGroup":
				return OpDecorationGroup;
			case "OpGroupDecorate":
				return OpGroupDecorate;
			case "OpGroupMemberDecorate":
				return OpGroupMemberDecorate;
			case "OpVectorExtractDynamic":
				return OpVectorExtractDynamic;
			case "OpVectorInsertDynamic":
				return OpVectorInsertDynamic;
			case "OpVectorShuffle":
				return OpVectorShuffle;
			case "OpCompositeConstruct":
				return OpCompositeConstruct;
			case "OpCompositeExtract":
				return OpCompositeExtract;
			case "OpCompositeInsert":
				return OpCompositeInsert;
			case "OpCopyObject":
				return OpCopyObject;
			case "OpTranspose":
				return OpTranspose;
			case "OpSampledImage":
				return OpSampledImage;
			case "OpImageSampleImplicitLod":
				return OpImageSampleImplicitLod;
			case "OpImageSampleExplicitLod":
				return OpImageSampleExplicitLod;
			case "OpImageSampleDrefImplicitLod":
				return OpImageSampleDrefImplicitLod;
			case "OpImageSampleDrefExplicitLod":
				return OpImageSampleDrefExplicitLod;
			case "OpImageSampleProjImplicitLod":
				return OpImageSampleProjImplicitLod;
			case "OpImageSampleProjExplicitLod":
				return OpImageSampleProjExplicitLod;
			case "OpImageSampleProjDrefImplicitLod":
				return OpImageSampleProjDrefImplicitLod;
			case "OpImageSampleProjDrefExplicitLod":
				return OpImageSampleProjDrefExplicitLod;
			case "OpImageFetch":
				return OpImageFetch;
			case "OpImageGather":
				return OpImageGather;
			case "OpImageDrefGather":
				return OpImageDrefGather;
			case "OpImageRead":
				return OpImageRead;
			case "OpImageWrite":
				return OpImageWrite;
			case "OpImage":
				return OpImage;
			case "OpImageQueryFormat":
				return OpImageQueryFormat;
			case "OpImageQueryOrder":
				return OpImageQueryOrder;
			case "OpImageQuerySizeLod":
				return OpImageQuerySizeLod;
			case "OpImageQuerySize":
				return OpImageQuerySize;
			case "OpImageQueryLod":
				return OpImageQueryLod;
			case "OpImageQueryLevels":
				return OpImageQueryLevels;
			case "OpImageQuerySamples":
				return OpImageQuerySamples;
			case "OpConvertFToU":
				return OpConvertFToU;
			case "OpConvertFToS":
				return OpConvertFToS;
			case "OpConvertSToF":
				return OpConvertSToF;
			case "OpConvertUToF":
				return OpConvertUToF;
			case "OpUConvert":
				return OpUConvert;
			case "OpSConvert":
				return OpSConvert;
			case "OpFConvert":
				return OpFConvert;
			case "OpQuantizeToF16":
				return OpQuantizeToF16;
			case "OpConvertPtrToU":
				return OpConvertPtrToU;
			case "OpSatConvertSToU":
				return OpSatConvertSToU;
			case "OpSatConvertUToS":
				return OpSatConvertUToS;
			case "OpConvertUToPtr":
				return OpConvertUToPtr;
			case "OpPtrCastToGeneric":
				return OpPtrCastToGeneric;
			case "OpGenericCastToPtr":
				return OpGenericCastToPtr;
			case "OpGenericCastToPtrExplicit":
				return OpGenericCastToPtrExplicit;
			case "OpBitcast":
				return OpBitcast;
			case "OpSNegate":
				return OpSNegate;
			case "OpFNegate":
				return OpFNegate;
			case "OpIAdd":
				return OpIAdd;
			case "OpFAdd":
				return OpFAdd;
			case "OpISub":
				return OpISub;
			case "OpFSub":
				return OpFSub;
			case "OpIMul":
				return OpIMul;
			case "OpFMul":
				return OpFMul;
			case "OpUDiv":
				return OpUDiv;
			case "OpSDiv":
				return OpSDiv;
			case "OpFDiv":
				return OpFDiv;
			case "OpUMod":
				return OpUMod;
			case "OpSRem":
				return OpSRem;
			case "OpSMod":
				return OpSMod;
			case "OpFRem":
				return OpFRem;
			case "OpFMod":
				return OpFMod;
			case "OpVectorTimesScalar":
				return OpVectorTimesScalar;
			case "OpMatrixTimesScalar":
				return OpMatrixTimesScalar;
			case "OpVectorTimesMatrix":
				return OpVectorTimesMatrix;
			case "OpMatrixTimesVector":
				return OpMatrixTimesVector;
			case "OpMatrixTimesMatrix":
				return OpMatrixTimesMatrix;
			case "OpOuterProduct":
				return OpOuterProduct;
			case "OpDot":
				return OpDot;
			case "OpIAddCarry":
				return OpIAddCarry;
			case "OpISubBorrow":
				return OpISubBorrow;
			case "OpUMulExtended":
				return OpUMulExtended;
			case "OpSMulExtended":
				return OpSMulExtended;
			case "OpAny":
				return OpAny;
			case "OpAll":
				return OpAll;
			case "OpIsNan":
				return OpIsNan;
			case "OpIsInf":
				return OpIsInf;
			case "OpIsFinite":
				return OpIsFinite;
			case "OpIsNormal":
				return OpIsNormal;
			case "OpSignBitSet":
				return OpSignBitSet;
			case "OpLessOrGreater":
				return OpLessOrGreater;
			case "OpOrdered":
				return OpOrdered;
			case "OpUnordered":
				return OpUnordered;
			case "OpLogicalEqual":
				return OpLogicalEqual;
			case "OpLogicalNotEqual":
				return OpLogicalNotEqual;
			case "OpLogicalOr":
				return OpLogicalOr;
			case "OpLogicalAnd":
				return OpLogicalAnd;
			case "OpLogicalNot":
				return OpLogicalNot;
			case "OpSelect":
				return OpSelect;
			case "OpIEqual":
				return OpIEqual;
			case "OpINotEqual":
				return OpINotEqual;
			case "OpUGreaterThan":
				return OpUGreaterThan;
			case "OpSGreaterThan":
				return OpSGreaterThan;
			case "OpUGreaterThanEqual":
				return OpUGreaterThanEqual;
			case "OpSGreaterThanEqual":
				return OpSGreaterThanEqual;
			case "OpULessThan":
				return OpULessThan;
			case "OpSLessThan":
				return OpSLessThan;
			case "OpULessThanEqual":
				return OpULessThanEqual;
			case "OpSLessThanEqual":
				return OpSLessThanEqual;
			case "OpFOrdEqual":
				return OpFOrdEqual;
			case "OpFUnordEqual":
				return OpFUnordEqual;
			case "OpFOrdNotEqual":
				return OpFOrdNotEqual;
			case "OpFUnordNotEqual":
				return OpFUnordNotEqual;
			case "OpFOrdLessThan":
				return OpFOrdLessThan;
			case "OpFUnordLessThan":
				return OpFUnordLessThan;
			case "OpFOrdGreaterThan":
				return OpFOrdGreaterThan;
			case "OpFUnordGreaterThan":
				return OpFUnordGreaterThan;
			case "OpFOrdLessThanEqual":
				return OpFOrdLessThanEqual;
			case "OpFUnordLessThanEqual":
				return OpFUnordLessThanEqual;
			case "OpFOrdGreaterThanEqual":
				return OpFOrdGreaterThanEqual;
			case "OpFUnordGreaterThanEqual":
				return OpFUnordGreaterThanEqual;
			case "OpShiftRightLogical":
				return OpShiftRightLogical;
			case "OpShiftRightArithmetic":
				return OpShiftRightArithmetic;
			case "OpShiftLeftLogical":
				return OpShiftLeftLogical;
			case "OpBitwiseOr":
				return OpBitwiseOr;
			case "OpBitwiseXor":
				return OpBitwiseXor;
			case "OpBitwiseAnd":
				return OpBitwiseAnd;
			case "OpNot":
				return OpNot;
			case "OpBitFieldInsert":
				return OpBitFieldInsert;
			case "OpBitFieldSExtract":
				return OpBitFieldSExtract;
			case "OpBitFieldUExtract":
				return OpBitFieldUExtract;
			case "OpBitReverse":
				return OpBitReverse;
			case "OpBitCount":
				return OpBitCount;
			case "OpDPdx":
				return OpDPdx;
			case "OpDPdy":
				return OpDPdy;
			case "OpFwidth":
				return OpFwidth;
			case "OpDPdxFine":
				return OpDPdxFine;
			case "OpDPdyFine":
				return OpDPdyFine;
			case "OpFwidthFine":
				return OpFwidthFine;
			case "OpDPdxCoarse":
				return OpDPdxCoarse;
			case "OpDPdyCoarse":
				return OpDPdyCoarse;
			case "OpFwidthCoarse":
				return OpFwidthCoarse;
			case "OpEmitVertex":
				return OpEmitVertex;
			case "OpEndPrimitive":
				return OpEndPrimitive;
			case "OpEmitStreamVertex":
				return OpEmitStreamVertex;
			case "OpEndStreamPrimitive":
				return OpEndStreamPrimitive;
			case "OpControlBarrier":
				return OpControlBarrier;
			case "OpMemoryBarrier":
				return OpMemoryBarrier;
			case "OpAtomicLoad":
				return OpAtomicLoad;
			case "OpAtomicStore":
				return OpAtomicStore;
			case "OpAtomicExchange":
				return OpAtomicExchange;
			case "OpAtomicCompareExchange":
				return OpAtomicCompareExchange;
			case "OpAtomicCompareExchangeWeak":
				return OpAtomicCompareExchangeWeak;
			case "OpAtomicIIncrement":
				return OpAtomicIIncrement;
			case "OpAtomicIDecrement":
				return OpAtomicIDecrement;
			case "OpAtomicIAdd":
				return OpAtomicIAdd;
			case "OpAtomicISub":
				return OpAtomicISub;
			case "OpAtomicSMin":
				return OpAtomicSMin;
			case "OpAtomicUMin":
				return OpAtomicUMin;
			case "OpAtomicSMax":
				return OpAtomicSMax;
			case "OpAtomicUMax":
				return OpAtomicUMax;
			case "OpAtomicAnd":
				return OpAtomicAnd;
			case "OpAtomicOr":
				return OpAtomicOr;
			case "OpAtomicXor":
				return OpAtomicXor;
			case "OpPhi":
				return OpPhi;
			case "OpLoopMerge":
				return OpLoopMerge;
			case "OpSelectionMerge":
				return OpSelectionMerge;
			case "OpLabel":
				return OpLabel;
			case "OpBranch":
				return OpBranch;
			case "OpBranchConditional":
				return OpBranchConditional;
			case "OpSwitch":
				return OpSwitch;
			case "OpKill":
				return OpKill;
			case "OpReturn":
				return OpReturn;
			case "OpReturnValue":
				return OpReturnValue;
			case "OpUnreachable":
				return OpUnreachable;
			case "OpLifetimeStart":
				return OpLifetimeStart;
			case "OpLifetimeStop":
				return OpLifetimeStop;
			case "OpGroupAsyncCopy":
				return OpGroupAsyncCopy;
			case "OpGroupWaitEvents":
				return OpGroupWaitEvents;
			case "OpGroupAll":
				return OpGroupAll;
			case "OpGroupAny":
				return OpGroupAny;
			case "OpGroupBroadcast":
				return OpGroupBroadcast;
			case "OpGroupIAdd":
				return OpGroupIAdd;
			case "OpGroupFAdd":
				return OpGroupFAdd;
			case "OpGroupFMin":
				return OpGroupFMin;
			case "OpGroupUMin":
				return OpGroupUMin;
			case "OpGroupSMin":
				return OpGroupSMin;
			case "OpGroupFMax":
				return OpGroupFMax;
			case "OpGroupUMax":
				return OpGroupUMax;
			case "OpGroupSMax":
				return OpGroupSMax;
			case "OpReadPipe":
				return OpReadPipe;
			case "OpWritePipe":
				return OpWritePipe;
			case "OpReservedReadPipe":
				return OpReservedReadPipe;
			case "OpReservedWritePipe":
				return OpReservedWritePipe;
			case "OpReserveReadPipePackets":
				return OpReserveReadPipePackets;
			case "OpReserveWritePipePackets":
				return OpReserveWritePipePackets;
			case "OpCommitReadPipe":
				return OpCommitReadPipe;
			case "OpCommitWritePipe":
				return OpCommitWritePipe;
			case "OpIsValidReserveId":
				return OpIsValidReserveId;
			case "OpGetNumPipePackets":
				return OpGetNumPipePackets;
			case "OpGetMaxPipePackets":
				return OpGetMaxPipePackets;
			case "OpGroupReserveReadPipePackets":
				return OpGroupReserveReadPipePackets;
			case "OpGroupReserveWritePipePackets":
				return OpGroupReserveWritePipePackets;
			case "OpGroupCommitReadPipe":
				return OpGroupCommitReadPipe;
			case "OpGroupCommitWritePipe":
				return OpGroupCommitWritePipe;
			case "OpEnqueueMarker":
				return OpEnqueueMarker;
			case "OpEnqueueKernel":
				return OpEnqueueKernel;
			case "OpGetKernelNDrangeSubGroupCount":
				return OpGetKernelNDrangeSubGroupCount;
			case "OpGetKernelNDrangeMaxSubGroupSize":
				return OpGetKernelNDrangeMaxSubGroupSize;
			case "OpGetKernelWorkGroupSize":
				return OpGetKernelWorkGroupSize;
			case "OpGetKernelPreferredWorkGroupSizeMultiple":
				return OpGetKernelPreferredWorkGroupSizeMultiple;
			case "OpRetainEvent":
				return OpRetainEvent;
			case "OpReleaseEvent":
				return OpReleaseEvent;
			case "OpCreateUserEvent":
				return OpCreateUserEvent;
			case "OpIsValidEvent":
				return OpIsValidEvent;
			case "OpSetUserEventStatus":
				return OpSetUserEventStatus;
			case "OpCaptureEventProfilingInfo":
				return OpCaptureEventProfilingInfo;
			case "OpGetDefaultQueue":
				return OpGetDefaultQueue;
			case "OpBuildNDRange":
				return OpBuildNDRange;
			case "OpImageSparseSampleImplicitLod":
				return OpImageSparseSampleImplicitLod;
			case "OpImageSparseSampleExplicitLod":
				return OpImageSparseSampleExplicitLod;
			case "OpImageSparseSampleDrefImplicitLod":
				return OpImageSparseSampleDrefImplicitLod;
			case "OpImageSparseSampleDrefExplicitLod":
				return OpImageSparseSampleDrefExplicitLod;
			case "OpImageSparseSampleProjImplicitLod":
				return OpImageSparseSampleProjImplicitLod;
			case "OpImageSparseSampleProjExplicitLod":
				return OpImageSparseSampleProjExplicitLod;
			case "OpImageSparseSampleProjDrefImplicitLod":
				return OpImageSparseSampleProjDrefImplicitLod;
			case "OpImageSparseSampleProjDrefExplicitLod":
				return OpImageSparseSampleProjDrefExplicitLod;
			case "OpImageSparseFetch":
				return OpImageSparseFetch;
			case "OpImageSparseGather":
				return OpImageSparseGather;
			case "OpImageSparseDrefGather":
				return OpImageSparseDrefGather;
			case "OpImageSparseTexelsResident":
				return OpImageSparseTexelsResident;
			case "OpNoLine":
				return OpNoLine;
			case "OpAtomicFlagTestAndSet":
				return OpAtomicFlagTestAndSet;
			case "OpAtomicFlagClear":
				return OpAtomicFlagClear;
			case "OpImageSparseRead":
				return OpImageSparseRead;
			case "OpSizeOf":
				return OpSizeOf;
			case "OpTypePipeStorage":
				return OpTypePipeStorage;
			case "OpConstantPipeStorage":
				return OpConstantPipeStorage;
			case "OpCreatePipeFromPipeStorage":
				return OpCreatePipeFromPipeStorage;
			case "OpGetKernelLocalSizeForSubgroupCount":
				return OpGetKernelLocalSizeForSubgroupCount;
			case "OpGetKernelMaxNumSubgroups":
				return OpGetKernelMaxNumSubgroups;
			case "OpTypeNamedBarrier":
				return OpTypeNamedBarrier;
			case "OpNamedBarrierInitialize":
				return OpNamedBarrierInitialize;
			case "OpMemoryNamedBarrier":
				return OpMemoryNamedBarrier;
			case "OpModuleProcessed":
				return OpModuleProcessed;
			case "OpExecutionModeId":
				return OpExecutionModeId;
			case "OpDecorateId":
				return OpDecorateId;
			case "OpGroupNonUniformElect":
				return OpGroupNonUniformElect;
			case "OpGroupNonUniformAll":
				return OpGroupNonUniformAll;
			case "OpGroupNonUniformAny":
				return OpGroupNonUniformAny;
			case "OpGroupNonUniformAllEqual":
				return OpGroupNonUniformAllEqual;
			case "OpGroupNonUniformBroadcast":
				return OpGroupNonUniformBroadcast;
			case "OpGroupNonUniformBroadcastFirst":
				return OpGroupNonUniformBroadcastFirst;
			case "OpGroupNonUniformBallot":
				return OpGroupNonUniformBallot;
			case "OpGroupNonUniformInverseBallot":
				return OpGroupNonUniformInverseBallot;
			case "OpGroupNonUniformBallotBitExtract":
				return OpGroupNonUniformBallotBitExtract;
			case "OpGroupNonUniformBallotBitCount":
				return OpGroupNonUniformBallotBitCount;
			case "OpGroupNonUniformBallotFindLSB":
				return OpGroupNonUniformBallotFindLSB;
			case "OpGroupNonUniformBallotFindMSB":
				return OpGroupNonUniformBallotFindMSB;
			case "OpGroupNonUniformShuffle":
				return OpGroupNonUniformShuffle;
			case "OpGroupNonUniformShuffleXor":
				return OpGroupNonUniformShuffleXor;
			case "OpGroupNonUniformShuffleUp":
				return OpGroupNonUniformShuffleUp;
			case "OpGroupNonUniformShuffleDown":
				return OpGroupNonUniformShuffleDown;
			case "OpGroupNonUniformIAdd":
				return OpGroupNonUniformIAdd;
			case "OpGroupNonUniformFAdd":
				return OpGroupNonUniformFAdd;
			case "OpGroupNonUniformIMul":
				return OpGroupNonUniformIMul;
			case "OpGroupNonUniformFMul":
				return OpGroupNonUniformFMul;
			case "OpGroupNonUniformSMin":
				return OpGroupNonUniformSMin;
			case "OpGroupNonUniformUMin":
				return OpGroupNonUniformUMin;
			case "OpGroupNonUniformFMin":
				return OpGroupNonUniformFMin;
			case "OpGroupNonUniformSMax":
				return OpGroupNonUniformSMax;
			case "OpGroupNonUniformUMax":
				return OpGroupNonUniformUMax;
			case "OpGroupNonUniformFMax":
				return OpGroupNonUniformFMax;
			case "OpGroupNonUniformBitwiseAnd":
				return OpGroupNonUniformBitwiseAnd;
			case "OpGroupNonUniformBitwiseOr":
				return OpGroupNonUniformBitwiseOr;
			case "OpGroupNonUniformBitwiseXor":
				return OpGroupNonUniformBitwiseXor;
			case "OpGroupNonUniformLogicalAnd":
				return OpGroupNonUniformLogicalAnd;
			case "OpGroupNonUniformLogicalOr":
				return OpGroupNonUniformLogicalOr;
			case "OpGroupNonUniformLogicalXor":
				return OpGroupNonUniformLogicalXor;
			case "OpGroupNonUniformQuadBroadcast":
				return OpGroupNonUniformQuadBroadcast;
			case "OpGroupNonUniformQuadSwap":
				return OpGroupNonUniformQuadSwap;
			case "OpCopyLogical":
				return OpCopyLogical;
			case "OpPtrEqual":
				return OpPtrEqual;
			case "OpPtrNotEqual":
				return OpPtrNotEqual;
			case "OpPtrDiff":
				return OpPtrDiff;
			case "OpSubgroupBallotKHR":
				return OpSubgroupBallotKHR;
			case "OpSubgroupFirstInvocationKHR":
				return OpSubgroupFirstInvocationKHR;
			case "OpSubgroupAllKHR":
				return OpSubgroupAllKHR;
			case "OpSubgroupAnyKHR":
				return OpSubgroupAnyKHR;
			case "OpSubgroupAllEqualKHR":
				return OpSubgroupAllEqualKHR;
			case "OpSubgroupReadInvocationKHR":
				return OpSubgroupReadInvocationKHR;
			case "OpTypeRayQueryProvisionalKHR":
				return OpTypeRayQueryProvisionalKHR;
			case "OpRayQueryInitializeKHR":
				return OpRayQueryInitializeKHR;
			case "OpRayQueryTerminateKHR":
				return OpRayQueryTerminateKHR;
			case "OpRayQueryGenerateIntersectionKHR":
				return OpRayQueryGenerateIntersectionKHR;
			case "OpRayQueryConfirmIntersectionKHR":
				return OpRayQueryConfirmIntersectionKHR;
			case "OpRayQueryProceedKHR":
				return OpRayQueryProceedKHR;
			case "OpRayQueryGetIntersectionTypeKHR":
				return OpRayQueryGetIntersectionTypeKHR;
			case "OpGroupIAddNonUniformAMD":
				return OpGroupIAddNonUniformAMD;
			case "OpGroupFAddNonUniformAMD":
				return OpGroupFAddNonUniformAMD;
			case "OpGroupFMinNonUniformAMD":
				return OpGroupFMinNonUniformAMD;
			case "OpGroupUMinNonUniformAMD":
				return OpGroupUMinNonUniformAMD;
			case "OpGroupSMinNonUniformAMD":
				return OpGroupSMinNonUniformAMD;
			case "OpGroupFMaxNonUniformAMD":
				return OpGroupFMaxNonUniformAMD;
			case "OpGroupUMaxNonUniformAMD":
				return OpGroupUMaxNonUniformAMD;
			case "OpGroupSMaxNonUniformAMD":
				return OpGroupSMaxNonUniformAMD;
			case "OpFragmentMaskFetchAMD":
				return OpFragmentMaskFetchAMD;
			case "OpFragmentFetchAMD":
				return OpFragmentFetchAMD;
			case "OpReadClockKHR":
				return OpReadClockKHR;
			case "OpImageSampleFootprintNV":
				return OpImageSampleFootprintNV;
			case "OpGroupNonUniformPartitionNV":
				return OpGroupNonUniformPartitionNV;
			case "OpWritePackedPrimitiveIndices4x8NV":
				return OpWritePackedPrimitiveIndices4x8NV;
			case "OpReportIntersectionKHR":
				return OpReportIntersectionKHR;
			case "OpReportIntersectionNV":
				return OpReportIntersectionNV;
			case "OpIgnoreIntersectionKHR":
				return OpIgnoreIntersectionKHR;
			case "OpIgnoreIntersectionNV":
				return OpIgnoreIntersectionNV;
			case "OpTerminateRayKHR":
				return OpTerminateRayKHR;
			case "OpTerminateRayNV":
				return OpTerminateRayNV;
			case "OpTraceNV":
				return OpTraceNV;
			case "OpTraceRayKHR":
				return OpTraceRayKHR;
			case "OpTypeAccelerationStructureKHR":
				return OpTypeAccelerationStructureKHR;
			case "OpTypeAccelerationStructureNV":
				return OpTypeAccelerationStructureNV;
			case "OpExecuteCallableKHR":
				return OpExecuteCallableKHR;
			case "OpExecuteCallableNV":
				return OpExecuteCallableNV;
			case "OpTypeCooperativeMatrixNV":
				return OpTypeCooperativeMatrixNV;
			case "OpCooperativeMatrixLoadNV":
				return OpCooperativeMatrixLoadNV;
			case "OpCooperativeMatrixStoreNV":
				return OpCooperativeMatrixStoreNV;
			case "OpCooperativeMatrixMulAddNV":
				return OpCooperativeMatrixMulAddNV;
			case "OpCooperativeMatrixLengthNV":
				return OpCooperativeMatrixLengthNV;
			case "OpBeginInvocationInterlockEXT":
				return OpBeginInvocationInterlockEXT;
			case "OpEndInvocationInterlockEXT":
				return OpEndInvocationInterlockEXT;
			case "OpDemoteToHelperInvocationEXT":
				return OpDemoteToHelperInvocationEXT;
			case "OpIsHelperInvocationEXT":
				return OpIsHelperInvocationEXT;
			case "OpSubgroupShuffleINTEL":
				return OpSubgroupShuffleINTEL;
			case "OpSubgroupShuffleDownINTEL":
				return OpSubgroupShuffleDownINTEL;
			case "OpSubgroupShuffleUpINTEL":
				return OpSubgroupShuffleUpINTEL;
			case "OpSubgroupShuffleXorINTEL":
				return OpSubgroupShuffleXorINTEL;
			case "OpSubgroupBlockReadINTEL":
				return OpSubgroupBlockReadINTEL;
			case "OpSubgroupBlockWriteINTEL":
				return OpSubgroupBlockWriteINTEL;
			case "OpSubgroupImageBlockReadINTEL":
				return OpSubgroupImageBlockReadINTEL;
			case "OpSubgroupImageBlockWriteINTEL":
				return OpSubgroupImageBlockWriteINTEL;
			case "OpSubgroupImageMediaBlockReadINTEL":
				return OpSubgroupImageMediaBlockReadINTEL;
			case "OpSubgroupImageMediaBlockWriteINTEL":
				return OpSubgroupImageMediaBlockWriteINTEL;
			case "OpUCountLeadingZerosINTEL":
				return OpUCountLeadingZerosINTEL;
			case "OpUCountTrailingZerosINTEL":
				return OpUCountTrailingZerosINTEL;
			case "OpAbsISubINTEL":
				return OpAbsISubINTEL;
			case "OpAbsUSubINTEL":
				return OpAbsUSubINTEL;
			case "OpIAddSatINTEL":
				return OpIAddSatINTEL;
			case "OpUAddSatINTEL":
				return OpUAddSatINTEL;
			case "OpIAverageINTEL":
				return OpIAverageINTEL;
			case "OpUAverageINTEL":
				return OpUAverageINTEL;
			case "OpIAverageRoundedINTEL":
				return OpIAverageRoundedINTEL;
			case "OpUAverageRoundedINTEL":
				return OpUAverageRoundedINTEL;
			case "OpISubSatINTEL":
				return OpISubSatINTEL;
			case "OpUSubSatINTEL":
				return OpUSubSatINTEL;
			case "OpIMul32x16INTEL":
				return OpIMul32x16INTEL;
			case "OpUMul32x16INTEL":
				return OpUMul32x16INTEL;
			case "OpFunctionPointerINTEL":
				return OpFunctionPointerINTEL;
			case "OpFunctionPointerCallINTEL":
				return OpFunctionPointerCallINTEL;
			case "OpDecorateString":
				return OpDecorateString;
			case "OpDecorateStringGOOGLE":
				return OpDecorateStringGOOGLE;
			case "OpMemberDecorateString":
				return OpMemberDecorateString;
			case "OpMemberDecorateStringGOOGLE":
				return OpMemberDecorateStringGOOGLE;
			case "OpVmeImageINTEL":
				return OpVmeImageINTEL;
			case "OpTypeVmeImageINTEL":
				return OpTypeVmeImageINTEL;
			case "OpTypeAvcImePayloadINTEL":
				return OpTypeAvcImePayloadINTEL;
			case "OpTypeAvcRefPayloadINTEL":
				return OpTypeAvcRefPayloadINTEL;
			case "OpTypeAvcSicPayloadINTEL":
				return OpTypeAvcSicPayloadINTEL;
			case "OpTypeAvcMcePayloadINTEL":
				return OpTypeAvcMcePayloadINTEL;
			case "OpTypeAvcMceResultINTEL":
				return OpTypeAvcMceResultINTEL;
			case "OpTypeAvcImeResultINTEL":
				return OpTypeAvcImeResultINTEL;
			case "OpTypeAvcImeResultSingleReferenceStreamoutINTEL":
				return OpTypeAvcImeResultSingleReferenceStreamoutINTEL;
			case "OpTypeAvcImeResultDualReferenceStreamoutINTEL":
				return OpTypeAvcImeResultDualReferenceStreamoutINTEL;
			case "OpTypeAvcImeSingleReferenceStreaminINTEL":
				return OpTypeAvcImeSingleReferenceStreaminINTEL;
			case "OpTypeAvcImeDualReferenceStreaminINTEL":
				return OpTypeAvcImeDualReferenceStreaminINTEL;
			case "OpTypeAvcRefResultINTEL":
				return OpTypeAvcRefResultINTEL;
			case "OpTypeAvcSicResultINTEL":
				return OpTypeAvcSicResultINTEL;
			case "OpSubgroupAvcMceGetDefaultInterBaseMultiReferencePenaltyINTEL":
				return OpSubgroupAvcMceGetDefaultInterBaseMultiReferencePenaltyINTEL;
			case "OpSubgroupAvcMceSetInterBaseMultiReferencePenaltyINTEL":
				return OpSubgroupAvcMceSetInterBaseMultiReferencePenaltyINTEL;
			case "OpSubgroupAvcMceGetDefaultInterShapePenaltyINTEL":
				return OpSubgroupAvcMceGetDefaultInterShapePenaltyINTEL;
			case "OpSubgroupAvcMceSetInterShapePenaltyINTEL":
				return OpSubgroupAvcMceSetInterShapePenaltyINTEL;
			case "OpSubgroupAvcMceGetDefaultInterDirectionPenaltyINTEL":
				return OpSubgroupAvcMceGetDefaultInterDirectionPenaltyINTEL;
			case "OpSubgroupAvcMceSetInterDirectionPenaltyINTEL":
				return OpSubgroupAvcMceSetInterDirectionPenaltyINTEL;
			case "OpSubgroupAvcMceGetDefaultIntraLumaShapePenaltyINTEL":
				return OpSubgroupAvcMceGetDefaultIntraLumaShapePenaltyINTEL;
			case "OpSubgroupAvcMceGetDefaultInterMotionVectorCostTableINTEL":
				return OpSubgroupAvcMceGetDefaultInterMotionVectorCostTableINTEL;
			case "OpSubgroupAvcMceGetDefaultHighPenaltyCostTableINTEL":
				return OpSubgroupAvcMceGetDefaultHighPenaltyCostTableINTEL;
			case "OpSubgroupAvcMceGetDefaultMediumPenaltyCostTableINTEL":
				return OpSubgroupAvcMceGetDefaultMediumPenaltyCostTableINTEL;
			case "OpSubgroupAvcMceGetDefaultLowPenaltyCostTableINTEL":
				return OpSubgroupAvcMceGetDefaultLowPenaltyCostTableINTEL;
			case "OpSubgroupAvcMceSetMotionVectorCostFunctionINTEL":
				return OpSubgroupAvcMceSetMotionVectorCostFunctionINTEL;
			case "OpSubgroupAvcMceGetDefaultIntraLumaModePenaltyINTEL":
				return OpSubgroupAvcMceGetDefaultIntraLumaModePenaltyINTEL;
			case "OpSubgroupAvcMceGetDefaultNonDcLumaIntraPenaltyINTEL":
				return OpSubgroupAvcMceGetDefaultNonDcLumaIntraPenaltyINTEL;
			case "OpSubgroupAvcMceGetDefaultIntraChromaModeBasePenaltyINTEL":
				return OpSubgroupAvcMceGetDefaultIntraChromaModeBasePenaltyINTEL;
			case "OpSubgroupAvcMceSetAcOnlyHaarINTEL":
				return OpSubgroupAvcMceSetAcOnlyHaarINTEL;
			case "OpSubgroupAvcMceSetSourceInterlacedFieldPolarityINTEL":
				return OpSubgroupAvcMceSetSourceInterlacedFieldPolarityINTEL;
			case "OpSubgroupAvcMceSetSingleReferenceInterlacedFieldPolarityINTEL":
				return OpSubgroupAvcMceSetSingleReferenceInterlacedFieldPolarityINTEL;
			case "OpSubgroupAvcMceSetDualReferenceInterlacedFieldPolaritiesINTEL":
				return OpSubgroupAvcMceSetDualReferenceInterlacedFieldPolaritiesINTEL;
			case "OpSubgroupAvcMceConvertToImePayloadINTEL":
				return OpSubgroupAvcMceConvertToImePayloadINTEL;
			case "OpSubgroupAvcMceConvertToImeResultINTEL":
				return OpSubgroupAvcMceConvertToImeResultINTEL;
			case "OpSubgroupAvcMceConvertToRefPayloadINTEL":
				return OpSubgroupAvcMceConvertToRefPayloadINTEL;
			case "OpSubgroupAvcMceConvertToRefResultINTEL":
				return OpSubgroupAvcMceConvertToRefResultINTEL;
			case "OpSubgroupAvcMceConvertToSicPayloadINTEL":
				return OpSubgroupAvcMceConvertToSicPayloadINTEL;
			case "OpSubgroupAvcMceConvertToSicResultINTEL":
				return OpSubgroupAvcMceConvertToSicResultINTEL;
			case "OpSubgroupAvcMceGetMotionVectorsINTEL":
				return OpSubgroupAvcMceGetMotionVectorsINTEL;
			case "OpSubgroupAvcMceGetInterDistortionsINTEL":
				return OpSubgroupAvcMceGetInterDistortionsINTEL;
			case "OpSubgroupAvcMceGetBestInterDistortionsINTEL":
				return OpSubgroupAvcMceGetBestInterDistortionsINTEL;
			case "OpSubgroupAvcMceGetInterMajorShapeINTEL":
				return OpSubgroupAvcMceGetInterMajorShapeINTEL;
			case "OpSubgroupAvcMceGetInterMinorShapeINTEL":
				return OpSubgroupAvcMceGetInterMinorShapeINTEL;
			case "OpSubgroupAvcMceGetInterDirectionsINTEL":
				return OpSubgroupAvcMceGetInterDirectionsINTEL;
			case "OpSubgroupAvcMceGetInterMotionVectorCountINTEL":
				return OpSubgroupAvcMceGetInterMotionVectorCountINTEL;
			case "OpSubgroupAvcMceGetInterReferenceIdsINTEL":
				return OpSubgroupAvcMceGetInterReferenceIdsINTEL;
			case "OpSubgroupAvcMceGetInterReferenceInterlacedFieldPolaritiesINTEL":
				return OpSubgroupAvcMceGetInterReferenceInterlacedFieldPolaritiesINTEL;
			case "OpSubgroupAvcImeInitializeINTEL":
				return OpSubgroupAvcImeInitializeINTEL;
			case "OpSubgroupAvcImeSetSingleReferenceINTEL":
				return OpSubgroupAvcImeSetSingleReferenceINTEL;
			case "OpSubgroupAvcImeSetDualReferenceINTEL":
				return OpSubgroupAvcImeSetDualReferenceINTEL;
			case "OpSubgroupAvcImeRefWindowSizeINTEL":
				return OpSubgroupAvcImeRefWindowSizeINTEL;
			case "OpSubgroupAvcImeAdjustRefOffsetINTEL":
				return OpSubgroupAvcImeAdjustRefOffsetINTEL;
			case "OpSubgroupAvcImeConvertToMcePayloadINTEL":
				return OpSubgroupAvcImeConvertToMcePayloadINTEL;
			case "OpSubgroupAvcImeSetMaxMotionVectorCountINTEL":
				return OpSubgroupAvcImeSetMaxMotionVectorCountINTEL;
			case "OpSubgroupAvcImeSetUnidirectionalMixDisableINTEL":
				return OpSubgroupAvcImeSetUnidirectionalMixDisableINTEL;
			case "OpSubgroupAvcImeSetEarlySearchTerminationThresholdINTEL":
				return OpSubgroupAvcImeSetEarlySearchTerminationThresholdINTEL;
			case "OpSubgroupAvcImeSetWeightedSadINTEL":
				return OpSubgroupAvcImeSetWeightedSadINTEL;
			case "OpSubgroupAvcImeEvaluateWithSingleReferenceINTEL":
				return OpSubgroupAvcImeEvaluateWithSingleReferenceINTEL;
			case "OpSubgroupAvcImeEvaluateWithDualReferenceINTEL":
				return OpSubgroupAvcImeEvaluateWithDualReferenceINTEL;
			case "OpSubgroupAvcImeEvaluateWithSingleReferenceStreaminINTEL":
				return OpSubgroupAvcImeEvaluateWithSingleReferenceStreaminINTEL;
			case "OpSubgroupAvcImeEvaluateWithDualReferenceStreaminINTEL":
				return OpSubgroupAvcImeEvaluateWithDualReferenceStreaminINTEL;
			case "OpSubgroupAvcImeEvaluateWithSingleReferenceStreamoutINTEL":
				return OpSubgroupAvcImeEvaluateWithSingleReferenceStreamoutINTEL;
			case "OpSubgroupAvcImeEvaluateWithDualReferenceStreamoutINTEL":
				return OpSubgroupAvcImeEvaluateWithDualReferenceStreamoutINTEL;
			case "OpSubgroupAvcImeEvaluateWithSingleReferenceStreaminoutINTEL":
				return OpSubgroupAvcImeEvaluateWithSingleReferenceStreaminoutINTEL;
			case "OpSubgroupAvcImeEvaluateWithDualReferenceStreaminoutINTEL":
				return OpSubgroupAvcImeEvaluateWithDualReferenceStreaminoutINTEL;
			case "OpSubgroupAvcImeConvertToMceResultINTEL":
				return OpSubgroupAvcImeConvertToMceResultINTEL;
			case "OpSubgroupAvcImeGetSingleReferenceStreaminINTEL":
				return OpSubgroupAvcImeGetSingleReferenceStreaminINTEL;
			case "OpSubgroupAvcImeGetDualReferenceStreaminINTEL":
				return OpSubgroupAvcImeGetDualReferenceStreaminINTEL;
			case "OpSubgroupAvcImeStripSingleReferenceStreamoutINTEL":
				return OpSubgroupAvcImeStripSingleReferenceStreamoutINTEL;
			case "OpSubgroupAvcImeStripDualReferenceStreamoutINTEL":
				return OpSubgroupAvcImeStripDualReferenceStreamoutINTEL;
			case "OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeMotionVectorsINTEL":
				return OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeMotionVectorsINTEL;
			case "OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeDistortionsINTEL":
				return OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeDistortionsINTEL;
			case "OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeReferenceIdsINTEL":
				return OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeReferenceIdsINTEL;
			case "OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeMotionVectorsINTEL":
				return OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeMotionVectorsINTEL;
			case "OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeDistortionsINTEL":
				return OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeDistortionsINTEL;
			case "OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeReferenceIdsINTEL":
				return OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeReferenceIdsINTEL;
			case "OpSubgroupAvcImeGetBorderReachedINTEL":
				return OpSubgroupAvcImeGetBorderReachedINTEL;
			case "OpSubgroupAvcImeGetTruncatedSearchIndicationINTEL":
				return OpSubgroupAvcImeGetTruncatedSearchIndicationINTEL;
			case "OpSubgroupAvcImeGetUnidirectionalEarlySearchTerminationINTEL":
				return OpSubgroupAvcImeGetUnidirectionalEarlySearchTerminationINTEL;
			case "OpSubgroupAvcImeGetWeightingPatternMinimumMotionVectorINTEL":
				return OpSubgroupAvcImeGetWeightingPatternMinimumMotionVectorINTEL;
			case "OpSubgroupAvcImeGetWeightingPatternMinimumDistortionINTEL":
				return OpSubgroupAvcImeGetWeightingPatternMinimumDistortionINTEL;
			case "OpSubgroupAvcFmeInitializeINTEL":
				return OpSubgroupAvcFmeInitializeINTEL;
			case "OpSubgroupAvcBmeInitializeINTEL":
				return OpSubgroupAvcBmeInitializeINTEL;
			case "OpSubgroupAvcRefConvertToMcePayloadINTEL":
				return OpSubgroupAvcRefConvertToMcePayloadINTEL;
			case "OpSubgroupAvcRefSetBidirectionalMixDisableINTEL":
				return OpSubgroupAvcRefSetBidirectionalMixDisableINTEL;
			case "OpSubgroupAvcRefSetBilinearFilterEnableINTEL":
				return OpSubgroupAvcRefSetBilinearFilterEnableINTEL;
			case "OpSubgroupAvcRefEvaluateWithSingleReferenceINTEL":
				return OpSubgroupAvcRefEvaluateWithSingleReferenceINTEL;
			case "OpSubgroupAvcRefEvaluateWithDualReferenceINTEL":
				return OpSubgroupAvcRefEvaluateWithDualReferenceINTEL;
			case "OpSubgroupAvcRefEvaluateWithMultiReferenceINTEL":
				return OpSubgroupAvcRefEvaluateWithMultiReferenceINTEL;
			case "OpSubgroupAvcRefEvaluateWithMultiReferenceInterlacedINTEL":
				return OpSubgroupAvcRefEvaluateWithMultiReferenceInterlacedINTEL;
			case "OpSubgroupAvcRefConvertToMceResultINTEL":
				return OpSubgroupAvcRefConvertToMceResultINTEL;
			case "OpSubgroupAvcSicInitializeINTEL":
				return OpSubgroupAvcSicInitializeINTEL;
			case "OpSubgroupAvcSicConfigureSkcINTEL":
				return OpSubgroupAvcSicConfigureSkcINTEL;
			case "OpSubgroupAvcSicConfigureIpeLumaINTEL":
				return OpSubgroupAvcSicConfigureIpeLumaINTEL;
			case "OpSubgroupAvcSicConfigureIpeLumaChromaINTEL":
				return OpSubgroupAvcSicConfigureIpeLumaChromaINTEL;
			case "OpSubgroupAvcSicGetMotionVectorMaskINTEL":
				return OpSubgroupAvcSicGetMotionVectorMaskINTEL;
			case "OpSubgroupAvcSicConvertToMcePayloadINTEL":
				return OpSubgroupAvcSicConvertToMcePayloadINTEL;
			case "OpSubgroupAvcSicSetIntraLumaShapePenaltyINTEL":
				return OpSubgroupAvcSicSetIntraLumaShapePenaltyINTEL;
			case "OpSubgroupAvcSicSetIntraLumaModeCostFunctionINTEL":
				return OpSubgroupAvcSicSetIntraLumaModeCostFunctionINTEL;
			case "OpSubgroupAvcSicSetIntraChromaModeCostFunctionINTEL":
				return OpSubgroupAvcSicSetIntraChromaModeCostFunctionINTEL;
			case "OpSubgroupAvcSicSetBilinearFilterEnableINTEL":
				return OpSubgroupAvcSicSetBilinearFilterEnableINTEL;
			case "OpSubgroupAvcSicSetSkcForwardTransformEnableINTEL":
				return OpSubgroupAvcSicSetSkcForwardTransformEnableINTEL;
			case "OpSubgroupAvcSicSetBlockBasedRawSkipSadINTEL":
				return OpSubgroupAvcSicSetBlockBasedRawSkipSadINTEL;
			case "OpSubgroupAvcSicEvaluateIpeINTEL":
				return OpSubgroupAvcSicEvaluateIpeINTEL;
			case "OpSubgroupAvcSicEvaluateWithSingleReferenceINTEL":
				return OpSubgroupAvcSicEvaluateWithSingleReferenceINTEL;
			case "OpSubgroupAvcSicEvaluateWithDualReferenceINTEL":
				return OpSubgroupAvcSicEvaluateWithDualReferenceINTEL;
			case "OpSubgroupAvcSicEvaluateWithMultiReferenceINTEL":
				return OpSubgroupAvcSicEvaluateWithMultiReferenceINTEL;
			case "OpSubgroupAvcSicEvaluateWithMultiReferenceInterlacedINTEL":
				return OpSubgroupAvcSicEvaluateWithMultiReferenceInterlacedINTEL;
			case "OpSubgroupAvcSicConvertToMceResultINTEL":
				return OpSubgroupAvcSicConvertToMceResultINTEL;
			case "OpSubgroupAvcSicGetIpeLumaShapeINTEL":
				return OpSubgroupAvcSicGetIpeLumaShapeINTEL;
			case "OpSubgroupAvcSicGetBestIpeLumaDistortionINTEL":
				return OpSubgroupAvcSicGetBestIpeLumaDistortionINTEL;
			case "OpSubgroupAvcSicGetBestIpeChromaDistortionINTEL":
				return OpSubgroupAvcSicGetBestIpeChromaDistortionINTEL;
			case "OpSubgroupAvcSicGetPackedIpeLumaModesINTEL":
				return OpSubgroupAvcSicGetPackedIpeLumaModesINTEL;
			case "OpSubgroupAvcSicGetIpeChromaModeINTEL":
				return OpSubgroupAvcSicGetIpeChromaModeINTEL;
			case "OpSubgroupAvcSicGetPackedSkcLumaCountThresholdINTEL":
				return OpSubgroupAvcSicGetPackedSkcLumaCountThresholdINTEL;
			case "OpSubgroupAvcSicGetPackedSkcLumaSumThresholdINTEL":
				return OpSubgroupAvcSicGetPackedSkcLumaSumThresholdINTEL;
			case "OpSubgroupAvcSicGetInterRawSadsINTEL":
				return OpSubgroupAvcSicGetInterRawSadsINTEL;
			case "OpLoopControlINTEL":
				return OpLoopControlINTEL;
			case "OpReadPipeBlockingINTEL":
				return OpReadPipeBlockingINTEL;
			case "OpWritePipeBlockingINTEL":
				return OpWritePipeBlockingINTEL;
			case "OpFPGARegINTEL":
				return OpFPGARegINTEL;
			case "OpRayQueryGetRayTMinKHR":
				return OpRayQueryGetRayTMinKHR;
			case "OpRayQueryGetRayFlagsKHR":
				return OpRayQueryGetRayFlagsKHR;
			case "OpRayQueryGetIntersectionTKHR":
				return OpRayQueryGetIntersectionTKHR;
			case "OpRayQueryGetIntersectionInstanceCustomIndexKHR":
				return OpRayQueryGetIntersectionInstanceCustomIndexKHR;
			case "OpRayQueryGetIntersectionInstanceIdKHR":
				return OpRayQueryGetIntersectionInstanceIdKHR;
			case "OpRayQueryGetIntersectionInstanceShaderBindingTableRecordOffsetKHR":
				return OpRayQueryGetIntersectionInstanceShaderBindingTableRecordOffsetKHR;
			case "OpRayQueryGetIntersectionGeometryIndexKHR":
				return OpRayQueryGetIntersectionGeometryIndexKHR;
			case "OpRayQueryGetIntersectionPrimitiveIndexKHR":
				return OpRayQueryGetIntersectionPrimitiveIndexKHR;
			case "OpRayQueryGetIntersectionBarycentricsKHR":
				return OpRayQueryGetIntersectionBarycentricsKHR;
			case "OpRayQueryGetIntersectionFrontFaceKHR":
				return OpRayQueryGetIntersectionFrontFaceKHR;
			case "OpRayQueryGetIntersectionCandidateAABBOpaqueKHR":
				return OpRayQueryGetIntersectionCandidateAABBOpaqueKHR;
			case "OpRayQueryGetIntersectionObjectRayDirectionKHR":
				return OpRayQueryGetIntersectionObjectRayDirectionKHR;
			case "OpRayQueryGetIntersectionObjectRayOriginKHR":
				return OpRayQueryGetIntersectionObjectRayOriginKHR;
			case "OpRayQueryGetWorldRayDirectionKHR":
				return OpRayQueryGetWorldRayDirectionKHR;
			case "OpRayQueryGetWorldRayOriginKHR":
				return OpRayQueryGetWorldRayOriginKHR;
			case "OpRayQueryGetIntersectionObjectToWorldKHR":
				return OpRayQueryGetIntersectionObjectToWorldKHR;
			case "OpRayQueryGetIntersectionWorldToObjectKHR":
				return OpRayQueryGetIntersectionWorldToObjectKHR;
			case "OpAtomicFAddEXT":
				return OpAtomicFAddEXT;
			case "OpMax":
				return OpMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static Op valueByConstant(int constant) {
		switch (constant) {
			case Main.OP_NOP:
				return OpNop;
			case Main.OP_UNDEF:
				return OpUndef;
			case Main.OP_SOURCE_CONTINUED:
				return OpSourceContinued;
			case Main.OP_SOURCE:
				return OpSource;
			case Main.OP_SOURCE_EXTENSION:
				return OpSourceExtension;
			case Main.OP_NAME:
				return OpName;
			case Main.OP_MEMBER_NAME:
				return OpMemberName;
			case Main.OP_STRING:
				return OpString;
			case Main.OP_LINE:
				return OpLine;
			case Main.OP_EXTENSION:
				return OpExtension;
			case Main.OP_EXT_INST_IMPORT:
				return OpExtInstImport;
			case Main.OP_EXT_INST:
				return OpExtInst;
			case Main.OP_MEMORY_MODEL:
				return OpMemoryModel;
			case Main.OP_ENTRY_POINT:
				return OpEntryPoint;
			case Main.OP_EXECUTION_MODE:
				return OpExecutionMode;
			case Main.OP_CAPABILITY:
				return OpCapability;
			case Main.OP_TYPE_VOID:
				return OpTypeVoid;
			case Main.OP_TYPE_BOOL:
				return OpTypeBool;
			case Main.OP_TYPE_INT:
				return OpTypeInt;
			case Main.OP_TYPE_FLOAT:
				return OpTypeFloat;
			case Main.OP_TYPE_VECTOR:
				return OpTypeVector;
			case Main.OP_TYPE_MATRIX:
				return OpTypeMatrix;
			case Main.OP_TYPE_IMAGE:
				return OpTypeImage;
			case Main.OP_TYPE_SAMPLER:
				return OpTypeSampler;
			case Main.OP_TYPE_SAMPLED_IMAGE:
				return OpTypeSampledImage;
			case Main.OP_TYPE_ARRAY:
				return OpTypeArray;
			case Main.OP_TYPE_RUNTIME_ARRAY:
				return OpTypeRuntimeArray;
			case Main.OP_TYPE_STRUCT:
				return OpTypeStruct;
			case Main.OP_TYPE_OPAQUE:
				return OpTypeOpaque;
			case Main.OP_TYPE_POINTER:
				return OpTypePointer;
			case Main.OP_TYPE_FUNCTION:
				return OpTypeFunction;
			case Main.OP_TYPE_EVENT:
				return OpTypeEvent;
			case Main.OP_TYPE_DEVICE_EVENT:
				return OpTypeDeviceEvent;
			case Main.OP_TYPE_RESERVEID:
				return OpTypeReserveId;
			case Main.OP_TYPE_QUEUE:
				return OpTypeQueue;
			case Main.OP_TYPE_PIPE:
				return OpTypePipe;
			case Main.OP_TYPE_FORWARD_POINTER:
				return OpTypeForwardPointer;
			case Main.OP_CONSTANT_TRUE:
				return OpConstantTrue;
			case Main.OP_CONSTANT_FALSE:
				return OpConstantFalse;
			case Main.OP_CONSTANT:
				return OpConstant;
			case Main.OP_CONSTANT_COMPOSITE:
				return OpConstantComposite;
			case Main.OP_CONSTANT_SAMPLER:
				return OpConstantSampler;
			case Main.Op_Constant_Null:
				return OpConstantNull;
			case Main.OP_SPEC_CONSTANT_TRUE:
				return OpSpecConstantTrue;
			case Main.Op_Spec_Constant_False:
				return OpSpecConstantFalse;
			case Main.OP_SPEC_CONSTANT:
				return OpSpecConstant;
			case Main.OP_SPEC_CONSTANT_COMPOSITE:
				return OpSpecConstantComposite;
			case Main.OP_SPEC_CONSTANT_OP:
				return OpSpecConstantOp;
			case Main.OP_FUNCTION:
				return OpFunction;
			case Main.OP_FUNCTION_PARAMETER:
				return OpFunctionParameter;
			case Main.OP_FUNCTION_END:
				return OpFunctionEnd;
			case Main.OP_FUNCTION_CALL:
				return OpFunctionCall;
			case Main.OP_VARIABLE:
				return OpVariable;
			case Main.OP_IMAGE_TEXEL_POINTER:
				return OpImageTexelPointer;
			case Main.OP_LOAD:
				return OpLoad;
			case Main.OP_STORE:
				return OpStore;
			case Main.OP_COPY_MEMORY:
				return OpCopyMemory;
			case Main.OP_COPY_MEMORY_SIZED:
				return OpCopyMemorySized;
			case Main.OP_ACCESS_CHAIN:
				return OpAccessChain;
			case Main.OP_IN_BOUNDS_ACCESS_CHAIN:
				return OpInBoundsAccessChain;
			case Main.OP_PTR_ACCESS_CHAIN:
				return OpPtrAccessChain;
			case Main.OP_ARRAY_LENGTH:
				return OpArrayLength;
			case Main.OP_GENERIC_PTR_MEM_SEMANTICS:
				return OpGenericPtrMemSemantics;
			case Main.OP_IN_BOUNDS_PTR_ACCESS_CHAIN:
				return OpInBoundsPtrAccessChain;
			case Main.OP_DECORATE:
				return OpDecorate;
			case Main.OP_MEMBER_DECORATE:
				return OpMemberDecorate;
			case Main.OP_DECORATION_GROUP:
				return OpDecorationGroup;
			case Main.OP_GROUP_DECORATE:
				return OpGroupDecorate;
			case Main.OP_GROUP_MEMBER_DECORATE:
				return OpGroupMemberDecorate;
			case Main.OP_VECTOR_EXTRACT_DYNAMIC:
				return OpVectorExtractDynamic;
			case Main.OP_VECTOR_INSERT_DYNAMIC:
				return OpVectorInsertDynamic;
			case Main.OP_VECTOR_SHUFFLE:
				return OpVectorShuffle;
			case Main.OP_COMPOSITE_CONSTRUCT:
				return OpCompositeConstruct;
			case Main.OP_COMPOSITE_EXTRACT:
				return OpCompositeExtract;
			case Main.OP_COMPOSITE_INSERT:
				return OpCompositeInsert;
			case Main.OP_COPY_OBJECT:
				return OpCopyObject;
			case Main.OP_TRANSPOSE:
				return OpTranspose;
			case Main.OP_SAMPLED_IMAGE:
				return OpSampledImage;
			case Main.OP_IMAGE_SAMPLE_IMPLICIT_LOD:
				return OpImageSampleImplicitLod;
			case Main.OP_IMAGE_SAMPLE_EXPLICIT_LOD:
				return OpImageSampleExplicitLod;
			case Main.OP_IMAGE_SAMPLE_DREF_IMPLICIT_LOD:
				return OpImageSampleDrefImplicitLod;
			case Main.OP_IMAGE_SAMPLE_DREF_EXPLICIT_LOD:
				return OpImageSampleDrefExplicitLod;
			case Main.OP_IMAGE_SAMPLE_PROJ_IMPLICIT_LOD:
				return OpImageSampleProjImplicitLod;
			case Main.OP_IMAGE_SAMPLE_PROJ_EXPLICIT_LOD:
				return OpImageSampleProjExplicitLod;
			case Main.OP_IMAGE_SAMPLE_PROJ_DREF_IMPLICIT_LOD:
				return OpImageSampleProjDrefImplicitLod;
			case Main.OP_IMAGE_SAMPLE_PROJ_DREF_EXPLICIT_LOD:
				return OpImageSampleProjDrefExplicitLod;
			case Main.Op_Image_Fetch:
				return OpImageFetch;
			case Main.Op_Image_Gather:
				return OpImageGather;
			case Main.OP_IMAGE_DREF_GATHER:
				return OpImageDrefGather;
			case Main.OP_IMAGE_READ:
				return OpImageRead;
			case Main.OP_IMAGE_WRITE:
				return OpImageWrite;
			case Main.OP_IMAGE:
				return OpImage;
			case Main.OP_IMAGE_QUERY_FORMAT:
				return OpImageQueryFormat;
			case Main.OP_IMAGE_QUERY_ORDER:
				return OpImageQueryOrder;
			case Main.OP_IMAGE_QUERY_SIZE_LOD:
				return OpImageQuerySizeLod;
			case Main.OP_IMAGE_QUERY_SIZE:
				return OpImageQuerySize;
			case Main.OP_IMAGE_QUERY_LOD:
				return OpImageQueryLod;
			case Main.OP_IMAGE_QUERY_LEVELS:
				return OpImageQueryLevels;
			case Main.OP_IMAGE_QUERY_SAMPLES:
				return OpImageQuerySamples;
			case Main.OP_CONVERT_F_TO_U:
				return OpConvertFToU;
			case Main.OP_CONVERT_F_TO_S:
				return OpConvertFToS;
			case Main.OP_CONVERT_S_TO_F:
				return OpConvertSToF;
			case Main.OP_CONVERT_U_TO_F:
				return OpConvertUToF;
			case Main.OP_U_CONVERT:
				return OpUConvert;
			case Main.OP_S_CONVERT:
				return OpSConvert;
			case Main.OP_F_CONVERT:
				return OpFConvert;
			case Main.OP_QUANTIZE_TO_F16:
				return OpQuantizeToF16;
			case Main.OP_CONVERT_PTR_TO_U:
				return OpConvertPtrToU;
			case Main.Op_Sat_Convert_S_To_U:
				return OpSatConvertSToU;
			case Main.OP_SAT_CONVERT_U_TO_S:
				return OpSatConvertUToS;
			case Main.OP_CONVERT_U_TO_PTR:
				return OpConvertUToPtr;
			case Main.OP_PTR_CAST_TO_GENERIC:
				return OpPtrCastToGeneric;
			case Main.OP_GENERIC_CAST_TO_PTR:
				return OpGenericCastToPtr;
			case Main.OP_GENERIC_CAST_TO_PTR_EXPLICIT:
				return OpGenericCastToPtrExplicit;
			case Main.OP_BITCAST:
				return OpBitcast;
			case Main.OP_S_NEGATE:
				return OpSNegate;
			case Main.OP_F_NEGATE:
				return OpFNegate;
			case Main.OP_I_ADD:
				return OpIAdd;
			case Main.OP_F_ADD:
				return OpFAdd;
			case Main.OP_I_SUB:
				return OpISub;
			case Main.OP_F_SUB:
				return OpFSub;
			case Main.OP_I_MUL:
				return OpIMul;
			case Main.OP_F_MUL:
				return OpFMul;
			case Main.OP_U_DIV:
				return OpUDiv;
			case Main.OP_S_DIV:
				return OpSDiv;
			case Main.OP_F_DIV:
				return OpFDiv;
			case Main.OP_U_MOD:
				return OpUMod;
			case Main.OP_S_REM:
				return OpSRem;
			case Main.OP_S_MOD:
				return OpSMod;
			case Main.OP_F_REM:
				return OpFRem;
			case Main.OP_F_MOD:
				return OpFMod;
			case Main.OP_VECTOR_TIMES_SCALAR:
				return OpVectorTimesScalar;
			case Main.OP_MATRIX_TIMES_SCALAR:
				return OpMatrixTimesScalar;
			case Main.OP_VECTOR_TIMES_MATRIX:
				return OpVectorTimesMatrix;
			case Main.OP_MATRIX_TIMES_VECTOR:
				return OpMatrixTimesVector;
			case Main.OP_MATRIX_TIMES_MATRIX:
				return OpMatrixTimesMatrix;
			case Main.OP_OUTER_PRODUCT:
				return OpOuterProduct;
			case Main.OP_DOT:
				return OpDot;
			case Main.OP_I_ADD_CARRY:
				return OpIAddCarry;
			case Main.OP_I_SUB_BORROW:
				return OpISubBorrow;
			case Main.OP_U_MUL_EXTENDED:
				return OpUMulExtended;
			case Main.OP_S_MUL_EXTENDED:
				return OpSMulExtended;
			case Main.OP_ANY:
				return OpAny;
			case Main.OP_ALL:
				return OpAll;
			case Main.OP_IS_NAN:
				return OpIsNan;
			case Main.OP_IS_INF:
				return OpIsInf;
			case Main.OP_IS_FINITE:
				return OpIsFinite;
			case Main.OP_IS_NORMAL:
				return OpIsNormal;
			case Main.OP_SIGN_BIT_SET:
				return OpSignBitSet;
			case Main.OP_LESS_OR_GREATER:
				return OpLessOrGreater;
			case Main.OP_ORDERED:
				return OpOrdered;
			case Main.OP_UNORDERED:
				return OpUnordered;
			case Main.OP_LOGICAL_EQUAL:
				return OpLogicalEqual;
			case Main.OP_LOGICAL_NOT_EQUAL:
				return OpLogicalNotEqual;
			case Main.OP_LOGICAL_OR:
				return OpLogicalOr;
			case Main.OP_LOGICAL_AND:
				return OpLogicalAnd;
			case Main.OP_LOGICAL_NOT:
				return OpLogicalNot;
			case Main.OP_SELECT:
				return OpSelect;
			case Main.OP_I_EQUAL:
				return OpIEqual;
			case Main.OP_I_NOT_EQUAL:
				return OpINotEqual;
			case Main.OP_U_GREATER_THAN:
				return OpUGreaterThan;
			case Main.OP_S_GREATER_THAN:
				return OpSGreaterThan;
			case Main.OP_U_GREATER_THAN_EQUAL:
				return OpUGreaterThanEqual;
			case Main.OP_S_GREATER_THAN_EQUAL:
				return OpSGreaterThanEqual;
			case Main.OP_U_LESS_THAN:
				return OpULessThan;
			case Main.OP_S_LESS_THAN:
				return OpSLessThan;
			case Main.OP_U_LESS_THAN_EQUAL:
				return OpULessThanEqual;
			case Main.OP_S_LESS_THAN_EQUAL:
				return OpSLessThanEqual;
			case Main.OP_F_ORD_EQUAL:
				return OpFOrdEqual;
			case Main.OP_F_UNORD_EQUAL:
				return OpFUnordEqual;
			case Main.OP_F_ORD_NOT_EQUAL:
				return OpFOrdNotEqual;
			case Main.OP_F_UNORD_NOT_EQUAL:
				return OpFUnordNotEqual;
			case Main.OP_F_ORD_LESS_THAN:
				return OpFOrdLessThan;
			case Main.OP_F_UNORD_LESS_THAN:
				return OpFUnordLessThan;
			case Main.OP_F_ORD_GREATER_THAN:
				return OpFOrdGreaterThan;
			case Main.OP_F_UNORD_GREATER_THAN:
				return OpFUnordGreaterThan;
			case Main.OP_F_ORD_LESS_THAN_EQUAL:
				return OpFOrdLessThanEqual;
			case Main.OP_F_UNORD_LESS_THAN_EQUAL:
				return OpFUnordLessThanEqual;
			case Main.OP_F_ORD_GREATER_THAN_EQUAL:
				return OpFOrdGreaterThanEqual;
			case Main.OP_F_UNORD_GREATER_THAN_EQUAL:
				return OpFUnordGreaterThanEqual;
			case Main.OP_SHIFT_RIGHT_LOGICAL:
				return OpShiftRightLogical;
			case Main.OP_SHIFT_RIGHT_ARITHMETIC:
				return OpShiftRightArithmetic;
			case Main.OP_SHIFT_LEFT_LOGICAL:
				return OpShiftLeftLogical;
			case Main.OP_BITWISE_OR:
				return OpBitwiseOr;
			case Main.OP_BITWISE_XOR:
				return OpBitwiseXor;
			case Main.OP_BITWISE_AND:
				return OpBitwiseAnd;
			case Main.OP_NOT:
				return OpNot;
			case Main.OP_BIT_FIELD_INSERT:
				return OpBitFieldInsert;
			case Main.OP_BIT_FIELD_S_EXTRACT:
				return OpBitFieldSExtract;
			case Main.OP_BIT_FIELD_U_EXTRACT:
				return OpBitFieldUExtract;
			case Main.OP_BIT_REVERSE:
				return OpBitReverse;
			case Main.OP_BIT_COUNT:
				return OpBitCount;
			case Main.OP_DPDX:
				return OpDPdx;
			case Main.OP_DPDY:
				return OpDPdy;
			case Main.OP_F_WIDTH:
				return OpFwidth;
			case Main.OP_DPDX_FINE:
				return OpDPdxFine;
			case Main.OP_DPDY_FINE:
				return OpDPdyFine;
			case Main.OP_F_WIDTH_FINE:
				return OpFwidthFine;
			case Main.OP_DPDX_COARSE:
				return OpDPdxCoarse;
			case Main.OP_DPDY_COARSE:
				return OpDPdyCoarse;
			case Main.OP_F_WIDTH_COARSE:
				return OpFwidthCoarse;
			case Main.OP_EMIT_VERTEX:
				return OpEmitVertex;
			case Main.OP_END_PRIMITIVE:
				return OpEndPrimitive;
			case Main.OP_EMIT_STREAM_VERTEX:
				return OpEmitStreamVertex;
			case Main.OP_END_STREAM_PRIMITIVE:
				return OpEndStreamPrimitive;
			case Main.OP_CONTROL_BARRIER:
				return OpControlBarrier;
			case Main.OP_MEMORY_BARRIER:
				return OpMemoryBarrier;
			case Main.OP_ATOMIC_LOAD:
				return OpAtomicLoad;
			case Main.OP_ATOMIC_STORE:
				return OpAtomicStore;
			case Main.OP_ATOMIC_EXCHANGE:
				return OpAtomicExchange;
			case Main.OP_ATOMIC_COMPARE_EXCHANGE:
				return OpAtomicCompareExchange;
			case Main.OP_ATOMIC_COMPARE_EXCHANGE_WEAK:
				return OpAtomicCompareExchangeWeak;
			case Main.OP_ATOMIC_I_INCREMENT:
				return OpAtomicIIncrement;
			case Main.OP_ATOMIC_I_DECREMENT:
				return OpAtomicIDecrement;
			case Main.OP_ATOMIC_I_ADD:
				return OpAtomicIAdd;
			case Main.OP_ATOMIC_I_SUB:
				return OpAtomicISub;
			case Main.OP_ATOMIC_S_MIN:
				return OpAtomicSMin;
			case Main.OP_ATOMIC_U_MIN:
				return OpAtomicUMin;
			case Main.OP_ATOMIC_S_MAX:
				return OpAtomicSMax;
			case Main.OP_ATOMIC_U_MAX:
				return OpAtomicUMax;
			case Main.OP_ATOMIC_AND:
				return OpAtomicAnd;
			case Main.OP_ATOMIC_OR:
				return OpAtomicOr;
			case Main.OP_ATOMIC_XOR:
				return OpAtomicXor;
			case Main.OP_PHI:
				return OpPhi;
			case Main.OP_LOOP_MERGE:
				return OpLoopMerge;
			case Main.OP_SELECTION_MERGE:
				return OpSelectionMerge;
			case Main.OP_LABEL:
				return OpLabel;
			case Main.OP_BRANCH:
				return OpBranch;
			case Main.OP_BRANCH_CONDITIONAL:
				return OpBranchConditional;
			case Main.OP_SWITCH:
				return OpSwitch;
			case Main.OP_KILL:
				return OpKill;
			case Main.OP_RETURN:
				return OpReturn;
			case Main.OP_RETURN_VALUE:
				return OpReturnValue;
			case Main.OP_UNREACHABLE:
				return OpUnreachable;
			case Main.OP_LIFETIME_START:
				return OpLifetimeStart;
			case Main.OP_LIFETIME_STOP:
				return OpLifetimeStop;
			case Main.OP_GROUP_ASYNC_COPY:
				return OpGroupAsyncCopy;
			case Main.OP_GROUP_WAIT_EVENTS:
				return OpGroupWaitEvents;
			case Main.OP_GROUP_ALL:
				return OpGroupAll;
			case Main.OP_GROUP_ANY:
				return OpGroupAny;
			case Main.Op_Group_Broadcast:
				return OpGroupBroadcast;
			case Main.OP_GROUP_I_ADD:
				return OpGroupIAdd;
			case Main.OP_GROUP_F_ADD:
				return OpGroupFAdd;
			case Main.OP_GROUP_F_MIN:
				return OpGroupFMin;
			case Main.OP_GROUP_U_MIN:
				return OpGroupUMin;
			case Main.OP_GROUP_S_MIN:
				return OpGroupSMin;
			case Main.OP_GROUP_F_MAX:
				return OpGroupFMax;
			case Main.OP_GROUP_U_MAX:
				return OpGroupUMax;
			case Main.OP_GROUP_S_MAX:
				return OpGroupSMax;
			case Main.OP_READ_PIPE:
				return OpReadPipe;
			case Main.OP_WRITE_PIPE:
				return OpWritePipe;
			case Main.Op_ReservEd_Read_Pipe:
				return OpReservedReadPipe;
			case Main.OP_RESERVED_WRITE_PIPE:
				return OpReservedWritePipe;
			case Main.OP_RESERVE_READ_PIPE_PACKETS:
				return OpReserveReadPipePackets;
			case Main.OP_RESERVE_WRITE_PIPE_PACKETS:
				return OpReserveWritePipePackets;
			case Main.OP_COMMIT_READ_PIPE:
				return OpCommitReadPipe;
			case Main.OP_COMMIT_WRITE_PIPE:
				return OpCommitWritePipe;
			case Main.OP_IS_VALID_RESERVE_ID:
				return OpIsValidReserveId;
			case Main.OP_GET_NUM_PIPE_PACKETS:
				return OpGetNumPipePackets;
			case Main.OP_GET_MAX_PIPE_PACKETS:
				return OpGetMaxPipePackets;
			case Main.OP_GROUP_RESERVE_READ_PIPE_PACKETS:
				return OpGroupReserveReadPipePackets;
			case Main.OP_GROUP_RESERVE_WRITE_PIPE_PACKETS:
				return OpGroupReserveWritePipePackets;
			case Main.OP_GROUP_COMMIT_READ_PIPE:
				return OpGroupCommitReadPipe;
			case Main.OP_GROUP_COMMIT_WRITE_PIPE:
				return OpGroupCommitWritePipe;
			case Main.OP_ENQUEUE_MARKER:
				return OpEnqueueMarker;
			case Main.OP_ENQUEUE_KERNEL:
				return OpEnqueueKernel;
			case Main.OP_GET_KERNEL_NDRANGE_SUB_GROUP_COUNT:
				return OpGetKernelNDrangeSubGroupCount;
			case Main.OP_GET_KERNEL_NDRANGE_MAX_SUB_GROUP_SIZE:
				return OpGetKernelNDrangeMaxSubGroupSize;
			case Main.OP_GET_KERNEL_WORK_GROUP_SIZE:
				return OpGetKernelWorkGroupSize;
			case Main.OP_GET_KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE:
				return OpGetKernelPreferredWorkGroupSizeMultiple;
			case Main.OP_RETAIN_EVENT:
				return OpRetainEvent;
			case Main.OP_RELEASE_EVENT:
				return OpReleaseEvent;
			case Main.OP_CREATE_USER_EVENT:
				return OpCreateUserEvent;
			case Main.OP_IS_VALID_EVENT:
				return OpIsValidEvent;
			case Main.OP_SET_USER_EVENT_STATUS:
				return OpSetUserEventStatus;
			case Main.OP_CAPTURE_EVENT_PROFILING_INFO:
				return OpCaptureEventProfilingInfo;
			case Main.OP_GET_DEFAULT_QUEUE:
				return OpGetDefaultQueue;
			case Main.OP_BUILD_ND_RANGE:
				return OpBuildNDRange;
			case Main.OP_IMAGE_SPARSE_SAMPLE_IMPLICIT_LOD:
				return OpImageSparseSampleImplicitLod;
			case Main.OP_IMAGE_SPARSE_SAMPLE_EXPLICIT_LOD:
				return OpImageSparseSampleExplicitLod;
			case Main.OP_IMAGE_SPARSE_SAMPLE_DREF_IMPLICIT_LOD:
				return OpImageSparseSampleDrefImplicitLod;
			case Main.OP_IMAGE_SPARSE_SAMPLE_DREF_EXPLICIT_LOD:
				return OpImageSparseSampleDrefExplicitLod;
			case Main.OP_IMAGE_SPARSE_SAMPLE_PROJ_IMPLICIT_LOD:
				return OpImageSparseSampleProjImplicitLod;
			case Main.OP_IMAGE_SPARSE_SAMPLE_PROJ_EXPLICIT_LOD:
				return OpImageSparseSampleProjExplicitLod;
			case Main.OP_IMAGE_SPARSE_SAMPLE_PROJ_DREF_IMPLICIT_LOD:
				return OpImageSparseSampleProjDrefImplicitLod;
			case Main.OP_IMAGE_SPARSE_SAMPLE_PROJ_DREF_EXPLICIT_LOD:
				return OpImageSparseSampleProjDrefExplicitLod;
			case Main.OP_IMAGE_SPARSE_FETCH:
				return OpImageSparseFetch;
			case Main.OP_IMAGE_SPARSE_GATHER:
				return OpImageSparseGather;
			case Main.OP_IMAGE_SPARSE_DREF_GATHER:
				return OpImageSparseDrefGather;
			case Main.OP_IMAGE_SPARSE_TEXELS_RESIDENT:
				return OpImageSparseTexelsResident;
			case Main.OP_NO_LINE:
				return OpNoLine;
			case Main.OP_ATOMIC_FLAG_TEST_AND_SET:
				return OpAtomicFlagTestAndSet;
			case Main.OP_ATOMIC_FLAG_CLEAR:
				return OpAtomicFlagClear;
			case Main.OP_IMAGE_SPARSE_READ:
				return OpImageSparseRead;
			case Main.OP_SIZE_OF:
				return OpSizeOf;
			case Main.OP_TYPE_PIPE_STORAGE:
				return OpTypePipeStorage;
			case Main.OP_CONSTANT_PIPE_STORAGE:
				return OpConstantPipeStorage;
			case Main.OP_CREATE_PIPE_FROM_PIPE_STORAGE:
				return OpCreatePipeFromPipeStorage;
			case Main.OP_GET_KERNEL_LOCAL_SIZE_FOR_SUBGROUP_COUNT:
				return OpGetKernelLocalSizeForSubgroupCount;
			case Main.OP_GET_KERNEL_MAX_NUM_SUBGROUPS:
				return OpGetKernelMaxNumSubgroups;
			case Main.OP_TYPE_NAMED_BARRIER:
				return OpTypeNamedBarrier;
			case Main.OP_NAMED_BARRIER_INITIALIZE:
				return OpNamedBarrierInitialize;
			case Main.OP_MEMORY_NAMED_BARRIER:
				return OpMemoryNamedBarrier;
			case Main.OP_MODULE_PROCESSED:
				return OpModuleProcessed;
			case Main.OP_EXECUTION_MODE_ID:
				return OpExecutionModeId;
			case Main.OP_DECORATE_ID:
				return OpDecorateId;
			case Main.OP_GROUP_NON_UNIFORM_ELECT:
				return OpGroupNonUniformElect;
			case Main.OP_GROUP_NON_UNIFORM_ALL:
				return OpGroupNonUniformAll;
			case Main.OP_GROUP_NON_UNIFORM_ANY:
				return OpGroupNonUniformAny;
			case Main.OP_GROUP_NON_UNIFORM_ALL_EQUAL:
				return OpGroupNonUniformAllEqual;
			case Main.OP_GROUP_NON_UNIFORM_BROADCAST:
				return OpGroupNonUniformBroadcast;
			case Main.OP_GROUP_NON_UNIFORM_BROADCAST_FIRST:
				return OpGroupNonUniformBroadcastFirst;
			case Main.OP_GROUP_NON_UNIFORM_BALLOT:
				return OpGroupNonUniformBallot;
			case Main.OP_GROUP_NON_UNIFORM_INVERSE_BALLOT:
				return OpGroupNonUniformInverseBallot;
			case Main.OP_GROUP_NON_UNIFORM_BALLOT_BIT_EXTRACT:
				return OpGroupNonUniformBallotBitExtract;
			case Main.OP_GROUP_NON_UNIFORM_BALLOT_BIT_COUNT:
				return OpGroupNonUniformBallotBitCount;
			case Main.OP_GROUP_NON_UNIFORM_BALLOT_FIND_LSB:
				return OpGroupNonUniformBallotFindLSB;
			case Main.OP_GROUP_NON_UNIFORM_BALLOT_FIND_MSB:
				return OpGroupNonUniformBallotFindMSB;
			case Main.OP_GROUP_NON_UNIFORM_SHUFFLE:
				return OpGroupNonUniformShuffle;
			case Main.OP_GROUP_NON_UNIFORM_SHUFFLE_XOR:
				return OpGroupNonUniformShuffleXor;
			case Main.OP_GROUP_NON_UNIFORM_SHUFFLE_UP:
				return OpGroupNonUniformShuffleUp;
			case Main.OP_GROUP_NON_UNIFORM_SHUFFLE_DOWN:
				return OpGroupNonUniformShuffleDown;
			case Main.OP_GROUP_NON_UNIFORM_I_ADD:
				return OpGroupNonUniformIAdd;
			case Main.OP_GROUP_NON_UNIFORM_F_ADD:
				return OpGroupNonUniformFAdd;
			case Main.OP_GROUP_NON_UNIFORM_I_MUL:
				return OpGroupNonUniformIMul;
			case Main.OP_GROUP_NON_UNIFORM_F_MUL:
				return OpGroupNonUniformFMul;
			case Main.OP_GROUP_NON_UNIFORM_S_MIN:
				return OpGroupNonUniformSMin;
			case Main.OP_GROUP_NON_UNIFORM_U_MIN:
				return OpGroupNonUniformUMin;
			case Main.OP_GROUP_NON_UNIFORM_F_MIN:
				return OpGroupNonUniformFMin;
			case Main.OP_GROUP_NON_UNIFORM_S_MAX:
				return OpGroupNonUniformSMax;
			case Main.OP_GROUP_NON_UNIFORM_U_MAX:
				return OpGroupNonUniformUMax;
			case Main.OP_GROUP_NON_UNIFORM_F_MAX:
				return OpGroupNonUniformFMax;
			case Main.OP_GROUP_NON_UNIFORM_BITWISE_AND:
				return OpGroupNonUniformBitwiseAnd;
			case Main.OP_GROUP_NON_UNIFORM_BITWISE_OR:
				return OpGroupNonUniformBitwiseOr;
			case Main.OP_GROUP_NON_UNIFORM_BITWISE_XOR:
				return OpGroupNonUniformBitwiseXor;
			case Main.OP_GROUP_NON_UNIFORM_LOGICAL_AND:
				return OpGroupNonUniformLogicalAnd;
			case Main.OP_GROUP_NON_UNIFORM_LOGICAL_OR:
				return OpGroupNonUniformLogicalOr;
			case Main.OP_GROUP_NON_UNIFORM_LOGICAL_XOR:
				return OpGroupNonUniformLogicalXor;
			case Main.OP_GROUP_NON_UNIFORM_QUAD_BROADCAST:
				return OpGroupNonUniformQuadBroadcast;
			case Main.OP_GROUP_NON_UNIFORM_QUAD_SWAP:
				return OpGroupNonUniformQuadSwap;
			case Main.OP_COPY_LOGICAL:
				return OpCopyLogical;
			case Main.OP_PTR_EQUAL:
				return OpPtrEqual;
			case Main.OP_PTR_NOT_EQUAL:
				return OpPtrNotEqual;
			case Main.OP_PTR_DIFF:
				return OpPtrDiff;
			case Main.OP_SUBGROUP_BALLOT_KHR:
				return OpSubgroupBallotKHR;
			case Main.OP_SUBGROUP_FIRST_INVOCATION_KHR:
				return OpSubgroupFirstInvocationKHR;
			case Main.OP_SUBGROUP_ALL_KHR:
				return OpSubgroupAllKHR;
			case Main.OP_SUBGROUP_ANY_KHR:
				return OpSubgroupAnyKHR;
			case Main.OP_SUBGROUP_ALL_EQUAL_KHR:
				return OpSubgroupAllEqualKHR;
			case Main.OP_SUBGROUP_READ_INVOCATION_KHR:
				return OpSubgroupReadInvocationKHR;
			case Main.Op_Type_Ray_Query_Provisional_KHR:
				return OpTypeRayQueryProvisionalKHR;
			case Main.OP_RAY_QUERY_INITIALIZE_KHR:
				return OpRayQueryInitializeKHR;
			case Main.OP_RAY_QUERY_TERMINATE_KHR:
				return OpRayQueryTerminateKHR;
			case Main.OP_RAY_QUERY_GENERATE_INTERSECTION_KHR:
				return OpRayQueryGenerateIntersectionKHR;
			case Main.OP_RAY_QUERY_CONFIRM_INTERSECTION_KHR:
				return OpRayQueryConfirmIntersectionKHR;
			case Main.OP_RAY_QUERY_PROCEED_KHR:
				return OpRayQueryProceedKHR;
			case Main.OP_RAY_QUERY_GET_INTERSECTION_TYPE_KHR:
				return OpRayQueryGetIntersectionTypeKHR;
			case Main.OP_GROUP_I_ADD_NON_UNIFORM_AMD:
				return OpGroupIAddNonUniformAMD;
			case Main.OP_GROUP_F_ADD_NON_UNIFORM_AMD:
				return OpGroupFAddNonUniformAMD;
			case Main.OP_GROUP_F_MIN_NON_UNIFORM_AMD:
				return OpGroupFMinNonUniformAMD;
			case Main.OP_GROUP_U_MIN_NON_UNIFORM_AMD:
				return OpGroupUMinNonUniformAMD;
			case Main.OP_GROUP_S_MIN_NON_UNIFORM_AMD:
				return OpGroupSMinNonUniformAMD;
			case Main.OP_GROUP_F_MAX_NON_UNIFORM_AMD:
				return OpGroupFMaxNonUniformAMD;
			case Main.OP_GROUP_U_MAX_NON_UNIFORM_AMD:
				return OpGroupUMaxNonUniformAMD;
			case Main.OP_GROUP_S_MAX_NON_UNIFORM_AMD:
				return OpGroupSMaxNonUniformAMD;
			case Main.OP_FRAGMENT_MASK_FETCH_AMD:
				return OpFragmentMaskFetchAMD;
			case Main.OP_FRAGMENT_FETCH_AMD:
				return OpFragmentFetchAMD;
			case Main.OP_READ_CLOCK_KHR:
				return OpReadClockKHR;
			case Main.OP_IMAGE_SAMPLE_FOOTPRINT_NV:
				return OpImageSampleFootprintNV;
			case Main.OP_GROUP_NON_UNIFORM_PARTITION_NV:
				return OpGroupNonUniformPartitionNV;
			case Main.OP_WRITE_PACKED_PRIMITIVE_INDICES_4X8_NV:
				return OpWritePackedPrimitiveIndices4x8NV;
			case Main.OP_REPORT_INTERSECTION_KHR:
				return OpReportIntersectionKHR;
			case Main.OP_IGNORE_INTERSECTION_KHR:
				return OpIgnoreIntersectionKHR;
			case Main.OP_TERMINATE_RAY_KHR:
				return OpTerminateRayKHR;
			case Main.OP_TRACE_RAY_KHR:
				return OpTraceRayKHR;
			case Main.OP_TYPE_ACCELERATION_STRUCTURE_KHR:
				return OpTypeAccelerationStructureKHR;
			case Main.OP_EXECUTE_CALLABLE_KHR:
				return OpExecuteCallableKHR;
			case Main.OP_TYPE_COOPERATIVE_MATRIX_NV:
				return OpTypeCooperativeMatrixNV;
			case Main.OP_COOPERATIVE_MATRIX_LOAD_NV:
				return OpCooperativeMatrixLoadNV;
			case Main.OP_COOPERATIVE_MATRIX_STORE_NV:
				return OpCooperativeMatrixStoreNV;
			case Main.OP_COOPERATIVE_MATRIX_MUL_ADD_NV:
				return OpCooperativeMatrixMulAddNV;
			case Main.OP_COOPERATIVE_MATRIX_LENGTH_NV:
				return OpCooperativeMatrixLengthNV;
			case Main.OP_BEGIN_INVOCATION_INTERLOCK_EXT:
				return OpBeginInvocationInterlockEXT;
			case Main.OP_END_INVOCATION_INTERLOCK_EXT:
				return OpEndInvocationInterlockEXT;
			case Main.OP_DEMOTE_TO_HELPER_INVOCATION_EXT:
				return OpDemoteToHelperInvocationEXT;
			case Main.OP_IS_HELPER_INVOCATION_EXT:
				return OpIsHelperInvocationEXT;
			case Main.OP_SUBGROUP_SHUFFLE_INTEL:
				return OpSubgroupShuffleINTEL;
			case Main.OP_SUBGROUP_SHUFFLE_DOWN_INTEL:
				return OpSubgroupShuffleDownINTEL;
			case Main.OP_SUBGROUP_SHUFFLE_UP_INTEL:
				return OpSubgroupShuffleUpINTEL;
			case Main.OP_SUBGROUP_SHUFFLE_XOR_INTEL:
				return OpSubgroupShuffleXorINTEL;
			case Main.OP_SUBGROUP_BLOCK_READ_INTEL:
				return OpSubgroupBlockReadINTEL;
			case Main.OP_SUBGROUP_BLOCK_WRITE_INTEL:
				return OpSubgroupBlockWriteINTEL;
			case Main.OP_SUBGROUP_IMAGE_BLOCK_READ_INTEL:
				return OpSubgroupImageBlockReadINTEL;
			case Main.OP_SUBGROUP_IMAGE_BLOCK_WRITE_INTEL:
				return OpSubgroupImageBlockWriteINTEL;
			case Main.OP_SUBGROUP_IMAGE_MEDIA_BLOCK_READ_INTEL:
				return OpSubgroupImageMediaBlockReadINTEL;
			case Main.OP_SUBGROUP_IMAGE_MEDIA_BLOCK_WRITE_INTEL:
				return OpSubgroupImageMediaBlockWriteINTEL;
			case Main.OP_U_COUNT_LEADING_ZEROS_INTEL:
				return OpUCountLeadingZerosINTEL;
			case Main.OP_U_COUNT_TRAILING_ZEROS_INTEL:
				return OpUCountTrailingZerosINTEL;
			case Main.OP_ABS_I_SUB_INTEL:
				return OpAbsISubINTEL;
			case Main.OP_ABS_U_SUB_INTEL:
				return OpAbsUSubINTEL;
			case Main.OP_I_ADD_SAT_INTEL:
				return OpIAddSatINTEL;
			case Main.OP_U_ADD_SAT_INTEL:
				return OpUAddSatINTEL;
			case Main.OP_I_AVERAGE_INTEL:
				return OpIAverageINTEL;
			case Main.OP_U_AVERAGE_INTEL:
				return OpUAverageINTEL;
			case Main.OP_I_AVERAGE_ROUNDED_INTEL:
				return OpIAverageRoundedINTEL;
			case Main.OP_U_AVERAGE_ROUNDED_INTEL:
				return OpUAverageRoundedINTEL;
			case Main.OP_I_SUB_SAT_INTEL:
				return OpISubSatINTEL;
			case Main.OP_U_SUB_SAT_INTEL:
				return OpUSubSatINTEL;
			case Main.OP_I_MUL_32X16_INTEL:
				return OpIMul32x16INTEL;
			case Main.OP_U_MUL_32X16_INTEL:
				return OpUMul32x16INTEL;
			case Main.OP_FUNCTION_POINTER_INTEL:
				return OpFunctionPointerINTEL;
			case Main.OP_FUNCTION_POINTER_CALL_INTEL:
				return OpFunctionPointerCallINTEL;
			case Main.OP_DECORATE_STRING:
				return OpDecorateString;
			case Main.OP_MEMBER_DECORATE_STRING:
				return OpMemberDecorateString;
			case Main.OP_VME_IMAGE_INTEL:
				return OpVmeImageINTEL;
			case Main.OP_TYPE_VME_IMAGE_INTEL:
				return OpTypeVmeImageINTEL;
			case Main.OP_TYPE_AVC_IME_PAYLOAD_INTEL:
				return OpTypeAvcImePayloadINTEL;
			case Main.OP_TYPE_AVC_REF_PAYLOAD_INTEL:
				return OpTypeAvcRefPayloadINTEL;
			case Main.OP_TYPE_AVC_SIC_PAYLOAD_INTEL:
				return OpTypeAvcSicPayloadINTEL;
			case Main.OP_TYPE_AVC_MCE_PAYLOAD_INTEL:
				return OpTypeAvcMcePayloadINTEL;
			case Main.OP_TYPE_AVC_MCE_RESULT_INTEL:
				return OpTypeAvcMceResultINTEL;
			case Main.OP_TYPE_AVC_IME_RESULT_INTEL:
				return OpTypeAvcImeResultINTEL;
			case Main.OP_TYPE_AVC_IME_RESULT_SINGLE_REFERENCE_STREAMOUT_INTEL:
				return OpTypeAvcImeResultSingleReferenceStreamoutINTEL;
			case Main.OP_TYPE_AVC_IME_RESULT_DUAL_REFERENCE_STREAMOUT_INTEL:
				return OpTypeAvcImeResultDualReferenceStreamoutINTEL;
			case Main.OP_TYPE_AVC_IME_SINGLE_REFERENCE_STREAMIN_INTEL:
				return OpTypeAvcImeSingleReferenceStreaminINTEL;
			case Main.OP_TYPE_AVC_IME_DUAL_REFERENCE_STREAMIN_INTEL:
				return OpTypeAvcImeDualReferenceStreaminINTEL;
			case Main.OP_TYPE_AVC_REF_RESULT_INTEL:
				return OpTypeAvcRefResultINTEL;
			case Main.OP_TYPE_AVC_SIC_RESULT_INTEL:
				return OpTypeAvcSicResultINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTER_BASE_MULTI_REFERENCE_PENALTY_INTEL:
				return OpSubgroupAvcMceGetDefaultInterBaseMultiReferencePenaltyINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_SET_INTER_BASE_MULTI_REFERENCE_PENALTY_INTEL:
				return OpSubgroupAvcMceSetInterBaseMultiReferencePenaltyINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTER_SHAPE_PENALTY_INTEL:
				return OpSubgroupAvcMceGetDefaultInterShapePenaltyINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_SET_INTER_SHAPE_PENALTY_INTEL:
				return OpSubgroupAvcMceSetInterShapePenaltyINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTER_DIRECTION_PENALTY_INTEL:
				return OpSubgroupAvcMceGetDefaultInterDirectionPenaltyINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_SET_INTE_DIRECTION_PENALTY_INTEL:
				return OpSubgroupAvcMceSetInterDirectionPenaltyINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTRA_LUMA_SHAPE_PENALTY_INTEL:
				return OpSubgroupAvcMceGetDefaultIntraLumaShapePenaltyINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTER_MOTION_VECTOR_COST_TABLE_INTEL:
				return OpSubgroupAvcMceGetDefaultInterMotionVectorCostTableINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_HIGH_PENALTY_COST_TABLE_INTEL:
				return OpSubgroupAvcMceGetDefaultHighPenaltyCostTableINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_MEDIUM_PENALTY_COST_TABLE_INTEL:
				return OpSubgroupAvcMceGetDefaultMediumPenaltyCostTableINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_LOW_PENALTY_COST_TABLE_INTEL:
				return OpSubgroupAvcMceGetDefaultLowPenaltyCostTableINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_SET_MOTION_VECTOR_COST_FUNCTION_INTEL:
				return OpSubgroupAvcMceSetMotionVectorCostFunctionINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTRA_LUMA_MODE_PENALTY_INTEL:
				return OpSubgroupAvcMceGetDefaultIntraLumaModePenaltyINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_NON_DC_LUMA_INTRA_PENALTY_INTEL:
				return OpSubgroupAvcMceGetDefaultNonDcLumaIntraPenaltyINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_DEFAULT_INTRA_CHROMA_MODE_BASE_PENALTY_INTEL:
				return OpSubgroupAvcMceGetDefaultIntraChromaModeBasePenaltyINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_SET_AC_ONLY_HAAR_INTEL:
				return OpSubgroupAvcMceSetAcOnlyHaarINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_SET_SOURCE_INTERLACED_FIELD_POLARITY_INTEL:
				return OpSubgroupAvcMceSetSourceInterlacedFieldPolarityINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_SET_SINGLE_REFERENCE_INTERLACED_FIELD_POLARITY_INTEL:
				return OpSubgroupAvcMceSetSingleReferenceInterlacedFieldPolarityINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_SET_DUAL_REFERENCE_INTERLACED_FIELD_POLARITIES_INTEL:
				return OpSubgroupAvcMceSetDualReferenceInterlacedFieldPolaritiesINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_CONVERT_TO_IME_PAYLOAD_INTEL:
				return OpSubgroupAvcMceConvertToImePayloadINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_CONVERT_TO_IME_RESULT_INTEL:
				return OpSubgroupAvcMceConvertToImeResultINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_CONVERT_TO_REF_PAYLOAD_INTEL:
				return OpSubgroupAvcMceConvertToRefPayloadINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_CONVERT_TO_REF_RESULT_INTEL:
				return OpSubgroupAvcMceConvertToRefResultINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_CONVERT_TO_SIC_PAYLOAD_INTEL:
				return OpSubgroupAvcMceConvertToSicPayloadINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_CONVERT_TO_SIC_RESULT_INTEL:
				return OpSubgroupAvcMceConvertToSicResultINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_MOTION_VECTORS_INTEL:
				return OpSubgroupAvcMceGetMotionVectorsINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_INTER_DISTORTIONS_INTEL:
				return OpSubgroupAvcMceGetInterDistortionsINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_BEST_INTER_DISTORTIONS_INTEL:
				return OpSubgroupAvcMceGetBestInterDistortionsINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_INTER_MAJOR_SHAPE_INTEL:
				return OpSubgroupAvcMceGetInterMajorShapeINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_INTER_MINOR_SHAPE_INTEL:
				return OpSubgroupAvcMceGetInterMinorShapeINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_INTER_DIRECTIONS_INTEL:
				return OpSubgroupAvcMceGetInterDirectionsINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_INTER_MOTION_VECTOR_COUNT_INTEL:
				return OpSubgroupAvcMceGetInterMotionVectorCountINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_INTER_REFERENCE_IDS_INTEL:
				return OpSubgroupAvcMceGetInterReferenceIdsINTEL;
			case Main.OP_SUBGROUP_AVC_MCE_GET_INTER_REFERENCE_INTERLACED_FIELD_POLARITIES_INTEL:
				return OpSubgroupAvcMceGetInterReferenceInterlacedFieldPolaritiesINTEL;
			case Main.Op_Subgroup_Avc_Ime_Initialize_INTEL:
				return OpSubgroupAvcImeInitializeINTEL;
			case Main.OP_SUBGROUP_AVC_IME_SET_SINGLE_REFERENCE_INTEL:
				return OpSubgroupAvcImeSetSingleReferenceINTEL;
			case Main.OP_SUBGROUP_AVC_IME_SET_DUAL_REFERENCE_INTEL:
				return OpSubgroupAvcImeSetDualReferenceINTEL;
			case Main.OP_SUBGROUP_AVC_IME_REF_WINDOW_SIZE_INTEL:
				return OpSubgroupAvcImeRefWindowSizeINTEL;
			case Main.OP_SUBGROUP_AVC_IME_ADJUST_REF_OFFSET_INTEL:
				return OpSubgroupAvcImeAdjustRefOffsetINTEL;
			case Main.OP_SUBGROUP_AVC_IME_CONVERT_TO_MCE_PAYLOAD_INTEL:
				return OpSubgroupAvcImeConvertToMcePayloadINTEL;
			case Main.OP_SUBGROUP_AVC_IME_SET_MAX_MOTION_VECTOR_COUNT_INTEL:
				return OpSubgroupAvcImeSetMaxMotionVectorCountINTEL;
			case Main.OP_SUBGROUP_AVC_IME_SET_UNIDIRECTIONAL_MIX_DISABLE_INTEL:
				return OpSubgroupAvcImeSetUnidirectionalMixDisableINTEL;
			case Main.OP_SUBGROUP_AVC_IME_SET_EARLY_SEARCH_TERMINATION_THRESHOLD_INTEL:
				return OpSubgroupAvcImeSetEarlySearchTerminationThresholdINTEL;
			case Main.OP_SUBGROUP_AVC_IME_SET_WEIGHTED_SAD_INTEL:
				return OpSubgroupAvcImeSetWeightedSadINTEL;
			case Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_SINGLE_REFERENCE_INTEL:
				return OpSubgroupAvcImeEvaluateWithSingleReferenceINTEL;
			case Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_DUAL_REFERENCE_INTEL:
				return OpSubgroupAvcImeEvaluateWithDualReferenceINTEL;
			case Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_SINGLE_REFERENCE_STREAMIN_INTEL:
				return OpSubgroupAvcImeEvaluateWithSingleReferenceStreaminINTEL;
			case Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_DUAL_REFERENCE_STREAMIN_INTEL:
				return OpSubgroupAvcImeEvaluateWithDualReferenceStreaminINTEL;
			case Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_SINGLE_REFERENCE_STREAMOUT_INTEL:
				return OpSubgroupAvcImeEvaluateWithSingleReferenceStreamoutINTEL;
			case Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_DUAL_REFERENCE_STREAMOUT_INTEL:
				return OpSubgroupAvcImeEvaluateWithDualReferenceStreamoutINTEL;
			case Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_SINGLE_REFERENCE_STREAMINOUT_INTEL:
				return OpSubgroupAvcImeEvaluateWithSingleReferenceStreaminoutINTEL;
			case Main.OP_SUBGROUP_AVC_IME_EVALUATE_WITH_DUAL_REFERENCE_STREAMINOUT_INTEL:
				return OpSubgroupAvcImeEvaluateWithDualReferenceStreaminoutINTEL;
			case Main.OP_SUBGROUP_AVC_IME_CONVERT_TO_MCE_RESULT_INTEL:
				return OpSubgroupAvcImeConvertToMceResultINTEL;
			case Main.OP_SUBGROUP_AVC_IME_GET_SINGLE_REFERENCE_STREAMIN_INTEL:
				return OpSubgroupAvcImeGetSingleReferenceStreaminINTEL;
			case Main.OP_SUBGROUP_AVC_IME_GET_DUAL_REFERENCE_STREAMIN_INTEL:
				return OpSubgroupAvcImeGetDualReferenceStreaminINTEL;
			case Main.OP_SUBGROUP_AVC_IME_STRIP_SINGLE_REFERENCE_STREAMOUT_INTEL:
				return OpSubgroupAvcImeStripSingleReferenceStreamoutINTEL;
			case Main.OP_SUBGROUP_AVC_IME_STRIP_DUAL_REFERENCE_STREAMOUT_INTEL:
				return OpSubgroupAvcImeStripDualReferenceStreamoutINTEL;
			case Main.OP_SUBGROUP_AVC_IME_GET_STREAMOUT_SINGLE_REFERENCE_MAJOR_SHAPE_MOTION_VECTORS_INTEL:
				return OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeMotionVectorsINTEL;
			case Main.OP_SUBGROUP_AVC_IME_GET_STREAMOUT_SINGLE_REFERENCE_MAJOR_SHAPE_DISTORTIONS_INTEL:
				return OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeDistortionsINTEL;
			case Main.OP_SUBGROUP_AVC_IME_GET_STREAMOUT_SINGLE_REFERENCE_MAJOR_SHAPE_REFERENCE_IDS_INTEL:
				return OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeReferenceIdsINTEL;
			case Main.OP_SUBGROUP_AVC_IME_GET_STREAMOUT_DUAL_REFERENCE_MAJOR_SHAPE_MOTION_VECTORS_INTEL:
				return OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeMotionVectorsINTEL;
			case Main.OP_SUBGROUP_AVC_IME_GET_STREAMOUT_DUAL_REFERENCE_MAJOR_SHAPE_DISTORTIONS_INTEL:
				return OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeDistortionsINTEL;
			case Main.OP_SUBGROUP_AVC_IME_GET_STREAMOUT_DUAL_REFERENCE_MAJOR_SHAPE_REFERENCE_IDS_INTEL:
				return OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeReferenceIdsINTEL;
			case Main.OP_SUBGROUP_AVC_IME_GET_BORDER_REACHED_INTEL:
				return OpSubgroupAvcImeGetBorderReachedINTEL;
			case Main.OP_SUBGROUP_AVC_IME_GET_TRUNCATED_SEARCH_INDICATION_INTEL:
				return OpSubgroupAvcImeGetTruncatedSearchIndicationINTEL;
			case Main.OP_SUBGROUP_AVC_IME_GET_UNIDIRECTIONAL_EARLY_SEARCH_TERMINATION_INTEL:
				return OpSubgroupAvcImeGetUnidirectionalEarlySearchTerminationINTEL;
			case Main.OP_SUBGROUP_AVC_IME_GET_WEIGHTING_PATTERN_MINIMUM_MOTION_VECTOR_INTEL:
				return OpSubgroupAvcImeGetWeightingPatternMinimumMotionVectorINTEL;
			case Main.OP_SUBGROUP_AVC_IME_GET_WEIGHTING_PATTERN_MINIMUM_DISTORTION_INTEL:
				return OpSubgroupAvcImeGetWeightingPatternMinimumDistortionINTEL;
			case Main.OP_SUBGROUP_AVC_FME_INITIALIZE_INTEL:
				return OpSubgroupAvcFmeInitializeINTEL;
			case Main.OP_SUBGROUP_AVC_BME_INITIALIZE_INTEL:
				return OpSubgroupAvcBmeInitializeINTEL;
			case Main.OP_SUBGROUP_AVC_REF_CONVERT_TO_MCE_PAYLOAD_INTEL:
				return OpSubgroupAvcRefConvertToMcePayloadINTEL;
			case Main.OP_SUBGROUP_AVC_REF_SET_BIDIRECTIONAL_MIX_DISABLE_INTEL:
				return OpSubgroupAvcRefSetBidirectionalMixDisableINTEL;
			case Main.OP_SUBGROUP_AVC_REF_SET_BILINEAR_FILTER_ENABLE_INTEL:
				return OpSubgroupAvcRefSetBilinearFilterEnableINTEL;
			case Main.OP_SUBGROUP_AVC_REF_EVALUATE_WITH_SINGLE_REFERENCE_INTEL:
				return OpSubgroupAvcRefEvaluateWithSingleReferenceINTEL;
			case Main.OP_SUBGROUP_AVC_REF_EVALUATE_WITH_DUAL_REFERENCE_INTEL:
				return OpSubgroupAvcRefEvaluateWithDualReferenceINTEL;
			case Main.OP_SUBGROUP_AVC_REF_EVALUATE_WITH_MULTI_REFERENCE_INTEL:
				return OpSubgroupAvcRefEvaluateWithMultiReferenceINTEL;
			case Main.OP_SUBGROUP_AVC_REF_EVALUATE_WITH_MULTI_REFERENCE_INTERLACED_INTEL:
				return OpSubgroupAvcRefEvaluateWithMultiReferenceInterlacedINTEL;
			case Main.OP_SUBGROUP_AVC_REF_CONVERT_TO_MCE_RESULT_INTEL:
				return OpSubgroupAvcRefConvertToMceResultINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_INITIALIZE_INTEL:
				return OpSubgroupAvcSicInitializeINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_CONFIGURE_SKC_INTEL:
				return OpSubgroupAvcSicConfigureSkcINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_CONFIGURE_IPE_LUMA_INTEL:
				return OpSubgroupAvcSicConfigureIpeLumaINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_CONFIGURE_IPE_LUMA_CHROMA_INTEL:
				return OpSubgroupAvcSicConfigureIpeLumaChromaINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_GET_MOTION_VECTOR_MASK_INTEL:
				return OpSubgroupAvcSicGetMotionVectorMaskINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_CONVERT_TO_MCE_PAYLOAD_INTEL:
				return OpSubgroupAvcSicConvertToMcePayloadINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_SET_INTRA_LUMA_SHAPE_PENALTY_INTEL:
				return OpSubgroupAvcSicSetIntraLumaShapePenaltyINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_SET_INTRA_LUMA_MODE_COST_FUNCTION_INTEL:
				return OpSubgroupAvcSicSetIntraLumaModeCostFunctionINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_SET_INTRA_CHROMA_MODE_COST_FUNCTION_INTEL:
				return OpSubgroupAvcSicSetIntraChromaModeCostFunctionINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_SET_BILINEAR_FILTER_ENABLE_INTEL:
				return OpSubgroupAvcSicSetBilinearFilterEnableINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_SET_SKC_FORWARD_TRANSFORM_ENABLE_INTEL:
				return OpSubgroupAvcSicSetSkcForwardTransformEnableINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_SET_BLOCK_BASED_RAW_SKIP_SAD_INTEL:
				return OpSubgroupAvcSicSetBlockBasedRawSkipSadINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_EVALUATE_IPE_INTEL:
				return OpSubgroupAvcSicEvaluateIpeINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_EVALUATE_WITH_SINGLE_REFERENCE_INTEL:
				return OpSubgroupAvcSicEvaluateWithSingleReferenceINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_EVALUATE_WITH_DUAL_REFERENCE_INTEL:
				return OpSubgroupAvcSicEvaluateWithDualReferenceINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_EVALUATE_WITH_MULTI_REFERENCE_INTEL:
				return OpSubgroupAvcSicEvaluateWithMultiReferenceINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_EVALUATE_WITH_MULTI_REFERENCE_INTERLACED_INTEL:
				return OpSubgroupAvcSicEvaluateWithMultiReferenceInterlacedINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_CONVERT_TO_MCE_RESULT_INTEL:
				return OpSubgroupAvcSicConvertToMceResultINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_GET_IPE_LUMA_SHAPE_INTEL:
				return OpSubgroupAvcSicGetIpeLumaShapeINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_GET_BEST_IPE_LUMA_DISTORTION_INTEL:
				return OpSubgroupAvcSicGetBestIpeLumaDistortionINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_GET_BEST_IPE_CHROMA_DISTORTION_INTEL:
				return OpSubgroupAvcSicGetBestIpeChromaDistortionINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_GET_PACKED_IPE_LUMA_MODES_INTEL:
				return OpSubgroupAvcSicGetPackedIpeLumaModesINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_GET_IPE_CHROMA_MODE_INTEL:
				return OpSubgroupAvcSicGetIpeChromaModeINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_GET_PACKED_SKC_LUMA_COUNT_THRESHOLD_INTEL:
				return OpSubgroupAvcSicGetPackedSkcLumaCountThresholdINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_GET_PACKED_SKC_LUMA_SUM_THRESHOLD_INTEL:
				return OpSubgroupAvcSicGetPackedSkcLumaSumThresholdINTEL;
			case Main.OP_SUBGROUP_AVC_SIC_GET_INTER_RAW_SADS_INTEL:
				return OpSubgroupAvcSicGetInterRawSadsINTEL;
			case Main.OP_LOOP_CONTROL_INTEL:
				return OpLoopControlINTEL;
			case Main.OP_READ_PIPE_BLOCKING_INTEL:
				return OpReadPipeBlockingINTEL;
			case Main.OP_WRITE_PIPE_BLOCKING_INTEL:
				return OpWritePipeBlockingINTEL;
			case Main.OP_FPGA_REG_INTEL:
				return OpFPGARegINTEL;
			case Main.OP_RAY_QUERY_GET_RAYTMIN_KHR:
				return OpRayQueryGetRayTMinKHR;
			case Main.OP_RAY_QUERY_GET_RAYFLAGS_KHR:
				return OpRayQueryGetRayFlagsKHR;
			case Main.OP_RAY_QUERY_GET_INTERSECTION_T_KHR:
				return OpRayQueryGetIntersectionTKHR;
			case Main.OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_CUSTOM_INDEX_KHR:
				return OpRayQueryGetIntersectionInstanceCustomIndexKHR;
			case Main.OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_ID_KHR:
				return OpRayQueryGetIntersectionInstanceIdKHR;
			case Main.OP_RAY_QUERY_GET_INTERSECTION_INSTANCE_SHADER_BINDING_TABLE_RECORD_OFFSET_KHR:
				return OpRayQueryGetIntersectionInstanceShaderBindingTableRecordOffsetKHR;
			case Main.OP_RAY_QUERY_GET_INTERSECTION_GEOMETRY_INDEX_KHR:
				return OpRayQueryGetIntersectionGeometryIndexKHR;
			case Main.OP_RAY_QUERY_GET_INTERSECTION_PRIMITIVE_INDEX_KHR:
				return OpRayQueryGetIntersectionPrimitiveIndexKHR;
			case Main.OP_RAY_QUERY_GET_INTERSECTION_BARYCENTRICS_KHR:
				return OpRayQueryGetIntersectionBarycentricsKHR;
			case Main.OP_RAY_QUERY_GET_INTERSECTION_FRONT_FACE_KHR:
				return OpRayQueryGetIntersectionFrontFaceKHR;
			case Main.OP_RAY_QUERY_GET_INTERSECTION_CANDIDATE_AABB_OPAQUE_KHR:
				return OpRayQueryGetIntersectionCandidateAABBOpaqueKHR;
			case Main.OP_RAY_QUERY_GET_INTERSECTION_OBJECT_RAY_DIRECTION_KHR:
				return OpRayQueryGetIntersectionObjectRayDirectionKHR;
			case Main.OP_RAY_QUERY_GET_INTERSECTION_OBJECT_RAY_ORIGIN_KHR:
				return OpRayQueryGetIntersectionObjectRayOriginKHR;
			case Main.OP_RAY_QUERY_GET_WORLD_RAY_DIRECTION_KHR:
				return OpRayQueryGetWorldRayDirectionKHR;
			case Main.OP_RAY_QUERY_GET_WORLD_RAY_ORIGIN_KHR:
				return OpRayQueryGetWorldRayOriginKHR;
			case Main.OP_RAY_QUERY_GET_INTERSECTION_OBJECT_TO_WORLD_KHR:
				return OpRayQueryGetIntersectionObjectToWorldKHR;
			case Main.OP_RAY_QUERY_GET_INTERSECTION_WORLD_TO_OBJECT_KHR:
				return OpRayQueryGetIntersectionWorldToObjectKHR;
			case Main.OP_ATOMIC_F_ADD_EXT:
				return OpAtomicFAddEXT;
			case Main.OP_MAX:
				return OpMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
