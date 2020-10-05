package com.destranix.glslang;

public enum OperandClass {
	OperandNone(Main.OPERAND_NONE),
	OperandId(Main.OPERAND_ID),
	OperandVariableIds(Main.OPERAND_VARIABLE_IDS),
	OperandOptionalLiteral(Main.OPERAND_OPTIONAL_LITERAL),
	OperandOptionalLiteralString(Main.OPERAND_OPTIONAL_LITERAL_STRING),
	OperandVariableLiterals(Main.OPERAND_VARIABLE_LITERALS),
	OperandVariableIdLiteral(Main.OPERAND_VARIABLE_ID_LITERAL),
	OperandVariableLiteralId(Main.OPERAND_VARIABLE_LITERAL_ID),
	OperandLiteralNumber(Main.OPERAND_LITERAL_NUMBER),
	OperandLiteralString(Main.OPERAND_LITERAL_STRING),
	OperandVariableLiteralStrings(Main.OPERAND_VARIABLE_LITERAL_STRINGS),
	OperandSource(Main.OPERAND_SOURCE),
	OperandExecutionModel(Main.OPERAND_EXECUTION_MODEL),
	OperandAddressing(Main.OPERAND_ADDRESSING),
	OperandMemory(Main.OPERAND_MEMORY),
	OperandExecutionMode(Main.OPERAND_EXECUTION_MODE),
	OperandStorage(Main.OPERAND_STORAGE),
	OperandDimensionality(Main.OPERAND_DIMENSIONALITY),
	OperandSamplerAddressingMode(Main.OPERAND_SAMPLER_ADDRESSING_MODE),
	OperandSamplerFilterMode(Main.OPERAND_SAMPLER_FILTER_MODE),
	OperandSamplerImageFormat(Main.OPERAND_SAMPLER_IMAGE_FORMAT),
	OperandImageChannelOrder(Main.OPERAND_IMAGE_CHANNEL_ORDER),
	OperandImageChannelDataType(Main.OPERAND_IMAGE_CHANNEL_DATA_TYPE),
	Operands(Main.OPERAND_IMAGE_OPERANDS),
	OperandFPFastMath(Main.OPERAND_FP_FAST_MATH),
	OperandFPRoundingMode(Main.OPERAND_FP_ROUNDING_MODE),
	OperandLinkageType(Main.OPERAND_LINKAGE_TYPE),
	OperandAccessQualifier(Main.OPERAND_ACCESS_QUALIFIER),
	OperandFuncParamAttr(Main.OPERAND_FUNC_PARAM_ATTR),
	OperandDecoration(Main.OPERAND_DECORATION),
	OperandBuiltIn(Main.OPERAND_BUILT_IN),
	OperandSelect(Main.OPERAND_SELECT),
	OperandLoop(Main.OPERAND_LOOP),
	OperandFunction(Main.OPERAND_FUNCTION),
	OperandMemorySemantics(Main.OPERAND_MEMORY_SEMANTICS),
	OperandMemoryAccess(Main.OPERAND_MEMORY_ACCESS),
	OperandScope(Main.OPERAND_SCOPE),
	OperandGroupOperation(Main.OPERAND_GROUP_OPERATION),
	OperandKernelEnqueueFlags(Main.OPERAND_KERNEL_ENQUEUE_FLAGS),
	OperandKernelProfilingInfo(Main.OPERAND_KERNEL_PROFILING_INFO),
	OperandCapability(Main.OPERAND_CAPABILITY),
	OperandOpcode(Main.OPERAND_OPCODE);

	private final int value;

