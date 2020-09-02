package Java;

public class TIntermUnary extends TIntermOperator {

	private final TOperator o;
	private final TType t;
	private final int constructorIndex;

	public TIntermUnary(TOperator o) {
		super(PoisonClass.singleton);
		this.o = o;
		this.t = null;
		this.constructorIndex = 0;
		load();
	}

	public TIntermUnary(TOperator o, TType t) {
		super(PoisonClass.singleton);
		this.o = o;
		this.t = t;
		this.constructorIndex = 1;
		load();
	}

	protected TIntermUnary(byte[] ptr) {
		super(ptr);
		this.o = null;
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
					ptr = Main.TIntermUnary(o);
					break;
				case 1:
					ptr = Main.TIntermUnary(o, t.getPtr());
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

	@Override
	public void traverse(TIntermTraverser traverser) {
		Main.TIntermUnary_traverse(ptr, traverser.getPtr());
	}

	public void setOperand(TIntermTyped o) {
		Main.TIntermUnary_setOperand(ptr, o.getPtr());
	}

	public TIntermTyped getOperand() {
		return fromPtr(Main.TIntermUnary_getOperand(ptr), TIntermTyped.class);
	}

	@Override
	public TIntermUnary getAsUnaryNode() {
		return fromPtr(Main.TIntermUnary_getAsUnaryNode(ptr), TIntermUnary.class);
	}

	public void updatePrecision() {
		Main.TIntermUnary_updatePrecision(ptr);
	}

}
