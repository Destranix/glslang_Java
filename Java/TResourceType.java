package Java;

public enum TResourceType {
	EResSampler(Main.E_RES_SAMPLER),
	EResTexture(Main.E_RES_TEXTURE),
	EResImage(Main.E_RES_IMAGE),
	EResUbo(Main.E_RES_UBO),
	EResSsbo(Main.E_RES_SSBO),
	EResUav(Main.E_RES_UAV);

	private final int value;

	private TResourceType(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TResourceType valueByStr(String str) {
		switch (str) {
			case "EResSampler":
				return EResSampler;
			case "EResTexture":
				return EResTexture;
			case "EResImage":
				return EResImage;
			case "EResUbo":
				return EResUbo;
			case "EResSsbo":
				return EResSsbo;
			case "EResUav":
				return EResUav;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TResourceType valueByConstant(int constant) {
		switch (constant) {
			case Main.E_RES_SAMPLER:
				return EResSampler;
			case Main.E_RES_TEXTURE:
				return EResTexture;
			case Main.E_RES_IMAGE:
				return EResImage;
			case Main.E_RES_UBO:
				return EResUbo;
			case Main.E_RES_SSBO:
				return EResSsbo;
			case Main.E_RES_UAV:
				return EResUav;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