	private OperandClass(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static OperandClass valueByStr(String str) {
		switch (str) {
			case "OperandNone":
				return OperandNone;
			case "OperandId":
				return OperandId;
			case "OperandVariableIds":
				return OperandVariableIds;
			case "OperandOptionalLiteral":
				return OperandOptionalLiteral;
			case "OperandOptionalLiteralString":
				return OperandOptionalLiteralString;
			case "OperandVariableLiterals":
				return OperandVariableLiterals;
			case "OperandVariableIdLiteral":
				return OperandVariableIdLiteral;
			case "OperandVariableLiteralId":
				return OperandVariableLiteralId;
			case "OperandLiteralNumber":
				return OperandLiteralNumber;
			case "OperandLiteralString":
				return OperandLiteralString;
			case "OperandVariableLiteralStrings":
				return OperandVariableLiteralStrings;
			case "OperandSource":
				return OperandSource;
			case "OperandExecutionModel":
				return OperandExecutionModel;
			case "OperandAddressing":
				return OperandAddressing;
			case "OperandMemory":
				return OperandMemory;
			case "OperandExecutionMode":
				return OperandExecutionMode;
			case "OperandStorage":
				return OperandStorage;
			case "OperandDimensionality":
				return OperandDimensionality;
			case "OperandSamplerAddressingMode":
				return OperandSamplerAddressingMode;
			case "OperandSamplerFilterMode":
				return OperandSamplerFilterMode;
			case "OperandSamplerImageFormat":
				return OperandSamplerImageFormat;
			case "OperandImageChannelOrder":
				return OperandImageChannelOrder;
			case "OperandImageChannelDataType":
				return OperandImageChannelDataType;
			case "Operands":
				return Operands;
			case "OperandFPFastMath":
				return OperandFPFastMath;
			case "OperandFPRoundingMode":
				return OperandFPRoundingMode;
			case "OperandLinkageType":
				return OperandLinkageType;
			case "OperandAccessQualifier":
				return OperandAccessQualifier;
			case "OperandFuncParamAttr":
				return OperandFuncParamAttr;
			case "OperandDecoration":
				return OperandDecoration;
			case "OperandBuiltIn":
				return OperandBuiltIn;
			case "OperandSelect":
				return OperandSelect;
			case "OperandLoop":
				return OperandLoop;
			case "OperandFunction":
				return OperandFunction;
			case "OperandMemorySemantics":
				return OperandMemorySemantics;
			case "OperandMemoryAccess":
				return OperandMemoryAccess;
			case "OperandScope":
				return OperandScope;
			case "OperandGroupOperation":
				return OperandGroupOperation;
			case "OperandKernelEnqueueFlags":
				return OperandKernelEnqueueFlags;
			case "OperandKernelProfilingInfo":
				return OperandKernelProfilingInfo;
			case "OperandCapability":
				return OperandCapability;
			case "OperandOpcode":
				return OperandOpcode;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static OperandClass valueByConstant(int constant) {
		switch (constant) {
			case Main.OPERAND_NONE:
				return OperandNone;
			case Main.OPERAND_ID:
				return OperandId;
			case Main.OPERAND_VARIABLE_IDS:
				return OperandVariableIds;
			case Main.OPERAND_OPTIONAL_LITERAL:
				return OperandOptionalLiteral;
			case Main.OPERAND_OPTIONAL_LITERAL_STRING:
				return OperandOptionalLiteralString;
			case Main.OPERAND_VARIABLE_LITERALS:
				return OperandVariableLiterals;
			case Main.OPERAND_VARIABLE_ID_LITERAL:
				return OperandVariableIdLiteral;
			case Main.OPERAND_VARIABLE_LITERAL_ID:
				return OperandVariableLiteralId;
			case Main.OPERAND_LITERAL_NUMBER:
				return OperandLiteralNumber;
			case Main.OPERAND_LITERAL_STRING:
				return OperandLiteralString;
			case Main.OPERAND_VARIABLE_LITERAL_STRINGS:
				return OperandVariableLiteralStrings;
			case Main.OPERAND_SOURCE:
				return OperandSource;
			case Main.OPERAND_EXECUTION_MODEL:
				return OperandExecutionModel;
			case Main.OPERAND_ADDRESSING:
				return OperandAddressing;
			case Main.OPERAND_MEMORY:
				return OperandMemory;
			case Main.OPERAND_EXECUTION_MODE:
				return OperandExecutionMode;
			case Main.OPERAND_STORAGE:
				return OperandStorage;
			case Main.OPERAND_DIMENSIONALITY:
				return OperandDimensionality;
			case Main.OPERAND_SAMPLER_ADDRESSING_MODE:
				return OperandSamplerAddressingMode;
			case Main.OPERAND_SAMPLER_FILTER_MODE:
				return OperandSamplerFilterMode;
			case Main.OPERAND_SAMPLER_IMAGE_FORMAT:
				return OperandSamplerImageFormat;
			case Main.OPERAND_IMAGE_CHANNEL_ORDER:
				return OperandImageChannelOrder;
			case Main.OPERAND_IMAGE_CHANNEL_DATA_TYPE:
				return OperandImageChannelDataType;
			case Main.OPERAND_IMAGE_OPERANDS:
				return Operands;
			case Main.OPERAND_FP_FAST_MATH:
				return OperandFPFastMath;
			case Main.OPERAND_FP_ROUNDING_MODE:
				return OperandFPRoundingMode;
			case Main.OPERAND_LINKAGE_TYPE:
				return OperandLinkageType;
			case Main.OPERAND_ACCESS_QUALIFIER:
				return OperandAccessQualifier;
			case Main.OPERAND_FUNC_PARAM_ATTR:
				return OperandFuncParamAttr;
			case Main.OPERAND_DECORATION:
				return OperandDecoration;
			case Main.OPERAND_BUILT_IN:
				return OperandBuiltIn;
			case Main.OPERAND_SELECT:
				return OperandSelect;
			case Main.OPERAND_LOOP:
				return OperandLoop;
			case Main.OPERAND_FUNCTION:
				return OperandFunction;
			case Main.OPERAND_MEMORY_SEMANTICS:
				return OperandMemorySemantics;
			case Main.OPERAND_MEMORY_ACCESS:
				return OperandMemoryAccess;
			case Main.OPERAND_SCOPE:
				return OperandScope;
			case Main.OPERAND_GROUP_OPERATION:
				return OperandGroupOperation;
			case Main.OPERAND_KERNEL_ENQUEUE_FLAGS:
				return OperandKernelEnqueueFlags;
			case Main.OPERAND_KERNEL_PROFILING_INFO:
				return OperandKernelProfilingInfo;
			case Main.OPERAND_CAPABILITY:
				return OperandCapability;
			case Main.OPERAND_OPCODE:
				return OperandOpcode;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
