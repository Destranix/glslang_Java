package com.destranix.glslang;

public enum ComputeDerivativeMode {
	LayoutDerivativeNone(Main.LAYOUT_DERIVATIVE_NONE),
	LayoutDerivativeGroupQuads(Main.LAYOUT_DERIVATIVE_GROUP_QUADS),
	LayoutDerivativeGroupLinear(Main.LAYOUT_DERIVATIVE_GROUP_LINEAR);

	private final int value;

	private ComputeDerivativeMode(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static ComputeDerivativeMode valueByStr(String str) {
		switch (str) {
			case "LayoutDerivativeNone":
				return LayoutDerivativeNone;
			case "LayoutDerivativeGroupQuads":
				return LayoutDerivativeGroupQuads;
			case "LayoutDerivativeGroupLinear":
				return LayoutDerivativeGroupLinear;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static ComputeDerivativeMode valueByConstant(int constant) {
		switch (constant) {
			case Main.LAYOUT_DERIVATIVE_NONE:
				return LayoutDerivativeNone;
			case Main.LAYOUT_DERIVATIVE_GROUP_QUADS:
				return LayoutDerivativeGroupQuads;
			case Main.LAYOUT_DERIVATIVE_GROUP_LINEAR:
				return LayoutDerivativeGroupLinear;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
