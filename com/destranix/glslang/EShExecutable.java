package com.destranix.glslang;

public enum EShExecutable {
	EShExVertexFragment(Main.E_SH_EX_VERTEX_FRAGMENT), EShExFragment(Main.E_SH_EX_FRAGMENT);

	private final int value;

	private EShExecutable(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static EShExecutable valueByStr(String str) {
		switch (str) {
			case "EShExVertexFragment":
				return EShExVertexFragment;
			case "EShExFragment":
				return EShExFragment;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static EShExecutable valueByConstant(int constant) {
		switch (constant) {
			case Main.E_SH_EX_VERTEX_FRAGMENT:
				return EShExVertexFragment;
			case Main.E_SH_EX_FRAGMENT:
				return EShExFragment;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
