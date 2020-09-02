package Java;

public enum TBasicType {
	EbtVoid(Main.EBT_VOID), EbtFloat(Main.EBT_FLOAT), EbtDouble(Main.EBT_DOUBLE);

	private final int value;

	private TBasicType(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TBasicType valueByStr(String str) {
		switch (str) {
			case "EbtVoid":
				return EbtVoid;
			case "EbtFloat":
				return EbtFloat;
			case "EbtDouble":
				return EbtDouble;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TBasicType valueByConstant(int constant) {
		switch (constant) {
			case Main.EBT_VOID:
				return EbtVoid;
			case Main.EBT_FLOAT:
				return EbtFloat;
			case Main.EBT_DOUBLE:
				return EbtDouble;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
