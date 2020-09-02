package Java;

public abstract class TIntermNode extends PointerBoundObject {

	private final int constructorIndex;

	protected TIntermNode(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected TIntermNode(byte[] ptr) {
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

	public TSourceLoc getLoc() {
		return fromPtr(Main.TIntermNode_getLoc(ptr), TSourceLoc.class);
	}

	public void setLoc(TSourceLoc l) {
		Main.TIntermNode_setLoc(ptr, l.getPtr());
	}

	public void traverse(TIntermTraverser traverser) {
		Main.TIntermNode_traverse(ptr, traverser.getPtr());
	}

	public TIntermTyped getAsTyped() {
		return fromPtr(Main.TIntermNode_getAsTyped(ptr), TIntermTyped.class);
	}

	public TIntermOperator getAsOperator() {
		return fromPtr(Main.TIntermNode_getAsOperator(ptr), TIntermOperator.class);
	}

	public TIntermConstantUnion getAsConstantUnion() {
		return fromPtr(Main.TIntermNode_getAsConstantUnion(ptr), TIntermConstantUnion.class);
	}

	public TIntermAggregate getAsAggregate() {
		return fromPtr(Main.TIntermNode_getAsAggregate(ptr), TIntermAggregate.class);
	}

	public TIntermUnary getAsUnaryNode() {
		return fromPtr(Main.TIntermNode_getAsUnaryNode(ptr), TIntermUnary.class);
	}

	public TIntermBinary getAsBinaryNode() {
		return fromPtr(Main.TIntermNode_getAsBinaryNode(ptr), TIntermBinary.class);
	}

	public TIntermSelection getAsSelectionNode() {
		return fromPtr(Main.TIntermNode_getAsSelectionNode(ptr), TIntermSelection.class);
	}

	public TIntermSwitch getAsSwitchNode() {
		return fromPtr(Main.TIntermNode_getAsSwitchNode(ptr), TIntermSwitch.class);
	}

	public TIntermMethod getAsMethodNode() {
		return fromPtr(Main.TIntermNode_getAsMethodNode(ptr), TIntermMethod.class);
	}

	public TIntermSymbol getAsSymbolNode() {
		return fromPtr(Main.TIntermNode_getAsSymbolNode(ptr), TIntermSymbol.class);
	}

	public TIntermBranch getAsBranchNode() {
		return fromPtr(Main.TIntermNode_getAsBranchNode(ptr), TIntermBranch.class);
	}

	public TIntermLoop getAsLoopNode() {
		return fromPtr(Main.TIntermNode_getAsLoopNode(ptr), TIntermLoop.class);
	}

}
