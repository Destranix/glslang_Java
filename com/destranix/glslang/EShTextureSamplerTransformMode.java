package com.destranix.glslang;

public enum EShTextureSamplerTransformMode {
	EShTexSampTransKeep(Main.E_SH_TES_SAMP_TRANS_KEEP),
	EShTexSampTransUpgradeTextureRemoveSampler(Main.E_SH_TEX_SAMP_TRANS_UPGRADE_TEXTURE_REMOVE_SAMPLER);

	private final int value;

	private EShTextureSamplerTransformMode(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static EShTextureSamplerTransformMode valueByStr(String str) {
		switch (str) {
			case "EShTexSampTransKeep":
				return EShTexSampTransKeep;
			case "EShTexSampTransUpgradeTextureRemoveSampler":
				return EShTexSampTransUpgradeTextureRemoveSampler;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static EShTextureSamplerTransformMode valueByConstant(int constant) {
		switch (constant) {
			case Main.E_SH_TES_SAMP_TRANS_KEEP:
				return EShTexSampTransKeep;
			case Main.E_SH_TEX_SAMP_TRANS_UPGRADE_TEXTURE_REMOVE_SAMPLER:
				return EShTexSampTransUpgradeTextureRemoveSampler;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
