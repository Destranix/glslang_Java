package com.destranix.glslang;

public enum TAttributeType {
	EatNone(Main.EAT_NONE),
	EatAllow_uav_condition(Main.EAT_ALLOW_UAV_CONDITION),
	EatBranch(Main.EAT_BRANCH),
	EatCall(Main.EAT_CALL),
	EatDomain(Main.EAT_DOMAIN),
	EatEarlyDepthStencil(Main.EAT_EARLY_DEPTH_STENCIL),
	EatFastOpt(Main.EAT_FAST_OPT),
	EatFlatten(Main.EAT_FLATTEN),
	EatForceCase(Main.EAT_FORCE_CASE),
	EatInstance(Main.EAT_INSTANCE),
	EatMaxTessFactor(Main.EAT_MAX_TESS_FACTOR),
	EatNumThreads(Main.EAT_NUM_THREADS),
	EatMaxVertexCount(Main.EAT_MAX_VERTEX_COUNT),
	EatOutputControlPoints(Main.EAT_OUTPUT_CONTROL_POINTS),
	EatOutputTopology(Main.EAT_OUTPUT_TOPOLOGY),
	EatPartitioning(Main.EAT_PARTITIONING),
	EatPatchConstantFunc(Main.EAT_PATCH_CONSTANT_FUNC),
	EatPatchSize(Main.EAT_PATCH_SIZE),
	EatUnroll(Main.EAT_UNROLL),
	EatLoop(Main.EAT_LOOP),
	EatBinding(Main.EAT_BINDING),
	EatGlobalBinding(Main.EAT_GLOBAL_BINDING),
	EatLocation(Main.EAT_LOCATION),
	EatInputAttachment(Main.EAT_INPUT_ATTACHMENT),
	EatBuiltIn(Main.EAT_BUILTIN),
	EatPushConstant(Main.EAT_PUSH_CONSTANT),
	EatConstantId(Main.EAT_CONSTANT_ID),
	EatDependencyInfinite(Main.EAT_DEPENDENCY_INFINITE),
	EatDependencyLength(Main.EAT_DEPENDENCY_LENGTH),
	EatMinIterations(Main.EAT_MIN_ITERATIONS),
	EatMaxIterations(Main.EAT_MAX_ITERATIONS),
	EatIterationMultiple(Main.EAT_ITERATION_MULTIPLE),
	EatPeelCount(Main.EAT_PEEL_COUNT),
	EatPartialCount(Main.EAT_PARTIAL_COUNT),
	EatFormatRgba32f(Main.EAT_FORMAT_RGBA32F),
	EatFormatRgba16f(Main.EAT_FORMAT_RGBA16F),
	EatFormatR32f(Main.EAT_FORMAT_R32F),
	EatFormatRgba8(Main.EAT_FORMAT_RGBA8),
	EatFormatRgba8Snorm(Main.EAT_FORMAT_RGBA8_SNORM),
	EatFormatRg32f(Main.EAT_FORMAT_RG32F),
	EatFormatRg16f(Main.EAT_FORMAT_RG16F),
	EatFormatR11fG11fB10f(Main.EAT_FORMAT_R11F_G11F_B10F),
	EatFormatR16f(Main.EAT_FORMAT_R16F),
	EatFormatRgba16(Main.EAT_FORMAT_RGBA16),
	EatFormatRgb10A2(Main.EAT_FORMAT_RGB10_A2),
	EatFormatRg16(Main.EAT_FORMAT_RG16),
	EatFormatRg8(Main.EAT_FORMAT_RG8),
	EatFormatR16(Main.EAT_FORMAT_R16),
	EatFormatR8(Main.EAT_FORMAT_R8),
	EatFormatRgba16Snorm(Main.EAT_FORMAT_RGBA16_SNORM),
	EatFormatRg16Snorm(Main.EAT_FORMAT_RG16_SNORM),
	EatFormatRg8Snorm(Main.EAT_FORMAT_RG8_SNORM),
	EatFormatR16Snorm(Main.EAT_FORMAT_R16_SNORM),
	EatFormatR8Snorm(Main.EAT_FORMAT_R8_SNORM),
	EatFormatRgba32i(Main.EAT_FORMAT_RGBA32I),
	EatFormatRgba16i(Main.EAT_FORMAT_RGBA16I),
	EatFormatRgba8i(Main.EAT_FORMAT_RGBA8I),
	EatFormatR32i(Main.EAT_FORMAT_R32I),
	EatFormatRg32i(Main.EAT_FORMAT_RG32I),
	EatFormatRg16i(Main.EAT_FORMAT_RG16I),
	EatFormatRg8i(Main.EAT_FORMAT_RG8I),
	EatFormatR16i(Main.EAT_FORMAT_R16I),
	EatFormatR8i(Main.EAT_FORMAT_R8I),
	EatFormatRgba32ui(Main.EAT_FORMAT_RGBA32UI),
	EatFormatRgba16ui(Main.EAT_FORMAT_RGBA16UI),
	EatFormatRgba8ui(Main.EAT_FORMAT_RGBA8UI),
	EatFormatR32ui(Main.EAT_FORMAT_R32UI),
	EatFormatRgb10a2ui(Main.EAT_FORMAT_RGB10A2UI),
	EatFormatRg32ui(Main.EAT_FORMAT_RG32UI),
	EatFormatRg16ui(Main.EAT_FORMAT_RG16UI),
	EatFormatRg8ui(Main.EAT_FORMAT_RG8UI),
	EatFormatR16ui(Main.EAT_FORMAT_R16UI),
	EatFormatR8ui(Main.EAT_FORMAT_R8UI),
	EatFormatUnknown(Main.EAT_FORMAT_UNKNOWN),
	EatNonWritable(Main.EAT_NON_WRITABLE),
	EatNonReadable(Main.EAT_NON_READABLE);

