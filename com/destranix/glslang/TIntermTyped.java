package com.destranix.glslang;

public abstract class TIntermTyped extends TIntermNode {

	private final int constructorIndex;

	protected TIntermTyped(PoisonClass p) {
		super(PoisonClass.singleton);
		this.constructorIndex = -1;
	}

	protected TIntermTyped(byte[] ptr) {
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
	public TIntermTyped getAsTyped() {
		return fromPtr(Main.TIntermTyped_getAsTyped(ptr), TIntermTyped.class);
	}

	public void setType(TType t) {
		Main.TIntermTyped_setType(ptr, t.getPtr());
	}

	public TType getType() {
		return fromPtr(Main.TIntermTyped_getType(ptr), TType.class);
	}

	public TType getWritableType() {
		return fromPtr(Main.TIntermTyped_getWritableType(ptr), TType.class);
	}

	public TBasicType getBasicType() {
		return TBasicType.valueByConstant(Main.TIntermTyped_getBasicType(ptr));
	}

	public TQualifier getQualifier() {
		return fromPtr(Main.TIntermTyped_getQualifier(ptr), TQualifier.class);
	}

	public void propagatePrecision(TPrecisionQualifier qualifier) {
		Main.TIntermTyped_propagatePrecision(ptr, qualifier);
	}

	public int getVectorSize() {
		return Main.TIntermTyped_getVectorSize(ptr);
	}

	public int getMatrixCols() {
		return Main.TIntermTyped_getMatrixCols(ptr);
	}

	public int getMatrixRows() {
		return Main.TIntermTyped_getMatrixRows(ptr);
	}

	public boolean isMatrix() {
		return Main.TIntermTyped_isMatrix(ptr);
	}

	public boolean isArray() {
		return Main.TIntermTyped_isArray(ptr);
	}

	public boolean isVector() {
		return Main.TIntermTyped_isVector(ptr);
	}

	public boolean isScalar() {
		return Main.TIntermTyped_isScalar(ptr);
	}

	public boolean isStruct() {
		return Main.TIntermTyped_isStruct(ptr);
	}

	public boolean isFloatingDomain() {
		return Main.TIntermTyped_isFloatingDomain(ptr);
	}

	public boolean isIntegerDomain() {
		return Main.TIntermTyped_isIntegerDomain(ptr);
	}

	public boolean isAtomic() {
		return Main.TIntermTyped_isAtomic(ptr);
	}

	public boolean isReference() {
		return Main.TIntermTyped_isReference(ptr);
	}

	public String getCompleteString() {
		return Main.TIntermTyped_getCompleteString(ptr);
	}

}
