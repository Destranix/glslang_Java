package Java;

public class TIntermLoop extends TIntermNode {

	private final TIntermNode aBody;
	private final TIntermTyped aTest;
	private final TIntermTyped aTerminal;
	private final boolean testFirst;
	private final int constructorIndex;

	public TIntermLoop(TIntermNode aBody, TIntermTyped aTest, TIntermTyped aTerminal, boolean testFirst) {
		super(PoisonClass.singleton);
		this.aBody = aBody;
		this.aTest = aTest;
		this.aTerminal = aTerminal;
		this.testFirst = testFirst;
		this.constructorIndex = 0;
		load();
	}

	protected TIntermLoop(byte[] ptr) {
		super(ptr);
		this.aBody = null;
		this.aTest = null;
		this.aTerminal = null;
		this.testFirst = false;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TIntermLoop(aBody.getPtr(), aTest.getPtr(), aTerminal.getPtr(), testFirst);
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
	public TIntermLoop getAsLoopNode() {
		return fromPtr(Main.TIntermLoop_getAsLoopNode(ptr), TIntermLoop.class);
	}

	@Override
	public void traverse(TIntermTraverser traverser) {
		Main.TIntermLoop_traverse(ptr, traverser.getPtr());
	}

	public TIntermNode getBody() {
		return fromPtr(Main.TIntermLoop_getBody(ptr), TIntermNode.class);
	}

	public TIntermTyped getTest() {
		return fromPtr(Main.TIntermLoop_getTest(ptr), TIntermTyped.class);
	}

	public TIntermTyped getTerminal() {
		return fromPtr(Main.TIntermLoop_getTerminal(ptr), TIntermTyped.class);
	}

	public boolean testFirst() {
		return Main.TIntermLoop_testFirst(ptr);
	}

	public void setUnroll() {
		Main.TIntermLoop_setUnroll(ptr);
	}

	public void setDontUnroll() {
		Main.TIntermLoop_setDontUnroll(ptr);
	}

	public boolean getUnroll() {
		return Main.TIntermLoop_getUnroll(ptr);
	}

	public boolean getDontUnroll() {
		return Main.TIntermLoop_getDontUnroll(ptr);
	}

	public void setLoopDependency(int d) {
		Main.TIntermLoop_setLoopDependency(ptr, d);
	}

	public int getLoopDependency() {
		return Main.TIntermLoop_getLoopDependency(ptr);
	}

	public void setMinIterations(long v) {
		Main.TIntermLoop_setMinIterations(ptr, v);
	}

	public long getMinIterations() {
		return Main.TIntermLoop_getMinIterations(ptr);
	}

	public void setMaxIterations(long v) {
		Main.TIntermLoop_setMaxIterations(ptr, v);
	}

	public long getMaxIterations() {
		return Main.TIntermLoop_getMaxIterations(ptr);
	}

	public void setIterationMultiple(long v) {
		Main.TIntermLoop_setIterationMultiple(ptr, v);
	}

	public long getIterationMultiple() {
		return Main.TIntermLoop_getIterationMultiple(ptr);
	}

	public void setPeelCount(long v) {
		Main.TIntermLoop_setPeelCount(ptr, v);
	}

	public long getPeelCount() {
		return Main.TIntermLoop_getPeelCount(ptr);
	}

	public void setPartialCount(long v) {
		Main.TIntermLoop_setPartialCount(ptr, v);
	}

	public long getPartialCount() {
		return Main.TIntermLoop_getPartialCount(ptr);
	}

}
