package Java;

public class SpvBuildLogger extends PointerBoundObject {

	private final int constructorIndex;

	public SpvBuildLogger() {
		this.constructorIndex = 0;
		load();
	}

	protected SpvBuildLogger(byte[] ptr) {
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
					ptr = Main.SpvBuildLogger();
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

	public void tbdFunctionality(String f) {
		Main.SpvBuildLogger_tbdFunctionality(ptr, f);
	}

	public void missingFunctionality(String f) {
		Main.SpvBuildLogger_missingFunctionality(ptr, f);
	}

	public void warning(String w) {
		Main.SpvBuildLogger_warning(ptr, w);
	}

	public void error(String e) {
		Main.SpvBuildLogger_error(ptr, e);
	}

	public String getAllMessages() {
		return Main.SpvBuildLogger_getAllMessages(ptr);
	}

}
