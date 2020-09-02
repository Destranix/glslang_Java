package Java;

public enum AddressingModel {
	AddressingModelLogical(Main.ADDRESSING_MODEL_LOGICAL),
	AddressingModelPhysical32(Main.ADDRESSING_MODEL_PHYSICAL_32),
	AddressingModelPhysical64(Main.ADDRESSING_MODEL_PHYSICAL_64),
	AddressingModelPhysicalStorageBuffer64(Main.ADDRESSING_MODEL_PHYSICAL_STORAGE_BUFFER_64),
	AddressingModelPhysicalStorageBuffer64EXT(Main.ADDRESSING_MODEL_PHYSICAL_STORAGE_BUFFER_64_EXT),
	AddressingModelMax(Main.ADDRESSING_MODEL_MAX);

	private final int value;

	private AddressingModel(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static AddressingModel valueByStr(String str) {
		switch (str) {
			case "AddressingModelLogical":
				return AddressingModelLogical;
			case "AddressingModelPhysical32":
				return AddressingModelPhysical32;
			case "AddressingModelPhysical64":
				return AddressingModelPhysical64;
			case "AddressingModelPhysicalStorageBuffer64":
				return AddressingModelPhysicalStorageBuffer64;
			case "AddressingModelPhysicalStorageBuffer64EXT":
				return AddressingModelPhysicalStorageBuffer64EXT;
			case "AddressingModelMax":
				return AddressingModelMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static AddressingModel valueByConstant(int constant) {
		switch (constant) {
			case Main.ADDRESSING_MODEL_LOGICAL:
				return AddressingModelLogical;
			case Main.ADDRESSING_MODEL_PHYSICAL_32:
				return AddressingModelPhysical32;
			case Main.ADDRESSING_MODEL_PHYSICAL_64:
				return AddressingModelPhysical64;
			case Main.ADDRESSING_MODEL_PHYSICAL_STORAGE_BUFFER_64:
				return AddressingModelPhysicalStorageBuffer64;
			case Main.ADDRESSING_MODEL_MAX:
				return AddressingModelMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
