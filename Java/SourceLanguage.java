package Java;

public enum SourceLanguage {
	SourceLanguageUnknown(Main.SOURCE_LANGUAGE_UNKNOWN),
	SourceLanguageESSL(Main.SOURCE_LANGUAGE_ESSL),
	SourceLanguageGLSL(Main.SOURCE_LANGUAGE_GLSL),
	SourceLanguageOpenCL_C(Main.SOURCE_LANGUAGE_OPEN_CL_C),
	SourceLanguageOpenCL_CPP(Main.SOURCE_LANGUAGE_OPEN_CL_CPP),
	SourceLanguageHLSL(Main.SOURCE_LANGUAGE_HLSL),
	SourceLanguageMax(Main.SOURCE_LANGUAGE_MAX);

	private final int value;

	private SourceLanguage(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static SourceLanguage valueByStr(String str) {
		switch (str) {
			case "SourceLanguageUnknown":
				return SourceLanguageUnknown;
			case "SourceLanguageESSL":
				return SourceLanguageESSL;
			case "SourceLanguageGLSL":
				return SourceLanguageGLSL;
			case "SourceLanguageOpenCL_C":
				return SourceLanguageOpenCL_C;
			case "SourceLanguageOpenCL_CPP":
				return SourceLanguageOpenCL_CPP;
			case "SourceLanguageHLSL":
				return SourceLanguageHLSL;
			case "SourceLanguageMax":
				return SourceLanguageMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static SourceLanguage valueByConstant(int constant) {
		switch (constant) {
			case Main.SOURCE_LANGUAGE_UNKNOWN:
				return SourceLanguageUnknown;
			case Main.SOURCE_LANGUAGE_ESSL:
				return SourceLanguageESSL;
			case Main.SOURCE_LANGUAGE_GLSL:
				return SourceLanguageGLSL;
			case Main.SOURCE_LANGUAGE_OPEN_CL_C:
				return SourceLanguageOpenCL_C;
			case Main.SOURCE_LANGUAGE_OPEN_CL_CPP:
				return SourceLanguageOpenCL_CPP;
			case Main.SOURCE_LANGUAGE_HLSL:
				return SourceLanguageHLSL;
			case Main.SOURCE_LANGUAGE_MAX:
				return SourceLanguageMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
