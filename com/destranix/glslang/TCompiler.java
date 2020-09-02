package com.destranix.glslang;

public abstract class TCompiler extends TShHandleBase {

	private final int constructorIndex;

	protected TCompiler(byte[] ptr) {
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

	public EShLanguage getLanguage() {
		return EShLanguage.valueByConstant(Main.TCompiler_getLanguage(ptr));
	}

	public TInfoSink getInfoSink() {
		return fromPtr(Main.TCompiler_getInfoSink(ptr), TInfoSink.class);
	}

	public abstract boolean compile(TIntermNode root);

	public abstract boolean ompile(TIntermNode root, int version);

	public abstract boolean compile(TIntermNode root, int version, EProfile profile);

	@Override
	public TCompiler getAsCompiler() {
		return fromPtr(Main.TCompiler_getAsCompiler(ptr), TCompiler.class);
	}

	public boolean linkable() {
		return Main.TCompiler_linkable(ptr);
	}

	public void setInfoSink(TInfoSink infoSink) {
		Main.TCompiler_setInfoSink(ptr, infoSink.getPtr());
	}

}
