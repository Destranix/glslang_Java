package Java;

public class TSwizzleSelectors<selectorType extends PointerBoundObject> extends PointerBoundObject {

	private final int constructorIndex;

	public TSwizzleSelectors() {
		this.constructorIndex = 0;
		load();
	}

	protected TSwizzleSelectors(byte[] ptr) {
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
					ptr = Main.TSwizzleSelectors();
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

	public void push_back(selectorType comp) {
		Main.TSwizzleSelectors_push_back(ptr, comp.getPtr());
	}

	public void resize(int s) {
		Main.TSwizzleSelectors_resize(ptr, s);
	}

	public int size() {
		return Main.TSwizzleSelectors_size(ptr);
	}

	public PointerBoundObject operatorAt(int i) {
		return fromPtrUndefined(Main.TSwizzleSelectors_operatorAt(ptr, i));
	}

}
