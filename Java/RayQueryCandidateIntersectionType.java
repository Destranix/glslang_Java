package Java;

public enum RayQueryCandidateIntersectionType {
	RayQueryCandidateIntersectionTypeRayQueryCandidateIntersectionTriangleKHR(
			Main.RAY_QUERY_CANDIDATE_INTERSECTION_TYPE_RAY_QUERY_CANDIDATE_INTERSECTION_TRIANGLE_KHR),
	RayQueryCandidateIntersectionTypeRayQueryCandidateIntersectionAABBKHR(
			Main.RAY_QUERY_CANDIDATE_INTERSECTION_TYPE_RAY_QUERY_CANDIDATE_INTERSECTION_AABB_KHR),
	RayQueryCandidateIntersectionTypeMax(Main.RAY_QUERY_CANDIDATE_INTERSECTION_TYPE_MAX);

	private final int value;

	private RayQueryCandidateIntersectionType(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static RayQueryCandidateIntersectionType valueByStr(String str) {
		switch (str) {
			case "RayQueryCandidateIntersectionTypeRayQueryCandidateIntersectionTriangleKHR":
				return RayQueryCandidateIntersectionTypeRayQueryCandidateIntersectionTriangleKHR;
			case "RayQueryCandidateIntersectionTypeRayQueryCandidateIntersectionAABBKHR":
				return RayQueryCandidateIntersectionTypeRayQueryCandidateIntersectionAABBKHR;
			case "RayQueryCandidateIntersectionTypeMax":
				return RayQueryCandidateIntersectionTypeMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static RayQueryCandidateIntersectionType valueByConstant(int constant) {
		switch (constant) {
			case Main.RAY_QUERY_CANDIDATE_INTERSECTION_TYPE_RAY_QUERY_CANDIDATE_INTERSECTION_TRIANGLE_KHR:
				return RayQueryCandidateIntersectionTypeRayQueryCandidateIntersectionTriangleKHR;
			case Main.RAY_QUERY_CANDIDATE_INTERSECTION_TYPE_RAY_QUERY_CANDIDATE_INTERSECTION_AABB_KHR:
				return RayQueryCandidateIntersectionTypeRayQueryCandidateIntersectionAABBKHR;
			case Main.RAY_QUERY_CANDIDATE_INTERSECTION_TYPE_MAX:
				return RayQueryCandidateIntersectionTypeMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
