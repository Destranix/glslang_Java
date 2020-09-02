package com.destranix.glslang;

public enum ShaderBallotAMD {
	ShaderBallotBadAMD(Main.SHADER_BALLOT_BAD_AMD),
	SwizzleInvocationsAMD(Main.SWIZZLE_INVOCATIONS_AMD),
	SwizzleInvocationsMaskedAMD(Main.SWIZZLE_INVOCATIONS_MASKED_AMD),
	WriteInvocationAMD(Main.WRITE_INVOCATION_AMD),
	MbcntAMD(Main.MBCNT_AMD);

	private final int value;

	private ShaderBallotAMD(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static ShaderBallotAMD valueByStr(String str) {
		switch (str) {
			case "ShaderBallotBadAMD":
				return ShaderBallotBadAMD;
			case "SwizzleInvocationsAMD":
				return SwizzleInvocationsAMD;
			case "SwizzleInvocationsMaskedAMD":
				return SwizzleInvocationsMaskedAMD;
			case "WriteInvocationAMD":
				return WriteInvocationAMD;
			case "MbcntAMD":
				return MbcntAMD;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static ShaderBallotAMD valueByConstant(int constant) {
		switch (constant) {
			case Main.SHADER_BALLOT_BAD_AMD:
				return ShaderBallotBadAMD;
			case Main.SWIZZLE_INVOCATIONS_AMD:
				return SwizzleInvocationsAMD;
			case Main.SWIZZLE_INVOCATIONS_MASKED_AMD:
				return SwizzleInvocationsMaskedAMD;
			case Main.WRITE_INVOCATION_AMD:
				return WriteInvocationAMD;
			case Main.MBCNT_AMD:
				return MbcntAMD;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
