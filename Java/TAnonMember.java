package Java;

public class TAnonMember extends TSymbol {

	private final String n;
	private final long m;
	private final TVariable a;
	private final int an;
	private final int constructorIndex;

	public TAnonMember(String n, long m, TVariable a, int an) {
		super(PoisonClass.singleton);
		this.n = n;
		this.m = m;
		this.a = a;
		this.an = an;
		this.constructorIndex = 0;
		load();
	}

	protected TAnonMember(byte[] ptr) {
		super(ptr);
		this.n = null;
		this.m = -1;
		this.a = null;
		this.an = -1;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TAnonMember(n, m, a.getPtr(), an);
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
	public TAnonMember clone() {
		return fromPtr(Main.TAnonMember_clone(ptr), TAnonMember.class);
	}

	@Override
	public TAnonMember getAsAnonMember() {
		return fromPtr(Main.TAnonMember_getAsAnonMember(ptr), TAnonMember.class);
	}

	public TVariable getAnonContainer() {
		return fromPtr(Main.TAnonMember_getAnonContainer(ptr), TVariable.class);
	}

	public long getMemberNumber() {
		return Main.TAnonMember_getMemberNumber(ptr);
	}

	@Override
	public TType getType() {
		return fromPtr(Main.TAnonMember_getType(ptr), TType.class);
	}

	@Override
	public TType getWritableType() {
		return fromPtr(Main.TAnonMember_getWritableType(ptr), TType.class);
	}

	@Override
	public void setExtensions(String[] exts) {
		Main.TAnonMember_setExtensions(ptr, exts);
	}

	@Override
	public int getNumExtensions() {
		return Main.TAnonMember_getNumExtensions(ptr);
	}

	@Override
	public String[] getExtensions() {
		return Main.TAnonMember_getExtensions(ptr);
	}

	public int getAnonId() {
		return Main.TAnonMember_getAnonId(ptr);
	}

	@Override
	public void dump(TInfoSink infoSink) {
		Main.TAnonMember_dump(ptr, infoSink.getPtr());
	}

	@Override
	public void dump(TInfoSink infoSink, boolean complete) {
		Main.TAnonMember_dump(ptr, infoSink.getPtr(), complete);
	}

}
