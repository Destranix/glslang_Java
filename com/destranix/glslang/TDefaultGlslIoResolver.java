package com.destranix.glslang;

public class TDefaultGlslIoResolver extends TDefaultIoResolverBase {

	private final TIntermediate intermediate;
	private final int constructorIndex;

	public TDefaultGlslIoResolver(TIntermediate intermediate) {
		super(PoisonClass.singleton);
		this.intermediate = intermediate;
		this.constructorIndex = 0;
		load();
	}

	protected TDefaultGlslIoResolver(byte[] ptr) {
		super(ptr);
		this.intermediate = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TDefaultGlslIoResolver(intermediate.getPtr());
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

	@Override
	public boolean validateBinding(EShLanguage stage, TVarEntryInfo ent) {
		return Main.TDefaultGlslIoResolver_validateBinding(ptr, stage, ent.getPtr());
	}

	@Override
	public TResourceType getResourceType(TType type) {
		return TResourceType.valueByConstant(Main.TDefaultGlslIoResolver_getResourceType(ptr, type.getPtr()));
	}

	@Override
	public int resolveInOutLocation(EShLanguage stage, TVarEntryInfo ent) {
		return Main.TDefaultGlslIoResolver_resolveInOutLocation(ptr, stage, ent.getPtr());
	}

	@Override
	public int resolveUniformLocation(EShLanguage stage, TVarEntryInfo ent) {
		return Main.TDefaultGlslIoResolver_resolveUniformLocation(ptr, stage, ent.getPtr());
	}

	@Override
	public int resolveBinding(EShLanguage stage, TVarEntryInfo ent) {
		return Main.TDefaultGlslIoResolver_resolveBinding(ptr, stage, ent.getPtr());
	}

	@Override
	public void beginResolve(EShLanguage stage) {
		Main.TDefaultGlslIoResolver_beginResolve(ptr, stage);
	}

	@Override
	public void endResolve(EShLanguage stage) {
		Main.TDefaultGlslIoResolver_endResolve(ptr, stage);
	}

	@Override
	public void beginCollect(EShLanguage stage) {
		Main.TDefaultGlslIoResolver_beginCollect(ptr, stage);
	}

	@Override
	public void endCollect(EShLanguage stage) {
		Main.TDefaultGlslIoResolver_endCollect(ptr, stage);
	}

	@Override
	public void reserverStorageSlot(TVarEntryInfo ent, TInfoSink infoSink) {
		Main.TDefaultGlslIoResolver_reserverStorageSlot(ptr, ent.getPtr(), infoSink.getPtr());
	}

	@Override
	public void reserverResourceSlot(TVarEntryInfo ent, TInfoSink infoSink) {
		Main.TDefaultGlslIoResolver_reserverResourceSlot(ptr, ent.getPtr(), infoSink.getPtr());
	}

	public String getAccessName(TIntermSymbol symbol) {
		return Main.TDefaultGlslIoResolver_getAccessName(ptr, symbol.getPtr());
	}

	public int buildStorageKey(EShLanguage stage, TStorageQualifier type) {
		return Main.TDefaultGlslIoResolver_buildStorageKey(ptr, stage, type);
	}

}
