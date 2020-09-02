package Java;

public enum ImageFormat {
	ImageFormatUnknown(Main.IMAGE_FORMAT_UNKNOWN),
	ImageFormatRgba32f(Main.IMAGE_FORMAT_RGBA32F),
	ImageFormatRgba16f(Main.IMAGE_FORMAT_RGBA16F),
	ImageFormatR32f(Main.IMAGE_FORMAT_R32F),
	ImageFormatRgba8(Main.IMAGE_FORMAT_RGBA8),
	ImageFormatRgba8Snorm(Main.IMAGE_FORMAT_RGBA8_SNORM),
	ImageFormatRg32f(Main.IMAGE_FORMAT_RG32F),
	ImageFormatRg16f(Main.IMAGE_FORMAT_RG16F),
	ImageFormatR11fG11fB10f(Main.IMAGE_FORMAT_R11FG11FB10F),
	ImageFormatR16f(Main.IMAGE_FORMAT_R16F),
	ImageFormatRgba16(Main.IMAGE_FORMAT_RGBA16),
	ImageFormatRgb10A2(Main.IMAGE_FORMAT_RGB10A2),
	ImageFormatRg16(Main.IMAGE_FORMAT_RG16),
	ImageFormatRg8(Main.IMAGE_FORMAT_RG8),
	ImageFormatR16(Main.IMAGE_FORMAT_R16),
	ImageFormatR8(Main.IMAGE_FORMAT_R8),
	ImageFormatRgba16Snorm(Main.IMAGE_FORMAT_RGBA16_SNORM),
	ImageFormatRg16Snorm(Main.IMAGE_FORMAT_RG16_SNORM),
	ImageFormatRg8Snorm(Main.IMAGE_FORMAT_RG8_SNORM),
	ImageFormatR16Snorm(Main.IMAGE_FORMAT_R16_SNORM),
	ImageFormatR8Snorm(Main.IMAGE_FORMAT_R8_SNORM),
	ImageFormatRgba32i(Main.IMAGE_FORMAT_RGBA32I),
	ImageFormatRgba16i(Main.IMAGE_FORMAT_RGBA16I),
	ImageFormatRgba8i(Main.IMAGE_FORMAT_RGBA8I),
	ImageFormatR32i(Main.IMAGE_FORMAT_R32I),
	ImageFormatRg32i(Main.IMAGE_FORMAT_RG32I),
	ImageFormatRg16i(Main.IMAGE_FORMAT_RG16I),
	ImageFormatRg8i(Main.IMAGE_FORMAT_RG8I),
	ImageFormatR16i(Main.IMAGE_FORMAT_R16I),
	ImageFormatR8i(Main.IMAGE_FORMAT_R8I),
	ImageFormatRgba32ui(Main.IMAGE_FORMAT_RGBA32UI),
	ImageFormatRgba16ui(Main.IMAGE_FORMAT_RGBA16UI),
	ImageFormatRgba8ui(Main.IMAGE_FORMAT_RGBA8UI),
	ImageFormatR32ui(Main.IMAGE_FORMAT_R32UI),
	ImageFormatRgb10a2ui(Main.IMAGE_FORMAT_RGB10A2UI),
	ImageFormatRg32ui(Main.IMAGE_FORMAT_RG32UI),
	ImageFormatRg16ui(Main.IMAGE_FORMAT_RG16UI),
	ImageFormatRg8ui(Main.IMAGE_FORMAT_RG8UI),
	ImageFormatR16ui(Main.IMAGE_FORMAT_R16UI),
	ImageFormatR8ui(Main.IMAGE_FORMAT_R8UI),
	ImageFormatMax(Main.IMAGE_FORMAT_MAX);

	private final int value;

