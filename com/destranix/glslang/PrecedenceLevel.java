package com.destranix.glslang;

public enum PrecedenceLevel {
	PlBad(Main.PL_BAD),
	PlLogicalOr(Main.PL_LOGICAL_OR),
	PlLogicalXor(Main.PL_LOGICAL_XOR),
	PlLogicalAnd(Main.PL_LOGICAL_AND),
	PlBitwiseOr(Main.PL_BITWISE_OR),
	PlBitwiseXor(Main.PL_BITWISE_XOR),
	PlBitwiseAnd(Main.PL_BITWISE_AND),
	PlEquality(Main.PL_EQUALITY),
	PlRelational(Main.PL_RELATIONAL),
	PlShift(Main.PL_SHIFT),
	PlAdd(Main.PL_ADD),
	PlMul(Main.PL_MUL);

	private final int value;

	private PrecedenceLevel(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static PrecedenceLevel valueByStr(String str) {
		switch (str) {
			case "PlBad":
				return PlBad;
			case "PlLogicalOr":
				return PlLogicalOr;
			case "PlLogicalXor":
				return PlLogicalXor;
			case "PlLogicalAnd":
				return PlLogicalAnd;
			case "PlBitwiseOr":
				return PlBitwiseOr;
			case "PlBitwiseXor":
				return PlBitwiseXor;
			case "PlBitwiseAnd":
				return PlBitwiseAnd;
			case "PlEquality":
				return PlEquality;
			case "PlRelational":
				return PlRelational;
			case "PlShift":
				return PlShift;
			case "PlAdd":
				return PlAdd;
			case "PlMul":
				return PlMul;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static PrecedenceLevel valueByConstant(int constant) {
		switch (constant) {
			case Main.PL_BAD:
				return PlBad;
			case Main.PL_LOGICAL_OR:
				return PlLogicalOr;
			case Main.PL_LOGICAL_XOR:
				return PlLogicalXor;
			case Main.PL_LOGICAL_AND:
				return PlLogicalAnd;
			case Main.PL_BITWISE_OR:
				return PlBitwiseOr;
			case Main.PL_BITWISE_XOR:
				return PlBitwiseXor;
			case Main.PL_BITWISE_AND:
				return PlBitwiseAnd;
			case Main.PL_EQUALITY:
				return PlEquality;
			case Main.PL_RELATIONAL:
				return PlRelational;
			case Main.PL_SHIFT:
				return PlShift;
			case Main.PL_ADD:
				return PlAdd;
			case Main.PL_MUL:
				return PlMul;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
