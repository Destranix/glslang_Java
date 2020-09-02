package com.destranix.glslang;

public class TAllocation extends PointerBoundObject {

	private final long size;
	private final byte[] mem;
	private final TAllocation prev;
	private final int constructorIndex;

	public TAllocation(long size, byte[] mem) {
		this.size = size;
		this.mem = mem;
		this.prev = null;
		this.constructorIndex = 0;
		load();
	}

	public TAllocation(long size, byte[] mem, TAllocation prev) {
		this.size = size;
		this.mem = mem;
		this.prev = null;
		this.constructorIndex = 1;
		load();
	}

	protected TAllocation(byte[] ptr) {
		this.ptr = ptr;
		this.size = -1;
		this.mem = null;
		this.prev = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TAllocation(size, mem);
					break;
				case 1:
					ptr = Main.TAllocation(size, mem, prev.getPtr());
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
				case 1:
					Main.delete(ptr);
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public void check() {
		Main.TAllocation_check(ptr);
	}

	public void checkAllocList() {
		Main.TAllocation_checkAllocList(ptr);
	}

	public static long allocationSize(long size) {
		return Main.TAllocation_allocationSize(size);
	}// NOTE: Interface not exact. size_t might be larger than long.

	public static byte[] offsetAllocation(byte[] m) {
		return Main.TAllocation_offsetAllocation(m);
	}

}