	private ImageFormat(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static ImageFormat valueByStr(String str) {
		switch (str) {
			case "ImageFormatUnknown":
				return ImageFormatUnknown;
			case "ImageFormatRgba32f":
				return ImageFormatRgba32f;
			case "ImageFormatRgba16f":
				return ImageFormatRgba16f;
			case "ImageFormatR32f":
				return ImageFormatR32f;
			case "ImageFormatRgba8":
				return ImageFormatRgba8;
			case "ImageFormatRgba8Snorm":
				return ImageFormatRgba8Snorm;
			case "ImageFormatRg32f":
				return ImageFormatRg32f;
			case "ImageFormatRg16f":
				return ImageFormatRg16f;
			case "ImageFormatR11fG11fB10f":
				return ImageFormatR11fG11fB10f;
			case "ImageFormatR16f":
				return ImageFormatR16f;
			case "ImageFormatRgba16":
				return ImageFormatRgba16;
			case "ImageFormatRgb10A2":
				return ImageFormatRgb10A2;
			case "ImageFormatRg16":
				return ImageFormatRg16;
			case "ImageFormatRg8":
				return ImageFormatRg8;
			case "ImageFormatR16":
				return ImageFormatR16;
			case "ImageFormatR8":
				return ImageFormatR8;
			case "ImageFormatRgba16Snorm":
				return ImageFormatRgba16Snorm;
			case "ImageFormatRg16Snorm":
				return ImageFormatRg16Snorm;
			case "ImageFormatRg8Snorm":
				return ImageFormatRg8Snorm;
			case "ImageFormatR16Snorm":
				return ImageFormatR16Snorm;
			case "ImageFormatR8Snorm":
				return ImageFormatR8Snorm;
			case "ImageFormatRgba32i":
				return ImageFormatRgba32i;
			case "ImageFormatRgba16i":
				return ImageFormatRgba16i;
			case "ImageFormatRgba8i":
				return ImageFormatRgba8i;
			case "ImageFormatR32i":
				return ImageFormatR32i;
			case "ImageFormatRg32i":
				return ImageFormatRg32i;
			case "ImageFormatRg16i":
				return ImageFormatRg16i;
			case "ImageFormatRg8i":
				return ImageFormatRg8i;
			case "ImageFormatR16i":
				return ImageFormatR16i;
			case "ImageFormatR8i":
				return ImageFormatR8i;
			case "ImageFormatRgba32ui":
				return ImageFormatRgba32ui;
			case "ImageFormatRgba16ui":
				return ImageFormatRgba16ui;
			case "ImageFormatRgba8ui":
				return ImageFormatRgba8ui;
			case "ImageFormatR32ui":
				return ImageFormatR32ui;
			case "ImageFormatRgb10a2ui":
				return ImageFormatRgb10a2ui;
			case "ImageFormatRg32ui":
				return ImageFormatRg32ui;
			case "ImageFormatRg16ui":
				return ImageFormatRg16ui;
			case "ImageFormatRg8ui":
				return ImageFormatRg8ui;
			case "ImageFormatR16ui":
				return ImageFormatR16ui;
			case "ImageFormatR8ui":
				return ImageFormatR8ui;
			case "ImageFormatMax":
				return ImageFormatMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static ImageFormat valueByConstant(int constant) {
		switch (constant) {
			case Main.IMAGE_FORMAT_UNKNOWN:
				return ImageFormatUnknown;
			case Main.IMAGE_FORMAT_RGBA32F:
				return ImageFormatRgba32f;
			case Main.IMAGE_FORMAT_RGBA16F:
				return ImageFormatRgba16f;
			case Main.IMAGE_FORMAT_R32F:
				return ImageFormatR32f;
			case Main.IMAGE_FORMAT_RGBA8:
				return ImageFormatRgba8;
			case Main.IMAGE_FORMAT_RGBA8_SNORM:
				return ImageFormatRgba8Snorm;
			case Main.IMAGE_FORMAT_RG32F:
				return ImageFormatRg32f;
			case Main.IMAGE_FORMAT_RG16F:
				return ImageFormatRg16f;
			case Main.IMAGE_FORMAT_R11FG11FB10F:
				return ImageFormatR11fG11fB10f;
			case Main.IMAGE_FORMAT_R16F:
				return ImageFormatR16f;
			case Main.IMAGE_FORMAT_RGBA16:
				return ImageFormatRgba16;
			case Main.IMAGE_FORMAT_RGB10A2:
				return ImageFormatRgb10A2;
			case Main.IMAGE_FORMAT_RG16:
				return ImageFormatRg16;
			case Main.IMAGE_FORMAT_RG8:
				return ImageFormatRg8;
			case Main.IMAGE_FORMAT_R16:
				return ImageFormatR16;
			case Main.IMAGE_FORMAT_R8:
				return ImageFormatR8;
			case Main.IMAGE_FORMAT_RGBA16_SNORM:
				return ImageFormatRgba16Snorm;
			case Main.IMAGE_FORMAT_RG16_SNORM:
				return ImageFormatRg16Snorm;
			case Main.IMAGE_FORMAT_RG8_SNORM:
				return ImageFormatRg8Snorm;
			case Main.IMAGE_FORMAT_R16_SNORM:
				return ImageFormatR16Snorm;
			case Main.IMAGE_FORMAT_R8_SNORM:
				return ImageFormatR8Snorm;
			case Main.IMAGE_FORMAT_RGBA32I:
				return ImageFormatRgba32i;
			case Main.IMAGE_FORMAT_RGBA16I:
				return ImageFormatRgba16i;
			case Main.IMAGE_FORMAT_RGBA8I:
				return ImageFormatRgba8i;
			case Main.IMAGE_FORMAT_R32I:
				return ImageFormatR32i;
			case Main.IMAGE_FORMAT_RG32I:
				return ImageFormatRg32i;
			case Main.IMAGE_FORMAT_RG16I:
				return ImageFormatRg16i;
			case Main.IMAGE_FORMAT_RG8I:
				return ImageFormatRg8i;
			case Main.IMAGE_FORMAT_R16I:
				return ImageFormatR16i;
			case Main.IMAGE_FORMAT_R8I:
				return ImageFormatR8i;
			case Main.IMAGE_FORMAT_RGBA32UI:
				return ImageFormatRgba32ui;
			case Main.IMAGE_FORMAT_RGBA16UI:
				return ImageFormatRgba16ui;
			case Main.IMAGE_FORMAT_RGBA8UI:
				return ImageFormatRgba8ui;
			case Main.IMAGE_FORMAT_R32UI:
				return ImageFormatR32ui;
			case Main.IMAGE_FORMAT_RGB10A2UI:
				return ImageFormatRgb10a2ui;
			case Main.IMAGE_FORMAT_RG32UI:
				return ImageFormatRg32ui;
			case Main.IMAGE_FORMAT_RG16UI:
				return ImageFormatRg16ui;
			case Main.IMAGE_FORMAT_RG8UI:
				return ImageFormatRg8ui;
			case Main.IMAGE_FORMAT_R16UI:
				return ImageFormatR16ui;
			case Main.IMAGE_FORMAT_R8UI:
				return ImageFormatR8ui;
			case Main.IMAGE_FORMAT_MAX:
				return ImageFormatMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
