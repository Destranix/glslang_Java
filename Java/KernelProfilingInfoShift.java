package Java;

public enum KernelProfilingInfoShift {
	KernelProfilingInfoCmdExecTimeShift(Main.KERNEL_PROFILING_INFO_CMD_EXEC_TIME_SHIFT),
	KernelProfilingInfoMax(Main.KERNEL_PROFILING_INFO_MAX);

	private final int value;

	private KernelProfilingInfoShift(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static KernelProfilingInfoShift valueByStr(String str) {
		switch (str) {
			case "KernelProfilingInfoCmdExecTimeShift":
				return KernelProfilingInfoCmdExecTimeShift;
			case "KernelProfilingInfoMax":
				return KernelProfilingInfoMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static KernelProfilingInfoShift valueByConstant(int constant) {
		switch (constant) {
			case Main.KERNEL_PROFILING_INFO_CMD_EXEC_TIME_SHIFT:
				return KernelProfilingInfoCmdExecTimeShift;
			case Main.KERNEL_PROFILING_INFO_MAX:
				return KernelProfilingInfoMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
