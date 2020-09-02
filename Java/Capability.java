package Java;

public enum Capability {
	CapabilityMatrix(Main.CAPABILITY_MATRIX),
	CapabilityShader(Main.CAPABILITY_SHADER),
	CapabilityGeometry(Main.CAPABILITY_GEOMETRY),
	CapabilityTessellation(Main.CAPABILITY_TESSELLATION),
	CapabilityAddresses(Main.CAPABILITY_ADDRESSES),
	CapabilityLinkage(Main.CAPABILITY_LINKAGE),
	CapabilityKernel(Main.CAPABILITY_KERNEL),
	CapabilityVector16(Main.CAPABILITY_VECTOR16),
	CapabilityFloat16Buffer(Main.CAPABILITY_FLOAT16_BUFFER),
	CapabilityFloat16(Main.CAPABILITY_FLOAT16),
	CapabilityFloat64(Main.CAPABILITY_FLOAT64),
	CapabilityInt64(Main.CAPABILITY_INT64),
	CapabilityInt64Atomics(Main.CAPABILITY_INT64_ATOMICS),
	CapabilityImageBasic(Main.CAPABILITY_IMAGE_BASIC),
	CapabilityImageReadWrite(Main.CAPABILITY_IMAGE_READ_WRITE),
	CapabilityImageMipmap(Main.CAPABILITY_IMAGE_MIPMAP),
	CapabilityPipes(Main.CAPABILITY_PIPES),
	CapabilityGroups(Main.CAPABILITY_GROUPS),
	CapabilityDeviceEnqueue(Main.CAPABILITY_DEVICE_ENQUEUE),
	CapabilityLiteralSampler(Main.CAPABILITY_LITERAL_SAMPLER),
	CapabilityAtomicStorage(Main.CAPABILITY_ATOMIC_STORAGE),
	CapabilityInt16(Main.CAPABILITY_INT16),
	CapabilityTessellationPointSize(Main.CAPABILITY_TESSELLATION_POINT_SIZE),
	CapabilityGeometryPointSize(Main.CAPABILITY_GEOMETRY_POINT_SIZE),
	CapabilityImageGatherExtended(Main.CAPABILITY_IMAGE_GATHER_EXTENDED),
	CapabilityStorageImageMultisample(Main.CAPABILITY_STORAGE_IMAGE_MULTISAMPLE),
	CapabilityUniformBufferArrayDynamicIndexing(Main.CAPABILITY_UNIFORM_BUFFER_ARRAY_DYNAMIC_INDEXING),
	CapabilitySampledImageArrayDynamicIndexing(Main.CAPABILITY_SAMPLED_IMAGE_ARRAY_DYNAMIC_INDEXING),
	CapabilityStorageBufferArrayDynamicIndexing(Main.CAPABILITY_STORAGE_BUFFER_ARRAY_DYNAMIC_INDEXING),
	CapabilityStorageImageArrayDynamicIndexing(Main.CAPABILITY_STORAGE_IMAGE_ARRAY_DYNAMIC_INDEXING),
	CapabilityClipDistance(Main.CAPABILITY_CLIP_DISTANCE),
	CapabilityCullDistance(Main.CAPABILITY_CULL_DISTANCE),
	CapabilityImageCubeArray(Main.CAPABILITY_IMAGE_CUBE_ARRAY),
	CapabilitySampleRateShading(Main.CAPABILITY_SAMPLE_RATE_SHADING),
	CapabilityImageRect(Main.CAPABILITY_IMAGE_RECT),
	CapabilitySampledRect(Main.CAPABILITY_SAMPLED_RECT),
	CapabilityGenericPointer(Main.CAPABILITY_GENERIC_POINTER),
	CapabilityInt8(Main.CAPABILITY_INT8),
	CapabilityInputAttachment(Main.CAPABILITY_INPUT_ATTACHMENT),
	CapabilitySparseResidency(Main.CAPABILITY_SPARSE_RESIDENCY),
	CapabilityMinLod(Main.CAPABILITY_MIN_LOD),
	CapabilitySampled1D(Main.CAPABILITY_SAMPLED1D),
	CapabilityImage1D(Main.CAPABILITY_IMAGE1D),
	CapabilitySampledCubeArray(Main.CAPABILITY_SAMPLED_CUBE_ARRAY),
	CapabilitySampledBuffer(Main.CAPABILITY_SAMPLED_BUFFER),
	CapabilityImageBuffer(Main.CAPABILITY_IMAGE_BUFFER),
	CapabilityImageMSArray(Main.CAPABILITY_IMAGE_MS_ARRAY),
	CapabilityStorageImageExtendedFormats(Main.CAPABILITY_STORAGE_IMAGE_EXTENDED_FORMATS),
	CapabilityImageQuery(Main.CAPABILITY_IMAGE_QUERY),
	CapabilityDerivativeControl(Main.CAPABILITY_DERIVATIVE_CONTROL),
	CapabilityInterpolationFunction(Main.CAPABILITY_INTERPOLATION_FUNCTION),
	CapabilityTransformFeedback(Main.CAPABILITY_TRANSFORM_FEEDBACK),
	CapabilityGeometryStreams(Main.CAPABILITY_GEOMETRY_STREAMS),
	CapabilityStorageImageReadWithoutFormat(Main.CAPABILITY_STORAGE_IMAGE_READ_WITHOUT_FORMAT),
	CapabilityStorageImageWriteWithoutFormat(Main.CAPABILITY_STORAGE_IMAGE_WRITE_WITHOUT_FORMAT),
	CapabilityMultiViewport(Main.CAPABILITY_MULTI_VIEWPORT),
	CapabilitySubgroupDispatch(Main.CAPABILITY_SUBGROUP_DISPATCH),
	CapabilityNamedBarrier(Main.CAPABILITY_NAMED_BARRIER),
	CapabilityPipeStorage(Main.CAPABILITY_PIPE_STORAGE),
	CapabilityGroupNonUniform(Main.CAPABILITY_GROUP_NON_UNIFORM),
	CapabilityGroupNonUniformVote(Main.CAPABILITY_GROUP_NON_UNIFORM_VOTE),
	CapabilityGroupNonUniformArithmetic(Main.CAPABILITY_GROUP_NON_UNIFORM_ARITHMETIC),
	CapabilityGroupNonUniformBallot(Main.CAPABILITY_GROUP_NON_UNIFORM_BALLOT),
	CapabilityGroupNonUniformShuffle(Main.CAPABILITY_GROUP_NON_UNIFORM_SHUFFLE),
	CapabilityGroupNonUniformShuffleRelative(Main.CAPABILITY_GROUP_NON_UNIFORM_SHUFFLE_RELATIVE),
	CapabilityGroupNonUniformClustered(Main.CAPABILITY_GROUP_NON_UNIFORM_CLUSTERED),
	CapabilityGroupNonUniformQuad(Main.CAPABILITY_GROUP_NON_UNIFORM_QUAD),
	CapabilityShaderLayer(Main.CAPABILITY_SHADER_LAYER),
	CapabilityShaderViewportIndex(Main.CAPABILITY_SHADER_VIEWPORT_INDEX),
	CapabilitySubgroupBallotKHR(Main.CAPABILITY_SUBGROUP_BALLOT_KHR),
	CapabilityDrawParameters(Main.CAPABILITY_DRAW_PARAMETERS),
	CapabilitySubgroupVoteKHR(Main.CAPABILITY_SUBGROUP_VOTE_KHR),
	CapabilityStorageBuffer16BitAccess(Main.CAPABILITY_STORAGE_BUFFER_16BIT_ACCESS),
	CapabilityStorageUniformBufferBlock16(Main.CAPABILITY_STORAGE_UNIFORM_BUFFER_BLOCK_16),
	CapabilityStorageUniform16(Main.CAPABILITY_STORAGE_UNIFORM_16),
	CapabilityUniformAndStorageBuffer16BitAccess(Main.CAPABILITY_UNIFORM_AND_STORAGE_BUFFER_16BIT_ACCESS),
	CapabilityStoragePushConstant16(Main.CAPABILITY_STORAGE_PUSH_CONSTANT_16),
	CapabilityStorageInputOutput16(Main.CAPABILITY_STORAGE_INPUT_OUTPUT_16),
	CapabilityDeviceGroup(Main.CAPABILITY_DEVICE_GROUP),
	CapabilityMultiView(Main.CAPABILITY_MULTI_VIEW),
	CapabilityVariablePointersStorageBuffer(Main.CAPABILITY_VARIABLE_POINTERS_STORAGE_BUFFER),
	CapabilityVariablePointers(Main.CAPABILITY_VARIABLE_POINTERS),
	CapabilityAtomicStorageOps(Main.CAPABILITY_ATOMIC_STORAGE_OPS),
	CapabilitySampleMaskPostDepthCoverage(Main.CAPABILITY_SAMPLE_MASK_POST_DEPTH_COVERAGE),
	CapabilityStorageBuffer8BitAccess(Main.CAPABILITY_STORAGE_BUFFER_8BIT_ACCESS),
	CapabilityUniformAndStorageBuffer8BitAccess(Main.CAPABILITY_UNIFORM_AND_STORAGE_BUFFER_8BIT_ACCESS),
	CapabilityStoragePushConstant8(Main.CAPABILITY_STORAGE_PUSH_CONSTANT_8),
	CapabilityDenormPreserve(Main.CAPABILITY_DENORM_PRESERVE),
	CapabilityDenormFlushToZero(Main.CAPABILITY_DENORM_FLUSH_TO_ZERO),
	CapabilitySignedZeroInfNanPreserve(Main.CAPABILITY_SIGNED_ZERO_INF_NAN_PRESERVE),
	CapabilityRoundingModeRTE(Main.CAPABILITY_ROUNDING_MODE_RTE),
	CapabilityRoundingModeRTZ(Main.CAPABILITY_ROUNDING_MODE_RTZ),
	CapabilityRayQueryProvisionalKHR(Main.CAPABILITY_RAY_QUERY_PROVISIONAL_KHR),
	CapabilityRayTraversalPrimitiveCullingProvisionalKHR(
			Main.CAPABILITY_RAY_TRAVERSAL_PRIMITIVE_CULLING_PROVISIONAL_KHR),
	CapabilityFloat16ImageAMD(Main.CAPABILITY_FLOAT16_IMAGE_AMD),
	CapabilityImageGatherBiasLodAMD(Main.CAPABILITY_IMAGE_GATHER_BIAS_LOD_AMD),
	CapabilityFragmentMaskAMD(Main.CAPABILITY_FRAGMENT_MASK_AMD),
	CapabilityStencilExportEXT(Main.CAPABILITY_STENCIL_EXPORT_EXT),
	CapabilityImageReadWriteLodAMD(Main.CAPABILITY_IMAGE_READ_WRITE_LOD_AMD),
	CapabilityShaderClockKHR(Main.CAPABILITY_SHADER_CLOCK_KHR),
	CapabilitySampleMaskOverrideCoverageNV(Main.CAPABILITY_SAMPLE_MASK_OVERRIDE_COVERAGE_NV),
	CapabilityGeometryShaderPassthroughNV(Main.CAPABILITY_GEOMETRY_SHADER_PASSTHROUGH_NV),
	CapabilityShaderViewportIndexLayerEXT(Main.CAPABILITY_SHADER_VIEWPORT_INDEX_LAYER_EXT),
	CapabilityShaderViewportIndexLayerNV(Main.CAPABILITY_SHADER_VIEWPORT_INDEX_LAYER_NV),
	CapabilityShaderViewportMaskNV(Main.CAPABILITY_SHADER_VIEWPORT_MASK_NV),
	CapabilityShaderStereoViewNV(Main.CAPABILITY_SHADER_STEREO_VIEW_NV),
	CapabilityPerViewAttributesNV(Main.CAPABILITY_PER_VIEW_ATTRIBUTES_NV),
	CapabilityFragmentFullyCoveredEXT(Main.CAPABILITY_FRAGMENT_FULLY_COVERED_EXT),
	CapabilityMeshShadingNV(Main.CAPABILITY_MESH_SHADING_NV),
	CapabilityImageFootprintNV(Main.CAPABILITY_IMAGE_FOOTPRINT_NV),
	CapabilityFragmentBarycentricNV(Main.CAPABILITY_FRAGMENT_BARYCENTRIC_NV),
	CapabilityComputeDerivativeGroupQuadsNV(Main.CAPABILITY_COMPUTE_DERIVATIVE_GROUP_QUADS_NV),
	CapabilityFragmentDensityEXT(Main.CAPABILITY_FRAGMENT_DENSITY_EXT),
	CapabilityShadingRateNV(Main.CAPABILITY_SHADING_RATE_NV),
	CapabilityGroupNonUniformPartitionedNV(Main.CAPABILITY_GROUP_NON_UNIFORM_PARTITIONED_NV),
	CapabilityShaderNonUniform(Main.CAPABILITY_SHADER_NON_UNIFORM),
	CapabilityShaderNonUniformEXT(Main.CAPABILITY_SHADER_NON_UNIFORM_EXT),
	CapabilityRuntimeDescriptorArray(Main.CAPABILITY_RUNTIME_DESCRIPTOR_ARRAY),
	CapabilityRuntimeDescriptorArrayEXT(Main.CAPABILITY_RUNTIME_DESCRIPTOR_ARRAY_EXT),
	CapabilityInputAttachmentArrayDynamicIndexing(Main.CAPABILITY_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING),
	CapabilityInputAttachmentArrayDynamicIndexingEXT(Main.CAPABILITY_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING_EXT),
	CapabilityUniformTexelBufferArrayDynamicIndexing(Main.CAPABILITY_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING),
	CapabilityUniformTexelBufferArrayDynamicIndexingEXT(
			Main.CAPABILITY_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_EXT),
	CapabilityStorageTexelBufferArrayDynamicIndexing(Main.CAPABILITY_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING),
	CapabilityStorageTexelBufferArrayDynamicIndexingEXT(
			Main.CAPABILITY_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_EXT),
	CapabilityUniformBufferArrayNonUniformIndexing(Main.CAPABILITY_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING),
	CapabilityUniformBufferArrayNonUniformIndexingEXT(Main.CAPABILITY_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_EXT),
	CapabilitySampledImageArrayNonUniformIndexing(Main.CAPABILITY_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING),
	CapabilitySampledImageArrayNonUniformIndexingEXT(Main.CAPABILITY_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_EXT),
	CapabilityStorageBufferArrayNonUniformIndexing(Main.CAPABILITY_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING),
	CapabilityStorageBufferArrayNonUniformIndexingEXT(Main.CAPABILITY_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_EXT),
	CapabilityStorageImageArrayNonUniformIndexing(Main.CAPABILITY_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING),
	CapabilityStorageImageArrayNonUniformIndexingEXT(Main.CAPABILITY_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_EXT),
	CapabilityInputAttachmentArrayNonUniformIndexing(Main.CAPABILITY_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING),
	CapabilityInputAttachmentArrayNonUniformIndexingEXT(
			Main.CAPABILITY_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_EXT),
	CapabilityUniformTexelBufferArrayNonUniformIndexing(
			Main.CAPABILITY_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING),
	CapabilityUniformTexelBufferArrayNonUniformIndexingEXT(
			Main.CAPABILITY_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_EXT),
	CapabilityStorageTexelBufferArrayNonUniformIndexing(
			Main.CAPABILITY_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING),
	CapabilityStorageTexelBufferArrayNonUniformIndexingEXT(
			Main.CAPABILITY_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_EXT),
	CapabilityRayTracingNV(Main.CAPABILITY_RAY_TRACING_NV),
	CapabilityVulkanMemoryModel(Main.CAPABILITY_VULKAN_MEMORY_MODEL),
	CapabilityVulkanMemoryModelKHR(Main.CAPABILITY_VULKAN_MEMORY_MODEL_KHR),
	CapabilityVulkanMemoryModelDeviceScope(Main.CAPABILITY_VULKAN_MEMORY_MODEL_DEVICE_SCOPE),
	CapabilityVulkanMemoryModelDeviceScopeKHR(Main.CAPABILITY_VULKAN_MEMORY_MODEL_DEVICE_SCOPE_KHR),
	CapabilityPhysicalStorageBufferAddresses(Main.CAPABILITY_PHYSICAL_STORAGE_BUFFER_ADDRESSES),
	CapabilityPhysicalStorageBufferAddressesEXT(Main.CAPABILITY_PHYSICAL_STORAGE_BUFFER_ADDRESSES_EXT),
	CapabilityComputeDerivativeGroupLinearNV(Main.CAPABILITY_COMPUTE_DERIVATIVE_GROUP_LINEAR_NV),
	CapabilityRayTracingProvisionalKHR(Main.CAPABILITY_RAY_TRACING_PROVISIONAL_KHR),
	CapabilityCooperativeMatrixNV(Main.CAPABILITY_COOPERATIVE_MATRIX_NV),
	CapabilityFragmentShaderSampleInterlockEXT(Main.CAPABILITY_FRAGMENT_SHADER_SAMPLE_INTERLOCK_EXT),
	CapabilityFragmentShaderShadingRateInterlockEXT(Main.CAPABILITY_FRAGMENT_SHADER_SHADING_RATE_INTERLOCK_EXT),
	CapabilityShaderSMBuiltinsNV(Main.CAPABILITY_SHADER_SM_BUILTINS_NV),
	CapabilityFragmentShaderPixelInterlockEXT(Main.CAPABILITY_FRAGMENT_SHADER_PIXEL_INTERLOCK_EXT),
	CapabilityDemoteToHelperInvocationEXT(Main.CAPABILITY_DEMOTE_TO_HELPER_INVOCATION_EXT),
	CapabilitySubgroupShuffleINTEL(Main.CAPABILITY_SUBGROUP_SHUFFLE_INTEL),
	CapabilitySubgroupBufferBlockIOINTEL(Main.CAPABILITY_SUBGROUP_BUFFER_BLOCK_IO_INTEL),
	CapabilitySubgroupImageBlockIOINTEL(Main.CAPABILITY_SUBGROUP_IMAGE_BLOCK_IO_INTEL),
	CapabilitySubgroupImageMediaBlockIOINTEL(Main.CAPABILITY_SUBGROUP_IMAGE_MEDIA_BLOCK_IO_INTEL),
	CapabilityIntegerFunctions2INTEL(Main.CAPABILITY_INTEGER_FUNCTIONS2_INTEL),
	CapabilityFunctionPointersINTEL(Main.CAPABILITY_FUNCTION_POINTERS_INTEL),
	CapabilityIndirectReferencesINTEL(Main.CAPABILITY_INDIRECT_REFERENCES_INTEL),
	CapabilitySubgroupAvcMotionEstimationINTEL(Main.CAPABILITY_SUBGROUP_AVC_MOTION_ESTIMATION_INTEL),
	CapabilitySubgroupAvcMotionEstimationIntraINTEL(Main.CAPABILITY_SUBGROUP_AVC_MOTION_ESTIMATION_INTRA_INTEL),
	CapabilitySubgroupAvcMotionEstimationChromaINTEL(Main.CAPABILITY_SUBGROUP_AVC_MOTION_ESTIMATION_CHROMA_INTEL),
	CapabilityFPGAMemoryAttributesINTEL(Main.CAPABILITY_FPGA_MEMORY_ATTRIBUTES_INTEL),
	CapabilityUnstructuredLoopControlsINTEL(Main.CAPABILITY_UNSTRUCTURED_LOOP_CONTROLS_INTEL),
	CapabilityFPGALoopControlsINTEL(Main.CAPABILITY_FPGA_LOOP_CONTROLS_INTEL),
	CapabilityKernelAttributesINTEL(Main.CAPABILITY_KERNEL_ATTRIBUTES_INTEL),
	CapabilityFPGAKernelAttributesINTEL(Main.CAPABILITY_FPGA_KERNEL_ATTRIBUTES_INTEL),
	CapabilityBlockingPipesINTEL(Main.CAPABILITY_BLOCKING_PIPES_INTEL),
	CapabilityFPGARegINTEL(Main.CAPABILITY_FPGA_REG_INTEL),
	CapabilityAtomicFloat32AddEXT(Main.CAPABILITY_ATOMIC_FLOAT32_ADD_EXT),
	CapabilityAtomicFloat64AddEXT(Main.CAPABILITY_ATOMIC_FLOAT64_ADD_EXT),
	CapabilityMax(Main.CAPABILITY_MAX);

