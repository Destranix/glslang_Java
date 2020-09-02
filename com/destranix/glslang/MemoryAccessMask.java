package com.destranix.glslang;

public enum MemoryAccessMask {
	MemoryAccessMaskNone(Main.MEMORY_ACCESS_MASK_NONE),
	MemoryAccessVolatileMask(Main.MEMORY_ACCESS_VOLATILE_MASK),
	MemoryAccessAlignedMask(Main.MEMORY_ACCESS_ALIGNED_MASK),
	MemoryAccessNontemporalMask(Main.MEMORY_ACCESS_NONTEMPORAL_MASK),
	MemoryAccessMakePointerAvailableMask(Main.MEMORY_ACCESS_MAKE_POINTER_AVAILABLE_MASK),
	MemoryAccessMakePointerAvailableKHRMask(Main.MEMORY_ACCESS_MAKE_POINTER_AVAILABLE_KHR_MASK),
	MemoryAccessMakePointerVisibleMask(Main.MEMORY_ACCESS_MAKE_POINTER_VISIBLE_MASK),
	MemoryAccessMakePointerVisibleKHRMask(Main.MEMORY_ACCESS_MAKE_POINTER_VISIBLE_KHR_MASK),
	MemoryAccessNonPrivatePointerMask(Main.MEMORY_ACCESS_NON_PRIVATE_POINTER_MASK),
	MemoryAccessNonPrivatePointerKHRMask(Main.MEMORY_ACCESS_NON_PRIVATE_POINTER_KHR_MASK);

	private final int value;

	private MemoryAccessMask(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static MemoryAccessMask valueByStr(String str) {
		switch (str) {
			case "MemoryAccessMaskNone":
				return MemoryAccessMaskNone;
			case "MemoryAccessVolatileMask":
				return MemoryAccessVolatileMask;
			case "MemoryAccessAlignedMask":
				return MemoryAccessAlignedMask;
			case "MemoryAccessNontemporalMask":
				return MemoryAccessNontemporalMask;
			case "MemoryAccessMakePointerAvailableMask":
				return MemoryAccessMakePointerAvailableMask;
			case "MemoryAccessMakePointerAvailableKHRMask":
				return MemoryAccessMakePointerAvailableKHRMask;
			case "MemoryAccessMakePointerVisibleMask":
				return MemoryAccessMakePointerVisibleMask;
			case "MemoryAccessMakePointerVisibleKHRMask":
				return MemoryAccessMakePointerVisibleKHRMask;
			case "MemoryAccessNonPrivatePointerMask":
				return MemoryAccessNonPrivatePointerMask;
			case "MemoryAccessNonPrivatePointerKHRMask":
				return MemoryAccessNonPrivatePointerKHRMask;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static MemoryAccessMask valueByConstant(int constant) {
		switch (constant) {
			case Main.MEMORY_ACCESS_MASK_NONE:
				return MemoryAccessMaskNone;
			case Main.MEMORY_ACCESS_VOLATILE_MASK:
				return MemoryAccessVolatileMask;
			case Main.MEMORY_ACCESS_ALIGNED_MASK:
				return MemoryAccessAlignedMask;
			case Main.MEMORY_ACCESS_NONTEMPORAL_MASK:
				return MemoryAccessNontemporalMask;
			case Main.MEMORY_ACCESS_MAKE_POINTER_AVAILABLE_MASK:
				return MemoryAccessMakePointerAvailableMask;
			case Main.MEMORY_ACCESS_MAKE_POINTER_VISIBLE_MASK:
				return MemoryAccessMakePointerVisibleMask;
			case Main.MEMORY_ACCESS_NON_PRIVATE_POINTER_MASK:
				return MemoryAccessNonPrivatePointerMask;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
