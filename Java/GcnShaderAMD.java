package Java;

public enum GcnShaderAMD {
	GcnShaderBadAMD(Main.GCN_SHADER_BAD_AMD),
	CubeFaceIndexAMD(Main.CUBE_FACE_INDEX_AMD),
	CubeFaceCoordAMD(Main.CUBE_FACE_COORD_AMD),
	TimeAMD(Main.TIME_AMD);

	private final int value;

	private GcnShaderAMD(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static GcnShaderAMD valueByStr(String str) {
		switch (str) {
			case "GcnShaderBadAMD":
				return GcnShaderBadAMD;
			case "CubeFaceIndexAMD":
				return CubeFaceIndexAMD;
			case "CubeFaceCoordAMD":
				return CubeFaceCoordAMD;
			case "TimeAMD":
				return TimeAMD;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static GcnShaderAMD valueByConstant(int constant) {
		switch (constant) {
			case Main.GCN_SHADER_BAD_AMD:
				return GcnShaderBadAMD;
			case Main.CUBE_FACE_INDEX_AMD:
				return CubeFaceIndexAMD;
			case Main.CUBE_FACE_COORD_AMD:
				return CubeFaceCoordAMD;
			case Main.TIME_AMD:
				return TimeAMD;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