	private final int value;

	private Capability(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static Capability valueByStr(String str) {
		switch (str) {
			case "CapabilityMatrix":
				return CapabilityMatrix;
			case "CapabilityShader":
				return CapabilityShader;
			case "CapabilityGeometry":
				return CapabilityGeometry;
			case "CapabilityTessellation":
				return CapabilityTessellation;
			case "CapabilityAddresses":
				return CapabilityAddresses;
			case "CapabilityLinkage":
				return CapabilityLinkage;
			case "CapabilityKernel":
				return CapabilityKernel;
			case "CapabilityVector16":
				return CapabilityVector16;
			case "CapabilityFloat16Buffer":
				return CapabilityFloat16Buffer;
			case "CapabilityFloat16":
				return CapabilityFloat16;
			case "CapabilityFloat64":
				return CapabilityFloat64;
			case "CapabilityInt64":
				return CapabilityInt64;
			case "CapabilityInt64Atomics":
				return CapabilityInt64Atomics;
			case "CapabilityImageBasic":
				return CapabilityImageBasic;
			case "CapabilityImageReadWrite":
				return CapabilityImageReadWrite;
			case "CapabilityImageMipmap":
				return CapabilityImageMipmap;
			case "CapabilityPipes":
				return CapabilityPipes;
			case "CapabilityGroups":
				return CapabilityGroups;
			case "CapabilityDeviceEnqueue":
				return CapabilityDeviceEnqueue;
			case "CapabilityLiteralSampler":
				return CapabilityLiteralSampler;
			case "CapabilityAtomicStorage":
				return CapabilityAtomicStorage;
			case "CapabilityInt16":
				return CapabilityInt16;
			case "CapabilityTessellationPointSize":
				return CapabilityTessellationPointSize;
			case "CapabilityGeometryPointSize":
				return CapabilityGeometryPointSize;
			case "CapabilityImageGatherExtended":
				return CapabilityImageGatherExtended;
			case "CapabilityStorageImageMultisample":
				return CapabilityStorageImageMultisample;
			case "CapabilityUniformBufferArrayDynamicIndexing":
				return CapabilityUniformBufferArrayDynamicIndexing;
			case "CapabilitySampledImageArrayDynamicIndexing":
				return CapabilitySampledImageArrayDynamicIndexing;
			case "CapabilityStorageBufferArrayDynamicIndexing":
				return CapabilityStorageBufferArrayDynamicIndexing;
			case "CapabilityStorageImageArrayDynamicIndexing":
				return CapabilityStorageImageArrayDynamicIndexing;
			case "CapabilityClipDistance":
				return CapabilityClipDistance;
			case "CapabilityCullDistance":
				return CapabilityCullDistance;
			case "CapabilityImageCubeArray":
				return CapabilityImageCubeArray;
			case "CapabilitySampleRateShading":
				return CapabilitySampleRateShading;
			case "CapabilityImageRect":
				return CapabilityImageRect;
			case "CapabilitySampledRect":
				return CapabilitySampledRect;
			case "CapabilityGenericPointer":
				return CapabilityGenericPointer;
			case "CapabilityInt8":
				return CapabilityInt8;
			case "CapabilityInputAttachment":
				return CapabilityInputAttachment;
			case "CapabilitySparseResidency":
				return CapabilitySparseResidency;
			case "CapabilityMinLod":
				return CapabilityMinLod;
			case "CapabilitySampled1D":
				return CapabilitySampled1D;
			case "CapabilityImage1D":
				return CapabilityImage1D;
			case "CapabilitySampledCubeArray":
				return CapabilitySampledCubeArray;
			case "CapabilitySampledBuffer":
				return CapabilitySampledBuffer;
			case "CapabilityImageBuffer":
				return CapabilityImageBuffer;
			case "CapabilityImageMSArray":
				return CapabilityImageMSArray;
			case "CapabilityStorageImageExtendedFormats":
				return CapabilityStorageImageExtendedFormats;
			case "CapabilityImageQuery":
				return CapabilityImageQuery;
			case "CapabilityDerivativeControl":
				return CapabilityDerivativeControl;
			case "CapabilityInterpolationFunction":
				return CapabilityInterpolationFunction;
			case "CapabilityTransformFeedback":
				return CapabilityTransformFeedback;
			case "CapabilityGeometryStreams":
				return CapabilityGeometryStreams;
			case "CapabilityStorageImageReadWithoutFormat":
				return CapabilityStorageImageReadWithoutFormat;
			case "CapabilityStorageImageWriteWithoutFormat":
				return CapabilityStorageImageWriteWithoutFormat;
			case "CapabilityMultiViewport":
				return CapabilityMultiViewport;
			case "CapabilitySubgroupDispatch":
				return CapabilitySubgroupDispatch;
			case "CapabilityNamedBarrier":
				return CapabilityNamedBarrier;
			case "CapabilityPipeStorage":
				return CapabilityPipeStorage;
			case "CapabilityGroupNonUniform":
				return CapabilityGroupNonUniform;
			case "CapabilityGroupNonUniformVote":
				return CapabilityGroupNonUniformVote;
			case "CapabilityGroupNonUniformArithmetic":
				return CapabilityGroupNonUniformArithmetic;
			case "CapabilityGroupNonUniformBallot":
				return CapabilityGroupNonUniformBallot;
			case "CapabilityGroupNonUniformShuffle":
				return CapabilityGroupNonUniformShuffle;
			case "CapabilityGroupNonUniformShuffleRelative":
				return CapabilityGroupNonUniformShuffleRelative;
			case "CapabilityGroupNonUniformClustered":
				return CapabilityGroupNonUniformClustered;
			case "CapabilityGroupNonUniformQuad":
				return CapabilityGroupNonUniformQuad;
			case "CapabilityShaderLayer":
				return CapabilityShaderLayer;
			case "CapabilityShaderViewportIndex":
				return CapabilityShaderViewportIndex;
			case "CapabilitySubgroupBallotKHR":
				return CapabilitySubgroupBallotKHR;
			case "CapabilityDrawParameters":
				return CapabilityDrawParameters;
			case "CapabilitySubgroupVoteKHR":
				return CapabilitySubgroupVoteKHR;
			case "CapabilityStorageBuffer16BitAccess":
				return CapabilityStorageBuffer16BitAccess;
			case "CapabilityStorageUniformBufferBlock16":
				return CapabilityStorageUniformBufferBlock16;
			case "CapabilityStorageUniform16":
				return CapabilityStorageUniform16;
			case "CapabilityUniformAndStorageBuffer16BitAccess":
				return CapabilityUniformAndStorageBuffer16BitAccess;
			case "CapabilityStoragePushConstant16":
				return CapabilityStoragePushConstant16;
			case "CapabilityStorageInputOutput16":
				return CapabilityStorageInputOutput16;
			case "CapabilityDeviceGroup":
				return CapabilityDeviceGroup;
			case "CapabilityMultiView":
				return CapabilityMultiView;
			case "CapabilityVariablePointersStorageBuffer":
				return CapabilityVariablePointersStorageBuffer;
			case "CapabilityVariablePointers":
				return CapabilityVariablePointers;
			case "CapabilityAtomicStorageOps":
				return CapabilityAtomicStorageOps;
			case "CapabilitySampleMaskPostDepthCoverage":
				return CapabilitySampleMaskPostDepthCoverage;
			case "CapabilityStorageBuffer8BitAccess":
				return CapabilityStorageBuffer8BitAccess;
			case "CapabilityUniformAndStorageBuffer8BitAccess":
				return CapabilityUniformAndStorageBuffer8BitAccess;
			case "CapabilityStoragePushConstant8":
				return CapabilityStoragePushConstant8;
			case "CapabilityDenormPreserve":
				return CapabilityDenormPreserve;
			case "CapabilityDenormFlushToZero":
				return CapabilityDenormFlushToZero;
			case "CapabilitySignedZeroInfNanPreserve":
				return CapabilitySignedZeroInfNanPreserve;
			case "CapabilityRoundingModeRTE":
				return CapabilityRoundingModeRTE;
			case "CapabilityRoundingModeRTZ":
				return CapabilityRoundingModeRTZ;
			case "CapabilityRayQueryProvisionalKHR":
				return CapabilityRayQueryProvisionalKHR;
			case "CapabilityRayTraversalPrimitiveCullingProvisionalKHR":
				return CapabilityRayTraversalPrimitiveCullingProvisionalKHR;
			case "CapabilityFloat16ImageAMD":
				return CapabilityFloat16ImageAMD;
			case "CapabilityImageGatherBiasLodAMD":
				return CapabilityImageGatherBiasLodAMD;
			case "CapabilityFragmentMaskAMD":
				return CapabilityFragmentMaskAMD;
			case "CapabilityStencilExportEXT":
				return CapabilityStencilExportEXT;
			case "CapabilityImageReadWriteLodAMD":
				return CapabilityImageReadWriteLodAMD;
			case "CapabilityShaderClockKHR":
				return CapabilityShaderClockKHR;
			case "CapabilitySampleMaskOverrideCoverageNV":
				return CapabilitySampleMaskOverrideCoverageNV;
			case "CapabilityGeometryShaderPassthroughNV":
				return CapabilityGeometryShaderPassthroughNV;
			case "CapabilityShaderViewportIndexLayerEXT":
				return CapabilityShaderViewportIndexLayerEXT;
			case "CapabilityShaderViewportIndexLayerNV":
				return CapabilityShaderViewportIndexLayerNV;
			case "CapabilityShaderViewportMaskNV":
				return CapabilityShaderViewportMaskNV;
			case "CapabilityShaderStereoViewNV":
				return CapabilityShaderStereoViewNV;
			case "CapabilityPerViewAttributesNV":
				return CapabilityPerViewAttributesNV;
			case "CapabilityFragmentFullyCoveredEXT":
				return CapabilityFragmentFullyCoveredEXT;
			case "CapabilityMeshShadingNV":
				return CapabilityMeshShadingNV;
			case "CapabilityImageFootprintNV":
				return CapabilityImageFootprintNV;
			case "CapabilityFragmentBarycentricNV":
				return CapabilityFragmentBarycentricNV;
			case "CapabilityComputeDerivativeGroupQuadsNV":
				return CapabilityComputeDerivativeGroupQuadsNV;
			case "CapabilityFragmentDensityEXT":
				return CapabilityFragmentDensityEXT;
			case "CapabilityShadingRateNV":
				return CapabilityShadingRateNV;
			case "CapabilityGroupNonUniformPartitionedNV":
				return CapabilityGroupNonUniformPartitionedNV;
			case "CapabilityShaderNonUniform":
				return CapabilityShaderNonUniform;
			case "CapabilityShaderNonUniformEXT":
				return CapabilityShaderNonUniformEXT;
			case "CapabilityRuntimeDescriptorArray":
				return CapabilityRuntimeDescriptorArray;
			case "CapabilityRuntimeDescriptorArrayEXT":
				return CapabilityRuntimeDescriptorArrayEXT;
			case "CapabilityInputAttachmentArrayDynamicIndexing":
				return CapabilityInputAttachmentArrayDynamicIndexing;
			case "CapabilityInputAttachmentArrayDynamicIndexingEXT":
				return CapabilityInputAttachmentArrayDynamicIndexingEXT;
			case "CapabilityUniformTexelBufferArrayDynamicIndexing":
				return CapabilityUniformTexelBufferArrayDynamicIndexing;
			case "CapabilityUniformTexelBufferArrayDynamicIndexingEXT":
				return CapabilityUniformTexelBufferArrayDynamicIndexingEXT;
			case "CapabilityStorageTexelBufferArrayDynamicIndexing":
				return CapabilityStorageTexelBufferArrayDynamicIndexing;
			case "CapabilityStorageTexelBufferArrayDynamicIndexingEXT":
				return CapabilityStorageTexelBufferArrayDynamicIndexingEXT;
			case "CapabilityUniformBufferArrayNonUniformIndexing":
				return CapabilityUniformBufferArrayNonUniformIndexing;
			case "CapabilityUniformBufferArrayNonUniformIndexingEXT":
				return CapabilityUniformBufferArrayNonUniformIndexingEXT;
			case "CapabilitySampledImageArrayNonUniformIndexing":
				return CapabilitySampledImageArrayNonUniformIndexing;
			case "CapabilitySampledImageArrayNonUniformIndexingEXT":
				return CapabilitySampledImageArrayNonUniformIndexingEXT;
			case "CapabilityStorageBufferArrayNonUniformIndexing":
				return CapabilityStorageBufferArrayNonUniformIndexing;
			case "CapabilityStorageBufferArrayNonUniformIndexingEXT":
				return CapabilityStorageBufferArrayNonUniformIndexingEXT;
			case "CapabilityStorageImageArrayNonUniformIndexing":
				return CapabilityStorageImageArrayNonUniformIndexing;
			case "CapabilityStorageImageArrayNonUniformIndexingEXT":
				return CapabilityStorageImageArrayNonUniformIndexingEXT;
			case "CapabilityInputAttachmentArrayNonUniformIndexing":
				return CapabilityInputAttachmentArrayNonUniformIndexing;
			case "CapabilityInputAttachmentArrayNonUniformIndexingEXT":
				return CapabilityInputAttachmentArrayNonUniformIndexingEXT;
			case "CapabilityUniformTexelBufferArrayNonUniformIndexing":
				return CapabilityUniformTexelBufferArrayNonUniformIndexing;
			case "CapabilityUniformTexelBufferArrayNonUniformIndexingEXT":
				return CapabilityUniformTexelBufferArrayNonUniformIndexingEXT;
			case "CapabilityStorageTexelBufferArrayNonUniformIndexing":
				return CapabilityStorageTexelBufferArrayNonUniformIndexing;
			case "CapabilityStorageTexelBufferArrayNonUniformIndexingEXT":
				return CapabilityStorageTexelBufferArrayNonUniformIndexingEXT;
			case "CapabilityRayTracingNV":
				return CapabilityRayTracingNV;
			case "CapabilityVulkanMemoryModel":
				return CapabilityVulkanMemoryModel;
			case "CapabilityVulkanMemoryModelKHR":
				return CapabilityVulkanMemoryModelKHR;
			case "CapabilityVulkanMemoryModelDeviceScope":
				return CapabilityVulkanMemoryModelDeviceScope;
			case "CapabilityVulkanMemoryModelDeviceScopeKHR":
				return CapabilityVulkanMemoryModelDeviceScopeKHR;
			case "CapabilityPhysicalStorageBufferAddresses":
				return CapabilityPhysicalStorageBufferAddresses;
			case "CapabilityPhysicalStorageBufferAddressesEXT":
				return CapabilityPhysicalStorageBufferAddressesEXT;
			case "CapabilityComputeDerivativeGroupLinearNV":
				return CapabilityComputeDerivativeGroupLinearNV;
			case "CapabilityRayTracingProvisionalKHR":
				return CapabilityRayTracingProvisionalKHR;
			case "CapabilityCooperativeMatrixNV":
				return CapabilityCooperativeMatrixNV;
			case "CapabilityFragmentShaderSampleInterlockEXT":
				return CapabilityFragmentShaderSampleInterlockEXT;
			case "CapabilityFragmentShaderShadingRateInterlockEXT":
				return CapabilityFragmentShaderShadingRateInterlockEXT;
			case "CapabilityShaderSMBuiltinsNV":
				return CapabilityShaderSMBuiltinsNV;
			case "CapabilityFragmentShaderPixelInterlockEXT":
				return CapabilityFragmentShaderPixelInterlockEXT;
			case "CapabilityDemoteToHelperInvocationEXT":
				return CapabilityDemoteToHelperInvocationEXT;
			case "CapabilitySubgroupShuffleINTEL":
				return CapabilitySubgroupShuffleINTEL;
			case "CapabilitySubgroupBufferBlockIOINTEL":
				return CapabilitySubgroupBufferBlockIOINTEL;
			case "CapabilitySubgroupImageBlockIOINTEL":
				return CapabilitySubgroupImageBlockIOINTEL;
			case "CapabilitySubgroupImageMediaBlockIOINTEL":
				return CapabilitySubgroupImageMediaBlockIOINTEL;
			case "CapabilityIntegerFunctions2INTEL":
				return CapabilityIntegerFunctions2INTEL;
			case "CapabilityFunctionPointersINTEL":
				return CapabilityFunctionPointersINTEL;
			case "CapabilityIndirectReferencesINTEL":
				return CapabilityIndirectReferencesINTEL;
			case "CapabilitySubgroupAvcMotionEstimationINTEL":
				return CapabilitySubgroupAvcMotionEstimationINTEL;
			case "CapabilitySubgroupAvcMotionEstimationIntraINTEL":
				return CapabilitySubgroupAvcMotionEstimationIntraINTEL;
			case "CapabilitySubgroupAvcMotionEstimationChromaINTEL":
				return CapabilitySubgroupAvcMotionEstimationChromaINTEL;
			case "CapabilityFPGAMemoryAttributesINTEL":
				return CapabilityFPGAMemoryAttributesINTEL;
			case "CapabilityUnstructuredLoopControlsINTEL":
				return CapabilityUnstructuredLoopControlsINTEL;
			case "CapabilityFPGALoopControlsINTEL":
				return CapabilityFPGALoopControlsINTEL;
			case "CapabilityKernelAttributesINTEL":
				return CapabilityKernelAttributesINTEL;
			case "CapabilityFPGAKernelAttributesINTEL":
				return CapabilityFPGAKernelAttributesINTEL;
			case "CapabilityBlockingPipesINTEL":
				return CapabilityBlockingPipesINTEL;
			case "CapabilityFPGARegINTEL":
				return CapabilityFPGARegINTEL;
			case "CapabilityAtomicFloat32AddEXT":
				return CapabilityAtomicFloat32AddEXT;
			case "CapabilityAtomicFloat64AddEXT":
				return CapabilityAtomicFloat64AddEXT;
			case "CapabilityMax":
				return CapabilityMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static Capability valueByConstant(int constant) {
		switch (constant) {
			case Main.CAPABILITY_MATRIX:
				return CapabilityMatrix;
			case Main.CAPABILITY_SHADER:
				return CapabilityShader;
			case Main.CAPABILITY_GEOMETRY:
				return CapabilityGeometry;
			case Main.CAPABILITY_TESSELLATION:
				return CapabilityTessellation;
			case Main.CAPABILITY_ADDRESSES:
				return CapabilityAddresses;
			case Main.CAPABILITY_LINKAGE:
				return CapabilityLinkage;
			case Main.CAPABILITY_KERNEL:
				return CapabilityKernel;
			case Main.CAPABILITY_VECTOR16:
				return CapabilityVector16;
			case Main.CAPABILITY_FLOAT16_BUFFER:
				return CapabilityFloat16Buffer;
			case Main.CAPABILITY_FLOAT16:
				return CapabilityFloat16;
			case Main.CAPABILITY_FLOAT64:
				return CapabilityFloat64;
			case Main.CAPABILITY_INT64:
				return CapabilityInt64;
			case Main.CAPABILITY_INT64_ATOMICS:
				return CapabilityInt64Atomics;
			case Main.CAPABILITY_IMAGE_BASIC:
				return CapabilityImageBasic;
			case Main.CAPABILITY_IMAGE_READ_WRITE:
				return CapabilityImageReadWrite;
			case Main.CAPABILITY_IMAGE_MIPMAP:
				return CapabilityImageMipmap;
			case Main.CAPABILITY_PIPES:
				return CapabilityPipes;
			case Main.CAPABILITY_GROUPS:
				return CapabilityGroups;
			case Main.CAPABILITY_DEVICE_ENQUEUE:
				return CapabilityDeviceEnqueue;
			case Main.CAPABILITY_LITERAL_SAMPLER:
				return CapabilityLiteralSampler;
			case Main.CAPABILITY_ATOMIC_STORAGE:
				return CapabilityAtomicStorage;
			case Main.CAPABILITY_INT16:
				return CapabilityInt16;
			case Main.CAPABILITY_TESSELLATION_POINT_SIZE:
				return CapabilityTessellationPointSize;
			case Main.CAPABILITY_GEOMETRY_POINT_SIZE:
				return CapabilityGeometryPointSize;
			case Main.CAPABILITY_IMAGE_GATHER_EXTENDED:
				return CapabilityImageGatherExtended;
			case Main.CAPABILITY_STORAGE_IMAGE_MULTISAMPLE:
				return CapabilityStorageImageMultisample;
			case Main.CAPABILITY_UNIFORM_BUFFER_ARRAY_DYNAMIC_INDEXING:
				return CapabilityUniformBufferArrayDynamicIndexing;
			case Main.CAPABILITY_SAMPLED_IMAGE_ARRAY_DYNAMIC_INDEXING:
				return CapabilitySampledImageArrayDynamicIndexing;
			case Main.CAPABILITY_STORAGE_BUFFER_ARRAY_DYNAMIC_INDEXING:
				return CapabilityStorageBufferArrayDynamicIndexing;
			case Main.CAPABILITY_STORAGE_IMAGE_ARRAY_DYNAMIC_INDEXING:
				return CapabilityStorageImageArrayDynamicIndexing;
			case Main.CAPABILITY_CLIP_DISTANCE:
				return CapabilityClipDistance;
			case Main.CAPABILITY_CULL_DISTANCE:
				return CapabilityCullDistance;
			case Main.CAPABILITY_IMAGE_CUBE_ARRAY:
				return CapabilityImageCubeArray;
			case Main.CAPABILITY_SAMPLE_RATE_SHADING:
				return CapabilitySampleRateShading;
			case Main.CAPABILITY_IMAGE_RECT:
				return CapabilityImageRect;
			case Main.CAPABILITY_SAMPLED_RECT:
				return CapabilitySampledRect;
			case Main.CAPABILITY_GENERIC_POINTER:
				return CapabilityGenericPointer;
			case Main.CAPABILITY_INT8:
				return CapabilityInt8;
			case Main.CAPABILITY_INPUT_ATTACHMENT:
				return CapabilityInputAttachment;
			case Main.CAPABILITY_SPARSE_RESIDENCY:
				return CapabilitySparseResidency;
			case Main.CAPABILITY_MIN_LOD:
				return CapabilityMinLod;
			case Main.CAPABILITY_SAMPLED1D:
				return CapabilitySampled1D;
			case Main.CAPABILITY_IMAGE1D:
				return CapabilityImage1D;
			case Main.CAPABILITY_SAMPLED_CUBE_ARRAY:
				return CapabilitySampledCubeArray;
			case Main.CAPABILITY_SAMPLED_BUFFER:
				return CapabilitySampledBuffer;
			case Main.CAPABILITY_IMAGE_BUFFER:
				return CapabilityImageBuffer;
			case Main.CAPABILITY_IMAGE_MS_ARRAY:
				return CapabilityImageMSArray;
			case Main.CAPABILITY_STORAGE_IMAGE_EXTENDED_FORMATS:
				return CapabilityStorageImageExtendedFormats;
			case Main.CAPABILITY_IMAGE_QUERY:
				return CapabilityImageQuery;
			case Main.CAPABILITY_DERIVATIVE_CONTROL:
				return CapabilityDerivativeControl;
			case Main.CAPABILITY_INTERPOLATION_FUNCTION:
				return CapabilityInterpolationFunction;
			case Main.CAPABILITY_TRANSFORM_FEEDBACK:
				return CapabilityTransformFeedback;
			case Main.CAPABILITY_GEOMETRY_STREAMS:
				return CapabilityGeometryStreams;
			case Main.CAPABILITY_STORAGE_IMAGE_READ_WITHOUT_FORMAT:
				return CapabilityStorageImageReadWithoutFormat;
			case Main.CAPABILITY_STORAGE_IMAGE_WRITE_WITHOUT_FORMAT:
				return CapabilityStorageImageWriteWithoutFormat;
			case Main.CAPABILITY_MULTI_VIEWPORT:
				return CapabilityMultiViewport;
			case Main.CAPABILITY_SUBGROUP_DISPATCH:
				return CapabilitySubgroupDispatch;
			case Main.CAPABILITY_NAMED_BARRIER:
				return CapabilityNamedBarrier;
			case Main.CAPABILITY_PIPE_STORAGE:
				return CapabilityPipeStorage;
			case Main.CAPABILITY_GROUP_NON_UNIFORM:
				return CapabilityGroupNonUniform;
			case Main.CAPABILITY_GROUP_NON_UNIFORM_VOTE:
				return CapabilityGroupNonUniformVote;
			case Main.CAPABILITY_GROUP_NON_UNIFORM_ARITHMETIC:
				return CapabilityGroupNonUniformArithmetic;
			case Main.CAPABILITY_GROUP_NON_UNIFORM_BALLOT:
				return CapabilityGroupNonUniformBallot;
			case Main.CAPABILITY_GROUP_NON_UNIFORM_SHUFFLE:
				return CapabilityGroupNonUniformShuffle;
			case Main.CAPABILITY_GROUP_NON_UNIFORM_SHUFFLE_RELATIVE:
				return CapabilityGroupNonUniformShuffleRelative;
			case Main.CAPABILITY_GROUP_NON_UNIFORM_CLUSTERED:
				return CapabilityGroupNonUniformClustered;
			case Main.CAPABILITY_GROUP_NON_UNIFORM_QUAD:
				return CapabilityGroupNonUniformQuad;
			case Main.CAPABILITY_SHADER_LAYER:
				return CapabilityShaderLayer;
			case Main.CAPABILITY_SHADER_VIEWPORT_INDEX:
				return CapabilityShaderViewportIndex;
			case Main.CAPABILITY_SUBGROUP_BALLOT_KHR:
				return CapabilitySubgroupBallotKHR;
			case Main.CAPABILITY_DRAW_PARAMETERS:
				return CapabilityDrawParameters;
			case Main.CAPABILITY_SUBGROUP_VOTE_KHR:
				return CapabilitySubgroupVoteKHR;
			case Main.CAPABILITY_STORAGE_BUFFER_16BIT_ACCESS:
				return CapabilityStorageBuffer16BitAccess;
			case Main.CAPABILITY_STORAGE_UNIFORM_16:
				return CapabilityStorageUniform16;
			case Main.CAPABILITY_STORAGE_PUSH_CONSTANT_16:
				return CapabilityStoragePushConstant16;
			case Main.CAPABILITY_STORAGE_INPUT_OUTPUT_16:
				return CapabilityStorageInputOutput16;
			case Main.CAPABILITY_DEVICE_GROUP:
				return CapabilityDeviceGroup;
			case Main.CAPABILITY_MULTI_VIEW:
				return CapabilityMultiView;
			case Main.CAPABILITY_VARIABLE_POINTERS_STORAGE_BUFFER:
				return CapabilityVariablePointersStorageBuffer;
			case Main.CAPABILITY_VARIABLE_POINTERS:
				return CapabilityVariablePointers;
			case Main.CAPABILITY_ATOMIC_STORAGE_OPS:
				return CapabilityAtomicStorageOps;
			case Main.CAPABILITY_SAMPLE_MASK_POST_DEPTH_COVERAGE:
				return CapabilitySampleMaskPostDepthCoverage;
			case Main.CAPABILITY_STORAGE_BUFFER_8BIT_ACCESS:
				return CapabilityStorageBuffer8BitAccess;
			case Main.CAPABILITY_UNIFORM_AND_STORAGE_BUFFER_8BIT_ACCESS:
				return CapabilityUniformAndStorageBuffer8BitAccess;
			case Main.CAPABILITY_STORAGE_PUSH_CONSTANT_8:
				return CapabilityStoragePushConstant8;
			case Main.CAPABILITY_DENORM_PRESERVE:
				return CapabilityDenormPreserve;
			case Main.CAPABILITY_DENORM_FLUSH_TO_ZERO:
				return CapabilityDenormFlushToZero;
			case Main.CAPABILITY_SIGNED_ZERO_INF_NAN_PRESERVE:
				return CapabilitySignedZeroInfNanPreserve;
			case Main.CAPABILITY_ROUNDING_MODE_RTE:
				return CapabilityRoundingModeRTE;
			case Main.CAPABILITY_ROUNDING_MODE_RTZ:
				return CapabilityRoundingModeRTZ;
			case Main.CAPABILITY_RAY_QUERY_PROVISIONAL_KHR:
				return CapabilityRayQueryProvisionalKHR;
			case Main.CAPABILITY_RAY_TRAVERSAL_PRIMITIVE_CULLING_PROVISIONAL_KHR:
				return CapabilityRayTraversalPrimitiveCullingProvisionalKHR;
			case Main.CAPABILITY_FLOAT16_IMAGE_AMD:
				return CapabilityFloat16ImageAMD;
			case Main.CAPABILITY_IMAGE_GATHER_BIAS_LOD_AMD:
				return CapabilityImageGatherBiasLodAMD;
			case Main.CAPABILITY_FRAGMENT_MASK_AMD:
				return CapabilityFragmentMaskAMD;
			case Main.CAPABILITY_STENCIL_EXPORT_EXT:
				return CapabilityStencilExportEXT;
			case Main.CAPABILITY_IMAGE_READ_WRITE_LOD_AMD:
				return CapabilityImageReadWriteLodAMD;
			case Main.CAPABILITY_SHADER_CLOCK_KHR:
				return CapabilityShaderClockKHR;
			case Main.CAPABILITY_SAMPLE_MASK_OVERRIDE_COVERAGE_NV:
				return CapabilitySampleMaskOverrideCoverageNV;
			case Main.CAPABILITY_GEOMETRY_SHADER_PASSTHROUGH_NV:
				return CapabilityGeometryShaderPassthroughNV;
			case Main.CAPABILITY_SHADER_VIEWPORT_INDEX_LAYER_EXT:
				return CapabilityShaderViewportIndexLayerEXT;
			case Main.CAPABILITY_SHADER_VIEWPORT_MASK_NV:
				return CapabilityShaderViewportMaskNV;
			case Main.CAPABILITY_SHADER_STEREO_VIEW_NV:
				return CapabilityShaderStereoViewNV;
			case Main.CAPABILITY_PER_VIEW_ATTRIBUTES_NV:
				return CapabilityPerViewAttributesNV;
			case Main.CAPABILITY_FRAGMENT_FULLY_COVERED_EXT:
				return CapabilityFragmentFullyCoveredEXT;
			case Main.CAPABILITY_MESH_SHADING_NV:
				return CapabilityMeshShadingNV;
			case Main.CAPABILITY_IMAGE_FOOTPRINT_NV:
				return CapabilityImageFootprintNV;
			case Main.CAPABILITY_FRAGMENT_BARYCENTRIC_NV:
				return CapabilityFragmentBarycentricNV;
			case Main.CAPABILITY_COMPUTE_DERIVATIVE_GROUP_QUADS_NV:
				return CapabilityComputeDerivativeGroupQuadsNV;
			case Main.CAPABILITY_FRAGMENT_DENSITY_EXT:
				return CapabilityFragmentDensityEXT;
			case Main.CAPABILITY_GROUP_NON_UNIFORM_PARTITIONED_NV:
				return CapabilityGroupNonUniformPartitionedNV;
			case Main.CAPABILITY_SHADER_NON_UNIFORM:
				return CapabilityShaderNonUniform;
			case Main.CAPABILITY_RUNTIME_DESCRIPTOR_ARRAY:
				return CapabilityRuntimeDescriptorArray;
			case Main.CAPABILITY_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING:
				return CapabilityInputAttachmentArrayDynamicIndexing;
			case Main.CAPABILITY_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING:
				return CapabilityUniformTexelBufferArrayDynamicIndexing;
			case Main.CAPABILITY_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING:
				return CapabilityStorageTexelBufferArrayDynamicIndexing;
			case Main.CAPABILITY_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING:
				return CapabilityUniformBufferArrayNonUniformIndexing;
			case Main.CAPABILITY_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING:
				return CapabilitySampledImageArrayNonUniformIndexing;
			case Main.CAPABILITY_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING:
				return CapabilityStorageBufferArrayNonUniformIndexing;
			case Main.CAPABILITY_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING:
				return CapabilityStorageImageArrayNonUniformIndexing;
			case Main.CAPABILITY_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING:
				return CapabilityInputAttachmentArrayNonUniformIndexing;
			case Main.CAPABILITY_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING:
				return CapabilityUniformTexelBufferArrayNonUniformIndexing;
			case Main.CAPABILITY_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING:
				return CapabilityStorageTexelBufferArrayNonUniformIndexing;
			case Main.CAPABILITY_RAY_TRACING_NV:
				return CapabilityRayTracingNV;
			case Main.CAPABILITY_VULKAN_MEMORY_MODEL:
				return CapabilityVulkanMemoryModel;
			case Main.CAPABILITY_VULKAN_MEMORY_MODEL_DEVICE_SCOPE:
				return CapabilityVulkanMemoryModelDeviceScope;
			case Main.CAPABILITY_PHYSICAL_STORAGE_BUFFER_ADDRESSES:
				return CapabilityPhysicalStorageBufferAddresses;
			case Main.CAPABILITY_COMPUTE_DERIVATIVE_GROUP_LINEAR_NV:
				return CapabilityComputeDerivativeGroupLinearNV;
			case Main.CAPABILITY_RAY_TRACING_PROVISIONAL_KHR:
				return CapabilityRayTracingProvisionalKHR;
			case Main.CAPABILITY_COOPERATIVE_MATRIX_NV:
				return CapabilityCooperativeMatrixNV;
			case Main.CAPABILITY_FRAGMENT_SHADER_SAMPLE_INTERLOCK_EXT:
				return CapabilityFragmentShaderSampleInterlockEXT;
			case Main.CAPABILITY_FRAGMENT_SHADER_SHADING_RATE_INTERLOCK_EXT:
				return CapabilityFragmentShaderShadingRateInterlockEXT;
			case Main.CAPABILITY_SHADER_SM_BUILTINS_NV:
				return CapabilityShaderSMBuiltinsNV;
			case Main.CAPABILITY_FRAGMENT_SHADER_PIXEL_INTERLOCK_EXT:
				return CapabilityFragmentShaderPixelInterlockEXT;
			case Main.CAPABILITY_DEMOTE_TO_HELPER_INVOCATION_EXT:
				return CapabilityDemoteToHelperInvocationEXT;
			case Main.CAPABILITY_SUBGROUP_SHUFFLE_INTEL:
				return CapabilitySubgroupShuffleINTEL;
			case Main.CAPABILITY_SUBGROUP_BUFFER_BLOCK_IO_INTEL:
				return CapabilitySubgroupBufferBlockIOINTEL;
			case Main.CAPABILITY_SUBGROUP_IMAGE_BLOCK_IO_INTEL:
				return CapabilitySubgroupImageBlockIOINTEL;
			case Main.CAPABILITY_SUBGROUP_IMAGE_MEDIA_BLOCK_IO_INTEL:
				return CapabilitySubgroupImageMediaBlockIOINTEL;
			case Main.CAPABILITY_INTEGER_FUNCTIONS2_INTEL:
				return CapabilityIntegerFunctions2INTEL;
			case Main.CAPABILITY_FUNCTION_POINTERS_INTEL:
				return CapabilityFunctionPointersINTEL;
			case Main.CAPABILITY_INDIRECT_REFERENCES_INTEL:
				return CapabilityIndirectReferencesINTEL;
			case Main.CAPABILITY_SUBGROUP_AVC_MOTION_ESTIMATION_INTEL:
				return CapabilitySubgroupAvcMotionEstimationINTEL;
			case Main.CAPABILITY_SUBGROUP_AVC_MOTION_ESTIMATION_INTRA_INTEL:
				return CapabilitySubgroupAvcMotionEstimationIntraINTEL;
			case Main.CAPABILITY_SUBGROUP_AVC_MOTION_ESTIMATION_CHROMA_INTEL:
				return CapabilitySubgroupAvcMotionEstimationChromaINTEL;
			case Main.CAPABILITY_FPGA_MEMORY_ATTRIBUTES_INTEL:
				return CapabilityFPGAMemoryAttributesINTEL;
			case Main.CAPABILITY_UNSTRUCTURED_LOOP_CONTROLS_INTEL:
				return CapabilityUnstructuredLoopControlsINTEL;
			case Main.CAPABILITY_FPGA_LOOP_CONTROLS_INTEL:
				return CapabilityFPGALoopControlsINTEL;
			case Main.CAPABILITY_KERNEL_ATTRIBUTES_INTEL:
				return CapabilityKernelAttributesINTEL;
			case Main.CAPABILITY_FPGA_KERNEL_ATTRIBUTES_INTEL:
				return CapabilityFPGAKernelAttributesINTEL;
			case Main.CAPABILITY_BLOCKING_PIPES_INTEL:
				return CapabilityBlockingPipesINTEL;
			case Main.CAPABILITY_FPGA_REG_INTEL:
				return CapabilityFPGARegINTEL;
			case Main.CAPABILITY_ATOMIC_FLOAT32_ADD_EXT:
				return CapabilityAtomicFloat32AddEXT;
			case Main.CAPABILITY_ATOMIC_FLOAT64_ADD_EXT:
				return CapabilityAtomicFloat64AddEXT;
			case Main.CAPABILITY_MAX:
				return CapabilityMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
