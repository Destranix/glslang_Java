package Java;

public enum StorageClass {
	StorageClassUniformConstant(Main.STORAGE_CLASS_UNIFORM_CONSTANT),
	StorageClassInput(Main.STORAGE_CLASS_INPUT),
	StorageClassUniform(Main.STORAGE_CLASS_UNIFORM),
	StorageClassOutput(Main.STORAGE_CLASS_OUTPUT),
	StorageClassWorkgroup(Main.STORAGE_CLASS_WORKGROUP),
	StorageClassCrossWorkgroup(Main.STORAGE_CLASS_CROSS_WORKGROUP),
	StorageClassPrivate(Main.STORAGE_CLASS_PRIVATE),
	StorageClassFunction(Main.STORAGE_CLASS_FUNCTION),
	StorageClassGeneric(Main.STORAGE_CLASS_GENERIC),
	StorageClassPushConstant(Main.STORAGE_CLASS_PUSH_CONSTANT),
	StorageClassAtomicCounter(Main.STORAGE_CLASS_ATOMIC_COUNTER),
	StorageClassImage(Main.STORAGE_CLASS_IMAGE),
	StorageClassStorageBuffer(Main.STORAGE_CLASS_STORAGE_BUFFER),
	StorageClassCallableDataKHR(Main.STORAGE_CLASS_CALLABLE_DATA_KHR),
	StorageClassCallableDataNV(Main.STORAGE_CLASS_CALLABLE_DATA_NV),
	StorageClassIncomingCallableDataKHR(Main.STORAGE_CLASS_INCOMING_CALLABLE_DATA_KHR),
	StorageClassIncomingCallableDataNV(Main.STORAGE_CLASS_INCOMING_CALLABLE_DATA_NV),
	StorageClassRayPayloadKHR(Main.STORAGE_CLASS_RAY_PAYLOAD_KHR),
	StorageClassRayPayloadNV(Main.STORAGE_CLASS_RAY_PAYLOAD_NV),
	StorageClassHitAttributeKHR(Main.STORAGE_CLASS_HIT_ATTRIBUTE_KHR),
	StorageClassHitAttributeNV(Main.STORAGE_CLASS_HIT_ATTRIBUTE_NV),
	StorageClassIncomingRayPayloadKHR(Main.STORAGE_CLASS_INCOMING_RAY_PAYLOAD_KHR),
	StorageClassIncomingRayPayloadNV(Main.STORAGE_CLASS_INCOMING_RAY_PAYLOAD_NV),
	StorageClassShaderRecordBufferKHR(Main.STORAGE_CLASS_SHADER_RECORD_BUFFER_KHR),
	StorageClassShaderRecordBufferNV(Main.STORAGE_CLASS_SHADER_RECORD_BUFFER_NV),
	StorageClassPhysicalStorageBuffer(Main.STORAGE_CLASS_PHYSICAL_STORAGE_BUFFER),
	StorageClassPhysicalStorageBufferEXT(Main.STORAGE_CLASS_PHYSICAL_STORAGE_BUFFER_EXT),
	StorageClassCodeSectionINTEL(Main.STORAGE_CLASS_CODE_SECTION_INTEL),
	StorageClassMax(Main.STORAGE_CLASS_MAX);

	private final int value;

