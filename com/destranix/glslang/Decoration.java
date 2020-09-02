package com.destranix.glslang;

public enum Decoration {
	DecorationRelaxedPrecision(Main.DECORATION_RELAXEDPRECISION),
	DecorationSpecId(Main.DECORATION_SPEC_ID),
	DecorationBlock(Main.DECORATION_BLOCK),
	DecorationBufferBlock(Main.DECORATION_BUFFER_BLOCK),
	DecorationRowMajor(Main.DECORATION_ROW_MAJOR),
	DecorationColMajor(Main.DECORATION_COL_MAJOR),
	DecorationArrayStride(Main.DECORATION_ARRAY_STRIDE),
	DecorationMatrixStride(Main.DECORATION_MATRIX_STRIDE),
	DecorationGLSLShared(Main.DECORATION_GLSL_SHARED),
	DecorationGLSLPacked(Main.DECORATION_GLSL_PACKED),
	DecorationCPacked(Main.DECORATION_C_PACKED),
	DecorationBuiltIn(Main.DECORATION_BUILT_IN),
	DecorationNoPerspective(Main.DECORATION_NO_PERSPECTIVE),
	DecorationFlat(Main.DECORATION_FLAT),
	DecorationPatch(Main.DECORATION_PATCH),
	DecorationCentroid(Main.DECORATION_CENTROID),
	DecorationSample(Main.DECORATION_SAMPLE),
	DecorationInvariant(Main.DECORATION_INVARIANT),
	DecorationRestrict(Main.DECORATION_RESTRICT),
	DecorationAliased(Main.DECORATION_ALIASED),
	DecorationVolatile(Main.DECORATION_VOLATILE),
	DecorationConstant(Main.DECORATION_CONSTANT),
	DecorationCoherent(Main.DECORATION_COHERENT),
	DecorationNonWritable(Main.DECORATION_NON_WRITABLE),
	DecorationNonReadable(Main.DECORATION_NON_READABLE),
	DecorationUniform(Main.DECORATION_UNIFORM),
	DecorationUniformId(Main.DECORATION_UNIFORMID),
	DecorationSaturatedConversion(Main.DECORATION_SATURATED_CONVERSION),
	DecorationStream(Main.DECORATION_STREAM),
	DecorationLocation(Main.DECORATION_LOCATION),
	DecorationComponent(Main.DECORATION_COMPONENT),
	DecorationIndex(Main.DECORATION_INDEX),
	DecorationBinding(Main.DECORATION_BINDING),
	DecorationDescriptorSet(Main.DECORATION_DESCRIPTOR_SET),
	DecorationOffset(Main.DECORATION_OFFSET),
	DecorationXfbBuffer(Main.DECORATION_XFB_BUFFER),
	DecorationXfbStride(Main.DECORATION_XFB_STRIDE),
	DecorationFuncParamAttr(Main.DECORATION_FUNC_PARAM_ATTR),
	DecorationFPRoundingMode(Main.DECORATION_FP_ROUNDING_MODE),
	DecorationFPFastMathMode(Main.DECORATION_FP_FAST_MATH_MODE),
	DecorationLinkageAttributes(Main.DECORATION_LINKAGE_ATTRIBUTES),
	DecorationNoContraction(Main.DECORATION_NO_CONTRACTION),
	DecorationInputAttachmentIndex(Main.DECORATION_INPUT_ATTACHMENT_INDEX),
	DecorationAlignment(Main.DECORATION_ALIGNMENT),
	DecorationMaxByteOffset(Main.DECORATION_MAX_BYTE_OFFSET),
	DecorationAlignmentId(Main.DECORATION_ALIGNMENT_ID),
	DecorationMaxByteOffsetId(Main.DECORATION_MAX_BYTE_OFFSET_ID),
	DecorationNoSignedWrap(Main.DECORATION_NO_SIGNED_WRAP),
	DecorationNoUnsignedWrap(Main.DECORATION_NO_UNSIGNED_WRAP),
	DecorationExplicitInterpAMD(Main.DECORATION_EXPLICIT_INTERP_AMD),
	DecorationOverrideCoverageNV(Main.DECORATION_OVERRIDE_COVERAGE_NV),
	DecorationPassthroughNV(Main.DECORATION_PASSTHROUGH_NV),
	DecorationViewportRelativeNV(Main.DECORATION_VIEWPORT_RELATIVE_NV),
	DecorationSecondaryViewportRelativeNV(Main.DECORATION_SECONDARY_VIEWPORT_RELATIVE_NV),
	DecorationPerPrimitiveNV(Main.DECORATION_PER_PRIMITIVE_NV),
	DecorationPerViewNV(Main.DECORATION_PER_VIEW_NV),
	DecorationPerTaskNV(Main.DECORATION_PER_TASK_NV),
	DecorationPerVertexNV(Main.DECORATION_PER_VERTEX_NV),
	DecorationNonUniform(Main.DECORATION_NON_UNIFORM),
	DecorationNonUniformEXT(Main.DECORATION_NON_UNIFORM_EXT),
	DecorationRestrictPointer(Main.DECORATION_RESTRICT_POINTER),
	DecorationRestrictPointerEXT(Main.DECORATION_RESTRICT_POINTER_EXT),
	DecorationAliasedPointer(Main.DECORATION_ALIASED_POINTER),
	DecorationAliasedPointerEXT(Main.DECORATION_ALIASED_POINTER_EXT),
	DecorationReferencedIndirectlyINTEL(Main.DECORATION_REFERENCED_INDIRECTLY_INTEL),
	DecorationCounterBuffer(Main.DECORATION_COUNTER_BUFFER),
	DecorationHlslCounterBufferGOOGLE(Main.DECORATION_HLSL_COUNTER_BUFFER_GOOGLE),
	DecorationHlslSemanticGOOGLE(Main.DECORATION_HLSL_SEMANTIC_GOOGLE),
	DecorationUserSemantic(Main.DECORATION_USER_SEMANTIC),
	DecorationUserTypeGOOGLE(Main.DECORATION_USER_TYPE_GOOGLE),
	DecorationRegisterINTEL(Main.DECORATION_REGISTER_INTEL),
	DecorationMemoryINTEL(Main.DECORATION_MEMORY_INTEL),
	DecorationNumbanksINTEL(Main.DECORATION_NUMBANKS_INTEL),
	DecorationBankwidthINTEL(Main.DECORATION_BANKWIDTH_INTEL),
	DecorationMaxPrivateCopiesINTEL(Main.DECORATION_MAX_PRIVATE_COPIES_INTEL),
	DecorationSinglepumpINTEL(Main.DECORATION_SINGLEPUMP_INTEL),
	DecorationDoublepumpINTEL(Main.DECORATION_DOUBLEPUMP_INTEL),
	DecorationMaxReplicatesINTEL(Main.DECORATION_MAX_REPLICATES_INTEL),
	DecorationSimpleDualPortINTEL(Main.DECORATION_SIMPLE_DUAL_PORT_INTEL),
	DecorationMergeINTEL(Main.DECORATION_MERGE_INTEL),
	DecorationBankBitsINTEL(Main.DECORATION_BANK_BITS_INTEL),
	DecorationForcePow2DepthINTEL(Main.DECORATION_FORCE_POW2_DEPTH_INTEL),
	DecorationMax(Main.DECORATION_MAX);

