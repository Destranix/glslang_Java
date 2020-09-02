package com.destranix.glslang;

public enum FunctionParameterAttribute {
	FunctionParameterAttributeZext(Main.FUNCTION_PARAMETER_ATTRIBUTE_ZEXT),
	FunctionParameterAttributeSext(Main.FUNCTION_PARAMETER_ATTRIBUTE_SEXT),
	FunctionParameterAttributeByVal(Main.FUNCTION_PARAMETER_ATTRIBUTE_BY_VAL),
	FunctionParameterAttributeSret(Main.FUNCTION_PARAMETER_ATTRIBUTE_SRET),
	FunctionParameterAttributeNoAlias(Main.FUNCTION_PARAMETER_ATTRIBUTE_NO_ALIAS),
	FunctionParameterAttributeNoCapture(Main.FUNCTION_PARAMETER_ATTRIBUTE_NO_CAPTURE),
	FunctionParameterAttributeNoWrite(Main.FUNCTION_PARAMETER_ATTRIBUTE_NO_WRITE),
	FunctionParameterAttributeNoReadWrite(Main.FUNCTION_PARAMETER_ATTRIBUTE_NO_READ_WRITE),
	FunctionParameterAttributeMax(Main.FUNCTION_PARAMETER_ATTRIBUTE_MAX);

	private final int value;

	private FunctionParameterAttribute(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static FunctionParameterAttribute valueByStr(String str) {
		switch (str) {
			case "FunctionParameterAttributeZext":
				return FunctionParameterAttributeZext;
			case "FunctionParameterAttributeSext":
				return FunctionParameterAttributeSext;
			case "FunctionParameterAttributeByVal":
				return FunctionParameterAttributeByVal;
			case "FunctionParameterAttributeSret":
				return FunctionParameterAttributeSret;
			case "FunctionParameterAttributeNoAlias":
				return FunctionParameterAttributeNoAlias;
			case "FunctionParameterAttributeNoCapture":
				return FunctionParameterAttributeNoCapture;
			case "FunctionParameterAttributeNoWrite":
				return FunctionParameterAttributeNoWrite;
			case "FunctionParameterAttributeNoReadWrite":
				return FunctionParameterAttributeNoReadWrite;
			case "FunctionParameterAttributeMax":
				return FunctionParameterAttributeMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static FunctionParameterAttribute valueByConstant(int constant) {
		switch (constant) {
			case Main.FUNCTION_PARAMETER_ATTRIBUTE_ZEXT:
				return FunctionParameterAttributeZext;
			case Main.FUNCTION_PARAMETER_ATTRIBUTE_SEXT:
				return FunctionParameterAttributeSext;
			case Main.FUNCTION_PARAMETER_ATTRIBUTE_BY_VAL:
				return FunctionParameterAttributeByVal;
			case Main.FUNCTION_PARAMETER_ATTRIBUTE_SRET:
				return FunctionParameterAttributeSret;
			case Main.FUNCTION_PARAMETER_ATTRIBUTE_NO_ALIAS:
				return FunctionParameterAttributeNoAlias;
			case Main.FUNCTION_PARAMETER_ATTRIBUTE_NO_CAPTURE:
				return FunctionParameterAttributeNoCapture;
			case Main.FUNCTION_PARAMETER_ATTRIBUTE_NO_WRITE:
				return FunctionParameterAttributeNoWrite;
			case Main.FUNCTION_PARAMETER_ATTRIBUTE_NO_READ_WRITE:
				return FunctionParameterAttributeNoReadWrite;
			case Main.FUNCTION_PARAMETER_ATTRIBUTE_MAX:
				return FunctionParameterAttributeMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
