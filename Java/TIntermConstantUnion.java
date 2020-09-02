package Java;

public class TIntermConstantUnion extends TIntermTyped {

	private final TConstUnionArray ua;
	private final TType t;
	private final int constructorIndex;

	public TIntermConstantUnion(TConstUnionArray ua, TType t) {
		super(PoisonClass.singleton);
		this.ua = ua;
		this.t = t;
		this.constructorIndex = 0;
		load();
	}

	protected TIntermConstantUnion(byte[] ptr) {
		super(ptr);
		this.ua = null;
		this.t = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TIntermConstantUnion(ua.getPtr(), t.getPtr());
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

	public TConstUnionArray getConstArray() {
		return fromPtr(Main.TIntermConstantUnion_getConstArray(ptr), TConstUnionArray.class);
	}

	@Override
	public TIntermConstantUnion getAsConstantUnion() {
		return fromPtr(Main.TIntermConstantUnion_getAsConstantUnion(ptr), TIntermConstantUnion.class);
	}

	@Override
	public void traverse(TIntermTraverser traverser) {
		Main.TIntermConstantUnion_traverse(ptr, traverser.getPtr());
	}

	public TIntermTyped foldTyped(TOperator op, TIntermTyped node) {
		return fromPtr(Main.TIntermConstantUnion_foldTyped(ptr, op, node.getPtr()), TIntermTyped.class);
	}

	public TIntermTyped fold(TOperator op, TType t) {
		return fromPtr(Main.TIntermConstantUnion_fold(ptr, op, t.getPtr()), TIntermTyped.class);
	}

	public void setLiteral() {
		Main.TIntermConstantUnion_setLiteral(ptr);
	}

	public void setExpression() {
		Main.TIntermConstantUnion_setExpression(ptr);
	}

	public boolean isLiteral() {
		return Main.TIntermConstantUnion_isLiteral(ptr);
	}

}
