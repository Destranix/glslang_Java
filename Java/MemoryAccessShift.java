package Java;

public enum MemoryAccessShift {
	MemoryAccessVolatileShift(Main.MEMORY_ACCESS_VOLATILE_SHIFT),
	MemoryAccessAlignedShift(Main.MEMORY_ACCESS_ALIGNED_SHIFT),
	MemoryAccessNontemporalShift(Main.MEMORY_ACCESS_NONTEMPORAL_SHIFT),
	MemoryAccessMakePointerAvailableShift(Main.MEMORY_ACCESS_MAKE_POINTER_AVAILABLE_SHIFT),
	MemoryAccessMakePointerAvailableKHRShift(Main.MEMORY_ACCESS_MAKE_POINTER_AVAILABLE_KHR_SHIFT),
	MemoryAccessMakePointerVisibleShift(Main.MEMORY_ACCESS_MAKE_POINTER_VISIBLE_SHIFT),
	MemoryAccessMakePointerVisibleKHRShift(Main.MEMORY_ACCESS_MAKE_POINTER_VISIBLE_KHR_SHIFT),
	MemoryAccessNonPrivatePointerShift(Main.MEMORY_ACCESS_NON_PRIVATE_POINTER_SHIFT),
	MemoryAccessNonPrivatePointerKHRShift(Main.MEMORY_ACCESS_NON_PRIVATE_POINTER_KHR_SHIFT),
	MemoryAccessMax(Main.MEMORY_ACCESS_MAX);

	private final int value;

	private MemoryAccessShift(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static MemoryAccessShift valueByStr(String str) {
		switch (str) {
			case "MemoryAccessVolatileShift":
				return MemoryAccessVolatileShift;
			case "MemoryAccessAlignedShift":
				return MemoryAccessAlignedShift;
			case "MemoryAccessNontemporalShift":
				return MemoryAccessNontemporalShift;
			case "MemoryAccessMakePointerAvailableShift":
				return MemoryAccessMakePointerAvailableShift;
			case "MemoryAccessMakePointerAvailableKHRShift":
				return MemoryAccessMakePointerAvailableKHRShift;
			case "MemoryAccessMakePointerVisibleShift":
				return MemoryAccessMakePointerVisibleShift;
			case "MemoryAccessMakePointerVisibleKHRShift":
				return MemoryAccessMakePointerVisibleKHRShift;
			case "MemoryAccessNonPrivatePointerShift":
				return MemoryAccessNonPrivatePointerShift;
			case "MemoryAccessNonPrivatePointerKHRShift":
				return MemoryAccessNonPrivatePointerKHRShift;
			case "MemoryAccessMax":
				return MemoryAccessMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static MemoryAccessShift valueByConstant(int constant) {
		switch (constant) {
			case Main.MEMORY_ACCESS_VOLATILE_SHIFT:
				return MemoryAccessVolatileShift;
			case Main.MEMORY_ACCESS_ALIGNED_SHIFT:
				return MemoryAccessAlignedShift;
			case Main.MEMORY_ACCESS_NONTEMPORAL_SHIFT:
				return MemoryAccessNontemporalShift;
			case Main.MEMORY_ACCESS_MAKE_POINTER_AVAILABLE_SHIFT:
				return MemoryAccessMakePointerAvailableShift;
			case Main.MEMORY_ACCESS_MAKE_POINTER_VISIBLE_SHIFT:
				return MemoryAccessMakePointerVisibleShift;
			case Main.MEMORY_ACCESS_NON_PRIVATE_POINTER_SHIFT:
				return MemoryAccessNonPrivatePointerShift;
			case Main.MEMORY_ACCESS_MAX:
				return MemoryAccessMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
