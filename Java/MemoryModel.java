package Java;

public enum MemoryModel {
	MemoryModelSimple(Main.MEMORY_MODEL_SIMPLE),
	MemoryModelGLSL450(Main.MEMORY_MODEL_GLSL_450),
	MemoryModelOpenCL(Main.MEMORY_MODEL_OPEN_CL),
	MemoryModelVulkan(Main.MEMORY_MODEL_VULKAN),
	MemoryModelVulkanKHR(Main.MEMORY_MODEL_VULKAN_KHR),
	MemoryModelMax(Main.MEMORY_MODEL_MAX);

	private final int value;

	private MemoryModel(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static MemoryModel valueByStr(String str) {
		switch (str) {
			case "MemoryModelSimple":
				return MemoryModelSimple;
			case "MemoryModelGLSL450":
				return MemoryModelGLSL450;
			case "MemoryModelOpenCL":
				return MemoryModelOpenCL;
			case "MemoryModelVulkan":
				return MemoryModelVulkan;
			case "MemoryModelVulkanKHR":
				return MemoryModelVulkanKHR;
			case "MemoryModelMax":
				return MemoryModelMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static MemoryModel valueByConstant(int constant) {
		switch (constant) {
			case Main.MEMORY_MODEL_SIMPLE:
				return MemoryModelSimple;
			case Main.MEMORY_MODEL_GLSL_450:
				return MemoryModelGLSL450;
			case Main.MEMORY_MODEL_OPEN_CL:
				return MemoryModelOpenCL;
			case Main.MEMORY_MODEL_VULKAN:
				return MemoryModelVulkan;
			case Main.MEMORY_MODEL_MAX:
				return MemoryModelMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
