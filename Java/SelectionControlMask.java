package Java;

import java.util.EnumSet;

public enum SelectionControlMask {
	SelectionControlMaskNone(Main.SELECTION_CONTROL_MASK_NONE),
	SelectionControlFlattenMask(Main.SELECTION_CONTROL_FLATTEN_MASK),
	SelectionControlDontFlattenMask(Main.SELECTION_CONTROL_DONT_FLATTEN_MASK);

	private final int value;

	private SelectionControlMask(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static int setToInt(EnumSet<SelectionControlMask> set) {
		int ret = 0;
		for (SelectionControlMask val : set) {
			ret |= val.getConstant();
		}
		return ret;
	}

	public static SelectionControlMask valueByStr(String str) {
		switch (str) {
			case "SelectionControlMaskNone":
				return SelectionControlMaskNone;
			case "SelectionControlFlattenMask":
				return SelectionControlFlattenMask;
			case "SelectionControlDontFlattenMask":
				return SelectionControlDontFlattenMask;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static SelectionControlMask valueByConstant(int constant) {
		switch (constant) {
			case Main.SELECTION_CONTROL_MASK_NONE:
				return SelectionControlMaskNone;
			case Main.SELECTION_CONTROL_FLATTEN_MASK:
				return SelectionControlFlattenMask;
			case Main.SELECTION_CONTROL_DONT_FLATTEN_MASK:
				return SelectionControlDontFlattenMask;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
