package com.destranix.glslang;

public enum TVisit {
	EvPreVisit(Main.EV_PRE_VISIT), EvInVisit(Main.EV_IN_VISIT), EvPostVisit(Main.EV_POST_VISIT);

	private final int value;

	private TVisit(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TVisit valueByStr(String str) {
		switch (str) {
			case "EvPreVisit":
				return EvPreVisit;
			case "EvInVisit":
				return EvInVisit;
			case "EvPostVisit":
				return EvPostVisit;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TVisit valueByConstant(int constant) {
		switch (constant) {
			case Main.EV_PRE_VISIT:
				return EvPreVisit;
			case Main.EV_IN_VISIT:
				return EvInVisit;
			case Main.EV_POST_VISIT:
				return EvPostVisit;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
