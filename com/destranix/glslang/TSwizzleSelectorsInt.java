package com.destranix.glslang;

public class TSwizzleSelectorsInt extends PointerBoundObject {

	private final int constructorIndex;

	public TSwizzleSelectorsInt() {
		this.constructorIndex = 0;
		load();
	}

	protected TSwizzleSelectorsInt(byte[] ptr) {
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
					ptr = Main.TSwizzleSelectorsInt();
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

	public void push_back(int comp) {
		Main.TSwizzleSelectorsInt_push_back(ptr, comp);
	}

	public void resize(int s) {
		Main.TSwizzleSelectorsInt_resize(ptr, s);
	}

	public int size() {
		return Main.TSwizzleSelectorsInt_size(ptr);
	}

	public int operatorAt(int i) {
		return Main.TSwizzleSelectorsInt_operatorAt(ptr, i);
	}

}
