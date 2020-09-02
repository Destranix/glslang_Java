package Java;

public enum SpvVersion {
	Spv_1_0(Main.SPV_1_0),
	Spv_1_1(Main.SPV_1_1),
	Spv_1_2(Main.SPV_1_2),
	Spv_1_3(Main.SPV_1_3),
	Spv_1_4(Main.SPV_1_4),
	Spv_1_5(Main.SPV_1_5);

	private final int value;

	private SpvVersion(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static SpvVersion valueByStr(String str) {
		switch (str) {
			case "Spv_1_0":
				return Spv_1_0;
			case "Spv_1_1":
				return Spv_1_1;
			case "Spv_1_2":
				return Spv_1_2;
			case "Spv_1_3":
				return Spv_1_3;
			case "Spv_1_4":
				return Spv_1_4;
			case "Spv_1_5":
				return Spv_1_5;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static SpvVersion valueByConstant(int constant) {
		switch (constant) {
			case Main.SPV_1_0:
				return Spv_1_0;
			case Main.SPV_1_1:
				return Spv_1_1;
			case Main.SPV_1_2:
				return Spv_1_2;
			case Main.SPV_1_3:
				return Spv_1_3;
			case Main.SPV_1_4:
				return Spv_1_4;
			case Main.SPV_1_5:
				return Spv_1_5;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
