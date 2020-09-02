package com.destranix.glslang;

public class TShHandleBase extends PointerBoundObject {

	private final int constructorIndex;

	public TShHandleBase() {
		this.constructorIndex = 0;
		load();
	}

	protected TShHandleBase(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected TShHandleBase(byte[] ptr) {
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
					ptr = Main.TShHandleBase();
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

	public TCompiler getAsCompiler() {
		return fromPtr(Main.TShHandleBase_getAsCompiler(ptr), TCompiler.class);
	}

	public TLinker getAsLinker() {
		return fromPtr(Main.TShHandleBase_getAsLinker(ptr), TLinker.class);
	}

	public TUniformMap getAsUniformMap() {
		return fromPtr(Main.TShHandleBase_getAsUniformMap(ptr), TUniformMap.class);
	}

	public TPoolAllocator getPool() {
		return fromPtr(Main.TShHandleBase_getPool(ptr), TPoolAllocator.class);
	}

}
