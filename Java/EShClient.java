package Java;

public enum EShClient {
	EShClientNone(Main.E_SH_CLIENT_NONE),
	EShClientVulkan(Main.E_SH_CLIENT_VULKAN),
	EShClientOpenGL(Main.E_SH_CLIENT_OPENGL);

	private final int value;

	private EShClient(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static EShClient valueByStr(String str) {
		switch (str) {
			case "EShClientNone":
				return EShClientNone;
			case "EShClientVulkan":
				return EShClientVulkan;
			case "EShClientOpenGL":
				return EShClientOpenGL;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static EShClient valueByConstant(int constant) {
		switch (constant) {
			case Main.E_SH_CLIENT_NONE:
				return EShClientNone;
			case Main.E_SH_CLIENT_VULKAN:
				return EShClientVulkan;
			case Main.E_SH_CLIENT_OPENGL:
				return EShClientOpenGL;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