	private final int value;

	private TAttributeType(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TAttributeType valueByStr(String str) {
		switch (str) {
			case "EatNone":
				return EatNone;
			case "EatAllow_uav_condition":
				return EatAllow_uav_condition;
			case "EatBranch":
				return EatBranch;
			case "EatCall":
				return EatCall;
			case "EatDomain":
				return EatDomain;
			case "EatEarlyDepthStencil":
				return EatEarlyDepthStencil;
			case "EatFastOpt":
				return EatFastOpt;
			case "EatFlatten":
				return EatFlatten;
			case "EatForceCase":
				return EatForceCase;
			case "EatInstance":
				return EatInstance;
			case "EatMaxTessFactor":
				return EatMaxTessFactor;
			case "EatNumThreads":
				return EatNumThreads;
			case "EatMaxVertexCount":
				return EatMaxVertexCount;
			case "EatOutputControlPoints":
				return EatOutputControlPoints;
			case "EatOutputTopology":
				return EatOutputTopology;
			case "EatPartitioning":
				return EatPartitioning;
			case "EatPatchConstantFunc":
				return EatPatchConstantFunc;
			case "EatPatchSize":
				return EatPatchSize;
			case "EatUnroll":
				return EatUnroll;
			case "EatLoop":
				return EatLoop;
			case "EatBinding":
				return EatBinding;
			case "EatGlobalBinding":
				return EatGlobalBinding;
			case "EatLocation":
				return EatLocation;
			case "EatInputAttachment":
				return EatInputAttachment;
			case "EatBuiltIn":
				return EatBuiltIn;
			case "EatPushConstant":
				return EatPushConstant;
			case "EatConstantId":
				return EatConstantId;
			case "EatDependencyInfinite":
				return EatDependencyInfinite;
			case "EatDependencyLength":
				return EatDependencyLength;
			case "EatMinIterations":
				return EatMinIterations;
			case "EatMaxIterations":
				return EatMaxIterations;
			case "EatIterationMultiple":
				return EatIterationMultiple;
			case "EatPeelCount":
				return EatPeelCount;
			case "EatPartialCount":
				return EatPartialCount;
			case "EatFormatRgba32f":
				return EatFormatRgba32f;
			case "EatFormatRgba16f":
				return EatFormatRgba16f;
			case "EatFormatR32f":
				return EatFormatR32f;
			case "EatFormatRgba8":
				return EatFormatRgba8;
			case "EatFormatRgba8Snorm":
				return EatFormatRgba8Snorm;
			case "EatFormatRg32f":
				return EatFormatRg32f;
			case "EatFormatRg16f":
				return EatFormatRg16f;
			case "EatFormatR11fG11fB10f":
				return EatFormatR11fG11fB10f;
			case "EatFormatR16f":
				return EatFormatR16f;
			case "EatFormatRgba16":
				return EatFormatRgba16;
			case "EatFormatRgb10A2":
				return EatFormatRgb10A2;
			case "EatFormatRg16":
				return EatFormatRg16;
			case "EatFormatRg8":
				return EatFormatRg8;
			case "EatFormatR16":
				return EatFormatR16;
			case "EatFormatR8":
				return EatFormatR8;
			case "EatFormatRgba16Snorm":
				return EatFormatRgba16Snorm;
			case "EatFormatRg16Snorm":
				return EatFormatRg16Snorm;
			case "EatFormatRg8Snorm":
				return EatFormatRg8Snorm;
			case "EatFormatR16Snorm":
				return EatFormatR16Snorm;
			case "EatFormatR8Snorm":
				return EatFormatR8Snorm;
			case "EatFormatRgba32i":
				return EatFormatRgba32i;
			case "EatFormatRgba16i":
				return EatFormatRgba16i;
			case "EatFormatRgba8i":
				return EatFormatRgba8i;
			case "EatFormatR32i":
				return EatFormatR32i;
			case "EatFormatRg32i":
				return EatFormatRg32i;
			case "EatFormatRg16i":
				return EatFormatRg16i;
			case "EatFormatRg8i":
				return EatFormatRg8i;
			case "EatFormatR16i":
				return EatFormatR16i;
			case "EatFormatR8i":
				return EatFormatR8i;
			case "EatFormatRgba32ui":
				return EatFormatRgba32ui;
			case "EatFormatRgba16ui":
				return EatFormatRgba16ui;
			case "EatFormatRgba8ui":
				return EatFormatRgba8ui;
			case "EatFormatR32ui":
				return EatFormatR32ui;
			case "EatFormatRgb10a2ui":
				return EatFormatRgb10a2ui;
			case "EatFormatRg32ui":
				return EatFormatRg32ui;
			case "EatFormatRg16ui":
				return EatFormatRg16ui;
			case "EatFormatRg8ui":
				return EatFormatRg8ui;
			case "EatFormatR16ui":
				return EatFormatR16ui;
			case "EatFormatR8ui":
				return EatFormatR8ui;
			case "EatFormatUnknown":
				return EatFormatUnknown;
			case "EatNonWritable":
				return EatNonWritable;
			case "EatNonReadable":
				return EatNonReadable;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TAttributeType valueByConstant(int constant) {
		switch (constant) {
			case Main.EAT_NONE:
				return EatNone;
			case Main.EAT_ALLOW_UAV_CONDITION:
				return EatAllow_uav_condition;
			case Main.EAT_BRANCH:
				return EatBranch;
			case Main.EAT_CALL:
				return EatCall;
			case Main.EAT_DOMAIN:
				return EatDomain;
			case Main.EAT_EARLY_DEPTH_STENCIL:
				return EatEarlyDepthStencil;
			case Main.EAT_FAST_OPT:
				return EatFastOpt;
			case Main.EAT_FLATTEN:
				return EatFlatten;
			case Main.EAT_FORCE_CASE:
				return EatForceCase;
			case Main.EAT_INSTANCE:
				return EatInstance;
			case Main.EAT_MAX_TESS_FACTOR:
				return EatMaxTessFactor;
			case Main.EAT_NUM_THREADS:
				return EatNumThreads;
			case Main.EAT_MAX_VERTEX_COUNT:
				return EatMaxVertexCount;
			case Main.EAT_OUTPUT_CONTROL_POINTS:
				return EatOutputControlPoints;
			case Main.EAT_OUTPUT_TOPOLOGY:
				return EatOutputTopology;
			case Main.EAT_PARTITIONING:
				return EatPartitioning;
			case Main.EAT_PATCH_CONSTANT_FUNC:
				return EatPatchConstantFunc;
			case Main.EAT_PATCH_SIZE:
				return EatPatchSize;
			case Main.EAT_UNROLL:
				return EatUnroll;
			case Main.EAT_LOOP:
				return EatLoop;
			case Main.EAT_BINDING:
				return EatBinding;
			case Main.EAT_GLOBAL_BINDING:
				return EatGlobalBinding;
			case Main.EAT_LOCATION:
				return EatLocation;
			case Main.EAT_INPUT_ATTACHMENT:
				return EatInputAttachment;
			case Main.EAT_BUILTIN:
				return EatBuiltIn;
			case Main.EAT_PUSH_CONSTANT:
				return EatPushConstant;
			case Main.EAT_CONSTANT_ID:
				return EatConstantId;
			case Main.EAT_DEPENDENCY_INFINITE:
				return EatDependencyInfinite;
			case Main.EAT_DEPENDENCY_LENGTH:
				return EatDependencyLength;
			case Main.EAT_MIN_ITERATIONS:
				return EatMinIterations;
			case Main.EAT_MAX_ITERATIONS:
				return EatMaxIterations;
			case Main.EAT_ITERATION_MULTIPLE:
				return EatIterationMultiple;
			case Main.EAT_PEEL_COUNT:
				return EatPeelCount;
			case Main.EAT_PARTIAL_COUNT:
				return EatPartialCount;
			case Main.EAT_FORMAT_RGBA32F:
				return EatFormatRgba32f;
			case Main.EAT_FORMAT_RGBA16F:
				return EatFormatRgba16f;
			case Main.EAT_FORMAT_R32F:
				return EatFormatR32f;
			case Main.EAT_FORMAT_RGBA8:
				return EatFormatRgba8;
			case Main.EAT_FORMAT_RGBA8_SNORM:
				return EatFormatRgba8Snorm;
			case Main.EAT_FORMAT_RG32F:
				return EatFormatRg32f;
			case Main.EAT_FORMAT_RG16F:
				return EatFormatRg16f;
			case Main.EAT_FORMAT_R11F_G11F_B10F:
				return EatFormatR11fG11fB10f;
			case Main.EAT_FORMAT_R16F:
				return EatFormatR16f;
			case Main.EAT_FORMAT_RGBA16:
				return EatFormatRgba16;
			case Main.EAT_FORMAT_RGB10_A2:
				return EatFormatRgb10A2;
			case Main.EAT_FORMAT_RG16:
				return EatFormatRg16;
			case Main.EAT_FORMAT_RG8:
				return EatFormatRg8;
			case Main.EAT_FORMAT_R16:
				return EatFormatR16;
			case Main.EAT_FORMAT_R8:
				return EatFormatR8;
			case Main.EAT_FORMAT_RGBA16_SNORM:
				return EatFormatRgba16Snorm;
			case Main.EAT_FORMAT_RG16_SNORM:
				return EatFormatRg16Snorm;
			case Main.EAT_FORMAT_RG8_SNORM:
				return EatFormatRg8Snorm;
			case Main.EAT_FORMAT_R16_SNORM:
				return EatFormatR16Snorm;
			case Main.EAT_FORMAT_R8_SNORM:
				return EatFormatR8Snorm;
			case Main.EAT_FORMAT_RGBA32I:
				return EatFormatRgba32i;
			case Main.EAT_FORMAT_RGBA16I:
				return EatFormatRgba16i;
			case Main.EAT_FORMAT_RGBA8I:
				return EatFormatRgba8i;
			case Main.EAT_FORMAT_R32I:
				return EatFormatR32i;
			case Main.EAT_FORMAT_RG32I:
				return EatFormatRg32i;
			case Main.EAT_FORMAT_RG16I:
				return EatFormatRg16i;
			case Main.EAT_FORMAT_RG8I:
				return EatFormatRg8i;
			case Main.EAT_FORMAT_R16I:
				return EatFormatR16i;
			case Main.EAT_FORMAT_R8I:
				return EatFormatR8i;
			case Main.EAT_FORMAT_RGBA32UI:
				return EatFormatRgba32ui;
			case Main.EAT_FORMAT_RGBA16UI:
				return EatFormatRgba16ui;
			case Main.EAT_FORMAT_RGBA8UI:
				return EatFormatRgba8ui;
			case Main.EAT_FORMAT_R32UI:
				return EatFormatR32ui;
			case Main.EAT_FORMAT_RGB10A2UI:
				return EatFormatRgb10a2ui;
			case Main.EAT_FORMAT_RG32UI:
				return EatFormatRg32ui;
			case Main.EAT_FORMAT_RG16UI:
				return EatFormatRg16ui;
			case Main.EAT_FORMAT_RG8UI:
				return EatFormatRg8ui;
			case Main.EAT_FORMAT_R16UI:
				return EatFormatR16ui;
			case Main.EAT_FORMAT_R8UI:
				return EatFormatR8ui;
			case Main.EAT_FORMAT_UNKNOWN:
				return EatFormatUnknown;
			case Main.EAT_NON_WRITABLE:
				return EatNonWritable;
			case Main.EAT_NON_READABLE:
				return EatNonReadable;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
