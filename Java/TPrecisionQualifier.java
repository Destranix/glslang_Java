package Java;

public enum TPrecisionQualifier {
	EpqNone(Main.EPQ_NONE), EpqLow(Main.EPQ_LOW), EpqMedium(Main.EPQ_MEDIUM), EpqHigh(Main.EPQ_HIGH);

	private final int value;

	private TPrecisionQualifier(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TPrecisionQualifier valueByStr(String str) {
		switch (str) {
			case "EpqNone ":
				return EpqNone;
			case "EpqLow":
				return EpqLow;
			case "EpqMedium":
				return EpqMedium;
			case "EpqHigh":
				return EpqHigh;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TPrecisionQualifier valueByConstant(int constant) {
		switch (constant) {
			case Main.EPQ_NONE:
				return EpqNone;
			case Main.EPQ_LOW:
				return EpqLow;
			case Main.EPQ_MEDIUM:
				return EpqMedium;
			case Main.EPQ_HIGH:
				return EpqHigh;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
