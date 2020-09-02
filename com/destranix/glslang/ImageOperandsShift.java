package com.destranix.glslang;

public enum ImageOperandsShift {
	ImageOperandsBiasShift(Main.IMAGE_OPERANDS_BIAS_SHIFT),
	ImageOperandsLodShift(Main.IMAGE_OPERANDS_LOD_SHIFT),
	ImageOperandsGradShift(Main.IMAGE_OPERANDS_GRAD_SHIFT),
	ImageOperandsConstOffsetShift(Main.IMAGE_OPERANDS_CONST_OFFSET_SHIFT),
	ImageOperandsOffsetShift(Main.IMAGE_OPERANDS_OFFSET_SHIFT),
	ImageOperandsConstOffsetsShift(Main.IMAGE_OPERANDS_CONST_OFFSETS_SHIFT),
	ImageOperandsSampleShift(Main.IMAGE_OPERANDS_SAMPLE_SHIFT),
	ImageOperandsMinLodShift(Main.IMAGE_OPERANDS_MIN_LOD_SHIFT),
	ImageOperandsMakeTexelAvailableShift(Main.IMAGE_OPERANDS_MAKE_TEXEL_AVAILABLE_SHIFT),
	ImageOperandsMakeTexelAvailableKHRShift(Main.IMAGE_OPERANDS_MAKE_TEXEL_AVAILABLE_KHR_SHIFT),
	ImageOperandsMakeTexelVisibleShift(Main.IMAGE_OPERANDS_MAKE_TEXEL_VISIBLE_SHIFT),
	ImageOperandsMakeTexelVisibleKHRShift(Main.IMAGE_OPERANDS_MAKE_TEXEL_VISIBLE_KHR_SHIFT),
	ImageOperandsNonPrivateTexelShift(Main.IMAGE_OPERANDS_NON_PRIVATE_TEXEL_SHIFT),
	ImageOperandsNonPrivateTexelKHRShift(Main.IMAGE_OPERANDS_NON_PRIVATE_TEXEL_KHR_SHIFT),
	ImageOperandsVolatileTexelShift(Main.IMAGE_OPERANDS_VOLATILE_TEXEL_SHIFT),
	ImageOperandsVolatileTexelKHRShift(Main.IMAGE_OPERANDS_VOLATILE_TEXEL_KHR_SHIFT),
	ImageOperandsSignExtendShift(Main.IMAGE_OPERANDS_SIGN_EXTEND_SHIFT),
	ImageOperandsZeroExtendShift(Main.IMAGE_OPERANDS_ZERO_EXTEND_SHIFT),
	ImageOperandsMax(Main.IMAGE_OPERANDS_MAX);

	private final int value;

	private ImageOperandsShift(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static ImageOperandsShift valueByStr(String str) {
		switch (str) {
			case "ImageOperandsBiasShift":
				return ImageOperandsBiasShift;
			case "ImageOperandsLodShift":
				return ImageOperandsLodShift;
			case "ImageOperandsGradShift":
				return ImageOperandsGradShift;
			case "ImageOperandsConstOffsetShift":
				return ImageOperandsConstOffsetShift;
			case "ImageOperandsOffsetShift":
				return ImageOperandsOffsetShift;
			case "ImageOperandsConstOffsetsShift":
				return ImageOperandsConstOffsetsShift;
			case "ImageOperandsSampleShift":
				return ImageOperandsSampleShift;
			case "ImageOperandsMinLodShift":
				return ImageOperandsMinLodShift;
			case "ImageOperandsMakeTexelAvailableShift":
				return ImageOperandsMakeTexelAvailableShift;
			case "ImageOperandsMakeTexelAvailableKHRShift":
				return ImageOperandsMakeTexelAvailableKHRShift;
			case "ImageOperandsMakeTexelVisibleShift":
				return ImageOperandsMakeTexelVisibleShift;
			case "ImageOperandsMakeTexelVisibleKHRShift":
				return ImageOperandsMakeTexelVisibleKHRShift;
			case "ImageOperandsNonPrivateTexelShift":
				return ImageOperandsNonPrivateTexelShift;
			case "ImageOperandsNonPrivateTexelKHRShift":
				return ImageOperandsNonPrivateTexelKHRShift;
			case "ImageOperandsVolatileTexelShift":
				return ImageOperandsVolatileTexelShift;
			case "ImageOperandsVolatileTexelKHRShift":
				return ImageOperandsVolatileTexelKHRShift;
			case "ImageOperandsSignExtendShift":
				return ImageOperandsSignExtendShift;
			case "ImageOperandsZeroExtendShift":
				return ImageOperandsZeroExtendShift;
			case "ImageOperandsMax":
				return ImageOperandsMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static ImageOperandsShift valueByConstant(int constant) {
		switch (constant) {
			case Main.IMAGE_OPERANDS_BIAS_SHIFT:
				return ImageOperandsBiasShift;
			case Main.IMAGE_OPERANDS_LOD_SHIFT:
				return ImageOperandsLodShift;
			case Main.IMAGE_OPERANDS_GRAD_SHIFT:
				return ImageOperandsGradShift;
			case Main.IMAGE_OPERANDS_CONST_OFFSET_SHIFT:
				return ImageOperandsConstOffsetShift;
			case Main.IMAGE_OPERANDS_OFFSET_SHIFT:
				return ImageOperandsOffsetShift;
			case Main.IMAGE_OPERANDS_CONST_OFFSETS_SHIFT:
				return ImageOperandsConstOffsetsShift;
			case Main.IMAGE_OPERANDS_SAMPLE_SHIFT:
				return ImageOperandsSampleShift;
			case Main.IMAGE_OPERANDS_MIN_LOD_SHIFT:
				return ImageOperandsMinLodShift;
			case Main.IMAGE_OPERANDS_MAKE_TEXEL_AVAILABLE_SHIFT:
				return ImageOperandsMakeTexelAvailableShift;
			case Main.IMAGE_OPERANDS_MAKE_TEXEL_VISIBLE_SHIFT:
				return ImageOperandsMakeTexelVisibleShift;
			case Main.IMAGE_OPERANDS_NON_PRIVATE_TEXEL_SHIFT:
				return ImageOperandsNonPrivateTexelShift;
			case Main.IMAGE_OPERANDS_VOLATILE_TEXEL_SHIFT:
				return ImageOperandsVolatileTexelShift;
			case Main.IMAGE_OPERANDS_SIGN_EXTEND_SHIFT:
				return ImageOperandsSignExtendShift;
			case Main.IMAGE_OPERANDS_ZERO_EXTEND_SHIFT:
				return ImageOperandsZeroExtendShift;
			case Main.IMAGE_OPERANDS_MAX:
				return ImageOperandsMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
