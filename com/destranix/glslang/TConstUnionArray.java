package com.destranix.glslang;

public class TConstUnionArray extends PointerBoundObject {

	private final int size;
	private final TConstUnionArray a;
	private final int start;
	private final TConstUnion val;
	private final int constructorIndex;

	public TConstUnionArray() {
		this.size = -1;
		this.a = null;
		this.start = -1;
		this.val = null;
		this.constructorIndex = 0;
		load();
	}

	public TConstUnionArray(int size) {
		this.size = size;
		this.a = null;
		this.start = -1;
		this.val = null;
		this.constructorIndex = 1;
		load();
	}

	public TConstUnionArray(TConstUnionArray a) {
		this.size = -1;
		this.a = a;
		this.start = -1;
		this.val = null;
		this.constructorIndex = 2;
		load();
	}

	public TConstUnionArray(TConstUnionArray a, int start, int size) {
		this.size = size;
		this.a = a;
		this.start = start;
		this.val = null;
		this.constructorIndex = 3;
		load();
	}

	public TConstUnionArray(int size, TConstUnion val) {
		this.size = size;
		this.a = null;
		this.start = -1;
		this.val = val;
		this.constructorIndex = 4;
		load();
	}

	protected TConstUnionArray(byte[] ptr) {
		this.ptr = ptr;
		this.size = -1;
		this.a = null;
		this.start = -1;
		this.val = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TConstUnionArray();
					break;
				case 1:
					ptr = Main.TConstUnionArray(size);
					break;
				case 2:
					ptr = Main.TConstUnionArray(a.getPtr());
					break;
				case 3:
					ptr = Main.TConstUnionArray(a.getPtr(), start, size);
					break;
				case 4:
					ptr = Main.TConstUnionArray(size, val.getPtr());
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
				case 2:
				case 3:
				case 4:
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public int size() {
		return Main.TConstUnionArray_size(ptr);
	}

	public double dot(TConstUnionArray rhs) {
		return Main.TConstUnionArray_dot(ptr, rhs.getPtr());
	}

	public boolean empty() {
		return Main.TConstUnionArray_empty(ptr);
	}

	public TConstUnion operatorAt(long index) {
		return fromPtr(Main.TConstUnionArray_operatorAt(ptr, index), TConstUnion.class);
	}// NOTE: Interface not exact. size_t might be larger than long.

	public boolean operatorEqual(TConstUnionArray rhs) {
		return Main.TConstUnionArray_operatorEqual(ptr, rhs.getPtr());
	}

	public boolean operatorNotEqual(TConstUnionArray rhs) {
		return Main.TConstUnionArray_operatorNotEqual(ptr, rhs.getPtr());
	}

}
