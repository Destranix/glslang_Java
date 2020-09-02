package com.destranix.glslang;

public class TShaderQualifiers extends PointerBoundObject {

	private final TLayoutGeometry geometry;
	private final boolean pixelCenterInteger;
	private final boolean originUpperLeft;
	private final int invocations;
	private final int vertices;
	private final TVertexSpacing spacing;
	private final TVertexOrder order;
	private final boolean pointMode;
	private final int[] localSize;
	private final boolean[] localSizeNotDefault;
	private final int[] localSizeSpecId;
	private final boolean earlyFragmentTests;
	private final boolean postDepthCoverage;
	private final TLayoutDepth layoutDepth;
	private final boolean blendEquation;
	private final int numViews;
	private final TInterlockOrdering interlockOrdering;
	private final boolean layoutOverrideCoverage;
	private final boolean layoutDerivativeGroupQuads;
	private final boolean layoutDerivativeGroupLinear;
	private final int primitives;
	private final boolean layoutPrimitiveCulling;
	private final int constructorIndex;

	public TShaderQualifiers() {
		this.geometry = null;
		this.pixelCenterInteger = false;
		this.originUpperLeft = false;
		this.invocations = -1;
		this.vertices = -1;
		this.spacing = null;
		this.order = null;
		this.pointMode = false;
		this.localSize = null;
		this.localSizeNotDefault = null;
		this.localSizeSpecId = null;
		this.earlyFragmentTests = false;
		this.postDepthCoverage = false;
		this.layoutDepth = null;
		this.blendEquation = false;
		this.numViews = -1;
		this.interlockOrdering = null;
		this.layoutOverrideCoverage = false;
		this.layoutDerivativeGroupQuads = false;
		this.layoutDerivativeGroupLinear = false;
		this.primitives = -1;
		this.layoutPrimitiveCulling = false;
		this.constructorIndex = 0;
		load();
	}

	public TShaderQualifiers(TLayoutGeometry geometry, boolean pixelCenterInteger, boolean originUpperLeft,
			int invocations, int vertices, TVertexSpacing spacing, TVertexOrder order, boolean pointMode,
			int[] localSize, boolean[] localSizeNotDefault, int[] localSizeSpecId, boolean earlyFragmentTests,
			boolean postDepthCoverage, TLayoutDepth layoutDepth, boolean blendEquation, int numViews,
			TInterlockOrdering interlockOrdering, boolean layoutOverrideCoverage, boolean layoutDerivativeGroupQuads,
			boolean layoutDerivativeGroupLinear, int primitives, boolean layoutPrimitiveCulling) {
		this.geometry = geometry;
		this.pixelCenterInteger = pixelCenterInteger;
		this.originUpperLeft = originUpperLeft;
		this.invocations = invocations;
		this.vertices = vertices;
		this.spacing = spacing;
		this.order = order;
		this.pointMode = pointMode;
		this.localSize = localSize;
		this.localSizeNotDefault = localSizeNotDefault;
		this.localSizeSpecId = localSizeSpecId;
		this.earlyFragmentTests = earlyFragmentTests;
		this.postDepthCoverage = postDepthCoverage;
		this.layoutDepth = layoutDepth;
		this.blendEquation = blendEquation;
		this.numViews = numViews;
		this.interlockOrdering = interlockOrdering;
		this.layoutOverrideCoverage = layoutOverrideCoverage;
		this.layoutDerivativeGroupQuads = layoutDerivativeGroupQuads;
		this.layoutDerivativeGroupLinear = layoutDerivativeGroupLinear;
		this.primitives = primitives;
		this.layoutPrimitiveCulling = layoutPrimitiveCulling;
		this.constructorIndex = 1;
		load();
	}