	private final int value;

	private Decoration(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static Decoration valueByStr(String str) {
		switch (str) {
			case "DecorationRelaxedPrecision":
				return DecorationRelaxedPrecision;
			case "DecorationSpecId":
				return DecorationSpecId;
			case "DecorationBlock":
				return DecorationBlock;
			case "DecorationBufferBlock":
				return DecorationBufferBlock;
			case "DecorationRowMajor":
				return DecorationRowMajor;
			case "DecorationColMajor":
				return DecorationColMajor;
			case "DecorationArrayStride":
				return DecorationArrayStride;
			case "DecorationMatrixStride":
				return DecorationMatrixStride;
			case "DecorationGLSLShared":
				return DecorationGLSLShared;
			case "DecorationGLSLPacked":
				return DecorationGLSLPacked;
			case "DecorationCPacked":
				return DecorationCPacked;
			case "DecorationBuiltIn":
				return DecorationBuiltIn;
			case "DecorationNoPerspective":
				return DecorationNoPerspective;
			case "DecorationFlat":
				return DecorationFlat;
			case "DecorationPatch":
				return DecorationPatch;
			case "DecorationCentroid":
				return DecorationCentroid;
			case "DecorationSample":
				return DecorationSample;
			case "DecorationInvariant":
				return DecorationInvariant;
			case "DecorationRestrict":
				return DecorationRestrict;
			case "DecorationAliased":
				return DecorationAliased;
			case "DecorationVolatile":
				return DecorationVolatile;
			case "DecorationConstant":
				return DecorationConstant;
			case "DecorationCoherent":
				return DecorationCoherent;
			case "DecorationNonWritable":
				return DecorationNonWritable;
			case "DecorationNonReadable":
				return DecorationNonReadable;
			case "DecorationUniform":
				return DecorationUniform;
			case "DecorationUniformId":
				return DecorationUniformId;
			case "DecorationSaturatedConversion":
				return DecorationSaturatedConversion;
			case "DecorationStream":
				return DecorationStream;
			case "DecorationLocation":
				return DecorationLocation;
			case "DecorationComponent":
				return DecorationComponent;
			case "DecorationIndex":
				return DecorationIndex;
			case "DecorationBinding":
				return DecorationBinding;
			case "DecorationDescriptorSet":
				return DecorationDescriptorSet;
			case "DecorationOffset":
				return DecorationOffset;
			case "DecorationXfbBuffer":
				return DecorationXfbBuffer;
			case "DecorationXfbStride":
				return DecorationXfbStride;
			case "DecorationFuncParamAttr":
				return DecorationFuncParamAttr;
			case "DecorationFPRoundingMode":
				return DecorationFPRoundingMode;
			case "DecorationFPFastMathMode":
				return DecorationFPFastMathMode;
			case "DecorationLinkageAttributes":
				return DecorationLinkageAttributes;
			case "DecorationNoContraction":
				return DecorationNoContraction;
			case "DecorationInputAttachmentIndex":
				return DecorationInputAttachmentIndex;
			case "DecorationAlignment":
				return DecorationAlignment;
			case "DecorationMaxByteOffset":
				return DecorationMaxByteOffset;
			case "DecorationAlignmentId":
				return DecorationAlignmentId;
			case "DecorationMaxByteOffsetId":
				return DecorationMaxByteOffsetId;
			case "DecorationNoSignedWrap":
				return DecorationNoSignedWrap;
			case "DecorationNoUnsignedWrap":
				return DecorationNoUnsignedWrap;
			case "DecorationExplicitInterpAMD":
				return DecorationExplicitInterpAMD;
			case "DecorationOverrideCoverageNV":
				return DecorationOverrideCoverageNV;
			case "DecorationPassthroughNV":
				return DecorationPassthroughNV;
			case "DecorationViewportRelativeNV":
				return DecorationViewportRelativeNV;
			case "DecorationSecondaryViewportRelativeNV":
				return DecorationSecondaryViewportRelativeNV;
			case "DecorationPerPrimitiveNV":
				return DecorationPerPrimitiveNV;
			case "DecorationPerViewNV":
				return DecorationPerViewNV;
			case "DecorationPerTaskNV":
				return DecorationPerTaskNV;
			case "DecorationPerVertexNV":
				return DecorationPerVertexNV;
			case "DecorationNonUniform":
				return DecorationNonUniform;
			case "DecorationNonUniformEXT":
				return DecorationNonUniformEXT;
			case "DecorationRestrictPointer":
				return DecorationRestrictPointer;
			case "DecorationRestrictPointerEXT":
				return DecorationRestrictPointerEXT;
			case "DecorationAliasedPointer":
				return DecorationAliasedPointer;
			case "DecorationAliasedPointerEXT":
				return DecorationAliasedPointerEXT;
			case "DecorationReferencedIndirectlyINTEL":
				return DecorationReferencedIndirectlyINTEL;
			case "DecorationCounterBuffer":
				return DecorationCounterBuffer;
			case "DecorationHlslCounterBufferGOOGLE":
				return DecorationHlslCounterBufferGOOGLE;
			case "DecorationHlslSemanticGOOGLE":
				return DecorationHlslSemanticGOOGLE;
			case "DecorationUserSemantic":
				return DecorationUserSemantic;
			case "DecorationUserTypeGOOGLE":
				return DecorationUserTypeGOOGLE;
			case "DecorationRegisterINTEL":
				return DecorationRegisterINTEL;
			case "DecorationMemoryINTEL":
				return DecorationMemoryINTEL;
			case "DecorationNumbanksINTEL":
				return DecorationNumbanksINTEL;
			case "DecorationBankwidthINTEL":
				return DecorationBankwidthINTEL;
			case "DecorationMaxPrivateCopiesINTEL":
				return DecorationMaxPrivateCopiesINTEL;
			case "DecorationSinglepumpINTEL":
				return DecorationSinglepumpINTEL;
			case "DecorationDoublepumpINTEL":
				return DecorationDoublepumpINTEL;
			case "DecorationMaxReplicatesINTEL":
				return DecorationMaxReplicatesINTEL;
			case "DecorationSimpleDualPortINTEL":
				return DecorationSimpleDualPortINTEL;
			case "DecorationMergeINTEL":
				return DecorationMergeINTEL;
			case "DecorationBankBitsINTEL":
				return DecorationBankBitsINTEL;
			case "DecorationForcePow2DepthINTEL":
				return DecorationForcePow2DepthINTEL;
			case "DecorationMax":
				return DecorationMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static Decoration valueByConstant(int constant) {
		switch (constant) {
			case Main.DECORATION_RELAXEDPRECISION:
				return DecorationRelaxedPrecision;
			case Main.DECORATION_SPEC_ID:
				return DecorationSpecId;
			case Main.DECORATION_BLOCK:
				return DecorationBlock;
			case Main.DECORATION_BUFFER_BLOCK:
				return DecorationBufferBlock;
			case Main.DECORATION_ROW_MAJOR:
				return DecorationRowMajor;
			case Main.DECORATION_COL_MAJOR:
				return DecorationColMajor;
			case Main.DECORATION_ARRAY_STRIDE:
				return DecorationArrayStride;
			case Main.DECORATION_MATRIX_STRIDE:
				return DecorationMatrixStride;
			case Main.DECORATION_GLSL_SHARED:
				return DecorationGLSLShared;
			case Main.DECORATION_GLSL_PACKED:
				return DecorationGLSLPacked;
			case Main.DECORATION_C_PACKED:
				return DecorationCPacked;
			case Main.DECORATION_BUILT_IN:
				return DecorationBuiltIn;
			case Main.DECORATION_NO_PERSPECTIVE:
				return DecorationNoPerspective;
			case Main.DECORATION_FLAT:
				return DecorationFlat;
			case Main.DECORATION_PATCH:
				return DecorationPatch;
			case Main.DECORATION_CENTROID:
				return DecorationCentroid;
			case Main.DECORATION_SAMPLE:
				return DecorationSample;
			case Main.DECORATION_INVARIANT:
				return DecorationInvariant;
			case Main.DECORATION_RESTRICT:
				return DecorationRestrict;
			case Main.DECORATION_ALIASED:
				return DecorationAliased;
			case Main.DECORATION_VOLATILE:
				return DecorationVolatile;
			case Main.DECORATION_CONSTANT:
				return DecorationConstant;
			case Main.DECORATION_COHERENT:
				return DecorationCoherent;
			case Main.DECORATION_NON_WRITABLE:
				return DecorationNonWritable;
			case Main.DECORATION_NON_READABLE:
				return DecorationNonReadable;
			case Main.DECORATION_UNIFORM:
				return DecorationUniform;
			case Main.DECORATION_UNIFORMID:
				return DecorationUniformId;
			case Main.DECORATION_SATURATED_CONVERSION:
				return DecorationSaturatedConversion;
			case Main.DECORATION_STREAM:
				return DecorationStream;
			case Main.DECORATION_LOCATION:
				return DecorationLocation;
			case Main.DECORATION_COMPONENT:
				return DecorationComponent;
			case Main.DECORATION_INDEX:
				return DecorationIndex;
			case Main.DECORATION_BINDING:
				return DecorationBinding;
			case Main.DECORATION_DESCRIPTOR_SET:
				return DecorationDescriptorSet;
			case Main.DECORATION_OFFSET:
				return DecorationOffset;
			case Main.DECORATION_XFB_BUFFER:
				return DecorationXfbBuffer;
			case Main.DECORATION_XFB_STRIDE:
				return DecorationXfbStride;
			case Main.DECORATION_FUNC_PARAM_ATTR:
				return DecorationFuncParamAttr;
			case Main.DECORATION_FP_ROUNDING_MODE:
				return DecorationFPRoundingMode;
			case Main.DECORATION_FP_FAST_MATH_MODE:
				return DecorationFPFastMathMode;
			case Main.DECORATION_LINKAGE_ATTRIBUTES:
				return DecorationLinkageAttributes;
			case Main.DECORATION_NO_CONTRACTION:
				return DecorationNoContraction;
			case Main.DECORATION_INPUT_ATTACHMENT_INDEX:
				return DecorationInputAttachmentIndex;
			case Main.DECORATION_ALIGNMENT:
				return DecorationAlignment;
			case Main.DECORATION_MAX_BYTE_OFFSET:
				return DecorationMaxByteOffset;
			case Main.DECORATION_ALIGNMENT_ID:
				return DecorationAlignmentId;
			case Main.DECORATION_MAX_BYTE_OFFSET_ID:
				return DecorationMaxByteOffsetId;
			case Main.DECORATION_NO_SIGNED_WRAP:
				return DecorationNoSignedWrap;
			case Main.DECORATION_NO_UNSIGNED_WRAP:
				return DecorationNoUnsignedWrap;
			case Main.DECORATION_EXPLICIT_INTERP_AMD:
				return DecorationExplicitInterpAMD;
			case Main.DECORATION_OVERRIDE_COVERAGE_NV:
				return DecorationOverrideCoverageNV;
			case Main.DECORATION_PASSTHROUGH_NV:
				return DecorationPassthroughNV;
			case Main.DECORATION_VIEWPORT_RELATIVE_NV:
				return DecorationViewportRelativeNV;
			case Main.DECORATION_SECONDARY_VIEWPORT_RELATIVE_NV:
				return DecorationSecondaryViewportRelativeNV;
			case Main.DECORATION_PER_PRIMITIVE_NV:
				return DecorationPerPrimitiveNV;
			case Main.DECORATION_PER_VIEW_NV:
				return DecorationPerViewNV;
			case Main.DECORATION_PER_TASK_NV:
				return DecorationPerTaskNV;
			case Main.DECORATION_PER_VERTEX_NV:
				return DecorationPerVertexNV;
			case Main.DECORATION_NON_UNIFORM:
				return DecorationNonUniform;
			case Main.DECORATION_RESTRICT_POINTER:
				return DecorationRestrictPointer;
			case Main.DECORATION_ALIASED_POINTER:
				return DecorationAliasedPointer;
			case Main.DECORATION_REFERENCED_INDIRECTLY_INTEL:
				return DecorationReferencedIndirectlyINTEL;
			case Main.DECORATION_COUNTER_BUFFER:
				return DecorationCounterBuffer;
			case Main.DECORATION_USER_SEMANTIC:
				return DecorationUserSemantic;
			case Main.DECORATION_USER_TYPE_GOOGLE:
				return DecorationUserTypeGOOGLE;
			case Main.DECORATION_REGISTER_INTEL:
				return DecorationRegisterINTEL;
			case Main.DECORATION_MEMORY_INTEL:
				return DecorationMemoryINTEL;
			case Main.DECORATION_NUMBANKS_INTEL:
				return DecorationNumbanksINTEL;
			case Main.DECORATION_BANKWIDTH_INTEL:
				return DecorationBankwidthINTEL;
			case Main.DECORATION_MAX_PRIVATE_COPIES_INTEL:
				return DecorationMaxPrivateCopiesINTEL;
			case Main.DECORATION_SINGLEPUMP_INTEL:
				return DecorationSinglepumpINTEL;
			case Main.DECORATION_DOUBLEPUMP_INTEL:
				return DecorationDoublepumpINTEL;
			case Main.DECORATION_MAX_REPLICATES_INTEL:
				return DecorationMaxReplicatesINTEL;
			case Main.DECORATION_SIMPLE_DUAL_PORT_INTEL:
				return DecorationSimpleDualPortINTEL;
			case Main.DECORATION_MERGE_INTEL:
				return DecorationMergeINTEL;
			case Main.DECORATION_BANK_BITS_INTEL:
				return DecorationBankBitsINTEL;
			case Main.DECORATION_FORCE_POW2_DEPTH_INTEL:
				return DecorationForcePow2DepthINTEL;
			case Main.DECORATION_MAX:
				return DecorationMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
