package com.destranix.glslang;

public enum TLayoutPacking {
	ElpNone(Main.ELP_NONE),
	ElpShared(Main.ELP_SHARED),
	ElpStd140(Main.ELP_STD140),
	ElpStd430(Main.ELP_STD430),
	ElpPacked(Main.ELP_PACKED),
	ElpScalar(Main.ELP_SCALAR);

	private final int value;

	private TLayoutPacking(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TLayoutPacking valueByStr(String str) {
		switch (str) {
			case "ElpNone":
				return ElpNone;
			case "ElpShared":
				return ElpShared;
			case "ElpStd140":
				return ElpStd140;
			case "ElpStd430":
				return ElpStd430;
			case "ElpPacked":
				return ElpPacked;
			case "ElpScalar":
				return ElpScalar;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TLayoutPacking valueByConstant(int constant) {
		switch (constant) {
			case Main.ELP_NONE:
				return ElpNone;
			case Main.ELP_SHARED:
				return ElpShared;
			case Main.ELP_STD140:
				return ElpStd140;
			case Main.ELP_STD430:
				return ElpStd430;
			case Main.ELP_PACKED:
				return ElpPacked;
			case Main.ELP_SCALAR:
				return ElpScalar;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
