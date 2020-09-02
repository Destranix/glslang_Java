package com.destranix.glslang;

public class TPoolAllocator extends PointerBoundObject {

	protected byte[] ptr;

	private final int growthIncrement;
	private final int allocationAlignment;
	private final int constructorIndex;

	public TPoolAllocator() {
		this.growthIncrement = 8 * 1024;
		this.allocationAlignment = 16;
		this.constructorIndex = 0;
		load();
	}

	public TPoolAllocator(int growthIncrement) {
		this.growthIncrement = growthIncrement;
		this.allocationAlignment = 16;
		this.constructorIndex = 0;
		load();
	}

	public TPoolAllocator(int growthIncrement, int allocationAlignment) {
		this.growthIncrement = growthIncrement;
		this.allocationAlignment = allocationAlignment;
		this.constructorIndex = 0;
		load();
	}

	protected TPoolAllocator(byte[] ptr) {
		this.ptr = ptr;
		this.growthIncrement = -1;
		this.allocationAlignment = -1;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TPoolAllocator(growthIncrement, allocationAlignment);
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	@Override
	protected void free_intern() {
		if (ptr != null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_FREEABLE);
				case 0:
					Main.delete(ptr);
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public void push() {
		Main.TPoolAllocator_push(ptr);
	}

	public void pop() {
		Main.TPoolAllocator_pop(ptr);
	}

	public void popAll() {
		Main.TPoolAllocator_popAll(ptr);
	}

	public byte[] allocate(long numBytes) {
		return Main.TPoolAllocator_allocate(ptr, numBytes);
	}// NOTE: Interface not exact. size_t might be larger than long.

}
