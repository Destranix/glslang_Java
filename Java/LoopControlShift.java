package Java;

public enum LoopControlShift {
	LoopControlUnrollShift(Main.LOOP_CONTROL_UNROLL_SHIFT),
	LoopControlDontUnrollShift(Main.LOOP_CONTROL_DONT_UNROLL_SHIFT),
	LoopControlDependencyInfiniteShift(Main.LOOP_CONTROL_DEPENDENCY_INFINITE_SHIFT),
	LoopControlDependencyLengthShift(Main.LOOP_CONTROL_DEPENDENCY_LENGTH_SHIFT),
	LoopControlMinIterationsShift(Main.LOOP_CONTROL_MIN_ITERATIONS_SHIFT),
	LoopControlMaxIterationsShift(Main.LOOP_CONTROL_MAX_ITERATIONS_SHIFT),
	LoopControlIterationMultipleShift(Main.LOOP_CONTROL_ITERATION_MULTIPLE_SHIFT),
	LoopControlPeelCountShift(Main.LOOP_CONTROL_PEEL_COUNT_SHIFT),
	LoopControlPartialCountShift(Main.LOOP_CONTROL_PARTIAL_COUNT_SHIFT),
	LoopControlInitiationIntervalINTELShift(Main.LOOP_CONTROL_INITIATION_INTERVAL_INTEL_SHIFT),
	LoopControlMaxConcurrencyINTELShift(Main.LOOP_CONTROL_MAX_CONCURRENCY_INTEL_SHIFT),
	LoopControlDependencyArrayINTELShift(Main.LOOP_CONTROL_DEPENDENCY_ARRAY_INTEL_SHIFT),
	LoopControlPipelineEnableINTELShift(Main.LOOP_CONTROL_PIPELINE_ENABLE_INTEL_SHIFT),
	LoopControlLoopCoalesceINTELShift(Main.LOOP_CONTROL_LOOP_COALESCE_INTEL_SHIFT),
	LoopControlMaxInterleavingINTELShift(Main.LOOP_CONTROL_MAX_INTERLEAVING_INTEL_SHIFT),
	LoopControlSpeculatedIterationsINTELShift(Main.LOOP_CONTROL_SPECULATED_ITERATIONS_INTEL_SHIFT),
	LoopControlMax(Main.LOOP_CONTROL_MAX);

	private final int value;

	private LoopControlShift(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static LoopControlShift valueByStr(String str) {
		switch (str) {
			case "LoopControlUnrollShift":
				return LoopControlUnrollShift;
			case "LoopControlDontUnrollShift":
				return LoopControlDontUnrollShift;
			case "LoopControlDependencyInfiniteShift":
				return LoopControlDependencyInfiniteShift;
			case "LoopControlDependencyLengthShift":
				return LoopControlDependencyLengthShift;
			case "LoopControlMinIterationsShift":
				return LoopControlMinIterationsShift;
			case "LoopControlMaxIterationsShift":
				return LoopControlMaxIterationsShift;
			case "LoopControlIterationMultipleShift":
				return LoopControlIterationMultipleShift;
			case "LoopControlPeelCountShift":
				return LoopControlPeelCountShift;
			case "LoopControlPartialCountShift":
				return LoopControlPartialCountShift;
			case "LoopControlInitiationIntervalINTELShift":
				return LoopControlInitiationIntervalINTELShift;
			case "LoopControlMaxConcurrencyINTELShift":
				return LoopControlMaxConcurrencyINTELShift;
			case "LoopControlDependencyArrayINTELShift":
				return LoopControlDependencyArrayINTELShift;
			case "LoopControlPipelineEnableINTELShift":
				return LoopControlPipelineEnableINTELShift;
			case "LoopControlLoopCoalesceINTELShift":
				return LoopControlLoopCoalesceINTELShift;
			case "LoopControlMaxInterleavingINTELShift":
				return LoopControlMaxInterleavingINTELShift;
			case "LoopControlSpeculatedIterationsINTELShift":
				return LoopControlSpeculatedIterationsINTELShift;
			case "LoopControlMax":
				return LoopControlMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static LoopControlShift valueByConstant(int constant) {
		switch (constant) {
			case Main.LOOP_CONTROL_UNROLL_SHIFT:
				return LoopControlUnrollShift;
			case Main.LOOP_CONTROL_DONT_UNROLL_SHIFT:
				return LoopControlDontUnrollShift;
			case Main.LOOP_CONTROL_DEPENDENCY_INFINITE_SHIFT:
				return LoopControlDependencyInfiniteShift;
			case Main.LOOP_CONTROL_DEPENDENCY_LENGTH_SHIFT:
				return LoopControlDependencyLengthShift;
			case Main.LOOP_CONTROL_MIN_ITERATIONS_SHIFT:
				return LoopControlMinIterationsShift;
			case Main.LOOP_CONTROL_MAX_ITERATIONS_SHIFT:
				return LoopControlMaxIterationsShift;
			case Main.LOOP_CONTROL_ITERATION_MULTIPLE_SHIFT:
				return LoopControlIterationMultipleShift;
			case Main.LOOP_CONTROL_PEEL_COUNT_SHIFT:
				return LoopControlPeelCountShift;
			case Main.LOOP_CONTROL_PARTIAL_COUNT_SHIFT:
				return LoopControlPartialCountShift;
			case Main.LOOP_CONTROL_INITIATION_INTERVAL_INTEL_SHIFT:
				return LoopControlInitiationIntervalINTELShift;
			case Main.LOOP_CONTROL_MAX_CONCURRENCY_INTEL_SHIFT:
				return LoopControlMaxConcurrencyINTELShift;
			case Main.LOOP_CONTROL_DEPENDENCY_ARRAY_INTEL_SHIFT:
				return LoopControlDependencyArrayINTELShift;
			case Main.LOOP_CONTROL_PIPELINE_ENABLE_INTEL_SHIFT:
				return LoopControlPipelineEnableINTELShift;
			case Main.LOOP_CONTROL_LOOP_COALESCE_INTEL_SHIFT:
				return LoopControlLoopCoalesceINTELShift;
			case Main.LOOP_CONTROL_MAX_INTERLEAVING_INTEL_SHIFT:
				return LoopControlMaxInterleavingINTELShift;
			case Main.LOOP_CONTROL_SPECULATED_ITERATIONS_INTEL_SHIFT:
				return LoopControlSpeculatedIterationsINTELShift;
			case Main.LOOP_CONTROL_MAX:
				return LoopControlMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
