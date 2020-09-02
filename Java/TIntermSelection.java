package Java;

public class TIntermSelection extends TIntermTyped {

	private final TIntermTyped cond;
	private final TIntermNode trueB;
	private final TIntermNode falseB;
	private final TType type;
	private final int constructorIndex;

	public TIntermSelection(TIntermTyped cond, TIntermNode trueB, TIntermNode falseB) {
		super(PoisonClass.singleton);
		this.cond = cond;
		this.trueB = trueB;
		this.falseB = falseB;
		this.type = null;
		this.constructorIndex = 0;
		load();
	}

	public TIntermSelection(TIntermTyped cond, TIntermNode trueB, TIntermNode falseB, TType type) {
		super(PoisonClass.singleton);
		this.cond = cond;
		this.trueB = trueB;
		this.falseB = falseB;
		this.type = type;
		this.constructorIndex = 1;
		load();
	}

	protected TIntermSelection(byte[] ptr) {
		super(ptr);
		this.cond = null;
		this.trueB = null;
		this.falseB = null;
		this.type = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TIntermSelection(cond.getPtr(), trueB.getPtr(), falseB.getPtr());
					break;
				case 1:
					ptr = Main.TIntermSelection(cond.getPtr(), trueB.getPtr(), falseB.getPtr(), type.getPtr());
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
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
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
		Main.TIntermSelection_traverse(ptr, traverser.getPtr());
	}

	public TIntermTyped getCondition() {
		return fromPtr(Main.TIntermSelection_getCondition(ptr), TIntermTyped.class);
	}

	public TIntermNode getTrueBlock() {
		return fromPtr(Main.TIntermSelection_getTrueBlock(ptr), TIntermNode.class);
	}

	public TIntermNode getFalseBlock() {
		return fromPtr(Main.TIntermSelection_getFalseBlock(ptr), TIntermNode.class);
	}

	@Override
	public TIntermSelection getAsSelectionNode() {
		return fromPtr(Main.TIntermSelection_getAsSelectionNode(ptr), TIntermSelection.class);
	}

	public void setNoShortCircuit() {
		Main.TIntermSelection_setNoShortCircuit(ptr);
	}

	public boolean getShortCircuit() {
		return Main.TIntermSelection_getShortCircuit(ptr);
	}

	public void setFlatten() {
		Main.TIntermSelection_setFlatten(ptr);
	}

	public void setDontFlatten() {
		Main.TIntermSelection_setDontFlatten(ptr);
	}

	public boolean getFlatten() {
		return Main.TIntermSelection_getFlatten(ptr);
	}

	public boolean getDontFlatten() {
		return Main.TIntermSelection_getDontFlatten(ptr);
	}

}
