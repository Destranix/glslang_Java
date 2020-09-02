package com.destranix.glslang;

public enum TBuiltInVariable {
	EbvNone(Main.EBV_NONE),
	EbvNumWorkGroups(Main.EBV_NUM_WORK_GROUPS),
	EbvWorkGroupSize(Main.EBV_WORK_GROUP_SIZE),
	EbvWorkGroupId(Main.EBV_WORK_GROUP_ID),
	EbvLocalInvocationId(Main.EBV_LOCAL_INVOCATION_ID),
	EbvGlobalInvocationId(Main.EBV_GLOBAL_INVOCATION_ID),
	EbvLocalInvocationIndex(Main.EBV_LOCAL_INVOCATION_INDEX),
	EbvNumSubgroups(Main.EBV_NUM_SUBGROUPS),
	EbvSubgroupID(Main.EBV_SUBGROUP_ID),
	EbvSubGroupSize(Main.EBV_SUB_GROUP_SIZE),
	EbvSubGroupInvocation(Main.EBV_SUB_GROUP_INVOCATION),
	EbvSubGroupEqMask(Main.EBV_SUB_GROUP_EQ_MASK),
	EbvSubGroupGeMask(Main.EBV_SUB_GROUP_GE_MASK),
	EbvSubGroupGtMask(Main.EBV_SUB_GROUP_GT_MASK),
	EbvSubGroupLeMask(Main.EBV_SUB_GROUP_LE_MASK),
	EbvSubGroupLtMask(Main.EBV_SUB_GROUP_LT_MASK),
	EbvSubgroupSize2(Main.EBV_SUBGROUP_SIZE2),
	EbvSubgroupInvocation2(Main.EBV_SUBGROUP_INVOCATION2),
	EbvSubgroupEqMask2(Main.EBV_SUBGROUP_EQ_MASK2),
	EbvSubgroupGeMask2(Main.EBV_SUBGROUP_GE_MASK2),
	EbvSubgroupGtMask2(Main.EBV_SUBGROUP_GT_MASK2),
	EbvSubgroupLeMask2(Main.EBV_SUBGROUP_LE_MASK2),
	EbvSubgroupLtMask2(Main.EBV_SUBGROUP_LT_MASK2),
	EbvVertexId(Main.EBV_VERTEX_ID),
	EbvInstanceId(Main.EBV_INSTANCE_ID),
	EbvVertexIndex(Main.EBV_VERTEX_INDEX),
	EbvInstanceIndex(Main.EBV_INSTANCE_INDEX),
	EbvBaseVertex(Main.EBV_BASE_VERTEX),
	EbvBaseInstance(Main.EBV_BASE_INSTANCE),
	EbvDrawId(Main.EBV_DRAW_ID),
	EbvPosition(Main.EBV_POSITION),
	EbvPointSize(Main.EBV_POINT_SIZE),
	EbvClipVertex(Main.EBV_CLIP_VERTEX),
	EbvClipDistance(Main.EBV_CLIP_DISTANCE),
	EbvCullDistance(Main.EBV_CULL_DISTANCE),
	EbvNormal(Main.EBV_NORMAL),
	EbvVertex(Main.EBV_VERTEX),
	EbvMultiTexCoord0(Main.EBV_MULTI_TEX_COOR0),
	EbvMultiTexCoord1(Main.EBV_MULTI_TEX_COORD1),
	EbvMultiTexCoord2(Main.EBV_MULTI_TEX_COORD2),
	EbvMultiTexCoord3(Main.EBV_MULTI_TEX_COORD3),
	EbvMultiTexCoord4(Main.EBV_MULTI_TEX_COORD4),
	EbvMultiTexCoord5(Main.EBV_MULTI_TEX_COORD5),
	EbvMultiTexCoord6(Main.EBV_MULTI_TEX_COORD6),
	EbvMultiTexCoord7(Main.EBV_MULTI_TEX_COORD7),
	EbvFrontColor(Main.EBV_FRONT_COLOR),
	EbvBackColor(Main.EBV_BACK_COLOR),
	EbvFrontSecondaryColor(Main.EBV_FRONT_SECONDARY_COLOR),
	EbvBackSecondaryColor(Main.EBV_BACK_SECONDARY_COLOR),
	EbvTexCoord(Main.EBV_TEX_COORD),
	EbvFogFragCoord(Main.EBV_FOG_FRAG_COORD),
	EbvInvocationId(Main.EBV_INVOCATION_ID),
	EbvPrimitiveId(Main.EBV_PRIMITIVE_ID),
	EbvLayer(Main.EBV_LAYER),
	EbvViewportIndex(Main.EBV_VIEWPORT_INDEX),
	EbvPatchVertices(Main.EBV_PATCH_VERTICES),
	EbvTessLevelOuter(Main.EBV_TESS_LEVEL_OUTER),
	EbvTessLevelInner(Main.EBV_TESS_LEVEL_INNER),
	EbvBoundingBox(Main.EBV_BOUNDING_BOX),
	EbvTessCoord(Main.EBV_TESS_COORD),
	EbvColor(Main.EBV_COLOR),
	EbvSecondaryColor(Main.EBV_SECONDARY_COLOR),
	EbvFace(Main.EBV_FACE),
	EbvFragCoord(Main.EBV_FRAG_COORD),
	EbvPointCoord(Main.EBV_POINT_COORD),
	EbvFragColor(Main.EBV_FRAG_COLOR),
	EbvFragData(Main.EBV_FRAG_DATA),
	EbvFragDepth(Main.EBV_FRAG_DEPTH),
	EbvFragStencilRef(Main.EBV_FRAG_STENCIL_REF),
	EbvSampleId(Main.EBV_SAMPLE_ID),
	EbvSamplePosition(Main.EBV_SAMPLE_POSITION),
	EbvSampleMask(Main.EBV_SAMPLE_MASK),
	EbvHelperInvocation(Main.EBV_HELPER_INVOCATION),
	EbvBaryCoordNoPersp(Main.EBV_BARY_COORD_NO_PERSP),
	EbvBaryCoordNoPerspCentroid(Main.EBV_BARY_COORD_NO_PERSP_CENTROID),
	EbvBaryCoordNoPerspSample(Main.EBV_BARY_COORD_NO_PERSP_SAMPLE),
	EbvBaryCoordSmooth(Main.EBV_BARY_COORD_SMOOTH),
	EbvBaryCoordSmoothCentroid(Main.EBV_BARY_COORD_SMOOTH_CENTROID),
	EbvBaryCoordSmoothSample(Main.EBV_BARY_COORD_SMOOTH_SAMPLE),
	EbvBaryCoordPullModel(Main.EBV_BARY_COORD_PULL_MODEL),
	EbvViewIndex(Main.EBV_VIEW_INDEX),
	EbvDeviceIndex(Main.EBV_DEVICE_INDEX),
	EbvFragSizeEXT(Main.EBV_FRAG_SIZE_EXT),
	EbvFragInvocationCountEXT(Main.EBV_FRAG_INVOCATION_COUNT_EXT),
	EbvSecondaryFragDataEXT(Main.EBV_SECONDARY_FRAG_DATA_EXT),
	EbvSecondaryFragColorEXT(Main.EBV_SECONDARY_FRAG_COLOR_EXT),
	EbvViewportMaskNV(Main.EBV_VIEWPORT_MASK_NV),
	EbvSecondaryPositionNV(Main.EBV_SECONDARY_POSITION_NV),
	EbvSecondaryViewportMaskNV(Main.EBV_SECONDARY_VIEWPORT_MASK_NV),
	EbvPositionPerViewNV(Main.EBV_POSITIONPER_VIEW_NV),
	EbvViewportMaskPerViewNV(Main.EBV_VIEWPORT_MASK_PER_VIEW_NV),
	EbvFragFullyCoveredNV(Main.EBV_FRAG_FULLY_COVERED_NV),
	EbvFragmentSizeNV(Main.EBV_FRAGMENT_SIZE_NV),
	EbvInvocationsPerPixelNV(Main.EBV_INVOCATIONS_PER_PIXEL_NV),
	EbvLaunchId(Main.EBV_LAUNCH_ID),
	EbvLaunchSize(Main.EBV_LAUNCH_SIZE),
	EbvInstanceCustomIndex(Main.EBV_INSTANCE_CUSTOM_INDEX),
	EbvGeometryIndex(Main.EBV_GEOMETRY_INDEX),
	EbvWorldRayOrigin(Main.EBV_WORLD_RAY_ORIGIN),
	EbvWorldRayDirection(Main.EBV_WORLD_RAY_DIRECTION),
	EbvObjectRayOrigin(Main.EBV_OBJECT_RAY_ORIGIN),
	EbvObjectRayDirection(Main.EBV_OBJECT_RAY_DIRECTION),
	EbvRayTmin(Main.EBV_RAY_TMIN),
	EbvRayTmax(Main.EBV_RAY_TMAX),
	EbvHitT(Main.EBV_HIT_T),
	EbvHitKind(Main.EBV_HIT_KIND),
	EbvObjectToWorld(Main.EBV_OBJECT_TO_WORLD),
	EbvObjectToWorld3x4(Main.EBV_OBJECT_TO_WORLD3X4),
	EbvWorldToObject(Main.EBV_WORLD_TO_OBJECT),
	EbvWorldToObject3x4(Main.EBV_WORLD_TO_OBJECT3X4),
	EbvIncomingRayFlags(Main.EBV_INCOMING_RAY_FLAGS),
	EbvBaryCoordNV(Main.EBV_BARY_COORD_NV),
	EbvBaryCoordNoPerspNV(Main.EBV_BARY_COORD_NO_PERSP_NV),
	EbvTaskCountNV(Main.EBV_TASK_COUNT_NV),
	EbvPrimitiveCountNV(Main.EBV_PRIMITIVE_COUNT_NV),
	EbvPrimitiveIndicesNV(Main.EBV_PRIMITIVE_INDICES_NV),
	EbvClipDistancePerViewNV(Main.EBV_CLIP_DISTANCE_PER_VIEW_NV),
	EbvCullDistancePerViewNV(Main.EBV_CULL_DISTANCE_PER_VIEW_NV),
	EbvLayerPerViewNV(Main.EBV_LAYER_PER_VIEW_NV),
	EbvMeshViewCountNV(Main.EBV_MESH_VIEW_COUNT_NV),
	EbvMeshViewIndicesNV(Main.EBV_MESH_VIEW_INDICES_NV),
	EbvWarpsPerSM(Main.EBV_WARPS_PER_SM),
	EbvSMCount(Main.EBV_SM_COUNT),
	EbvWarpID(Main.EBV_WARP_ID),
	EbvSMID(Main.EBV_SM_ID),
	EbvFragDepthGreater(Main.EBV_FRAG_DEPTH_GREATER),
	EbvFragDepthLesser(Main.EBV_FRAG_DEPTH_LESSER),
	EbvGsOutputStream(Main.EBV_GS_OUTPUT_STREAM),
	EbvOutputPatch(Main.EBV_OUTPUT_PATCH),
	EbvInputPatch(Main.EBV_INPUT_PATCH),
	EbvAppendConsume(Main.EBV_APPEND_CONSUME),
	EbvRWStructuredBuffer(Main.EBV_RW_STRUCTURED_BUFFER),
	EbvStructuredBuffer(Main.EBV_STRUCTURED_BUFFER),
	EbvByteAddressBuffer(Main.EBV_BYTE_ADDRESS_BUFFER),
	EbvRWByteAddressBuffer(Main.EBV_RW_BYTE_ADDRESS_BUFFER);

