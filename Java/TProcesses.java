package Java;

public class TProcesses extends PointerBoundObject {

	private final int constructorIndex;

	public TProcesses() {
		this.constructorIndex = 0;
		load();
	}

	protected TProcesses(byte[] ptr) {
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
					ptr = Main.TProcesses();
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

	public void addProcess(String process) {
		Main.TProcesses_addProcess(ptr, process);
	}

	public void addArgument(int arg) {
		Main.TProcesses_addArgument(ptr, arg);
	}

	public void addArgument(String arg) {
		Main.TProcesses_addArgument(ptr, arg);
	}

	public void addIfNonZero(String process, int value) {
		Main.TProcesses_addIfNonZero(ptr, process, value);
	}

	public String[] getProcesses() {
		return Main.TProcesses_getProcesses(ptr);
	}

}
