package Java;

public enum MemorySemanticsShift {
	MemorySemanticsAcquireShift(Main.MEMORY_SEMANTICS_ACQUIRE_SHIFT),
	MemorySemanticsReleaseShift(Main.MEMORY_SEMANTICS_RELEASE_SHIFT),
	MemorySemanticsAcquireReleaseShift(Main.MEMORY_SEMANTICS_ACQUIRE_RELEASE_SHIFT),
	MemorySemanticsSequentiallyConsistentShift(Main.MEMORY_SEMANTICS_SEQUENTIALLY_CONSISTENT_SHIFT),
	MemorySemanticsUniformMemoryShift(Main.MEMORY_SEMANTICS_UNIFORM_MEMORY_SHIFT),
	MemorySemanticsSubgroupMemoryShift(Main.MEMORY_SEMANTICS_SUBGROUP_MEMORY_SHIFT),
	MemorySemanticsWorkgroupMemoryShift(Main.MEMORY_SEMANTICS_WORKGROUP_MEMORY_SHIFT),
	MemorySemanticsCrossWorkgroupMemoryShift(Main.MEMORY_SEMANTICS_CROSS_WORKGROUP_MEMORY_SHIFT),
	MemorySemanticsAtomicCounterMemoryShift(Main.MEMORY_SEMANTICS_ATOMIC_COUNTER_MEMORY_SHIFT),
	MemorySemanticsImageMemoryShift(Main.MEMORY_SEMANTICS_IMAGEMEMORY_SHIFT),
	MemorySemanticsOutputMemoryShift(Main.MEMORY_SEMANTICS_OUTPUT_MEMORY_SHIFT),
	MemorySemanticsOutputMemoryKHRShift(Main.MEMORY_SEMANTICS_OUTPUT_MEMORY_KHR_SHIFT),
	MemorySemanticsMakeAvailableShift(Main.MEMORY_SEMANTICS_MAKE_AVAILABLE_SHIFT),
	MemorySemanticsMakeAvailableKHRShift(Main.MEMORY_SEMANTICS_MAKE_AVAILABLE_KHR_SHIFT),
	MemorySemanticsMakeVisibleShift(Main.MEMORY_SEMANTICS_MAKE_VISIBLE_SHIFT),
	MemorySemanticsMakeVisibleKHRShift(Main.MEMORY_SEMANTICS_MAKE_VISIBLE_KHR_SHIFT),
	MemorySemanticsVolatileShift(Main.MEMORY_SEMANTICS_VOLATILE_SHIFT),
	MemorySemanticsMax(Main.MEMORY_SEMANTICS_MAX);

	private final int value;

	private MemorySemanticsShift(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static MemorySemanticsShift valueByStr(String str) {
		switch (str) {
			case "MemorySemanticsAcquireShift":
				return MemorySemanticsAcquireShift;
			case "MemorySemanticsReleaseShift":
				return MemorySemanticsReleaseShift;
			case "MemorySemanticsAcquireReleaseShift":
				return MemorySemanticsAcquireReleaseShift;
			case "MemorySemanticsSequentiallyConsistentShift":
				return MemorySemanticsSequentiallyConsistentShift;
			case "MemorySemanticsUniformMemoryShift":
				return MemorySemanticsUniformMemoryShift;
			case "MemorySemanticsSubgroupMemoryShift":
				return MemorySemanticsSubgroupMemoryShift;
			case "MemorySemanticsWorkgroupMemoryShift":
				return MemorySemanticsWorkgroupMemoryShift;
			case "MemorySemanticsCrossWorkgroupMemoryShift":
				return MemorySemanticsCrossWorkgroupMemoryShift;
			case "MemorySemanticsAtomicCounterMemoryShift":
				return MemorySemanticsAtomicCounterMemoryShift;
			case "MemorySemanticsImageMemoryShift":
				return MemorySemanticsImageMemoryShift;
			case "MemorySemanticsOutputMemoryShift":
				return MemorySemanticsOutputMemoryShift;
			case "MemorySemanticsOutputMemoryKHRShift":
				return MemorySemanticsOutputMemoryKHRShift;
			case "MemorySemanticsMakeAvailableShift":
				return MemorySemanticsMakeAvailableShift;
			case "MemorySemanticsMakeAvailableKHRShift":
				return MemorySemanticsMakeAvailableKHRShift;
			case "MemorySemanticsMakeVisibleShift":
				return MemorySemanticsMakeVisibleShift;
			case "MemorySemanticsMakeVisibleKHRShift":
				return MemorySemanticsMakeVisibleKHRShift;
			case "MemorySemanticsVolatileShift":
				return MemorySemanticsVolatileShift;
			case "MemorySemanticsMax":
				return MemorySemanticsMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static MemorySemanticsShift valueByConstant(int constant) {
		switch (constant) {
			case Main.MEMORY_SEMANTICS_ACQUIRE_SHIFT:
				return MemorySemanticsAcquireShift;
			case Main.MEMORY_SEMANTICS_RELEASE_SHIFT:
				return MemorySemanticsReleaseShift;
			case Main.MEMORY_SEMANTICS_ACQUIRE_RELEASE_SHIFT:
				return MemorySemanticsAcquireReleaseShift;
			case Main.MEMORY_SEMANTICS_SEQUENTIALLY_CONSISTENT_SHIFT:
				return MemorySemanticsSequentiallyConsistentShift;
			case Main.MEMORY_SEMANTICS_UNIFORM_MEMORY_SHIFT:
				return MemorySemanticsUniformMemoryShift;
			case Main.MEMORY_SEMANTICS_SUBGROUP_MEMORY_SHIFT:
				return MemorySemanticsSubgroupMemoryShift;
			case Main.MEMORY_SEMANTICS_WORKGROUP_MEMORY_SHIFT:
				return MemorySemanticsWorkgroupMemoryShift;
			case Main.MEMORY_SEMANTICS_CROSS_WORKGROUP_MEMORY_SHIFT:
				return MemorySemanticsCrossWorkgroupMemoryShift;
			case Main.MEMORY_SEMANTICS_ATOMIC_COUNTER_MEMORY_SHIFT:
				return MemorySemanticsAtomicCounterMemoryShift;
			case Main.MEMORY_SEMANTICS_IMAGEMEMORY_SHIFT:
				return MemorySemanticsImageMemoryShift;
			case Main.MEMORY_SEMANTICS_OUTPUT_MEMORY_SHIFT:
				return MemorySemanticsOutputMemoryShift;
			case Main.MEMORY_SEMANTICS_MAKE_AVAILABLE_SHIFT:
				return MemorySemanticsMakeAvailableShift;
			case Main.MEMORY_SEMANTICS_MAKE_VISIBLE_SHIFT:
				return MemorySemanticsMakeVisibleShift;
			case Main.MEMORY_SEMANTICS_VOLATILE_SHIFT:
				return MemorySemanticsVolatileShift;
			case Main.MEMORY_SEMANTICS_MAX:
				return MemorySemanticsMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
