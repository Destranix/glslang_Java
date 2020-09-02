package com.destranix.glslang;

public enum EShTargetLanguage {
	EShTargetNone(Main.E_SH_TARGET_NONE), EShTargetSpv(Main.E_SH_TARGET_SPV);

	private final int value;

	private EShTargetLanguage(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static EShTargetLanguage valueByStr(String str) {
		switch (str) {
			case "EShTargetNone":
				return EShTargetNone;
			case "EShTargetSpv":
			case "EshTargetSpv":
				return EShTargetSpv;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static EShTargetLanguage valueByConstant(int constant) {
		switch (constant) {
			case Main.E_SH_TARGET_NONE:
				return EShTargetNone;
			case Main.E_SH_TARGET_SPV:
				return EShTargetSpv;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
