package Java;

import java.util.EnumSet;

public class HlslParseContext extends TParseContextBase {

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
	private final String sourceEntryPointName;
	private final int constructorIndex;

	public HlslParseContext(TSymbolTable table, TIntermediate intermediate, boolean parsingBuiltins, int version,
			EProfile profile, SpvVersionStruct spvVersion, EShLanguage language, TInfoSink sink,
			String sourceEntryPointName) {
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
		this.sourceEntryPointName = sourceEntryPointName;
		this.constructorIndex = 0;
		load();
	}

	public HlslParseContext(TSymbolTable table, TIntermediate intermediate, boolean parsingBuiltins, int version,
			EProfile profile, SpvVersionStruct spvVersion, EShLanguage language, TInfoSink sink,
			String sourceEntryPointName, boolean forwardCompatible) {
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
		this.sourceEntryPointName = sourceEntryPointName;
		this.constructorIndex = 0;
		load();
	}

	public HlslParseContext(TSymbolTable table, TIntermediate intermediate, boolean parsingBuiltins, int version,
			EProfile profile, SpvVersionStruct spvVersion, EShLanguage language, TInfoSink sink,
			String sourceEntryPointName, boolean forwardCompatible, EnumSet<EShMessages> messages) {
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
		this.sourceEntryPointName = sourceEntryPointName;
		this.constructorIndex = 0;
		load();
	}

