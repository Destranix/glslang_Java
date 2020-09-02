package Java;

public enum FPFastMathModeShift {
	FPFastMathModeNotNaNShift(Main.FP_FAST_MATH_MODE_NOT_NAN_SHIFT),
	FPFastMathModeNotInfShift(Main.FP_FAST_MATH_MODE_NOT_INF_SHIFT),
	FPFastMathModeNSZShift(Main.FP_FAST_MATH_MODE_NSZ_SHIFT),
	FPFastMathModeAllowRecipShift(Main.FP_FAST_MATH_MODE_ALLOW_RECIP_SHIFT),
	FPFastMathModeFastShift(Main.FP_FAST_MATH_MODE_FAST_SHIFT),
	FPFastMathModeMax(Main.FP_FAST_MATH_MODE_MAX);

	private final int value;

	private FPFastMathModeShift(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static FPFastMathModeShift valueByStr(String str) {
		switch (str) {
			case "FPFastMathModeNotNaNShift":
				return FPFastMathModeNotNaNShift;
			case "FPFastMathModeNotInfShift":
				return FPFastMathModeNotInfShift;
			case "FPFastMathModeNSZShift":
				return FPFastMathModeNSZShift;
			case "FPFastMathModeAllowRecipShift":
				return FPFastMathModeAllowRecipShift;
			case "FPFastMathModeFastShift":
				return FPFastMathModeFastShift;
			case "FPFastMathModeMax":
				return FPFastMathModeMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static FPFastMathModeShift valueByConstant(int constant) {
		switch (constant) {
			case Main.FP_FAST_MATH_MODE_NOT_NAN_SHIFT:
				return FPFastMathModeNotNaNShift;
			case Main.FP_FAST_MATH_MODE_NOT_INF_SHIFT:
				return FPFastMathModeNotInfShift;
			case Main.FP_FAST_MATH_MODE_NSZ_SHIFT:
				return FPFastMathModeNSZShift;
			case Main.FP_FAST_MATH_MODE_ALLOW_RECIP_SHIFT:
				return FPFastMathModeAllowRecipShift;
			case Main.FP_FAST_MATH_MODE_FAST_SHIFT:
				return FPFastMathModeFastShift;
			case Main.FP_FAST_MATH_MODE_MAX:
				return FPFastMathModeMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
