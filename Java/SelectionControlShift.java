package Java;

public enum SelectionControlShift {
	SelectionControlFlattenShift(Main.SELECTION_CONTROL_FLATTEN_SHIFT),
	SelectionControlDontFlattenShift(Main.SELECTION_CONTROL_DONT_FLATTEN_SHIFT),
	SelectionControlMax(Main.SELECTION_CONTROL_MAX);

	private final int value;

	private SelectionControlShift(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static SelectionControlShift valueByStr(String str) {
		switch (str) {
			case "SelectionControlFlattenShift":
				return SelectionControlFlattenShift;
			case "SelectionControlDontFlattenShift":
				return SelectionControlDontFlattenShift;
			case "SelectionControlMax":
				return SelectionControlMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static SelectionControlShift valueByConstant(int constant) {
		switch (constant) {
			case Main.SELECTION_CONTROL_FLATTEN_SHIFT:
				return SelectionControlFlattenShift;
			case Main.SELECTION_CONTROL_DONT_FLATTEN_SHIFT:
				return SelectionControlDontFlattenShift;
			case Main.SELECTION_CONTROL_MAX:
				return SelectionControlMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
