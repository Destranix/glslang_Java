package com.destranix.glslang;

public enum TBasicType {
	EbtVoid(Main.EBT_VOID),
	EbtFloat(Main.EBT_FLOAT),
	EbtDouble(Main.EBT_DOUBLE),
	EbtFloat16(Main.EBT_FLOAT_16),
    EbtInt8(Main.EBT_INT8),
    EbtUint8(Main.EBT_UINT8),
    EbtInt16(Main.EBT_INT16),
    EbtUint16(Main.EBT_UINT16),
    EbtInt(Main.EBT_INT),
    EbtUint(Main.EBT_UINT),
    EbtInt64(Main.EBT_INT64),
    EbtUint64(Main.EBT_UINT64),
    EbtBool(Main.EBT_BOOL),
    EbtAtomicUint(Main.EBT_ATOMIC_UINT),
    EbtSampler(Main.EBT_SAMPLER),
    EbtStruct(Main.EBT_STRUCT),
    EbtBlock(Main.EBT_BLOCK),
    EbtAccStruct(Main.EBT_ACC_STRUCT),
    EbtReference(Main.EBT_REFERENCE),
    EbtRayQuery(Main.EBT_RAY_QUERY),
    EbtString(Main.EBT_STRING);

	private final int value;

	private TBasicType(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TBasicType valueByStr(String str) {
		switch (str) {
			case "EbtVoid":
				return EbtVoid;
			case "EbtFloat":
				return EbtFloat;
			case "EbtDouble":
				return EbtDouble;
			case "EbtFloat16":
				return EbtFloat16;
			case "EbtInt8":
				return EbtInt8;
			case "EbtUint8":
				return EbtUint8;
			case "EbtInt16":
				return EbtInt16;
			case "EbtUint16":
				return EbtUint16;
			case "EbtInt":
				return EbtInt;
			case "EbtUint":
				return EbtUint;
			case "EbtInt64":
				return EbtInt64;
			case "EbtUint64":
				return EbtUint64;
			case "EbtBool":
				return EbtBool;
			case "EbtAtomicUint":
				return EbtAtomicUint;
			case "EbtSampler":
				return EbtSampler;
			case "EbtStruct":
				return EbtStruct;
			case "EbtBlock":
				return EbtBlock;
			case "EbtAccStruct":
				return EbtAccStruct;
			case "EbtReference":
				return EbtReference;
			case "EbtRayQuery":
				return EbtRayQuery;
			case "EbtString":
				return EbtString;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TBasicType valueByConstant(int constant) {
		switch (constant) {
			case Main.EBT_VOID:
				return EbtVoid;
			case Main.EBT_FLOAT:
				return EbtFloat;
			case Main.EBT_DOUBLE:
				return EbtDouble;
			case Main.EBT_FLOAT_16:
				return EbtFloat16;
			case Main.EBT_INT8:
				return EbtInt8;
			case Main.EBT_UINT8:
				return EbtUint8;
			case Main.EBT_INT16:
				return EbtInt16;
			case Main.EBT_UINT16:
				return EbtUint16;
			case Main.EBT_INT:
				return EbtInt;
			case Main.EBT_UINT:
				return EbtUint;
			case Main.EBT_INT64:
				return EbtInt64;
			case Main.EBT_UINT64:
				return EbtUint64;
			case Main.EBT_BOOL:
				return EbtBool;
			case Main.EBT_ATOMIC_UINT:
				return EbtAtomicUint;
			case Main.EBT_SAMPLER:
				return EbtSampler;
			case Main.EBT_STRUCT:
				return EbtStruct;
			case Main.EBT_BLOCK:
				return EbtBlock;
			case Main.EBT_ACC_STRUCT:
				return EbtAccStruct;
			case Main.EBT_REFERENCE:
				return EbtReference;
			case Main.EBT_RAY_QUERY:
				return EbtRayQuery;
			case Main.EBT_STRING:
				return EbtString;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
