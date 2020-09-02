package Java;

public enum RayQueryCommittedIntersectionType {
	RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionNoneKHR(
			Main.RAY_QUERY_COMMITTED_INTERSECTION_TYPE_RAY_QUERY_COMMITTED_INTERSECTION_NONE_KHR),
	RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionTriangleKHR(
			Main.RAY_QUERY_COMMITTED_INTERSECTION_TYPE_RAY_QUERY_COMMITTED_INTERSECTION_TRIANGLE_KHR),
	RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionGeneratedKHR(
			Main.RAY_QUERY_COMMITTED_INTERSECTION_TYPE_RAY_QUERY_COMMITTED_INTERSECTION_GENERATED_KHR),
	RayQueryCommittedIntersectionTypeMax(Main.RAY_QUERY_COMMITTED_INTERSECTION_TYPE_MAX);

	private final int value;

	private RayQueryCommittedIntersectionType(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static RayQueryCommittedIntersectionType valueByStr(String str) {
		switch (str) {
			case "RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionNoneKHR":
				return RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionNoneKHR;
			case "RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionTriangleKHR":
				return RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionTriangleKHR;
			case "RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionGeneratedKHR":
				return RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionGeneratedKHR;
			case "RayQueryCommittedIntersectionTypeMax":
				return RayQueryCommittedIntersectionTypeMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static RayQueryCommittedIntersectionType valueByConstant(int constant) {
		switch (constant) {
			case Main.RAY_QUERY_COMMITTED_INTERSECTION_TYPE_RAY_QUERY_COMMITTED_INTERSECTION_NONE_KHR:
				return RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionNoneKHR;
			case Main.RAY_QUERY_COMMITTED_INTERSECTION_TYPE_RAY_QUERY_COMMITTED_INTERSECTION_TRIANGLE_KHR:
				return RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionTriangleKHR;
			case Main.RAY_QUERY_COMMITTED_INTERSECTION_TYPE_RAY_QUERY_COMMITTED_INTERSECTION_GENERATED_KHR:
				return RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionGeneratedKHR;
			case Main.RAY_QUERY_COMMITTED_INTERSECTION_TYPE_MAX:
				return RayQueryCommittedIntersectionTypeMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
