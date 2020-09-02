package Java;

public class TNumericFeatures extends PointerBoundObject {

	private final TNumericFeatures rhs;
	private final int constructorIndex;

	public TNumericFeatures() {
		this.rhs = null;
		this.constructorIndex = 0;
		load();
	}

	public TNumericFeatures(TNumericFeatures rhs) {
		this.rhs = rhs;
		this.constructorIndex = 1;
		load();
	}

	protected TNumericFeatures(byte[] ptr) {
		this.rhs = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TNumericFeatures();
					break;
				case 1:
					ptr = Main.TNumericFeatures(rhs.getPtr());
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

	public TNumericFeatures operatorAssign(TNumericFeatures rhs) {
		return fromPtr(Main.TNumericFeatures_operatorAssign(ptr, rhs.getPtr()), TNumericFeatures.class);
	}

	public void insert(TNumericFeatures_feature f) {
		Main.TNumericFeatures_insert(ptr, f);
	}

	public void erase(TNumericFeatures_feature f) {
		Main.TNumericFeatures_erase(ptr, f);
	}

	public boolean contains(TNumericFeatures_feature f) {
		return Main.TNumericFeatures_contains(ptr, f);
	}

}
