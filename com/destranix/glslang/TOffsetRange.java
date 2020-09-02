package com.destranix.glslang;

public class TOffsetRange extends PointerBoundObject {

	protected byte[] ptr;

	private final TRange binding;
	private final TRange offset;
	private final int constructorIndex;

	public TOffsetRange(TRange binding, TRange offset) {
		this.binding = binding;
		this.offset = offset;
		this.constructorIndex = 0;
		load();
	}

	protected TOffsetRange(byte[] ptr) {
		this.ptr = ptr;
		this.binding = null;
		this.offset = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TOffsetRange(binding.getPtr(), offset.getPtr());
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

	public boolean overlap(TOffsetRange rhs) {
		return Main.TOffsetRange_overlap(ptr, rhs.getPtr());
	}

	public void setBinding(TRange v) {
		Main.TOffsetRange_setBinding(ptr, v.getPtr());
	}

	public void setOffset(TRange v) {
		Main.TOffsetRange_setOffset(ptr, v.getPtr());
	}

	public TRange getBinding() {
		return fromPtr(Main.TOffsetRange_getBinding(ptr), TRange.class);
	}

	public TRange getOffset() {
		return fromPtr(Main.TOffsetRange_getOffset(ptr), TRange.class);
	}

}
