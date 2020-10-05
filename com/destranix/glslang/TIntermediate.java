package com.destranix.glslang;

import java.math.BigInteger;

public class TIntermediate extends PointerBoundObject {

	private final EShLanguage l;
	private final int v;
	private final EProfile p;
	private final int constructorIndex;

	public TIntermediate(EShLanguage l) {
		this.l = l;
		this.v = 0;
		this.p = EProfile.ENoProfile;
		this.constructorIndex = 0;
		load();
	}

	public TIntermediate(EShLanguage l, int v) {
		this.l = l;
		this.v = v;
		this.p = EProfile.ENoProfile;
		this.constructorIndex = 0;
		load();
	}

	public TIntermediate(EShLanguage l, int v, EProfile p) {
		this.l = l;
		this.v = v;
		this.p = p;
		this.constructorIndex = 0;
		load();
	}

	protected TIntermediate(byte[] ptr) {
		this.ptr = ptr;
		this.l = null;
		this.v = -1;
		this.p = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TIntermediate(l, v, p);
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

	public void setVersion(int v) {
		Main.TIntermediate_setVersion(ptr, v);
	}

	public int getVersion() {
		return Main.TIntermediate_getVersion(ptr);
	}

	public void setProfile(EProfile p) {
		Main.TIntermediate_setProfile(ptr, p);
	}

	public EProfile getProfile() {
		return EProfile.valueByConstant(Main.TIntermediate_getProfile(ptr));
	}

	public void setSpv(SpvVersionStruct s) {
		Main.TIntermediate_setSpv(ptr, s.getPtr());
	}

	public SpvVersionStruct getSpv() {
		return fromPtr(Main.TIntermediate_getSpv(ptr), SpvVersionStruct.class);
	}

	public EShLanguage getStage() {
		return EShLanguage.valueByConstant(Main.TIntermediate_getStage(ptr));
	}

	public void TIntermediate_addRequestedExtension(String extension) {
		Main.TIntermediate_addRequestedExtension(ptr, extension);
	}

	public CSet<TString> getRequestedExtensions() {
		@SuppressWarnings("unchecked") // Is checked
		CSet<TString> tmp = (CSet<TString>) fromPtr(Main.TIntermediate_getRequestedExtensions(ptr),
				CSet.class);
		return tmp;
	}

	public void setTreeRoot(TIntermNode r) {
		Main.TIntermediate_setTreeRoot(ptr, r.getPtr());
	}

	public TIntermNode getTreeRoot() {
		return fromPtr(Main.TIntermediate_getTreeRoot(ptr), TIntermNode.class);
	}

	public void incrementEntryPointCount() {
		Main.TIntermediate_incrementEntryPointCount(ptr);
	}

	public int getNumEntryPoints() {
		return Main.TIntermediate_getNumEntryPoints(ptr);
	}

	public int getNumErrors() {
		return Main.TIntermediate_getNumErrors(ptr);
	}

	public void addPushConstantCount() {
		Main.TIntermediate_addPushConstantCount(ptr);
	}

	public void setLimits(TBuiltInResource r) {
		Main.TIntermediate_setLimits(ptr, r.getPtr());
	}

	public boolean postProcess(TIntermNode node, EShLanguage language) {
		return Main.TIntermediate_postProcess(ptr, node.getPtr(), language);
	}

	public void removeTree() {
		Main.TIntermediate_removeTree(ptr);
	}

	public void setEntryPointName(String ep) {
		Main.TIntermediate_setEntryPointName(ptr, ep);
	}

	public void setEntryPointMangledName(String ep) {
		Main.TIntermediate_setEntryPointMangledName(ptr, ep);
	}

	public String getEntryPointName() {
		return Main.TIntermediate_getEntryPointName(ptr);
	}

	public String getEntryPointMangledName() {
		return Main.TIntermediate_getEntryPointMangledName(ptr);
	}

	public void setInvertY(boolean invert) {
		Main.TIntermediate_setInvertY(ptr, invert);
	}

	public boolean getInvertY() {
		return Main.TIntermediate_getInvertY(ptr);
	}

	public void setSource(EShSource s) {
		Main.TIntermediate_setSource(ptr, s);
	}

	public EShSource getSource() {
		return EShSource.valueByConstant(Main.TIntermediate_getSource(ptr));
	}

	public boolean isRecursive() {
		return Main.TIntermediate_isRecursive(ptr);
	}

	public TIntermSymbol addSymbol(TType t, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addSymbol(ptr, t.getPtr(), loc.getPtr()), TIntermSymbol.class);
	}

	public TIntermSymbol addSymbol(TIntermSymbol symbol) {
		return fromPtr(Main.TIntermediate_addSymbol(ptr, symbol.getPtr()), TIntermSymbol.class);
	}

