package Java;

public abstract class TIntermOperator extends TIntermTyped {

	private final int constructorIndex;

	protected TIntermOperator(PoisonClass p) {
		super(PoisonClass.singleton);
		this.constructorIndex = -1;
	}

	protected TIntermOperator(byte[] ptr) {
		super(ptr);
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

	@Override
	public TIntermOperator getAsOperator() {
		return fromPtr(Main.TIntermOperator_getAsOperator(ptr), TIntermOperator.class);
	}

	public TOperator getOp() {
		return TOperator.valueByConstant(Main.TIntermOperator_getOp(ptr));
	}

	public void setOp(TOperator newOp) {
		Main.TIntermOperator_setOp(ptr, newOp);
	}

	public boolean modifiesState() {
		return Main.TIntermOperator_modifiesState(ptr);
	}

	public boolean isConstructor() {
		return Main.TIntermOperator_isConstructor(ptr);
	}

	public boolean isTexture() {
		return Main.TIntermOperator_isTexture(ptr);
	}

	public boolean isSampling() {
		return Main.TIntermOperator_isSampling(ptr);
	}

	public boolean isImage() {
		return Main.TIntermOperator_isImage(ptr);
	}

	public boolean isSparseTexture() {
		return Main.TIntermOperator_isSparseTexture(ptr);
	}

	public boolean isImageFootprint() {
		return Main.TIntermOperator_isImageFootprint(ptr);
	}

	public boolean isSparseImage() {
		return Main.TIntermOperator_isSparseImage(ptr);
	}

	public boolean isSubgroup() {
		return Main.TIntermOperator_isSubgroup(ptr);
	}

	public void setOperationPrecision(TPrecisionQualifier p) {
		Main.TIntermOperator_setOperationPrecision(ptr, p);
	}

	public TPrecisionQualifier getOperationPrecision() {
		return TPrecisionQualifier.valueByConstant(Main.TIntermOperator_getOperationPrecision(ptr));
	}

	@Override
	public String getCompleteString() {
		return Main.TIntermOperator_getCompleteString(ptr);
	}

	public void crackTexture(TSampler sampler, TCrackedTextureOp cracked) {
		Main.TIntermOperator_crackTexture(ptr, sampler.getPtr(), cracked.getPtr());
	}

}
