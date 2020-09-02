package Java;

public enum TShaderInterface {
	EsiUniform(Main.ESI_UNIFORM), EsiInput(Main.ESI_INPUT), EsiOutput(Main.ESI_OUTPUT), EsiNone(Main.ESI_NONE);

	private final int value;

	private TShaderInterface(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TShaderInterface valueByStr(String str) {
		switch (str) {
			case "EsiUniform":
				return EsiUniform;
			case "EsiInput":
				return EsiInput;
			case "EsiOutput":
				return EsiOutput;
			case "EsiNone":
				return EsiNone;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TShaderInterface valueByConstant(int constant) {
		switch (constant) {
			case Main.ESI_UNIFORM:
				return EsiUniform;
			case Main.ESI_INPUT:
				return EsiInput;
			case Main.ESI_OUTPUT:
				return EsiOutput;
			case Main.ESI_NONE:
				return EsiNone;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
