package Java;

public class TIntermSwitch extends TIntermNode {

	private final TIntermTyped cond;
	private final TIntermAggregate b;
	private final int constructorIndex;

	public TIntermSwitch(TIntermTyped cond, TIntermAggregate b) {
		super(PoisonClass.singleton);
		this.cond = cond;
		this.b = b;
		this.constructorIndex = 0;
		load();
	}

	protected TIntermSwitch(byte[] ptr) {
		super(ptr);
		this.cond = null;
		this.b = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TIntermSwitch(cond.getPtr(), b.getPtr());
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
	public void traverse(TIntermTraverser traverser) {
		Main.TIntermSwitch_traverse(ptr, traverser.getPtr());
	}

	public TIntermNode getCondition() {
		return fromPtr(Main.TIntermSwitch_getCondition(ptr), TIntermNode.class);
	}

	public TIntermAggregate getBody() {
		return fromPtr(Main.TIntermSwitch_getBody(ptr), TIntermAggregate.class);
	}

	@Override
	public TIntermSwitch getAsSwitchNode() {
		return fromPtr(Main.TIntermSwitch_getAsSwitchNode(ptr), TIntermSwitch.class);
	}

	public void setFlatten() {
		Main.TIntermSwitch_setFlatten(ptr);
	}

	public void setDontFlatten() {
		Main.TIntermSwitch_setDontFlatten(ptr);
	}

	public boolean getFlatten() {
		return Main.TIntermSwitch_getFlatten(ptr);
	}

	public boolean getDontFlatten() {
		return Main.TIntermSwitch_getDontFlatten(ptr);
	}

}
