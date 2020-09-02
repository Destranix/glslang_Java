package Java;

public class TQualifier extends PointerBoundObject {

	private final int constructorIndex;

	public TQualifier() {
		this.constructorIndex = 0;
		load();
	}

	protected TQualifier(byte[] ptr) {
		this.ptr = ptr;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TQualifier();
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
					Main.delete(ptr);
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public void clear() {
		Main.TQualifier_clear(ptr);
	}

	public void makeTemporary() {
		Main.TQualifier_makeTemporary(ptr);
	}

	public void clearInterstage() {
		Main.TQualifier_clearInterstage(ptr);
	}

	public void clearInterpolation() {
		Main.TQualifier_clearInterpolation(ptr);
	}

	public void clearMemory() {
		Main.TQualifier_clearMemory(ptr);
	}

	public boolean isWriteOnly() {
		return Main.TQualifier_isWriteOnly(ptr);
	}

	public boolean isReadOnly() {
		return Main.TQualifier_isReadOnly(ptr);
	}

	public boolean isRestrict() {
		return Main.TQualifier_isRestrict(ptr);
	}

	public boolean isCoherent() {
		return Main.TQualifier_isCoherent(ptr);
	}

	public boolean isVolatile() {
		return Main.TQualifier_isVolatile(ptr);
	}

	public boolean isSample() {
		return Main.TQualifier_isSample(ptr);
	}

	public boolean isMemory() {
		return Main.TQualifier_isMemory(ptr);
	}

	public boolean isMemoryQualifierImageAndSSBOOnly() {
		return Main.TQualifier_isMemoryQualifierImageAndSSBOOnly(ptr);
	}

	public boolean bufferReferenceNeedsVulkanMemoryModel() {
		return Main.TQualifier_bufferReferenceNeedsVulkanMemoryModel(ptr);
	}

	public boolean isInterpolation() {
		return Main.TQualifier_isInterpolation(ptr);
	}

	public boolean isExplicitInterpolation() {
		return Main.TQualifier_isExplicitInterpolation(ptr);
	}

	public boolean isAuxiliary() {
		return Main.TQualifier_isAuxiliary(ptr);
	}

	public boolean isPatch() {
		return Main.TQualifier_isPatch(ptr);
	}

	public boolean isNoContraction() {
		return Main.TQualifier_isNoContraction(ptr);
	}

	public void setNoContraction() {
		Main.TQualifier_setNoContraction(ptr);
	}

	public boolean isPervertexNV() {
		return Main.TQualifier_isPervertexNV(ptr);
	}

	public boolean isPipeInput() {
		return Main.TQualifier_isPipeInput(ptr);
	}

	public boolean isPipeOutput() {
		return Main.TQualifier_isPipeOutput(ptr);
	}

	public boolean isParamInput() {
		return Main.TQualifier_isParamInput(ptr);
	}

	public boolean isParamOutput() {
		return Main.TQualifier_isParamOutput(ptr);
	}

	public boolean isUniformOrBuffer() {
		return Main.TQualifier_isUniformOrBuffer(ptr);
	}

	public boolean isIo() {
		return Main.TQualifier_isIo(ptr);
	}

	public boolean isLinkable() {
		return Main.TQualifier_isLinkable(ptr);
	}

	public boolean isPerPrimitive() {
		return Main.TQualifier_isPerPrimitive(ptr);
	}

	public boolean isPerView() {
		return Main.TQualifier_isPerView(ptr);
	}

	public boolean isTaskMemory() {
		return Main.TQualifier_isTaskMemory(ptr);
	}

	public boolean isArrayedIo(EShLanguage language) {
		return Main.TQualifier_isArrayedIo(ptr, language);
	}

	public void clearLayout() {
		Main.TQualifier_clearLayout(ptr);
	}

	public void clearInterstageLayout() {
		Main.TQualifier_clearInterstageLayout(ptr);
	}

	public void clearStreamLayout() {
		Main.TQualifier_clearStreamLayout(ptr);
	}

	public void clearXfbLayout() {
		Main.TQualifier_clearXfbLayout(ptr);
	}

	public boolean hasNonXfbLayout() {
		return Main.TQualifier_hasNonXfbLayout(ptr);
	}

	public boolean hasLayout() {
		return Main.TQualifier_hasLayout(ptr);
	}

	public boolean hasUniformLayout() {
		return Main.TQualifier_hasUniformLayout(ptr);
	}

	public void clearUniformLayout() {
		Main.TQualifier_clearUniformLayout(ptr);
	}

	public boolean hasMatrix() {
		return Main.TQualifier_hasMatrix(ptr);
	}

	public boolean hasPacking() {
		return Main.TQualifier_hasPacking(ptr);
	}

	public boolean hasAlign() {
		return Main.TQualifier_hasAlign(ptr);
	}

	public boolean hasAnyLocation() {
		return Main.TQualifier_hasAnyLocation(ptr);
	}

	public boolean hasLocation() {
		return Main.TQualifier_hasLocation(ptr);
	}

	public boolean hasSet() {
		return Main.TQualifier_hasSet(ptr);
	}

	public boolean hasBinding() {
		return Main.TQualifier_hasBinding(ptr);
	}

	public boolean hasOffset() {
		return Main.TQualifier_hasOffset(ptr);
	}

	public boolean isNonPerspective() {
		return Main.TQualifier_isNonPerspective(ptr);
	}

	public boolean hasIndex() {
		return Main.TQualifier_hasIndex(ptr);
	}

	public long getIndex() {
		return Main.TQualifier_getIndex(ptr);
	}

	public boolean hasComponent() {
		return Main.TQualifier_hasComponent(ptr);
	}

	public boolean hasStream() {
		return Main.TQualifier_hasStream(ptr);
	}

	public boolean hasFormat() {
		return Main.TQualifier_hasFormat(ptr);
	}

	public boolean hasXfb() {
		return Main.TQualifier_hasXfb(ptr);
	}

	public boolean hasXfbBuffer() {
		return Main.TQualifier_hasXfbBuffer(ptr);
	}

	public boolean hasXfbStride() {
		return Main.TQualifier_hasXfbStride(ptr);
	}

	public boolean hasXfbOffset() {
		return Main.TQualifier_hasXfbOffset(ptr);
	}

	public boolean hasAttachment() {
		return Main.TQualifier_hasAttachment(ptr);
	}

	public TLayoutFormat getFormat() {
		return TLayoutFormat.valueByConstant(Main.TQualifier_getFormat(ptr));
	}

	public boolean isPushConstant() {
		return Main.TQualifier_isPushConstant(ptr);
	}

	public boolean isShaderRecord() {
		return Main.TQualifier_isShaderRecord(ptr);
	}

	public boolean hasBufferReference() {
		return Main.TQualifier_hasBufferReference(ptr);
	}

	public boolean hasBufferReferenceAlign() {
		return Main.TQualifier_hasBufferReferenceAlign(ptr);
	}

	public boolean isNonUniform() {
		return Main.TQualifier_isNonUniform(ptr);
	}

	public boolean hasSpecConstantId() {
		return Main.TQualifier_hasSpecConstantId(ptr);
	}

	public boolean isSpecConstant() {
		return Main.TQualifier_isSpecConstant(ptr);
	}

	public boolean isFrontEndConstant() {
		return Main.TQualifier_isFrontEndConstant(ptr);
	}

	public boolean isConstant() {
		return Main.TQualifier_isConstant(ptr);
	}

	public void makeSpecConstant() {
		Main.TQualifier_makeSpecConstant(ptr);
	}

	public void setSemanticName(String v) {
		Main.TQualifier_setSemanticName(ptr, v);
	}

	public void setStorage(TStorageQualifier v) {
		Main.TQualifier_setStorage(ptr, v.getConstant());
	}

	public void setBuiltIn(TBuiltInVariable v) {
		Main.TQualifier_setBuiltIn(ptr, v.getConstant());
	}

	public void setDeclaredBuiltIn(TBuiltInVariable v) {
		Main.TQualifier_setDeclaredBuiltIn(ptr, v.getConstant());
	}

	public void setPrecision(TPrecisionQualifier v) {
		Main.TQualifier_setPrecision(ptr, v.getConstant());
	}

	public void setInvariant(boolean v) {
		Main.TQualifier_setInvariant(ptr, v);
	}

	public void setCentroid(boolean v) {
		Main.TQualifier_setCentroid(ptr, v);
	}

	public void setSmooth(boolean v) {
		Main.TQualifier_setSmooth(ptr, v);
	}

	public void setFlat(boolean v) {
		Main.TQualifier_setFlat(ptr, v);
	}

	public void setSpecConstant(boolean v) {
		Main.TQualifier_setSpecConstant(ptr, v);
	}

	public void setNonUniform(boolean v) {
		Main.TQualifier_setNonUniform(ptr, v);
	}

	public void setExplicitOffset(boolean v) {
		Main.TQualifier_setExplicitOffset(ptr, v);
	}

	public void setNopersp(boolean v) {
		Main.TQualifier_setNopersp(ptr, v);
	}

	public void setExplicitInterp(boolean v) {
		Main.TQualifier_setExplicitInterp(ptr, v);
	}

	public void setPervertexNV(boolean v) {
		Main.TQualifier_setPervertexNV(ptr, v);
	}

	public void setPerPrimitiveNV(boolean v) {
		Main.TQualifier_setPerPrimitiveNV(ptr, v);
	}

	public void setPerViewNV(boolean v) {
		Main.TQualifier_setPerViewNV(ptr, v);
	}

	public void setPerTaskNV(boolean v) {
		Main.TQualifier_setPerTaskNV(ptr, v);
	}

	public void setPatch(boolean v) {
		Main.TQualifier_setPatch(ptr, v);
	}

	public void setSample(boolean v) {
		Main.TQualifier_setSample(ptr, v);
	}

	public void setRestrict(boolean v) {
		Main.TQualifier_setRestrict(ptr, v);
	}

	public void setReadonly(boolean v) {
		Main.TQualifier_setReadonly(ptr, v);
	}

	public void setWriteonly(boolean v) {
		Main.TQualifier_setWriteonly(ptr, v);
	}

	public void setCoherent(boolean v) {
		Main.TQualifier_setCoherent(ptr, v);
	}

	public void setVolatil(boolean v) {
		Main.TQualifier_setVolatil(ptr, v);
	}

	public void setDevicecoherent(boolean v) {
		Main.TQualifier_setDevicecoherent(ptr, v);
	}

	public void setQueuefamilycoherent(boolean v) {
		Main.TQualifier_setQueuefamilycoherent(ptr, v);
	}

	public void setWorkgroupcoherent(boolean v) {
		Main.TQualifier_setWorkgroupcoherent(ptr, v);
	}

	public void setSubgroupcoherent(boolean v) {
		Main.TQualifier_setSubgroupcoherent(ptr, v);
	}

	public void setShadercallcoherent(boolean v) {
		Main.TQualifier_setShadercallcoherent(ptr, v);
	}

	public void setNonprivate(boolean v) {
		Main.TQualifier_setNonprivate(ptr, v);
	}

	public void setLayoutMatrix(TLayoutMatrix v) {
		Main.TQualifier_setLayoutMatrix(ptr, v.getConstant());
	}

	public void setLayoutPacking(TLayoutPacking v) {
		Main.TQualifier_setLayoutPacking(ptr, v.getConstant());
	}

	public void setLayoutOffset(int v) {
		Main.TQualifier_setLayoutOffset(ptr, v);
	}

	public void setLayoutAlign(int v) {
		Main.TQualifier_setLayoutAlign(ptr, v);
	}

	public void setLayoutLocation(long v) {
		Main.TQualifier_setLayoutLocation(ptr, v);
	}

	public void setLayoutComponent(long v) {
		Main.TQualifier_setLayoutComponent(ptr, v);
	}

	public void setLayoutSet(long v) {
		Main.TQualifier_setLayoutSet(ptr, v);
	}

	public void setLayoutBinding(long v) {
		Main.TQualifier_setLayoutBinding(ptr, v);
	}

	public void setLayoutIndex(long v) {
		Main.TQualifier_setLayoutIndex(ptr, v);
	}

	public void setLayoutStream(long v) {
		Main.TQualifier_setLayoutStream(ptr, v);
	}

	public void setLayoutXfbBuffer(long v) {
		Main.TQualifier_setLayoutXfbBuffer(ptr, v);
	}

	public void setLayoutXfbStride(long v) {
		Main.TQualifier_setLayoutXfbStride(ptr, v);
	}

	public void setLayoutXfbOffset(long v) {
		Main.TQualifier_setLayoutXfbOffset(ptr, v);
	}

	public void setLayoutAttachment(long v) {
		Main.TQualifier_setLayoutAttachment(ptr, v);
	}

	public void setLayoutSpecConstantId(long v) {
		Main.TQualifier_setLayoutSpecConstantId(ptr, v);
	}

	public void setLayoutBufferReferenceAlign(long v) {
		Main.TQualifier_setLayoutBufferReferenceAlign(ptr, v);
	}

	public void setLayoutFormat(TLayoutFormat v) {
		Main.TQualifier_setLayoutFormat(ptr, v.getConstant());
	}

	public void setLayoutPushConstant(boolean v) {
		Main.TQualifier_setLayoutPushConstant(ptr, v);
	}

	public void setLayoutBufferReference(boolean v) {
		Main.TQualifier_setLayoutBufferReference(ptr, v);
	}

	public void setLayoutPassthrough(boolean v) {
		Main.TQualifier_setLayoutPassthrough(ptr, v);
	}

	public void setLayoutViewportRelative(boolean v) {
		Main.TQualifier_setLayoutViewportRelative(ptr, v);
	}

	public void setLayoutSecondaryViewportRelativeOffset(int v) {
		Main.TQualifier_setLayoutSecondaryViewportRelativeOffset(ptr, v);
	}

	public void setLayoutShaderRecord(boolean v) {
		Main.TQualifier_setLayoutShaderRecord(ptr, v);
	}

	public String getSemanticName() {
		return Main.TQualifier_getSemanticName(ptr);
	}

	public TStorageQualifier getStorage() {
		return TStorageQualifier.valueByConstant(Main.TQualifier_getStorage(ptr));
	}

	public TBuiltInVariable getBuiltIn() {
		return TBuiltInVariable.valueByConstant(Main.TQualifier_getBuiltIn(ptr));
	}

	public TBuiltInVariable getDeclaredBuiltIn() {
		return TBuiltInVariable.valueByConstant(Main.TQualifier_getDeclaredBuiltIn(ptr));
	}

	public TPrecisionQualifier getPrecision() {
		return TPrecisionQualifier.valueByConstant(Main.TQualifier_getPrecision(ptr));
	}

	public boolean getInvariant() {
		return Main.TQualifier_getInvariant(ptr);
	}

	public boolean getCentroid() {
		return Main.TQualifier_getCentroid(ptr);
	}

	public boolean getSmooth() {
		return Main.TQualifier_getSmooth(ptr);
	}

	public boolean getFlat() {
		return Main.TQualifier_getFlat(ptr);
	}

	public boolean getSpecConstant() {
		return Main.TQualifier_getSpecConstant(ptr);
	}

	public boolean getNonUniform() {
		return Main.TQualifier_getNonUniform(ptr);
	}

	public boolean getExplicitOffset() {
		return Main.TQualifier_getExplicitOffset(ptr);
	}

	public boolean getNoContraction() {
		return Main.TQualifier_getNoContraction(ptr);
	}

	public boolean getNopersp() {
		return Main.TQualifier_getNopersp(ptr);
	}

	public boolean getExplicitInterp() {
		return Main.TQualifier_getExplicitInterp(ptr);
	}

	public boolean getPervertexNV() {
		return Main.TQualifier_getPervertexNV(ptr);
	}

	public boolean getPerPrimitiveNV() {
		return Main.TQualifier_getPerPrimitiveNV(ptr);
	}

	public boolean getPerViewNV() {
		return Main.TQualifier_getPerViewNV(ptr);
	}

	public boolean getPerTaskNV() {
		return Main.TQualifier_getPerTaskNV(ptr);
	}

	public boolean getPatch() {
		return Main.TQualifier_getPatch(ptr);
	}

	public boolean getSample() {
		return Main.TQualifier_getSample(ptr);
	}

	public boolean getRestrict() {
		return Main.TQualifier_getRestrict(ptr);
	}

	public boolean getReadonly() {
		return Main.TQualifier_getReadonly(ptr);
	}

	public boolean getWriteonly() {
		return Main.TQualifier_getWriteonly(ptr);
	}

	public boolean getCoherent() {
		return Main.TQualifier_getCoherent(ptr);
	}

	public boolean getVolatil() {
		return Main.TQualifier_getVolatil(ptr);
	}

	public boolean getDevicecoherent() {
		return Main.TQualifier_getDevicecoherent(ptr);
	}

	public boolean getQueuefamilycoherent() {
		return Main.TQualifier_getQueuefamilycoherent(ptr);
	}

	public boolean getWorkgroupcoherent() {
		return Main.TQualifier_getWorkgroupcoherent(ptr);
	}

	public boolean getSubgroupcoherent() {
		return Main.TQualifier_getSubgroupcoherent(ptr);
	}

	public boolean getShadercallcoherent() {
		return Main.TQualifier_getShadercallcoherent(ptr);
	}

	public boolean getNonprivate() {
		return Main.TQualifier_getNonprivate(ptr);
	}

	public TLayoutMatrix getLayoutMatrix() {
		return TLayoutMatrix.valueByConstant(Main.TQualifier_getLayoutMatrix(ptr));
	}

	public TLayoutPacking getLayoutPacking() {
		return TLayoutPacking.valueByConstant(Main.TQualifier_getLayoutPacking(ptr));
	}

	public int getLayoutOffset() {
		return Main.TQualifier_getLayoutOffset(ptr);
	}

	public int getLayoutAlign() {
		return Main.TQualifier_getLayoutAlign(ptr);
	}

	public long getLayoutLocation() {
		return Main.TQualifier_getLayoutLocation(ptr);
	}

	public long getLayoutComponent() {
		return Main.TQualifier_getLayoutComponent(ptr);
	}

	public long getLayoutSet() {
		return Main.TQualifier_getLayoutSet(ptr);
	}

	public long getLayoutBinding() {
		return Main.TQualifier_getLayoutBinding(ptr);
	}

	public long getLayoutIndex() {
		return Main.TQualifier_getLayoutIndex(ptr);
	}

	public long getLayoutStream() {
		return Main.TQualifier_getLayoutStream(ptr);
	}

	public long getLayoutXfbBuffer() {
		return Main.TQualifier_getLayoutXfbBuffer(ptr);
	}

	public long getLayoutXfbStride() {
		return Main.TQualifier_getLayoutXfbStride(ptr);
	}

	public long getLayoutXfbOffset() {
		return Main.TQualifier_getLayoutXfbOffset(ptr);
	}

	public long getLayoutAttachment() {
		return Main.TQualifier_getLayoutAttachment(ptr);
	}

	public long getLayoutSpecConstantId() {
		return Main.TQualifier_getLayoutSpecConstantId(ptr);
	}

	public long getLayoutBufferReferenceAlign() {
		return Main.TQualifier_getLayoutBufferReferenceAlign(ptr);
	}

	public TLayoutFormat getLayoutFormat() {
		return TLayoutFormat.valueByConstant(Main.TQualifier_getLayoutFormat(ptr));
	}

	public boolean getLayoutPushConstant() {
		return Main.TQualifier_getLayoutPushConstant(ptr);
	}

	public boolean getLayoutBufferReference() {
		return Main.TQualifier_getLayoutBufferReference(ptr);
	}

	public boolean getLayoutPassthrough() {
		return Main.TQualifier_getLayoutPassthrough(ptr);
	}

	public boolean getLayoutViewportRelative() {
		return Main.TQualifier_getLayoutViewportRelative(ptr);
	}

	public int getLayoutSecondaryViewportRelativeOffset() {
		return Main.TQualifier_getLayoutSecondaryViewportRelativeOffset(ptr);
	}

	public boolean getLayoutShaderRecord() {
		return Main.TQualifier_getLayoutShaderRecord(ptr);
	}

	public static long getLayoutLocationEnd() {
		return Main.TQualifier_getLayoutLocationEnd();
	}

	public static long getLayoutComponentEnd() {
		return Main.TQualifier_getLayoutComponentEnd();
	}

	public static long getLayoutSetEnd() {
		return Main.TQualifier_getLayoutSetEnd();
	}

	public static long getLayoutBindingEnd() {
		return Main.TQualifier_getLayoutBindingEnd();
	}

	public static long getLayoutIndexEnd() {
		return Main.TQualifier_getLayoutIndexEnd();
	}

	public static long getLayoutStreamEnd() {
		return Main.TQualifier_getLayoutStreamEnd();
	}

	public static long getLayoutXfbBufferEnd() {
		return Main.TQualifier_getLayoutXfbBufferEnd();
	}

	public static long getLayoutXfbStrideEnd() {
		return Main.TQualifier_getLayoutXfbStrideEnd();
	}

	public static long getLayoutXfbOffsetEnd() {
		return Main.TQualifier_getLayoutXfbOffsetEnd();
	}

	public static long getLayoutAttachmentEnd() {
		return Main.TQualifier_getLayoutAttachmentEnd();
	}

	public static long getLayoutSpecConstantIdEnd() {
		return Main.TQualifier_getLayoutSpecConstantIdEnd();
	}

	public static long getLayoutBufferReferenceAlignEnd() {
		return Main.TQualifier_getLayoutBufferReferenceAlignEnd();
	}

	public static String getLayoutPackingString(TLayoutPacking packing) {
		return Main.TQualifier_getLayoutPackingString(packing);
	}

	public static String getLayoutMatrixString(TLayoutMatrix m) {
		return Main.TQualifier_getLayoutMatrixString(m);
	}

	public static String getLayoutFormatString(TLayoutFormat f) {
		return Main.TQualifier_getLayoutFormatString(f);
	}

	public static String getLayoutDepthString(TLayoutDepth d) {
		return Main.TQualifier_getLayoutDepthString(d);
	}

	public static String getBlendEquationString(TBlendEquationShift e) {
		return Main.TQualifier_getBlendEquationString(e);
	}

	public static String getGeometryString(TLayoutGeometry geometry) {
		return Main.TQualifier_getGeometryString(geometry);
	}

	public static String getVertexSpacingString(TVertexSpacing spacing) {
		return Main.TQualifier_getVertexSpacingString(spacing);
	}

	public static String getVertexOrderString(TVertexOrder order) {
		return Main.TQualifier_getVertexOrderString(order);
	}

	public static int mapGeometryToSize(TLayoutGeometry geometry) {
		return Main.TQualifier_mapGeometryToSize(geometry);
	}

	public static String getInterlockOrderingString(TInterlockOrdering order) {
		return Main.TQualifier_getInterlockOrderingString(order);
	}

}
