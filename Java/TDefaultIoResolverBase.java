package Java;

public abstract class TDefaultIoResolverBase extends TIoMapResolver {

	private final int constructorIndex;

	protected TDefaultIoResolverBase(PoisonClass p) {
		super(PoisonClass.singleton);
		this.constructorIndex = -1;
	}

	protected TDefaultIoResolverBase(byte[] ptr) {
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
	public boolean validateBinding(EShLanguage stage, TVarEntryInfo ent) {
		return Main.TDefaultIoResolverBase_validateBinding(ptr, stage, ent.getPtr());
	}

	@Override
	public int resolveBinding(EShLanguage stage, TVarEntryInfo ent) {
		return Main.TDefaultIoResolverBase_resolveBinding(ptr, stage, ent.getPtr());
	}

	@Override
	public void notifyBinding(EShLanguage language, TVarEntryInfo ent) {
		Main.TDefaultIoResolverBase_notifyBinding(ptr, language, ent.getPtr());
	}

	@Override
	public void notifyInOut(EShLanguage language, TVarEntryInfo ent) {
		Main.TDefaultIoResolverBase_notifyInOut(ptr, language, ent.getPtr());
	}

	@Override
	public void beginNotifications(EShLanguage language) {
		Main.TDefaultIoResolverBase_beginNotifications(ptr, language);
	}

	@Override
	public void endNotifications(EShLanguage language) {
		Main.TDefaultIoResolverBase_endNotifications(ptr, language);
	}

	@Override
	public void beginResolve(EShLanguage language) {
		Main.TDefaultIoResolverBase_beginResolve(ptr, language);
	}

	@Override
	public void endResolve(EShLanguage language) {
		Main.TDefaultIoResolverBase_endResolve(ptr, language);
	}

	@Override
	public void beginCollect(EShLanguage language) {
		Main.TDefaultIoResolverBase_beginCollect(ptr, language);
	}

	@Override
	public void endCollect(EShLanguage language) {
		Main.TDefaultIoResolverBase_endCollect(ptr, language);
	}

	@Override
	public void reserverResourceSlot(TVarEntryInfo ent, TInfoSink infoSink) {
		Main.TDefaultIoResolverBase_reserverResourceSlot(ptr, ent.getPtr(), infoSink.getPtr());
	}

	@Override
	public void reserverStorageSlot(TVarEntryInfo ent, TInfoSink infoSink) {
		Main.TDefaultIoResolverBase_reserverStorageSlot(ptr, ent.getPtr(), infoSink.getPtr());
	}

	public int getBaseBinding(TResourceType res, long set) {
		return Main.TDefaultIoResolverBase_getBaseBinding(ptr, res, set);
	}

	public String[] getResourceSetBinding() {
		return Main.TDefaultIoResolverBase_getResourceSetBinding(ptr);
	}

	public TResourceType getResourceType(TType type) {
		return TResourceType.valueByConstant(Main.TDefaultIoResolverBase_getResourceType(ptr, type.getPtr()));
	}

	public boolean doAutoBindingMapping() {
		return Main.TDefaultIoResolverBase_doAutoBindingMapping(ptr);
	}

	public boolean doAutoLocationMapping() {
		return Main.TDefaultIoResolverBase_doAutoLocationMapping(ptr);
	}

	public CPrimitiveIterator.OfInt findSlot(int set, int slot) {
		return fromPtr(Main.TDefaultIoResolverBase_findSlot(ptr, set, slot), CPrimitiveIterator.OfInt.class);
	}

	public boolean checkEmpty(int set, int slot) {
		return Main.TDefaultIoResolverBase_checkEmpty(ptr, set, slot);
	}

	@Override
	public boolean validateInOut(EShLanguage stage, TVarEntryInfo ent) {
		return Main.TDefaultIoResolverBase_validateInOut(ptr, stage, ent.getPtr());
	}

	public int reserveSlot(int set, int slot, int size) {
		return Main.TDefaultIoResolverBase_reserveSlot(ptr, set, slot, size);
	}

	public int getFreeSlot(int set, int base, int size) {
		return Main.TDefaultIoResolverBase_getFreeSlot(ptr, set, base, size);
	}

	@Override
	public int resolveSet(EShLanguage stage, TVarEntryInfo ent) {
		return Main.TDefaultIoResolverBase_resolveSet(ptr, stage, ent.getPtr());
	}

	@Override
	public int resolveUniformLocation(EShLanguage stage, TVarEntryInfo ent) {
		return Main.TDefaultIoResolverBase_resolveUniformLocation(ptr, stage, ent.getPtr());
	}

	@Override
	public int resolveInOutLocation(EShLanguage stage, TVarEntryInfo ent) {
		return Main.TDefaultIoResolverBase_resolveInOutLocation(ptr, stage, ent.getPtr());
	}

	@Override
	public int resolveInOutComponent(EShLanguage stage, TVarEntryInfo ent) {
		return Main.TDefaultIoResolverBase_resolveInOutComponent(ptr, stage, ent.getPtr());
	}

	@Override
	public int resolveInOutIndex(EShLanguage stage, TVarEntryInfo ent) {
		return Main.TDefaultIoResolverBase_resolveInOutIndex(ptr, stage, ent.getPtr());
	}

	@Override
	public void addStage(EShLanguage stage) {
		Main.TDefaultIoResolverBase_addStage(ptr, stage);
	}

	public long computeTypeLocationSize(TType type, EShLanguage stage) {
		return Main.TDefaultIoResolverBase_computeTypeLocationSize(ptr, type.getPtr(), stage);
	}

	public void setSlots(IntKeyedIntArrayCMap v) {
		Main.TDefaultIoResolverBase_setSlots(ptr, v.getPtr());
	}

	public void setHasError(boolean v) {
		Main.TDefaultIoResolverBase_setHasError(ptr, v);
	}

	public IntKeyedIntArrayCMap getSlots() {
		return fromPtr(Main.TDefaultIoResolverBase_getSlots(ptr), IntKeyedIntArrayCMap.class);
	}

	public boolean getHasError() {
		return Main.TDefaultIoResolverBase_getHasError(ptr);
	}

}
