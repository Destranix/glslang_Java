package Java;

public enum ImageChannelOrder {
	ImageChannelOrderR(Main.IMAGE_CHANNEL_ORDER_R),
	ImageChannelOrderA(Main.IMAGE_CHANNEL_ORDER_A),
	ImageChannelOrderRG(Main.IMAGE_CHANNEL_ORDER_RG),
	ImageChannelOrderRA(Main.IMAGE_CHANNEL_ORDER_RA),
	ImageChannelOrderRGB(Main.IMAGE_CHANNEL_ORDER_RGB),
	ImageChannelOrderRGBA(Main.IMAGE_CHANNEL_ORDER_RGBA),
	ImageChannelOrderBGRA(Main.IMAGE_CHANNEL_ORDER_BGRA),
	ImageChannelOrderARGB(Main.IMAGE_CHANNEL_ORDER_ARGB),
	ImageChannelOrderIntensity(Main.IMAGE_CHANNEL_ORDER_INTENSITY),
	ImageChannelOrderLuminance(Main.IMAGE_CHANNEL_ORDER_LUMINANCE),
	ImageChannelOrderRx(Main.IMAGE_CHANNEL_ORDER_RX),
	ImageChannelOrderRGx(Main.IMAGE_CHANNEL_ORDER_RGX),
	ImageChannelOrderRGBx(Main.IMAGE_CHANNEL_ORDER_RGBX),
	ImageChannelOrderDepth(Main.IMAGE_CHANNEL_ORDER_DEPTH),
	ImageChannelOrderDepthStencil(Main.IMAGE_CHANNEL_ORDER_DEPTH_STENCIL),
	ImageChannelOrdersRGB(Main.IMAGE_CHANNEL_ORDER_SRGB),
	ImageChannelOrdersRGBx(Main.IMAGE_CHANNEL_ORDER_SRGBX),
	ImageChannelOrdersRGBA(Main.IMAGE_CHANNEL_ORDER_SRGBA),
	ImageChannelOrdersBGRA(Main.IMAGE_CHANNEL_ORDER_SBGRA),
	ImageChannelOrderABGR(Main.IMAGE_CHANNEL_ORDER_ABGR),
	ImageChannelOrderMax(Main.IMAGE_CHANNEL_ORDER_MAX);

	private final int value;

	private ImageChannelOrder(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static ImageChannelOrder valueByStr(String str) {
		switch (str) {
			case "ImageChannelOrderR":
				return ImageChannelOrderR;
			case "ImageChannelOrderA":
				return ImageChannelOrderA;
			case "ImageChannelOrderRG":
				return ImageChannelOrderRG;
			case "ImageChannelOrderRA":
				return ImageChannelOrderRA;
			case "ImageChannelOrderRGB":
				return ImageChannelOrderRGB;
			case "ImageChannelOrderRGBA":
				return ImageChannelOrderRGBA;
			case "ImageChannelOrderBGRA":
				return ImageChannelOrderBGRA;
			case "ImageChannelOrderARGB":
				return ImageChannelOrderARGB;
			case "ImageChannelOrderIntensity":
				return ImageChannelOrderIntensity;
			case "ImageChannelOrderLuminance":
				return ImageChannelOrderLuminance;
			case "ImageChannelOrderRx":
				return ImageChannelOrderRx;
			case "ImageChannelOrderRGx":
				return ImageChannelOrderRGx;
			case "ImageChannelOrderRGBx":
				return ImageChannelOrderRGBx;
			case "ImageChannelOrderDepth":
				return ImageChannelOrderDepth;
			case "ImageChannelOrderDepthStencil":
				return ImageChannelOrderDepthStencil;
			case "ImageChannelOrdersRGB":
				return ImageChannelOrdersRGB;
			case "ImageChannelOrdersRGBx":
				return ImageChannelOrdersRGBx;
			case "ImageChannelOrdersRGBA":
				return ImageChannelOrdersRGBA;
			case "ImageChannelOrdersBGRA":
				return ImageChannelOrdersBGRA;
			case "ImageChannelOrderABGR":
				return ImageChannelOrderABGR;
			case "ImageChannelOrderMax":
				return ImageChannelOrderMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static ImageChannelOrder valueByConstant(int constant) {
		switch (constant) {
			case Main.IMAGE_CHANNEL_ORDER_R:
				return ImageChannelOrderR;
			case Main.IMAGE_CHANNEL_ORDER_A:
				return ImageChannelOrderA;
			case Main.IMAGE_CHANNEL_ORDER_RG:
				return ImageChannelOrderRG;
			case Main.IMAGE_CHANNEL_ORDER_RA:
				return ImageChannelOrderRA;
			case Main.IMAGE_CHANNEL_ORDER_RGB:
				return ImageChannelOrderRGB;
			case Main.IMAGE_CHANNEL_ORDER_RGBA:
				return ImageChannelOrderRGBA;
			case Main.IMAGE_CHANNEL_ORDER_BGRA:
				return ImageChannelOrderBGRA;
			case Main.IMAGE_CHANNEL_ORDER_ARGB:
				return ImageChannelOrderARGB;
			case Main.IMAGE_CHANNEL_ORDER_INTENSITY:
				return ImageChannelOrderIntensity;
			case Main.IMAGE_CHANNEL_ORDER_LUMINANCE:
				return ImageChannelOrderLuminance;
			case Main.IMAGE_CHANNEL_ORDER_RX:
				return ImageChannelOrderRx;
			case Main.IMAGE_CHANNEL_ORDER_RGX:
				return ImageChannelOrderRGx;
			case Main.IMAGE_CHANNEL_ORDER_RGBX:
				return ImageChannelOrderRGBx;
			case Main.IMAGE_CHANNEL_ORDER_DEPTH:
				return ImageChannelOrderDepth;
			case Main.IMAGE_CHANNEL_ORDER_DEPTH_STENCIL:
				return ImageChannelOrderDepthStencil;
			case Main.IMAGE_CHANNEL_ORDER_SRGB:
				return ImageChannelOrdersRGB;
			case Main.IMAGE_CHANNEL_ORDER_SRGBX:
				return ImageChannelOrdersRGBx;
			case Main.IMAGE_CHANNEL_ORDER_SRGBA:
				return ImageChannelOrdersRGBA;
			case Main.IMAGE_CHANNEL_ORDER_SBGRA:
				return ImageChannelOrdersBGRA;
			case Main.IMAGE_CHANNEL_ORDER_ABGR:
				return ImageChannelOrderABGR;
			case Main.IMAGE_CHANNEL_ORDER_MAX:
				return ImageChannelOrderMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
