package com.destranix.glslang;

import java.util.EnumSet;

public enum EShReflectionOptions {
	EShReflectionDefault(Main.E_SH_REFLECTION_DEFAULT),
	EShReflectionStrictArraySuffix(Main.E_SH_REFLECTION_STRICT_ARRAY_SUFFIX),
	EShReflectionBasicArraySuffix(Main.E_SH_REFLECTION_BASIC_ARRAY_SUFFIX),
	EShReflectionIntermediateIO(Main.E_SH_REFLECTION_INTERMEDIATE_IO),
	EShReflectionSeparateBuffers(Main.E_SH_REFLECTION_SEPARATE_BUFFERS),
	EShReflectionAllBlockVariables(Main.E_SH_REFLECTION_ALL_BLOCK_VARIABLES),
	EShReflectionUnwrapIOBlocks(Main.E_SH_REFLECTION_UNWRAP_IO_BLOCKS),
	EShReflectionAllIOVariables(Main.E_SH_REFLECTION_ALL_IO_VARIABLES),
	EShReflectionSharedStd140SSBO(Main.E_SH_REFLECTION_SHARED_STD_1400_SSBO),
	EShReflectionSharedStd140UBO(Main.E_SH_REFLECTION_SHARED_STD_1400_UBO);

	private final int value;

	private EShReflectionOptions(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static int setToInt(EnumSet<EShReflectionOptions> set) {
		int ret = 0;
		for (EShReflectionOptions val : set) {
			ret |= val.getConstant();
		}
		return ret;
	}

	public static EShReflectionOptions valueByStr(String str) {
		switch (str) {
			case "EShReflectionDefault":
				return EShReflectionDefault;
			case "EShReflectionStrictArraySuffix":
				return EShReflectionStrictArraySuffix;
			case "EShReflectionBasicArraySuffix":
				return EShReflectionBasicArraySuffix;
			case "EShReflectionIntermediateIO":
				return EShReflectionIntermediateIO;
			case "EShReflectionSeparateBuffers":
				return EShReflectionSeparateBuffers;
			case "EShReflectionAllBlockVariables":
				return EShReflectionAllBlockVariables;
			case "EShReflectionUnwrapIOBlocks":
				return EShReflectionUnwrapIOBlocks;
			case "EShReflectionAllIOVariables":
				return EShReflectionAllIOVariables;
			case "EShReflectionSharedStd140SSBO":
				return EShReflectionSharedStd140SSBO;
			case "EShReflectionSharedStd140UBO":
				return EShReflectionSharedStd140UBO;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static EShReflectionOptions valueByConstant(int constant) {
		switch (constant) {
			case Main.E_SH_REFLECTION_DEFAULT:
				return EShReflectionDefault;
			case Main.E_SH_REFLECTION_STRICT_ARRAY_SUFFIX:
				return EShReflectionStrictArraySuffix;
			case Main.E_SH_REFLECTION_BASIC_ARRAY_SUFFIX:
				return EShReflectionBasicArraySuffix;
			case Main.E_SH_REFLECTION_INTERMEDIATE_IO:
				return EShReflectionIntermediateIO;
			case Main.E_SH_REFLECTION_SEPARATE_BUFFERS:
				return EShReflectionSeparateBuffers;
			case Main.E_SH_REFLECTION_ALL_BLOCK_VARIABLES:
				return EShReflectionAllBlockVariables;
			case Main.E_SH_REFLECTION_UNWRAP_IO_BLOCKS:
				return EShReflectionUnwrapIOBlocks;
			case Main.E_SH_REFLECTION_ALL_IO_VARIABLES:
				return EShReflectionAllIOVariables;
			case Main.E_SH_REFLECTION_SHARED_STD_1400_SSBO:
				return EShReflectionSharedStd140SSBO;
			case Main.E_SH_REFLECTION_SHARED_STD_1400_UBO:
				return EShReflectionSharedStd140UBO;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
