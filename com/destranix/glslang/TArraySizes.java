package com.destranix.glslang;

public class TArraySizes extends PointerBoundObject {

	private final int constructorIndex;

	public TArraySizes() {
		this.constructorIndex = 0;
		load();
	}

	protected TArraySizes(byte[] ptr) {
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
					ptr = Main.TArraySizes();
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

	public int getNumDims() {
		return Main.TArraySizes_getNumDims(ptr);
	}

	public int getDimSize(int dim) {
		return Main.TArraySizes_getDimSize(ptr, dim);
	}

	public TIntermTyped getDimNode(int dim) {
		return fromPtr(Main.TArraySizes_getDimNode(ptr, dim), TIntermTyped.class);
	}

	public void setDimSize(int dim, int size) {
		Main.TArraySizes_setDimSize(ptr, dim, size);
	}

	public int getOuterSize() {
		return Main.TArraySizes_getOuterSize(ptr);
	}

	public TIntermTyped getOuterNode() {
		return fromPtr(Main.TArraySizes_getOuterNode(ptr), TIntermTyped.class);
	}

	public int getCumulativeSize() {
		return Main.TArraySizes_getCumulativeSize(ptr);
	}

	public void addInnerSize() {
		Main.TArraySizes_addInnerSize(ptr);
	}

	public void addInnerSize(int s) {
		Main.TArraySizes_addInnerSize(ptr, s);
	}

	public void addInnerSize(int s, TIntermTyped n) {
		Main.TArraySizes_addInnerSize(ptr, s, n.getPtr());
	}

	public void addInnerSize(TArraySize pair) {
		Main.TArraySizes_addInnerSize(ptr, pair.getPtr());
	}

	public void addInnerSizes(TArraySizes s) {
		Main.TArraySizes_addInnerSizes(ptr, s.getPtr());
	}

	public void changeOuterSize(int s) {
		Main.TArraySizes_changeOuterSize(ptr, s);
	}

	public int getImplicitSize() {
		return Main.TArraySizes_getImplicitSize(ptr);
	}

	public void updateImplicitSize(int s) {
		Main.TArraySizes_updateImplicitSize(ptr, s);
	}

	public boolean isInnerUnsized() {
		return Main.TArraySizes_isInnerUnsized(ptr);
	}

	public boolean clearInnerUnsized() {
		return Main.TArraySizes_clearInnerUnsized(ptr);
	}

	public boolean isInnerSpecialization() {
		return Main.TArraySizes_isInnerSpecialization(ptr);
	}

	public boolean isOuterSpecialization() {
		return Main.TArraySizes_isOuterSpecialization(ptr);
	}

	public boolean hasUnsized() {
		return Main.TArraySizes_hasUnsized(ptr);
	}

	public boolean isSized() {
		return Main.TArraySizes_isSized(ptr);
	}

	public void dereference() {
		Main.TArraySizes_dereference(ptr);
	}

	public void copyDereferenced(byte[] rhs) {
		Main.TArraySizes_copyDereferenced(ptr, rhs);
	}

	public boolean sameInnerArrayness(TArraySizes rhs) {
		return Main.TArraySizes_sameInnerArrayness(ptr, rhs.getPtr());
	}

	public void setVariablyIndexed() {
		Main.TArraySizes_setVariablyIndexed(ptr);
	}

	public boolean isVariablyIndexed() {
		return Main.TArraySizes_isVariablyIndexed(ptr);
	}

	public TArraySizes operatorAssign(TArraySizes from) {
		return fromPtr(Main.TArraySizes_operatorAssign(ptr, from.getPtr()), TArraySizes.class);
	}

	public boolean operatorEqual(TArraySizes rhs) {
		return Main.TArraySizes_operatorEqual(ptr, rhs.getPtr());
	}

	public boolean operatorNotEqual(TArraySizes rhs) {
		return Main.TArraySizes_operatorNotEqual(ptr, rhs.getPtr());
	}

}
