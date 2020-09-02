package com.destranix.glslang;

public class TSampler extends PointerBoundObject {

	private final int constructorIndex;

	public TSampler() {
		this.constructorIndex = 0;
		load();
	}

	protected TSampler(byte[] ptr) {
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
					ptr = Main.TSampler();
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

	public boolean is1D() {
		return Main.TSampler_is1D(ptr);
	}

	public boolean isBuffer() {
		return Main.TSampler_isBuffer(ptr);
	}

	public boolean isRect() {
		return Main.TSampler_isRect(ptr);
	}

	public boolean isSubpass() {
		return Main.TSampler_isSubpass(ptr);
	}

	public boolean isCombined() {
		return Main.TSampler_isCombined(ptr);
	}

	public boolean isImage() {
		return Main.TSampler_isImage(ptr);
	}

	public boolean isImageClass() {
		return Main.TSampler_isImageClass(ptr);
	}

	public boolean isMultiSample() {
		return Main.TSampler_isMultiSample(ptr);
	}

	public boolean isExternal() {
		return Main.TSampler_isExternal(ptr);
	}

	public void setExternal(boolean e) {
		Main.TSampler_setExternal(ptr, e);
	}

	public boolean isYuv() {
		return Main.TSampler_isYuv(ptr);
	}

	public boolean isTexture() {
		return Main.TSampler_isTexture(ptr);
	}

	public boolean isPureSampler() {
		return Main.TSampler_isPureSampler(ptr);
	}

	public void setCombined(boolean c) {
		Main.TSampler_setCombined(ptr, c);
	}

	public void setBasicType(TBasicType t) {
		Main.TSampler_setBasicType(ptr, t);
	}

	public TBasicType getBasicType() {
		return TBasicType.valueByConstant(Main.TSampler_getBasicType(ptr));
	}

	public boolean isShadow() {
		return Main.TSampler_isShadow(ptr);
	}

	public boolean isArrayed() {
		return Main.TSampler_isArrayed(ptr);
	}

	public void clear() {
		Main.TSampler_clear(ptr);
	}

	public void set(TBasicType t, TSamplerDim d) {
		Main.TSampler_set(ptr, t, d);
	}

	public void set(TBasicType t, TSamplerDim d, boolean a) {
		Main.TSampler_set(ptr, t, d, a);
	}

	public void set(TBasicType t, TSamplerDim d, boolean a, boolean s) {
		Main.TSampler_set(ptr, t, d, a, s);
	}

	public void set(TBasicType t, TSamplerDim d, boolean a, boolean s, boolean m) {
		Main.TSampler_set(ptr, t.getConstant(), d.getConstant(), a, s, m);
	}

	public void setImage(TBasicType t, TSamplerDim d) {
		Main.TSampler_setImage(ptr, t, d);
	}

	public void setImage(TBasicType t, TSamplerDim d, boolean a) {
		Main.TSampler_setImage(ptr, t, d, a);
	}

	public void setImage(TBasicType t, TSamplerDim d, boolean a, boolean s) {
		Main.TSampler_setImage(ptr, t, d, a, s);
	}

	public void setImage(TBasicType t, TSamplerDim d, boolean a, boolean s, boolean m) {
		Main.TSampler_setImage(ptr, t, d, a, s, m);
	}

	public void setTexture(TBasicType t, TSamplerDim d) {
		Main.TSampler_setTexture(ptr, t, d);
	}

	public void setTexture(TBasicType t, TSamplerDim d, boolean a) {
		Main.TSampler_setTexture(ptr, t, d, a);
	}

	public void setTexture(TBasicType t, TSamplerDim d, boolean a, boolean s) {
		Main.TSampler_setTexture(ptr, t, d, a, s);
	}

	public void setTexture(TBasicType t, TSamplerDim d, boolean a, boolean s, boolean m) {
		Main.TSampler_setTexture(ptr, t, d, a, s, m);
	}

	public void setPureSampler(boolean s) {
		Main.TSampler_setPureSampler(ptr, s);
	}

	public void setSubpass(TBasicType t) {
		Main.TSampler_setSubpass(ptr, t.getConstant());
	}

	public void setSubpass(TBasicType t, boolean m) {
		Main.TSampler_setSubpass(ptr, t, m);
	}

	public void setArrayed(boolean c) {
		Main.TSampler_setArrayed(ptr, c);
	}

	public void setShadow(boolean c) {
		Main.TSampler_setShadow(ptr, c);
	}

	public void setMs(boolean c) {
		Main.TSampler_setMs(ptr, c);
	}

	public void setImage(boolean c) {
		Main.TSampler_setImage(ptr, c);
	}

	public void setSampler(boolean c) {
		Main.TSampler_setSampler(ptr, c);
	}

	public void setYuv(boolean c) {
		Main.TSampler_setYuv(ptr, c);
	}

	public void setDim(TSamplerDim c) {
		Main.TSampler_setDim(ptr, c.getConstant());
	}

	public void setVectorSize(long c) {
		Main.TSampler_setVectorSize(ptr, c);
	}

	public void setStructReturnIndex(long c) {
		Main.TSampler_setStructReturnIndex(ptr, c);
	}

	public TSamplerDim getDim() {
		return TSamplerDim.valueByConstant(Main.TSampler_getDim(ptr));
	}

	public long getStructReturnIndex() {
		return Main.TSampler_getStructReturnIndex(ptr);
	}

	public long getVectorSize() {
		return Main.TSampler_getVectorSize(ptr);
	}

	public static long getStructReturnIndexBits() {
		return Main.TSampler_getStructReturnIndexBits();
	}

	public static long getStructReturnSlots() {
		return Main.TSampler_getStructReturnSlots();
	}

	public static long getNoReturnStruct() {
		return Main.TSampler_getNoReturnStruct();
	}

	public boolean operatorEqual(TSampler right) {
		return Main.TSampler_operatorEqual(ptr, right.getPtr());
	}

	public boolean operatorNotEqual(TSampler right) {
		return Main.TSampler_operatorNotEqual(ptr, right.getPtr());
	}

}
