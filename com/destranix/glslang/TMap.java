package com.destranix.glslang;

public class TMap<K extends PointerBoundObject, V extends PointerBoundObject> extends CMap<K, V> {

	private final int constructorIndex;

	public TMap() {
		super(PoisonClass.singleton);
		this.constructorIndex = 0;
		load();
	}

	protected TMap(byte[] ptr) {
		super(ptr);
		this.constructorIndex = -1;
	}

	protected TMap(PoisonClass p) {
		super(PoisonClass.singleton);
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TMap();
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

}
