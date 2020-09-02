package Java;

public class TIntermSymbol extends TIntermTyped {

	private final int i;
	private final String n;
	private final TType t;
	private final int constructorIndex;

	public TIntermSymbol(int i, String n, TType t) {
		super(PoisonClass.singleton);
		this.i = i;
		this.n = n;
		this.t = t;
		this.constructorIndex = 0;
		load();
	}

	protected TIntermSymbol(byte[] ptr) {
		super(ptr);
		this.i = -1;
		this.n = null;
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
					ptr = Main.TIntermSymbol(i, n, t.getPtr());
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

	public int getId() {
		return Main.TIntermSymbol_getId(ptr);
	}

	public void changeId(int i) {
		Main.TIntermSymbol_changeId(ptr, i);
	}

	public String getName() {
		return Main.TIntermSymbol_getName(ptr);
	}

	@Override
	public void traverse(TIntermTraverser traverser) {
		Main.TIntermSymbol_traverse(ptr, traverser.getPtr());
	}

	@Override
	public TIntermSymbol getAsSymbolNode() {
		return fromPtr(Main.TIntermSymbol_getAsSymbolNode(ptr), TIntermSymbol.class);
	}

	public void setConstArray(TConstUnionArray c) {
		Main.TIntermSymbol_setConstArray(ptr, c.getPtr());
	}

	public TConstUnionArray getConstArray() {
		return fromPtr(Main.TIntermSymbol_getConstArray(ptr), TConstUnionArray.class);
	}

	public void setConstSubtree(TIntermTyped subtree) {
		Main.TIntermSymbol_setConstSubtree(ptr, subtree.getPtr());
	}

	public TIntermTyped getConstSubtree() {
		return fromPtr(Main.TIntermSymbol_getConstSubtree(ptr), TIntermTyped.class);
	}

	public void setFlattenSubset(int subset) {
		Main.TIntermSymbol_setFlattenSubset(ptr, subset);
	}

	public int getFlattenSubset() {
		return Main.TIntermSymbol_getFlattenSubset(ptr);
	}

	public void switchId(int newId) {
		Main.TIntermSymbol_switchId(ptr, newId);
	}

}
