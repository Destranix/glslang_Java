package Java;

public enum KernelEnqueueFlags {
	KernelEnqueueFlagsNoWait(Main.KERNEL_ENQUEUE_FLAGS_NO_WAIT),
	KernelEnqueueFlagsWaitKernel(Main.KERNEL_ENQUEUE_FLAGS_WAIT_KERNEL),
	KernelEnqueueFlagsWaitWorkGroup(Main.KERNEL_ENQUEUE_FLAGS_WAIT_WORK_GROUP),
	KernelEnqueueFlagsMax(Main.KERNEL_ENQUEUE_FLAGS_MAX);

	private final int value;

	private KernelEnqueueFlags(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static KernelEnqueueFlags valueByStr(String str) {
		switch (str) {
			case "KernelEnqueueFlagsNoWait":
				return KernelEnqueueFlagsNoWait;
			case "KernelEnqueueFlagsWaitKernel":
				return KernelEnqueueFlagsWaitKernel;
			case "KernelEnqueueFlagsWaitWorkGroup":
				return KernelEnqueueFlagsWaitWorkGroup;
			case "KernelEnqueueFlagsMax":
				return KernelEnqueueFlagsMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static KernelEnqueueFlags valueByConstant(int constant) {
		switch (constant) {
			case Main.KERNEL_ENQUEUE_FLAGS_NO_WAIT:
				return KernelEnqueueFlagsNoWait;
			case Main.KERNEL_ENQUEUE_FLAGS_WAIT_KERNEL:
				return KernelEnqueueFlagsWaitKernel;
			case Main.KERNEL_ENQUEUE_FLAGS_WAIT_WORK_GROUP:
				return KernelEnqueueFlagsWaitWorkGroup;
			case Main.KERNEL_ENQUEUE_FLAGS_MAX:
				return KernelEnqueueFlagsMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
