package com.destranix.glslang;

public class TPublicType extends PointerBoundObject {

	private final int constructorIndex;

	public TPublicType() {
		this.constructorIndex = 0;
		load();
	}

	protected TPublicType(byte[] ptr) {
		this.ptr = ptr;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TPublicType();
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

	public boolean isCoopmat() {
		return Main.TPublicType_isCoopmat(ptr);
	}

	public void initType(TSourceLoc l) {
		Main.TPublicType_initType(ptr, l.getPtr());
	}

	public void initQualifiers() {
		Main.TPublicType_initQualifiers(ptr);
	}

	public void initQualifiers(boolean global) {
		Main.TPublicType_initQualifiers(ptr, global);
	}

	public void init(TSourceLoc l) {
		Main.TPublicType_init(ptr, l.getPtr());
	}

	public void init(TSourceLoc l, boolean global) {
		Main.TPublicType_init(ptr, l.getPtr(), global);
	}

	public void setVector(int s) {
		Main.TPublicType_setVector(ptr, s);
	}

	public void setMatrix(int c, int r) {
		Main.TPublicType_setMatrix(ptr, c, r);
	}

	public boolean isScalar() {
		return Main.TPublicType_isScalar(ptr);
	}

	public boolean isImage() {
		return Main.TPublicType_isImage(ptr);
	}

	public boolean isSubpass() {
		return Main.TPublicType_isSubpass(ptr);
	}

	public void setBasicType(TBasicType v) {
		Main.TPublicType_setBasicType(ptr, v.getConstant());
	}

	public void setSampler(TSampler v) {
		Main.TPublicType_setSampler(ptr, v.getPtr());
	}

	public void setQualifier(TQualifier v) {
		Main.TPublicType_setQualifier(ptr, v.getPtr());
	}

	public void setShaderQualifiers(TShaderQualifiers v) {
		Main.TPublicType_setShaderQualifiers(ptr, v.getPtr());
	}

	public void setVectorSize(int v) {
		Main.TPublicType_setVectorSize(ptr, v);
	}

	public void setMatrixCols(int v) {
		Main.TPublicType_setMatrixCols(ptr, v);
	}

	public void setMatrixRows(int v) {
		Main.TPublicType_setMatrixRows(ptr, v);
	}

	public void setCoopmat(boolean v) {
		Main.TPublicType_setCoopmat(ptr, v);
	}

	public void setArraySizes(TArraySizes v) {
		Main.TPublicType_setArraySizes(ptr, v.getPtr());
	}

	public void setUserDef(TType v) {
		Main.TPublicType_setUserDef(ptr, v.getPtr());
	}

	public void setLoc(TSourceLoc v) {
		Main.TPublicType_setLoc(ptr, v.getPtr());
	}

	public void setTypeParameters(TArraySizes v) {
		Main.TPublicType_setTypeParameters(ptr, v.getPtr());
	}

	public TBasicType getBasicType() {
		return TBasicType.valueByConstant(Main.TPublicType_getBasicType(ptr));
	}

	public TSampler getSampler() {
		return fromPtr(Main.TPublicType_getSampler(ptr), TSampler.class);
	}

	public TQualifier getQualifier() {
		return fromPtr(Main.TPublicType_getQualifier(ptr), TQualifier.class);
	}

	public TShaderQualifiers getShaderQualifiers() {
		return fromPtr(Main.TPublicType_getShaderQualifiers(ptr), TShaderQualifiers.class);
	}

	public int getVectorSize() {
		return Main.TPublicType_getVectorSize(ptr);
	}

	public int getMatrixCols() {
		return Main.TPublicType_getMatrixCols(ptr);
	}

	public int getMatrixRows() {
		return Main.TPublicType_getMatrixRows(ptr);
	}

	public boolean getCoopmat() {
		return Main.TPublicType_getCoopmat(ptr);
	}

	public TArraySizes getArraySizes() {
		return fromPtr(Main.TPublicType_getArraySizes(ptr), TArraySizes.class);
	}

	public TType getUserDef() {
		return fromPtr(Main.TPublicType_getUserDef(ptr), TType.class);
	}

	public TSourceLoc getLoc() {
		return fromPtr(Main.TPublicType_getLoc(ptr), TSourceLoc.class);
	}

	public TArraySizes getTypeParameters() {
		return fromPtr(Main.TPublicType_getTypeParameters(ptr), TArraySizes.class);
	}

}
