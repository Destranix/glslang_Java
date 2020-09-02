package com.destranix.glslang;

public enum TExtensionBehavior {
	EBhMissing(Main.E_BH_MISSING),
	EBhRequire(Main.E_BH_REQUIRE),
	EBhEnable(Main.E_BH_ENABLE),
	EBhWarn(Main.E_BH_WARN),
	EBhDisable(Main.E_BH_DISABLE),
	EBhDisablePartial(Main.E_BH_DISABLE_PARTIAL);

	private final int value;

	private TExtensionBehavior(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TExtensionBehavior valueByStr(String str) {
		switch (str) {
			case "EBhMissing":
				return EBhMissing;
			case "EBhRequire":
				return EBhRequire;
			case "EBhEnable":
				return EBhEnable;
			case "EBhWarn":
				return EBhWarn;
			case "EBhDisable":
				return EBhDisable;
			case "EBhDisablePartial":
				return EBhDisablePartial;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TExtensionBehavior valueByConstant(int constant) {
		switch (constant) {
			case Main.E_BH_MISSING:
				return EBhMissing;
			case Main.E_BH_REQUIRE:
				return EBhRequire;
			case Main.E_BH_ENABLE:
				return EBhEnable;
			case Main.E_BH_WARN:
				return EBhWarn;
			case Main.E_BH_DISABLE:
				return EBhDisable;
			case Main.E_BH_DISABLE_PARTIAL:
				return EBhDisablePartial;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
