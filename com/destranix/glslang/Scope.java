package com.destranix.glslang;

public enum Scope {
	ScopeCrossDevice(Main.SCOPE_CROSS_DEVICE),
	ScopeDevice(Main.SCOPE_DEVICE),
	ScopeWorkgroup(Main.SCOPE_WORKGROUP),
	ScopeSubgroup(Main.SCOPE_SUBGROUP),
	ScopeInvocation(Main.SCOPE_INVOCATION),
	ScopeQueueFamily(Main.SCOPE_QUEUE_FAMILY),
	ScopeQueueFamilyKHR(Main.SCOPE_QUEUE_FAMILY_KHR),
	ScopeShaderCallKHR(Main.SCOPE_SHADER_CALL_KHR),
	ScopeMax(Main.SCOPE_MAX);

	private final int value;

	private Scope(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static Scope valueByStr(String str) {
		switch (str) {
			case "ScopeCrossDevice":
				return ScopeCrossDevice;
			case "ScopeDevice":
				return ScopeDevice;
			case "ScopeWorkgroup":
				return ScopeWorkgroup;
			case "ScopeSubgroup":
				return ScopeSubgroup;
			case "ScopeInvocation":
				return ScopeInvocation;
			case "ScopeQueueFamily":
				return ScopeQueueFamily;
			case "ScopeQueueFamilyKHR":
				return ScopeQueueFamilyKHR;
			case "ScopeShaderCallKHR":
				return ScopeShaderCallKHR;
			case "ScopeMax":
				return ScopeMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static Scope valueByConstant(int constant) {
		switch (constant) {
			case Main.SCOPE_CROSS_DEVICE:
				return ScopeCrossDevice;
			case Main.SCOPE_DEVICE:
				return ScopeDevice;
			case Main.SCOPE_WORKGROUP:
				return ScopeWorkgroup;
			case Main.SCOPE_SUBGROUP:
				return ScopeSubgroup;
			case Main.SCOPE_INVOCATION:
				return ScopeInvocation;
			case Main.SCOPE_QUEUE_FAMILY:
				return ScopeQueueFamily;
			case Main.SCOPE_SHADER_CALL_KHR:
				return ScopeShaderCallKHR;
			case Main.SCOPE_MAX:
				return ScopeMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
