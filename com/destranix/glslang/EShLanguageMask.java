package com.destranix.glslang;

import java.util.EnumSet;

public enum EShLanguageMask {
	EShLangVertexMask(Main.E_SH_LANG_VERTEX_MASK),
	EShLangTessControlMask(Main.E_SH_LANG_TESS_CONTROL_MASK),
	EShLangTessEvaluationMask(Main.E_SH_LANG_TESS_EVALUATION_MASK),
	EShLangGeometryMask(Main.E_SH_LANG_GEOMETRY_MASK),
	EShLangFragmentMask(Main.E_SH_LANG_FRAGMENT_MASK),
	EShLangComputeMask(Main.E_SH_LANG_COMPUTE_MASK),
	EShLangRayGenMask(Main.E_SH_LANG_RAY_GEN_MASK),
	EShLangIntersectMask(Main.E_SH_LANG_INTERSECT_MASK),
	EShLangAnyHitMask(Main.E_SH_LANG_ANY_HIT_MASK),
	EShLangClosestHitMask(Main.E_SH_LANG_CLOSEST_HIT_MASK),
	EShLangMissMask(Main.E_SH_LANG_MISS_MASK),
	EShLangCallableMask(Main.E_SH_LANG_CALLABLE_MASK),
	EShLangTaskNVMask(Main.E_SH_LANG_TASK_NV_MASK),
	EShLangMeshNVMask(Main.E_SH_LANG_MESH_NV_MASK);

	private final int value;

	private EShLanguageMask(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static int setToInt(EnumSet<EShLanguageMask> set) {
		int ret = 0;
		for (EShLanguageMask val : set) {
			ret |= val.getConstant();
		}
		return ret;
	}
	
	public static EnumSet<EShLanguageMask> intToSet(int i) {
		EnumSet<EShLanguageMask> ret = EnumSet.allOf(EShLanguageMask.class);
		ret.removeIf((v)->{
			return (i & v.getConstant()) == 0;
		});
		return ret;
	}

	public static EShLanguageMask valueByStr(String str) {
		switch (str) {
			case "EShLangVertexMask":
				return EShLangVertexMask;
			case "EShLangTessControlMask":
				return EShLangTessControlMask;
			case "EShLangTessEvaluationMask":
				return EShLangTessEvaluationMask;
			case "EShLangGeometryMask":
				return EShLangGeometryMask;
			case "EShLangFragmentMask":
				return EShLangFragmentMask;
			case "EShLangComputeMask":
				return EShLangComputeMask;
			case "EShLangRayGenMask":
			case "EShLangRayGenNVMask":
				return EShLangRayGenMask;
			case "EShLangIntersectMask":
			case "EShLangIntersectNVMask":
				return EShLangIntersectMask;
			case "EShLangAnyHitMask":
			case "EShLangAnyHitNVMask":
				return EShLangAnyHitMask;
			case "EShLangClosestHitMask":
			case "EShLangClosestHitNVMask":
				return EShLangClosestHitMask;
			case "EShLangMissMask":
			case "EShLangMissNVMask":
				return EShLangMissMask;
			case "EShLangCallableMask":
			case "EShLangCallableNVMask":
				return EShLangCallableMask;
			case "EShLangTaskNVMask":
				return EShLangTaskNVMask;
			case "EShLangMeshNVMask":
				return EShLangMeshNVMask;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static EShLanguageMask valueByConstant(int constant) {
		switch (constant) {
			case Main.E_SH_LANG_VERTEX_MASK:
				return EShLangVertexMask;
			case Main.E_SH_LANG_TESS_CONTROL_MASK:
				return EShLangTessControlMask;
			case Main.E_SH_LANG_TESS_EVALUATION_MASK:
				return EShLangTessEvaluationMask;
			case Main.E_SH_LANG_GEOMETRY_MASK:
				return EShLangGeometryMask;
			case Main.E_SH_LANG_FRAGMENT_MASK:
				return EShLangFragmentMask;
			case Main.E_SH_LANG_COMPUTE_MASK:
				return EShLangComputeMask;
			case Main.E_SH_LANG_RAY_GEN_MASK:
				return EShLangRayGenMask;
			case Main.E_SH_LANG_INTERSECT_MASK:
				return EShLangIntersectMask;
			case Main.E_SH_LANG_ANY_HIT_MASK:
				return EShLangAnyHitMask;
			case Main.E_SH_LANG_CLOSEST_HIT_MASK:
				return EShLangClosestHitMask;
			case Main.E_SH_LANG_MISS_MASK:
				return EShLangMissMask;
			case Main.E_SH_LANG_CALLABLE_MASK:
				return EShLangCallableMask;
			case Main.E_SH_LANG_TASK_NV_MASK:
				return EShLangTaskNVMask;
			case Main.E_SH_LANG_MESH_NV_MASK:
				return EShLangMeshNVMask;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
