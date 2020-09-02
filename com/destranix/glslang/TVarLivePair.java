package com.destranix.glslang;

public class TVarLivePair extends CPair<TString, TVarEntryInfo> {

	private final CPair<TString, TVarEntryInfo> src;
	private final int constructorIndex;

	public TVarLivePair(CPair<TString, TVarEntryInfo> src) {
		super(PoisonClass.singleton);
		this.src = src;
		this.constructorIndex = 0;
		load();
	}

	public TVarLivePair(TVarLivePair src) {
		super(PoisonClass.singleton);
		this.src = src;
		this.constructorIndex = 1;
		load();
	}

	protected TVarLivePair(byte[] ptr) {
		super(ptr);
		this.src = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TVarLivePair(src.getPtr());
					break;
				case 1:
					ptr = Main.TVarLivePairFromPair(src.getPtr());
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

	public TVarLivePair operatorAssign(TVarLivePair _Right) {
		return fromPtr(Main.TVarLivePair_operatorAssign(ptr, _Right.getPtr()), TVarLivePair.class);
	}

}
