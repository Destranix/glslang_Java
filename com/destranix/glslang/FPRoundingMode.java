package com.destranix.glslang;

public enum FPRoundingMode {
	FPRoundingModeRTE(Main.FP_ROUNDING_MODE_RTE),
	FPRoundingModeRTZ(Main.FP_ROUNDING_MODE_RTZ),
	FPRoundingModeRTP(Main.FP_ROUNDING_MODE_RTP),
	FPRoundingModeRTN(Main.FP_ROUNDING_MODE_RTN),
	FPRoundingModeMax(Main.FP_ROUNDING_MODE_MAX);

	private final int value;

	private FPRoundingMode(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static FPRoundingMode valueByStr(String str) {
		switch (str) {
			case "FPRoundingModeRTE":
				return FPRoundingModeRTE;
			case "FPRoundingModeRTZ":
				return FPRoundingModeRTZ;
			case "FPRoundingModeRTP":
				return FPRoundingModeRTP;
			case "FPRoundingModeRTN":
				return FPRoundingModeRTN;
			case "FPRoundingModeMax":
				return FPRoundingModeMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static FPRoundingMode valueByConstant(int constant) {
		switch (constant) {
			case Main.FP_ROUNDING_MODE_RTE:
				return FPRoundingModeRTE;
			case Main.FP_ROUNDING_MODE_RTZ:
				return FPRoundingModeRTZ;
			case Main.FP_ROUNDING_MODE_RTP:
				return FPRoundingModeRTP;
			case Main.FP_ROUNDING_MODE_RTN:
				return FPRoundingModeRTN;
			case Main.FP_ROUNDING_MODE_MAX:
				return FPRoundingModeMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
