package com.destranix.glslang;

public enum OpcodeClass {
	OpClassMisc(Main.OP_CLASS_MISC),
	OpClassDebug(Main.OP_CLASS_DEBUG),
	OpClassAnnotate(Main.OP_CLASS_ANNOTATE),
	OpClassExtension(Main.OP_CLASS_EXTENSION),
	OpClassMode(Main.OP_CLASS_MODE),
	OpClassType(Main.OP_CLASS_TYPE),
	OpClassConstant(Main.OP_CLASS_CONSTANT),
	OpClassMemory(Main.OP_CLASS_MEMORY),
	OpClassFunction(Main.OP_CLASS_FUNCTION),
	OpClassImage(Main.OP_CLASS_IMAGE),
	OpClassConvert(Main.OP_CLASS_CONVERT),
	OpClassComposite(Main.OP_CLASS_COMPOSITE),
	OpClassArithmetic(Main.OP_CLASS_ARITHMETIC),
	OpClassBit(Main.OP_CLASS_BIT),
	OpClassRelationalLogical(Main.OP_CLASS_RELATIONAL_LOGICAL),
	OpClassDerivative(Main.OP_CLASS_DERIVATIVE),
	OpClassFlowControl(Main.OP_CLASS_FLOW_CONTROL),
	OpClassAtomic(Main.OP_CLASS_ATOMIC),
	OpClassPrimitive(Main.OP_CLASS_PRIMITIVE),
	OpClassBarrier(Main.OP_CLASS_BARRIER),
	OpClassGroup(Main.OP_CLASS_GROUP),
	OpClassDeviceSideEnqueue(Main.OP_CLASS_DEVICE_SIDE_ENQUEUE),
	OpClassPipe(Main.OP_CLASS_PIPE),
	OpClassCount(Main.OP_CLASS_COUNT),
	OpClassMissing(Main.OP_CLASS_MISSING);

	private final int value;

	private OpcodeClass(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static OpcodeClass valueByStr(String str) {
		switch (str) {
			case "OpClassMisc":
				return OpClassMisc;
			case "OpClassDebug":
				return OpClassDebug;
			case "OpClassAnnotate":
				return OpClassAnnotate;
			case "OpClassExtension":
				return OpClassExtension;
			case "OpClassMode":
				return OpClassMode;
			case "OpClassType":
				return OpClassType;
			case "OpClassConstant":
				return OpClassConstant;
			case "OpClassMemory":
				return OpClassMemory;
			case "OpClassFunction":
				return OpClassFunction;
			case "OpClassImage":
				return OpClassImage;
			case "OpClassConvert":
				return OpClassConvert;
			case "OpClassComposite":
				return OpClassComposite;
			case "OpClassArithmetic":
				return OpClassArithmetic;
			case "OpClassBit":
				return OpClassBit;
			case "OpClassRelationalLogical":
				return OpClassRelationalLogical;
			case "OpClassDerivative":
				return OpClassDerivative;
			case "OpClassFlowControl":
				return OpClassFlowControl;
			case "OpClassAtomic":
				return OpClassAtomic;
			case "OpClassPrimitive":
				return OpClassPrimitive;
			case "OpClassBarrier":
				return OpClassBarrier;
			case "OpClassGroup":
				return OpClassGroup;
			case "OpClassDeviceSideEnqueue":
				return OpClassDeviceSideEnqueue;
			case "OpClassPipe":
				return OpClassPipe;
			case "OpClassCount":
				return OpClassCount;
			case "OpClassMissing":
				return OpClassMissing;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static OpcodeClass valueByConstant(int constant) {
		switch (constant) {
			case Main.OP_CLASS_MISC:
				return OpClassMisc;
			case Main.OP_CLASS_DEBUG:
				return OpClassDebug;
			case Main.OP_CLASS_ANNOTATE:
				return OpClassAnnotate;
			case Main.OP_CLASS_EXTENSION:
				return OpClassExtension;
			case Main.OP_CLASS_MODE:
				return OpClassMode;
			case Main.OP_CLASS_TYPE:
				return OpClassType;
			case Main.OP_CLASS_CONSTANT:
				return OpClassConstant;
			case Main.OP_CLASS_MEMORY:
				return OpClassMemory;
			case Main.OP_CLASS_FUNCTION:
				return OpClassFunction;
			case Main.OP_CLASS_IMAGE:
				return OpClassImage;
			case Main.OP_CLASS_CONVERT:
				return OpClassConvert;
			case Main.OP_CLASS_COMPOSITE:
				return OpClassComposite;
			case Main.OP_CLASS_ARITHMETIC:
				return OpClassArithmetic;
			case Main.OP_CLASS_BIT:
				return OpClassBit;
			case Main.OP_CLASS_RELATIONAL_LOGICAL:
				return OpClassRelationalLogical;
			case Main.OP_CLASS_DERIVATIVE:
				return OpClassDerivative;
			case Main.OP_CLASS_FLOW_CONTROL:
				return OpClassFlowControl;
			case Main.OP_CLASS_ATOMIC:
				return OpClassAtomic;
			case Main.OP_CLASS_PRIMITIVE:
				return OpClassPrimitive;
			case Main.OP_CLASS_BARRIER:
				return OpClassBarrier;
			case Main.OP_CLASS_GROUP:
				return OpClassGroup;
			case Main.OP_CLASS_DEVICE_SIDE_ENQUEUE:
				return OpClassDeviceSideEnqueue;
			case Main.OP_CLASS_PIPE:
				return OpClassPipe;
			case Main.OP_CLASS_COUNT:
				return OpClassCount;
			case Main.OP_CLASS_MISSING:
				return OpClassMissing;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
