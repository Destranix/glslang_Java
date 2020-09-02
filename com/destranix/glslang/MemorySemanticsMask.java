package com.destranix.glslang;

import java.util.EnumSet;

public enum MemorySemanticsMask {
	MemorySemanticsMaskNone(Main.MEMORY_SEMANTICS_MASK_NONE),
	MemorySemanticsAcquireMask(Main.MEMORY_SEMANTICS_ACQUIRE_MASK),
	MemorySemanticsReleaseMask(Main.MEMORY_SEMANTICS_RELEASE_MASK),
	MemorySemanticsAcquireReleaseMask(Main.MEMORY_SEMANTICS_ACQUIRE_RELEASE_MASK),
	MemorySemanticsSequentiallyConsistentMask(Main.MEMORY_SEMANTICS_SEQUENTIALLY_CONSISTENT_MASK),
	MemorySemanticsUniformMemoryMask(Main.MEMORY_SEMANTICS_UNIFORM_MEMORY_MASK),
	MemorySemanticsSubgroupMemoryMask(Main.MEMORY_SEMANTICS_SUBGROUP_MEMORY_MASK),
	MemorySemanticsWorkgroupMemoryMask(Main.MEMORY_SEMANTICS_WORKGROUP_MEMORY_MASK),
	MemorySemanticsCrossWorkgroupMemoryMask(Main.MEMORY_SEMANTICS_CROSS_WORKGROUP_MEMORY_MASK),
	MemorySemanticsAtomicCounterMemoryMask(Main.MEMORY_SEMANTICS_ATOMIC_COUNTER_MEMORY_MASK),
	MemorySemanticsImageMemoryMask(Main.MEMORY_SEMANTICS_IMAGE_MEMORY_MASK),
	MemorySemanticsOutputMemoryMask(Main.MEMORY_SEMANTICS_OUTPUT_MEMORY_MASK),
	MemorySemanticsOutputMemoryKHRMask(Main.MEMORY_SEMANTICS_OUTPUT_MEMORY_KHR_MASK),
	MemorySemanticsMakeAvailableMask(Main.MEMORY_SEMANTICS_MAKE_AVAILABLE_MASK),
	MemorySemanticsMakeAvailableKHRMask(Main.MEMORY_SEMANTICS_MAKE_AVAILABLE_KHR_MASK),
	MemorySemanticsMakeVisibleMask(Main.MEMORY_SEMANTICS_MAKE_VISIBLE_MASK),
	MemorySemanticsMakeVisibleKHRMask(Main.MEMORY_SEMANTICS_MAKE_VISIBLE_KHR_MASK),
	MemorySemanticsVolatileMask(Main.MEMORY_SEMANTICS_VOLATILE_MASK);

	private final int value;

	private MemorySemanticsMask(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static int setToInt(EnumSet<MemorySemanticsMask> set) {
		int ret = 0;
		for (MemorySemanticsMask val : set) {
			ret |= val.getConstant();
		}
		return ret;
	}

	public static MemorySemanticsMask valueByStr(String str) {
		switch (str) {
			case "MemorySemanticsMaskNone":
				return MemorySemanticsMaskNone;
			case "MemorySemanticsAcquireMask":
				return MemorySemanticsAcquireMask;
			case "MemorySemanticsReleaseMask":
				return MemorySemanticsReleaseMask;
			case "MemorySemanticsAcquireReleaseMask":
				return MemorySemanticsAcquireReleaseMask;
			case "MemorySemanticsSequentiallyConsistentMask":
				return MemorySemanticsSequentiallyConsistentMask;
			case "MemorySemanticsUniformMemoryMask":
				return MemorySemanticsUniformMemoryMask;
			case "MemorySemanticsSubgroupMemoryMask":
				return MemorySemanticsSubgroupMemoryMask;
			case "MemorySemanticsWorkgroupMemoryMask":
				return MemorySemanticsWorkgroupMemoryMask;
			case "MemorySemanticsCrossWorkgroupMemoryMask":
				return MemorySemanticsCrossWorkgroupMemoryMask;
			case "MemorySemanticsAtomicCounterMemoryMask":
				return MemorySemanticsAtomicCounterMemoryMask;
			case "MemorySemanticsImageMemoryMask":
				return MemorySemanticsImageMemoryMask;
			case "MemorySemanticsOutputMemoryMask":
				return MemorySemanticsOutputMemoryMask;
			case "MemorySemanticsOutputMemoryKHRMask":
				return MemorySemanticsOutputMemoryKHRMask;
			case "MemorySemanticsMakeAvailableMask":
				return MemorySemanticsMakeAvailableMask;
			case "MemorySemanticsMakeAvailableKHRMask":
				return MemorySemanticsMakeAvailableKHRMask;
			case "MemorySemanticsMakeVisibleMask":
				return MemorySemanticsMakeVisibleMask;
			case "MemorySemanticsMakeVisibleKHRMask":
				return MemorySemanticsMakeVisibleKHRMask;
			case "MemorySemanticsVolatileMask":
				return MemorySemanticsVolatileMask;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static MemorySemanticsMask valueByConstant(int constant) {
		switch (constant) {
			case Main.MEMORY_SEMANTICS_MASK_NONE:
				return MemorySemanticsMaskNone;
			case Main.MEMORY_SEMANTICS_ACQUIRE_MASK:
				return MemorySemanticsAcquireMask;
			case Main.MEMORY_SEMANTICS_RELEASE_MASK:
				return MemorySemanticsReleaseMask;
			case Main.MEMORY_SEMANTICS_ACQUIRE_RELEASE_MASK:
				return MemorySemanticsAcquireReleaseMask;
			case Main.MEMORY_SEMANTICS_SEQUENTIALLY_CONSISTENT_MASK:
				return MemorySemanticsSequentiallyConsistentMask;
			case Main.MEMORY_SEMANTICS_UNIFORM_MEMORY_MASK:
				return MemorySemanticsUniformMemoryMask;
			case Main.MEMORY_SEMANTICS_SUBGROUP_MEMORY_MASK:
				return MemorySemanticsSubgroupMemoryMask;
			case Main.MEMORY_SEMANTICS_WORKGROUP_MEMORY_MASK:
				return MemorySemanticsWorkgroupMemoryMask;
			case Main.MEMORY_SEMANTICS_CROSS_WORKGROUP_MEMORY_MASK:
				return MemorySemanticsCrossWorkgroupMemoryMask;
			case Main.MEMORY_SEMANTICS_ATOMIC_COUNTER_MEMORY_MASK:
				return MemorySemanticsAtomicCounterMemoryMask;
			case Main.MEMORY_SEMANTICS_IMAGE_MEMORY_MASK:
				return MemorySemanticsImageMemoryMask;
			case Main.MEMORY_SEMANTICS_OUTPUT_MEMORY_MASK:
				return MemorySemanticsOutputMemoryMask;
			case Main.MEMORY_SEMANTICS_MAKE_AVAILABLE_MASK:
				return MemorySemanticsMakeAvailableMask;
			case Main.MEMORY_SEMANTICS_MAKE_VISIBLE_MASK:
				return MemorySemanticsMakeVisibleMask;
			case Main.MEMORY_SEMANTICS_VOLATILE_MASK:
				return MemorySemanticsVolatileMask;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
