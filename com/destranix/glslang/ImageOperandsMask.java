package com.destranix.glslang;

import java.util.EnumSet;

public enum ImageOperandsMask {
	ImageOperandsMaskNone(Main.IMAGE_OPERANDS_MASK_NONE),
	ImageOperandsBiasMask(Main.IMAGE_OPERANDS_BIAS_MASK),
	ImageOperandsLodMask(Main.IMAGE_OPERANDS_LOD_MASK),
	ImageOperandsGradMask(Main.IMAGE_OPERANDS_GRAD_MASK),
	ImageOperandsConstOffsetMask(Main.IMAGE_OPERANDS_CONST_OFFSET_MASK),
	ImageOperandsOffsetMask(Main.IMAGE_OPERANDS_OFFSET_MASK),
	ImageOperandsConstOffsetsMask(Main.IMAGE_OPERANDS_CONST_OFFSETS_MASK),
	ImageOperandsSampleMask(Main.IMAGE_OPERANDS_SAMPLE_MASK),
	ImageOperandsMinLodMask(Main.IMAGE_OPERANDS_MIN_LOD_MASK),
	ImageOperandsMakeTexelAvailableMask(Main.IMAGE_OPERANDS_MAKE_TEXEL_AVAILABLE_MASK),
	ImageOperandsMakeTexelAvailableKHRMask(Main.IMAGE_OPERANDS_MAKE_TEXEL_AVAILABLE_KHR_MASK),
	ImageOperandsMakeTexelVisibleMask(Main.IMAGE_OPERANDS_MAKE_TEXEL_VISIBLE_MASK),
	ImageOperandsMakeTexelVisibleKHRMask(Main.IMAGE_OPERANDS_MAKE_TEXEL_VISIBLE_KHR_MASK),
	ImageOperandsNonPrivateTexelMask(Main.IMAGE_OPERANDS_NON_PRIVATE_TEXEL_MASK),
	ImageOperandsNonPrivateTexelKHRMask(Main.IMAGE_OPERANDS_NON_PRIVATE_TEXEL_KHR_MASK),
	ImageOperandsVolatileTexelMask(Main.IMAGE_OPERANDS_VOLATILE_TEXEL_MASK),
	ImageOperandsVolatileTexelKHRMask(Main.IMAGE_OPERANDS_VOLATILE_TEXEL_KHR_MASK),
	ImageOperandsSignExtendMask(Main.IMAGE_OPERANDS_SIGN_EXTEND_MASK),
	ImageOperandsZeroExtendMask(Main.IMAGE_OPERANDS_ZERO_EXTEND_MASK);

	private final int value;

	private ImageOperandsMask(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static int setToInt(EnumSet<ImageOperandsMask> set) {
		int ret = 0;
		for (ImageOperandsMask val : set) {
			ret |= val.getConstant();
		}
		return ret;
	}

	public static ImageOperandsMask valueByStr(String str) {
		switch (str) {
			case "ImageOperandsMaskNone":
				return ImageOperandsMaskNone;
			case "ImageOperandsBiasMask":
				return ImageOperandsBiasMask;
			case "ImageOperandsLodMask":
				return ImageOperandsLodMask;
			case "ImageOperandsGradMask":
				return ImageOperandsGradMask;
			case "ImageOperandsConstOffsetMask":
				return ImageOperandsConstOffsetMask;
			case "ImageOperandsOffsetMask":
				return ImageOperandsOffsetMask;
			case "ImageOperandsConstOffsetsMask":
				return ImageOperandsConstOffsetsMask;
			case "ImageOperandsSampleMask":
				return ImageOperandsSampleMask;
			case "ImageOperandsMinLodMask":
				return ImageOperandsMinLodMask;
			case "ImageOperandsMakeTexelAvailableMask":
				return ImageOperandsMakeTexelAvailableMask;
			case "ImageOperandsMakeTexelAvailableKHRMask":
				return ImageOperandsMakeTexelAvailableKHRMask;
			case "ImageOperandsMakeTexelVisibleMask":
				return ImageOperandsMakeTexelVisibleMask;
			case "ImageOperandsMakeTexelVisibleKHRMask":
				return ImageOperandsMakeTexelVisibleKHRMask;
			case "ImageOperandsNonPrivateTexelMask":
				return ImageOperandsNonPrivateTexelMask;
			case "ImageOperandsNonPrivateTexelKHRMask":
				return ImageOperandsNonPrivateTexelKHRMask;
			case "ImageOperandsVolatileTexelMask":
				return ImageOperandsVolatileTexelMask;
			case "ImageOperandsVolatileTexelKHRMask":
				return ImageOperandsVolatileTexelKHRMask;
			case "ImageOperandsSignExtendMask":
				return ImageOperandsSignExtendMask;
			case "ImageOperandsZeroExtendMask":
				return ImageOperandsZeroExtendMask;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static ImageOperandsMask valueByConstant(int constant) {
		switch (constant) {
			case Main.IMAGE_OPERANDS_MASK_NONE:
				return ImageOperandsMaskNone;
			case Main.IMAGE_OPERANDS_BIAS_MASK:
				return ImageOperandsBiasMask;
			case Main.IMAGE_OPERANDS_LOD_MASK:
				return ImageOperandsLodMask;
			case Main.IMAGE_OPERANDS_GRAD_MASK:
				return ImageOperandsGradMask;
			case Main.IMAGE_OPERANDS_CONST_OFFSET_MASK:
				return ImageOperandsConstOffsetMask;
			case Main.IMAGE_OPERANDS_OFFSET_MASK:
				return ImageOperandsOffsetMask;
			case Main.IMAGE_OPERANDS_CONST_OFFSETS_MASK:
				return ImageOperandsConstOffsetsMask;
			case Main.IMAGE_OPERANDS_SAMPLE_MASK:
				return ImageOperandsSampleMask;
			case Main.IMAGE_OPERANDS_MIN_LOD_MASK:
				return ImageOperandsMinLodMask;
			case Main.IMAGE_OPERANDS_MAKE_TEXEL_AVAILABLE_MASK:
				return ImageOperandsMakeTexelAvailableMask;
			case Main.IMAGE_OPERANDS_MAKE_TEXEL_VISIBLE_MASK:
				return ImageOperandsMakeTexelVisibleMask;
			case Main.IMAGE_OPERANDS_NON_PRIVATE_TEXEL_MASK:
				return ImageOperandsNonPrivateTexelMask;
			case Main.IMAGE_OPERANDS_VOLATILE_TEXEL_MASK:
				return ImageOperandsVolatileTexelMask;
			case Main.IMAGE_OPERANDS_SIGN_EXTEND_MASK:
				return ImageOperandsSignExtendMask;
			case Main.IMAGE_OPERANDS_ZERO_EXTEND_MASK:
				return ImageOperandsZeroExtendMask;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
