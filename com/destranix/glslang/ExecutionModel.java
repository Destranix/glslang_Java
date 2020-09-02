package com.destranix.glslang;

public enum ExecutionModel {
	ExecutionModelVertex(Main.EXECUTION_MODEL_VERTEX),
	ExecutionModelTessellationControl(Main.EXECUTION_MODEL_TESSELLATION_CONTROL),
	ExecutionModelTessellationEvaluation(Main.EXECUTION_MODEL_TESSELLATION_EVALUATION),
	ExecutionModelGeometry(Main.EXECUTION_MODEL_GEOMETRY),
	ExecutionModelFragment(Main.EXECUTION_MODEL_FRAGMENT),
	ExecutionModelGLCompute(Main.EXECUTION_MODEL_GLCOMPUTE),
	ExecutionModelKernel(Main.EXECUTION_MODEL_KERNEL),
	ExecutionModelTaskNV(Main.EXECUTION_MODEL_TASKNV),
	ExecutionModelMeshNV(Main.EXECUTION_MODEL_MESHNV),
	ExecutionModelRayGenerationKHR(Main.EXECUTION_MODEL_RAYGENERATION_KHR),
	ExecutionModelRayGenerationNV(Main.EXECUTION_MODEL_RAYGENERATION_NV),
	ExecutionModelIntersectionKHR(Main.EXECUTION_MODEL_INTERSECTION_KHR),
	ExecutionModelIntersectionNV(Main.EXECUTION_MODEL_INTERSECTION_NV),
	ExecutionModelAnyHitKHR(Main.EXECUTION_MODEL_ANY_HIT_KHR),
	ExecutionModelAnyHitNV(Main.EXECUTION_MODEL_ANY_HIT_NV),
	ExecutionModelClosestHitKHR(Main.EXECUTION_MODEL_CLOSEST_HIT_KHR),
	ExecutionModelClosestHitNV(Main.EXECUTION_MODEL_CLOSEST_HIT_NV),
	ExecutionModelMissKHR(Main.EXECUTION_MODEL_MISS_KHR),
	ExecutionModelMissNV(Main.EXECUTION_MODEL_MISS_NV),
	ExecutionModelCallableKHR(Main.EXECUTION_MODEL_CALLABLE_KHR),
	ExecutionModelCallableNV(Main.EXECUTION_MODEL_CALLABLE_NV),
	ExecutionModelMax(Main.EXECUTION_MODEL_MAX);

	private final int value;

	private ExecutionModel(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static ExecutionModel valueByStr(String str) {
		switch (str) {
			case "ExecutionModelVertex":
				return ExecutionModelVertex;
			case "ExecutionModelTessellationControl":
				return ExecutionModelTessellationControl;
			case "ExecutionModelTessellationEvaluation":
				return ExecutionModelTessellationEvaluation;
			case "ExecutionModelGeometry":
				return ExecutionModelGeometry;
			case "ExecutionModelFragment":
				return ExecutionModelFragment;
			case "ExecutionModelGLCompute":
				return ExecutionModelGLCompute;
			case "ExecutionModelKernel":
				return ExecutionModelKernel;
			case "ExecutionModelTaskNV":
				return ExecutionModelTaskNV;
			case "ExecutionModelMeshNV":
				return ExecutionModelMeshNV;
			case "ExecutionModelRayGenerationKHR":
				return ExecutionModelRayGenerationKHR;
			case "ExecutionModelRayGenerationNV":
				return ExecutionModelRayGenerationNV;
			case "ExecutionModelIntersectionKHR":
				return ExecutionModelIntersectionKHR;
			case "ExecutionModelIntersectionNV":
				return ExecutionModelIntersectionNV;
			case "ExecutionModelAnyHitKHR":
				return ExecutionModelAnyHitKHR;
			case "ExecutionModelAnyHitNV":
				return ExecutionModelAnyHitNV;
			case "ExecutionModelClosestHitKHR":
				return ExecutionModelClosestHitKHR;
			case "ExecutionModelClosestHitNV":
				return ExecutionModelClosestHitNV;
			case "ExecutionModelMissKHR":
				return ExecutionModelMissKHR;
			case "ExecutionModelMissNV":
				return ExecutionModelMissNV;
			case "ExecutionModelCallableKHR":
				return ExecutionModelCallableKHR;
			case "ExecutionModelCallableNV":
				return ExecutionModelCallableNV;
			case "ExecutionModelMax":
				return ExecutionModelMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static ExecutionModel valueByConstant(int constant) {
		switch (constant) {
			case Main.EXECUTION_MODEL_VERTEX:
				return ExecutionModelVertex;
			case Main.EXECUTION_MODEL_TESSELLATION_CONTROL:
				return ExecutionModelTessellationControl;
			case Main.EXECUTION_MODEL_TESSELLATION_EVALUATION:
				return ExecutionModelTessellationEvaluation;
			case Main.EXECUTION_MODEL_GEOMETRY:
				return ExecutionModelGeometry;
			case Main.EXECUTION_MODEL_FRAGMENT:
				return ExecutionModelFragment;
			case Main.EXECUTION_MODEL_GLCOMPUTE:
				return ExecutionModelGLCompute;
			case Main.EXECUTION_MODEL_KERNEL:
				return ExecutionModelKernel;
			case Main.EXECUTION_MODEL_TASKNV:
				return ExecutionModelTaskNV;
			case Main.EXECUTION_MODEL_MESHNV:
				return ExecutionModelMeshNV;
			case Main.EXECUTION_MODEL_RAYGENERATION_KHR:
				return ExecutionModelRayGenerationKHR;
			case Main.EXECUTION_MODEL_INTERSECTION_KHR:
				return ExecutionModelIntersectionKHR;
			case Main.EXECUTION_MODEL_ANY_HIT_KHR:
				return ExecutionModelAnyHitKHR;
			case Main.EXECUTION_MODEL_CLOSEST_HIT_KHR:
				return ExecutionModelClosestHitKHR;
			case Main.EXECUTION_MODEL_MISS_KHR:
				return ExecutionModelMissKHR;
			case Main.EXECUTION_MODEL_CALLABLE_KHR:
				return ExecutionModelCallableKHR;
			case Main.EXECUTION_MODEL_MAX:
				return ExecutionModelMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
