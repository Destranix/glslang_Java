package com.destranix.glslang;

public enum SamplerFilterMode {
	SamplerFilterModeNearest(Main.SAMPLER_FILTER_MODE_NEAREST),
	SamplerFilterModeLinear(Main.SAMPLER_FILTER_MODE_LINEAR),
	SamplerFilterModeMax(Main.SAMPLER_FILTER_MODE_MAX);

	private final int value;

	private SamplerFilterMode(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static SamplerFilterMode valueByStr(String str) {
		switch (str) {
			case "SamplerFilterModeNearest":
				return SamplerFilterModeNearest;
			case "SamplerFilterModeLinear":
				return SamplerFilterModeLinear;
			case "SamplerFilterModeMax":
				return SamplerFilterModeMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static SamplerFilterMode valueByConstant(int constant) {
		switch (constant) {
			case Main.SAMPLER_FILTER_MODE_NEAREST:
				return SamplerFilterModeNearest;
			case Main.SAMPLER_FILTER_MODE_LINEAR:
				return SamplerFilterModeLinear;
			case Main.SAMPLER_FILTER_MODE_MAX:
				return SamplerFilterModeMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
