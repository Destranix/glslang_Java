package Java;

public class TIntermAggregate extends TIntermOperator {

	private final TOperator o;
	private final int constructorIndex;

	public TIntermAggregate() {
		super(PoisonClass.singleton);
		this.o = null;
		this.constructorIndex = 0;
		load();
	}

	public TIntermAggregate(TOperator o) {
		super(PoisonClass.singleton);
		this.o = o;
		this.constructorIndex = 1;
		load();
	}

	protected TIntermAggregate(byte[] ptr) {
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
					ptr = Main.TIntermAggregate();
					break;
				case 1:
					ptr = Main.TIntermAggregate(o);
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
	public TIntermAggregate getAsAggregate() {
		return fromPtr(Main.TIntermAggregate_getAsAggregate(ptr), TIntermAggregate.class);
	}

	public void setOperator(TOperator o) {
		Main.TIntermAggregate_setOperator(ptr, o);
	}

	public TVector<TIntermNode> getSequence() {
		@SuppressWarnings("unchecked")
		TVector<TIntermNode> tmp = (TVector<TIntermNode>) fromPtr(Main.TIntermAggregate_getSequence(ptr),
				TVector.class);
		return tmp;
	}

	public void setName(String n) {
		Main.TIntermAggregate_setName(ptr, n);
	}

	public String getName() {
		return Main.TIntermAggregate_getName(ptr);
	}

	@Override
	public void traverse(TIntermTraverser traverser) {
		Main.TIntermAggregate_traverse(ptr, traverser.getPtr());
	}

	public void setUserDefined() {
		Main.TIntermAggregate_setUserDefined(ptr);
	}

	public boolean isUserDefined() {
		return Main.TIntermAggregate_isUserDefined(ptr);
	}

	public TStorageQualifier[] getQualifierList() {
		int[] val = Main.TIntermAggregate_getQualifierList(ptr);
		TStorageQualifier[] ret = new TStorageQualifier[val.length];
		for (int i = 0; i < val.length; ++i) {
			ret[i] = TStorageQualifier.valueByConstant(val[i]);
		}
		return ret;
	}

	public void setOptimize(boolean o) {
		Main.TIntermAggregate_setOptimize(ptr, o);
	}

	public void setDebug(boolean d) {
		Main.TIntermAggregate_setDebug(ptr, d);
	}

	public boolean getOptimize() {
		return Main.TIntermAggregate_getOptimize(ptr);
	}

	public boolean getDebug() {
		return Main.TIntermAggregate_getDebug(ptr);
	}

	public void setPragmaTable(TPragmaTable pTable) {
		Main.TIntermAggregate_setPragmaTable(ptr, pTable.getPtr());
	}

	public byte[] getPragmaTable() {
		return Main.TIntermAggregate_getPragmaTable(ptr);
	}

}
