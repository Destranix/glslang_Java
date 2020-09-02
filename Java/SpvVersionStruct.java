package Java;

public class SpvVersionStruct extends PointerBoundObject {

	private final int constructorIndex;

	public SpvVersionStruct() {
		this.constructorIndex = 0;
		load();
	}

	protected SpvVersionStruct(byte[] ptr) {
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
					ptr = Main.SpvVersion();
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

	public void setSpv(long v) {
		Main.SpvVersion_setSpv(ptr, v);
	}

	public void setVulkanGlsl(int v) {
		Main.SpvVersion_setVulkanGlsl(ptr, v);
	}

	public void setVulkan(int v) {
		Main.SpvVersion_setVulkan(ptr, v);
	}

	public void setOpenGl(int v) {
		Main.SpvVersion_setOpenGl(ptr, v);
	}

	public long getSpv() {
		return Main.SpvVersion_getSpv(ptr);
	}

	public int getVulkanGlsl() {
		return Main.SpvVersion_getVulkanGlsl(ptr);
	}

	public int getVulkan() {
		return Main.SpvVersion_getVulkan(ptr);
	}

	public int getOpenGl() {
		return Main.SpvVersion_getOpenGl(ptr);
	}

}
