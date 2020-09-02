package com.destranix.glslang;

public enum RayFlagsShift {
	RayFlagsOpaqueKHRShift(Main.RAY_FLAGS_OPAQUE_KHR_SHIFT),
	RayFlagsNoOpaqueKHRShift(Main.RAY_FLAGS_NO_OPAQUE_KHR_SHIFT),
	RayFlagsTerminateOnFirstHitKHRShift(Main.RAY_FLAGS_TERMINATE_ON_FIRST_HIT_KHR_SHIFT),
	RayFlagsSkipClosestHitShaderKHRShift(Main.RAY_FLAGS_SKIP_CLOSEST_HIT_SHADER_KHR_SHIFT),
	RayFlagsCullBackFacingTrianglesKHRShift(Main.RAY_FLAGS_CULL_BACK_FACING_TRIANGLES_KHR_SHIFT),
	RayFlagsCullFrontFacingTrianglesKHRShift(Main.RAY_FLAGS_CULL_FRONT_FACING_TRIANGLES_KHR_SHIFT),
	RayFlagsCullOpaqueKHRShift(Main.RAY_FLAGS_CULL_OPAQUE_KHR_SHIFT),
	RayFlagsCullNoOpaqueKHRShift(Main.RAY_FLAGS_CULL_NO_OPAQUE_KHR_SHIFT),
	RayFlagsSkipTrianglesKHRShift(Main.RAY_FLAGS_SKIP_TRIANGLES_KHR_SHIFT),
	RayFlagsSkipAABBsKHRShift(Main.RAY_FLAGS_SKIP_AABBS_KHR_SHIFT),
	RayFlagsMax(Main.RAY_FLAGS_MAX);

	private final int value;

	private RayFlagsShift(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static RayFlagsShift valueByStr(String str) {
		switch (str) {
			case "RayFlagsOpaqueKHRShift":
				return RayFlagsOpaqueKHRShift;
			case "RayFlagsNoOpaqueKHRShift":
				return RayFlagsNoOpaqueKHRShift;
			case "RayFlagsTerminateOnFirstHitKHRShift":
				return RayFlagsTerminateOnFirstHitKHRShift;
			case "RayFlagsSkipClosestHitShaderKHRShift":
				return RayFlagsSkipClosestHitShaderKHRShift;
			case "RayFlagsCullBackFacingTrianglesKHRShift":
				return RayFlagsCullBackFacingTrianglesKHRShift;
			case "RayFlagsCullFrontFacingTrianglesKHRShift":
				return RayFlagsCullFrontFacingTrianglesKHRShift;
			case "RayFlagsCullOpaqueKHRShift":
				return RayFlagsCullOpaqueKHRShift;
			case "RayFlagsCullNoOpaqueKHRShift":
				return RayFlagsCullNoOpaqueKHRShift;
			case "RayFlagsSkipTrianglesKHRShift":
				return RayFlagsSkipTrianglesKHRShift;
			case "RayFlagsSkipAABBsKHRShift":
				return RayFlagsSkipAABBsKHRShift;
			case "RayFlagsMax":
				return RayFlagsMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static RayFlagsShift valueByConstant(int constant) {
		switch (constant) {
			case Main.RAY_FLAGS_OPAQUE_KHR_SHIFT:
				return RayFlagsOpaqueKHRShift;
			case Main.RAY_FLAGS_NO_OPAQUE_KHR_SHIFT:
				return RayFlagsNoOpaqueKHRShift;
			case Main.RAY_FLAGS_TERMINATE_ON_FIRST_HIT_KHR_SHIFT:
				return RayFlagsTerminateOnFirstHitKHRShift;
			case Main.RAY_FLAGS_SKIP_CLOSEST_HIT_SHADER_KHR_SHIFT:
				return RayFlagsSkipClosestHitShaderKHRShift;
			case Main.RAY_FLAGS_CULL_BACK_FACING_TRIANGLES_KHR_SHIFT:
				return RayFlagsCullBackFacingTrianglesKHRShift;
			case Main.RAY_FLAGS_CULL_FRONT_FACING_TRIANGLES_KHR_SHIFT:
				return RayFlagsCullFrontFacingTrianglesKHRShift;
			case Main.RAY_FLAGS_CULL_OPAQUE_KHR_SHIFT:
				return RayFlagsCullOpaqueKHRShift;
			case Main.RAY_FLAGS_CULL_NO_OPAQUE_KHR_SHIFT:
				return RayFlagsCullNoOpaqueKHRShift;
			case Main.RAY_FLAGS_SKIP_TRIANGLES_KHR_SHIFT:
				return RayFlagsSkipTrianglesKHRShift;
			case Main.RAY_FLAGS_SKIP_AABBS_KHR_SHIFT:
				return RayFlagsSkipAABBsKHRShift;
			case Main.RAY_FLAGS_MAX:
				return RayFlagsMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
