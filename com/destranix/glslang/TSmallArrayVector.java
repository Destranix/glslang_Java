package com.destranix.glslang;

public class TSmallArrayVector extends PointerBoundObject {

	private final int constructorIndex;

	public TSmallArrayVector() {
		this.constructorIndex = 0;
		load();
	}

	protected TSmallArrayVector(byte[] ptr) {
		this.ptr = ptr;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TSmallArrayVector();
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
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public int size() {
		return Main.TSmallArrayVector_size(ptr);
	}

	public long frontSize() {
		return Main.TSmallArrayVector_frontSize(ptr);
	}

	public TIntermTyped frontNode() {
		return fromPtr(Main.TSmallArrayVector_frontNode(ptr), TIntermTyped.class);
	}

	public void changeFront(long s) {
		Main.TSmallArrayVector_changeFront(ptr, s);
	}

	public void push_back(long e, TIntermTyped n) {
		Main.TSmallArrayVector_push_back(ptr, e, n.getPtr());
	}

	public void push_back(TSmallArrayVector newDims) {
		Main.TSmallArrayVector_push_back(ptr, newDims.getPtr());
	}

	public void pop_front() {
		Main.TSmallArrayVector_pop_front(ptr);
	}

	public void copyNonFront(TSmallArrayVector rhs) {
		Main.TSmallArrayVector_copyNonFront(ptr, rhs.getPtr());
	}

	public long getDimSize(int i) {
		return Main.TSmallArrayVector_getDimSize(ptr, i);
	}

	public void setDimSize(int i, long size) {
		Main.TSmallArrayVector_setDimSize(ptr, i, size);
	}

	public TIntermTyped getDimNode(int i) {
		return fromPtr(Main.TSmallArrayVector_getDimNode(ptr, i), TIntermTyped.class);
	}

	public TSmallArrayVector operatorAssign(TSmallArrayVector from) {
		return fromPtr(Main.TSmallArrayVector_operatorAssign(ptr, from.getPtr()), TSmallArrayVector.class);
	}

	public boolean operatorEqual(TSmallArrayVector rhs) {
		return Main.TSmallArrayVector_operatorEqual(ptr, rhs.getPtr());
	}

	public boolean operatorNotEqual(TSmallArrayVector rhs) {
		return Main.TSmallArrayVector_operatorNotEqual(ptr, rhs.getPtr());
	}

}
