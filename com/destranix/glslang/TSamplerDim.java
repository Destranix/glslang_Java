package com.destranix.glslang;

public enum TSamplerDim {
	EsdNone(Main.ESD_NONE),
	Esd1D(Main.ESD_1D),
	Esd2D(Main.ESD_2D),
	Esd3D(Main.ESD_3D),
	EsdCube(Main.ESD_CUBE),
	EsdRect(Main.ESD_RECT),
	EsdBuffer(Main.ESD_BUFFER),
	EsdSubpass(Main.ESD_SUBPASS);

	private final int value;

	private TSamplerDim(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TSamplerDim valueByStr(String str) {
		switch (str) {
			case "EsdNone":
				return EsdNone;
			case "Esd1D":
				return Esd1D;
			case "Esd2D":
				return Esd2D;
			case "Esd3D":
				return Esd3D;
			case "EsdCube":
				return EsdCube;
			case "EsdRect":
				return EsdRect;
			case "EsdBuffer":
				return EsdBuffer;
			case "EsdSubpass":
				return EsdSubpass;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TSamplerDim valueByConstant(int constant) {
		switch (constant) {
			case Main.ESD_NONE:
				return EsdNone;
			case Main.ESD_1D:
				return Esd1D;
			case Main.ESD_2D:
				return Esd2D;
			case Main.ESD_3D:
				return Esd3D;
			case Main.ESD_CUBE:
				return EsdCube;
			case Main.ESD_RECT:
				return EsdRect;
			case Main.ESD_BUFFER:
				return EsdBuffer;
			case Main.ESD_SUBPASS:
				return EsdSubpass;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
