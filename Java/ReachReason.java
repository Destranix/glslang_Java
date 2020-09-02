package Java;

public enum ReachReason {
	ReachViaControlFlow(Main.REACH_VIA_CONTROL_FLOW),
	ReachDeadContinue(Main.REACH_DEAD_CONTINUE),
	ReachDeadMerge(Main.REACH_DEAD_MERGE);

	private final int value;

	private ReachReason(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static ReachReason valueByStr(String str) {
		switch (str) {
			case "ReachViaControlFlow":
				return ReachViaControlFlow;
			case "ReachDeadContinue":
				return ReachDeadContinue;
			case "ReachDeadMerge":
				return ReachDeadMerge;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static ReachReason valueByConstant(int constant) {
		switch (constant) {
			case Main.REACH_VIA_CONTROL_FLOW:
				return ReachViaControlFlow;
			case Main.REACH_DEAD_CONTINUE:
				return ReachDeadContinue;
			case Main.REACH_DEAD_MERGE:
				return ReachDeadMerge;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
