package Java;

public class TTypeLoc extends PointerBoundObject {

	private final TType type;
	private final TSourceLoc loc;
	private final int constructorIndex;

	public TTypeLoc() {
		this.type = null;
		this.loc = null;
		this.constructorIndex = 0;
		load();
	}

	public TTypeLoc(TType type, TSourceLoc loc) {
		this.type = type;
		this.loc = loc;
		this.constructorIndex = 1;
		load();
	}

	protected TTypeLoc(byte[] ptr) {
		this.ptr = ptr;
		this.type = null;
		this.loc = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TTypeLoc();
					break;
				case 1:
					ptr = Main.TTypeLoc(type.getPtr(), loc.getPtr());
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

	public void setType(TType type) {
		Main.TTypeLoc_setType(ptr, type.getPtr());
	}

	public void setLoc(TSourceLoc loc) {
		Main.TTypeLoc_setLoc(ptr, loc.getPtr());
	}

	public TType getType() {
		return fromPtr(Main.TTypeLoc_getType(ptr), TType.class);
	}

	public TSourceLoc getLoc() {
		return fromPtr(Main.TTypeLoc_getLoc(ptr), TSourceLoc.class);
	}

}
