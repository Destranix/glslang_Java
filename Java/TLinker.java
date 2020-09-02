package Java;

public abstract class TLinker extends TShHandleBase {

	private final int constructorIndex;

	protected TLinker(byte[] ptr) {
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
	public TLinker getAsLinker() {
		return fromPtr(Main.TLinker_getAsLinker(ptr), TLinker.class);
	}

	public abstract boolean link(TVector<TCompiler> list, TUniformMap map);

	public boolean link(TVector<TShHandleBase> list) {
		return Main.TLinker_link(ptr, list.getPtr());
	}

	public void setAppAttributeBindings(BindingTable t) {
		Main.TLinker_setAppAttributeBindings(ptr, t.getPtr());
	}

	public void setFixedAttributeBindings(BindingTable t) {
		Main.TLinker_setFixedAttributeBindings(ptr, t.getPtr());
	}

	public abstract void getAttributeBindings(BindingTable t);

	public void setExcludedAttributes(int[] attributes, int count) {
		Main.TLinker_setExcludedAttributes(ptr, attributes, count);
	}

	public BindingTable getUniformBindings() {
		return fromPtr(Main.TLinker_getUniformBindings(ptr), BindingTable.class);
	}

	public byte[] getObjectCode() {
		return Main.TLinker_getObjectCode(ptr);
	}

	public TInfoSink getInfoSink() {
		return fromPtr(Main.TLinker_getInfoSink(ptr), TInfoSink.class);
	}

	public void setInfoSink(TInfoSink infoSink) {
		Main.TLinker_setInfoSink(ptr, infoSink.getPtr());
	}

}
