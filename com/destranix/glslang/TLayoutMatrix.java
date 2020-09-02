package com.destranix.glslang;

public enum TLayoutMatrix {
	ElmNone(Main.ELM_NONE), ElmRowMajor(Main.ELM_ROW_MAJOR), ElmColumnMajor(Main.ELM_COLUMN_MAJOR);

	private final int value;

	private TLayoutMatrix(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TLayoutMatrix valueByStr(String str) {
		switch (str) {
			case "ElmNone":
				return ElmNone;
			case "ElmRowMajor":
				return ElmRowMajor;
			case "ElmColumnMajor":
				return ElmColumnMajor;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TLayoutMatrix valueByConstant(int constant) {
		switch (constant) {
			case Main.ELM_NONE:
				return ElmNone;
			case Main.ELM_ROW_MAJOR:
				return ElmRowMajor;
			case Main.ELM_COLUMN_MAJOR:
				return ElmColumnMajor;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