	private StorageClass(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static StorageClass valueByStr(String str) {
		switch (str) {
			case "StorageClassUniformConstant":
				return StorageClassUniformConstant;
			case "StorageClassInput":
				return StorageClassInput;
			case "StorageClassUniform":
				return StorageClassUniform;
			case "StorageClassOutput":
				return StorageClassOutput;
			case "StorageClassWorkgroup":
				return StorageClassWorkgroup;
			case "StorageClassCrossWorkgroup":
				return StorageClassCrossWorkgroup;
			case "StorageClassPrivate":
				return StorageClassPrivate;
			case "StorageClassFunction":
				return StorageClassFunction;
			case "StorageClassGeneric":
				return StorageClassGeneric;
			case "StorageClassPushConstant":
				return StorageClassPushConstant;
			case "StorageClassAtomicCounter":
				return StorageClassAtomicCounter;
			case "StorageClassImage":
				return StorageClassImage;
			case "StorageClassStorageBuffer":
				return StorageClassStorageBuffer;
			case "StorageClassCallableDataKHR":
				return StorageClassCallableDataKHR;
			case "StorageClassCallableDataNV":
				return StorageClassCallableDataNV;
			case "StorageClassIncomingCallableDataKHR":
				return StorageClassIncomingCallableDataKHR;
			case "StorageClassIncomingCallableDataNV":
				return StorageClassIncomingCallableDataNV;
			case "StorageClassRayPayloadKHR":
				return StorageClassRayPayloadKHR;
			case "StorageClassRayPayloadNV":
				return StorageClassRayPayloadNV;
			case "StorageClassHitAttributeKHR":
				return StorageClassHitAttributeKHR;
			case "StorageClassHitAttributeNV":
				return StorageClassHitAttributeNV;
			case "StorageClassIncomingRayPayloadKHR":
				return StorageClassIncomingRayPayloadKHR;
			case "StorageClassIncomingRayPayloadNV":
				return StorageClassIncomingRayPayloadNV;
			case "StorageClassShaderRecordBufferKHR":
				return StorageClassShaderRecordBufferKHR;
			case "StorageClassShaderRecordBufferNV":
				return StorageClassShaderRecordBufferNV;
			case "StorageClassPhysicalStorageBuffer":
				return StorageClassPhysicalStorageBuffer;
			case "StorageClassPhysicalStorageBufferEXT":
				return StorageClassPhysicalStorageBufferEXT;
			case "StorageClassCodeSectionINTEL":
				return StorageClassCodeSectionINTEL;
			case "StorageClassMax":
				return StorageClassMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static StorageClass valueByConstant(int constant) {
		switch (constant) {
			case Main.STORAGE_CLASS_UNIFORM_CONSTANT:
				return StorageClassUniformConstant;
			case Main.STORAGE_CLASS_INPUT:
				return StorageClassInput;
			case Main.STORAGE_CLASS_UNIFORM:
				return StorageClassUniform;
			case Main.STORAGE_CLASS_OUTPUT:
				return StorageClassOutput;
			case Main.STORAGE_CLASS_WORKGROUP:
				return StorageClassWorkgroup;
			case Main.STORAGE_CLASS_CROSS_WORKGROUP:
				return StorageClassCrossWorkgroup;
			case Main.STORAGE_CLASS_PRIVATE:
				return StorageClassPrivate;
			case Main.STORAGE_CLASS_FUNCTION:
				return StorageClassFunction;
			case Main.STORAGE_CLASS_GENERIC:
				return StorageClassGeneric;
			case Main.STORAGE_CLASS_PUSH_CONSTANT:
				return StorageClassPushConstant;
			case Main.STORAGE_CLASS_ATOMIC_COUNTER:
				return StorageClassAtomicCounter;
			case Main.STORAGE_CLASS_IMAGE:
				return StorageClassImage;
			case Main.STORAGE_CLASS_STORAGE_BUFFER:
				return StorageClassStorageBuffer;
			case Main.STORAGE_CLASS_CALLABLE_DATA_KHR:
				return StorageClassCallableDataKHR;
			case Main.STORAGE_CLASS_INCOMING_CALLABLE_DATA_KHR:
				return StorageClassIncomingCallableDataKHR;
			case Main.STORAGE_CLASS_RAY_PAYLOAD_KHR:
				return StorageClassRayPayloadKHR;
			case Main.STORAGE_CLASS_HIT_ATTRIBUTE_KHR:
				return StorageClassHitAttributeKHR;
			case Main.STORAGE_CLASS_INCOMING_RAY_PAYLOAD_KHR:
				return StorageClassIncomingRayPayloadKHR;
			case Main.STORAGE_CLASS_SHADER_RECORD_BUFFER_KHR:
				return StorageClassShaderRecordBufferKHR;
			case Main.STORAGE_CLASS_PHYSICAL_STORAGE_BUFFER:
				return StorageClassPhysicalStorageBuffer;
			case Main.STORAGE_CLASS_CODE_SECTION_INTEL:
				return StorageClassCodeSectionINTEL;
			case Main.STORAGE_CLASS_MAX:
				return StorageClassMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
