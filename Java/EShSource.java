package Java;

public enum EShSource {
	EShSourceNone(Main.E_SH_SOURCE_NONE), EShSourceGlsl(Main.E_SH_SOURCE_GLSL), EShSourceHlsl(Main.E_SH_SOURCE_HLSL);

	private final int value;

	private EShSource(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static EShSource valueByStr(String str) {
		switch (str) {
			case "EShSourceNone":
				return EShSourceNone;
			case "EShSourceGlsl":
				return EShSourceGlsl;
			case "EShSourceHlsl":
				return EShSourceHlsl;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static EShSource valueByConstant(int constant) {
		switch (constant) {
			case Main.E_SH_SOURCE_NONE:
				return EShSourceNone;
			case Main.E_SH_SOURCE_GLSL:
				return EShSourceGlsl;
			case Main.E_SH_SOURCE_HLSL:
				return EShSourceHlsl;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
