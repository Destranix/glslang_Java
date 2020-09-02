package Java;

public abstract class TSymbol extends PointerBoundObject {

	private final int constructorIndex;

	protected TSymbol(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected TSymbol(byte[] ptr) {
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

	@Override
	public TSymbol clone() {
		return fromPtr(Main.TSymbol_clone(ptr), TSymbol.class);
	}

	public String getName() {
		return Main.TSymbol_getName(ptr);
	}

	public void changeName(String newName) {
		Main.TSymbol_changeName(ptr, newName);
	}

	public void addPrefix(String prefix) {
		Main.TSymbol_addPrefix(ptr, prefix);
	}

	public String getMangledName() {
		return Main.TSymbol_getMangledName(ptr);
	}

	public TFunction getAsFunction() {
		return fromPtr(Main.TSymbol_getAsFunction(ptr), TFunction.class);
	}

	public TVariable getAsVariable() {
		return fromPtr(Main.TSymbol_getAsVariable(ptr), TVariable.class);
	}

	public TAnonMember getAsAnonMember() {
		return fromPtr(Main.TSymbol_getAsAnonMember(ptr), TAnonMember.class);
	}

	public TType getType() {
		return fromPtr(Main.TSymbol_getType(ptr), TType.class);
	}

	public TType getWritableType() {
		return fromPtr(Main.TSymbol_getWritableType(ptr), TType.class);
	}

	public void setUniqueId(int id) {
		Main.TSymbol_setUniqueId(ptr, id);
	}

	public int getUniqueId() {
		return Main.TSymbol_getUniqueId(ptr);
	}

	public void setExtensions(String[] exts) {
		Main.TSymbol_setExtensions(ptr, exts);
	}

	public int getNumExtensions() {
		return Main.TSymbol_getNumExtensions(ptr);
	}

	public String[] getExtensions() {
		return Main.TSymbol_getExtensions(ptr);
	}

	public void dump(TInfoSink infoSink) {
		Main.TSymbol_dump(ptr, infoSink.getPtr());
	}

	public void dump(TInfoSink infoSink, boolean complete) {
		Main.TSymbol_dump(ptr, infoSink.getPtr(), complete);
	}

	public void dumpExtensions(TInfoSink infoSink) {
		Main.TSymbol_dumpExtensions(ptr, infoSink.getPtr());
	}

	public boolean isReadOnly() {
		return Main.TSymbol_isReadOnly(ptr);
	}

	public void makeReadOnly() {
		Main.TSymbol_makeReadOnly(ptr);
	}

}
