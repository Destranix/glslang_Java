package Java;

public class EnumParameters extends PointerBoundObject {

	private final int constructorIndex;

	public EnumParameters() {
		this.constructorIndex = 0;
		load();
	}

	protected EnumParameters(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected EnumParameters(byte[] ptr) {
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
					ptr = Main.EnumParameters();
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

	public void setDesc(String v) {
		Main.EnumParameters_setDesc(ptr, v);
	}

	public String getDesc() {
		return Main.EnumParameters_getDesc(ptr);
	}

}