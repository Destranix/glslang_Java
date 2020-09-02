package Java;

public class TIntermBinary extends TIntermOperator {

	private final TOperator o;
	private final int constructorIndex;

	public TIntermBinary(TOperator o) {
		super(PoisonClass.singleton);
		this.o = o;
		this.constructorIndex = 0;
		load();
	}

	protected TIntermBinary(byte[] ptr) {
		super(ptr);
		this.o = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TIntermBinary(o);
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
		Main.TIntermBinary_traverse(ptr, traverser.getPtr());
	}

	public void setLeft(TIntermTyped n) {
		Main.TIntermBinary_setLeft(ptr, n.getPtr());
	}

	public void setRight(TIntermTyped n) {
		Main.TIntermBinary_setRight(ptr, n.getPtr());
	}

	public TIntermTyped getLeft() {
		return fromPtr(Main.TIntermBinary_getLeft(ptr), TIntermTyped.class);
	}

	public TIntermTyped getRight() {
		return fromPtr(Main.TIntermBinary_getRight(ptr), TIntermTyped.class);
	}

	@Override
	public TIntermBinary getAsBinaryNode() {
		return fromPtr(Main.TIntermBinary_getAsBinaryNode(ptr), TIntermBinary.class);
	}

	public void updatePrecision() {
		Main.TIntermBinary_updatePrecision(ptr);
	}

}
