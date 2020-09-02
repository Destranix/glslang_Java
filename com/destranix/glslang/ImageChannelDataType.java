package com.destranix.glslang;

public enum ImageChannelDataType {
	ImageChannelDataTypeSnormInt8(Main.IMAGE_CHANNEL_DATA_TYPE_SNORM_INT8),
	ImageChannelDataTypeSnormInt16(Main.IMAGE_CHANNEL_DATA_TYPE_SNORM_INT16),
	ImageChannelDataTypeUnormInt8(Main.IMAGE_CHANNEL_DATA_TYPE_UNORM_INT8),
	ImageChannelDataTypeUnormInt16(Main.IMAGE_CHANNEL_DATA_TYPE_UNORM_INT16),
	ImageChannelDataTypeUnormShort565(Main.IMAGE_CHANNEL_DATA_TYPE_UNORM_SHORT565),
	ImageChannelDataTypeUnormShort555(Main.IMAGE_CHANNEL_DATA_TYPE_UNORM_SHORT555),
	ImageChannelDataTypeUnormInt101010(Main.IMAGE_CHANNEL_DATA_TYPE_UNORM_INT101010),
	ImageChannelDataTypeSignedInt8(Main.IMAGE_CHANNEL_DATA_TYPE_SIGNED_INT8),
	ImageChannelDataTypeSignedInt16(Main.IMAGE_CHANNEL_DATA_TYPE_SIGNED_INT16),
	ImageChannelDataTypeSignedInt32(Main.IMAGE_CHANNEL_DATA_TYPE_SIGNED_INT32),
	ImageChannelDataTypeUnsignedInt8(Main.IMAGE_CHANNEL_DATA_TYPE_UNSIGNED_INT8),
	ImageChannelDataTypeUnsignedInt16(Main.IMAGE_CHANNEL_DATA_TYPE_UNSIGNED_INT16),
	ImageChannelDataTypeUnsignedInt32(Main.IMAGE_CHANNEL_DATA_TYPE_UNSIGNED_INT32),
	ImageChannelDataTypeHalfFloat(Main.IMAGE_CHANNEL_DATA_TYPE_HALF_FLOAT),
	ImageChannelDataTypeFloat(Main.IMAGE_CHANNEL_DATA_TYPE_FLOAT),
	ImageChannelDataTypeUnormInt24(Main.IMAGE_CHANNEL_DATA_TYPE_UNORM_INT24),
	ImageChannelDataTypeUnormInt101010_2(Main.IMAGE_CHANNEL_DATA_TYPE_UNORM_INT101010_2),
	ImageChannelDataTypeMax(Main.IMAGE_CHANNEL_DATA_TYPE_MAX);

	private final int value;

	private ImageChannelDataType(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static ImageChannelDataType valueByStr(String str) {
		switch (str) {
			case "ImageChannelDataTypeSnormInt8":
				return ImageChannelDataTypeSnormInt8;
			case "ImageChannelDataTypeSnormInt16":
				return ImageChannelDataTypeSnormInt16;
			case "ImageChannelDataTypeUnormInt8":
				return ImageChannelDataTypeUnormInt8;
			case "ImageChannelDataTypeUnormInt16":
				return ImageChannelDataTypeUnormInt16;
			case "ImageChannelDataTypeUnormShort565":
				return ImageChannelDataTypeUnormShort565;
			case "ImageChannelDataTypeUnormShort555":
				return ImageChannelDataTypeUnormShort555;
			case "ImageChannelDataTypeUnormInt101010":
				return ImageChannelDataTypeUnormInt101010;
			case "ImageChannelDataTypeSignedInt8":
				return ImageChannelDataTypeSignedInt8;
			case "ImageChannelDataTypeSignedInt16":
				return ImageChannelDataTypeSignedInt16;
			case "ImageChannelDataTypeSignedInt32":
				return ImageChannelDataTypeSignedInt32;
			case "ImageChannelDataTypeUnsignedInt8":
				return ImageChannelDataTypeUnsignedInt8;
			case "ImageChannelDataTypeUnsignedInt16":
				return ImageChannelDataTypeUnsignedInt16;
			case "ImageChannelDataTypeUnsignedInt32":
				return ImageChannelDataTypeUnsignedInt32;
			case "ImageChannelDataTypeHalfFloat":
				return ImageChannelDataTypeHalfFloat;
			case "ImageChannelDataTypeFloat":
				return ImageChannelDataTypeFloat;
			case "ImageChannelDataTypeUnormInt24":
				return ImageChannelDataTypeUnormInt24;
			case "ImageChannelDataTypeUnormInt101010_2":
				return ImageChannelDataTypeUnormInt101010_2;
			case "ImageChannelDataTypeMax":
				return ImageChannelDataTypeMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static ImageChannelDataType valueByConstant(int constant) {
		switch (constant) {
			case Main.IMAGE_CHANNEL_DATA_TYPE_SNORM_INT8:
				return ImageChannelDataTypeSnormInt8;
			case Main.IMAGE_CHANNEL_DATA_TYPE_SNORM_INT16:
				return ImageChannelDataTypeSnormInt16;
			case Main.IMAGE_CHANNEL_DATA_TYPE_UNORM_INT8:
				return ImageChannelDataTypeUnormInt8;
			case Main.IMAGE_CHANNEL_DATA_TYPE_UNORM_INT16:
				return ImageChannelDataTypeUnormInt16;
			case Main.IMAGE_CHANNEL_DATA_TYPE_UNORM_SHORT565:
				return ImageChannelDataTypeUnormShort565;
			case Main.IMAGE_CHANNEL_DATA_TYPE_UNORM_SHORT555:
				return ImageChannelDataTypeUnormShort555;
			case Main.IMAGE_CHANNEL_DATA_TYPE_UNORM_INT101010:
				return ImageChannelDataTypeUnormInt101010;
			case Main.IMAGE_CHANNEL_DATA_TYPE_SIGNED_INT8:
				return ImageChannelDataTypeSignedInt8;
			case Main.IMAGE_CHANNEL_DATA_TYPE_SIGNED_INT16:
				return ImageChannelDataTypeSignedInt16;
			case Main.IMAGE_CHANNEL_DATA_TYPE_SIGNED_INT32:
				return ImageChannelDataTypeSignedInt32;
			case Main.IMAGE_CHANNEL_DATA_TYPE_UNSIGNED_INT8:
				return ImageChannelDataTypeUnsignedInt8;
			case Main.IMAGE_CHANNEL_DATA_TYPE_UNSIGNED_INT16:
				return ImageChannelDataTypeUnsignedInt16;
			case Main.IMAGE_CHANNEL_DATA_TYPE_UNSIGNED_INT32:
				return ImageChannelDataTypeUnsignedInt32;
			case Main.IMAGE_CHANNEL_DATA_TYPE_HALF_FLOAT:
				return ImageChannelDataTypeHalfFloat;
			case Main.IMAGE_CHANNEL_DATA_TYPE_FLOAT:
				return ImageChannelDataTypeFloat;
			case Main.IMAGE_CHANNEL_DATA_TYPE_UNORM_INT24:
				return ImageChannelDataTypeUnormInt24;
			case Main.IMAGE_CHANNEL_DATA_TYPE_UNORM_INT101010_2:
				return ImageChannelDataTypeUnormInt101010_2;
			case Main.IMAGE_CHANNEL_DATA_TYPE_MAX:
				return ImageChannelDataTypeMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
