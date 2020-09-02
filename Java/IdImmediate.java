package Java;

public class IdImmediate extends PointerBoundObject {

	protected final boolean i;
	protected final long w;
	private final int constructorIndex;

	public IdImmediate(boolean i, long w) {
		this.i = i;
		this.w = w;
		this.constructorIndex = 0;
		load();
	}

	protected IdImmediate(byte[] ptr) {
		this.ptr = ptr;
		this.i = false;
		this.w = -1;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.IdImmediate(i, w);
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

	public void setIsId(boolean v) {
		Main.IdImmediate_setIsId(ptr, v);
	}

	public void setWord(long v) {
		Main.IdImmediate_setWord(ptr, v);
	}

	public boolean getIsId() {
		return Main.IdImmediate_getIsId(ptr);
	}

	public long getWord() {
		return Main.IdImmediate_getWord(ptr);
	}

}