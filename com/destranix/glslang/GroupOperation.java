package com.destranix.glslang;

public enum GroupOperation {
	GroupOperationReduce(Main.GROUP_OPERATION_REDUCE),
	GroupOperationInclusiveScan(Main.GROUP_OPERATION_INCLUSIVE_SCAN),
	GroupOperationExclusiveScan(Main.GROUP_OPERATION_EXCLUSIVE_SCAN),
	GroupOperationClusteredReduce(Main.GROUP_OPERATION_CLUSTERED_REDUCE),
	GroupOperationPartitionedReduceNV(Main.GROUP_OPERATION_PARTITIONED_REDUCE_NV),
	GroupOperationPartitionedInclusiveScanNV(Main.GROUP_OPERATION_PARTITIONED_INCLUSIVE_SCAN_NV),
	GroupOperationPartitionedExclusiveScanNV(Main.GROUP_OPERATION_PARTITIONED_EXCLUSIVE_SCAN_NV),
	GroupOperationMax(Main.GROUP_OPERATION_MAX);

	private final int value;

	private GroupOperation(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static GroupOperation valueByStr(String str) {
		switch (str) {
			case "GroupOperationReduce":
				return GroupOperationReduce;
			case "GroupOperationInclusiveScan":
				return GroupOperationInclusiveScan;
			case "GroupOperationExclusiveScan":
				return GroupOperationExclusiveScan;
			case "GroupOperationClusteredReduce":
				return GroupOperationClusteredReduce;
			case "GroupOperationPartitionedReduceNV":
				return GroupOperationPartitionedReduceNV;
			case "GroupOperationPartitionedInclusiveScanNV":
				return GroupOperationPartitionedInclusiveScanNV;
			case "GroupOperationPartitionedExclusiveScanNV":
				return GroupOperationPartitionedExclusiveScanNV;
			case "GroupOperationMax":
				return GroupOperationMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static GroupOperation valueByConstant(int constant) {
		switch (constant) {
			case Main.GROUP_OPERATION_REDUCE:
				return GroupOperationReduce;
			case Main.GROUP_OPERATION_INCLUSIVE_SCAN:
				return GroupOperationInclusiveScan;
			case Main.GROUP_OPERATION_EXCLUSIVE_SCAN:
				return GroupOperationExclusiveScan;
			case Main.GROUP_OPERATION_CLUSTERED_REDUCE:
				return GroupOperationClusteredReduce;
			case Main.GROUP_OPERATION_PARTITIONED_REDUCE_NV:
				return GroupOperationPartitionedReduceNV;
			case Main.GROUP_OPERATION_PARTITIONED_INCLUSIVE_SCAN_NV:
				return GroupOperationPartitionedInclusiveScanNV;
			case Main.GROUP_OPERATION_PARTITIONED_EXCLUSIVE_SCAN_NV:
				return GroupOperationPartitionedExclusiveScanNV;
			case Main.GROUP_OPERATION_MAX:
				return GroupOperationMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
