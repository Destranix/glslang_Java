package com.destranix.glslang;

public enum TLayoutFormat {
	ElfNone(Main.ELF_NONE),
	ElfRgba32f(Main.ELF_RGBA32F),
	ElfRgba16f(Main.ELF_RGBA16F),
	ElfR32f(Main.ELF_R32F),
	ElfRgba8(Main.ELF_RGBA8),
	ElfRgba8Snorm(Main.ELF_RGBA8_SNORM),
	ElfEsFloatGuard(Main.ELF_ES_FLOAT_GUARD),
	ElfRg32f(Main.ELF_RG32F),
	ElfRg16f(Main.ELF_RG16F),
	ElfR11fG11fB10f(Main.ELF_R11F_G11F_B10F),
	ElfR16f(Main.ELF_R16F),
	ElfRgba16(Main.ELF_RGBA16),
	ElfRgb10A2(Main.ELF_RGB10A2),
	ElfRg16(Main.ELF_RG16),
	ElfRg8(Main.ELF_RG8),
	ElfR16(Main.ELF_R16),
	ElfR8(Main.ELF_R8),
	ElfRgba16Snorm(Main.ELF_RGBA16_SNORM),
	ElfRg16Snorm(Main.ELF_RG16_SNORM),
	ElfRg8Snorm(Main.ELF_RG8_SNORM),
	ElfR16Snorm(Main.ELF_R16_SNORM),
	ElfR8Snorm(Main.ELF_R8_SNORM),
	ElfFloatGuard(Main.ELF_FLOAT_GUARD),
	ElfRgba32i(Main.ELF_RGBA32I),
	ElfRgba16i(Main.ELF_RGBA16I),
	ElfRgba8i(Main.ELF_RGBA8I),
	ElfR32i(Main.ELF_R32I),
	ElfEsIntGuard(Main.ELF_ES_INT_GUARD),
	ElfRg32i(Main.ELF_RG32I),
	ElfRg16i(Main.ELF_RG16I),
	ElfRg8i(Main.ELF_RG8I),
	ElfR16i(Main.ELF_R16I),
	ElfR8i(Main.ELF_R8I),
	ElfIntGuard(Main.ELF_INT_GUARD),
	ElfRgba32ui(Main.ELF_RGBA32UI),
	ElfRgba16ui(Main.ELF_RGBA16UI),
	ElfRgba8ui(Main.ELF_RGBA8UI),
	ElfR32ui(Main.ELF_R32UI),
	ElfEsUintGuard(Main.ELF_ES_UINT_GUARD),
	ElfRg32ui(Main.ELF_RG32UI),
	ElfRg16ui(Main.ELF_RG16UI),
	ElfRgb10a2ui(Main.ELF_RGB10A2UI),
	ElfRg8ui(Main.ELF_RG8UI),
	ElfR16ui(Main.ELF_R16UI),
	ElfR8ui(Main.ELF_R8UI);

	private final int value;

