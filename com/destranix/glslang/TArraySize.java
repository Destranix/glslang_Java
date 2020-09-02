package com.destranix.glslang;

public class TArraySize extends PointerBoundObject {

	private final long size;
	private final TIntermTyped node;
	private final int constructorIndex;

	public TArraySize() {
		this.size = -1;
		this.node = null;
		this.constructorIndex = 0;
		load();
	}

	public TArraySize(long size, TIntermTyped node) {
		this.size = size;
		this.node = node;
		this.constructorIndex = 1;
		load();
	}

	protected TArraySize(byte[] ptr) {
		this.ptr = ptr;
		this.size = -1;
		this.node = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TArraySize();
					break;
				case 1:
					ptr = Main.TArraySize(size, node.getPtr());
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

	public void setSize(long v) {
		Main.TArraySize_setSize(ptr, v);
	}

	public void setNode(TIntermTyped v) {
		Main.TArraySize_setNode(ptr, v.getPtr());
	}

	public long getSize() {
		return Main.TArraySize_getSize(ptr);
	}

	public TIntermTyped getNode() {
		return fromPtr(Main.TArraySize_getNode(ptr), TIntermTyped.class);
	}

	public boolean operatorEqual(TArraySize rhs) {
		return Main.TArraySize_operatorEqual(ptr, rhs.getPtr());
	}

}
