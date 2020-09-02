package Java;

public enum BuiltIn {
	BuiltInPosition(Main.BUILT_IN_POSITION),
	BuiltInPointSize(Main.BUILT_IN_POINT_SIZE),
	BuiltInClipDistance(Main.BUILT_IN_CLIP_DISTANCE),
	BuiltInCullDistance(Main.BUILT_IN_CULL_DISTANCE),
	BuiltInVertexId(Main.BUILT_IN_VERTEX_ID),
	BuiltInInstanceId(Main.BUILT_IN_INSTANCE_ID),
	BuiltInPrimitiveId(Main.BUILT_IN_PRIMITIVE_ID),
	BuiltInInvocationId(Main.BUILT_IN_INVOCATION_ID),
	BuiltInLayer(Main.BUILT_IN_LAYER),
	BuiltInViewportIndex(Main.BUILT_IN_VIEWPORT_INDEX),
	BuiltInTessLevelOuter(Main.BUILT_IN_TESS_LEVEL_OUTER),
	BuiltInTessLevelInner(Main.BUILT_IN_TESS_LEVEL_INNER),
	BuiltInTessCoord(Main.BUILT_IN_TESS_COORD),
	BuiltInPatchVertices(Main.BUILT_IN_PATCH_VERTICES),
	BuiltInFragCoord(Main.BUILT_IN_FRAG_COORD),
	BuiltInPointCoord(Main.BUILT_IN_POINT_COORD),
	BuiltInFrontFacing(Main.BUILT_IN_FRONT_FACING),
	BuiltInSampleId(Main.BUILT_IN_SAMPLE_ID),
	BuiltInSamplePosition(Main.BUILT_IN_SAMPLE_POSITION),
	BuiltInSampleMask(Main.BUILT_IN_SAMPLE_MASK),
	BuiltInFragDepth(Main.BUILT_IN_FRAG_DEPTH),
	BuiltInHelperInvocation(Main.BUILT_IN_HELPER_INVOCATION),
	BuiltInNumWorkgroups(Main.BUILT_IN_NUM_WORKGROUPS),
	BuiltInWorkgroupSize(Main.BUILT_IN_WORKGROUP_SIZE),
	BuiltInWorkgroupId(Main.BUILT_IN_WORKGROUP_ID),
	BuiltInLocalInvocationId(Main.BUILT_IN_LOCAL_INVOCATION_ID),
	BuiltInGlobalInvocationId(Main.BUILT_IN_GLOBAL_INVOCATION_ID),
	BuiltInLocalInvocationIndex(Main.BUILT_IN_LOCAL_INVOCATION_INDEX),
	BuiltInWorkDim(Main.BUILT_IN_WORK_DIM),
	BuiltInGlobalSize(Main.BUILT_IN_GLOBAL_SIZE),
	BuiltInEnqueuedWorkgroupSize(Main.BUILT_IN_ENQUEUED_WORKGROUP_SIZE),
	BuiltInGlobalOffset(Main.BUILT_IN_GLOBAL_OFFSET),
	BuiltInGlobalLinearId(Main.BUILT_IN_GLOBAL_LINEAR_ID),
	BuiltInSubgroupSize(Main.BUILT_IN_SUBGROUP_SIZE),
	BuiltInSubgroupMaxSize(Main.BUILT_IN_SUBGROUP_MAX_SIZE),
	BuiltInNumSubgroups(Main.BUILT_IN_NUM_SUBGROUPS),
	BuiltInNumEnqueuedSubgroups(Main.BUILT_IN_NUM_ENQUEUED_SUBGROUPS),
	BuiltInSubgroupId(Main.BUILT_IN_SUBGROUP_ID),
	BuiltInSubgroupLocalInvocationId(Main.BUILT_IN_SUBGROUP_LOCAL_INVOCATION_ID),
	BuiltInVertexIndex(Main.BUILT_IN_VERTEX_INDEX),
	BuiltInInstanceIndex(Main.BUILT_IN_INSTANCE_INDEX),
	BuiltInSubgroupEqMask(Main.BUILT_IN_SUBGROUP_EQ_MASK),
	BuiltInSubgroupEqMaskKHR(Main.BUILT_IN_SUBGROUP_EQ_MASK_KHR),
	BuiltInSubgroupGeMask(Main.BUILT_IN_SUBGROUP_GE_MASK),
	BuiltInSubgroupGeMaskKHR(Main.BUILT_IN_SUBGROUP_GE_MASK_KHR),
	BuiltInSubgroupGtMask(Main.BUILT_IN_SUBGROUP_GT_MASK),
	BuiltInSubgroupGtMaskKHR(Main.BUILT_IN_SUBGROUP_GT_MASK_KHR),
	BuiltInSubgroupLeMask(Main.BUILT_IN_SUBGROUP_LE_MASK),
	BuiltInSubgroupLeMaskKHR(Main.BUILT_IN_SUBGROUP_LE_MASK_KHR),
	BuiltInSubgroupLtMask(Main.BUILT_IN_SUBGROUP_LT_MASK),
	BuiltInSubgroupLtMaskKHR(Main.BUILT_IN_SUBGROUP_LT_MASK_KHR),
	BuiltInBaseVertex(Main.BUILT_IN_BASE_VERTEX),
	BuiltInBaseInstance(Main.BUILT_IN_BASE_INSTANCE),
	BuiltInDrawIndex(Main.BUILT_IN_DRAW_INDEX),
	BuiltInDeviceIndex(Main.BUILT_IN_DEVICE_INDEX),
	BuiltInViewIndex(Main.BUILT_IN_VIEW_INDEX),
	BuiltInBaryCoordNoPerspAMD(Main.BUILT_IN_BARY_COORD_NO_PERSP_AMD),
	BuiltInBaryCoordNoPerspCentroidAMD(Main.BUILT_IN_BARY_COORD_NO_PERSP_CENTROID_AMD),
	BuiltInBaryCoordNoPerspSampleAMD(Main.BUILT_IN_BARY_COORD_NO_PERSP_SAMPLE_AMD),
	BuiltInBaryCoordSmoothAMD(Main.BUILT_IN_BARY_COORD_SMOOTH_AMD),
	BuiltInBaryCoordSmoothCentroidAMD(Main.BUILT_IN_BARY_COORD_SMOOTH_CENTROID_AMD),
	BuiltInBaryCoordSmoothSampleAMD(Main.BUILT_IN_BARY_COORD_SMOOTH_SAMPLE_AMD),
	BuiltInBaryCoordPullModelAMD(Main.BUILT_IN_BARY_COORD_PULL_MODEL_AMD),
	BuiltInFragStencilRefEXT(Main.BUILT_IN_FRAG_STENCIL_REF_EXT),
	BuiltInViewportMaskNV(Main.BUILT_IN_VIEWPORT_MASK_NV),
	BuiltInSecondaryPositionNV(Main.BUILT_IN_SECONDARY_POSITION_NV),
	BuiltInSecondaryViewportMaskNV(Main.BUILT_IN_SECONDARY_VIEWPORT_MASK_NV),
	BuiltInPositionPerViewNV(Main.BUILT_IN_POSITION_PER_VIEW_NV),
	BuiltInViewportMaskPerViewNV(Main.BUILT_IN_VIEWPORT_MASK_PER_VIEW_NV),
	BuiltInFullyCoveredEXT(Main.BUILT_IN_FULLY_COVERED_EXT),
	BuiltInTaskCountNV(Main.BUILT_IN_TASK_COUNT_NV),
	BuiltInPrimitiveCountNV(Main.BUILT_IN_PRIMITIVE_COUNT_NV),
	BuiltInPrimitiveIndicesNV(Main.BUILT_IN_PRIMITIVE_INDICES_NV),
	BuiltInClipDistancePerViewNV(Main.BUILT_IN_CLIP_DISTANCE_PER_VIEW_NV),
	BuiltInCullDistancePerViewNV(Main.BUILT_IN_CULL_DISTANCE_PER_VIEW_NV),
	BuiltInLayerPerViewNV(Main.BUILT_IN_LAYER_PER_VIEW_NV),
	BuiltInMeshViewCountNV(Main.BUILT_IN_MESH_VIEW_COUNT_NV),
	BuiltInMeshViewIndicesNV(Main.BUILT_IN_MESH_VIEW_INDICES_NV),
	BuiltInBaryCoordNV(Main.BUILT_IN_BARY_COORD_NV),
	BuiltInBaryCoordNoPerspNV(Main.BUILT_IN_BARY_COORD_NO_PERSP_NV),
	BuiltInFragSizeEXT(Main.BUILT_IN_FRAG_SIZE_EXT),
	BuiltInFragmentSizeNV(Main.BUILT_IN_FRAGMENT_SIZE_NV),
	BuiltInFragInvocationCountEXT(Main.BUILT_IN_FRAG_INVOCATION_COUNT_EXT),
	BuiltInInvocationsPerPixelNV(Main.BUILT_IN_INVOCATIONS_PER_PIXEL_NV),
	BuiltInLaunchIdKHR(Main.BUILT_IN_LAUNCH_ID_KHR),
	BuiltInLaunchIdNV(Main.BUILT_IN_LAUNCH_ID_NV),
	BuiltInLaunchSizeKHR(Main.BUILT_IN_LAUNCH_SIZE_KHR),
	BuiltInLaunchSizeNV(Main.BUILT_IN_LAUNCH_SIZE_NV),
	BuiltInWorldRayOriginKHR(Main.BUILT_IN_WORLD_RAY_ORIGIN_KHR),
	BuiltInWorldRayOriginNV(Main.BUILT_IN_WORLD_RAY_ORIGIN_NV),
	BuiltInWorldRayDirectionKHR(Main.BUILT_IN_WORLD_RAY_DIRECTION_KHR),
	BuiltInWorldRayDirectionNV(Main.BUILT_IN_WORLD_RAY_DIRECTION_NV),
	BuiltInObjectRayOriginKHR(Main.BUILT_IN_OBJECT_RAY_ORIGIN_KHR),
	BuiltInObjectRayOriginNV(Main.BUILT_IN_OBJECT_RAY_ORIGIN_NV),
	BuiltInObjectRayDirectionKHR(Main.BUILT_IN_OBJECT_RAY_DIRECTION_KHR),
	BuiltInObjectRayDirectionNV(Main.BUILT_IN_OBJECT_RAY_DIRECTION_NV),
	BuiltInRayTminKHR(Main.BUILT_IN_RAY_TMIN_KHR),
	BuiltInRayTminNV(Main.BUILT_IN_RAY_TMIN_NV),
	BuiltInRayTmaxKHR(Main.BUILT_IN_RAY_TMAX_KHR),
	BuiltInRayTmaxNV(Main.BUILT_IN_RAY_TMAX_NV),
	BuiltInInstanceCustomIndexKHR(Main.BUILT_IN_INSTANCE_CUSTOM_INDEX_KHR),
	BuiltInInstanceCustomIndexNV(Main.BUILT_IN_INSTANCE_CUSTOM_INDEX_NV),
	BuiltInObjectToWorldKHR(Main.BUILT_IN_OBJECT_TO_WORLD_KHR),
	BuiltInObjectToWorldNV(Main.BUILT_IN_OBJECT_TO_WORLD_NV),
	BuiltInWorldToObjectKHR(Main.BUILT_IN_WORLD_TO_OBJECT_KHR),
	BuiltInWorldToObjectNV(Main.BUILT_IN_WORLD_TO_OBJECT_NV),
	BuiltInHitTKHR(Main.BUILT_IN_HIT_T_KHR),
	BuiltInHitTNV(Main.BUILT_IN_HIT_T_NV),
	BuiltInHitKindKHR(Main.BUILT_IN_HIT_KIND_KHR),
	BuiltInHitKindNV(Main.BUILT_IN_HIT_KIND_NV),
	BuiltInIncomingRayFlagsKHR(Main.BUILT_IN_INCOMING_RAY_FLAGS_KHR),
	BuiltInIncomingRayFlagsNV(Main.BUILT_IN_INCOMING_RAY_FLAGS_NV),
	BuiltInRayGeometryIndexKHR(Main.BUILT_IN_RAY_GEOMETRY_INDEX_KHR),
	BuiltInWarpsPerSMNV(Main.BUILT_IN_WARPS_PER_SM_NV),
	BuiltInSMCountNV(Main.BUILT_IN_SM_COUNT_NV),
	BuiltInWarpIDNV(Main.BUILT_IN_WARP_ID_NV),
	BuiltInSMIDNV(Main.BUILT_IN_SM_ID_NV),
	BuiltInMax(Main.BUILT_IN_MAX);

