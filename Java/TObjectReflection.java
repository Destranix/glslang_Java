package Java;

import java.util.EnumSet;

public class TObjectReflection extends PointerBoundObject {

	private final String pName;
	private final TType pType;
	private final int pOffset;
	private final int pGLDefineType;
	private final int pSize;
	private final int pIndex;
	private final int constructorIndex;

	public TObjectReflection(String pName, TType pType, int pOffset, int pGLDefineType, int pSize, int pIndex) {
		this.pName = pName;
		this.pType = pType;
		this.pOffset = pOffset;
		this.pGLDefineType = pGLDefineType;
		this.pSize = pSize;
		this.pIndex = pIndex;
		this.constructorIndex = 0;
		load();
	}

	protected TObjectReflection(byte[] ptr) {
		this.ptr = ptr;
		this.pName = null;
		this.pType = null;
		this.pOffset = -1;
		this.pGLDefineType = -1;
		this.pSize = -1;
		this.pIndex = -1;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TObjectReflection(pName, pType.getPtr(), pOffset, pGLDefineType, pSize, pIndex);
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

	public TType getType() {
		return fromPtr(Main.TObjectReflection_getType(ptr), TType.class);
	}

	public int getBinding() {
		return Main.TObjectReflection_getBinding(ptr);
	}

	public void dump() {
		Main.TObjectReflection_dump(ptr);
	}

	public void setName(String v) {
		Main.TObjectReflection_setName(ptr, v);
	}

	public void setOffset(int v) {
		Main.TObjectReflection_setOffset(ptr, v);
	}

	public void setGlDefineType(int v) {
		Main.TObjectReflection_setGlDefineType(ptr, v);
	}

	public void setSize(int v) {
		Main.TObjectReflection_setSize(ptr, v);
	}

	public void setIndex(int v) {
		Main.TObjectReflection_setIndex(ptr, v);
	}

	public void setCounterIndex(int v) {
		Main.TObjectReflection_setCounterIndex(ptr, v);
	}

	public void setNumMembers(int v) {
		Main.TObjectReflection_setNumMembers(ptr, v);
	}

	public void setArrayStride(int v) {
		Main.TObjectReflection_setArrayStride(ptr, v);
	}

	public void setTopLevelArraySize(int v) {
		Main.TObjectReflection_setTopLevelArraySize(ptr, v);
	}

	public void setTopLevelArrayStride(int v) {
		Main.TObjectReflection_setTopLevelArrayStride(ptr, v);
	}

	public void setStages(EnumSet<EShLanguageMask> v) {
		Main.TObjectReflection_setStages(ptr, EShLanguageMask.setToInt(v));
	}

	public String getName() {
		return Main.TObjectReflection_getName(ptr);
	}

	public int getOffset() {
		return Main.TObjectReflection_getOffset(ptr);
	}

	public int getGlDefineType() {
		return Main.TObjectReflection_getGlDefineType(ptr);
	}

	public int getSize() {
		return Main.TObjectReflection_getSize(ptr);
	}

	public int getIndex() {
		return Main.TObjectReflection_getIndex(ptr);
	}

	public int getCounterIndex() {
		return Main.TObjectReflection_getCounterIndex(ptr);
	}

	public int getNumMembers() {
		return Main.TObjectReflection_getNumMembers(ptr);
	}

	public int getArrayStride() {
		return Main.TObjectReflection_getArrayStride(ptr);
	}

	public int getTopLevelArraySize() {
		return Main.TObjectReflection_getTopLevelArraySize(ptr);
	}

	public int getTopLevelArrayStride() {
		return Main.TObjectReflection_getTopLevelArrayStride(ptr);
	}

	public int getStages() {
		return Main.TObjectReflection_getStages(ptr);
	}

	public static TObjectReflection badReflection() {
		return fromPtr(Main.TObjectReflection_badReflection(), TObjectReflection.class);
	}

}
