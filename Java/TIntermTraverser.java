package Java;

public class TIntermTraverser extends PointerBoundObject {

	private final boolean preVisit;
	private final boolean inVisit;
	private final boolean postVisit;
	private final boolean rightToLeft;
	private final int constructorIndex;

	public TIntermTraverser() {
		this.preVisit = true;
		this.inVisit = false;
		this.postVisit = false;
		this.rightToLeft = false;
		this.constructorIndex = 0;
		load();
	}

	public TIntermTraverser(boolean preVisit) {
		this.preVisit = preVisit;
		this.inVisit = false;
		this.postVisit = false;
		this.rightToLeft = false;
		this.constructorIndex = 0;
		load();
	}

	public TIntermTraverser(boolean preVisit, boolean inVisit) {
		this.preVisit = preVisit;
		this.inVisit = inVisit;
		this.postVisit = false;
		this.rightToLeft = false;
		this.constructorIndex = 0;
		load();
	}

	public TIntermTraverser(boolean preVisit, boolean inVisit, boolean postVisit) {
		this.preVisit = preVisit;
		this.inVisit = inVisit;
		this.postVisit = postVisit;
		this.rightToLeft = false;
		this.constructorIndex = 0;
		load();
	}

	public TIntermTraverser(boolean preVisit, boolean inVisit, boolean postVisit, boolean rightToLeft) {
		this.preVisit = preVisit;
		this.inVisit = inVisit;
		this.postVisit = postVisit;
		this.rightToLeft = rightToLeft;
		this.constructorIndex = 0;
		load();
	}

	protected TIntermTraverser(PoisonClass p) {
		this.preVisit = false;
		this.inVisit = false;
		this.postVisit = false;
		this.rightToLeft = false;
		this.constructorIndex = -1;
	}

	protected TIntermTraverser(byte[] ptr) {
		this.ptr = ptr;
		this.preVisit = false;
		this.inVisit = false;
		this.postVisit = false;
		this.rightToLeft = false;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TIntermTraverser(preVisit, inVisit, postVisit, rightToLeft);
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
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public void visitSymbol(TIntermSymbol symbol) {
		Main.TIntermTraverser_visitSymbol(ptr, symbol.getPtr());
	}

	public void visitConstantUnion(TIntermConstantUnion node) {
		Main.TIntermTraverser_visitConstantUnion(ptr, node.getPtr());
	}

	public boolean visitBinary(TVisit visit, TIntermBinary node) {
		return Main.TIntermTraverser_visitBinary(ptr, visit, node.getPtr());
	}

	public boolean visitUnary(TVisit visit, TIntermUnary node) {
		return Main.TIntermTraverser_visitUnary(ptr, visit, node.getPtr());
	}

	public boolean visitSelection(TVisit visit, TIntermSelection node) {
		return Main.TIntermTraverser_visitSelection(ptr, visit, node.getPtr());
	}

	public boolean visitAggregate(TVisit visit, TIntermAggregate node) {
		return Main.TIntermTraverser_visitAggregate(ptr, visit, node.getPtr());
	}

	public boolean visitLoop(TVisit visit, TIntermLoop node) {
		return Main.TIntermTraverser_visitLoop(ptr, visit, node.getPtr());
	}

	public boolean visitBranch(TVisit visit, TIntermBranch node) {
		return Main.TIntermTraverser_visitBranch(ptr, visit, node.getPtr());
	}

	public boolean visitSwitch(TVisit visit, TIntermSwitch node) {
		return Main.TIntermTraverser_visitSwitch(ptr, visit, node.getPtr());
	}

	public int getMaxDepth() {
		return Main.TIntermTraverser_getMaxDepth(ptr);
	}

	public void incrementDepth(TIntermNode current) {
		Main.TIntermTraverser_incrementDepth(ptr, current.getPtr());
	}

	public void decrementDepth() {
		Main.TIntermTraverser_decrementDepth(ptr);
	}

	public TIntermNode getParentNode() {
		return fromPtr(Main.TIntermTraverser_getParentNode(ptr), TIntermNode.class);
	}

	public boolean getPreVisit() {
		return Main.TIntermTraverser_getPreVisit(ptr);
	}

	public boolean getInVisit() {
		return Main.TIntermTraverser_getInVisit(ptr);
	}

	public boolean getPostVisit() {
		return Main.TIntermTraverser_getPostVisit(ptr);
	}

	public boolean getRightToLeft() {
		return Main.TIntermTraverser_getRightToLeft(ptr);
	}

}
