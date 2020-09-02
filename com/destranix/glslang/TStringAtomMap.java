package com.destranix.glslang;

public class TStringAtomMap extends PointerBoundObject {

	private final int constructorIndex;

	public TStringAtomMap() {
		this.constructorIndex = 0;
		load();
	}

	protected TStringAtomMap(byte[] ptr) {
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
					ptr = Main.TStringAtomMap();
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

	public int getAtom(String s) {
		return Main.TStringAtomMap_getAtom(ptr, s);
	}

	public int getAddAtom(String s) {
		return Main.TStringAtomMap_getAddAtom(ptr, s);
	}

	public String getString(int atom) {
		return Main.TStringAtomMap_getString(ptr, atom);
	}

}
