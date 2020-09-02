package com.destranix.glslang;

public enum GlslangErrorMode {
	GlslangErrorModeNone(Main.GLSLANG_ERROR_MODE_NONE),
	GlslangErrorModeCode(Main.GLSLANG_ERROR_MODE_CODE),
	GlslangErrorModeException(Main.GLSLANG_ERROR_MODE_EXCEPTION);

	private final int value;

	private GlslangErrorMode(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static GlslangErrorMode valueByStr(String str) {
		switch (str) {
			case "GlslangErrorModeNone":
				return GlslangErrorModeNone;
			case "GlslangErrorModeCode":
				return GlslangErrorModeCode;
			case "GlslangErrorModeException":
				return GlslangErrorModeException;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static GlslangErrorMode valueByConstant(int constant) {
		switch (constant) {
			case Main.GLSLANG_ERROR_MODE_NONE:
				return GlslangErrorModeNone;
			case Main.GLSLANG_ERROR_MODE_CODE:
				return GlslangErrorModeCode;
			case Main.GLSLANG_ERROR_MODE_EXCEPTION:
				return GlslangErrorModeException;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
