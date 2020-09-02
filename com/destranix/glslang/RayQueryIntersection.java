package com.destranix.glslang;

public enum RayQueryIntersection {
	RayQueryIntersectionRayQueryCandidateIntersectionKHR(
			Main.RAY_QUERY_INTERSECTION_RAY_QUERY_CANDIDATE_INTERSECTION_KHR),
	RayQueryIntersectionRayQueryCommittedIntersectionKHR(
			Main.RAY_QUERY_INTERSECTION_RAY_QUERY_COMMITTED_INTERSECTION_KHR),
	RayQueryIntersectionMax(Main.RAY_QUERY_INTERSECTION_MAX);

	private final int value;

	private RayQueryIntersection(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static RayQueryIntersection valueByStr(String str) {
		switch (str) {
			case "RayQueryIntersectionRayQueryCandidateIntersectionKHR":
				return RayQueryIntersectionRayQueryCandidateIntersectionKHR;
			case "RayQueryIntersectionRayQueryCommittedIntersectionKHR":
				return RayQueryIntersectionRayQueryCommittedIntersectionKHR;
			case "RayQueryIntersectionMax":
				return RayQueryIntersectionMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static RayQueryIntersection valueByConstant(int constant) {
		switch (constant) {
			case Main.RAY_QUERY_INTERSECTION_RAY_QUERY_CANDIDATE_INTERSECTION_KHR:
				return RayQueryIntersectionRayQueryCandidateIntersectionKHR;
			case Main.RAY_QUERY_INTERSECTION_RAY_QUERY_COMMITTED_INTERSECTION_KHR:
				return RayQueryIntersectionRayQueryCommittedIntersectionKHR;
			case Main.RAY_QUERY_INTERSECTION_MAX:
				return RayQueryIntersectionMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
