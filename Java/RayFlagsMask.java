package Java;

import java.util.EnumSet;

public enum RayFlagsMask {
	RayFlagsMaskNone(Main.RAY_FLAGS_MASK_NONE),
	RayFlagsOpaqueKHRMask(Main.RAY_FLAGS_OPAQUE_KHR_MASK),
	RayFlagsNoOpaqueKHRMask(Main.RAY_FLAGS_NO_OPAQUE_KHR_MASK),
	RayFlagsTerminateOnFirstHitKHRMask(Main.RAY_FLAGS_TERMINATE_ON_FIRST_HIT_KHR_MASK),
	RayFlagsSkipClosestHitShaderKHRMask(Main.RAY_FLAGS_SKIP_CLOSEST_HIT_SHADER_KHR_MASK),
	RayFlagsCullBackFacingTrianglesKHRMask(Main.RAY_FLAGS_CULL_BACK_FACING_TRIANGLES_KHR_MASK),
	RayFlagsCullFrontFacingTrianglesKHRMask(Main.RAY_FLAGS_CULL_FRONT_FACING_TRIANGLES_KHR_MASK),
	RayFlagsCullOpaqueKHRMask(Main.RAY_FLAGS_CULL_OPAQUE_KHR_MASK),
	RayFlagsCullNoOpaqueKHRMask(Main.RAY_FLAGS_CULL_NO_OPAQUE_KHR_MASK),
	RayFlagsSkipTrianglesKHRMask(Main.RAY_FLAGS_SKIP_TRIANGLES_KHR_MASK),
	RayFlagsSkipAABBsKHRMask(Main.RAY_FLAGS_SKIP_AABBS_KHR_MASK);

	final int value;

	private RayFlagsMask(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static int setToInt(EnumSet<RayFlagsMask> set) {
		int ret = 0;
		for (RayFlagsMask val : set) {
			ret |= val.getConstant();
		}
		return ret;
	}

	public static RayFlagsMask valueByStr(String str) {
		switch (str) {
			case "RayFlagsMaskNone":
				return RayFlagsMaskNone;
			case "RayFlagsOpaqueKHRMask":
				return RayFlagsOpaqueKHRMask;
			case "RayFlagsNoOpaqueKHRMask":
				return RayFlagsNoOpaqueKHRMask;
			case "RayFlagsTerminateOnFirstHitKHRMask":
				return RayFlagsTerminateOnFirstHitKHRMask;
			case "RayFlagsSkipClosestHitShaderKHRMask":
				return RayFlagsSkipClosestHitShaderKHRMask;
			case "RayFlagsCullBackFacingTrianglesKHRMask":
				return RayFlagsCullBackFacingTrianglesKHRMask;
			case "RayFlagsCullFrontFacingTrianglesKHRMask":
				return RayFlagsCullFrontFacingTrianglesKHRMask;
			case "RayFlagsCullOpaqueKHRMask":
				return RayFlagsCullOpaqueKHRMask;
			case "RayFlagsCullNoOpaqueKHRMask":
				return RayFlagsCullNoOpaqueKHRMask;
			case "RayFlagsSkipTrianglesKHRMask":
				return RayFlagsSkipTrianglesKHRMask;
			case "RayFlagsSkipAABBsKHRMask":
				return RayFlagsSkipAABBsKHRMask;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static RayFlagsMask valueByConstant(int constant) {
		switch (constant) {
			case Main.RAY_FLAGS_MASK_NONE:
				return RayFlagsMaskNone;
			case Main.RAY_FLAGS_OPAQUE_KHR_MASK:
				return RayFlagsOpaqueKHRMask;
			case Main.RAY_FLAGS_NO_OPAQUE_KHR_MASK:
				return RayFlagsNoOpaqueKHRMask;
			case Main.RAY_FLAGS_TERMINATE_ON_FIRST_HIT_KHR_MASK:
				return RayFlagsTerminateOnFirstHitKHRMask;
			case Main.RAY_FLAGS_SKIP_CLOSEST_HIT_SHADER_KHR_MASK:
				return RayFlagsSkipClosestHitShaderKHRMask;
			case Main.RAY_FLAGS_CULL_BACK_FACING_TRIANGLES_KHR_MASK:
				return RayFlagsCullBackFacingTrianglesKHRMask;
			case Main.RAY_FLAGS_CULL_FRONT_FACING_TRIANGLES_KHR_MASK:
				return RayFlagsCullFrontFacingTrianglesKHRMask;
			case Main.RAY_FLAGS_CULL_OPAQUE_KHR_MASK:
				return RayFlagsCullOpaqueKHRMask;
			case Main.RAY_FLAGS_CULL_NO_OPAQUE_KHR_MASK:
				return RayFlagsCullNoOpaqueKHRMask;
			case Main.RAY_FLAGS_SKIP_TRIANGLES_KHR_MASK:
				return RayFlagsSkipTrianglesKHRMask;
			case Main.RAY_FLAGS_SKIP_AABBS_KHR_MASK:
				return RayFlagsSkipAABBsKHRMask;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
