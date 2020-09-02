package Java;

public enum EShTargetLanguageVersion {
	EShTargetSpv_1_0(Main.E_SH_TARGET_SPV_1_0),
	EShTargetSpv_1_1(Main.E_SH_TARGET_SPV_1_1),
	EShTargetSpv_1_2(Main.E_SH_TARGET_SPV_1_2),
	EShTargetSpv_1_3(Main.E_SH_TARGET_SPV_1_3),
	EShTargetSpv_1_4(Main.E_SH_TARGET_SPV_1_4),
	EShTargetSpv_1_5(Main.E_SH_TARGET_SPV_1_5);

	private final int value;

	private EShTargetLanguageVersion(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static EShTargetLanguageVersion valueByStr(String str) {
		switch (str) {
			case "EShTargetSpv_1_0":
				return EShTargetSpv_1_0;
			case "EShTargetSpv_1_1":
				return EShTargetSpv_1_1;
			case "EShTargetSpv_1_2":
				return EShTargetSpv_1_2;
			case "EShTargetSpv_1_3":
				return EShTargetSpv_1_3;
			case "EShTargetSpv_1_4":
				return EShTargetSpv_1_4;
			case "EShTargetSpv_1_5":
				return EShTargetSpv_1_5;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static EShTargetLanguageVersion valueByConstant(int constant) {
		switch (constant) {
			case Main.E_SH_TARGET_SPV_1_0:
				return EShTargetSpv_1_0;
			case Main.E_SH_TARGET_SPV_1_1:
				return EShTargetSpv_1_1;
			case Main.E_SH_TARGET_SPV_1_2:
				return EShTargetSpv_1_2;
			case Main.E_SH_TARGET_SPV_1_3:
				return EShTargetSpv_1_3;
			case Main.E_SH_TARGET_SPV_1_4:
				return EShTargetSpv_1_4;
			case Main.E_SH_TARGET_SPV_1_5:
				return EShTargetSpv_1_5;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
