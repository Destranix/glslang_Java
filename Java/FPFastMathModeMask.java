package Java;

import java.util.EnumSet;

public enum FPFastMathModeMask {
	FPFastMathModeMaskNone(Main.FP_FAST_MATH_MODE_MASK_NONE),
	FPFastMathModeNotNaNMask(Main.FP_FAST_MATH_MODE_NOT_NAN_MASK),
	FPFastMathModeNotInfMask(Main.FP_FAST_MATH_MODE_NOT_INF_MASK),
	FPFastMathModeNSZMask(Main.FP_FAST_MATH_MODE_NSZ_MASK),
	FPFastMathModeAllowRecipMask(Main.FP_FAST_MATH_MODE_ALLOW_RECIP_MASK),
	FPFastMathModeFastMask(Main.FP_FAST_MATH_MODE_FAST_MASK);

	private final int value;

	private FPFastMathModeMask(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static int setToInt(EnumSet<FPFastMathModeMask> set) {
		int ret = 0;
		for (FPFastMathModeMask val : set) {
			ret |= val.getConstant();
		}
		return ret;
	}

	public static FPFastMathModeMask valueByStr(String str) {
		switch (str) {
			case "FPFastMathModeMaskNone":
				return FPFastMathModeMaskNone;
			case "FPFastMathModeNotNaNMask":
				return FPFastMathModeNotNaNMask;
			case "FPFastMathModeNotInfMask":
				return FPFastMathModeNotInfMask;
			case "FPFastMathModeNSZMask":
				return FPFastMathModeNSZMask;
			case "FPFastMathModeAllowRecipMask":
				return FPFastMathModeAllowRecipMask;
			case "FPFastMathModeFastMask":
				return FPFastMathModeFastMask;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static FPFastMathModeMask valueByConstant(int constant) {
		switch (constant) {
			case Main.FP_FAST_MATH_MODE_MASK_NONE:
				return FPFastMathModeMaskNone;
			case Main.FP_FAST_MATH_MODE_NOT_NAN_MASK:
				return FPFastMathModeNotNaNMask;
			case Main.FP_FAST_MATH_MODE_NOT_INF_MASK:
				return FPFastMathModeNotInfMask;
			case Main.FP_FAST_MATH_MODE_NSZ_MASK:
				return FPFastMathModeNSZMask;
			case Main.FP_FAST_MATH_MODE_ALLOW_RECIP_MASK:
				return FPFastMathModeAllowRecipMask;
			case Main.FP_FAST_MATH_MODE_FAST_MASK:
				return FPFastMathModeFastMask;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
