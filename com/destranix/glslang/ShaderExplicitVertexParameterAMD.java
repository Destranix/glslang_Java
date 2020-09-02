package com.destranix.glslang;

public enum ShaderExplicitVertexParameterAMD {
	ShaderExplicitVertexParameterBadAMD(Main.SHADER_EXPLICIT_VERTEX_PARAMETER_BAD_AMD),
	InterpolateAtVertexAMD(Main.INTERPOLATE_AT_VERTEX_AMD);

	private final int value;

	private ShaderExplicitVertexParameterAMD(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static ShaderExplicitVertexParameterAMD valueByStr(String str) {
		switch (str) {
			case "ShaderExplicitVertexParameterBadAMD":
				return ShaderExplicitVertexParameterBadAMD;
			case "InterpolateAtVertexAMD":
				return InterpolateAtVertexAMD;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static ShaderExplicitVertexParameterAMD valueByConstant(int constant) {
		switch (constant) {
			case Main.SHADER_EXPLICIT_VERTEX_PARAMETER_BAD_AMD:
				return ShaderExplicitVertexParameterBadAMD;
			case Main.INTERPOLATE_AT_VERTEX_AMD:
				return InterpolateAtVertexAMD;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
