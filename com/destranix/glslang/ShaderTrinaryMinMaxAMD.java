package com.destranix.glslang;

public enum ShaderTrinaryMinMaxAMD {
	ShaderTrinaryMinMaxBadAMD(Main.SHADER_TRINARY_MIN_MAX_BAD_AMD),
	FMin3AMD(Main.F_MIN3_AMD),
	UMin3AMD(Main.U_MIN3_AMD),
	SMin3AMD(Main.S_MIN3_AMD),
	FMax3AMD(Main.F_MAX3_AMD),
	UMax3AMD(Main.U_MAX3_AMD),
	SMax3AMD(Main.S_MAX3_AMD),
	FMid3AMD(Main.F_MID3_AMD),
	UMid3AMD(Main.U_MID3_AMD),
	SMid3AMD(Main.S_MID3_AMD);

	private final int value;

	private ShaderTrinaryMinMaxAMD(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static ShaderTrinaryMinMaxAMD valueByStr(String str) {
		switch (str) {
			case "ShaderTrinaryMinMaxBadAMD":
				return ShaderTrinaryMinMaxBadAMD;
			case "FMin3AMD":
				return FMin3AMD;
			case "UMin3AMD":
				return UMin3AMD;
			case "SMin3AMD":
				return SMin3AMD;
			case "FMax3AMD":
				return FMax3AMD;
			case "UMax3AMD":
				return UMax3AMD;
			case "SMax3AMD":
				return SMax3AMD;
			case "FMid3AMD":
				return FMid3AMD;
			case "UMid3AMD":
				return UMid3AMD;
			case "SMid3AMD":
				return SMid3AMD;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static ShaderTrinaryMinMaxAMD valueByConstant(int constant) {
		switch (constant) {
			case Main.SHADER_TRINARY_MIN_MAX_BAD_AMD:
				return ShaderTrinaryMinMaxBadAMD;
			case Main.F_MIN3_AMD:
				return FMin3AMD;
			case Main.U_MIN3_AMD:
				return UMin3AMD;
			case Main.S_MIN3_AMD:
				return SMin3AMD;
			case Main.F_MAX3_AMD:
				return FMax3AMD;
			case Main.U_MAX3_AMD:
				return UMax3AMD;
			case Main.S_MAX3_AMD:
				return SMax3AMD;
			case Main.F_MID3_AMD:
				return FMid3AMD;
			case Main.U_MID3_AMD:
				return UMid3AMD;
			case Main.S_MID3_AMD:
				return SMid3AMD;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
