package com.destranix.glslang;

import java.util.EnumSet;

public enum KernelProfilingInfoMask {
	KernelProfilingInfoMaskNone(Main.KERNEL_PROFILING_INFO_MASK_NONE),
	KernelProfilingInfoCmdExecTimeMask(Main.KERNEL_PROFILING_INFO_CMD_EXEC_TIME_MASK);

	private final int value;

	private KernelProfilingInfoMask(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static int setToInt(EnumSet<KernelProfilingInfoMask> set) {
		int ret = 0;
		for (KernelProfilingInfoMask val : set) {
			ret |= val.getConstant();
		}
		return ret;
	}

	public static KernelProfilingInfoMask valueByStr(String str) {
		switch (str) {
			case "KernelProfilingInfoMaskNone":
				return KernelProfilingInfoMaskNone;
			case "KernelProfilingInfoCmdExecTimeMask":
				return KernelProfilingInfoCmdExecTimeMask;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static KernelProfilingInfoMask valueByConstant(int constant) {
		switch (constant) {
			case Main.KERNEL_PROFILING_INFO_MASK_NONE:
				return KernelProfilingInfoMaskNone;
			case Main.KERNEL_PROFILING_INFO_CMD_EXEC_TIME_MASK:
				return KernelProfilingInfoCmdExecTimeMask;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