	private final int value;

	private BuiltIn(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static BuiltIn valueByStr(String str) {
		switch (str) {
			case "BuiltInPosition":
				return BuiltInPosition;
			case "BuiltInPointSize":
				return BuiltInPointSize;
			case "BuiltInClipDistance":
				return BuiltInClipDistance;
			case "BuiltInCullDistance":
				return BuiltInCullDistance;
			case "BuiltInVertexId":
				return BuiltInVertexId;
			case "BuiltInInstanceId":
				return BuiltInInstanceId;
			case "BuiltInPrimitiveId":
				return BuiltInPrimitiveId;
			case "BuiltInInvocationId":
				return BuiltInInvocationId;
			case "BuiltInLayer":
				return BuiltInLayer;
			case "BuiltInViewportIndex":
				return BuiltInViewportIndex;
			case "BuiltInTessLevelOuter":
				return BuiltInTessLevelOuter;
			case "BuiltInTessLevelInner":
				return BuiltInTessLevelInner;
			case "BuiltInTessCoord":
				return BuiltInTessCoord;
			case "BuiltInPatchVertices":
				return BuiltInPatchVertices;
			case "BuiltInFragCoord":
				return BuiltInFragCoord;
			case "BuiltInPointCoord":
				return BuiltInPointCoord;
			case "BuiltInFrontFacing":
				return BuiltInFrontFacing;
			case "BuiltInSampleId":
				return BuiltInSampleId;
			case "BuiltInSamplePosition":
				return BuiltInSamplePosition;
			case "BuiltInSampleMask":
				return BuiltInSampleMask;
			case "BuiltInFragDepth":
				return BuiltInFragDepth;
			case "BuiltInHelperInvocation":
				return BuiltInHelperInvocation;
			case "BuiltInNumWorkgroups":
				return BuiltInNumWorkgroups;
			case "BuiltInWorkgroupSize":
				return BuiltInWorkgroupSize;
			case "BuiltInWorkgroupId":
				return BuiltInWorkgroupId;
			case "BuiltInLocalInvocationId":
				return BuiltInLocalInvocationId;
			case "BuiltInGlobalInvocationId":
				return BuiltInGlobalInvocationId;
			case "BuiltInLocalInvocationIndex":
				return BuiltInLocalInvocationIndex;
			case "BuiltInWorkDim":
				return BuiltInWorkDim;
			case "BuiltInGlobalSize":
				return BuiltInGlobalSize;
			case "BuiltInEnqueuedWorkgroupSize":
				return BuiltInEnqueuedWorkgroupSize;
			case "BuiltInGlobalOffset":
				return BuiltInGlobalOffset;
			case "BuiltInGlobalLinearId":
				return BuiltInGlobalLinearId;
			case "BuiltInSubgroupSize":
				return BuiltInSubgroupSize;
			case "BuiltInSubgroupMaxSize":
				return BuiltInSubgroupMaxSize;
			case "BuiltInNumSubgroups":
				return BuiltInNumSubgroups;
			case "BuiltInNumEnqueuedSubgroups":
				return BuiltInNumEnqueuedSubgroups;
			case "BuiltInSubgroupId":
				return BuiltInSubgroupId;
			case "BuiltInSubgroupLocalInvocationId":
				return BuiltInSubgroupLocalInvocationId;
			case "BuiltInVertexIndex":
				return BuiltInVertexIndex;
			case "BuiltInInstanceIndex":
				return BuiltInInstanceIndex;
			case "BuiltInSubgroupEqMask":
				return BuiltInSubgroupEqMask;
			case "BuiltInSubgroupEqMaskKHR":
				return BuiltInSubgroupEqMaskKHR;
			case "BuiltInSubgroupGeMask":
				return BuiltInSubgroupGeMask;
			case "BuiltInSubgroupGeMaskKHR":
				return BuiltInSubgroupGeMaskKHR;
			case "BuiltInSubgroupGtMask":
				return BuiltInSubgroupGtMask;
			case "BuiltInSubgroupGtMaskKHR":
				return BuiltInSubgroupGtMaskKHR;
			case "BuiltInSubgroupLeMask":
				return BuiltInSubgroupLeMask;
			case "BuiltInSubgroupLeMaskKHR":
				return BuiltInSubgroupLeMaskKHR;
			case "BuiltInSubgroupLtMask":
				return BuiltInSubgroupLtMask;
			case "BuiltInSubgroupLtMaskKHR":
				return BuiltInSubgroupLtMaskKHR;
			case "BuiltInBaseVertex":
				return BuiltInBaseVertex;
			case "BuiltInBaseInstance":
				return BuiltInBaseInstance;
			case "BuiltInDrawIndex":
				return BuiltInDrawIndex;
			case "BuiltInDeviceIndex":
				return BuiltInDeviceIndex;
			case "BuiltInViewIndex":
				return BuiltInViewIndex;
			case "BuiltInBaryCoordNoPerspAMD":
				return BuiltInBaryCoordNoPerspAMD;
			case "BuiltInBaryCoordNoPerspCentroidAMD":
				return BuiltInBaryCoordNoPerspCentroidAMD;
			case "BuiltInBaryCoordNoPerspSampleAMD":
				return BuiltInBaryCoordNoPerspSampleAMD;
			case "BuiltInBaryCoordSmoothAMD":
				return BuiltInBaryCoordSmoothAMD;
			case "BuiltInBaryCoordSmoothCentroidAMD":
				return BuiltInBaryCoordSmoothCentroidAMD;
			case "BuiltInBaryCoordSmoothSampleAMD":
				return BuiltInBaryCoordSmoothSampleAMD;
			case "BuiltInBaryCoordPullModelAMD":
				return BuiltInBaryCoordPullModelAMD;
			case "BuiltInFragStencilRefEXT":
				return BuiltInFragStencilRefEXT;
			case "BuiltInViewportMaskNV":
				return BuiltInViewportMaskNV;
			case "BuiltInSecondaryPositionNV":
				return BuiltInSecondaryPositionNV;
			case "BuiltInSecondaryViewportMaskNV":
				return BuiltInSecondaryViewportMaskNV;
			case "BuiltInPositionPerViewNV":
				return BuiltInPositionPerViewNV;
			case "BuiltInViewportMaskPerViewNV":
				return BuiltInViewportMaskPerViewNV;
			case "BuiltInFullyCoveredEXT":
				return BuiltInFullyCoveredEXT;
			case "BuiltInTaskCountNV":
				return BuiltInTaskCountNV;
			case "BuiltInPrimitiveCountNV":
				return BuiltInPrimitiveCountNV;
			case "BuiltInPrimitiveIndicesNV":
				return BuiltInPrimitiveIndicesNV;
			case "BuiltInClipDistancePerViewNV":
				return BuiltInClipDistancePerViewNV;
			case "BuiltInCullDistancePerViewNV":
				return BuiltInCullDistancePerViewNV;
			case "BuiltInLayerPerViewNV":
				return BuiltInLayerPerViewNV;
			case "BuiltInMeshViewCountNV":
				return BuiltInMeshViewCountNV;
			case "BuiltInMeshViewIndicesNV":
				return BuiltInMeshViewIndicesNV;
			case "BuiltInBaryCoordNV":
				return BuiltInBaryCoordNV;
			case "BuiltInBaryCoordNoPerspNV":
				return BuiltInBaryCoordNoPerspNV;
			case "BuiltInFragSizeEXT":
				return BuiltInFragSizeEXT;
			case "BuiltInFragmentSizeNV":
				return BuiltInFragmentSizeNV;
			case "BuiltInFragInvocationCountEXT":
				return BuiltInFragInvocationCountEXT;
			case "BuiltInInvocationsPerPixelNV":
				return BuiltInInvocationsPerPixelNV;
			case "BuiltInLaunchIdKHR":
				return BuiltInLaunchIdKHR;
			case "BuiltInLaunchIdNV":
				return BuiltInLaunchIdNV;
			case "BuiltInLaunchSizeKHR":
				return BuiltInLaunchSizeKHR;
			case "BuiltInLaunchSizeNV":
				return BuiltInLaunchSizeNV;
			case "BuiltInWorldRayOriginKHR":
				return BuiltInWorldRayOriginKHR;
			case "BuiltInWorldRayOriginNV":
				return BuiltInWorldRayOriginNV;
			case "BuiltInWorldRayDirectionKHR":
				return BuiltInWorldRayDirectionKHR;
			case "BuiltInWorldRayDirectionNV":
				return BuiltInWorldRayDirectionNV;
			case "BuiltInObjectRayOriginKHR":
				return BuiltInObjectRayOriginKHR;
			case "BuiltInObjectRayOriginNV":
				return BuiltInObjectRayOriginNV;
			case "BuiltInObjectRayDirectionKHR":
				return BuiltInObjectRayDirectionKHR;
			case "BuiltInObjectRayDirectionNV":
				return BuiltInObjectRayDirectionNV;
			case "BuiltInRayTminKHR":
				return BuiltInRayTminKHR;
			case "BuiltInRayTminNV":
				return BuiltInRayTminNV;
			case "BuiltInRayTmaxKHR":
				return BuiltInRayTmaxKHR;
			case "BuiltInRayTmaxNV":
				return BuiltInRayTmaxNV;
			case "BuiltInInstanceCustomIndexKHR":
				return BuiltInInstanceCustomIndexKHR;
			case "BuiltInInstanceCustomIndexNV":
				return BuiltInInstanceCustomIndexNV;
			case "BuiltInObjectToWorldKHR":
				return BuiltInObjectToWorldKHR;
			case "BuiltInObjectToWorldNV":
				return BuiltInObjectToWorldNV;
			case "BuiltInWorldToObjectKHR":
				return BuiltInWorldToObjectKHR;
			case "BuiltInWorldToObjectNV":
				return BuiltInWorldToObjectNV;
			case "BuiltInHitTKHR":
				return BuiltInHitTKHR;
			case "BuiltInHitTNV":
				return BuiltInHitTNV;
			case "BuiltInHitKindKHR":
				return BuiltInHitKindKHR;
			case "BuiltInHitKindNV":
				return BuiltInHitKindNV;
			case "BuiltInIncomingRayFlagsKHR":
				return BuiltInIncomingRayFlagsKHR;
			case "BuiltInIncomingRayFlagsNV":
				return BuiltInIncomingRayFlagsNV;
			case "BuiltInRayGeometryIndexKHR":
				return BuiltInRayGeometryIndexKHR;
			case "BuiltInWarpsPerSMNV":
				return BuiltInWarpsPerSMNV;
			case "BuiltInSMCountNV":
				return BuiltInSMCountNV;
			case "BuiltInWarpIDNV":
				return BuiltInWarpIDNV;
			case "BuiltInSMIDNV":
				return BuiltInSMIDNV;
			case "BuiltInMax":
				return BuiltInMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static BuiltIn valueByConstant(int constant) {
		switch (constant) {
			case Main.BUILT_IN_POSITION:
				return BuiltInPosition;
			case Main.BUILT_IN_POINT_SIZE:
				return BuiltInPointSize;
			case Main.BUILT_IN_CLIP_DISTANCE:
				return BuiltInClipDistance;
			case Main.BUILT_IN_CULL_DISTANCE:
				return BuiltInCullDistance;
			case Main.BUILT_IN_VERTEX_ID:
				return BuiltInVertexId;
			case Main.BUILT_IN_INSTANCE_ID:
				return BuiltInInstanceId;
			case Main.BUILT_IN_PRIMITIVE_ID:
				return BuiltInPrimitiveId;
			case Main.BUILT_IN_INVOCATION_ID:
				return BuiltInInvocationId;
			case Main.BUILT_IN_LAYER:
				return BuiltInLayer;
			case Main.BUILT_IN_VIEWPORT_INDEX:
				return BuiltInViewportIndex;
			case Main.BUILT_IN_TESS_LEVEL_OUTER:
				return BuiltInTessLevelOuter;
			case Main.BUILT_IN_TESS_LEVEL_INNER:
				return BuiltInTessLevelInner;
			case Main.BUILT_IN_TESS_COORD:
				return BuiltInTessCoord;
			case Main.BUILT_IN_PATCH_VERTICES:
				return BuiltInPatchVertices;
			case Main.BUILT_IN_FRAG_COORD:
				return BuiltInFragCoord;
			case Main.BUILT_IN_POINT_COORD:
				return BuiltInPointCoord;
			case Main.BUILT_IN_FRONT_FACING:
				return BuiltInFrontFacing;
			case Main.BUILT_IN_SAMPLE_ID:
				return BuiltInSampleId;
			case Main.BUILT_IN_SAMPLE_POSITION:
				return BuiltInSamplePosition;
			case Main.BUILT_IN_SAMPLE_MASK:
				return BuiltInSampleMask;
			case Main.BUILT_IN_FRAG_DEPTH:
				return BuiltInFragDepth;
			case Main.BUILT_IN_HELPER_INVOCATION:
				return BuiltInHelperInvocation;
			case Main.BUILT_IN_NUM_WORKGROUPS:
				return BuiltInNumWorkgroups;
			case Main.BUILT_IN_WORKGROUP_SIZE:
				return BuiltInWorkgroupSize;
			case Main.BUILT_IN_WORKGROUP_ID:
				return BuiltInWorkgroupId;
			case Main.BUILT_IN_LOCAL_INVOCATION_ID:
				return BuiltInLocalInvocationId;
			case Main.BUILT_IN_GLOBAL_INVOCATION_ID:
				return BuiltInGlobalInvocationId;
			case Main.BUILT_IN_LOCAL_INVOCATION_INDEX:
				return BuiltInLocalInvocationIndex;
			case Main.BUILT_IN_WORK_DIM:
				return BuiltInWorkDim;
			case Main.BUILT_IN_GLOBAL_SIZE:
				return BuiltInGlobalSize;
			case Main.BUILT_IN_ENQUEUED_WORKGROUP_SIZE:
				return BuiltInEnqueuedWorkgroupSize;
			case Main.BUILT_IN_GLOBAL_OFFSET:
				return BuiltInGlobalOffset;
			case Main.BUILT_IN_GLOBAL_LINEAR_ID:
				return BuiltInGlobalLinearId;
			case Main.BUILT_IN_SUBGROUP_SIZE:
				return BuiltInSubgroupSize;
			case Main.BUILT_IN_SUBGROUP_MAX_SIZE:
				return BuiltInSubgroupMaxSize;
			case Main.BUILT_IN_NUM_SUBGROUPS:
				return BuiltInNumSubgroups;
			case Main.BUILT_IN_NUM_ENQUEUED_SUBGROUPS:
				return BuiltInNumEnqueuedSubgroups;
			case Main.BUILT_IN_SUBGROUP_ID:
				return BuiltInSubgroupId;
			case Main.BUILT_IN_SUBGROUP_LOCAL_INVOCATION_ID:
				return BuiltInSubgroupLocalInvocationId;
			case Main.BUILT_IN_VERTEX_INDEX:
				return BuiltInVertexIndex;
			case Main.BUILT_IN_INSTANCE_INDEX:
				return BuiltInInstanceIndex;
			case Main.BUILT_IN_SUBGROUP_EQ_MASK:
				return BuiltInSubgroupEqMask;
			case Main.BUILT_IN_SUBGROUP_GE_MASK:
				return BuiltInSubgroupGeMask;
			case Main.BUILT_IN_SUBGROUP_GT_MASK:
				return BuiltInSubgroupGtMask;
			case Main.BUILT_IN_SUBGROUP_LE_MASK:
				return BuiltInSubgroupLeMask;
			case Main.BUILT_IN_SUBGROUP_LT_MASK:
				return BuiltInSubgroupLtMask;
			case Main.BUILT_IN_BASE_VERTEX:
				return BuiltInBaseVertex;
			case Main.BUILT_IN_BASE_INSTANCE:
				return BuiltInBaseInstance;
			case Main.BUILT_IN_DRAW_INDEX:
				return BuiltInDrawIndex;
			case Main.BUILT_IN_DEVICE_INDEX:
				return BuiltInDeviceIndex;
			case Main.BUILT_IN_VIEW_INDEX:
				return BuiltInViewIndex;
			case Main.BUILT_IN_BARY_COORD_NO_PERSP_AMD:
				return BuiltInBaryCoordNoPerspAMD;
			case Main.BUILT_IN_BARY_COORD_NO_PERSP_CENTROID_AMD:
				return BuiltInBaryCoordNoPerspCentroidAMD;
			case Main.BUILT_IN_BARY_COORD_NO_PERSP_SAMPLE_AMD:
				return BuiltInBaryCoordNoPerspSampleAMD;
			case Main.BUILT_IN_BARY_COORD_SMOOTH_AMD:
				return BuiltInBaryCoordSmoothAMD;
			case Main.BUILT_IN_BARY_COORD_SMOOTH_CENTROID_AMD:
				return BuiltInBaryCoordSmoothCentroidAMD;
			case Main.BUILT_IN_BARY_COORD_SMOOTH_SAMPLE_AMD:
				return BuiltInBaryCoordSmoothSampleAMD;
			case Main.BUILT_IN_BARY_COORD_PULL_MODEL_AMD:
				return BuiltInBaryCoordPullModelAMD;
			case Main.BUILT_IN_FRAG_STENCIL_REF_EXT:
				return BuiltInFragStencilRefEXT;
			case Main.BUILT_IN_VIEWPORT_MASK_NV:
				return BuiltInViewportMaskNV;
			case Main.BUILT_IN_SECONDARY_POSITION_NV:
				return BuiltInSecondaryPositionNV;
			case Main.BUILT_IN_SECONDARY_VIEWPORT_MASK_NV:
				return BuiltInSecondaryViewportMaskNV;
			case Main.BUILT_IN_POSITION_PER_VIEW_NV:
				return BuiltInPositionPerViewNV;
			case Main.BUILT_IN_VIEWPORT_MASK_PER_VIEW_NV:
				return BuiltInViewportMaskPerViewNV;
			case Main.BUILT_IN_FULLY_COVERED_EXT:
				return BuiltInFullyCoveredEXT;
			case Main.BUILT_IN_TASK_COUNT_NV:
				return BuiltInTaskCountNV;
			case Main.BUILT_IN_PRIMITIVE_COUNT_NV:
				return BuiltInPrimitiveCountNV;
			case Main.BUILT_IN_PRIMITIVE_INDICES_NV:
				return BuiltInPrimitiveIndicesNV;
			case Main.BUILT_IN_CLIP_DISTANCE_PER_VIEW_NV:
				return BuiltInClipDistancePerViewNV;
			case Main.BUILT_IN_CULL_DISTANCE_PER_VIEW_NV:
				return BuiltInCullDistancePerViewNV;
			case Main.BUILT_IN_LAYER_PER_VIEW_NV:
				return BuiltInLayerPerViewNV;
			case Main.BUILT_IN_MESH_VIEW_COUNT_NV:
				return BuiltInMeshViewCountNV;
			case Main.BUILT_IN_MESH_VIEW_INDICES_NV:
				return BuiltInMeshViewIndicesNV;
			case Main.BUILT_IN_BARY_COORD_NV:
				return BuiltInBaryCoordNV;
			case Main.BUILT_IN_BARY_COORD_NO_PERSP_NV:
				return BuiltInBaryCoordNoPerspNV;
			case Main.BUILT_IN_FRAG_SIZE_EXT:
				return BuiltInFragSizeEXT;
			case Main.BUILT_IN_FRAG_INVOCATION_COUNT_EXT:
				return BuiltInFragInvocationCountEXT;
			case Main.BUILT_IN_LAUNCH_ID_KHR:
				return BuiltInLaunchIdKHR;
			case Main.BUILT_IN_LAUNCH_SIZE_KHR:
				return BuiltInLaunchSizeKHR;
			case Main.BUILT_IN_WORLD_RAY_ORIGIN_KHR:
				return BuiltInWorldRayOriginKHR;
			case Main.BUILT_IN_WORLD_RAY_DIRECTION_KHR:
				return BuiltInWorldRayDirectionKHR;
			case Main.BUILT_IN_OBJECT_RAY_ORIGIN_KHR:
				return BuiltInObjectRayOriginKHR;
			case Main.BUILT_IN_OBJECT_RAY_DIRECTION_KHR:
				return BuiltInObjectRayDirectionKHR;
			case Main.BUILT_IN_RAY_TMIN_KHR:
				return BuiltInRayTminKHR;
			case Main.BUILT_IN_RAY_TMAX_KHR:
				return BuiltInRayTmaxKHR;
			case Main.BUILT_IN_INSTANCE_CUSTOM_INDEX_KHR:
				return BuiltInInstanceCustomIndexKHR;
			case Main.BUILT_IN_OBJECT_TO_WORLD_KHR:
				return BuiltInObjectToWorldKHR;
			case Main.BUILT_IN_WORLD_TO_OBJECT_KHR:
				return BuiltInWorldToObjectKHR;
			case Main.BUILT_IN_HIT_T_KHR:
				return BuiltInHitTKHR;
			case Main.BUILT_IN_HIT_KIND_KHR:
				return BuiltInHitKindKHR;
			case Main.BUILT_IN_INCOMING_RAY_FLAGS_KHR:
				return BuiltInIncomingRayFlagsKHR;
			case Main.BUILT_IN_RAY_GEOMETRY_INDEX_KHR:
				return BuiltInRayGeometryIndexKHR;
			case Main.BUILT_IN_WARPS_PER_SM_NV:
				return BuiltInWarpsPerSMNV;
			case Main.BUILT_IN_SM_COUNT_NV:
				return BuiltInSMCountNV;
			case Main.BUILT_IN_WARP_ID_NV:
				return BuiltInWarpIDNV;
			case Main.BUILT_IN_SM_ID_NV:
				return BuiltInSMIDNV;
			case Main.BUILT_IN_MAX:
				return BuiltInMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
