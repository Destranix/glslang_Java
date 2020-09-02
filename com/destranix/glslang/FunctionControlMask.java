package com.destranix.glslang;

import java.util.EnumSet;

public enum FunctionControlMask {
	FunctionControlMaskNone(Main.FUNCTION_CONTROL_MASK_NONE),
	FunctionControlInlineMask(Main.FUNCTION_CONTROL_INLINE_MASK),
	FunctionControlDontInlineMask(Main.FUNCTION_CONTROL_DONT_INLINE_MASK),
	FunctionControlPureMask(Main.FUNCTION_CONTROL_PURE_MASK),
	FunctionControlConstMask(Main.FUNCTION_CONTROL_CONST_MASK);

	private final int value;

	private FunctionControlMask(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static int setToInt(EnumSet<FunctionControlMask> set) {
		int ret = 0;
		for (FunctionControlMask val : set) {
			ret |= val.getConstant();
		}
		return ret;
	}

	public static FunctionControlMask valueByStr(String str) {
		switch (str) {
			case "FunctionControlMaskNone":
				return FunctionControlMaskNone;
			case "FunctionControlInlineMask":
				return FunctionControlInlineMask;
			case "FunctionControlDontInlineMask":
				return FunctionControlDontInlineMask;
			case "FunctionControlPureMask":
				return FunctionControlPureMask;
			case "FunctionControlConstMask":
				return FunctionControlConstMask;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static FunctionControlMask valueByConstant(int constant) {
		switch (constant) {
			case Main.FUNCTION_CONTROL_MASK_NONE:
				return FunctionControlMaskNone;
			case Main.FUNCTION_CONTROL_INLINE_MASK:
				return FunctionControlInlineMask;
			case Main.FUNCTION_CONTROL_DONT_INLINE_MASK:
				return FunctionControlDontInlineMask;
			case Main.FUNCTION_CONTROL_PURE_MASK:
				return FunctionControlPureMask;
			case Main.FUNCTION_CONTROL_CONST_MASK:
				return FunctionControlConstMask;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
