package Java;

public class Version extends PointerBoundObject {

	private final int major;
	private final int minor;
	private final int patch;
	private final String flavor;
	private final int constructorIndex;

	public Version() {
		this.major = -1;
		this.minor = -1;
		this.patch = -1;
		this.flavor = null;
		this.constructorIndex = 0;
		load();
	}

	public Version(int major, int minor, int patch, String flavor) {
		this.major = major;
		this.minor = minor;
		this.patch = patch;
		this.flavor = flavor;
		this.constructorIndex = 1;
		load();
	}

	protected Version(byte[] ptr) {
		this.ptr = ptr;
		this.major = -1;
		this.minor = -1;
		this.patch = -1;
		this.flavor = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.Version();
					break;
				case 1:
					ptr = Main.Version(major, minor, patch, flavor);
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

	public void setMajor(int v) {
		Main.Version_setMajor(ptr, v);
	}

	public void setMinor(int v) {
		Main.Version_setMinor(ptr, v);
	}

	public void setPatch(int v) {
		Main.Version_setPatch(ptr, v);
	}

	public int getMajor() {
		return Main.Version_getMajor(ptr);
	}

	public int getMinor() {
		return Main.Version_getMinor(ptr);
	}

	public int getPatch() {
		return Main.Version_getPatch(ptr);
	}

	public String getFlavor() {
		return Main.Version_getFlavor(ptr);
	}

}
