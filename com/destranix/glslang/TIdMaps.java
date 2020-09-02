package com.destranix.glslang;

public class TIdMaps extends PointerBoundObject {

	private final int constructorIndex;

	public TIdMaps() {
		this.constructorIndex = 0;
		load();
	}

	protected TIdMaps(byte[] ptr) {
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
					ptr = Main.TIdMaps();
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

	public IntCMap<TString> operatorAt(int i) {
		@SuppressWarnings("unchecked") // Is checked
		IntCMap<TString> tmp = (IntCMap<TString>) fromPtr(Main.TIdMaps_operatorAt(ptr, i), IntCMap.class);
		return tmp;
	}

}