	protected HlslParseContext(byte[] ptr) {
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
		this.sourceEntryPointName = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.HlslParseContext(symbolTable.getPtr(), interm.getPtr(), parsingBuiltins, version,
							profile, spvVersion.getPtr(), language, infoSink.getPtr(), sourceEntryPointName,
							forwardCompatible, messages);
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

	@Override
	public void initializeExtensionBehavior() {
		Main.HlslParseContext_initializeExtensionBehavior(ptr);
	}

	public void setLimits(TBuiltInResource resources) {
		Main.HlslParseContext_setLimits(ptr, resources.getPtr());
	}

	@Override
	public boolean parseShaderStrings(TPpContext context, TInputScanner input) {
		return Main.HlslParseContext_parseShaderStrings(ptr, context.getPtr(), input.getPtr());
	}

	@Override
	public boolean parseShaderStrings(TPpContext context, TInputScanner input, boolean versionWillBeError) {
		return Main.HlslParseContext_parseShaderStrings(ptr, context.getPtr(), input.getPtr(), versionWillBeError);
	}

	public String getGlobalUniformBlockName() {
		return Main.HlslParseContext_getGlobalUniformBlockName(ptr);
	}

	public void setUniformBlockDefaults(TType block) {
		Main.HlslParseContext_setUniformBlockDefaults(ptr, block.getPtr());
	}

	@Override
	public void reservedPpErrorCheck(TSourceLoc loc, String name, String op) {
		Main.HlslParseContext_reservedPpErrorCheck(ptr, loc.getPtr(), name, op);
	}

	@Override
	public boolean lineContinuationCheck(TSourceLoc loc, boolean endOfComment) {
		return Main.HlslParseContext_lineContinuationCheck(ptr, loc.getPtr(), endOfComment);
	}

	@Override
	public boolean lineDirectiveShouldSetNextLine() {
		return Main.HlslParseContext_lineDirectiveShouldSetNextLine(ptr);
	}

	public boolean builtInName(String s) {
		return Main.HlslParseContext_builtInName(ptr, s);
	}

	@Override
	public void handlePragma(TSourceLoc loc, String[] strings) {
		Main.HlslParseContext_handlePragma(ptr, loc.getPtr(), strings);
	}

	public TIntermTyped handleVariable(TSourceLoc loc, String string) {
		return fromPtr(Main.HlslParseContext_handleVariable(ptr, loc.getPtr(), string), TIntermTyped.class);
	}

	public TIntermTyped handleBracketDereference(TSourceLoc loc, TIntermTyped base, TIntermTyped index) {
		return fromPtr(Main.HlslParseContext_handleBracketDereference(ptr, loc.getPtr(), base.getPtr(), index.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped handleBracketOperator(TSourceLoc loc, TIntermTyped base, TIntermTyped index) {
		return fromPtr(Main.HlslParseContext_handleBracketOperator(ptr, loc.getPtr(), base.getPtr(), index.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped handleBinaryMath(TSourceLoc loc, String str, TOperator op, TIntermTyped left,
			TIntermTyped right) {
		return fromPtr(
				Main.HlslParseContext_handleBinaryMath(ptr, loc.getPtr(), str, op, left.getPtr(), right.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped handleUnaryMath(TSourceLoc loc, String str, TOperator op, TIntermTyped childNode) {
		return fromPtr(Main.HlslParseContext_handleUnaryMath(ptr, loc.getPtr(), str, op, childNode.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped handleDotDereference(TSourceLoc loc, TIntermTyped base, String field) {
		return fromPtr(Main.HlslParseContext_handleDotDereference(ptr, loc.getPtr(), base.getPtr(), field),
				TIntermTyped.class);
	}

	public boolean isBuiltInMethod(TSourceLoc loc, TIntermTyped base, String field) {
		return Main.HlslParseContext_isBuiltInMethod(ptr, loc.getPtr(), base.getPtr(), field);
	}

	public void assignToInterface(TVariable variable) {
		Main.HlslParseContext_assignToInterface(ptr, variable.getPtr());
	}

	public void handleFunctionDeclarator(TSourceLoc loc, TFunction function, boolean prototype) {
		Main.HlslParseContext_handleFunctionDeclarator(ptr, loc.getPtr(), function.getPtr(), prototype);
	}

	public TIntermAggregate handleFunctionDefinition(TSourceLoc loc, TFunction func, TList<TAttributeArgs> attr,
			TIntermNode entryPointTree) {
		return fromPtr(Main.HlslParseContext_handleFunctionDefinition(ptr, loc.getPtr(), func.getPtr(), attr.getPtr(),
				entryPointTree.getPtr()), TIntermAggregate.class);
	}

	public TIntermNode transformEntryPoint(TSourceLoc loc, TFunction func, TList<TAttributeArgs> attr) {
		return fromPtr(Main.HlslParseContext_transformEntryPoint(ptr, loc.getPtr(), func.getPtr(), attr.getPtr()),
				TIntermNode.class);
	}

	public void handleEntryPointAttributes(TSourceLoc loc, TList<TAttributeArgs> attr) {
		Main.HlslParseContext_handleEntryPointAttributes(ptr, loc.getPtr(), attr.getPtr());
	}

	public void transferTypeAttributes(TSourceLoc loc, TList<TAttributeArgs> attr, TType t) {
		Main.HlslParseContext_transferTypeAttributes(ptr, loc.getPtr(), attr.getPtr(), t.getPtr());
	}

	public void transferTypeAttributes(TSourceLoc loc, TList<TAttributeArgs> attr, TType t, boolean allowEntry) {
		Main.HlslParseContext_transferTypeAttributes(ptr, loc.getPtr(), attr.getPtr(), t.getPtr(), allowEntry);
	}

	public void handleFunctionBody(TSourceLoc loc, TFunction func, TIntermNode functionBody, TIntermNode node) {
		Main.HlslParseContext_handleFunctionBody(ptr, loc.getPtr(), func.getPtr(), functionBody.getPtr(),
				node.getPtr());
	}

	public void remapEntryPointIO(TFunction function, TVariable returnValue, TVector<TVariable> inputs,
			TVector<TVariable> outputs) {
		Main.HlslParseContext_remapEntryPointIO(ptr, function.getPtr(), returnValue.getPtr(), inputs.getPtr(),
				outputs.getPtr());
	}

	public void remapNonEntryPointIO(TFunction function) {
		Main.HlslParseContext_remapNonEntryPointIO(ptr, function.getPtr());
	}

	public TIntermNode handleReturnValue(TSourceLoc loc, TIntermTyped node) {
		return fromPtr(Main.HlslParseContext_handleReturnValue(ptr, loc.getPtr(), node.getPtr()), TIntermNode.class);
	}

	public void handleFunctionArgument(TFunction func, TIntermTyped arguments, TIntermTyped newArg) {
		Main.HlslParseContext_handleFunctionArgument(ptr, func.getPtr(), arguments.getPtr(), newArg.getPtr());
	}

	public TIntermTyped handleAssign(TSourceLoc loc, TOperator op, TIntermTyped left, TIntermTyped right) {
		return fromPtr(Main.HlslParseContext_handleAssign(ptr, loc.getPtr(), op, left.getPtr(), right.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped handleAssignToMatrixSwizzle(TSourceLoc loc, TOperator op, TIntermTyped left,
			TIntermTyped right) {
		return fromPtr(
				Main.HlslParseContext_handleAssignToMatrixSwizzle(ptr, loc.getPtr(), op, left.getPtr(), right.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped handleFunctionCall(TSourceLoc loc, TFunction func, TIntermTyped node) {
		return fromPtr(Main.HlslParseContext_handleFunctionCall(ptr, loc.getPtr(), func.getPtr(), node.getPtr()),
				TIntermTyped.class);
	}

	public TIntermAggregate assignClipCullDistance(TSourceLoc loc, TOperator op, int semanticId, TIntermTyped left,
			TIntermTyped right) {
		return fromPtr(Main.HlslParseContext_assignClipCullDistance(ptr, loc.getPtr(), op, semanticId, left.getPtr(),
				right.getPtr()), TIntermAggregate.class);
	}

	public TIntermTyped assignPosition(TSourceLoc loc, TOperator op, TIntermTyped left, TIntermTyped right) {
		return fromPtr(Main.HlslParseContext_assignPosition(ptr, loc.getPtr(), op, left.getPtr(), right.getPtr()),
				TIntermTyped.class);
	}

	public void decomposeIntrinsic(TSourceLoc loc, TIntermTyped node, TIntermNode arguments) {
		Main.HlslParseContext_decomposeIntrinsic(ptr, loc.getPtr(), node.getPtr(), arguments.getPtr());
	}

	public void decomposeSampleMethods(TSourceLoc loc, TIntermTyped node, TIntermNode arguments) {
		Main.HlslParseContext_decomposeSampleMethods(ptr, loc.getPtr(), node.getPtr(), arguments.getPtr());
	}

	public void decomposeStructBufferMethods(TSourceLoc loc, TIntermTyped node, TIntermNode arguments) {
		Main.HlslParseContext_decomposeStructBufferMethods(ptr, loc.getPtr(), node.getPtr(), arguments.getPtr());
	}

	public void decomposeGeometryMethods(TSourceLoc loc, TIntermTyped node, TIntermNode arguments) {
		Main.HlslParseContext_decomposeGeometryMethods(ptr, loc.getPtr(), node.getPtr(), arguments.getPtr());
	}

	public void pushFrontArguments(TIntermTyped front, TIntermTyped arguments) {
		Main.HlslParseContext_pushFrontArguments(ptr, front.getPtr(), arguments.getPtr());
	}

	public void addInputArgumentConversions(TFunction func, TIntermTyped node) {
		Main.HlslParseContext_addInputArgumentConversions(ptr, func.getPtr(), node.getPtr());
	}

	public void expandArguments(TSourceLoc loc, TFunction func, TIntermTyped node) {
		Main.HlslParseContext_expandArguments(ptr, loc.getPtr(), func.getPtr(), node.getPtr());
	}

	public TIntermTyped addOutputArgumentConversions(TFunction func, TIntermOperator node) {
		return fromPtr(Main.HlslParseContext_addOutputArgumentConversions(ptr, func.getPtr(), node.getPtr()),
				TIntermTyped.class);
	}

	public void builtInOpCheck(TSourceLoc loc, TFunction func, TIntermOperator node) {
		Main.HlslParseContext_builtInOpCheck(ptr, loc.getPtr(), func.getPtr(), node.getPtr());
	}

	public TFunction makeConstructorCall(TSourceLoc loc, TType t) {
		return fromPtr(Main.HlslParseContext_makeConstructorCall(ptr, loc.getPtr(), t.getPtr()), TFunction.class);
	}

	public void handleSemantic(TSourceLoc loc, TQualifier qualifier, TBuiltInVariable var, String upperCase) {
		Main.HlslParseContext_handleSemantic(ptr, loc.getPtr(), qualifier.getPtr(), var, upperCase);
	}

	public void handlePackOffset(TSourceLoc loc, TQualifier qualifier, String location, String component) {
		Main.HlslParseContext_handlePackOffset(ptr, loc.getPtr(), qualifier.getPtr(), location, component);
	}

	public void handleRegister(TSourceLoc loc, TQualifier qualifier, String profile, String desc, int subComponent,
			String s) {
		Main.HlslParseContext_handleRegister(ptr, loc.getPtr(), qualifier.getPtr(), profile, desc, subComponent, s);
	}

	public TIntermTyped convertConditionalExpression(TSourceLoc loc, TIntermTyped node) {
		return fromPtr(Main.HlslParseContext_convertConditionalExpression(ptr, loc.getPtr(), node.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped convertConditionalExpression(TSourceLoc loc, TIntermTyped node, boolean mustBeScalar) {
		return fromPtr(
				Main.HlslParseContext_convertConditionalExpression(ptr, loc.getPtr(), node.getPtr(), mustBeScalar),
				TIntermTyped.class);
	}

	public TIntermAggregate handleSamplerTextureCombine(TSourceLoc loc, TIntermTyped argTex, TIntermTyped argSampler) {
		return fromPtr(Main.HlslParseContext_handleSamplerTextureCombine(ptr, loc.getPtr(), argTex.getPtr(),
				argSampler.getPtr()), TIntermAggregate.class);
	}

	public boolean parseMatrixSwizzleSelector(TSourceLoc loc, String s, int cols, int rows,
			TSwizzleSelectors<TMatrixSelector> selectors) {
		return Main.HlslParseContext_parseMatrixSwizzleSelector(ptr, loc.getPtr(), s, cols, rows, selectors.getPtr());
	}

	public int getMatrixComponentsColumn(int rows, TSwizzleSelectors<TMatrixSelector> selectors) {
		return Main.HlslParseContext_getMatrixComponentsColumn(ptr, rows, selectors.getPtr());
	}

	public void assignError(TSourceLoc loc, String op, String left, String right) {
		Main.HlslParseContext_assignError(ptr, loc.getPtr(), op, left, right);
	}

	public void unaryOpError(TSourceLoc loc, String op, String operand) {
		Main.HlslParseContext_unaryOpError(ptr, loc.getPtr(), op, operand);
	}

	public void binaryOpError(TSourceLoc loc, String op, String left, String right) {
		Main.HlslParseContext_binaryOpError(ptr, loc.getPtr(), op, left, right);
	}

	public void variableCheck(TIntermTyped nodePtr) {
		Main.HlslParseContext_variableCheck(ptr, nodePtr.getPtr());
	}

	public void constantValueCheck(TIntermTyped node, String token) {
		Main.HlslParseContext_constantValueCheck(ptr, node.getPtr(), token);
	}

	public void integerCheck(TIntermTyped node, String token) {
		Main.HlslParseContext_integerCheck(ptr, node.getPtr(), token);
	}

	public void globalCheck(TSourceLoc loc, String token) {
		Main.HlslParseContext_globalCheck(ptr, loc.getPtr(), token);
	}

	public boolean constructorError(TSourceLoc loc, TIntermNode node, TFunction func, TOperator op, TType t) {
		return Main.HlslParseContext_constructorError(ptr, loc.getPtr(), node.getPtr(), func.getPtr(), op, t.getPtr());
	}

	public void arraySizeCheck(TSourceLoc loc, TIntermTyped expr, TArraySize arraySize) {
		Main.HlslParseContext_arraySizeCheck(ptr, loc.getPtr(), expr.getPtr(), arraySize.getPtr());
	}

	public void arraySizeRequiredCheck(TSourceLoc loc, TArraySizes arraySizes) {
		Main.HlslParseContext_arraySizeRequiredCheck(ptr, loc.getPtr(), arraySizes.getPtr());
	}

	public void structArrayCheck(TSourceLoc loc, TType structure) {
		Main.HlslParseContext_structArrayCheck(ptr, loc.getPtr(), structure.getPtr());
	}

	public boolean voidErrorCheck(TSourceLoc loc, String s, TBasicType t) {
		return Main.HlslParseContext_voidErrorCheck(ptr, loc.getPtr(), s, t);
	}

	public void globalQualifierFix(TSourceLoc loc, TQualifier qualifier) {
		Main.HlslParseContext_globalQualifierFix(ptr, loc.getPtr(), qualifier.getPtr());
	}

	public boolean structQualifierErrorCheck(TSourceLoc loc, TPublicType pType) {
		return Main.HlslParseContext_structQualifierErrorCheck(ptr, loc.getPtr(), pType.getPtr());
	}

	public void mergeQualifiers(TQualifier dst, TQualifier src) {
		Main.HlslParseContext_mergeQualifiers(ptr, dst.getPtr(), src.getPtr());
	}

	public int computeSamplerTypeIndex(TSampler sampler) {
		return Main.HlslParseContext_computeSamplerTypeIndex(ptr, sampler.getPtr());
	}

	public TSymbol redeclareBuiltinVariable(TSourceLoc loc, String s, TQualifier qualifier,
			TShaderQualifiers shaderQualifiers) {
		return fromPtr(Main.HlslParseContext_redeclareBuiltinVariable(ptr, loc.getPtr(), s, qualifier.getPtr(),
				shaderQualifiers.getPtr()), TSymbol.class);
	}

	public void paramFix(TType type) {
		Main.HlslParseContext_paramFix(ptr, type.getPtr());
	}

	public void specializationCheck(TSourceLoc loc, TType t, String op) {
		Main.HlslParseContext_specializationCheck(ptr, loc.getPtr(), t.getPtr(), op);
	}

	public void setLayoutQualifier(TSourceLoc loc, TQualifier qualifier, String s) {
		Main.HlslParseContext_setLayoutQualifier(ptr, loc.getPtr(), qualifier.getPtr(), s);
	}

	public void setLayoutQualifier(TSourceLoc loc, TQualifier qualifier, String s, TIntermTyped node) {
		Main.HlslParseContext_setLayoutQualifier(ptr, loc.getPtr(), qualifier.getPtr(), s, node.getPtr());
	}

	public void setSpecConstantId(TSourceLoc loc, TQualifier qualifier, int value) {
		Main.HlslParseContext_setSpecConstantId(ptr, loc.getPtr(), qualifier.getPtr(), value);
	}

	public void mergeObjectLayoutQualifiers(TQualifier dest, TQualifier src, boolean inheritOnly) {
		Main.HlslParseContext_mergeObjectLayoutQualifiers(ptr, dest.getPtr(), src.getPtr(), inheritOnly);
	}

	public void checkNoShaderLayouts(TSourceLoc loc, TShaderQualifiers shaderQualifiers) {
		Main.HlslParseContext_checkNoShaderLayouts(ptr, loc.getPtr(), shaderQualifiers.getPtr());
	}

	public TFunction findFunction(TSourceLoc loc, TFunction call, boolean builtIn, int thisDepth, TIntermTyped args) {
		return fromPtr(
				Main.HlslParseContext_findFunction(ptr, loc.getPtr(), call.getPtr(), builtIn, thisDepth, args.getPtr()),
				TFunction.class);
	}

	public void addGenMulArgumentConversion(TSourceLoc loc, TFunction call, TIntermTyped args) {
		Main.HlslParseContext_addGenMulArgumentConversion(ptr, loc.getPtr(), call.getPtr(), args.getPtr());
	}

	public void declareTypedef(TSourceLoc loc, String identifier, TType t) {
		Main.HlslParseContext_declareTypedef(ptr, loc.getPtr(), identifier, t.getPtr());
	}

	public void declareStruct(TSourceLoc loc, String structName, TType t) {
		Main.HlslParseContext_declareStruct(ptr, loc.getPtr(), structName, t.getPtr());
	}

	public TSymbol lookupUserType(String s, TType t) {
		return fromPtr(Main.HlslParseContext_lookupUserType(ptr, s, t.getPtr()), TSymbol.class);
	}

	public TIntermNode declareVariable(TSourceLoc loc, String identifier, TType t) {
		return fromPtr(Main.HlslParseContext_declareVariable(ptr, loc.getPtr(), identifier, t.getPtr()),
				TIntermNode.class);
	}

	public TIntermNode declareVariable(TSourceLoc loc, String identifier, TType t, TIntermTyped initializer) {
		return fromPtr(
				Main.HlslParseContext_declareVariable(ptr, loc.getPtr(), identifier, t.getPtr(), initializer.getPtr()),
				TIntermNode.class);
	}

	public void lengthenList(TSourceLoc loc, TVector<TIntermNode> list, int size, TIntermTyped scalarInit) {
		Main.HlslParseContext_lengthenList(ptr, loc.getPtr(), list.getPtr(), size, scalarInit.getPtr());
	}

	public TIntermTyped handleConstructor(TSourceLoc loc, TIntermTyped node, TType t) {
		return fromPtr(Main.HlslParseContext_handleConstructor(ptr, loc.getPtr(), node.getPtr(), t.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped addConstructor(TSourceLoc loc, TIntermTyped node, TType t) {
		return fromPtr(Main.HlslParseContext_addConstructor(ptr, loc.getPtr(), node.getPtr(), t.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped convertArray(TIntermTyped node, TType t) {
		return fromPtr(Main.HlslParseContext_convertArray(ptr, node.getPtr(), t.getPtr()), TIntermTyped.class);
	}

	public TIntermTyped constructAggregate(TIntermNode node, TType t, int i, TSourceLoc loc) {
		return fromPtr(Main.HlslParseContext_constructAggregate(ptr, node.getPtr(), t.getPtr(), i, loc.getPtr()),
				TIntermTyped.class);
	}

	public TIntermTyped constructBuiltIn(TType t, TOperator op, TIntermTyped node, TSourceLoc loc, boolean subset) {
		return fromPtr(Main.HlslParseContext_constructBuiltIn(ptr, t.getPtr(), op, node.getPtr(), loc.getPtr(), subset),
				TIntermTyped.class);
	}

	public void declareBlock(TSourceLoc loc, TType t) {
		Main.HlslParseContext_declareBlock(ptr, loc.getPtr(), t.getPtr());
	}

	public void declareBlock(TSourceLoc loc, TType t, String instanceName) {
		Main.HlslParseContext_declareBlock(ptr, loc.getPtr(), t.getPtr(), instanceName);
	}

	public void declareStructBufferCounter(TSourceLoc loc, TType bufferType, String name) {
		Main.HlslParseContext_declareStructBufferCounter(ptr, loc.getPtr(), bufferType.getPtr(), name);
	}

	public void fixBlockLocations(TSourceLoc loc, TQualifier qualifier, TVector<TTypeLoc> list,
			boolean memberWithLocation, boolean memberWithoutLocation) {
		Main.HlslParseContext_fixBlockLocations(ptr, loc.getPtr(), qualifier.getPtr(), list.getPtr(),
				memberWithLocation, memberWithoutLocation);
	}

	public void fixXfbOffsets(TQualifier qualifier, TVector<TTypeLoc> list) {
		Main.HlslParseContext_fixXfbOffsets(ptr, qualifier.getPtr(), list.getPtr());
	}

	public void fixBlockUniformOffsets(TQualifier qualifier, TVector<TTypeLoc> list) {
		Main.HlslParseContext_fixBlockUniformOffsets(ptr, qualifier.getPtr(), list.getPtr());
	}

	public void addQualifierToExisting(TSourceLoc loc, TQualifier qualifier, String identifier) {
		Main.HlslParseContext_addQualifierToExisting(ptr, loc.getPtr(), qualifier.getPtr(), identifier);
	}

	public void addQualifierToExisting(TSourceLoc loc, TQualifier qualifier, TVector<TString> list) {
		Main.HlslParseContext_addQualifierToExisting(ptr, loc.getPtr(), qualifier.getPtr(), list.getPtr());
	}

	public void updateStandaloneQualifierDefaults(TSourceLoc loc, TPublicType t) {
		Main.HlslParseContext_updateStandaloneQualifierDefaults(ptr, loc.getPtr(), t.getPtr());
	}

	public void wrapupSwitchSubsequence(TIntermAggregate statements, TIntermNode branchNode) {
		Main.HlslParseContext_wrapupSwitchSubsequence(ptr, statements.getPtr(), branchNode.getPtr());
	}

	public TIntermNode addSwitch(TSourceLoc loc, TIntermTyped expression, TIntermAggregate body,
			TList<TAttributeArgs> attr) {
		return fromPtr(
				Main.HlslParseContext_addSwitch(ptr, loc.getPtr(), expression.getPtr(), body.getPtr(), attr.getPtr()),
				TIntermNode.class);
	}

	public void nestLooping() {
		Main.HlslParseContext_nestLooping(ptr);
	}

	public void unnestLooping() {
		Main.HlslParseContext_unnestLooping(ptr);
	}

	public void nestAnnotations() {
		Main.HlslParseContext_nestAnnotations(ptr);
	}

	public void unnestAnnotations() {
		Main.HlslParseContext_unnestAnnotations(ptr);
	}

	public int getAnnotationNestingLevel() {
		return Main.HlslParseContext_getAnnotationNestingLevel(ptr);
	}

	public void pushScope() {
		Main.HlslParseContext_pushScope(ptr);
	}

	public void popScope() {
		Main.HlslParseContext_popScope(ptr);
	}

	public void pushThisScope(TType t, TVector<TFunctionDeclarator> declarators) {
		Main.HlslParseContext_pushThisScope(ptr, t.getPtr(), declarators.getPtr());
	}

	public void popThisScope() {
		Main.HlslParseContext_popThisScope(ptr);
	}

	public void pushImplicitThis(TVariable thisParameter) {
		Main.HlslParseContext_pushImplicitThis(ptr, thisParameter.getPtr());
	}

	public void popImplicitThis() {
		Main.HlslParseContext_popImplicitThis(ptr);
	}

	public TVariable getImplicitThis(int thisDepth) {
		return fromPtr(Main.HlslParseContext_getImplicitThis(ptr, thisDepth), TVariable.class);
	}

	public void pushNamespace(String name) {
		Main.HlslParseContext_pushNamespace(ptr, name);
	}

	public void popNamespace() {
		Main.HlslParseContext_popNamespace(ptr);
	}

	public void getFullNamespaceName(String[] s) {
		Main.HlslParseContext_getFullNamespaceName(ptr, s);
	}

	public void addScopeMangler(String s) {
		Main.HlslParseContext_addScopeMangler(ptr, s);
	}

	public void beginParameterParsing(TFunction function) {
		Main.HlslParseContext_beginParameterParsing(ptr, function.getPtr());
	}

	public void pushSwitchSequence(TVector<TIntermNode> sequence) {
		Main.HlslParseContext_pushSwitchSequence(ptr, sequence.getPtr());
	}

	public void popSwitchSequence() {
		Main.HlslParseContext_popSwitchSequence(ptr);
	}

	@Override
	public void growGlobalUniformBlock(TSourceLoc loc, TType t, String memberName) {
		Main.HlslParseContext_growGlobalUniformBlock(ptr, loc.getPtr(), t.getPtr(), memberName);
	}

	@Override
	public void growGlobalUniformBlock(TSourceLoc loc, TType t, String memberName, TVector<TTypeLoc> typeList) {
		Main.HlslParseContext_growGlobalUniformBlock(ptr, loc.getPtr(), t.getPtr(), memberName, typeList.getPtr());
	}

	public TIntermTyped handleLvalue(TSourceLoc loc, String op, TIntermTyped node) {
		return fromPtr(Main.HlslParseContext_handleLvalue(ptr, loc.getPtr(), op, node.getPtr()), TIntermTyped.class);
	}

	@Override
	public boolean lValueErrorCheck(TSourceLoc loc, String op, TIntermTyped node) {
		return Main.HlslParseContext_lValueErrorCheck(ptr, loc.getPtr(), op, node.getPtr());
	}

	public TLayoutFormat getLayoutFromTxType(TSourceLoc loc, TType t) {
		return TLayoutFormat.valueByConstant(Main.HlslParseContext_getLayoutFromTxType(ptr, loc.getPtr(), t.getPtr()));
	}

	public boolean handleOutputGeometry(TSourceLoc loc, TLayoutGeometry geometry) {
		return Main.HlslParseContext_handleOutputGeometry(ptr, loc.getPtr(), geometry);
	}

	public boolean handleInputGeometry(TSourceLoc loc, TLayoutGeometry geometry) {
		return Main.HlslParseContext_handleInputGeometry(ptr, loc.getPtr(), geometry);
	}

	public void handleSelectionAttributes(TSourceLoc loc, TIntermSelection node, TList<TAttributeArgs> attributes) {
		Main.HlslParseContext_handleSelectionAttributes(ptr, loc.getPtr(), node.getPtr(), attributes.getPtr());
	}

	public void handleSwitchAttributes(TSourceLoc loc, TIntermSwitch node, TList<TAttributeArgs> attributes) {
		Main.HlslParseContext_handleSwitchAttributes(ptr, loc.getPtr(), node.getPtr(), attributes.getPtr());
	}

	public void handleLoopAttributes(TSourceLoc loc, TIntermLoop node, TList<TAttributeArgs> attributes) {
		Main.HlslParseContext_handleLoopAttributes(ptr, loc.getPtr(), node.getPtr(), attributes.getPtr());
	}

	public void shareStructBufferType(TType t) {
		Main.HlslParseContext_shareStructBufferType(ptr, t.getPtr());
	}

	public boolean setTextureReturnType(TSampler sampler, TType retType, TSourceLoc loc) {
		return Main.HlslParseContext_setTextureReturnType(ptr, sampler.getPtr(), retType.getPtr(), loc.getPtr());
	}

	public void getTextureReturnType(TSampler sampler, TType retType) {
		Main.HlslParseContext_getTextureReturnType(ptr, sampler.getPtr(), retType.getPtr());
	}

	public TAttributeType attributeFromName(String nameSpace, String name) {
		return TAttributeType.valueByConstant(Main.HlslParseContext_attributeFromName(ptr, nameSpace, name));
	}

}
