package com.destranix.glslang;

import java.util.EnumSet;

public class TParseContext extends TParseContextBase {

	private final TSymbolTable symbolTable;
	private final TIntermediate interm;
	private final boolean parsingBuiltins;
	private final int version;
	private final EProfile profile;
	private final SpvVersionStruct spvVersion;
	private final EShLanguage language;
	private final TInfoSink infoSink;
	private final boolean forwardCompatible;
	private final EnumSet<EShMessages> messages;
	private final String entryPoint;
	private final int constructorIndex;

	public TParseContext(TSymbolTable table, TIntermediate intermediate, boolean parsingBuiltins, int version,
			EProfile profile, SpvVersionStruct spvVersion, EShLanguage language, TInfoSink sink) {
		super(PoisonClass.singleton);
		this.symbolTable = table;
		this.interm = intermediate;
		this.parsingBuiltins = parsingBuiltins;
		this.version = version;
		this.profile = profile;
		this.spvVersion = spvVersion;
		this.language = language;
		this.infoSink = sink;
		this.forwardCompatible = false;
		this.messages = EnumSet.of(EShMessages.EShMsgDefault);
		this.entryPoint = null;
		this.constructorIndex = 0;
		load();
	}

	public TParseContext(TSymbolTable table, TIntermediate intermediate, boolean parsingBuiltins, int version,
			EProfile profile, SpvVersionStruct spvVersion, EShLanguage language, TInfoSink sink,
			boolean forwardCompatible) {
		super(PoisonClass.singleton);
		this.symbolTable = table;
		this.interm = intermediate;
		this.parsingBuiltins = parsingBuiltins;
		this.version = version;
		this.profile = profile;
		this.spvVersion = spvVersion;
		this.language = language;
		this.infoSink = sink;
		this.forwardCompatible = forwardCompatible;
		this.messages = EnumSet.of(EShMessages.EShMsgDefault);
		this.entryPoint = null;
		this.constructorIndex = 0;
		load();
	}

	public TParseContext(TSymbolTable table, TIntermediate intermediate, boolean parsingBuiltins, int version,
			EProfile profile, SpvVersionStruct spvVersion, EShLanguage language, TInfoSink sink,
			boolean forwardCompatible, EnumSet<EShMessages> messages) {
		super(PoisonClass.singleton);
		this.symbolTable = table;
		this.interm = intermediate;
		this.parsingBuiltins = parsingBuiltins;
		this.version = version;
		this.profile = profile;
		this.spvVersion = spvVersion;
		this.language = language;
		this.infoSink = sink;
		this.forwardCompatible = forwardCompatible;
		this.messages = messages;
		this.entryPoint = null;
		this.constructorIndex = 0;
		load();
	}

	public TParseContext(TSymbolTable table, TIntermediate intermediate, boolean parsingBuiltins, int version,
			EProfile profile, SpvVersionStruct spvVersion, EShLanguage language, TInfoSink sink,
			boolean forwardCompatible, EnumSet<EShMessages> messages, String entryPoint) {
		super(PoisonClass.singleton);
		this.symbolTable = table;
		this.interm = intermediate;
		this.parsingBuiltins = parsingBuiltins;
		this.version = version;
		this.profile = profile;
		this.spvVersion = spvVersion;
		this.language = language;
		this.infoSink = sink;
		this.forwardCompatible = forwardCompatible;
		this.messages = messages;
		this.entryPoint = entryPoint;
		this.constructorIndex = 0;
		load();
	}

