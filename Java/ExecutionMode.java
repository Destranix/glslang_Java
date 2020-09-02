package Java;

public enum ExecutionMode {
	ExecutionModeInvocations(Main.EXECUTION_MODE_INVOCATIONS),
	ExecutionModeSpacingEqual(Main.EXECUTION_MODE_SPACING_EQUAL),
	ExecutionModeSpacingFractionalEven(Main.EXECUTION_MODE_SPACING_FRACTIONAL_EVEN),
	ExecutionModeSpacingFractionalOdd(Main.EXECUTION_MODE_SPACING_FRACTIONAL_ODD),
	ExecutionModeVertexOrderCw(Main.EXECUTION_MODE_VERTEX_ORDER_CW),
	ExecutionModeVertexOrderCcw(Main.EXECUTION_MODE_VERTEX_ORDER_CCW),
	ExecutionModePixelCenterInteger(Main.EXECUTION_MODE_PIXEL_CENTER_INTEGER),
	ExecutionModeOriginUpperLeft(Main.EXECUTION_MODE_ORIGIN_UPPER_LEFT),
	ExecutionModeOriginLowerLeft(Main.EXECUTION_MODE_ORIGIN_LOWER_LEFT),
	ExecutionModeEarlyFragmentTests(Main.EXECUTION_MODE_EARLY_FRAGMENT_TESTS),
	ExecutionModePointMode(Main.EXECUTION_MODE_POINT_MODE),
	ExecutionModeXfb(Main.EXECUTION_MODE_XFB),
	ExecutionModeDepthReplacing(Main.EXECUTION_MODE_DEPTH_REPLACING),
	ExecutionModeDepthGreater(Main.EXECUTION_MODE_DEPTH_GREATER),
	ExecutionModeDepthLess(Main.EXECUTION_MODE_DEPTH_LESS),
	ExecutionModeDepthUnchanged(Main.EXECUTION_MODE_DEPTH_UNCHANGED),
	ExecutionModeLocalSize(Main.EXECUTION_MODE_LOCAL_SIZE),
	ExecutionModeLocalSizeHint(Main.EXECUTION_MODE_LOCAL_SIZE_HINT),
	ExecutionModeInputPoints(Main.EXECUTION_MODE_INPUT_POINTS),
	ExecutionModeInputLines(Main.EXECUTION_MODE_INPUT_LINES),
	ExecutionModeInputLinesAdjacency(Main.EXECUTION_MODE_INPUT_LINES_ADJACENCY),
	ExecutionModeTriangles(Main.EXECUTION_MODE_TRIANGLES),
	ExecutionModeInputTrianglesAdjacency(Main.EXECUTION_MODE_INPUT_TRIANGLES_ADJACENCY),
	ExecutionModeQuads(Main.EXECUTION_MODE_QUADS),
	ExecutionModeIsolines(Main.EXECUTION_MODE_ISOLINES),
	ExecutionModeOutputVertices(Main.EXECUTION_MODE_OUTPUT_VERTICES),
	ExecutionModeOutputPoints(Main.EXECUTION_MODE_OUTPUT_POINTS),
	ExecutionModeOutputLineStrip(Main.EXECUTION_MODE_OUTPUT_LINE_STRIP),
	ExecutionModeOutputTriangleStrip(Main.EXECUTION_MODE_OUTPUT_TRIANGLE_STRIP),
	ExecutionModeVecTypeHint(Main.EXECUTION_MODE_VEC_TYPE_HINT),
	ExecutionModeContractionOff(Main.EXECUTION_MODE_CONTRACTION_OFF),
	ExecutionModeInitializer(Main.EXECUTION_MODE_INITIALIZER),
	ExecutionModeFinalizer(Main.EXECUTION_MODE_FINALIZER),
	ExecutionModeSubgroupSize(Main.EXECUTION_MODE_SUBGROUP_SIZE),
	ExecutionModeSubgroupsPerWorkgroup(Main.EXECUTION_MODE_SUBGROUPS_PER_WORKGROUP),
	ExecutionModeSubgroupsPerWorkgroupId(Main.EXECUTION_MODE_SUBGROUPS_PER_WORKGROUP_ID),
	ExecutionModeLocalSizeId(Main.EXECUTION_MODE_LOCAL_SIZE_ID),
	ExecutionModeLocalSizeHintId(Main.EXECUTION_MODE_LOCAL_SIZE_HINT_ID),
	ExecutionModePostDepthCoverage(Main.EXECUTION_MODE_POST_DEPTH_COVERAGE),
	ExecutionModeDenormPreserve(Main.EXECUTION_MODE_DENORM_PRESERVE),
	ExecutionModeDenormFlushToZero(Main.EXECUTION_MODE_DENORM_FLUSH_TO_ZERO),
	ExecutionModeSignedZeroInfNanPreserve(Main.EXECUTION_MODE_SIGNED_ZERO_INF_NAN_PRESERVE),
	ExecutionModeRoundingModeRTE(Main.EXECUTION_MODE_ROUNDING_MODE_RTE),
	ExecutionModeRoundingModeRTZ(Main.EXECUTION_MODE_ROUNDING_MODE_RTZ),
	ExecutionModeStencilRefReplacingEXT(Main.EXECUTION_MODE_STENCIL_REF_REPLACING_EXT),
	ExecutionModeOutputLinesNV(Main.EXECUTION_MODE_OUTPUT_LINES_NV),
	ExecutionModeOutputPrimitivesNV(Main.EXECUTION_MODE_OUTPUT_PRIMITIVES_NV),
	ExecutionModeDerivativeGroupQuadsNV(Main.EXECUTION_MODE_DERIVATIVE_GROUP_QUADS_NV),
	ExecutionModeDerivativeGroupLinearNV(Main.EXECUTION_MODE_DERIVATIVE_GROUP_LINEAR_NV),
	ExecutionModeOutputTrianglesNV(Main.EXECUTION_MODE_OUTPUT_TRIANGLES_NV),
	ExecutionModePixelInterlockOrderedEXT(Main.EXECUTION_MODE_PIXEL_INTERLOCK_ORDERED_EXT),
	ExecutionModePixelInterlockUnorderedEXT(Main.EXECUTION_MODE_PIXEL_INTERLOCK_UNORDERED_EXT),
	ExecutionModeSampleInterlockOrderedEXT(Main.EXECUTION_MODE_SAMPLE_INTERLOCK_ORDERED_EXT),
	ExecutionModeSampleInterlockUnorderedEXT(Main.EXECUTION_MODE_SAMPLE_INTERLOCK_UNORDERED_EXT),
	ExecutionModeShadingRateInterlockOrderedEXT(Main.EXECUTION_MODE_SHADING_RATE_INTERLOCK_ORDERED_EXT),
	ExecutionModeShadingRateInterlockUnorderedEXT(Main.EXECUTION_MODE_SHADING_RATE_INTERLOCK_UNORDERED_EXT),
	ExecutionModeMaxWorkgroupSizeINTEL(Main.EXECUTION_MODE_MAX_WORKGROUP_SIZE_INTEL),
	ExecutionModeMaxWorkDimINTEL(Main.EXECUTION_MODE_MAX_WORK_DIM_INTEL),
	ExecutionModeNoGlobalOffsetINTEL(Main.EXECUTION_MODE_NO_GLOBAL_OFFSET_INTEL),
	ExecutionModeNumSIMDWorkitemsINTEL(Main.EXECUTION_MODE_NUM_SIMD_WORKITEMS_INTEL),
	ExecutionModeMax(Main.EXECUTION_MODE_MAX);

