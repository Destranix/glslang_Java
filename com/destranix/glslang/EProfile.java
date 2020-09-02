package com.destranix.glslang;

public enum EProfile {
	EBadProfile(Main.E_BAD_PROFILE),
	ENoProfile(Main.E_NO_PROFILE),
	ECoreProfile(Main.E_CORE_PROFILE),
	ECompatibilityProfile(Main.E_COMPATIBILITY_PROFILE),
	EEsProfile(Main.E_ES_PROFILE);

	private final int value;

	private EProfile(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static EProfile valueByStr(String str) {
		switch (str) {
			case "EBadProfile":
				return EBadProfile;
			case "ENoProfile":
				return ENoProfile;
			case "ECoreProfile":
				return ECoreProfile;
			case "ECompatibilityProfile":
				return ECompatibilityProfile;
			case "EEsProfile":
				return EEsProfile;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static EProfile valueByConstant(int constant) {
		switch (constant) {
			case Main.E_BAD_PROFILE:
				return EBadProfile;
			case Main.E_NO_PROFILE:
				return ENoProfile;
			case Main.E_CORE_PROFILE:
				return ECoreProfile;
			case Main.E_COMPATIBILITY_PROFILE:
				return ECompatibilityProfile;
			case Main.E_ES_PROFILE:
				return EEsProfile;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
