package Java;

public class TIntermMethod extends TIntermTyped {

	private final TIntermTyped o;
	private final TType t;
	private final String m;
	private final int constructorIndex;

	public TIntermMethod(TIntermTyped o, TType t, String m) {
		super(PoisonClass.singleton);
		this.o = o;
		this.t = t;
		this.m = m;
		this.constructorIndex = 0;
		load();
	}

	protected TIntermMethod(byte[] ptr) {
		super(ptr);
		this.o = null;
		this.t = null;
		this.m = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TIntermMethod(o.getPtr(), t.getPtr(), m);
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
	public TIntermMethod getAsMethodNode() {
		return fromPtr(Main.TIntermMethod_getAsMethodNode(ptr), TIntermMethod.class);
	}

	public String getMethodName() {
		return Main.TIntermMethod_getMethodName(ptr);
	}

	public TIntermTyped getObject() {
		return fromPtr(Main.TIntermMethod_getObject(ptr), TIntermTyped.class);
	}

	@Override
	public void traverse(TIntermTraverser traverser) {
		Main.TIntermMethod_traverse(ptr, traverser.getPtr());
	}

}
