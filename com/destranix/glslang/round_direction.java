package com.destranix.glslang;

public enum round_direction {
	kRoundToZero(Main.KROUND_TO_ZERO),
	kRoundToNearestEven(Main.KROUND_TO_NEAREST_EVEN),
	kRoundToPositiveInfinity(Main.KROUND_TO_POSITIVE_INFINITY),
	kRoundToNegativeInfinity(Main.KROUND_TO_NEGATIVE_INFINITY);

	private final int value;

	private round_direction(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static round_direction valueByStr(String str) {
		switch (str) {
			case "kRoundToZero":
				return kRoundToZero;
			case "kRoundToNearestEven":
				return kRoundToNearestEven;
			case "kRoundToPositiveInfinity":
				return kRoundToPositiveInfinity;
			case "kRoundToNegativeInfinity":
				return kRoundToNegativeInfinity;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static round_direction valueByConstant(int constant) {
		switch (constant) {
			case Main.KROUND_TO_ZERO:
				return kRoundToZero;
			case Main.KROUND_TO_NEAREST_EVEN:
				return kRoundToNearestEven;
			case Main.KROUND_TO_POSITIVE_INFINITY:
				return kRoundToPositiveInfinity;
			case Main.KROUND_TO_NEGATIVE_INFINITY:
				return kRoundToNegativeInfinity;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
