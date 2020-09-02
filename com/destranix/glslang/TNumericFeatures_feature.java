package com.destranix.glslang;

public enum TNumericFeatures_feature {
	shader_explicit_arithmetic_types(Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES),
	shader_explicit_arithmetic_types_int8(Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_INT8),
	shader_explicit_arithmetic_types_int16(Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_INT16),
	shader_explicit_arithmetic_types_int32(Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_INT32),
	shader_explicit_arithmetic_types_int64(Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_INT64),
	shader_explicit_arithmetic_types_float16(Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_FLOAT16),
	shader_explicit_arithmetic_types_float32(Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_FLOAT32),
	shader_explicit_arithmetic_types_float64(Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_FLOAT64),
	shader_implicit_conversions(Main.TNUMERICFEATURES_FEATURE_SHADER_IMPLICIT_CONVERSIONS),
	gpu_shader_fp64(Main.TNUMERICFEATURES_FEATURE_GPU_SHADER_FP64),
	gpu_shader_int16(Main.TNUMERICFEATURES_FEATURE_GPU_SHADER_INT16),
	gpu_shader_half_float(Main.TNUMERICFEATURES_FEATURE_GPU_SHADER_HALF_FLOAT);

	private final int value;

	private TNumericFeatures_feature(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TNumericFeatures_feature valueByStr(String str) {
		switch (str) {
			case "shader_explicit_arithmetic_types":
				return shader_explicit_arithmetic_types;
			case "shader_explicit_arithmetic_types_int8":
				return shader_explicit_arithmetic_types_int8;
			case "shader_explicit_arithmetic_types_int16":
				return shader_explicit_arithmetic_types_int16;
			case "shader_explicit_arithmetic_types_int32":
				return shader_explicit_arithmetic_types_int32;
			case "shader_explicit_arithmetic_types_int64":
				return shader_explicit_arithmetic_types_int64;
			case "shader_explicit_arithmetic_types_float16":
				return shader_explicit_arithmetic_types_float16;
			case "shader_explicit_arithmetic_types_float32":
				return shader_explicit_arithmetic_types_float32;
			case "shader_explicit_arithmetic_types_float64":
				return shader_explicit_arithmetic_types_float64;
			case "shader_implicit_conversions":
				return shader_implicit_conversions;
			case "gpu_shader_fp64":
				return gpu_shader_fp64;
			case "gpu_shader_int16":
				return gpu_shader_int16;
			case "gpu_shader_half_float":
				return gpu_shader_half_float;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TNumericFeatures_feature valueByConstant(int constant) {
		switch (constant) {
			case Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES:
				return shader_explicit_arithmetic_types;
			case Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_INT8:
				return shader_explicit_arithmetic_types_int8;
			case Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_INT16:
				return shader_explicit_arithmetic_types_int16;
			case Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_INT32:
				return shader_explicit_arithmetic_types_int32;
			case Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_INT64:
				return shader_explicit_arithmetic_types_int64;
			case Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_FLOAT16:
				return shader_explicit_arithmetic_types_float16;
			case Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_FLOAT32:
				return shader_explicit_arithmetic_types_float32;
			case Main.TNUMERICFEATURES_FEATURE_SHADER_EXPLICIT_ARITHMETIC_TYPES_FLOAT64:
				return shader_explicit_arithmetic_types_float64;
			case Main.TNUMERICFEATURES_FEATURE_SHADER_IMPLICIT_CONVERSIONS:
				return shader_implicit_conversions;
			case Main.TNUMERICFEATURES_FEATURE_GPU_SHADER_FP64:
				return gpu_shader_fp64;
			case Main.TNUMERICFEATURES_FEATURE_GPU_SHADER_INT16:
				return gpu_shader_int16;
			case Main.TNUMERICFEATURES_FEATURE_GPU_SHADER_HALF_FLOAT:
				return gpu_shader_half_float;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
