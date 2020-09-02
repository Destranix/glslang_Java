package com.destranix.glslang;

public enum TInterlockOrdering {
	EioNone(Main.EIO_NONE),
	EioPixelInterlockOrdered(Main.EIO_PIXEL_INTERLOCK_ORDERED),
	EioPixelInterlockUnordered(Main.EIO_PIXEL_INTERLOCK_UNORDERED),
	EioSampleInterlockOrdered(Main.EIO_SAMPLE_INTERLOCK_ORDERED),
	EioSampleInterlockUnordered(Main.EIO_SAMPLE_INTERLOCK_UNORDERED),
	EioShadingRateInterlockOrdered(Main.EIO_SHADING_RATE_INTERLOCK_ORDERED),
	EioShadingRateInterlockUnordered(Main.EIO_SHADING_RATE_INTERLOCK_UNORDERED);

	private final int value;

	private TInterlockOrdering(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TInterlockOrdering valueByStr(String str) {
		switch (str) {
			case "EioNone":
				return EioNone;
			case "EioPixelInterlockOrdered":
				return EioPixelInterlockOrdered;
			case "EioPixelInterlockUnordered":
				return EioPixelInterlockUnordered;
			case "EioSampleInterlockOrdered":
				return EioSampleInterlockOrdered;
			case "EioSampleInterlockUnordered":
				return EioSampleInterlockUnordered;
			case "EioShadingRateInterlockOrdered":
				return EioShadingRateInterlockOrdered;
			case "EioShadingRateInterlockUnordered":
				return EioShadingRateInterlockUnordered;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TInterlockOrdering valueByConstant(int constant) {
		switch (constant) {
			case Main.EIO_NONE:
				return EioNone;
			case Main.EIO_PIXEL_INTERLOCK_ORDERED:
				return EioPixelInterlockOrdered;
			case Main.EIO_PIXEL_INTERLOCK_UNORDERED:
				return EioPixelInterlockUnordered;
			case Main.EIO_SAMPLE_INTERLOCK_ORDERED:
				return EioSampleInterlockOrdered;
			case Main.EIO_SAMPLE_INTERLOCK_UNORDERED:
				return EioSampleInterlockUnordered;
			case Main.EIO_SHADING_RATE_INTERLOCK_ORDERED:
				return EioShadingRateInterlockOrdered;
			case Main.EIO_SHADING_RATE_INTERLOCK_UNORDERED:
				return EioShadingRateInterlockUnordered;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
