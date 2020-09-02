package Java;

public enum FunctionControlShift {
	FunctionControlInlineShift(Main.FUNCTION_CONTROL_INLINE_SHIFT),
	FunctionControlDontInlineShift(Main.FUNCTION_CONTROL_DONT_INLINE_SHIFT),
	FunctionControlPureShift(Main.FUNCTION_CONTROL_PURE_SHIFT),
	FunctionControlConstShift(Main.FUNCTION_CONTROL_CONST_SHIFT),
	FunctionControlMax(Main.FUNCTION_CONTROL_MAX);

	private final int value;

	private FunctionControlShift(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static FunctionControlShift valueByStr(String str) {
		switch (str) {
			case "FunctionControlInlineShift":
				return FunctionControlInlineShift;
			case "FunctionControlDontInlineShift":
				return FunctionControlDontInlineShift;
			case "FunctionControlPureShift":
				return FunctionControlPureShift;
			case "FunctionControlConstShift":
				return FunctionControlConstShift;
			case "FunctionControlMax":
				return FunctionControlMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static FunctionControlShift valueByConstant(int constant) {
		switch (constant) {
			case Main.FUNCTION_CONTROL_INLINE_SHIFT:
				return FunctionControlInlineShift;
			case Main.FUNCTION_CONTROL_DONT_INLINE_SHIFT:
				return FunctionControlDontInlineShift;
			case Main.FUNCTION_CONTROL_PURE_SHIFT:
				return FunctionControlPureShift;
			case Main.FUNCTION_CONTROL_CONST_SHIFT:
				return FunctionControlConstShift;
			case Main.FUNCTION_CONTROL_MAX:
				return FunctionControlMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
