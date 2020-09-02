package Java;

public class TIoRange extends PointerBoundObject {

	private final TRange location;
	private final TRange component;
	private final TBasicType basicType;
	private final int index;
	private final int constructorIndex;

	public TIoRange(TRange location, TRange component, TBasicType basicType, int index) {
		this.location = location;
		this.component = component;
		this.basicType = basicType;
		this.index = index;
		this.constructorIndex = 0;
		load();
	}

	protected TIoRange(byte[] ptr) {
		this.ptr = ptr;
		this.location = null;
		this.component = null;
		this.basicType = null;
		this.index = -1;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TIoRange(location.getPtr(), component.getPtr(), basicType, index);
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

	public boolean TIoRange_overlap(TIoRange rhs) {
		return Main.TIoRange_overlap(ptr, rhs.getPtr());
	}

	public void setLocation(TRange v) {
		Main.TIoRange_setLocation(ptr, v.getPtr());
	}

	public void setComponent(TRange v) {
		Main.TIoRange_setComponent(ptr, v.getPtr());
	}

	public void setBasicType(TBasicType v) {
		Main.TIoRange_setBasicType(ptr, v.getConstant());
	}

	public void setindex(int v) {
		Main.TIoRange_setindex(ptr, v);
	}

	public TRange getLocation() {
		return fromPtr(Main.TIoRange_getLocation(ptr), TRange.class);
	}

	public TRange getComponent() {
		return fromPtr(Main.TIoRange_getComponent(ptr), TRange.class);
	}

	public TBasicType getBasicType() {
		return TBasicType.valueByConstant(Main.TIoRange_getBasicType(ptr));
	}

	public int getIndex() {
		return Main.TIoRange_getIndex(ptr);
	}

}
