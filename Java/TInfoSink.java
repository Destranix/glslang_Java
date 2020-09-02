package Java;

public class TInfoSink extends PointerBoundObject {

	private final int constructorIndex;

	public TInfoSink() {
		this.constructorIndex = 0;
		load();
	}

	protected TInfoSink(byte[] ptr) {
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
					ptr = Main.TInfoSink();
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

	public void setInfo(TInfoSinkBase info) {
		Main.TInfoSink_setInfo(ptr, info.getPtr());
	}

	public void setDebug(TInfoSinkBase debug) {
		Main.TInfoSink_setDebug(ptr, debug.getPtr());
	}

	public TInfoSinkBase getInfo() {
		return fromPtr(Main.TInfoSink_getInfo(ptr), TInfoSinkBase.class);
	}

	public TInfoSinkBase getDebug() {
		return fromPtr(Main.TInfoSink_getDebug(ptr), TInfoSinkBase.class);
	}

}
