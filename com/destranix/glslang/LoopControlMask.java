package com.destranix.glslang;

import java.util.EnumSet;

public enum LoopControlMask {
	LoopControlMaskNone(Main.LOOP_CONTROL_MASK_NONE),
	LoopControlUnrollMask(Main.LOOP_CONTROL_UNROLL_MASK),
	LoopControlDontUnrollMask(Main.LOOP_CONTROL_DONT_UNROLL_MASK),
	LoopControlDependencyInfiniteMask(Main.LOOP_CONTROL_DEPENDENCY_INFINITE_MASK),
	LoopControlDependencyLengthMask(Main.LOOP_CONTROL_DEPENDENCY_LENGTH_MASK),
	LoopControlMinIterationsMask(Main.LOOP_CONTROL_MIN_ITERATIONS_MASK),
	LoopControlMaxIterationsMask(Main.LOOP_CONTROL_MAX_ITERATIONS_MASK),
	LoopControlIterationMultipleMask(Main.LOOP_CONTROL_ITERATION_MULTIPLE_MASK),
	LoopControlPeelCountMask(Main.LOOP_CONTROL_PEEL_COUNT_MASK),
	LoopControlPartialCountMask(Main.LOOP_CONTROL_PARTIAL_COUNT_MASK),
	LoopControlInitiationIntervalINTELMask(Main.LOOP_CONTROL_INITIATION_INTERVAL_INTEL_MASK),
	LoopControlMaxConcurrencyINTELMask(Main.LOOP_CONTROL_MAX_CONCURRENCY_INTEL_MASK),
	LoopControlDependencyArrayINTELMask(Main.LOOP_CONTROL_DEPENDENCY_ARRAY_INTEL_MASK),
	LoopControlPipelineEnableINTELMask(Main.LOOP_CONTROL_PIPELINE_ENABLE_INTEL_MASK),
	LoopControlLoopCoalesceINTELMask(Main.LOOP_CONTROL_LOOP_COALESCE_INTEL_MASK),
	LoopControlMaxInterleavingINTELMask(Main.LOOP_CONTROL_MAX_INTERLEAVING_INTEL_MASK),
	LoopControlSpeculatedIterationsINTELMask(Main.LOOP_CONTROL_SPECULATED_ITERATIONS_INTEL_MASK);

	private final int value;

	private LoopControlMask(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static int setToInt(EnumSet<LoopControlMask> set) {
		int ret = 0;
		for (LoopControlMask val : set) {
			ret |= val.getConstant();
		}
		return ret;
	}

	public static LoopControlMask valueByStr(String str) {
		switch (str) {
			case "LoopControlMaskNone":
				return LoopControlMaskNone;
			case "LoopControlUnrollMask":
				return LoopControlUnrollMask;
			case "LoopControlDontUnrollMask":
				return LoopControlDontUnrollMask;
			case "LoopControlDependencyInfiniteMask":
				return LoopControlDependencyInfiniteMask;
			case "LoopControlDependencyLengthMask":
				return LoopControlDependencyLengthMask;
			case "LoopControlMinIterationsMask":
				return LoopControlMinIterationsMask;
			case "LoopControlMaxIterationsMask":
				return LoopControlMaxIterationsMask;
			case "LoopControlIterationMultipleMask":
				return LoopControlIterationMultipleMask;
			case "LoopControlPeelCountMask":
				return LoopControlPeelCountMask;
			case "LoopControlPartialCountMask":
				return LoopControlPartialCountMask;
			case "LoopControlInitiationIntervalINTELMask":
				return LoopControlInitiationIntervalINTELMask;
			case "LoopControlMaxConcurrencyINTELMask":
				return LoopControlMaxConcurrencyINTELMask;
			case "LoopControlDependencyArrayINTELMask":
				return LoopControlDependencyArrayINTELMask;
			case "LoopControlPipelineEnableINTELMask":
				return LoopControlPipelineEnableINTELMask;
			case "LoopControlLoopCoalesceINTELMask":
				return LoopControlLoopCoalesceINTELMask;
			case "LoopControlMaxInterleavingINTELMask":
				return LoopControlMaxInterleavingINTELMask;
			case "LoopControlSpeculatedIterationsINTELMask":
				return LoopControlSpeculatedIterationsINTELMask;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static LoopControlMask valueByConstant(int constant) {
		switch (constant) {
			case Main.LOOP_CONTROL_MASK_NONE:
				return LoopControlMaskNone;
			case Main.LOOP_CONTROL_UNROLL_MASK:
				return LoopControlUnrollMask;
			case Main.LOOP_CONTROL_DONT_UNROLL_MASK:
				return LoopControlDontUnrollMask;
			case Main.LOOP_CONTROL_DEPENDENCY_INFINITE_MASK:
				return LoopControlDependencyInfiniteMask;
			case Main.LOOP_CONTROL_DEPENDENCY_LENGTH_MASK:
				return LoopControlDependencyLengthMask;
			case Main.LOOP_CONTROL_MIN_ITERATIONS_MASK:
				return LoopControlMinIterationsMask;
			case Main.LOOP_CONTROL_MAX_ITERATIONS_MASK:
				return LoopControlMaxIterationsMask;
			case Main.LOOP_CONTROL_ITERATION_MULTIPLE_MASK:
				return LoopControlIterationMultipleMask;
			case Main.LOOP_CONTROL_PEEL_COUNT_MASK:
				return LoopControlPeelCountMask;
			case Main.LOOP_CONTROL_PARTIAL_COUNT_MASK:
				return LoopControlPartialCountMask;
			case Main.LOOP_CONTROL_INITIATION_INTERVAL_INTEL_MASK:
				return LoopControlInitiationIntervalINTELMask;
			case Main.LOOP_CONTROL_MAX_CONCURRENCY_INTEL_MASK:
				return LoopControlMaxConcurrencyINTELMask;
			case Main.LOOP_CONTROL_DEPENDENCY_ARRAY_INTEL_MASK:
				return LoopControlDependencyArrayINTELMask;
			case Main.LOOP_CONTROL_PIPELINE_ENABLE_INTEL_MASK:
				return LoopControlPipelineEnableINTELMask;
			case Main.LOOP_CONTROL_LOOP_COALESCE_INTEL_MASK:
				return LoopControlLoopCoalesceINTELMask;
			case Main.LOOP_CONTROL_MAX_INTERLEAVING_INTEL_MASK:
				return LoopControlMaxInterleavingINTELMask;
			case Main.LOOP_CONTROL_SPECULATED_ITERATIONS_INTEL_MASK:
				return LoopControlSpeculatedIterationsINTELMask;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
