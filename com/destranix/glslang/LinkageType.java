package com.destranix.glslang;

public enum LinkageType {
	LinkageTypeExport(Main.LINKAGE_TYPE_EXPORT),
	LinkageTypeImport(Main.LINKAGE_TYPE_IMPORT),
	LinkageTypeMax(Main.LINKAGE_TYPE_MAX);

	private final int value;

	private LinkageType(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static LinkageType valueByStr(String str) {
		switch (str) {
			case "LinkageTypeExport":
				return LinkageTypeExport;
			case "LinkageTypeImport":
				return LinkageTypeImport;
			case "LinkageTypeMax":
				return LinkageTypeMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static LinkageType valueByConstant(int constant) {
		switch (constant) {
			case Main.LINKAGE_TYPE_EXPORT:
				return LinkageTypeExport;
			case Main.LINKAGE_TYPE_IMPORT:
				return LinkageTypeImport;
			case Main.LINKAGE_TYPE_MAX:
				return LinkageTypeMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