	protected TParseContext(byte[] ptr) {
		super(ptr);
		this.symbolTable = null;
		this.interm = null;
		this.parsingBuiltins = false;
		this.version = -1;
		this.profile = null;
		this.spvVersion = null;
		this.language = null;
		this.infoSink = null;
		this.forwardCompatible = false;
		this.messages = null;
		this.entryPoint = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TParseContext(symbolTable.getPtr(), interm.getPtr(), parsingBuiltins, version, profile,
							spvVersion.getPtr(), language, infoSink.getPtr(), forwardCompatible, messages, entryPoint);
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

	public boolean obeyPrecisionQualifiers() {
		return Main.TParseContext_obeyPrecisionQualifiers(ptr);
	}

	public void setPrecisionDefaults() {
		Main.TParseContext_setPrecisionDefaults(ptr);
	}

	public void setLimits(TBuiltInResource resource) {
		Main.TParseContext_setLimits(ptr, resource.getPtr());
	}

	@Override
	public boolean parseShaderStrings(TPpContext c, TInputScanner input) {
		return Main.TParseContext_parseShaderStrings(ptr, c.getPtr(), input.getPtr());
	}

	@Override
	public boolean parseShaderStrings(TPpContext c, TInputScanner input, boolean versionWillBeError) {
		return Main.TParseContext_parseShaderStrings(ptr, c.getPtr(), input.getPtr(), versionWillBeError);
	}

	public void parserError(String s) {
		Main.TParseContext_parserError(ptr, s);
	}

	public void reservedErrorCheck(TSourceLoc loc, String s) {
		Main.TParseContext_reservedErrorCheck(ptr, loc.getPtr(), s);
	}

	@Override
	public void reservedPpErrorCheck(TSourceLoc loc, String name, String op) {
		Main.TParseContext_reservedPpErrorCheck(ptr, loc.getPtr(), name, op);
	}

	@Override
	public boolean lineContinuationCheck(TSourceLoc loc, boolean endOfComment) {
		return Main.TParseContext_lineContinuationCheck(ptr, loc.getPtr(), endOfComment);
	}

	@Override
	public boolean lineDirectiveShouldSetNextLine() {
		return Main.TParseContext_lineDirectiveShouldSetNextLine(ptr);
	}

	public boolean builtInName(String s) {
		return Main.TParseContext_builtInName(ptr, s);
	}

	@Override
	public void handlePragma(TSourceLoc loc, String[] strings) {
		Main.TParseContext_handlePragma(ptr, loc.getPtr(), strings);
	}

	public TIntermTyped handleVariable(TSourceLoc loc, TSymbol symbol, String string) {
		return fromPtr(Main.TParseContext_handleVariable(ptr, loc.getPtr(), symbol.getPtr(), string),
				TIntermTyped.class);
	}

	public TIntermTyped handleBracketDereference(TSourceLoc loc, TIntermTyped base, TIntermTyped index) {
		return fromPtr(Main.TParseContext_handleBracketDereference(ptr, loc.getPtr(), base.getPtr(), index.getPtr()),
				TIntermTyped.class);
	}

	public void handleIndexLimits(TSourceLoc loc, TIntermTyped base, TIntermTyped index) {
		Main.TParseContext_handleIndexLimits(ptr, loc.getPtr(), base.getPtr(), index.getPtr());
	}

	public void makeEditable(TSymbol symbol) {
		Main.TParseContext_makeEditable(ptr, symbol.getPtr());
	}

	public void ioArrayCheck(TSourceLoc loc, TType t, String identifier) {
		Main.TParseContext_ioArrayCheck(ptr, loc.getPtr(), t.getPtr(), identifier);
	}

	public boolean isIoResizeArray(TType t) {
		return Main.TParseContext_isIoResizeArray(ptr, t.getPtr());
	}

	public void fixIoArraySize(TSourceLoc loc, TType t) {
		Main.TParseContext_fixIoArraySize(ptr, loc.getPtr(), t.getPtr());
	}

	public void handleIoResizeArrayAccess(TSourceLoc loc, TIntermTyped base) {
		Main.TParseContext_handleIoResizeArrayAccess(ptr, loc.getPtr(), base.getPtr());
	}

	public void checkIoArraysConsistency(TSourceLoc loc) {
		Main.TParseContext_checkIoArraysConsistency(ptr, loc.getPtr());
	}

	public void checkIoArraysConsistency(TSourceLoc loc, boolean tailOnly) {
		Main.TParseContext_checkIoArraysConsistency(ptr, loc.getPtr(), tailOnly);
	}

	public int getIoArrayImplicitSize(TQualifier qualifier) {
		return Main.TParseContext_getIoArrayImplicitSize(ptr, qualifier.getPtr());
	}

	public int getIoArrayImplicitSize(TQualifier qualifier, String featureString) {
		return Main.TParseContext_getIoArrayImplicitSize(ptr, qualifier.getPtr(), featureString);
	}

	public void checkIoArrayConsistency(TSourceLoc loc, int requiredSize, String feature, TType t, String s) {
		Main.TParseContext_checkIoArrayConsistency(ptr, loc.getPtr(), requiredSize, feature, t.getPtr(), s);
	}

	public TIntermTyped handleBinaryMath(TSourceLoc loc, String str, TOperator op, TIntermTyped left,
			TIntermTyped right) {
		return fromPtr(Main.TParseContext_handleBinaryMath(ptr, loc.getPtr(), str, op, left.getPtr(), right.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped handleUnaryMath(TSourceLoc loc, String str, TOperator op, TIntermTyped childNode) {
		return fromPtr(Main.TParseContext_handleUnaryMath(ptr, loc.getPtr(), str, op, childNode.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped handleDotDereference(TSourceLoc loc, TIntermTyped base, String field) {
		return fromPtr(Main.TParseContext_handleDotDereference(ptr, loc.getPtr(), base.getPtr(), field),
				TIntermTyped.class);
	}

	public TIntermTyped handleDotSwizzle(TSourceLoc loc, TIntermTyped base, String field) {
		return fromPtr(Main.TParseContext_handleDotSwizzle(ptr, loc.getPtr(), base.getPtr(), field),
				TIntermTyped.class);
	}

	public void blockMemberExtensionCheck(TSourceLoc loc, TIntermTyped base, int member, String memberName) {
		Main.TParseContext_blockMemberExtensionCheck(ptr, loc.getPtr(), base.getPtr(), member, memberName);
	}

	public TFunction handleFunctionDeclarator(TSourceLoc loc, TFunction function, boolean prototype) {
		return fromPtr(Main.TParseContext_handleFunctionDeclarator(ptr, loc.getPtr(), function.getPtr(), prototype),
				TFunction.class);
	}

	public TIntermAggregate handleFunctionDefinition(TSourceLoc loc, TFunction function) {
		return fromPtr(Main.TParseContext_handleFunctionDefinition(ptr, loc.getPtr(), function.getPtr()),
				TIntermAggregate.class);
	}

	public TIntermTyped handleFunctionCall(TSourceLoc loc, TFunction function, TIntermNode node) {
		return fromPtr(Main.TParseContext_handleFunctionCall(ptr, loc.getPtr(), function.getPtr(), node.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped handleBuiltInFunctionCall(TSourceLoc loc, TIntermNode arguments, TFunction function) {
		return fromPtr(
				Main.TParseContext_handleBuiltInFunctionCall(ptr, loc.getPtr(), arguments.getPtr(), function.getPtr()),
				TIntermTyped.class);
	}

	public void computeBuiltinPrecisions(TIntermTyped node, TFunction function) {
		Main.TParseContext_computeBuiltinPrecisions(ptr, node.getPtr(), function.getPtr());
	}

	public TIntermNode handleReturnValue(TSourceLoc loc, TIntermTyped node) {
		return fromPtr(Main.TParseContext_handleReturnValue(ptr, loc.getPtr(), node.getPtr()), TIntermNode.class);
	}

	public void checkLocation(TSourceLoc loc, TOperator op) {
		Main.TParseContext_checkLocation(ptr, loc.getPtr(), op);
	}

	public TIntermTyped handleLengthMethod(TSourceLoc loc, TFunction function, TIntermNode node) {
		return fromPtr(Main.TParseContext_handleLengthMethod(ptr, loc.getPtr(), function.getPtr(), node.getPtr()),
				TIntermTyped.class);
	}

	public void addInputArgumentConversions(TFunction function, TIntermNode node) {
		Main.TParseContext_addInputArgumentConversions(ptr, function.getPtr(), node.getPtr());
	}

	public TIntermTyped addOutputArgumentConversions(TFunction function, TIntermAggregate node) {
		return fromPtr(Main.TParseContext_addOutputArgumentConversions(ptr, function.getPtr(), node.getPtr()),
				TIntermTyped.class);
	}
	
	public TIntermTyped addAssign(TSourceLoc loc, TOperator op, TIntermTyped left, TIntermTyped right) {
		return fromPtr(Main.TParseContext_addAssign(ptr, loc.getPtr(), op, left.getPtr(), right.getPtr()),
				TIntermTyped.class);
	}

	public void builtInOpCheck(TSourceLoc loc, TFunction function, TIntermOperator node) {
		Main.TParseContext_builtInOpCheck(ptr, loc.getPtr(), function.getPtr(), node.getPtr());
	}

	public void nonOpBuiltInCheck(TSourceLoc loc, TFunction function, TIntermAggregate node) {
		Main.TParseContext_nonOpBuiltInCheck(ptr, loc.getPtr(), function.getPtr(), node.getPtr());
	}

	public void userFunctionCallCheck(TSourceLoc loc, TIntermAggregate node) {
		Main.TParseContext_userFunctionCallCheck(ptr, loc.getPtr(), node.getPtr());
	}

	public void samplerConstructorLocationCheck(TSourceLoc loc, String token, TIntermNode node) {
		Main.TParseContext_samplerConstructorLocationCheck(ptr, loc.getPtr(), token, node.getPtr());
	}

	public TFunction handleConstructorCall(TSourceLoc loc, TPublicType t) {
		return fromPtr(Main.TParseContext_handleConstructorCall(ptr, loc.getPtr(), t.getPtr()), TFunction.class);
	}

	public void handlePrecisionQualifier(TSourceLoc loc, TQualifier qualifier, TPrecisionQualifier precisionQualifier) {
		Main.TParseContext_handlePrecisionQualifier(ptr, loc.getPtr(), qualifier.getPtr(), precisionQualifier);
	}

	public void checkPrecisionQualifier(TSourceLoc loc, TPrecisionQualifier precisionQualifier) {
		Main.TParseContext_checkPrecisionQualifier(ptr, loc.getPtr(), precisionQualifier);
	}

	public void memorySemanticsCheck(TSourceLoc loc, TFunction function, TIntermOperator callNode) {
		Main.TParseContext_memorySemanticsCheck(ptr, loc.getPtr(), function.getPtr(), callNode.getPtr());
	}

	public void assignError(TSourceLoc loc, String op, String left, String right) {
		Main.TParseContext_assignError(ptr, loc.getPtr(), op, left, right);
	}

	public void unaryOpError(TSourceLoc loc, String op, String operand) {
		Main.TParseContext_unaryOpError(ptr, loc.getPtr(), op, operand);
	}

	public void binaryOpError(TSourceLoc loc, String op, String left, String right) {
		Main.TParseContext_binaryOpError(ptr, loc.getPtr(), op, left, right);
	}

	public void variableCheck(TIntermTyped nodePtr) {
		Main.TParseContext_variableCheck(ptr, nodePtr.getPtr());
	}

	@Override
	public boolean lValueErrorCheck(TSourceLoc loc, String op, TIntermTyped node) {
		return Main.TParseContext_lValueErrorCheck(ptr, loc.getPtr(), op, node.getPtr());
	}

	@Override
	public void rValueErrorCheck(TSourceLoc loc, String op, TIntermTyped node) {
		Main.TParseContext_rValueErrorCheck(ptr, loc.getPtr(), op, node.getPtr());
	}

	public void constantValueCheck(TIntermTyped node, String token) {
		Main.TParseContext_constantValueCheck(ptr, node.getPtr(), token);
	}

	public void integerCheck(TIntermTyped node, String token) {
		Main.TParseContext_integerCheck(ptr, node.getPtr(), token);
	}

	public void globalCheck(TSourceLoc loc, String token) {
		Main.TParseContext_globalCheck(ptr, loc.getPtr(), token);
	}

	public boolean constructorError(TSourceLoc loc, TIntermNode node, TFunction function, TOperator op, TType t) {
		return Main.TParseContext_constructorError(ptr, loc.getPtr(), node.getPtr(), function.getPtr(), op, t.getPtr());
	}

	public boolean constructorTextureSamplerError(TSourceLoc loc, TFunction function) {
		return Main.TParseContext_constructorTextureSamplerError(ptr, loc.getPtr(), function.getPtr());
	}

	public void arraySizeCheck(TSourceLoc loc, TIntermTyped expr, TArraySize arraySize, String sizeType) {
		Main.TParseContext_arraySizeCheck(ptr, loc.getPtr(), expr.getPtr(), arraySize.getPtr(), sizeType);
	}

	public boolean arrayQualifierError(TSourceLoc loc, TQualifier qualifier) {
		return Main.TParseContext_arrayQualifierError(ptr, loc.getPtr(), qualifier.getPtr());
	}

	public boolean arrayError(TSourceLoc loc, TType t) {
		return Main.TParseContext_arrayError(ptr, loc.getPtr(), t.getPtr());
	}

	public void arraySizeRequiredCheck(TSourceLoc loc, TArraySizes arraySizes) {
		Main.TParseContext_arraySizeRequiredCheck(ptr, loc.getPtr(), arraySizes.getPtr());
	}

	public void structArrayCheck(TSourceLoc loc, TType structure) {
		Main.TParseContext_structArrayCheck(ptr, loc.getPtr(), structure.getPtr());
	}

	public void arraySizesCheck(TSourceLoc loc, TQualifier qualifier, TArraySizes arraySizes, TIntermTyped initializer,
			boolean lastMember) {
		Main.TParseContext_arraySizesCheck(ptr, loc.getPtr(), qualifier.getPtr(), arraySizes.getPtr(),
				initializer.getPtr(), lastMember);
	}

	public void arrayOfArrayVersionCheck(TSourceLoc loc, TArraySizes arraySizes) {
		Main.TParseContext_arrayOfArrayVersionCheck(ptr, loc.getPtr(), arraySizes.getPtr());
	}

	public boolean voidErrorCheck(TSourceLoc loc, String s, TBasicType t) {
		return Main.TParseContext_voidErrorCheck(ptr, loc.getPtr(), s, t);
	}

	public void boolCheck(TSourceLoc loc, TIntermTyped node) {
		Main.TParseContext_boolCheck(ptr, loc.getPtr(), node.getPtr());
	}

	public void boolCheckType(TSourceLoc loc, TPublicType t) {
		Main.TParseContext_boolCheckType(ptr, loc.getPtr(), t.getPtr());
	}

	public void samplerCheck(TSourceLoc loc, TType t, String identifier, TIntermTyped initializer) {
		Main.TParseContext_samplerCheck(ptr, loc.getPtr(), t.getPtr(), identifier, initializer.getPtr());
	}

	public void atomicUintCheck(TSourceLoc loc, TType t, String identifier) {
		Main.TParseContext_atomicUintCheck(ptr, loc.getPtr(), t.getPtr(), identifier);
	}

	public void accStructCheck(TSourceLoc loc, TType type, String identifier) {
		Main.TParseContext_accStructCheck(ptr, loc.getPtr(), type.getPtr(), identifier);
	}

	public void transparentOpaqueCheck(TSourceLoc loc, TType t, String identifier) {
		Main.TParseContext_transparentOpaqueCheck(ptr, loc.getPtr(), t.getPtr(), identifier);
	}

	public void memberQualifierCheck(TPublicType t) {
		Main.TParseContext_memberQualifierCheck(ptr, t.getPtr());
	}

	public void globalQualifierFixCheck(TSourceLoc loc, TQualifier qualifier) {
		Main.TParseContext_globalQualifierFixCheck(ptr, loc.getPtr(), qualifier.getPtr());
	}

	public void globalQualifierTypeCheck(TSourceLoc loc, TQualifier qualifier, TPublicType t) {
		Main.TParseContext_globalQualifierTypeCheck(ptr, loc.getPtr(), qualifier.getPtr(), t.getPtr());
	}

	public boolean structQualifierErrorCheck(TSourceLoc loc, TPublicType pType) {
		return Main.TParseContext_structQualifierErrorCheck(ptr, loc.getPtr(), pType.getPtr());
	}

	public void mergeQualifiers(TSourceLoc loc, TQualifier dst, TQualifier src, boolean force) {
		Main.TParseContext_mergeQualifiers(ptr, loc.getPtr(), dst.getPtr(), src.getPtr(), force);
	}

	public void setDefaultPrecision(TSourceLoc loc, TPublicType t, TPrecisionQualifier precisionQualifier) {
		Main.TParseContext_setDefaultPrecision(ptr, loc.getPtr(), t.getPtr(), precisionQualifier);
	}

	public int computeSamplerTypeIndex(TSampler sampler) {
		return Main.TParseContext_computeSamplerTypeIndex(ptr, sampler.getPtr());
	}

	public TPrecisionQualifier getDefaultPrecision(TPublicType t) {
		return TPrecisionQualifier.valueByConstant(Main.TParseContext_getDefaultPrecision(ptr, t.getPtr()));
	}

	public void precisionQualifierCheck(TSourceLoc loc, TBasicType t, TQualifier qualifier) {
		Main.TParseContext_precisionQualifierCheck(ptr, loc.getPtr(), t, qualifier.getPtr());
	}

	public void parameterTypeCheck(TSourceLoc loc, TStorageQualifier qualifier, TType type) {
		Main.TParseContext_parameterTypeCheck(ptr, loc.getPtr(), qualifier, type.getPtr());
	}

	public boolean containsFieldWithBasicType(TType type, TBasicType basicType) {
		return Main.TParseContext_containsFieldWithBasicType(ptr, type.getPtr(), basicType);
	}

	public TSymbol redeclareBuiltinVariable(TSourceLoc loc, String s, TQualifier qualifier,
			TShaderQualifiers shaderQualifiers) {
		return fromPtr(Main.TParseContext_redeclareBuiltinVariable(ptr, loc.getPtr(), s, qualifier.getPtr(),
				shaderQualifiers.getPtr()), TSymbol.class);
	}

	public void redeclareBuiltinBlock(TSourceLoc loc, TVector<TTypeLoc> typeList, String blockName, String instanceName,
			TArraySizes arraySizes) {
		Main.TParseContext_redeclareBuiltinBlock(ptr, loc.getPtr(), typeList.getPtr(), blockName, instanceName,
				arraySizes.getPtr());
	}

	public void paramCheckFixStorage(TSourceLoc loc, TStorageQualifier qualifier, TType type) {
		Main.TParseContext_paramCheckFixStorage(ptr, loc.getPtr(), qualifier, type.getPtr());
	}

	public void paramCheckFix(TSourceLoc loc, TQualifier qualifier, TType type) {
		Main.TParseContext_paramCheckFix(ptr, loc.getPtr(), qualifier.getPtr(), type.getPtr());
	}

	public void nestedBlockCheck(TSourceLoc loc) {
		Main.TParseContext_nestedBlockCheck(ptr, loc.getPtr());
	}

	public void nestedStructCheck(TSourceLoc loc) {
		Main.TParseContext_nestedStructCheck(ptr, loc.getPtr());
	}

	public void arrayObjectCheck(TSourceLoc loc, TType t, String op) {
		Main.TParseContext_arrayObjectCheck(ptr, loc.getPtr(), t.getPtr(), op);
	}

	public void opaqueCheck(TSourceLoc loc, TType t, String op) {
		Main.TParseContext_opaqueCheck(ptr, loc.getPtr(), t.getPtr(), op);
	}

	public void referenceCheck(TSourceLoc loc, TType t, String op) {
		Main.TParseContext_referenceCheck(ptr, loc.getPtr(), t.getPtr(), op);
	}

	public void storage16BitAssignmentCheck(TSourceLoc loc, TType t, String op) {
		Main.TParseContext_storage16BitAssignmentCheck(ptr, loc.getPtr(), t.getPtr(), op);
	}

	public void specializationCheck(TSourceLoc loc, TType t, String op) {
		Main.TParseContext_specializationCheck(ptr, loc.getPtr(), t.getPtr(), op);
	}

	public void structTypeCheck(TSourceLoc loc, TPublicType t) {
		Main.TParseContext_structTypeCheck(ptr, loc.getPtr(), t.getPtr());
	}

	public void inductiveLoopCheck(TSourceLoc loc, TIntermNode init, TIntermLoop loop) {
		Main.TParseContext_inductiveLoopCheck(ptr, loc.getPtr(), init.getPtr(), loop.getPtr());
	}

	public void arrayLimitCheck(TSourceLoc loc, String s, int size) {
		Main.TParseContext_arrayLimitCheck(ptr, loc.getPtr(), s, size);
	}

	public void limitCheck(TSourceLoc loc, int value, String limit, String feature) {
		Main.TParseContext_limitCheck(ptr, loc.getPtr(), value, limit, feature);
	}

	public void inductiveLoopBodyCheck(TIntermNode node, int loopIndexId, TSymbolTable table) {
		Main.TParseContext_inductiveLoopBodyCheck(ptr, node.getPtr(), loopIndexId, table.getPtr());
	}

	public void constantIndexExpressionCheck(TIntermNode node) {
		Main.TParseContext_constantIndexExpressionCheck(ptr, node.getPtr());
	}

	public void setLayoutQualifier(TSourceLoc loc, TPublicType t, String s) {
		Main.TParseContext_setLayoutQualifier(ptr, loc.getPtr(), t.getPtr(), s);
	}

	public void setLayoutQualifier(TSourceLoc loc, TPublicType t, String s, TIntermTyped node) {
		Main.TParseContext_setLayoutQualifier(ptr, loc.getPtr(), t.getPtr(), s, node.getPtr());
	}

	public void mergeObjectLayoutQualifiers(TQualifier dest, TQualifier src, boolean inheritOnly) {
		Main.TParseContext_mergeObjectLayoutQualifiers(ptr, dest.getPtr(), src.getPtr(), inheritOnly);
	}

	public void layoutObjectCheck(TSourceLoc loc, TSymbol symbol) {
		Main.TParseContext_layoutObjectCheck(ptr, loc.getPtr(), symbol.getPtr());
	}

	public void layoutMemberLocationArrayCheck(TSourceLoc loc, boolean memberWithLocation, TArraySizes arraySizes) {
		Main.TParseContext_layoutMemberLocationArrayCheck(ptr, loc.getPtr(), memberWithLocation, arraySizes.getPtr());
	}

	public void layoutTypeCheck(TSourceLoc loc, TType t) {
		Main.TParseContext_layoutTypeCheck(ptr, loc.getPtr(), t.getPtr());
	}

	public void layoutQualifierCheck(TSourceLoc loc, TQualifier qualifier) {
		Main.TParseContext_layoutQualifierCheck(ptr, loc.getPtr(), qualifier.getPtr());
	}

	public void checkNoShaderLayouts(TSourceLoc loc, TShaderQualifiers qualifier) {
		Main.TParseContext_checkNoShaderLayouts(ptr, loc.getPtr(), qualifier.getPtr());
	}

	public void fixOffset(TSourceLoc loc, TSymbol symbol) {
		Main.TParseContext_fixOffset(ptr, loc.getPtr(), symbol.getPtr());
	}

	public TFunction findFunction(TSourceLoc loc, TFunction call, boolean builtIn) {
		return fromPtr(Main.TParseContext_findFunction(ptr, loc.getPtr(), call.getPtr(), builtIn), TFunction.class);
	}

	public TFunction findFunctionExact(TSourceLoc loc, TFunction call, boolean builtIn) {
		return fromPtr(Main.TParseContext_findFunctionExact(ptr, loc.getPtr(), call.getPtr(), builtIn),
				TFunction.class);
	}

	public TFunction findFunction120(TSourceLoc loc, TFunction call, boolean builtIn) {
		return fromPtr(Main.TParseContext_findFunction120(ptr, loc.getPtr(), call.getPtr(), builtIn), TFunction.class);
	}

	public TFunction findFunction400(TSourceLoc loc, TFunction call, boolean builtIn) {
		return fromPtr(Main.TParseContext_findFunction400(ptr, loc.getPtr(), call.getPtr(), builtIn), TFunction.class);
	}

	public TFunction findFunctionExplicitTypes(TSourceLoc loc, TFunction call, boolean builtIn) {
		return fromPtr(Main.TParseContext_findFunctionExplicitTypes(ptr, loc.getPtr(), call.getPtr(), builtIn),
				TFunction.class);
	}

	public void declareTypeDefaults(TSourceLoc loc, TPublicType t) {
		Main.TParseContext_declareTypeDefaults(ptr, loc.getPtr(), t.getPtr());
	}

	public TIntermNode declareVariable(TSourceLoc loc, String identifier, TPublicType t) {
		return fromPtr(Main.TParseContext_declareVariable(ptr, loc.getPtr(), identifier, t.getPtr()),
				TIntermNode.class);
	}

	public TIntermNode declareVariable(TSourceLoc loc, String identifier, TPublicType t, TArraySizes typeArray) {
		return fromPtr(
				Main.TParseContext_declareVariable(ptr, loc.getPtr(), identifier, t.getPtr(), typeArray.getPtr()),
				TIntermNode.class);
	}

	public TIntermNode declareVariable(TSourceLoc loc, String identifier, TPublicType t, TArraySizes typeArray,
			TIntermTyped initializer) {
		return fromPtr(Main.TParseContext_declareVariable(ptr, loc.getPtr(), identifier, t.getPtr(), typeArray.getPtr(),
				initializer.getPtr()), TIntermNode.class);
	}

	public TIntermTyped addConstructor(TSourceLoc loc, TIntermNode node, TType t) {
		return fromPtr(Main.TParseContext_addConstructor(ptr, loc.getPtr(), node.getPtr(), t.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped constructAggregate(TIntermNode node, TType t, int i, TSourceLoc loc) {
		return fromPtr(Main.TParseContext_constructAggregate(ptr, node.getPtr(), t.getPtr(), i, loc.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped constructBuiltIn(TType t, TOperator op, TIntermTyped node, TSourceLoc loc, boolean subset) {
		return fromPtr(Main.TParseContext_constructBuiltIn(ptr, t.getPtr(), op, node.getPtr(), loc.getPtr(), subset),
				TIntermTyped.class);
	}

	public void inheritMemoryQualifiers(TQualifier from, TQualifier to) {
		Main.TParseContext_inheritMemoryQualifiers(ptr, from.getPtr(), to.getPtr());
	}

	public void declareBlock(TSourceLoc loc, TVector<TTypeLoc> typeList) {
		Main.TParseContext_declareBlock(ptr, loc.getPtr(), typeList.getPtr());
	}

	public void declareBlock(TSourceLoc loc, TVector<TTypeLoc> typeList, String instanceName) {
		Main.TParseContext_declareBlock(ptr, loc.getPtr(), typeList.getPtr(), instanceName);
	}

	public void declareBlock(TSourceLoc loc, TVector<TTypeLoc> typeList, String instanceName, TArraySizes arraySizes) {
		Main.TParseContext_declareBlock(ptr, loc.getPtr(), typeList.getPtr(), instanceName, arraySizes.getPtr());
	}

	public void blockStageIoCheck(TSourceLoc loc, TQualifier qualifier) {
		Main.TParseContext_blockStageIoCheck(ptr, loc.getPtr(), qualifier.getPtr());
	}

	public void blockQualifierCheck(TSourceLoc loc, TQualifier qualifier, boolean instanceName) {
		Main.TParseContext_blockQualifierCheck(ptr, loc.getPtr(), qualifier.getPtr(), instanceName);
	}

	public void fixBlockLocations(TSourceLoc loc, TQualifier qualifier, TVector<TTypeLoc> list,
			boolean memberWithLocation, boolean memberWithoutLocation) {
		Main.TParseContext_fixBlockLocations(ptr, loc.getPtr(), qualifier.getPtr(), list.getPtr(), memberWithLocation,
				memberWithoutLocation);
	}

	public void fixXfbOffsets(TQualifier qualifier, TVector<TTypeLoc> list) {
		Main.TParseContext_fixXfbOffsets(ptr, qualifier.getPtr(), list.getPtr());
	}

	public void fixBlockUniformOffsets(TQualifier qualifier, TVector<TTypeLoc> list) {
		Main.TParseContext_fixBlockUniformOffsets(ptr, qualifier.getPtr(), list.getPtr());
	}

	public void fixBlockUniformLayoutMatrix(TQualifier qualifier, TVector<TTypeLoc> list0, TVector<TTypeLoc> list1) {
		Main.TParseContext_fixBlockUniformLayoutMatrix(ptr, qualifier.getPtr(), list0.getPtr(), list1.getPtr());
	}

	public void fixBlockUniformLayoutPacking(TQualifier qualifier, TVector<TTypeLoc> list0, TVector<TTypeLoc> list1) {
		Main.TParseContext_fixBlockUniformLayoutPacking(ptr, qualifier.getPtr(), list0.getPtr(), list1.getPtr());
	}

	public void addQualifierToExisting(TSourceLoc loc, TQualifier qualifier, String identifier) {
		Main.TParseContext_addQualifierToExisting(ptr, loc.getPtr(), qualifier.getPtr(), identifier);
	}

	public void addQualifierToExisting(TSourceLoc loc, TQualifier qualifier, TVector<TString> list) {
		Main.TParseContext_addQualifierToExisting(ptr, loc.getPtr(), qualifier.getPtr(), list.getPtr());
	}

	public void invariantCheck(TSourceLoc loc, TQualifier qualifier) {
		Main.TParseContext_invariantCheck(ptr, loc.getPtr(), qualifier.getPtr());
	}

	public void updateStandaloneQualifierDefaults(TSourceLoc loc, TPublicType t) {
		Main.TParseContext_updateStandaloneQualifierDefaults(ptr, loc.getPtr(), t.getPtr());
	}

	public void wrapupSwitchSubsequence(TIntermAggregate statements, TIntermNode branchNode) {
		Main.TParseContext_wrapupSwitchSubsequence(ptr, statements.getPtr(), branchNode.getPtr());
	}

	public TIntermNode addSwitch(TSourceLoc loc, TIntermTyped expression, TIntermAggregate body) {
		return fromPtr(Main.TParseContext_addSwitch(ptr, loc.getPtr(), expression.getPtr(), body.getPtr()),
				TIntermNode.class);
	}

	public TVector<TTypeLoc> recordStructCopy(CMap<TVector<TTypeLoc>, IntKeyedCMap<TVector<TTypeLoc>>> record, TType t0,
			TType t1) {
		@SuppressWarnings("unchecked") // Is checked
		TVector<TTypeLoc> tmp = (TVector<TTypeLoc>) fromPtr(
				Main.TParseContext_recordStructCopy(ptr, record.getPtr(), t0.getPtr(), t1.getPtr()), TVector.class);
		return tmp;
	}

	public TAttributeType attributeFromName(String name) {
		return TAttributeType.valueByConstant(Main.TParseContext_attributeFromName(ptr, name));
	}

	public TList<TAttributeArgs> makeAttributes(String identifier) {
		@SuppressWarnings("unchecked") // Is checked
		TList<TAttributeArgs> tmp = (TList<TAttributeArgs>) fromPtr(Main.TParseContext_makeAttributes(ptr, identifier),
				TList.class);
		return tmp;
	}

	public TList<TAttributeArgs> makeAttributes(String identifier, TIntermNode node) {
		@SuppressWarnings("unchecked") // Is checked
		TList<TAttributeArgs> tmp = (TList<TAttributeArgs>) fromPtr(
				Main.TParseContext_makeAttributes(ptr, identifier, node.getPtr()), TList.class);
		return tmp;
	}

	public TList<TAttributeArgs> mergeAttributes(TList<TAttributeArgs> a0, TList<TAttributeArgs> a1) {
		@SuppressWarnings("unchecked") // Is checked
		TList<TAttributeArgs> tmp = (TList<TAttributeArgs>) fromPtr(
				Main.TParseContext_mergeAttributes(ptr, a0.getPtr(), a1.getPtr()), TList.class);
		return tmp;
	}

	public void handleSelectionAttributes(TList<TAttributeArgs> attributes, TIntermNode node) {
		Main.TParseContext_handleSelectionAttributes(ptr, attributes.getPtr(), node.getPtr());
	}

	public void handleSwitchAttributes(TList<TAttributeArgs> attributes, TIntermNode node) {
		Main.TParseContext_handleSwitchAttributes(ptr, attributes.getPtr(), node.getPtr());
	}

	public void handleLoopAttributes(TList<TAttributeArgs> attributes, TIntermNode node) {
		Main.TParseContext_handleLoopAttributes(ptr, attributes.getPtr(), node.getPtr());
	}

	public void checkAndResizeMeshViewDim(TSourceLoc loc, TType t, boolean isBlockMember) {
		Main.TParseContext_checkAndResizeMeshViewDim(ptr, loc.getPtr(), t.getPtr(), isBlockMember);
	}

	public void setInMain(boolean v) {
		Main.TParseContext_setInMain(ptr, v);
	}

	public void setBlockName(String v) {
		Main.TParseContext_setBlockName(ptr, v);
	}

	public void setCurrentBlockQualifier(TQualifier v) {
		Main.TParseContext_setCurrentBlockQualifier(ptr, v.getPtr());
	}

	public void setDefaultPrecision(TPrecisionQualifier[] v) {
		int[] tmp = new int[v.length];
		for (int i = 0; i < v.length; ++i) {
			tmp[i] = v[i].getConstant();
		}
		Main.TParseContext_setDefaultPrecision(ptr, tmp);
	}

	public void setResources(TBuiltInResource v) {
		Main.TParseContext_setResources(ptr, v.getPtr());
	}

	public void setLimits(TLimits v) {
		Main.TParseContext_setLimitsSetter(ptr, v.getPtr());
	}

	public boolean getInMain() {
		return Main.TParseContext_getInMain(ptr);
	}

	public String getBlockName() {
		return Main.TParseContext_getBlockName(ptr);
	}

	public TQualifier getCurrentBlockQualifier() {
		return fromPtr(Main.TParseContext_getCurrentBlockQualifier(ptr), TQualifier.class);
	}

	public TPrecisionQualifier[] getDefaultPrecision() {
		int[] tmp = Main.TParseContext_getDefaultPrecision(ptr);
		TPrecisionQualifier[] ret = new TPrecisionQualifier[tmp.length];
		for (int i = 0; i < tmp.length; ++i) {
			ret[i] = TPrecisionQualifier.valueByConstant(tmp[i]);
		}
		return ret;
	}

	public TBuiltInResource getResources() {
		return fromPtr(Main.TParseContext_getResources(ptr), TBuiltInResource.class);
	}

	public TLimits getLimits() {
		return fromPtr(Main.TParseContext_getLimits(ptr), TLimits.class);
	}

}
