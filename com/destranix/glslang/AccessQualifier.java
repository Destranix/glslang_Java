package com.destranix.glslang;

public enum AccessQualifier {
	AccessQualifierReadOnly(Main.ACCESS_QUALIFIER_READ_ONLY),
	AccessQualifierWriteOnly(Main.ACCESS_QUALIFIER_WRITE_ONLY),
	AccessQualifierReadWrite(Main.ACCESS_QUALIFIER_READ_WRITE),
	AccessQualifierMax(Main.ACCESS_QUALIFIER_MAX);

	private final int value;

	private AccessQualifier(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static AccessQualifier valueByStr(String str) {
		switch (str) {
			case "AccessQualifierReadOnly":
				return AccessQualifierReadOnly;
			case "AccessQualifierWriteOnly":
				return AccessQualifierWriteOnly;
			case "AccessQualifierReadWrite":
				return AccessQualifierReadWrite;
			case "AccessQualifierMax":
				return AccessQualifierMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static AccessQualifier valueByConstant(int constant) {
		switch (constant) {
			case Main.ACCESS_QUALIFIER_READ_ONLY:
				return AccessQualifierReadOnly;
			case Main.ACCESS_QUALIFIER_WRITE_ONLY:
				return AccessQualifierWriteOnly;
			case Main.ACCESS_QUALIFIER_READ_WRITE:
				return AccessQualifierReadWrite;
			case Main.ACCESS_QUALIFIER_MAX:
				return AccessQualifierMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