	private final int value;

	private ExecutionMode(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static ExecutionMode valueByStr(String str) {
		switch (str) {
			case "ExecutionModeInvocations":
				return ExecutionModeInvocations;
			case "ExecutionModeSpacingEqual":
				return ExecutionModeSpacingEqual;
			case "ExecutionModeSpacingFractionalEven":
				return ExecutionModeSpacingFractionalEven;
			case "ExecutionModeSpacingFractionalOdd":
				return ExecutionModeSpacingFractionalOdd;
			case "ExecutionModeVertexOrderCw":
				return ExecutionModeVertexOrderCw;
			case "ExecutionModeVertexOrderCcw":
				return ExecutionModeVertexOrderCcw;
			case "ExecutionModePixelCenterInteger":
				return ExecutionModePixelCenterInteger;
			case "ExecutionModeOriginUpperLeft":
				return ExecutionModeOriginUpperLeft;
			case "ExecutionModeOriginLowerLeft":
				return ExecutionModeOriginLowerLeft;
			case "ExecutionModeEarlyFragmentTests":
				return ExecutionModeEarlyFragmentTests;
			case "ExecutionModePointMode":
				return ExecutionModePointMode;
			case "ExecutionModeXfb":
				return ExecutionModeXfb;
			case "ExecutionModeDepthReplacing":
				return ExecutionModeDepthReplacing;
			case "ExecutionModeDepthGreater":
				return ExecutionModeDepthGreater;
			case "ExecutionModeDepthLess":
				return ExecutionModeDepthLess;
			case "ExecutionModeDepthUnchanged":
				return ExecutionModeDepthUnchanged;
			case "ExecutionModeLocalSize":
				return ExecutionModeLocalSize;
			case "ExecutionModeLocalSizeHint":
				return ExecutionModeLocalSizeHint;
			case "ExecutionModeInputPoints":
				return ExecutionModeInputPoints;
			case "ExecutionModeInputLines":
				return ExecutionModeInputLines;
			case "ExecutionModeInputLinesAdjacency":
				return ExecutionModeInputLinesAdjacency;
			case "ExecutionModeTriangles":
				return ExecutionModeTriangles;
			case "ExecutionModeInputTrianglesAdjacency":
				return ExecutionModeInputTrianglesAdjacency;
			case "ExecutionModeQuads":
				return ExecutionModeQuads;
			case "ExecutionModeIsolines":
				return ExecutionModeIsolines;
			case "ExecutionModeOutputVertices":
				return ExecutionModeOutputVertices;
			case "ExecutionModeOutputPoints":
				return ExecutionModeOutputPoints;
			case "ExecutionModeOutputLineStrip":
				return ExecutionModeOutputLineStrip;
			case "ExecutionModeOutputTriangleStrip":
				return ExecutionModeOutputTriangleStrip;
			case "ExecutionModeVecTypeHint":
				return ExecutionModeVecTypeHint;
			case "ExecutionModeContractionOff":
				return ExecutionModeContractionOff;
			case "ExecutionModeInitializer":
				return ExecutionModeInitializer;
			case "ExecutionModeFinalizer":
				return ExecutionModeFinalizer;
			case "ExecutionModeSubgroupSize":
				return ExecutionModeSubgroupSize;
			case "ExecutionModeSubgroupsPerWorkgroup":
				return ExecutionModeSubgroupsPerWorkgroup;
			case "ExecutionModeSubgroupsPerWorkgroupId":
				return ExecutionModeSubgroupsPerWorkgroupId;
			case "ExecutionModeLocalSizeId":
				return ExecutionModeLocalSizeId;
			case "ExecutionModeLocalSizeHintId":
				return ExecutionModeLocalSizeHintId;
			case "ExecutionModePostDepthCoverage":
				return ExecutionModePostDepthCoverage;
			case "ExecutionModeDenormPreserve":
				return ExecutionModeDenormPreserve;
			case "ExecutionModeDenormFlushToZero":
				return ExecutionModeDenormFlushToZero;
			case "ExecutionModeSignedZeroInfNanPreserve":
				return ExecutionModeSignedZeroInfNanPreserve;
			case "ExecutionModeRoundingModeRTE":
				return ExecutionModeRoundingModeRTE;
			case "ExecutionModeRoundingModeRTZ":
				return ExecutionModeRoundingModeRTZ;
			case "ExecutionModeStencilRefReplacingEXT":
				return ExecutionModeStencilRefReplacingEXT;
			case "ExecutionModeOutputLinesNV":
				return ExecutionModeOutputLinesNV;
			case "ExecutionModeOutputPrimitivesNV":
				return ExecutionModeOutputPrimitivesNV;
			case "ExecutionModeDerivativeGroupQuadsNV":
				return ExecutionModeDerivativeGroupQuadsNV;
			case "ExecutionModeDerivativeGroupLinearNV":
				return ExecutionModeDerivativeGroupLinearNV;
			case "ExecutionModeOutputTrianglesNV":
				return ExecutionModeOutputTrianglesNV;
			case "ExecutionModePixelInterlockOrderedEXT":
				return ExecutionModePixelInterlockOrderedEXT;
			case "ExecutionModePixelInterlockUnorderedEXT":
				return ExecutionModePixelInterlockUnorderedEXT;
			case "ExecutionModeSampleInterlockOrderedEXT":
				return ExecutionModeSampleInterlockOrderedEXT;
			case "ExecutionModeSampleInterlockUnorderedEXT":
				return ExecutionModeSampleInterlockUnorderedEXT;
			case "ExecutionModeShadingRateInterlockOrderedEXT":
				return ExecutionModeShadingRateInterlockOrderedEXT;
			case "ExecutionModeShadingRateInterlockUnorderedEXT":
				return ExecutionModeShadingRateInterlockUnorderedEXT;
			case "ExecutionModeMaxWorkgroupSizeINTEL":
				return ExecutionModeMaxWorkgroupSizeINTEL;
			case "ExecutionModeMaxWorkDimINTEL":
				return ExecutionModeMaxWorkDimINTEL;
			case "ExecutionModeNoGlobalOffsetINTEL":
				return ExecutionModeNoGlobalOffsetINTEL;
			case "ExecutionModeNumSIMDWorkitemsINTEL":
				return ExecutionModeNumSIMDWorkitemsINTEL;
			case "ExecutionModeMax":
				return ExecutionModeMax;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static ExecutionMode valueByConstant(int constant) {
		switch (constant) {
			case Main.EXECUTION_MODE_INVOCATIONS:
				return ExecutionModeInvocations;
			case Main.EXECUTION_MODE_SPACING_EQUAL:
				return ExecutionModeSpacingEqual;
			case Main.EXECUTION_MODE_SPACING_FRACTIONAL_EVEN:
				return ExecutionModeSpacingFractionalEven;
			case Main.EXECUTION_MODE_SPACING_FRACTIONAL_ODD:
				return ExecutionModeSpacingFractionalOdd;
			case Main.EXECUTION_MODE_VERTEX_ORDER_CW:
				return ExecutionModeVertexOrderCw;
			case Main.EXECUTION_MODE_VERTEX_ORDER_CCW:
				return ExecutionModeVertexOrderCcw;
			case Main.EXECUTION_MODE_PIXEL_CENTER_INTEGER:
				return ExecutionModePixelCenterInteger;
			case Main.EXECUTION_MODE_ORIGIN_UPPER_LEFT:
				return ExecutionModeOriginUpperLeft;
			case Main.EXECUTION_MODE_ORIGIN_LOWER_LEFT:
				return ExecutionModeOriginLowerLeft;
			case Main.EXECUTION_MODE_EARLY_FRAGMENT_TESTS:
				return ExecutionModeEarlyFragmentTests;
			case Main.EXECUTION_MODE_POINT_MODE:
				return ExecutionModePointMode;
			case Main.EXECUTION_MODE_XFB:
				return ExecutionModeXfb;
			case Main.EXECUTION_MODE_DEPTH_REPLACING:
				return ExecutionModeDepthReplacing;
			case Main.EXECUTION_MODE_DEPTH_GREATER:
				return ExecutionModeDepthGreater;
			case Main.EXECUTION_MODE_DEPTH_LESS:
				return ExecutionModeDepthLess;
			case Main.EXECUTION_MODE_DEPTH_UNCHANGED:
				return ExecutionModeDepthUnchanged;
			case Main.EXECUTION_MODE_LOCAL_SIZE:
				return ExecutionModeLocalSize;
			case Main.EXECUTION_MODE_LOCAL_SIZE_HINT:
				return ExecutionModeLocalSizeHint;
			case Main.EXECUTION_MODE_INPUT_POINTS:
				return ExecutionModeInputPoints;
			case Main.EXECUTION_MODE_INPUT_LINES:
				return ExecutionModeInputLines;
			case Main.EXECUTION_MODE_INPUT_LINES_ADJACENCY:
				return ExecutionModeInputLinesAdjacency;
			case Main.EXECUTION_MODE_TRIANGLES:
				return ExecutionModeTriangles;
			case Main.EXECUTION_MODE_INPUT_TRIANGLES_ADJACENCY:
				return ExecutionModeInputTrianglesAdjacency;
			case Main.EXECUTION_MODE_QUADS:
				return ExecutionModeQuads;
			case Main.EXECUTION_MODE_ISOLINES:
				return ExecutionModeIsolines;
			case Main.EXECUTION_MODE_OUTPUT_VERTICES:
				return ExecutionModeOutputVertices;
			case Main.EXECUTION_MODE_OUTPUT_POINTS:
				return ExecutionModeOutputPoints;
			case Main.EXECUTION_MODE_OUTPUT_LINE_STRIP:
				return ExecutionModeOutputLineStrip;
			case Main.EXECUTION_MODE_OUTPUT_TRIANGLE_STRIP:
				return ExecutionModeOutputTriangleStrip;
			case Main.EXECUTION_MODE_VEC_TYPE_HINT:
				return ExecutionModeVecTypeHint;
			case Main.EXECUTION_MODE_CONTRACTION_OFF:
				return ExecutionModeContractionOff;
			case Main.EXECUTION_MODE_INITIALIZER:
				return ExecutionModeInitializer;
			case Main.EXECUTION_MODE_FINALIZER:
				return ExecutionModeFinalizer;
			case Main.EXECUTION_MODE_SUBGROUP_SIZE:
				return ExecutionModeSubgroupSize;
			case Main.EXECUTION_MODE_SUBGROUPS_PER_WORKGROUP:
				return ExecutionModeSubgroupsPerWorkgroup;
			case Main.EXECUTION_MODE_SUBGROUPS_PER_WORKGROUP_ID:
				return ExecutionModeSubgroupsPerWorkgroupId;
			case Main.EXECUTION_MODE_LOCAL_SIZE_ID:
				return ExecutionModeLocalSizeId;
			case Main.EXECUTION_MODE_LOCAL_SIZE_HINT_ID:
				return ExecutionModeLocalSizeHintId;
			case Main.EXECUTION_MODE_POST_DEPTH_COVERAGE:
				return ExecutionModePostDepthCoverage;
			case Main.EXECUTION_MODE_DENORM_PRESERVE:
				return ExecutionModeDenormPreserve;
			case Main.EXECUTION_MODE_DENORM_FLUSH_TO_ZERO:
				return ExecutionModeDenormFlushToZero;
			case Main.EXECUTION_MODE_SIGNED_ZERO_INF_NAN_PRESERVE:
				return ExecutionModeSignedZeroInfNanPreserve;
			case Main.EXECUTION_MODE_ROUNDING_MODE_RTE:
				return ExecutionModeRoundingModeRTE;
			case Main.EXECUTION_MODE_ROUNDING_MODE_RTZ:
				return ExecutionModeRoundingModeRTZ;
			case Main.EXECUTION_MODE_STENCIL_REF_REPLACING_EXT:
				return ExecutionModeStencilRefReplacingEXT;
			case Main.EXECUTION_MODE_OUTPUT_LINES_NV:
				return ExecutionModeOutputLinesNV;
			case Main.EXECUTION_MODE_OUTPUT_PRIMITIVES_NV:
				return ExecutionModeOutputPrimitivesNV;
			case Main.EXECUTION_MODE_DERIVATIVE_GROUP_QUADS_NV:
				return ExecutionModeDerivativeGroupQuadsNV;
			case Main.EXECUTION_MODE_DERIVATIVE_GROUP_LINEAR_NV:
				return ExecutionModeDerivativeGroupLinearNV;
			case Main.EXECUTION_MODE_OUTPUT_TRIANGLES_NV:
				return ExecutionModeOutputTrianglesNV;
			case Main.EXECUTION_MODE_PIXEL_INTERLOCK_ORDERED_EXT:
				return ExecutionModePixelInterlockOrderedEXT;
			case Main.EXECUTION_MODE_PIXEL_INTERLOCK_UNORDERED_EXT:
				return ExecutionModePixelInterlockUnorderedEXT;
			case Main.EXECUTION_MODE_SAMPLE_INTERLOCK_ORDERED_EXT:
				return ExecutionModeSampleInterlockOrderedEXT;
			case Main.EXECUTION_MODE_SAMPLE_INTERLOCK_UNORDERED_EXT:
				return ExecutionModeSampleInterlockUnorderedEXT;
			case Main.EXECUTION_MODE_SHADING_RATE_INTERLOCK_ORDERED_EXT:
				return ExecutionModeShadingRateInterlockOrderedEXT;
			case Main.EXECUTION_MODE_SHADING_RATE_INTERLOCK_UNORDERED_EXT:
				return ExecutionModeShadingRateInterlockUnorderedEXT;
			case Main.EXECUTION_MODE_MAX_WORKGROUP_SIZE_INTEL:
				return ExecutionModeMaxWorkgroupSizeINTEL;
			case Main.EXECUTION_MODE_MAX_WORK_DIM_INTEL:
				return ExecutionModeMaxWorkDimINTEL;
			case Main.EXECUTION_MODE_NO_GLOBAL_OFFSET_INTEL:
				return ExecutionModeNoGlobalOffsetINTEL;
			case Main.EXECUTION_MODE_NUM_SIMD_WORKITEMS_INTEL:
				return ExecutionModeNumSIMDWorkitemsINTEL;
			case Main.EXECUTION_MODE_MAX:
				return ExecutionModeMax;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