	protected TShaderQualifiers(byte[] ptr) {
		this.ptr = ptr;
		this.geometry = null;
		this.pixelCenterInteger = false;
		this.originUpperLeft = false;
		this.invocations = -1;
		this.vertices = -1;
		this.spacing = null;
		this.order = null;
		this.pointMode = false;
		this.localSize = null;
		this.localSizeNotDefault = null;
		this.localSizeSpecId = null;
		this.earlyFragmentTests = false;
		this.postDepthCoverage = false;
		this.layoutDepth = null;
		this.blendEquation = false;
		this.numViews = -1;
		this.interlockOrdering = null;
		this.layoutOverrideCoverage = false;
		this.layoutDerivativeGroupQuads = false;
		this.layoutDerivativeGroupLinear = false;
		this.primitives = -1;
		this.layoutPrimitiveCulling = false;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TShaderQualifiers();
					break;
				case 1:
					ptr = Main.TShaderQualifiers(geometry, pixelCenterInteger, originUpperLeft, invocations, vertices,
							spacing, order, pointMode, localSize, localSizeNotDefault, localSizeSpecId,
							earlyFragmentTests, postDepthCoverage, layoutDepth, blendEquation, numViews,
							interlockOrdering, layoutOverrideCoverage, layoutDerivativeGroupQuads,
							layoutDerivativeGroupLinear, primitives, layoutPrimitiveCulling);
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	@Override
	protected void free_intern() {
		if (ptr != null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_FREEABLE);
				case 0:
				case 1:
					Main.delete(ptr);
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public TLayoutDepth getDepth() {
		return TLayoutDepth.valueByConstant(Main.TShaderQualifiers_getDepth(ptr));
	}

	public void init() {
		Main.TShaderQualifiers_init(ptr);
	}

	public boolean hasBlendEquation() {
		return Main.TShaderQualifiers_hasBlendEquation(ptr);
	}

	public void merge(TShaderQualifiers src) {
		Main.TShaderQualifiers_merge(ptr, src.getPtr());
	}

	public void setGeometry(TLayoutGeometry v) {
		Main.TShaderQualifiers_setGeometry(ptr, v);
	}

	public void setPixelCenterInteger(boolean v) {
		Main.TShaderQualifiers_setPixelCenterInteger(ptr, v);
	}

	public void setOriginUpperLeft(boolean v) {
		Main.TShaderQualifiers_setOriginUpperLeft(ptr, v);
	}

	public void setInvocations(int v) {
		Main.TShaderQualifiers_setInvocations(ptr, v);
	}

	public void setVertices(int v) {
		Main.TShaderQualifiers_setVertices(ptr, v);
	}

	public void setSpacing(TVertexSpacing v) {
		Main.TShaderQualifiers_setSpacing(ptr, v);
	}

	public void setOrder(TVertexOrder v) {
		Main.TShaderQualifiers_setOrder(ptr, v);
	}

	public void setPointMode(boolean v) {
		Main.TShaderQualifiers_setPointMode(ptr, v);
	}

	public void setLocalSize(int[] v) {
		Main.TShaderQualifiers_setLocalSize(ptr, v);
	}

	public void setLocalSizeNotDefault(boolean[] v) {
		Main.TShaderQualifiers_setLocalSizeNotDefault(ptr, v);
	}

	public void setLocalSizeSpecId(int[] v) {
		Main.TShaderQualifiers_setLocalSizeSpecId(ptr, v);
	}

	public void setEarlyFragmentTests(boolean v) {
		Main.TShaderQualifiers_setEarlyFragmentTests(ptr, v);
	}

	public void setPostDepthCoverage(boolean v) {
		Main.TShaderQualifiers_setPostDepthCoverage(ptr, v);
	}

	public void setLayoutDepth(TLayoutDepth v) {
		Main.TShaderQualifiers_setLayoutDepth(ptr, v);
	}

	public void setBlendEquation(boolean v) {
		Main.TShaderQualifiers_setBlendEquation(ptr, v);
	}

	public void setNumViews(int v) {
		Main.TShaderQualifiers_setNumViews(ptr, v);
	}

	public void setInterlockOrdering(TInterlockOrdering v) {
		Main.TShaderQualifiers_setInterlockOrdering(ptr, v);
	}

	public void setLayoutOverrideCoverage(boolean v) {
		Main.TShaderQualifiers_setLayoutOverrideCoverage(ptr, v);
	}

	public void setLayoutDerivativeGroupQuads(boolean v) {
		Main.TShaderQualifiers_setLayoutDerivativeGroupQuads(ptr, v);
	}

	public void setLayoutDerivativeGroupLinear(boolean v) {
		Main.TShaderQualifiers_setLayoutDerivativeGroupLinear(ptr, v);
	}

	public void setPrimitives(int v) {
		Main.TShaderQualifiers_setPrimitives(ptr, v);
	}

	public void setLayoutPrimitiveCulling(boolean v) {
		Main.TShaderQualifiers_setLayoutPrimitiveCulling(ptr, v);
	}

	public TLayoutGeometry getGeometry() {
		return TLayoutGeometry.valueByConstant(Main.TShaderQualifiers_getGeometry(ptr));
	}

	public boolean getPixelCenterInteger() {
		return Main.TShaderQualifiers_getPixelCenterInteger(ptr);
	}

	public boolean getOriginUpperLeft() {
		return Main.TShaderQualifiers_getOriginUpperLeft(ptr);
	}

	public int getInvocations() {
		return Main.TShaderQualifiers_getInvocations(ptr);
	}

	public int getVertices() {
		return Main.TShaderQualifiers_getVertices(ptr);
	}

	public TVertexSpacing getSpacing() {
		return TVertexSpacing.valueByConstant(Main.TShaderQualifiers_getSpacing(ptr));
	}

	public TVertexOrder getOrder() {
		return TVertexOrder.valueByConstant(Main.TShaderQualifiers_getOrder(ptr));
	}

	public boolean getPointMode() {
		return Main.TShaderQualifiers_getPointMode(ptr);
	}

	public int[] getLocalSize() {
		return Main.TShaderQualifiers_getLocalSize(ptr);
	}

	public boolean[] getLocalSizeNotDefault() {
		return Main.TShaderQualifiers_getLocalSizeNotDefault(ptr);
	}

	public int[] getLocalSizeSpecId() {
		return Main.TShaderQualifiers_getLocalSizeSpecId(ptr);
	}

	public boolean getEarlyFragmentTests() {
		return Main.TShaderQualifiers_getEarlyFragmentTests(ptr);
	}

	public boolean getPostDepthCoverage() {
		return Main.TShaderQualifiers_getPostDepthCoverage(ptr);
	}

	public TLayoutDepth getLayoutDepth() {
		return TLayoutDepth.valueByConstant(Main.TShaderQualifiers_getLayoutDepth(ptr));
	}

	public boolean getBlendEquation() {
		return Main.TShaderQualifiers_getBlendEquation(ptr);
	}

	public int getNumViews() {
		return Main.TShaderQualifiers_getNumViews(ptr);
	}

	public TInterlockOrdering getInterlockOrdering() {
		return TInterlockOrdering.valueByConstant(Main.TShaderQualifiers_getInterlockOrdering(ptr));
	}

	public boolean getLayoutOverrideCoverage() {
		return Main.TShaderQualifiers_getLayoutOverrideCoverage(ptr);
	}

	public boolean getLayoutDerivativeGroupQuads() {
		return Main.TShaderQualifiers_getLayoutDerivativeGroupQuads(ptr);
	}

	public boolean getLayoutDerivativeGroupLinear() {
		return Main.TShaderQualifiers_getLayoutDerivativeGroupLinear(ptr);
	}

	public int getPrimitives() {
		return Main.TShaderQualifiers_getPrimitives(ptr);
	}

	public boolean getLayoutPrimitiveCulling() {
		return Main.TShaderQualifiers_getLayoutPrimitiveCulling(ptr);
	}

}