	private final int value;

	private TBuiltInVariable(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TBuiltInVariable valueByStr(String str) {
		switch (str) {
			case "EbvNone":
				return EbvNone;
			case "EbvNumWorkGroups":
				return EbvNumWorkGroups;
			case "EbvWorkGroupSize":
				return EbvWorkGroupSize;
			case "EbvWorkGroupId":
				return EbvWorkGroupId;
			case "EbvLocalInvocationId":
				return EbvLocalInvocationId;
			case "EbvGlobalInvocationId":
				return EbvGlobalInvocationId;
			case "EbvLocalInvocationIndex":
				return EbvLocalInvocationIndex;
			case "EbvNumSubgroups":
				return EbvNumSubgroups;
			case "EbvSubgroupID":
				return EbvSubgroupID;
			case "EbvSubGroupSize":
				return EbvSubGroupSize;
			case "EbvSubGroupInvocation":
				return EbvSubGroupInvocation;
			case "EbvSubGroupEqMask":
				return EbvSubGroupEqMask;
			case "EbvSubGroupGeMask":
				return EbvSubGroupGeMask;
			case "EbvSubGroupGtMask":
				return EbvSubGroupGtMask;
			case "EbvSubGroupLeMask":
				return EbvSubGroupLeMask;
			case "EbvSubGroupLtMask":
				return EbvSubGroupLtMask;
			case "EbvSubgroupSize2":
				return EbvSubgroupSize2;
			case "EbvSubgroupInvocation2":
				return EbvSubgroupInvocation2;
			case "EbvSubgroupEqMask2":
				return EbvSubgroupEqMask2;
			case "EbvSubgroupGeMask2":
				return EbvSubgroupGeMask2;
			case "EbvSubgroupGtMask2":
				return EbvSubgroupGtMask2;
			case "EbvSubgroupLeMask2":
				return EbvSubgroupLeMask2;
			case "EbvSubgroupLtMask2":
				return EbvSubgroupLtMask2;
			case "EbvVertexId":
				return EbvVertexId;
			case "EbvInstanceId":
				return EbvInstanceId;
			case "EbvVertexIndex":
				return EbvVertexIndex;
			case "EbvInstanceIndex":
				return EbvInstanceIndex;
			case "EbvBaseVertex":
				return EbvBaseVertex;
			case "EbvBaseInstance":
				return EbvBaseInstance;
			case "EbvDrawId":
				return EbvDrawId;
			case "EbvPosition":
				return EbvPosition;
			case "EbvPointSize":
				return EbvPointSize;
			case "EbvClipVertex":
				return EbvClipVertex;
			case "EbvClipDistance":
				return EbvClipDistance;
			case "EbvCullDistance":
				return EbvCullDistance;
			case "EbvNormal":
				return EbvNormal;
			case "EbvVertex":
				return EbvVertex;
			case "EbvMultiTexCoord0":
				return EbvMultiTexCoord0;
			case "EbvMultiTexCoord1":
				return EbvMultiTexCoord1;
			case "EbvMultiTexCoord2":
				return EbvMultiTexCoord2;
			case "EbvMultiTexCoord3":
				return EbvMultiTexCoord3;
			case "EbvMultiTexCoord4":
				return EbvMultiTexCoord4;
			case "EbvMultiTexCoord5":
				return EbvMultiTexCoord5;
			case "EbvMultiTexCoord6":
				return EbvMultiTexCoord6;
			case "EbvMultiTexCoord7":
				return EbvMultiTexCoord7;
			case "EbvFrontColor":
				return EbvFrontColor;
			case "EbvBackColor":
				return EbvBackColor;
			case "EbvFrontSecondaryColor":
				return EbvFrontSecondaryColor;
			case "EbvBackSecondaryColor":
				return EbvBackSecondaryColor;
			case "EbvTexCoord":
				return EbvTexCoord;
			case "EbvFogFragCoord":
				return EbvFogFragCoord;
			case "EbvInvocationId":
				return EbvInvocationId;
			case "EbvPrimitiveId":
				return EbvPrimitiveId;
			case "EbvLayer":
				return EbvLayer;
			case "EbvViewportIndex":
				return EbvViewportIndex;
			case "EbvPatchVertices":
				return EbvPatchVertices;
			case "EbvTessLevelOuter":
				return EbvTessLevelOuter;
			case "EbvTessLevelInner":
				return EbvTessLevelInner;
			case "EbvBoundingBox":
				return EbvBoundingBox;
			case "EbvTessCoord":
				return EbvTessCoord;
			case "EbvColor":
				return EbvColor;
			case "EbvSecondaryColor":
				return EbvSecondaryColor;
			case "EbvFace":
				return EbvFace;
			case "EbvFragCoord":
				return EbvFragCoord;
			case "EbvPointCoord":
				return EbvPointCoord;
			case "EbvFragColor":
				return EbvFragColor;
			case "EbvFragData":
				return EbvFragData;
			case "EbvFragDepth":
				return EbvFragDepth;
			case "EbvFragStencilRef":
				return EbvFragStencilRef;
			case "EbvSampleId":
				return EbvSampleId;
			case "EbvSamplePosition":
				return EbvSamplePosition;
			case "EbvSampleMask":
				return EbvSampleMask;
			case "EbvHelperInvocation":
				return EbvHelperInvocation;
			case "EbvBaryCoordNoPersp":
				return EbvBaryCoordNoPersp;
			case "EbvBaryCoordNoPerspCentroid":
				return EbvBaryCoordNoPerspCentroid;
			case "EbvBaryCoordNoPerspSample":
				return EbvBaryCoordNoPerspSample;
			case "EbvBaryCoordSmooth":
				return EbvBaryCoordSmooth;
			case "EbvBaryCoordSmoothCentroid":
				return EbvBaryCoordSmoothCentroid;
			case "EbvBaryCoordSmoothSample":
				return EbvBaryCoordSmoothSample;
			case "EbvBaryCoordPullModel":
				return EbvBaryCoordPullModel;
			case "EbvViewIndex":
				return EbvViewIndex;
			case "EbvDeviceIndex":
				return EbvDeviceIndex;
			case "EbvFragSizeEXT":
				return EbvFragSizeEXT;
			case "EbvFragInvocationCountEXT":
				return EbvFragInvocationCountEXT;
			case "EbvSecondaryFragDataEXT":
				return EbvSecondaryFragDataEXT;
			case "EbvSecondaryFragColorEXT":
				return EbvSecondaryFragColorEXT;
			case "EbvViewportMaskNV":
				return EbvViewportMaskNV;
			case "EbvSecondaryPositionNV":
				return EbvSecondaryPositionNV;
			case "EbvSecondaryViewportMaskNV":
				return EbvSecondaryViewportMaskNV;
			case "EbvPositionPerViewNV":
				return EbvPositionPerViewNV;
			case "EbvViewportMaskPerViewNV":
				return EbvViewportMaskPerViewNV;
			case "EbvFragFullyCoveredNV":
				return EbvFragFullyCoveredNV;
			case "EbvFragmentSizeNV":
				return EbvFragmentSizeNV;
			case "EbvInvocationsPerPixelNV":
				return EbvInvocationsPerPixelNV;
			case "EbvLaunchId":
				return EbvLaunchId;
			case "EbvLaunchSize":
				return EbvLaunchSize;
			case "EbvInstanceCustomIndex":
				return EbvInstanceCustomIndex;
			case "EbvGeometryIndex":
				return EbvGeometryIndex;
			case "EbvWorldRayOrigin":
				return EbvWorldRayOrigin;
			case "EbvWorldRayDirection":
				return EbvWorldRayDirection;
			case "EbvObjectRayOrigin":
				return EbvObjectRayOrigin;
			case "EbvObjectRayDirection":
				return EbvObjectRayDirection;
			case "EbvRayTmin":
				return EbvRayTmin;
			case "EbvRayTmax":
				return EbvRayTmax;
			case "EbvHitT":
				return EbvHitT;
			case "EbvHitKind":
				return EbvHitKind;
			case "EbvObjectToWorld":
				return EbvObjectToWorld;
			case "EbvObjectToWorld3x4":
				return EbvObjectToWorld3x4;
			case "EbvWorldToObject":
				return EbvWorldToObject;
			case "EbvWorldToObject3x4":
				return EbvWorldToObject3x4;
			case "EbvIncomingRayFlags":
				return EbvIncomingRayFlags;
			case "EbvBaryCoordNV":
				return EbvBaryCoordNV;
			case "EbvBaryCoordNoPerspNV":
				return EbvBaryCoordNoPerspNV;
			case "EbvTaskCountNV":
				return EbvTaskCountNV;
			case "EbvPrimitiveCountNV":
				return EbvPrimitiveCountNV;
			case "EbvPrimitiveIndicesNV":
				return EbvPrimitiveIndicesNV;
			case "EbvClipDistancePerViewNV":
				return EbvClipDistancePerViewNV;
			case "EbvCullDistancePerViewNV":
				return EbvCullDistancePerViewNV;
			case "EbvLayerPerViewNV":
				return EbvLayerPerViewNV;
			case "EbvMeshViewCountNV":
				return EbvMeshViewCountNV;
			case "EbvMeshViewIndicesNV":
				return EbvMeshViewIndicesNV;
			case "EbvWarpsPerSM":
				return EbvWarpsPerSM;
			case "EbvSMCount":
				return EbvSMCount;
			case "EbvWarpID":
				return EbvWarpID;
			case "EbvSMID":
				return EbvSMID;
			case "EbvFragDepthGreater":
				return EbvFragDepthGreater;
			case "EbvFragDepthLesser":
				return EbvFragDepthLesser;
			case "EbvGsOutputStream":
				return EbvGsOutputStream;
			case "EbvOutputPatch":
				return EbvOutputPatch;
			case "EbvInputPatch":
				return EbvInputPatch;
			case "EbvAppendConsume":
				return EbvAppendConsume;
			case "EbvRWStructuredBuffer":
				return EbvRWStructuredBuffer;
			case "EbvStructuredBuffer":
				return EbvStructuredBuffer;
			case "EbvByteAddressBuffer":
				return EbvByteAddressBuffer;
			case "EbvRWByteAddressBuffer":
				return EbvRWByteAddressBuffer;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TBuiltInVariable valueByConstant(int constant) {
		switch (constant) {
			case Main.EBV_NONE:
				return EbvNone;
			case Main.EBV_NUM_WORK_GROUPS:
				return EbvNumWorkGroups;
			case Main.EBV_WORK_GROUP_SIZE:
				return EbvWorkGroupSize;
			case Main.EBV_WORK_GROUP_ID:
				return EbvWorkGroupId;
			case Main.EBV_LOCAL_INVOCATION_ID:
				return EbvLocalInvocationId;
			case Main.EBV_GLOBAL_INVOCATION_ID:
				return EbvGlobalInvocationId;
			case Main.EBV_LOCAL_INVOCATION_INDEX:
				return EbvLocalInvocationIndex;
			case Main.EBV_NUM_SUBGROUPS:
				return EbvNumSubgroups;
			case Main.EBV_SUBGROUP_ID:
				return EbvSubgroupID;
			case Main.EBV_SUB_GROUP_SIZE:
				return EbvSubGroupSize;
			case Main.EBV_SUB_GROUP_INVOCATION:
				return EbvSubGroupInvocation;
			case Main.EBV_SUB_GROUP_EQ_MASK:
				return EbvSubGroupEqMask;
			case Main.EBV_SUB_GROUP_GE_MASK:
				return EbvSubGroupGeMask;
			case Main.EBV_SUB_GROUP_GT_MASK:
				return EbvSubGroupGtMask;
			case Main.EBV_SUB_GROUP_LE_MASK:
				return EbvSubGroupLeMask;
			case Main.EBV_SUB_GROUP_LT_MASK:
				return EbvSubGroupLtMask;
			case Main.EBV_SUBGROUP_SIZE2:
				return EbvSubgroupSize2;
			case Main.EBV_SUBGROUP_INVOCATION2:
				return EbvSubgroupInvocation2;
			case Main.EBV_SUBGROUP_EQ_MASK2:
				return EbvSubgroupEqMask2;
			case Main.EBV_SUBGROUP_GE_MASK2:
				return EbvSubgroupGeMask2;
			case Main.EBV_SUBGROUP_GT_MASK2:
				return EbvSubgroupGtMask2;
			case Main.EBV_SUBGROUP_LE_MASK2:
				return EbvSubgroupLeMask2;
			case Main.EBV_SUBGROUP_LT_MASK2:
				return EbvSubgroupLtMask2;
			case Main.EBV_VERTEX_ID:
				return EbvVertexId;
			case Main.EBV_INSTANCE_ID:
				return EbvInstanceId;
			case Main.EBV_VERTEX_INDEX:
				return EbvVertexIndex;
			case Main.EBV_INSTANCE_INDEX:
				return EbvInstanceIndex;
			case Main.EBV_BASE_VERTEX:
				return EbvBaseVertex;
			case Main.EBV_BASE_INSTANCE:
				return EbvBaseInstance;
			case Main.EBV_DRAW_ID:
				return EbvDrawId;
			case Main.EBV_POSITION:
				return EbvPosition;
			case Main.EBV_POINT_SIZE:
				return EbvPointSize;
			case Main.EBV_CLIP_VERTEX:
				return EbvClipVertex;
			case Main.EBV_CLIP_DISTANCE:
				return EbvClipDistance;
			case Main.EBV_CULL_DISTANCE:
				return EbvCullDistance;
			case Main.EBV_NORMAL:
				return EbvNormal;
			case Main.EBV_VERTEX:
				return EbvVertex;
			case Main.EBV_MULTI_TEX_COOR0:
				return EbvMultiTexCoord0;
			case Main.EBV_MULTI_TEX_COORD1:
				return EbvMultiTexCoord1;
			case Main.EBV_MULTI_TEX_COORD2:
				return EbvMultiTexCoord2;
			case Main.EBV_MULTI_TEX_COORD3:
				return EbvMultiTexCoord3;
			case Main.EBV_MULTI_TEX_COORD4:
				return EbvMultiTexCoord4;
			case Main.EBV_MULTI_TEX_COORD5:
				return EbvMultiTexCoord5;
			case Main.EBV_MULTI_TEX_COORD6:
				return EbvMultiTexCoord6;
			case Main.EBV_MULTI_TEX_COORD7:
				return EbvMultiTexCoord7;
			case Main.EBV_FRONT_COLOR:
				return EbvFrontColor;
			case Main.EBV_BACK_COLOR:
				return EbvBackColor;
			case Main.EBV_FRONT_SECONDARY_COLOR:
				return EbvFrontSecondaryColor;
			case Main.EBV_BACK_SECONDARY_COLOR:
				return EbvBackSecondaryColor;
			case Main.EBV_TEX_COORD:
				return EbvTexCoord;
			case Main.EBV_FOG_FRAG_COORD:
				return EbvFogFragCoord;
			case Main.EBV_INVOCATION_ID:
				return EbvInvocationId;
			case Main.EBV_PRIMITIVE_ID:
				return EbvPrimitiveId;
			case Main.EBV_LAYER:
				return EbvLayer;
			case Main.EBV_VIEWPORT_INDEX:
				return EbvViewportIndex;
			case Main.EBV_PATCH_VERTICES:
				return EbvPatchVertices;
			case Main.EBV_TESS_LEVEL_OUTER:
				return EbvTessLevelOuter;
			case Main.EBV_TESS_LEVEL_INNER:
				return EbvTessLevelInner;
			case Main.EBV_BOUNDING_BOX:
				return EbvBoundingBox;
			case Main.EBV_TESS_COORD:
				return EbvTessCoord;
			case Main.EBV_COLOR:
				return EbvColor;
			case Main.EBV_SECONDARY_COLOR:
				return EbvSecondaryColor;
			case Main.EBV_FACE:
				return EbvFace;
			case Main.EBV_FRAG_COORD:
				return EbvFragCoord;
			case Main.EBV_POINT_COORD:
				return EbvPointCoord;
			case Main.EBV_FRAG_COLOR:
				return EbvFragColor;
			case Main.EBV_FRAG_DATA:
				return EbvFragData;
			case Main.EBV_FRAG_DEPTH:
				return EbvFragDepth;
			case Main.EBV_FRAG_STENCIL_REF:
				return EbvFragStencilRef;
			case Main.EBV_SAMPLE_ID:
				return EbvSampleId;
			case Main.EBV_SAMPLE_POSITION:
				return EbvSamplePosition;
			case Main.EBV_SAMPLE_MASK:
				return EbvSampleMask;
			case Main.EBV_HELPER_INVOCATION:
				return EbvHelperInvocation;
			case Main.EBV_BARY_COORD_NO_PERSP:
				return EbvBaryCoordNoPersp;
			case Main.EBV_BARY_COORD_NO_PERSP_CENTROID:
				return EbvBaryCoordNoPerspCentroid;
			case Main.EBV_BARY_COORD_NO_PERSP_SAMPLE:
				return EbvBaryCoordNoPerspSample;
			case Main.EBV_BARY_COORD_SMOOTH:
				return EbvBaryCoordSmooth;
			case Main.EBV_BARY_COORD_SMOOTH_CENTROID:
				return EbvBaryCoordSmoothCentroid;
			case Main.EBV_BARY_COORD_SMOOTH_SAMPLE:
				return EbvBaryCoordSmoothSample;
			case Main.EBV_BARY_COORD_PULL_MODEL:
				return EbvBaryCoordPullModel;
			case Main.EBV_VIEW_INDEX:
				return EbvViewIndex;
			case Main.EBV_DEVICE_INDEX:
				return EbvDeviceIndex;
			case Main.EBV_FRAG_SIZE_EXT:
				return EbvFragSizeEXT;
			case Main.EBV_FRAG_INVOCATION_COUNT_EXT:
				return EbvFragInvocationCountEXT;
			case Main.EBV_SECONDARY_FRAG_DATA_EXT:
				return EbvSecondaryFragDataEXT;
			case Main.EBV_SECONDARY_FRAG_COLOR_EXT:
				return EbvSecondaryFragColorEXT;
			case Main.EBV_VIEWPORT_MASK_NV:
				return EbvViewportMaskNV;
			case Main.EBV_SECONDARY_POSITION_NV:
				return EbvSecondaryPositionNV;
			case Main.EBV_SECONDARY_VIEWPORT_MASK_NV:
				return EbvSecondaryViewportMaskNV;
			case Main.EBV_POSITIONPER_VIEW_NV:
				return EbvPositionPerViewNV;
			case Main.EBV_VIEWPORT_MASK_PER_VIEW_NV:
				return EbvViewportMaskPerViewNV;
			case Main.EBV_FRAG_FULLY_COVERED_NV:
				return EbvFragFullyCoveredNV;
			case Main.EBV_FRAGMENT_SIZE_NV:
				return EbvFragmentSizeNV;
			case Main.EBV_INVOCATIONS_PER_PIXEL_NV:
				return EbvInvocationsPerPixelNV;
			case Main.EBV_LAUNCH_ID:
				return EbvLaunchId;
			case Main.EBV_LAUNCH_SIZE:
				return EbvLaunchSize;
			case Main.EBV_INSTANCE_CUSTOM_INDEX:
				return EbvInstanceCustomIndex;
			case Main.EBV_GEOMETRY_INDEX:
				return EbvGeometryIndex;
			case Main.EBV_WORLD_RAY_ORIGIN:
				return EbvWorldRayOrigin;
			case Main.EBV_WORLD_RAY_DIRECTION:
				return EbvWorldRayDirection;
			case Main.EBV_OBJECT_RAY_ORIGIN:
				return EbvObjectRayOrigin;
			case Main.EBV_OBJECT_RAY_DIRECTION:
				return EbvObjectRayDirection;
			case Main.EBV_RAY_TMIN:
				return EbvRayTmin;
			case Main.EBV_RAY_TMAX:
				return EbvRayTmax;
			case Main.EBV_HIT_T:
				return EbvHitT;
			case Main.EBV_HIT_KIND:
				return EbvHitKind;
			case Main.EBV_OBJECT_TO_WORLD:
				return EbvObjectToWorld;
			case Main.EBV_OBJECT_TO_WORLD3X4:
				return EbvObjectToWorld3x4;
			case Main.EBV_WORLD_TO_OBJECT:
				return EbvWorldToObject;
			case Main.EBV_WORLD_TO_OBJECT3X4:
				return EbvWorldToObject3x4;
			case Main.EBV_INCOMING_RAY_FLAGS:
				return EbvIncomingRayFlags;
			case Main.EBV_BARY_COORD_NV:
				return EbvBaryCoordNV;
			case Main.EBV_BARY_COORD_NO_PERSP_NV:
				return EbvBaryCoordNoPerspNV;
			case Main.EBV_TASK_COUNT_NV:
				return EbvTaskCountNV;
			case Main.EBV_PRIMITIVE_COUNT_NV:
				return EbvPrimitiveCountNV;
			case Main.EBV_PRIMITIVE_INDICES_NV:
				return EbvPrimitiveIndicesNV;
			case Main.EBV_CLIP_DISTANCE_PER_VIEW_NV:
				return EbvClipDistancePerViewNV;
			case Main.EBV_CULL_DISTANCE_PER_VIEW_NV:
				return EbvCullDistancePerViewNV;
			case Main.EBV_LAYER_PER_VIEW_NV:
				return EbvLayerPerViewNV;
			case Main.EBV_MESH_VIEW_COUNT_NV:
				return EbvMeshViewCountNV;
			case Main.EBV_MESH_VIEW_INDICES_NV:
				return EbvMeshViewIndicesNV;
			case Main.EBV_WARPS_PER_SM:
				return EbvWarpsPerSM;
			case Main.EBV_SM_COUNT:
				return EbvSMCount;
			case Main.EBV_WARP_ID:
				return EbvWarpID;
			case Main.EBV_SM_ID:
				return EbvSMID;
			case Main.EBV_FRAG_DEPTH_GREATER:
				return EbvFragDepthGreater;
			case Main.EBV_FRAG_DEPTH_LESSER:
				return EbvFragDepthLesser;
			case Main.EBV_GS_OUTPUT_STREAM:
				return EbvGsOutputStream;
			case Main.EBV_OUTPUT_PATCH:
				return EbvOutputPatch;
			case Main.EBV_INPUT_PATCH:
				return EbvInputPatch;
			case Main.EBV_APPEND_CONSUME:
				return EbvAppendConsume;
			case Main.EBV_RW_STRUCTURED_BUFFER:
				return EbvRWStructuredBuffer;
			case Main.EBV_STRUCTURED_BUFFER:
				return EbvStructuredBuffer;
			case Main.EBV_BYTE_ADDRESS_BUFFER:
				return EbvByteAddressBuffer;
			case Main.EBV_RW_BYTE_ADDRESS_BUFFER:
				return EbvRWByteAddressBuffer;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
