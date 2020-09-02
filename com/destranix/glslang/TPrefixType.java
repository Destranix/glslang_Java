package com.destranix.glslang;

public enum TPrefixType {
	EPrefixNone(Main.E_PREFIX_NONE),
	EPrefixWarning(Main.E_PREFIX_WARNING),
	EPrefixError(Main.E_PREFIX_ERROR),
	EPrefixInternalError(Main.E_PREFIX_INTERNAL_ERROR),
	EPrefixUnimplemented(Main.E_PREFIX_UNIMPLEMENTED),
	EPrefixNote(Main.E_PREFIX_NOTE);

	private final int value;

	private TPrefixType(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TPrefixType valueByStr(String str) {
		switch (str) {
			case "EPrefixNone ":
				return EPrefixNone;
			case "EPrefixWarning":
				return EPrefixWarning;
			case "EPrefixError ":
				return EPrefixError;
			case "EPrefixInternalError":
				return EPrefixInternalError;
			case "EPrefixUnimplemented":
				return EPrefixUnimplemented;
			case "EPrefixNote":
				return EPrefixNote;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TPrefixType valueByConstant(int constant) {
		switch (constant) {
			case Main.E_PREFIX_NONE:
				return EPrefixNone;
			case Main.E_PREFIX_WARNING:
				return EPrefixWarning;
			case Main.E_PREFIX_ERROR:
				return EPrefixError;
			case Main.E_PREFIX_INTERNAL_ERROR:
				return EPrefixInternalError;
			case Main.E_PREFIX_UNIMPLEMENTED:
				return EPrefixUnimplemented;
			case Main.E_PREFIX_NOTE:
				return EPrefixNote;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
