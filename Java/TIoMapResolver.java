package Java;

public abstract class TIoMapResolver extends PointerBoundObject {

	private final int constructorIndex;

	protected TIoMapResolver(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected TIoMapResolver(byte[] ptr) {
		this.ptr = ptr;
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

	public abstract boolean validateBinding(EShLanguage stage, TVarEntryInfo ent);

	public abstract int resolveBinding(EShLanguage stage, TVarEntryInfo ent);

	public abstract int resolveSet(EShLanguage stage, TVarEntryInfo ent);

	public abstract int resolveUniformLocation(EShLanguage stage, TVarEntryInfo ent);

	public abstract boolean validateInOut(EShLanguage stage, TVarEntryInfo ent);

	public abstract int resolveInOutLocation(EShLanguage stage, TVarEntryInfo ent);

	public abstract int resolveInOutComponent(EShLanguage stage, TVarEntryInfo ent);

	public abstract int resolveInOutIndex(EShLanguage stage, TVarEntryInfo ent);

	public abstract void notifyBinding(EShLanguage stage, TVarEntryInfo ent);

	public abstract void notifyInOut(EShLanguage stage, TVarEntryInfo ent);

	public abstract void beginNotifications(EShLanguage stage);

	public abstract void endNotifications(EShLanguage stage);

	public abstract void beginResolve(EShLanguage stage);

	public abstract void endResolve(EShLanguage stage);

	public abstract void beginCollect(EShLanguage stage);

	public abstract void endCollect(EShLanguage stage);

	public abstract void reserverStorageSlot(TVarEntryInfo ent, TInfoSink infoSink);

	public abstract void reserverResourceSlot(TVarEntryInfo ent, TInfoSink infoSink);

	public abstract void addStage(EShLanguage stage);

}
