package Java;

public enum TVertexSpacing {
	EvsNone(Main.EVS_NONE),
	EvsEqual(Main.EVS_EQUAL),
	EvsFractionalEven(Main.EVS_FRACTIONAL_EVEN),
	EvsFractionalOdd(Main.EVS_FRACTIONAL_ODD);

	private final int value;

	private TVertexSpacing(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TVertexSpacing valueByStr(String str) {
		switch (str) {
			case "EvsNone":
				return EvsNone;
			case "EvsEqual":
				return EvsEqual;
			case "EvsFractionalEven":
				return EvsFractionalEven;
			case "EvsFractionalOdd":
				return EvsFractionalOdd;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TVertexSpacing valueByConstant(int constant) {
		switch (constant) {
			case Main.EVS_NONE:
				return EvsNone;
			case Main.EVS_EQUAL:
				return EvsEqual;
			case Main.EVS_FRACTIONAL_EVEN:
				return EvsFractionalEven;
			case Main.EVS_FRACTIONAL_ODD:
				return EvsFractionalOdd;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
