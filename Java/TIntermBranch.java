package Java;

public class TIntermBranch extends TIntermNode {

	private final TOperator op;
	private final TIntermTyped e;
	private final int constructorIndex;

	public TIntermBranch(TOperator op, TIntermTyped e) {
		super(PoisonClass.singleton);
		this.op = op;
		this.e = e;
		this.constructorIndex = 0;
		load();
	}

	protected TIntermBranch(byte[] ptr) {
		super(ptr);
		this.op = null;
		this.e = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TIntermBranch(op, e.getPtr());
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
	public TIntermBranch getAsBranchNode() {
		return fromPtr(Main.TIntermBranch_getAsBranchNode(ptr), TIntermBranch.class);
	}

	@Override
	public void traverse(TIntermTraverser traverser) {
		Main.TIntermBranch_traverse(ptr, traverser.getPtr());
	}

	public TOperator getFlowOp() {
		return TOperator.valueByConstant(Main.TIntermBranch_getFlowOp(ptr));
	}

	public TIntermTyped getExpression() {
		return fromPtr(Main.TIntermBranch_getExpression(ptr), TIntermTyped.class);
	}

	public void setExpression(TIntermTyped pExpression) {
		Main.TIntermBranch_setExpression(ptr, pExpression.getPtr());
	}

	public void updatePrecision(TPrecisionQualifier parentPrecision) {
		Main.TIntermBranch_updatePrecision(ptr, parentPrecision);
	}

}
