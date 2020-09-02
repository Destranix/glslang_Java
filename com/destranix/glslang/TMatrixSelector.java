package com.destranix.glslang;

public class TMatrixSelector extends PointerBoundObject {

	private final int coord1;
	private final int coord2;
	private final int constructorIndex;

	public TMatrixSelector() {
		this.coord1 = -1;
		this.coord2 = -1;
		this.constructorIndex = 0;
		load();
	}

	public TMatrixSelector(int coord1, int coord2) {
		this.coord1 = coord1;
		this.coord2 = coord2;
		this.constructorIndex = 1;
		load();
	}

	protected TMatrixSelector(byte[] ptr) {
		this.ptr = ptr;
		this.coord1 = -1;
		this.coord2 = -1;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TMatrixSelector();
					break;
				case 1:
					ptr = Main.TMatrixSelector(coord1, coord2);
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

	public void setCoord1(int v) {
		Main.TMatrixSelector_setCoord1(ptr, v);
	}

	public void setCoord2(int v) {
		Main.TMatrixSelector_setCoord2(ptr, v);
	}

	public int getCoord1() {
		return Main.TMatrixSelector_getCoord1(ptr);
	}

	public int getCoord2() {
		return Main.TMatrixSelector_getCoord2(ptr);
	}

}
