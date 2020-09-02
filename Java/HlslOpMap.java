package Java;

public class HlslOpMap {

	public static TOperator assignment(EHlslTokenClass op) {
		return TOperator.valueByConstant(Main.HlslOpMap_assignment(op));
	}

	public static TOperator binary(EHlslTokenClass op) {
		return TOperator.valueByConstant(Main.HlslOpMap_binary(op));
	}

	public static TOperator preUnary(EHlslTokenClass op) {
		return TOperator.valueByConstant(Main.HlslOpMap_preUnary(op));
	}

	public static TOperator postUnary(EHlslTokenClass op) {
		return TOperator.valueByConstant(Main.HlslOpMap_postUnary(op));
	}

	public static PrecedenceLevel precedenceLevel(EHlslTokenClass op) {
		return PrecedenceLevel.valueByConstant(Main.HlslOpMap_precedenceLevel(op));
	}

}
