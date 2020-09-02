package Java;

public enum TLayoutDepth {
	EldNone(Main.ELD_NONE),
	EldAny(Main.ELD_ANY),
	EldGreater(Main.ELD_GREATER),
	EldLess(Main.ELD_LESS),
	EldUnchanged(Main.ELD_UNCHANGED);

	private final int value;

	private TLayoutDepth(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TLayoutDepth valueByStr(String str) {
		switch (str) {
			case "EldNone":
				return EldNone;
			case "EldAny":
				return EldAny;
			case "EldGreater":
				return EldGreater;
			case "EldLess":
				return EldLess;
			case "EldUnchanged":
				return EldUnchanged;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TLayoutDepth valueByConstant(int constant) {
		switch (constant) {
			case Main.ELD_NONE:
				return EldNone;
			case Main.ELD_ANY:
				return EldAny;
			case Main.ELD_GREATER:
				return EldGreater;
			case Main.ELD_LESS:
				return EldLess;
			case Main.ELD_UNCHANGED:
				return EldUnchanged;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
