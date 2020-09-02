package Java;

public class UniformMap extends PointerBoundObject {

	private final int constructorIndex;

	public UniformMap() {
		this.constructorIndex = 0;
		load();
	}

	protected UniformMap(byte[] ptr) {
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
					ptr = Main.ShConstructUniformMap();
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
					Main.ShDestruct(ptr);
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public String getInfoLog() {
		return Main.ShGetInfoLog(ptr);
	}

	public int getUniformLocation(String name) {
		return Main.ShGetUniformLocation(ptr, name);
	}
}
