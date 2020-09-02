package Java;

public enum GlslangError {
	GlslangErrorNone(Main.GLSLANG_ERROR_NONE),
	GlslangErrorInvalidLength(Main.GLSLANG_ERROR_INVALID_LENGTH),
	GlslangErrorArrayIndexOutOfBounds(Main.GLSLANG_ERROR_ARRAY_INDEX_OUT_OF_BOUNDS),
	GlslangErrorNotYetImplemented(Main.GLSLANG_ERROR_NOT_YET_IMPLEMENTED),
	GlslangErrorInvalidArgument(Main.GLSLANG_ERROR_INVALID_ARGUMENT);

	private final int value;

	private GlslangError(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static GlslangError valueByStr(String str) {
		switch (str) {
			case "GlslangErrorNone":
				return GlslangErrorNone;
			case "GlslangErrorInvalidLength":
				return GlslangErrorInvalidLength;
			case "GlslangErrorArrayIndexOutOfBounds":
				return GlslangErrorArrayIndexOutOfBounds;
			case "GlslangErrorNotYetImplemented":
				return GlslangErrorNotYetImplemented;
			case "GlslangErrorInvalidArgument":
				return GlslangErrorInvalidArgument;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static GlslangError valueByConstant(int constant) {
		switch (constant) {
			case Main.GLSLANG_ERROR_NONE:
				return GlslangErrorNone;
			case Main.GLSLANG_ERROR_INVALID_LENGTH:
				return GlslangErrorInvalidLength;
			case Main.GLSLANG_ERROR_ARRAY_INDEX_OUT_OF_BOUNDS:
				return GlslangErrorArrayIndexOutOfBounds;
			case Main.GLSLANG_ERROR_NOT_YET_IMPLEMENTED:
				return GlslangErrorNotYetImplemented;
			case Main.GLSLANG_ERROR_INVALID_ARGUMENT:
				return GlslangErrorInvalidArgument;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
