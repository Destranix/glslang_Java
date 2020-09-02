package Java;

public enum Dim {
	Dim1D(Main.DIM_1D),
	Dim2D(Main.DIM_2D),
	Dim3D(Main.DIM_3D),
	DimCube(Main.DIM_CUBE),
	DimRect(Main.DIM_RECT),
	DimBuffer(Main.DIM_BUFFER),
	DimSubpassData(Main.DIM_SUBPASS_DATA),
	DimMax(Main.DIM_MAX);

	private final int value;

	private Dim(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static Dim valueByStr(String str) {
		switch (str) {
			case "Dim1D":
				return Dim1D;
			case "Dim2D":
				return Dim2D;
			case "Dim3D":
				return Dim3D;
			case "DimCube":
				return DimCube;
			case "DimRect":
				return DimRect;
			case "DimBuffer":
				return DimBuffer;
			case "DimSubpassData":
				return DimSubpassData;
			case "DimMax":
				return DimMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static Dim valueByConstant(int constant) {
		switch (constant) {
			case Main.DIM_1D:
				return Dim1D;
			case Main.DIM_2D:
				return Dim2D;
			case Main.DIM_3D:
				return Dim3D;
			case Main.DIM_CUBE:
				return DimCube;
			case Main.DIM_RECT:
				return DimRect;
			case Main.DIM_BUFFER:
				return DimBuffer;
			case Main.DIM_SUBPASS_DATA:
				return DimSubpassData;
			case Main.DIM_MAX:
				return DimMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