	private TLayoutFormat(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TLayoutFormat valueByStr(String str) {
		switch (str) {
			case "ElfNone":
				return ElfNone;
			case "ElfRgba32f":
				return ElfRgba32f;
			case "ElfRgba16f":
				return ElfRgba16f;
			case "ElfR32f":
				return ElfR32f;
			case "ElfRgba8":
				return ElfRgba8;
			case "ElfRgba8Snorm":
				return ElfRgba8Snorm;
			case "ElfEsFloatGuard":
				return ElfEsFloatGuard;
			case "ElfRg32f":
				return ElfRg32f;
			case "ElfRg16f":
				return ElfRg16f;
			case "ElfR11fG11fB10f":
				return ElfR11fG11fB10f;
			case "ElfR16f":
				return ElfR16f;
			case "ElfRgba16":
				return ElfRgba16;
			case "ElfRgb10A2":
				return ElfRgb10A2;
			case "ElfRg16":
				return ElfRg16;
			case "ElfRg8":
				return ElfRg8;
			case "ElfR16":
				return ElfR16;
			case "ElfR8":
				return ElfR8;
			case "ElfRgba16Snorm":
				return ElfRgba16Snorm;
			case "ElfRg16Snorm":
				return ElfRg16Snorm;
			case "ElfRg8Snorm":
				return ElfRg8Snorm;
			case "ElfR16Snorm":
				return ElfR16Snorm;
			case "ElfR8Snorm":
				return ElfR8Snorm;
			case "ElfFloatGuard":
				return ElfFloatGuard;
			case "ElfRgba32i":
				return ElfRgba32i;
			case "ElfRgba16i":
				return ElfRgba16i;
			case "ElfRgba8i":
				return ElfRgba8i;
			case "ElfR32i":
				return ElfR32i;
			case "ElfEsIntGuard":
				return ElfEsIntGuard;
			case "ElfRg32i":
				return ElfRg32i;
			case "ElfRg16i":
				return ElfRg16i;
			case "ElfRg8i":
				return ElfRg8i;
			case "ElfR16i":
				return ElfR16i;
			case "ElfR8i":
				return ElfR8i;
			case "ElfIntGuard":
				return ElfIntGuard;
			case "ElfRgba32ui":
				return ElfRgba32ui;
			case "ElfRgba16ui":
				return ElfRgba16ui;
			case "ElfRgba8ui":
				return ElfRgba8ui;
			case "ElfR32ui":
				return ElfR32ui;
			case "ElfEsUintGuard":
				return ElfEsUintGuard;
			case "ElfRg32ui":
				return ElfRg32ui;
			case "ElfRg16ui":
				return ElfRg16ui;
			case "ElfRgb10a2ui":
				return ElfRgb10a2ui;
			case "ElfRg8ui":
				return ElfRg8ui;
			case "ElfR16ui":
				return ElfR16ui;
			case "ElfR8ui":
				return ElfR8ui;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TLayoutFormat valueByConstant(int constant) {
		switch (constant) {
			case Main.ELF_NONE:
				return ElfNone;
			case Main.ELF_RGBA32F:
				return ElfRgba32f;
			case Main.ELF_RGBA16F:
				return ElfRgba16f;
			case Main.ELF_R32F:
				return ElfR32f;
			case Main.ELF_RGBA8:
				return ElfRgba8;
			case Main.ELF_RGBA8_SNORM:
				return ElfRgba8Snorm;
			case Main.ELF_ES_FLOAT_GUARD:
				return ElfEsFloatGuard;
			case Main.ELF_RG32F:
				return ElfRg32f;
			case Main.ELF_RG16F:
				return ElfRg16f;
			case Main.ELF_R11F_G11F_B10F:
				return ElfR11fG11fB10f;
			case Main.ELF_R16F:
				return ElfR16f;
			case Main.ELF_RGBA16:
				return ElfRgba16;
			case Main.ELF_RGB10A2:
				return ElfRgb10A2;
			case Main.ELF_RG16:
				return ElfRg16;
			case Main.ELF_RG8:
				return ElfRg8;
			case Main.ELF_R16:
				return ElfR16;
			case Main.ELF_R8:
				return ElfR8;
			case Main.ELF_RGBA16_SNORM:
				return ElfRgba16Snorm;
			case Main.ELF_RG16_SNORM:
				return ElfRg16Snorm;
			case Main.ELF_RG8_SNORM:
				return ElfRg8Snorm;
			case Main.ELF_R16_SNORM:
				return ElfR16Snorm;
			case Main.ELF_R8_SNORM:
				return ElfR8Snorm;
			case Main.ELF_FLOAT_GUARD:
				return ElfFloatGuard;
			case Main.ELF_RGBA32I:
				return ElfRgba32i;
			case Main.ELF_RGBA16I:
				return ElfRgba16i;
			case Main.ELF_RGBA8I:
				return ElfRgba8i;
			case Main.ELF_R32I:
				return ElfR32i;
			case Main.ELF_ES_INT_GUARD:
				return ElfEsIntGuard;
			case Main.ELF_RG32I:
				return ElfRg32i;
			case Main.ELF_RG16I:
				return ElfRg16i;
			case Main.ELF_RG8I:
				return ElfRg8i;
			case Main.ELF_R16I:
				return ElfR16i;
			case Main.ELF_R8I:
				return ElfR8i;
			case Main.ELF_INT_GUARD:
				return ElfIntGuard;
			case Main.ELF_RGBA32UI:
				return ElfRgba32ui;
			case Main.ELF_RGBA16UI:
				return ElfRgba16ui;
			case Main.ELF_RGBA8UI:
				return ElfRgba8ui;
			case Main.ELF_R32UI:
				return ElfR32ui;
			case Main.ELF_ES_UINT_GUARD:
				return ElfEsUintGuard;
			case Main.ELF_RG32UI:
				return ElfRg32ui;
			case Main.ELF_RG16UI:
				return ElfRg16ui;
			case Main.ELF_RGB10A2UI:
				return ElfRgb10a2ui;
			case Main.ELF_RG8UI:
				return ElfRg8ui;
			case Main.ELF_R16UI:
				return ElfR16ui;
			case Main.ELF_R8UI:
				return ElfR8ui;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
