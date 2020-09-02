package com.destranix.glslang;

public enum TVertexOrder {
	EvoNone(Main.EVO_NONE), EvoCw(Main.EVO_CW), EvoCcw(Main.EVO_CCW);

	private final int value;

	private TVertexOrder(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TVertexOrder valueByStr(String str) {
		switch (str) {
			case "EvoNone":
				return EvoNone;
			case "EvoCw":
				return EvoCw;
			case "EvoCcw":
				return EvoCcw;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TVertexOrder valueByConstant(int constant) {
		switch (constant) {
			case Main.EVO_NONE:
				return EvoNone;
			case Main.EVO_CW:
				return EvoCw;
			case Main.EVO_CCW:
				return EvoCcw;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
