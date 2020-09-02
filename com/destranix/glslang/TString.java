package com.destranix.glslang;

public class TString extends PointerBoundObject {

	private final String str;
	private final int constructorIndex;

	public TString(String str) {
		this.str = str;
		this.constructorIndex = 0;
		load();
	}

	protected TString(PoisonClass p) {
		this.str = null;
		this.constructorIndex = -1;
	}

	protected TString(byte[] ptr) {
		this.str = null;
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
					ptr = Main.TString(str);
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

	public String asString() {
		return Main.TString_asString(ptr);
	}

}
