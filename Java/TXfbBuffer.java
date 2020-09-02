package Java;

public class TXfbBuffer extends PointerBoundObject {

	private final int constructorIndex;

	public TXfbBuffer() {
		this.constructorIndex = 0;
		load();
	}

	protected TXfbBuffer(byte[] ptr) {
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
					ptr = Main.TXfbBuffer();
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

	public void setRanges(CVector<TRange> v) {
		Main.TXfBuffer_setRanges(ptr, v.getPtr());
	}

	public void setStride(long v) {
		Main.TXfBuffer_setStride(ptr, v);
	}

	public void setImplicitStride(long v) {
		Main.TXfBuffer_setImplicitStride(ptr, v);
	}

	public void setContains64BitType(boolean v) {
		Main.TXfBuffer_setContains64BitType(ptr, v);
	}

	public void setContains32BitType(boolean v) {
		Main.TXfBuffer_setContains32BitType(ptr, v);
	}

	public void setContains16BitType(boolean v) {
		Main.TXfBuffer_setContains16BitType(ptr, v);
	}

	public CVector<TRange> getRanges() {
		@SuppressWarnings("unchecked") // Is checked
		CVector<TRange> tmp = (CVector<TRange>) fromPtr(Main.TXfBuffer_getRanges(ptr), CVector.class);
		return tmp;
	}

	public long getStride() {
		return Main.TXfBuffer_getStride(ptr);
	}

	public long getImplicitStride() {
		return Main.TXfBuffer_getImplicitStride(ptr);
	}

	public boolean getContains64BitType() {
		return Main.TXfBuffer_getContains64BitType(ptr);
	}

	public boolean getContains32BitType() {
		return Main.TXfBuffer_getContains32BitType(ptr);
	}

	public boolean getContains16BitType() {
		return Main.TXfBuffer_getContains16BitType(ptr);
	}

}
