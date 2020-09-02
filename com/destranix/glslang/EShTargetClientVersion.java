package com.destranix.glslang;

public enum EShTargetClientVersion {
	EShTargetVulkan_1_0(Main.E_SH_TARGET_VULKAN_1_0),
	EShTargetVulkan_1_1(Main.E_SH_TARGET_VULKAN_1_1),
	EShTargetVulkan_1_2(Main.E_SH_TARGET_VULKAN_1_2),
	EShTargetOpenGL_450(Main.E_SH_TARGET_OPENGL_450);

	private final int value;

	private EShTargetClientVersion(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static EShTargetClientVersion valueByStr(String str) {
		switch (str) {
			case "EShTargetVulkan_1_0":
				return EShTargetVulkan_1_0;
			case "EShTargetVulkan_1_1":
				return EShTargetVulkan_1_1;
			case "EShTargetVulkan_1_2":
				return EShTargetVulkan_1_2;
			case "EShTargetOpenGL_450":
				return EShTargetOpenGL_450;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static EShTargetClientVersion valueByConstant(int constant) {
		switch (constant) {
			case Main.E_SH_TARGET_VULKAN_1_0:
				return EShTargetVulkan_1_0;
			case Main.E_SH_TARGET_VULKAN_1_1:
				return EShTargetVulkan_1_1;
			case Main.E_SH_TARGET_VULKAN_1_2:
				return EShTargetVulkan_1_2;
			case Main.E_SH_TARGET_OPENGL_450:
				return EShTargetOpenGL_450;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