	public TIntermSymbol addSymbol(TVariable t, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addSymbolVariable(ptr, t.getPtr(), loc.getPtr()), TIntermSymbol.class);
	}

	public TIntermSymbol addSymbol(TVariable var) {
		return fromPtr(Main.TIntermediate_addSymbolVariable(ptr, var.getPtr()), TIntermSymbol.class);
	}

	public TIntermTyped addConversion(TOperator op, TType node0, TIntermTyped node1) {
		return fromPtr(Main.TIntermediate_addConversionType(ptr, op, node0.getPtr(), node1.getPtr()),
				TIntermTyped.class);
	}

	public CPair<TIntermTyped, TIntermTyped> addPairConversion(TOperator op, TIntermTyped node0, TIntermTyped node1) {
		@SuppressWarnings("unchecked") // Is checked
		CPair<TIntermTyped, TIntermTyped> tmp = (CPair<TIntermTyped, TIntermTyped>) fromPtr(
				Main.TIntermediate_addPairConversion(ptr, op, node0.getPtr(), node1.getPtr()), CPair.class);
		return tmp;
	}

	public TIntermTyped addUniShapeConversion(TOperator op, TType t, TIntermTyped node) {
		return fromPtr(Main.TIntermediate_addUniShapeConversion(ptr, op, t.getPtr(), node.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped addConversion(TBasicType convertTo, TIntermTyped node) {
		return fromPtr(Main.TIntermediate_addConversion(ptr, convertTo, node.getPtr()), TIntermTyped.class);
	}

	public void addBiShapeConversion(TOperator op, TIntermTyped lhsNode, TIntermTyped rhsNode) {
		Main.TIntermediate_addBiShapeConversion(ptr, op, lhsNode.getPtr(), rhsNode.getPtr());
	}

	public TIntermTyped addShapeConversion(TType t, TIntermTyped node) {
		return fromPtr(Main.TIntermediate_addShapeConversion(ptr, t.getPtr(), node.getPtr()), TIntermTyped.class);
	}

	public TIntermTyped addBinaryMath(TOperator op, TIntermTyped left, TIntermTyped right, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addBinaryMath(ptr, op, left.getPtr(), right.getPtr(), loc.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped addAssign(TOperator op, TIntermTyped left, TIntermTyped right, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addAssign(ptr, op, left.getPtr(), right.getPtr(), loc.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped addIndex(TOperator op, TIntermTyped base, TIntermTyped index, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addIndex(ptr, op, base.getPtr(), index.getPtr(), loc.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped addUnaryMath(TOperator op, TIntermTyped child, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addUnaryMath(ptr, op, child.getPtr(), loc.getPtr()), TIntermTyped.class);
	}

	public TIntermTyped addBuiltInFunctionCall(byte[] line, TOperator op, boolean unary, TIntermNode node,
			TType returnType) {
		return fromPtr(
				Main.TIntermediate_addBuiltInFunctionCall(ptr, line, op, unary, node.getPtr(), returnType.getPtr()),
				TIntermTyped.class);
	}

	public boolean canImplicitlyPromote(TBasicType from, TBasicType to) {
		return Main.TIntermediate_canImplicitlyPromote(ptr, from, to);
	}

	public boolean canImplicitlyPromote(TBasicType from, TBasicType to, TOperator op) {
		return Main.TIntermediate_canImplicitlyPromote(ptr, from.getConstant(), to.getConstant(), op.getConstant());
	}

	public boolean isIntegralPromotion(TBasicType from, TBasicType to) {
		return Main.TIntermediate_isIntegralPromotion(ptr, from, to);
	}

	public boolean isFPPromotion(TBasicType from, TBasicType to) {
		return Main.TIntermediate_isFPPromotion(ptr, from, to);
	}

	public boolean isIntegralConversion(TBasicType from, TBasicType to) {
		return Main.TIntermediate_isIntegralConversion(ptr, from, to);
	}

	public boolean isFPConversion(TBasicType from, TBasicType to) {
		return Main.TIntermediate_isFPConversion(ptr, from, to);
	}

	public boolean isFPIntegralConversion(TBasicType from, TBasicType to) {
		return Main.TIntermediate_isFPIntegralConversion(ptr, from, to);
	}

	public TOperator mapTypeToConstructorOp(TType t) {
		return TOperator.valueByConstant(Main.TIntermediate_mapTypeToConstructorOp(ptr, t.getPtr()));
	}

	public TIntermAggregate growAggregate(TIntermNode left, TIntermNode right) {
		return fromPtr(Main.TIntermediate_growAggregate(ptr, left.getPtr(), right.getPtr()), TIntermAggregate.class);
	}

	public TIntermAggregate growAggregate(TIntermNode left, TIntermNode right, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_growAggregate(ptr, left.getPtr(), right.getPtr(), loc.getPtr()),
				TIntermAggregate.class);
	}

	public TIntermAggregate makeAggregate(TIntermNode node) {
		return fromPtr(Main.TIntermediate_makeAggregate(ptr, node.getPtr()), TIntermAggregate.class);
	}

	public TIntermAggregate makeAggregate(TIntermNode node, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_makeAggregate(ptr, node.getPtr(), loc.getPtr()), TIntermAggregate.class);
	}

	public TIntermAggregate makeAggregateLoc(TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_makeAggregateLoc(ptr, loc.getPtr()), TIntermAggregate.class);
	}

	public TIntermTyped setAggregateOperator(TIntermNode node, TOperator op, TType type, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_setAggregateOperator(ptr, node.getPtr(), op, type.getPtr(), loc.getPtr()),
				TIntermTyped.class);
	}

	public boolean areAllChildConst(TIntermAggregate aggrNode) {
		return Main.TIntermediate_areAllChildConst(ptr, aggrNode.getPtr());
	}

	public TIntermSelection addSelection(TIntermTyped cond, TIntermNodePair code, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addSelection(ptr, cond.getPtr(), code.getPtr(), loc.getPtr()),
				TIntermSelection.class);
	}

	public TIntermTyped addSelection(TIntermTyped cond, TIntermTyped trueBlock, TIntermTyped falseBlock,
			TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addSelection(ptr, cond.getPtr(), trueBlock.getPtr(), falseBlock.getPtr(),
				loc.getPtr()), TIntermTyped.class);
	}

	public TIntermTyped addComma(TIntermTyped left, TIntermTyped right, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addComma(ptr, left.getPtr(), right.getPtr(), loc.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped addMethod(TIntermTyped node, TType t, String s, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addMethod(ptr, node.getPtr(), t.getPtr(), s, loc.getPtr()),
				TIntermTyped.class);
	}

	public TIntermConstantUnion addConstantUnion(TConstUnionArray array, TType t, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, array.getPtr(), t.getPtr(), loc.getPtr()),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(TConstUnionArray array, TType t, TSourceLoc loc, boolean literal) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, array.getPtr(), t.getPtr(), loc.getPtr(), literal),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(byte val, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, loc.getPtr()), TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(byte val, TSourceLoc loc, boolean literal) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, loc.getPtr(), literal),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(short val, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, loc.getPtr()), TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(short val, TSourceLoc loc, boolean literal) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, loc.getPtr(), literal),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnionUnsignedChar(short val, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addConstantUnionUnsignedChar(ptr, val, loc.getPtr()),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnionUnsignedChar(short val, TSourceLoc loc, boolean literal) {
		return fromPtr(Main.TIntermediate_addConstantUnionUnsignedChar(ptr, val, loc.getPtr(), literal),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(int val, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, loc.getPtr()), TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(int val, TSourceLoc loc, boolean literal) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, loc.getPtr(), literal),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnionUnsignedShort(int val, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addConstantUnionUnsignedShort(ptr, val, loc.getPtr()),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnionUnsignedShort(int val, TSourceLoc loc, boolean literal) {
		return fromPtr(Main.TIntermediate_addConstantUnionUnsignedShort(ptr, val, loc.getPtr(), literal),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(long val, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, loc.getPtr()), TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(long val, TSourceLoc loc, boolean literal) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, loc.getPtr(), literal),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(BigInteger val, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, loc.getPtr()), TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(BigInteger val, TSourceLoc loc, boolean literal) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, loc.getPtr(), literal),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnionUnsignedLong(BigInteger val, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addConstantUnionUnsignedLong(ptr, val, loc.getPtr()),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnionUnsignedLong(BigInteger val, TSourceLoc loc, boolean literal) {
		return fromPtr(Main.TIntermediate_addConstantUnionUnsignedLong(ptr, val, loc.getPtr(), literal),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(boolean val, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, loc.getPtr()), TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(boolean val, TSourceLoc loc, boolean literal) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, loc.getPtr(), literal),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(double val, TBasicType t, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, t.getConstant(), loc.getPtr()),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(double val, int t, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, t, loc.getPtr()), TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(double val, TBasicType t, TSourceLoc loc, boolean literal) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, t, loc.getPtr(), literal),
				TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(String val, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, loc.getPtr()), TIntermConstantUnion.class);
	}

	public TIntermConstantUnion addConstantUnion(String val, TSourceLoc loc, boolean literal) {
		return fromPtr(Main.TIntermediate_addConstantUnion(ptr, val, loc.getPtr(), literal),
				TIntermConstantUnion.class);
	}

	public TIntermTyped promoteConstantUnion(TBasicType t, TIntermConstantUnion union) {
		return fromPtr(Main.TIntermediate_promoteConstantUnion(ptr, t, union.getPtr()), TIntermTyped.class);
	}

	public boolean parseConstTree(TIntermNode node, TConstUnionArray arr, TOperator op, TType t) {
		return Main.TIntermediate_parseConstTree(ptr, node.getPtr(), arr.getPtr(), op, t.getPtr());
	}

	public boolean parseConstTree(TIntermNode node, TConstUnionArray arr, TOperator op, TType t,
			boolean singleConstantParam) {
		return Main.TIntermediate_parseConstTree(ptr, node.getPtr(), arr.getPtr(), op, t.getPtr(), singleConstantParam);
	}

	public TIntermLoop addLoop(TIntermNode node, TIntermTyped typed0, TIntermTyped typed1, boolean testFirst,
			TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addLoop(ptr, node.getPtr(), typed0.getPtr(), typed1.getPtr(), testFirst,
				loc.getPtr()), TIntermLoop.class);
	}

	public TIntermAggregate addForLoop(TIntermNode node0, TIntermNode node1, TIntermTyped typed0, TIntermTyped typed1,
			boolean testFirst, TSourceLoc loc, TIntermLoop loop) {
		return fromPtr(Main.TIntermediate_addForLoop(ptr, node0.getPtr(), node1.getPtr(), typed0.getPtr(),
				typed1.getPtr(), testFirst, loc.getPtr(), loop.getPtr()), TIntermAggregate.class);
	}

	public TIntermBranch addBranch(TOperator op, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addBranch(ptr, op, loc.getPtr()), TIntermBranch.class);
	}

	public TIntermBranch addBranch(TOperator op, TIntermTyped node, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addBranch(ptr, op, node.getPtr(), loc.getPtr()), TIntermBranch.class);
	}

	public <selectorType extends PointerBoundObject> TIntermTyped addSwizzle(TSwizzleSelectors<selectorType> selector,
			TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addSwizzle(ptr, selector.getPtr(), loc.getPtr()), TIntermTyped.class);
	}

	public TIntermBinary addBinaryNode(TOperator op, TIntermTyped left, TIntermTyped right, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addBinaryNode(ptr, op, left.getPtr(), right.getPtr(), loc.getPtr()),
				TIntermBinary.class);
	}

	public TIntermBinary addBinaryNode(TOperator op, TIntermTyped left, TIntermTyped right, TSourceLoc loc, TType t) {
		return fromPtr(
				Main.TIntermediate_addBinaryNode(ptr, op, left.getPtr(), right.getPtr(), loc.getPtr(), t.getPtr()),
				TIntermBinary.class);
	}

	public TIntermUnary addUnaryNode(TOperator op, TIntermTyped child, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_addUnaryNode(ptr, op, child.getPtr(), loc.getPtr()), TIntermUnary.class);
	}

	public TIntermUnary addUnaryNode(TOperator op, TIntermTyped child, TSourceLoc loc, TType t) {
		return fromPtr(Main.TIntermediate_addUnaryNode(ptr, op, child.getPtr(), loc.getPtr(), t.getPtr()),
				TIntermUnary.class);
	}

	public TIntermTyped fold(TIntermAggregate aggrNode) {
		return fromPtr(Main.TIntermediate_fold(ptr, aggrNode.getPtr()), TIntermTyped.class);
	}

	public TIntermTyped foldConstructor(TIntermAggregate aggrNode) {
		return fromPtr(Main.TIntermediate_foldConstructor(ptr, aggrNode.getPtr()), TIntermTyped.class);
	}

	public TIntermTyped foldDereference(TIntermTyped node, int index, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_foldDereference(ptr, node.getPtr(), index, loc.getPtr()), TIntermTyped.class);
	}

	public TIntermTyped foldSwizzle(TIntermTyped node, TSwizzleSelectorsInt fields, TSourceLoc loc) {
		return fromPtr(Main.TIntermediate_foldSwizzle(ptr, node.getPtr(), fields.getPtr(), loc.getPtr()),
				TIntermTyped.class);
	}

	public void addSymbolLinkageNodes(TIntermAggregate linkage, EShLanguage language, TSymbolTable table) {
		Main.TIntermediate_addSymbolLinkageNodes(ptr, linkage.getPtr(), language, table.getPtr());
	}

	public void addSymbolLinkageNode(TIntermAggregate linkage, TSymbol symbol) {
		Main.TIntermediate_addSymbolLinkageNode(ptr, linkage.getPtr(), symbol.getPtr());
	}

	public void setUseStorageBuffer() {
		Main.TIntermediate_setUseStorageBuffer(ptr);
	}

	public boolean usingStorageBuffer() {
		return Main.TIntermediate_usingStorageBuffer(ptr);
	}

	public void setDepthReplacing() {
		Main.TIntermediate_setDepthReplacing(ptr);
	}

	public boolean isDepthReplacing() {
		return Main.TIntermediate_isDepthReplacing(ptr);
	}

	public boolean setLocalSize(int dim, int size) {
		return Main.TIntermediate_setLocalSize(ptr, dim, size);
	}

	public long getLocalSize(int dim) {
		return Main.TIntermediate_getLocalSize(ptr, dim);
	}

	public boolean setLocalSizeSpecId(int dim, int id) {
		return Main.TIntermediate_setLocalSizeSpecId(ptr, dim, id);
	}

	public int getLocalSizeSpecId(int dim) {
		return Main.TIntermediate_getLocalSizeSpecId(ptr, dim);
	}

	public void output(TInfoSink sink, boolean tree) {
		Main.TIntermediate_output(ptr, sink.getPtr(), tree);
	}

	public boolean isEsProfile() {
		return Main.TIntermediate_isEsProfile(ptr);
	}

	public boolean getXfbMode() {
		return Main.TIntermediate_getXfbMode(ptr);
	}

	public boolean isMultiStream() {
		return Main.TIntermediate_isMultiStream(ptr);
	}

	public TLayoutGeometry getOutputPrimitive() {
		return TLayoutGeometry.valueByConstant(Main.TIntermediate_getOutputPrimitive(ptr));
	}

	public boolean getPostDepthCoverage() {
		return Main.TIntermediate_getPostDepthCoverage(ptr);
	}

	public boolean getEarlyFragmentTests() {
		return Main.TIntermediate_getEarlyFragmentTests(ptr);
	}

	public TLayoutDepth getDepth() {
		return TLayoutDepth.valueByConstant(Main.TIntermediate_getDepth(ptr));
	}

	public boolean getPixelCenterInteger() {
		return Main.TIntermediate_getPixelCenterInteger(ptr);
	}

	public void setOriginUpperLeft() {
		Main.TIntermediate_setOriginUpperLeft(ptr);
	}

	public boolean getOriginUpperLeft() {
		return Main.TIntermediate_getOriginUpperLeft(ptr);
	}

	public TInterlockOrdering getInterlockOrdering() {
		return TInterlockOrdering.valueByConstant(Main.TIntermediate_getInterlockOrdering(ptr));
	}

	public boolean getAutoMapBindings() {
		return Main.TIntermediate_getAutoMapBindings(ptr);
	}

	public boolean getAutoMapLocations() {
		return Main.TIntermediate_getAutoMapLocations(ptr);
	}

	public int getNumPushConstants() {
		return Main.TIntermediate_getNumPushConstants(ptr);
	}

	public void addShaderRecordCount() {
		Main.TIntermediate_addShaderRecordCount(ptr);
	}

	public void addTaskNVCount() {
		Main.TIntermediate_addTaskNVCount(ptr);
	}

	public void setUseVulkanMemoryModel() {
		Main.TIntermediate_setUseVulkanMemoryModel(ptr);
	}

	public boolean usingVulkanMemoryModel() {
		return Main.TIntermediate_usingVulkanMemoryModel(ptr);
	}

	public boolean usingPhysicalStorageBuffer() {
		return Main.TIntermediate_usingPhysicalStorageBuffer(ptr);
	}

	public boolean usingVariablePointers() {
		return Main.TIntermediate_usingVariablePointers(ptr);
	}

	public long getXfbStride(int buffer) {
		return Main.TIntermediate_getXfbStride(ptr, buffer);
	}

	public boolean hasLayoutDerivativeModeNone() {
		return Main.TIntermediate_hasLayoutDerivativeModeNone(ptr);
	}

	public ComputeDerivativeMode getLayoutDerivativeModeNone() {
		return ComputeDerivativeMode.valueByConstant(Main.TIntermediate_getLayoutDerivativeModeNone(ptr));
	}

	public void setShiftBinding(TResourceType res, long shift) {
		Main.TIntermediate_setShiftBinding(ptr, res, shift);
	}

	public long getShiftBinding(TResourceType res) {
		return Main.TIntermediate_getShiftBinding(ptr, res);
	}

	public void setShiftBindingForSet(TResourceType res, long shift, long set) {
		Main.TIntermediate_setShiftBindingForSet(ptr, res, shift, set);
	}

	public int getShiftBindingForSet(TResourceType res, long set) {
		return Main.TIntermediate_getShiftBindingForSet(ptr, res, set);
	}

	public boolean hasShiftBindingForSet(TResourceType res) {
		return Main.TIntermediate_hasShiftBindingForSet(ptr, res);
	}

	public void setResourceSetBinding(String[] shift) {
		Main.TIntermediate_setResourceSetBinding(ptr, shift);
	}

	public String[] getResourceSetBinding() {
		return Main.TIntermediate_getResourceSetBinding(ptr);
	}

	public void setAutoMapBindings(boolean map) {
		Main.TIntermediate_setAutoMapBindings(ptr, map);
	}

	public void setAutoMapLocations(boolean map) {
		Main.TIntermediate_setAutoMapLocations(ptr, map);
	}

	public void setFlattenUniformArrays(boolean flatten) {
		Main.TIntermediate_setFlattenUniformArrays(ptr, flatten);
	}

	public boolean getFlattenUniformArrays() {
		return Main.TIntermediate_getFlattenUniformArrays(ptr);
	}

	public boolean getNoStorageFormat() {
		return Main.TIntermediate_getNoStorageFormat(ptr);
	}

	public PointerBoundObject addCounterBufferName(PointerBoundObject name) {
		return fromPtr(Main.TIntermediate_addCounterBufferName(ptr, name.getPtr()), PointerBoundObject.class);
	}

	public boolean hasCounterBufferName(String name) {
		return Main.TIntermediate_hasCounterBufferName(ptr, name);
	}

	public void setTextureSamplerTransformMode(EShTextureSamplerTransformMode mode) {
		Main.TIntermediate_setTextureSamplerTransformMode(ptr, mode);
	}

	public boolean setInvocations(int i) {
		return Main.TIntermediate_setInvocations(ptr, i);
	}

	public int getInvocations() {
		return Main.TIntermediate_getInvocations(ptr);
	}

	public boolean setVertices(int m) {
		return Main.TIntermediate_setVertices(ptr, m);
	}

	public int getVertices() {
		return Main.TIntermediate_getVertices(ptr);
	}

	public TLayoutGeometry getInputPrimitive() {
		return TLayoutGeometry.valueByConstant(Main.TIntermediate_getInputPrimitive(ptr));
	}

	public boolean setVertexSpacing(TVertexSpacing s) {
		return Main.TIntermediate_setVertexSpacing(ptr, s);
	}

	public TVertexSpacing getVertexSpacing() {
		return TVertexSpacing.valueByConstant(Main.TIntermediate_getVertexSpacing(ptr));
	}

	public boolean setVertexOrder(TVertexOrder o) {
		return Main.TIntermediate_setVertexOrder(ptr, o);
	}

	public TVertexOrder getVertexOrder() {
		return TVertexOrder.valueByConstant(Main.TIntermediate_getVertexOrder(ptr));
	}

	public void setPointMode() {
		Main.TIntermediate_setPointMode(ptr);
	}

	public boolean getPointMode() {
		return Main.TIntermediate_getPointMode(ptr);
	}

	public boolean setInterlockOrdering(TInterlockOrdering o) {
		return Main.TIntermediate_setInterlockOrdering(ptr, o);
	}

	public void setXfbMode() {
		Main.TIntermediate_setXfbMode(ptr);
	}

	public void setMultiStream() {
		Main.TIntermediate_setMultiStream(ptr);
	}

	public boolean setOutputPrimitive(TLayoutGeometry p) {
		return Main.TIntermediate_setOutputPrimitive(ptr, p);
	}

	public void setPostDepthCoverage() {
		Main.TIntermediate_setPostDepthCoverage(ptr);
	}

	public void setEarlyFragmentTests() {
		Main.TIntermediate_setEarlyFragmentTests(ptr);
	}

	public boolean setDepth(TLayoutDepth d) {
		return Main.TIntermediate_setDepth(ptr, d);
	}

	public void setPixelCenterInteger() {
		Main.TIntermediate_setPixelCenterInteger(ptr);
	}

	public void addBlendEquation(TBlendEquationShift b) {
		Main.TIntermediate_addBlendEquation(ptr, b);
	}

	public long getBlendEquations() {
		return Main.TIntermediate_getBlendEquations(ptr);
	}

	public boolean setXfbBufferStride(int buffer, long stride) {
		return Main.TIntermediate_setXfbBufferStride(ptr, buffer, stride);
	}

	public int addXfbBufferOffset(TType t) {
		return Main.TIntermediate_addXfbBufferOffset(ptr, t.getPtr());
	}

	public long TIntermediate_computeTypeXfbSize(TType t, boolean contains64BitType, boolean contains32BitType,
			boolean contains16BitType) {
		return Main.TIntermediate_computeTypeXfbSize(ptr, t.getPtr(), contains64BitType, contains32BitType,
				contains16BitType);
	}

	public long TIntermediate_computeTypeXfbSize(TType t, boolean contains64BitType) {
		return Main.TIntermediate_computeTypeXfbSize(ptr, t.getPtr(), contains64BitType);
	}

	public void setLayoutOverrideCoverage() {
		Main.TIntermediate_setLayoutOverrideCoverage(ptr);
	}

	public boolean getLayoutOverrideCoverage() {
		return Main.TIntermediate_getLayoutOverrideCoverage(ptr);
	}

	public void setGeoPassthroughEXT() {
		Main.TIntermediate_setGeoPassthroughEXT(ptr);
	}

	public boolean getGeoPassthroughEXT() {
		return Main.TIntermediate_getGeoPassthroughEXT(ptr);
	}

	public void setLayoutDerivativeMode(ComputeDerivativeMode mode) {
		Main.TIntermediate_setLayoutDerivativeMode(ptr, mode);
	}

	public void setLayoutPrimitiveCulling() {
		Main.TIntermediate_setLayoutPrimitiveCulling(ptr);
	}

	public boolean getLayoutPrimitiveCulling() {
		return Main.TIntermediate_getLayoutPrimitiveCulling(ptr);
	}

	public boolean setPrimitives(int m) {
		return Main.TIntermediate_setPrimitives(ptr, m);
	}

	public int getPrimitives() {
		return Main.TIntermediate_getPrimitives(ptr);
	}

	public String addSemanticName(String name) {
		return Main.TIntermediate_addSemanticName(ptr, name);
	}

	public void addUniformLocationOverride(String nameStr, int location) {
		Main.TIntermediate_addUniformLocationOverride(ptr, nameStr, location);
	}

	public int getUniformLocationOverride(String nameStr) {
		return Main.TIntermediate_getUniformLocationOverride(ptr, nameStr);
	}

	public void setUniformLocationBase(int base) {
		Main.TIntermediate_setUniformLocationBase(ptr, base);
	}

	public int getUniformLocationBase() {
		return Main.TIntermediate_getUniformLocationBase(ptr);
	}

	public void setNeedsLegalization() {
		Main.TIntermediate_setNeedsLegalization(ptr);
	}

	public boolean needsLegalization() {
		return Main.TIntermediate_needsLegalization(ptr);
	}

	public void setBinaryDoubleOutput() {
		Main.TIntermediate_setBinaryDoubleOutput(ptr);
	}

	public boolean getBinaryDoubleOutput() {
		return Main.TIntermediate_getBinaryDoubleOutput(ptr);
	}

	public void setHlslFunctionality1() {
		Main.TIntermediate_setHlslFunctionality1(ptr);
	}

	public void setHlslOffsets() {
		Main.TIntermediate_setHlslOffsets(ptr);
	}

	public void setHlslIoMapping(boolean b) {
		Main.TIntermediate_setHlslIoMapping(ptr, b);
	}

	public boolean getHlslFunctionality1() {
		return Main.TIntermediate_getHlslFunctionality1(ptr);
	}

	public boolean usingHlslOffsets() {
		return Main.TIntermediate_usingHlslOffsets(ptr);
	}

	public boolean usingHlslIoMapping() {
		return Main.TIntermediate_usingHlslIoMapping(ptr);
	}

	public void addToCallGraph(TInfoSink sink, String caller, String callee) {
		Main.TIntermediate_addToCallGraph(ptr, sink.getPtr(), caller, callee);
	}

	public void merge(TInfoSink sink, TIntermediate intermediate) {
		Main.TIntermediate_merge(ptr, sink.getPtr(), intermediate.getPtr());
	}

	public void finalCheck(TInfoSink sink, boolean keepUncalled) {
		Main.TIntermediate_finalCheck(ptr, sink.getPtr(), keepUncalled);
	}

	public boolean buildConvertOp(TBasicType dst, TBasicType src, TOperator convertOp) {
		return Main.TIntermediate_buildConvertOp(ptr, dst, src, convertOp);
	}

	public TIntermTyped createConversion(TBasicType convertTo, TIntermTyped node) {
		return fromPtr(Main.TIntermediate_createConversion(ptr, convertTo, node.getPtr()), TIntermTyped.class);
	}

	public void addIoAccessed(String name) {
		Main.TIntermediate_addIoAccessed(ptr, name);
	}

	public boolean inIoAccessed(String name) {
		return Main.TIntermediate_inIoAccessed(ptr, name);
	}

	public int addUsedLocation(TQualifier qualifier, TType t, boolean typeCollision) {
		return Main.TIntermediate_addUsedLocation(ptr, qualifier.getPtr(), t.getPtr(), typeCollision);
	}

	public int checkLocationRange(int set, TIoRange range, TType t, boolean typeCollision) {
		return Main.TIntermediate_checkLocationRange(ptr, set, range.getPtr(), t.getPtr(), typeCollision);
	}

	public int addUsedOffsets(int binding, int offset, int numOffsets) {
		return Main.TIntermediate_addUsedOffsets(ptr, binding, offset, numOffsets);
	}

	public boolean addUsedConstantId(int id) {
		return Main.TIntermediate_addUsedConstantId(ptr, id);
	}

	public boolean promote(TIntermOperator operator) {
		return Main.TIntermediate_promote(ptr, operator.getPtr());
	}

	public void setNanMinMaxClamp(boolean setting) {
		Main.TIntermediate_setNanMinMaxClamp(ptr, setting);
	}

	public boolean getNanMinMaxClamp() {
		return Main.TIntermediate_getNanMinMaxClamp(ptr);
	}

	public void setSourceFile(String file) {
		Main.TIntermediate_setSourceFile(ptr, file);
	}

	public String getSourceFile() {
		return Main.TIntermediate_getSourceFile(ptr);
	}

	public void addSourceText(String text, long len) {
		Main.TIntermediate_addSourceText(ptr, text, len);
	}// NOTE: Interface not exact. size_t might be larger than long.

	public String getSourceText() {
		return Main.TIntermediate_getSourceText(ptr);
	}

	public CMap<TString, TString> getIncludeText() {
		@SuppressWarnings("unchecked") // Is checked
		CMap<TString, TString> tmp = (CMap<TString, TString>) fromPtr(Main.TIntermediate_getIncludeText(ptr),
				CMap.class);
		return tmp;
	}

	public void addIncludeText(String name, String text, long len) {
		Main.TIntermediate_addIncludeText(ptr, name, text, len);
	}// NOTE: Interface not exact. size_t might be larger than long.

	public void addProcesses(String[] p) {
		Main.TIntermediate_addProcesses(ptr, p);
	}

	public void addProcess(String process) {
		Main.TIntermediate_addProcess(ptr, process);
	}

	public void addProcessArgument(String arg) {
		Main.TIntermediate_addProcessArgument(ptr, arg);
	}

	public String[] getProcesses() {
		return Main.TIntermediate_getProcesses(ptr);
	}
	
	public boolean getArithemeticInt8Enabled(){
    	return Main.TIntermediate_getArithemeticInt8Enabled(ptr);
    }
	
	public boolean getArithemeticInt16Enabled(){
		return Main.TIntermediate_getArithemeticInt16Enabled(ptr);
    }
	
	public boolean getArithemeticFloat16Enabled(){
		return Main.TIntermediate_getArithemeticFloat16Enabled(ptr);
    }
	
	public void updateNumericFeature(TNumericFeatures_feature f, boolean on){
		Main.TIntermediate_updateNumericFeature(ptr, f, on);
    }

	public static TIntermTyped findLValueBase(TIntermTyped node, boolean swizzleOkay) {
		return fromPtr(Main.TIntermediate_findLValueBase(node.getPtr(), swizzleOkay), TIntermTyped.class);
	}

	public static int computeTypeLocationSize(TType t, EShLanguage language) {
		return Main.TIntermediate_computeTypeLocationSize(t.getPtr(), language);
	}

	public static int computeTypeUniformLocationSize(TType t) {
		return Main.TIntermediate_computeTypeUniformLocationSize(t.getPtr());
	}

	public static int getBaseAlignmentScalar(TType t, int size) {
		return Main.TIntermediate_getBaseAlignmentScalar(t.getPtr(), size);
	}

	public static int getBaseAlignment(TType t, int size, int stride, TLayoutPacking layoutPacking, boolean rowMajor) {
		return Main.TIntermediate_getBaseAlignment(t.getPtr(), size, stride, layoutPacking, rowMajor);
	}

	public static int getScalarAlignment(TType t, int size, int stride, boolean rowMajor) {
		return Main.TIntermediate_getScalarAlignment(t.getPtr(), size, stride, rowMajor);
	}

	public static int getMemberAlignment(TType t, int size, int stride, TLayoutPacking layoutPacking,
			boolean rowMajor) {
		return Main.TIntermediate_getMemberAlignment(t.getPtr(), size, stride, layoutPacking, rowMajor);
	}

	public static boolean improperStraddle(TType type, int size, int offset) {
		return Main.TIntermediate_improperStraddle(type.getPtr(), size, offset);
	}

	public static void updateOffset(TType parentType, TType memberType, int offset, int memberSize) {
		Main.TIntermediate_updateOffset(parentType.getPtr(), memberType.getPtr(), offset, memberSize);
	}

	public static int getOffset(TType type, int index) {
		return Main.TIntermediate_getOffset(type.getPtr(), index);
	}

	public static int getBlockSize(TType blockType) {
		return Main.TIntermediate_getBlockSize(blockType.getPtr());
	}

	public static int computeBufferReferenceTypeSize(TType t) {
		return Main.TIntermediate_computeBufferReferenceTypeSize(t.getPtr());
	}

}
