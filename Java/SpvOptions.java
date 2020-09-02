package Java;

public class SpvOptions extends PointerBoundObject {

	private final int constructorIndex;

	public SpvOptions() {
		this.constructorIndex = 0;
		load();
	}

	protected SpvOptions(byte[] ptr) {
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
					ptr = Main.SpvOptions();
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

	public void setGenerateDebugInfo(boolean v) {
		Main.SpvOptions_setGenerateDebugInfo(ptr, v);
	}

	public void setStripDebugInfo(boolean v) {
		Main.SpvOptions_setStripDebugInfo(ptr, v);
	}

	public void setDisableOptimizer(boolean v) {
		Main.SpvOptions_setDisableOptimizer(ptr, v);
	}

	public void setOptimizeSize(boolean v) {
		Main.SpvOptions_setOptimizeSize(ptr, v);
	}

	public void setDisassemble(boolean v) {
		Main.SpvOptions_setDisassemble(ptr, v);
	}

	public void setValidate(boolean v) {
		Main.SpvOptions_setValidate(ptr, v);
	}

	public boolean getGenerateDebugInfo() {
		return Main.SpvOptions_getGenerateDebugInfo(ptr);
	}

	public boolean getStripDebugInfo() {
		return Main.SpvOptions_getStripDebugInfo(ptr);
	}

	public boolean getDisableOptimizer() {
		return Main.SpvOptions_getDisableOptimizer(ptr);
	}

	public boolean getOptimizeSize() {
		return Main.SpvOptions_getOptimizeSize(ptr);
	}

	public boolean getDisassemble() {
		return Main.SpvOptions_getDisassemble(ptr);
	}

	public boolean getValidate() {
		return Main.SpvOptions_getValidate(ptr);
	}

}