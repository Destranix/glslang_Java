package Java;

public class TRange extends PointerBoundObject {

	private final int start;
	private final int last;
	private final int constructorIndex;

	public TRange(int start, int last) {
		this.start = start;
		this.last = last;
		this.constructorIndex = 0;
		load();
	}

	protected TRange(byte[] ptr) {
		this.ptr = ptr;
		this.start = -1;
		this.last = -1;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TRange(start, last);
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

	public boolean overlap(TRange rhs) {
		return Main.TRange_overlap(ptr, rhs.getPtr());
	}

	public void setStart(int v) {
		Main.TRange_setStart(ptr, v);
	}

	public void setLast(int v) {
		Main.TRange_setLast(ptr, v);
	}

	public int getStart() {
		return Main.TRange_getStart(ptr);
	}

	public int getLast() {
		return Main.TRange_getLast(ptr);
	}

}
