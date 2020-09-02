package Java;

public enum TStorageQualifier {
	EvqTemporary(Main.EVQ_TEMPORARY),
	EvqGlobal(Main.EVQ_GLOBAL),
	EvqConst(Main.EVQ_CONST),
	EvqVaryingIn(Main.EVQ_VARYING_IN),
	EvqVaryingOut(Main.EVQ_VARYING_OUT),
	EvqUniform(Main.EVQ_UNIFORM),
	EvqBuffer(Main.EVQ_BUFFER),
	EvqShared(Main.EVQ_SHARED),
	EvqPayload(Main.EVQ_PAYLOAD),
	EvqPayloadIn(Main.EVQ_PAYLOAD_IN),
	EvqHitAttr(Main.EVQ_HIT_ATTR),
	EvqCallableData(Main.EVQ_CALLABLE_DATA),
	EvqCallableDataIn(Main.EVQ_CALLABLE_DATA_IN),
	EvqIn(Main.EVQ_IN),
	EvqOut(Main.EVQ_OUT),
	EvqInOut(Main.EVQ_IN_OUT),
	EvqConstReadOnly(Main.EVQ_CONST_READ_ONLY),
	EvqVertexId(Main.EVQ_VERTEX_ID),
	EvqInstanceId(Main.EVQ_INSTANCE_ID),
	EvqPosition(Main.EVQ_POSITION),
	EvqPointSize(Main.EVQ_POINT_SIZE),
	EvqClipVertex(Main.EVQ_CLIP_VERTEX),
	EvqFace(Main.EVQ_FACE),
	EvqFragCoord(Main.EVQ_FRAG_COORD),
	EvqPointCoord(Main.EVQ_POINT_COORD),
	EvqFragColor(Main.EVQ_FRAG_COLOR),
	EvqFragDepth(Main.EVQ_FRAG_DEPTH);

	private final int value;

	private TStorageQualifier(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TStorageQualifier valueByStr(String str) {
		switch (str) {
			case "EvqTemporary":
				return EvqTemporary;
			case "EvqGlobal":
				return EvqGlobal;
			case "EvqConst":
				return EvqConst;
			case "EvqVaryingIn":
				return EvqVaryingIn;
			case "EvqVaryingOut":
				return EvqVaryingOut;
			case "EvqUniform":
				return EvqUniform;
			case "EvqBuffer":
				return EvqBuffer;
			case "EvqShared":
				return EvqShared;
			case "EvqPayload":
				return EvqPayload;
			case "EvqPayloadIn":
				return EvqPayloadIn;
			case "EvqHitAttr":
				return EvqHitAttr;
			case "EvqCallableData":
				return EvqCallableData;
			case "EvqCallableDataIn":
				return EvqCallableDataIn;
			case "EvqIn":
				return EvqIn;
			case "EvqOut":
				return EvqOut;
			case "EvqInOut":
				return EvqInOut;
			case "EvqConstReadOnly":
				return EvqConstReadOnly;
			case "EvqVertexId":
				return EvqVertexId;
			case "EvqInstanceId":
				return EvqInstanceId;
			case "EvqPosition":
				return EvqPosition;
			case "EvqPointSize":
				return EvqPointSize;
			case "EvqClipVertex":
				return EvqClipVertex;
			case "EvqFace":
				return EvqFace;
			case "EvqFragCoord":
				return EvqFragCoord;
			case "EvqPointCoord":
				return EvqPointCoord;
			case "EvqFragColor":
				return EvqFragColor;
			case "EvqFragDepth":
				return EvqFragDepth;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TStorageQualifier valueByConstant(int constant) {
		switch (constant) {
			case Main.EVQ_TEMPORARY:
				return EvqTemporary;
			case Main.EVQ_GLOBAL:
				return EvqGlobal;
			case Main.EVQ_CONST:
				return EvqConst;
			case Main.EVQ_VARYING_IN:
				return EvqVaryingIn;
			case Main.EVQ_VARYING_OUT:
				return EvqVaryingOut;
			case Main.EVQ_UNIFORM:
				return EvqUniform;
			case Main.EVQ_BUFFER:
				return EvqBuffer;
			case Main.EVQ_SHARED:
				return EvqShared;
			case Main.EVQ_PAYLOAD:
				return EvqPayload;
			case Main.EVQ_PAYLOAD_IN:
				return EvqPayloadIn;
			case Main.EVQ_HIT_ATTR:
				return EvqHitAttr;
			case Main.EVQ_CALLABLE_DATA:
				return EvqCallableData;
			case Main.EVQ_CALLABLE_DATA_IN:
				return EvqCallableDataIn;
			case Main.EVQ_IN:
				return EvqIn;
			case Main.EVQ_OUT:
				return EvqOut;
			case Main.EVQ_IN_OUT:
				return EvqInOut;
			case Main.EVQ_CONST_READ_ONLY:
				return EvqConstReadOnly;
			case Main.EVQ_VERTEX_ID:
				return EvqVertexId;
			case Main.EVQ_INSTANCE_ID:
				return EvqInstanceId;
			case Main.EVQ_POSITION:
				return EvqPosition;
			case Main.EVQ_POINT_SIZE:
				return EvqPointSize;
			case Main.EVQ_CLIP_VERTEX:
				return EvqClipVertex;
			case Main.EVQ_FACE:
				return EvqFace;
			case Main.EVQ_FRAG_COORD:
				return EvqFragCoord;
			case Main.EVQ_POINT_COORD:
				return EvqPointCoord;
			case Main.EVQ_FRAG_COLOR:
				return EvqFragColor;
			case Main.EVQ_FRAG_DEPTH:
				return EvqFragDepth;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
