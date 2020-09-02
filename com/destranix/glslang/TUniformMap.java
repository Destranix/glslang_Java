package com.destranix.glslang;

public abstract class TUniformMap extends TShHandleBase {

	private final int constructorIndex;

	protected TUniformMap(byte[] ptr) {
		super(ptr);
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
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
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	@Override
	public TUniformMap getAsUniformMap() {
		return fromPtr(Main.TUniformMap_getAsUniformMap(ptr), TUniformMap.class);
	}

	public abstract int getLocation(String name);

	public TInfoSink getInfoSink() {
		return fromPtr(Main.TUniformMap_getInfoSink(ptr), TInfoSink.class);
	}

	public void setInfoSink(TInfoSink infoSink) {
		Main.TUniformMap_setInfoSink(ptr, infoSink.getPtr());
	}

}
