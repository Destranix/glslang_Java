package com.destranix.glslang;

public class CPair<K extends PointerBoundObject, V extends PointerBoundObject> extends PointerBoundObject {

	private final int constructorIndex;

	public CPair() {
		this.constructorIndex = 0;
		load();
	}

	protected CPair(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected CPair(byte[] ptr) {
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
					ptr = Main.CPair();
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

	public PointerBoundObject getFirst() {
		return fromPtrUndefined(Main.CPair_getFirst(ptr));
	}

	public PointerBoundObject getLast() {
		return fromPtrUndefined(Main.CPair_getLast(ptr));
	}

	public PointerBoundObject setFirst(K value) {
		return fromPtrUndefined(Main.CPair_setFirst(ptr, value.getPtr()));
	}

	public PointerBoundObject setLast(V value) {
		return fromPtrUndefined(Main.CPair_setLast(ptr, value.getPtr()));
	}

}
