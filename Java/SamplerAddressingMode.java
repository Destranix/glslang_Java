package Java;

public enum SamplerAddressingMode {
	SamplerAddressingModeNone(Main.SAMPLER_ADDRESSING_MODE_NONE),
	SamplerAddressingModeClampToEdge(Main.SAMPLER_ADDRESSING_MODE_CLAMP_TO_EDGE),
	SamplerAddressingModeClamp(Main.SAMPLER_ADDRESSING_MODE_CLAMP),
	SamplerAddressingModeRepeat(Main.SAMPLER_ADDRESSING_MODE_REPEAT),
	SamplerAddressingModeRepeatMirrored(Main.SAMPLER_ADDRESSING_MODE_REPEAT_MIRRORED),
	SamplerAddressingModeMax(Main.SAMPLER_ADDRESSING_MODE_MAX);

	private final int value;

	private SamplerAddressingMode(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static SamplerAddressingMode valueByStr(String str) {
		switch (str) {
			case "SamplerAddressingModeNone":
				return SamplerAddressingModeNone;
			case "SamplerAddressingModeClampToEdge":
				return SamplerAddressingModeClampToEdge;
			case "SamplerAddressingModeClamp":
				return SamplerAddressingModeClamp;
			case "SamplerAddressingModeRepeat":
				return SamplerAddressingModeRepeat;
			case "SamplerAddressingModeRepeatMirrored":
				return SamplerAddressingModeRepeatMirrored;
			case "SamplerAddressingModeMax":
				return SamplerAddressingModeMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static SamplerAddressingMode valueByConstant(int constant) {
		switch (constant) {
			case Main.SAMPLER_ADDRESSING_MODE_NONE:
				return SamplerAddressingModeNone;
			case Main.SAMPLER_ADDRESSING_MODE_CLAMP_TO_EDGE:
				return SamplerAddressingModeClampToEdge;
			case Main.SAMPLER_ADDRESSING_MODE_CLAMP:
				return SamplerAddressingModeClamp;
			case Main.SAMPLER_ADDRESSING_MODE_REPEAT:
				return SamplerAddressingModeRepeat;
			case Main.SAMPLER_ADDRESSING_MODE_REPEAT_MIRRORED:
				return SamplerAddressingModeRepeatMirrored;
			case Main.SAMPLER_ADDRESSING_MODE_MAX:
				return SamplerAddressingModeMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
