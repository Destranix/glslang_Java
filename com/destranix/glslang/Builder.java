package com.destranix.glslang;

import java.math.BigInteger;
import java.util.EnumSet;

public class Builder extends PointerBoundObject {

	protected final long spvVersion;
	protected final long userNumber;
	protected final SpvBuildLogger logger;
	private final int constructorIndex;

	public Builder(long spvVersion, long userNumber, SpvBuildLogger logger) {
		this.spvVersion = spvVersion;
		this.userNumber = userNumber;
		this.logger = logger;
		this.constructorIndex = 0;
		load();
	}

	protected Builder(byte[] ptr) {
		this.ptr = ptr;
		this.spvVersion = -1;
		this.userNumber = -1;
		this.logger = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.Builder(spvVersion, userNumber, logger.getPtr());
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

	public long getSpvVersion() {
		return Main.Builder_getSpvVersion(ptr);
	}

	public void setSource(SourceLanguage lang, int version) {
		Main.Builder_setSource(ptr, lang, version);
	}

	public long getStringId(String str) {
		return Main.Builder_getStringId(ptr, str);
	}

	public void setSourceFile(String file) {
		Main.Builder_setSourceFile(ptr, file);
	}

	public void setSourceText(String text) {
		Main.Builder_setSourceText(ptr, text);
	}

	public void addSourceExtension(String ext) {
		Main.Builder_addSourceExtension(ptr, ext);
	}

	public void addModuleProcessed(String p) {
		Main.Builder_addModuleProcessed(ptr, p);
	}

	public void setEmitOpLines() {
		Main.Builder_setEmitOpLines(ptr);
	}

	public void addExtension(String ext) {
		Main.Builder_addExtension(ptr, ext);
	}

	public void removeExtension(String ext) {
		Main.Builder_removeExtension(ptr, ext);
	}

	public void addIncorporatedExtension(String ext, SpvVersion incorporatedVersion) {
		Main.Builder_addIncorporatedExtension(ptr, ext, incorporatedVersion);
	}

	public void promoteIncorporatedExtension(String baseExt, String promoExt, SpvVersion incorporatedVersion) {
		Main.Builder_promoteIncorporatedExtension(ptr, baseExt, promoExt, incorporatedVersion);
	}

	public void addInclude(String name, String text) {
		Main.Builder_addInclude(ptr, name, text);
	}

	public long importFunc(String s) {
		return Main.Builder_import(ptr, s);
	}

	public void setMemoryModel(AddressingModel addr, MemoryModel mem) {
		Main.Builder_setMemoryModel(ptr, addr, mem);
	}

	public void addCapability(Capability cap) {
		Main.Builder_addCapability(ptr, cap);
	}

	public long getUniqueId() {
		return Main.Builder_getUniqueId(ptr);
	}

	public long getUniqueIds(int numIds) {
		return Main.Builder_getUniqueIds(ptr, numIds);
	}

	public void setLine(int line) {
		Main.Builder_setLine(ptr, line);
	}

	public void setLine(int line, String filename) {
		Main.Builder_setLine(ptr, line, filename);
	}

	public void addLine(long fileName, int line, int column) {
		Main.Builder_addLine(ptr, fileName, line, column);
	}

	public long makeVoidType() {
		return Main.Builder_makeVoidType(ptr);
	}

	public long makeBoolType() {
		return Main.Builder_makeBoolType(ptr);
	}

	public long makePointer(StorageClass storageClass, long pointee) {
		return Main.Builder_makePointer(ptr, storageClass, pointee);
	}

	public long makeForwardPointer(StorageClass storageClass) {
		return Main.Builder_makeForwardPointer(ptr, storageClass);
	}

	public long makePointerFromForwardPointer(StorageClass storageClass, long forwardPointerType, long pointee) {
		return Main.Builder_makePointerFromForwardPointer(ptr, storageClass, forwardPointerType, pointee);
	}

	public long makeIntegerType(int width, boolean hasSign) {
		return Main.Builder_makeIntegerType(ptr, width, hasSign);
	}

	public long makeIntType(int width) {
		return Main.Builder_makeIntType(ptr, width);
	}

	public long makeUintType(int width) {
		return Main.Builder_makeUintType(ptr, width);
	}

	public long makeFloatType(int width) {
		return Main.Builder_makeFloatType(ptr, width);
	}

	public long makeStructType(long[] members, String s) {
		return Main.Builder_makeStructType(ptr, members, s);
	}

	public long makeStructResultType(long type0, long type1) {
		return Main.Builder_makeStructResultType(ptr, type0, type1);
	}

	public long makeVectorType(long component, int size) {
		return Main.Builder_makeVectorType(ptr, component, size);
	}

	public long BmakeMatrixType(long component, int cols, int rows) {
		return Main.Builder_makeMatrixType(ptr, component, cols, rows);
	}

	public long makeArrayType(long element, long sizeId, int stride) {
		return Main.Builder_makeArrayType(ptr, element, sizeId, stride);
	}

	public long makeRuntimeArray(long element) {
		return Main.Builder_makeRuntimeArray(ptr, element);
	}

	public long makeFunctionType(long returnType, long[] paramTypes) {
		return Main.Builder_makeFunctionType(ptr, returnType, paramTypes);
	}

	public long makeImageType(long sampledType, Dim dim, boolean depth, boolean arrayed, boolean ms, long sampled,
			ImageFormat format) {
		return Main.Builder_makeImageType(ptr, sampledType, dim, depth, arrayed, ms, sampled, format);
	}

	public long makeSamplerType() {
		return Main.Builder_makeSamplerType(ptr);
	}

	public long makeSampledImageType(long imageType) {
		return Main.Builder_makeSampledImageType(ptr, imageType);
	}

	public long makeCooperativeMatrixType(long component, long scope, long rows, long cols) {
		return Main.Builder_makeCooperativeMatrixType(ptr, component, scope, rows, cols);
	}

	public long makeAccelerationStructureType() {
		return Main.Builder_makeAccelerationStructureType(ptr);
	}

	public long makeRayQueryType() {
		return Main.Builder_makeRayQueryType(ptr);
	}

	public long getTypeId(long resultId) {
		return Main.Builder_getTypeId(ptr, resultId);
	}

	public long getDerefTypeId(long resultId) {
		return Main.Builder_getDerefTypeId(ptr, resultId);
	}

	public int getOpCode(long id) {
		return Main.Builder_getOpCode(ptr, id);
	}

	public int getTypeClass(long typeId) {
		return Main.Builder_getTypeClass(ptr, typeId);
	}

	public int getMostBasicTypeClass(long typeId) {
		return Main.Builder_getMostBasicTypeClass(ptr, typeId);
	}

	public int getNumComponents(long resultId) {
		return Main.Builder_getNumComponents(ptr, resultId);
	}

	public int getNumTypeConstituents(long typeId) {
		return Main.Builder_getNumTypeConstituents(ptr, typeId);
	}

	public int getNumTypeComponents(long typeId) {
		return Main.Builder_getNumTypeComponents(ptr, typeId);
	}

	public long getScalarTypeId(long typeId) {
		return Main.Builder_getScalarTypeId(ptr, typeId);
	}

	public long getContainedTypeId(long typeId) {
		return Main.Builder_getContainedTypeId(ptr, typeId);
	}

	public long getContainedTypeId(long typeId, int i) {
		return Main.Builder_getContainedTypeId(ptr, typeId, i);
	}

	public int getTypeStorageClass(long typeId) {
		return Main.Builder_getTypeStorageClass(ptr, typeId);
	}

	public int getImageTypeFormat(long typeId) {
		return Main.Builder_getImageTypeFormat(ptr, typeId);
	}

	public boolean isPointer(long resultId) {
		return Main.Builder_isPointer(ptr, resultId);
	}

	public boolean isScalar(long resultId) {
		return Main.Builder_isScalar(ptr, resultId);
	}

	public boolean isVector(long resultId) {
		return Main.Builder_isVector(ptr, resultId);
	}

	public boolean isMatrix(long resultId) {
		return Main.Builder_isMatrix(ptr, resultId);
	}

	public boolean isCooperativeMatrix(long resultId) {
		return Main.Builder_isCooperativeMatrix(ptr, resultId);
	}

	public boolean isAggregate(long resultId) {
		return Main.Builder_isAggregate(ptr, resultId);
	}

	public boolean isSampledImage(long resultId) {
		return Main.Builder_isSampledImage(ptr, resultId);
	}

	public boolean isBoolType(long typeId) {
		return Main.Builder_isBoolType(ptr, typeId);
	}

	public boolean isIntType(long typeId) {
		return Main.Builder_isIntType(ptr, typeId);
	}

	public boolean isUintType(long typeId) {
		return Main.Builder_isUintType(ptr, typeId);
	}

	public boolean isFloatType(long typeId) {
		return Main.Builder_isFloatType(ptr, typeId);
	}

	public boolean isPointerType(long typeId) {
		return Main.Builder_isPointerType(ptr, typeId);
	}

	public boolean isScalarType(long typeId) {
		return Main.Builder_isScalarType(ptr, typeId);
	}

	public boolean isVectorType(long typeId) {
		return Main.Builder_isVectorType(ptr, typeId);
	}

	public boolean isMatrixType(long typeId) {
		return Main.Builder_isMatrixType(ptr, typeId);
	}

	public boolean isStructType(long typeId) {
		return Main.Builder_isStructType(ptr, typeId);
	}

	public boolean isArrayType(long typeId) {
		return Main.Builder_isArrayType(ptr, typeId);
	}

	public boolean isCooperativeMatrixType(long typeId) {
		return Main.Builder_isCooperativeMatrixType(ptr, typeId);
	}

	public boolean isAggregateType(long typeId) {
		return Main.Builder_isAggregateType(ptr, typeId);
	}

	public boolean isImageType(long typeId) {
		return Main.Builder_isImageType(ptr, typeId);
	}

	public boolean isSamplerType(long typeId) {
		return Main.Builder_isSamplerType(ptr, typeId);
	}

	public boolean isSampledImageType(long typeId) {
		return Main.Builder_isSampledImageType(ptr, typeId);
	}

	public boolean containsType(long typeId, Op typeOp, long width) {
		return Main.Builder_containsType(ptr, typeId, typeOp, width);
	}

	public boolean containsPhysicalStorageBufferOrArray(long typeId) {
		return Main.Builder_containsPhysicalStorageBufferOrArray(ptr, typeId);
	}

	public boolean isConstantOpCode(Op typeOp) {
		return Main.Builder_isConstantOpCode(ptr, typeOp);
	}

	public boolean isSpecConstantOpCode(Op opcode) {
		return Main.Builder_isSpecConstantOpCode(ptr, opcode);
	}

	public boolean isConstant(long resultId) {
		return Main.Builder_isConstant(ptr, resultId);
	}

	public boolean isConstantScalar(long resultId) {
		return Main.Builder_isConstantScalar(ptr, resultId);
	}

	public boolean isSpecConstant(long resultId) {
		return Main.Builder_isSpecConstant(ptr, resultId);
	}

	public long getConstantScalar(long resultId) {
		return Main.Builder_getConstantScalar(ptr, resultId);
	}

	public int getStorageClass(long resultId) {
		return Main.Builder_getStorageClass(ptr, resultId);
	}

	public boolean isVariableOpCode(Op opcode) {
		return Main.Builder_isVariableOpCode(ptr, opcode);
	}

	public boolean isVariable(long resultId) {
		return Main.Builder_isVariable(ptr, resultId);
	}

	public boolean isGlobalStorage(long resultId) {
		return Main.Builder_isGlobalStorage(ptr, resultId);
	}

	public boolean isGlobalVariable(long resultId) {
		return Main.Builder_isGlobalVariable(ptr, resultId);
	}

	public boolean isValidInitializer(long resultId) {
		return Main.Builder_isValidInitializer(ptr, resultId);
	}

	public int getScalarTypeWidth(long typeId) {
		return Main.Builder_getScalarTypeWidth(ptr, typeId);
	}

	public int getTypeNumColumns(long typeId) {
		return Main.Builder_getTypeNumColumns(ptr, typeId);
	}

	public int getNumColumns(long resultId) {
		return Main.Builder_getNumColumns(ptr, resultId);
	}

	public int getTypeNumRows(long typeId) {
		return Main.Builder_getTypeNumRows(ptr, typeId);
	}

	public int getNumRows(long resultId) {
		return Main.Builder_getNumRows(ptr, resultId);
	}

	public int getTypeDimensionality(long typeId) {
		return Main.Builder_getTypeDimensionality(ptr, typeId);
	}

	public long getImageType(long resultId) {
		return Main.Builder_getImageType(ptr, resultId);
	}

	public boolean isArrayedImageType(long typeId) {
		return Main.Builder_isArrayedImageType(ptr, typeId);
	}

	public long makeBoolConstant(boolean b) {
		return Main.Builder_makeBoolConstant(ptr, b);
	}

	public long makeBoolConstant(boolean b, boolean specConstant) {
		return Main.Builder_makeBoolConstant(ptr, b, specConstant);
	}

	public long makeInt8Constant(int i) {
		return Main.Builder_makeInt8Constant(ptr, i);
	}

	public long makeInt8Constant(int i, boolean specConstant) {
		return Main.Builder_makeInt8Constant(ptr, i, specConstant);
	}

	public long makeUint8Constant(long u) {
		return Main.Builder_makeUint8Constant(ptr, u);
	}

	public long makeUint8Constant(long u, boolean specConstant) {
		return Main.Builder_makeUint8Constant(ptr, u, specConstant);
	}

	public long makeInt16Constant(int i) {
		return Main.Builder_makeInt16Constant(ptr, i);
	}

	public long makeInt16Constant(int i, boolean specConstant) {
		return Main.Builder_makeInt16Constant(ptr, i, specConstant);
	}

	public long makeUint16Constant(long u) {
		return Main.Builder_makeUint16Constant(ptr, u);
	}

	public long makeUint16Constant(long u, boolean specConstant) {
		return Main.Builder_makeUint16Constant(ptr, u, specConstant);
	}

	public long makeIntConstant(int i) {
		return Main.Builder_makeIntConstant(ptr, i);
	}

	public long makeIntConstant(int i, boolean specConstant) {
		return Main.Builder_makeIntConstant(ptr, i, specConstant);
	}

	public long makeUintConstant(long u) {
		return Main.Builder_makeUintConstant(ptr, u);
	}

	public long makeUintConstant(long u, boolean specConstant) {
		return Main.Builder_makeUintConstant(ptr, u, specConstant);
	}

	public long makeInt64Constant(BigInteger i) {
		return Main.Builder_makeInt64Constant(ptr, i);
	}

	public long makeInt64Constant(BigInteger i, boolean specConstant) {
		return Main.Builder_makeInt64Constant(ptr, i, specConstant);
	}

	public long makeUint64Constant(BigInteger u) {
		return Main.Builder_makeUint64Constant(ptr, u);
	}

	public long makeUint64Constant(BigInteger u, boolean specConstant) {
		return Main.Builder_makeUint64Constant(ptr, u, specConstant);
	}

	public long makeFloatConstant(float f) {
		return Main.Builder_makeFloatConstant(ptr, f);
	}

	public long makeFloatConstant(float f, boolean specConstant) {
		return Main.Builder_makeFloatConstant(ptr, f, specConstant);
	}

	public long makeDoubleConstant(double d) {
		return Main.Builder_makeDoubleConstant(ptr, d);
	}

	public long makeDoubleConstant(double d, boolean specConstant) {
		return Main.Builder_makeDoubleConstant(ptr, d, specConstant);
	}

	public long makeFloat16Constant(float f16) {
		return Main.Builder_makeFloat16Constant(ptr, f16);
	}

	public long makeFloat16Constant(float f16, boolean specConstant) {
		return Main.Builder_makeFloat16Constant(ptr, f16, specConstant);
	}

	public long makeFpConstant(long type, double d) {
		return Main.Builder_makeFpConstant(ptr, type, d);
	}

	public long makeFpConstant(long type, double d, boolean specConstant) {
		return Main.Builder_makeFpConstant(ptr, type, d, specConstant);
	}

	public long makeCompositeConstant(long type, long[] comps) {
		return Main.Builder_makeCompositeConstant(ptr, type, comps);
	}

	public long makeCompositeConstant(long type, long[] comps, boolean specConst) {
		return Main.Builder_makeCompositeConstant(ptr, type, comps, specConst);
	}

	public Instruction addEntryPoint(ExecutionModel mode, Function func, String name) {
		return fromPtr(Main.Builder_addEntryPoint(ptr, mode, func.getPtr(), name), Instruction.class);
	}

	public void addExecutionMode(Function func, ExecutionMode mode) {
		Main.Builder_addExecutionMode(ptr, func.getPtr(), mode);
	}

	public void addExecutionMode(Function func, ExecutionMode mode, int value1) {
		Main.Builder_addExecutionMode(ptr, func.getPtr(), mode, value1);
	}

	public void addExecutionMode(Function func, ExecutionMode mode, int value1, int value2) {
		Main.Builder_addExecutionMode(ptr, func.getPtr(), mode, value1, value2);
	}

	public void addExecutionMode(Function func, ExecutionMode mode, int value1, int value2, int value3) {
		Main.Builder_addExecutionMode(ptr, func.getPtr(), mode, value1, value2, value3);
	}
	
	public void addExecutionMode(Function func, ExecutionMode mode, long[] literals) {
		Main.Builder_addExecutionMode(ptr, func.getPtr(), mode, literals);
	}
	
	public void addExecutionModeId(Function func, ExecutionMode mode, long[] operandIds) {
		Main.Builder_addExecutionModeId(ptr, func.getPtr(), mode, operandIds);
	}

	public void addName(long id, String name) {
		Main.Builder_addName(ptr, id, name);
	}

	public void addMemberName(long id, int member, String name) {
		Main.Builder_addMemberName(ptr, id, member, name);
	}

	public void addDecoration(long id, Decoration decoration) {
		Main.Builder_addDecoration(ptr, id, decoration);
	}

	public void addDecoration(long id, Decoration decoration, int num) {
		Main.Builder_addDecoration(ptr, id, decoration, num);
	}

	public void addDecoration(long id, Decoration decoration, String s) {
		Main.Builder_addDecoration(ptr, id, decoration, s);
	}
	
	public void addDecoration(long id, Decoration decoration, long[] literals) {
		Main.Builder_addDecoration(ptr, id, decoration, literals);
	}
	
	public void addDecoration(long id, Decoration decoration, String[] strings) {
		Main.Builder_addDecoration(ptr, id, decoration, strings);
	}

	public void addDecorationId(long id, Decoration decoration, long idDecoration) {
		Main.Builder_addDecorationId(ptr, id, decoration, idDecoration);
	}
	
	public void addDecorationId(long id, Decoration decoration, long[] operandIds) {
		Main.Builder_addDecorationId(ptr, id, decoration, operandIds);
	}

	public void addMemberDecoration(long id, long member, Decoration decoration) {
		Main.Builder_addMemberDecoration(ptr, id, member, decoration);
	}

	public void addMemberDecoration(long id, long member, Decoration decoration, int num) {
		Main.Builder_addMemberDecoration(ptr, id, member, decoration, num);
	}

	public void addMemberDecoration(long id, long member, Decoration decoration, String s) {
		Main.Builder_addMemberDecoration(ptr, id, member, decoration, s);
	}
	
	public void addMemberDecoration(long id, long member, Decoration decoration, long[] literals) {
		Main.Builder_addMemberDecoration(ptr, id, member, decoration, literals);
	}
	
	public void addMemberDecoration(long id, long member, Decoration decoration, String[] strings) {
		Main.Builder_addMemberDecoration(ptr, id, member, decoration, strings);
	}

	public void setBuildPoint(Block bp) {
		Main.Builder_setBuildPoint(ptr, bp.getPtr());
	}

	public Block getBuildPoint() {
		return fromPtr(Main.Builder_getBuildPoint(ptr), Block.class);
	}

	public Function makeEntryPoint(String s) {
		return fromPtr(Main.Builder_makeEntryPoint(ptr, s), Function.class);
	}

	public Function Builder_makeFunctionEntry(Decoration precision, long returnType, String name, long[] paramTypes,
			Decoration[][] precisions) {
		int[][] precisionsArr = new int[precisions.length][];
		for (int i = 0; i < precisionsArr.length; ++i) {
			precisionsArr[i] = new int[precisions[i].length];
			for (int j = 0; j < precisionsArr[i].length; ++j) {
				precisionsArr[i][j] = precisions[i][j].getConstant();
			}
		}
		return fromPtr(Main.Builder_makeFunctionEntry(ptr, precision, returnType, name, paramTypes, precisionsArr),
				Function.class);
	}

	public Function Builder_makeFunctionEntry(Decoration precision, long returnType, String name, long[] paramTypes,
			Decoration[][] precisions, Block[] entry) {
		int[][] precisionsArr = new int[precisions.length][];
		for (int i = 0; i < precisionsArr.length; ++i) {
			precisionsArr[i] = new int[precisions[i].length];
			for (int j = 0; j < precisionsArr[i].length; ++j) {
				precisionsArr[i][j] = precisions[i][j].getConstant();
			}
		}
		byte[][] entryArr = new byte[1][];
		Function ret = fromPtr(
				Main.Builder_makeFunctionEntry(ptr, precision, returnType, name, paramTypes, precisionsArr, entryArr),
				Function.class);
		entry[0] = fromPtr(entryArr[0], Block.class);
		return ret;
	}

	public void makeReturn(boolean implicit) {
		Main.Builder_makeReturn(ptr, implicit);
	}

	public void makeReturn(boolean implicit, long retVal) {
		Main.Builder_makeReturn(ptr, implicit, retVal);
	}

	public void leaveFunction() {
		Main.Builder_leaveFunction(ptr);
	}

	public void makeDiscard() {
		Main.Builder_makeDiscard(ptr);
	}

	public long createVariable(Decoration precision, StorageClass storageClass, long type) {
		return Main.Builder_createVariable(ptr, precision, storageClass, type, null, 0);
	}

	public long createVariable(Decoration precision, StorageClass storageClass, long type, String name) {
		return Main.Builder_createVariable(ptr, precision, storageClass, type, name, 0);
	}

	public long createVariable(Decoration precision, StorageClass storageClass, long type, String name,
			long initializer) {
		return Main.Builder_createVariable(ptr, precision, storageClass, type, name, initializer);
	}

	public long createUndefined(long type) {
		return Main.Builder_createUndefined(ptr, type);
	}

	public void createStore(long rValue, long lValue) {
		Main.Builder_createStore(ptr, rValue, lValue);
	}

	public void createStore(long rValue, long lValue, MemoryAccessMask memoryAccess) {
		Main.Builder_createStore(ptr, rValue, lValue, memoryAccess);
	}

	public void createStore(long rValue, long lValue, MemoryAccessMask memoryAccess, Scope scope) {
		Main.Builder_createStore(ptr, rValue, lValue, memoryAccess, scope);
	}

	public void createStore(long rValue, long lValue, MemoryAccessMask memoryAccess, Scope scope, long alignment) {
		Main.Builder_createStore(ptr, rValue, lValue, memoryAccess, scope, alignment);
	}

	public long createLoad(long lValue, Decoration precision) {
		return Main.Builder_createLoad(ptr, lValue, precision);
	}

	public long createLoad(long lValue, Decoration precision, MemoryAccessMask memoryAccess) {
		return Main.Builder_createLoad(ptr, lValue, precision, memoryAccess);
	}

	public long createLoad(long lValue, Decoration precision, MemoryAccessMask memoryAccess, Scope scope) {
		return Main.Builder_createLoad(ptr, lValue, precision, memoryAccess, scope);
	}

	public long createLoad(long lValue, Decoration precision, MemoryAccessMask memoryAccess, Scope scope,
			long alignment) {
		return Main.Builder_createLoad(ptr, lValue, precision, memoryAccess, scope, alignment);
	}

	public long createAccessChain(StorageClass storageClass, long base, long[] offsets) {
		return Main.Builder_createAccessChain(ptr, storageClass, base, offsets);
	}

	public long createArrayLength(long base, long member) {
		return Main.Builder_createArrayLength(ptr, base, member);
	}

	public long createCooperativeMatrixLength(long type) {
		return Main.Builder_createCooperativeMatrixLength(ptr, type);
	}

	public long createCompositeExtract(long composite, long typeId, long index) {
		return Main.Builder_createCompositeExtract(ptr, composite, typeId, index);
	}

	public long createCompositeExtract(long composite, long typeId, long[] indexes) {
		return Main.Builder_createCompositeExtract(ptr, composite, typeId, indexes);
	}

	public long createCompositeInsert(long object, long composite, long typeId, long index) {
		return Main.Builder_createCompositeInsert(ptr, object, composite, typeId, index);
	}

	public long createCompositeInsert(long object, long composite, long typeId, long[] indexes) {
		return Main.Builder_createCompositeInsert(ptr, object, composite, typeId, indexes);
	}

	public long createVectorExtractDynamic(long vector, long typeId, long componentIndex) {
		return Main.Builder_createVectorExtractDynamic(ptr, vector, typeId, componentIndex);
	}

	public long createVectorInsertDynamic(long vector, long typeId, long component, long componentIndex) {
		return Main.Builder_createVectorInsertDynamic(ptr, vector, typeId, component, componentIndex);
	}

	public void createNoResultOp(Op op) {
		Main.Builder_createNoResultOp(ptr, op);
	}

	public void createNoResultOp(Op op, long operand) {
		Main.Builder_createNoResultOp(ptr, op, operand);
	}

	public void createNoResultOp(Op op, long[] operands) {
		Main.Builder_createNoResultOp(ptr, op, operands);
	}

	public void createNoResultOp(Op op, CVector<IdImmediate> operands) {
		Main.Builder_createNoResultOp(ptr, op, operands.getPtr());
	}

	public void createControlBarrier(Scope execution, Scope memory, EnumSet<MemorySemanticsMask> mask) {
		Main.Builder_createControlBarrier(ptr, execution, memory, mask);
	}

	public void createMemoryBarrier(long executionScope, long memorySemantics) {
		Main.Builder_createMemoryBarrier(ptr, executionScope, memorySemantics);
	}

	public long createUnaryOp(Op op, long typeId, long operand) {
		return Main.Builder_createUnaryOp(ptr, op, typeId, operand);
	}

	public long createBinOp(Op op, long typeId, long operand1, long operand2) {
		return Main.Builder_createBinOp(ptr, op, typeId, operand1, operand2);
	}

	public long createTriOp(Op op, long typeId, long operand1, long operand2, long operand3) {
		return Main.Builder_createTriOp(ptr, op, typeId, operand1, operand2, operand3);
	}

	public long createOp(Op op, long typeId, long[] operands) {
		return Main.Builder_createOp(ptr, op, typeId, operands);
	}

	public long createOp(Op op, long typeId, CVector<IdImmediate> operands) {
		return Main.Builder_createOp(ptr, op, typeId, operands.getPtr());
	}

	public long createFunctionCall(Function func, long[] ids) {
		return Main.Builder_createFunctionCall(ptr, func.getPtr(), ids);
	}

	public long createSpecConstantOp(Op op, long typeId, long[] operands, long[] literals) {
		return Main.Builder_createSpecConstantOp(ptr, op, typeId, operands, literals);
	}

	public long createRvalueSwizzle(Decoration precision, long typeId, long source, long[] channels) {
		return Main.Builder_createRvalueSwizzle(ptr, precision, typeId, source, channels);
	}

	public long createLvalueSwizzle(long typeId, long target, long source, long[] channels) {
		return Main.Builder_createLvalueSwizzle(ptr, typeId, target, source, channels);
	}

	public long setPrecision(long id, Decoration precision) {
		return Main.Builder_setPrecision(ptr, id, precision);
	}

	public void promoteScalar(Decoration precision, long[] left, long[] right) {
		Main.Builder_promoteScalar(ptr, precision, left, right);
	}

	public long smearScalar(Decoration precision, long scalarVal, long vectorType) {
		return Main.Builder_smearScalar(ptr, precision, scalarVal, vectorType);
	}

	public long createBuiltinCall(long resultType, long builtins, int entryPoint, long[] args) {
		return Main.Builder_createBuiltinCall(ptr, resultType, builtins, entryPoint, args);
	}

	public long createTextureCall(Decoration precision, long resultType, boolean sparse, boolean fetch, boolean proj,
			boolean gather, boolean noImplicit, TextureParameters textureParameters, EnumSet<ImageOperandsMask> mask) {
		return Main.Builder_createTextureCall(ptr, precision, resultType, sparse, fetch, proj, gather, noImplicit,
				textureParameters.getPtr(), mask);
	}

	public long createTextureQueryCall(Op op, TextureParameters textureParameters, boolean isUnsignedResult) {
		return Main.Builder_createTextureQueryCall(ptr, op, textureParameters.getPtr(), isUnsignedResult);
	}

	public long createSamplePositionCall(Decoration precision, long id0, long id1) {
		return Main.Builder_createSamplePositionCall(ptr, precision, id0, id1);
	}

	public long createBitFieldExtractCall(Decoration precision, long id0, long id1, long id2, boolean isSigned) {
		return Main.Builder_createBitFieldExtractCall(ptr, precision, id0, id1, id2, isSigned);
	}

	public long createBitFieldInsertCall(Decoration precision, long id0, long id1, long id2, long id3) {
		return Main.Builder_createBitFieldInsertCall(ptr, precision, id0, id1, id2, id3);
	}

	public long createCompositeCompare(Decoration precision, long id0, long id1, boolean equal) {
		return Main.Builder_createCompositeCompare(ptr, precision, id0, id1, equal);
	}

	public long createCompositeConstruct(long typeId, long[] constituents) {
		return Main.Builder_createCompositeConstruct(ptr, typeId, constituents);
	}

	public long createConstructor(Decoration precision, long[] sources, long resultTypeId) {
		return Main.Builder_createConstructor(ptr, precision, sources, resultTypeId);
	}

	public long createMatrixConstructor(Decoration precision, long[] sources, long constructee) {
		return Main.Builder_createMatrixConstructor(ptr, precision, sources, constructee);
	}

	public void makeSwitch(long condition, long control, int numSegments, int[] caseValues, int[] valueToSegment,
			int defaultSegment, CVector<Block> segmentBB) {
		Main.Builder_makeSwitch(ptr, condition, control, numSegments, caseValues, valueToSegment, defaultSegment,
				segmentBB.getPtr());
	}

	public void addSwitchBreak() {
		Main.Builder_addSwitchBreak(ptr);
	}

	public void nextSwitchSegment(CVector<Block> segmentBB, int segment) {
		Main.Builder_nextSwitchSegment(ptr, segmentBB.getPtr(), segment);
	}

	public void endSwitch(CVector<Block> segmentBB) {
		Main.Builder_endSwitch(ptr, segmentBB.getPtr());
	}// segmentBB is vector

	public LoopBlocks makeNewLoop() {
		return fromPtr(Main.Builder_makeNewLoop(ptr), LoopBlocks.class);
	}

	public Block makeNewBlock() {
		return fromPtr(Main.Builder_makeNewBlock(ptr), Block.class);
	}

	public void createLoopContinue() {
		Main.Builder_createLoopContinue(ptr);
	}

	public void createLoopExit() {
		Main.Builder_createLoopExit(ptr);
	}

	public void closeLoop() {
		Main.Builder_closeLoop(ptr);
	}

	public AccessChain getAccessChain() {
		return fromPtr(Main.Builder_getAccessChain(ptr), AccessChain.class);
	}

	public void setAccessChain(AccessChain newChain) {
		Main.Builder_setAccessChain(ptr, newChain.getPtr());
	}

	public void clearAccessChain() {
		Main.Builder_clearAccessChain(ptr);
	}

	public void setAccessChainLValue(long lValue) {
		Main.Builder_setAccessChainLValue(ptr, lValue);
	}

	public void setAccessChainRValue(long rValue) {
		Main.Builder_setAccessChainRValue(ptr, rValue);
	}

	public void accessChainPush(long offset, AccessChain.CoherentFlags coherentFlags, long alignment) {
		Main.Builder_accessChainPush(ptr, offset, coherentFlags.getPtr(), alignment);
	}

	public void accessChainPushSwizzle(long[] swizzle, long preSwizzleBaseType, AccessChain.CoherentFlags coherentFlags,
			long alignment) {
		Main.Builder_accessChainPushSwizzle(ptr, swizzle, preSwizzleBaseType, coherentFlags.getPtr(), alignment);
	}

	public void accessChainPushComponent(long component, long preSwizzleBaseType,
			AccessChain.CoherentFlags coherentFlags, long alignment) {
		Main.Builder_accessChainPushComponent(ptr, component, preSwizzleBaseType, coherentFlags.getPtr(), alignment);
	}

	public void accessChainStore(long rvalue) {
		Main.Builder_accessChainStore(ptr, rvalue);
	}

	public void accessChainStore(long rvalue, MemoryAccessMask memoryAccess) {
		Main.Builder_accessChainStore(ptr, rvalue, memoryAccess);
	}

	public void accessChainStore(long rvalue, MemoryAccessMask memoryAccess, Scope scope) {
		Main.Builder_accessChainStore(ptr, rvalue, memoryAccess, scope);
	}

	public void accessChainStore(long rvalue, MemoryAccessMask memoryAccess, Scope scope, long alignment) {
		Main.Builder_accessChainStore(ptr, rvalue, memoryAccess, scope, alignment);
	}

	public long accessChainLoad(Decoration precision, Decoration nonUniform, long ResultType) {
		return Main.Builder_accessChainLoad(ptr, precision, nonUniform, ResultType);
	}

	public long accessChainLoad(Decoration precision, Decoration nonUniform, long ResultType,
			MemoryAccessMask memoryAccess) {
		return Main.Builder_accessChainLoad(ptr, precision, nonUniform, ResultType, memoryAccess);
	}

	public long accessChainLoad(Decoration precision, Decoration nonUniform, long ResultType,
			MemoryAccessMask memoryAccess, Scope scope) {
		return Main.Builder_accessChainLoad(ptr, precision, nonUniform, ResultType, memoryAccess, scope);
	}

	public long accessChainLoad(Decoration precision, Decoration nonUniform, long ResultType,
			MemoryAccessMask memoryAccess, Scope scope, long alignment) {
		return Main.Builder_accessChainLoad(ptr, precision, nonUniform, ResultType, memoryAccess, scope, alignment);
	}

	public boolean isSpvLvalue() {
		return Main.Builder_isSpvLvalue(ptr);
	}

	public long accessChainGetLValue() {
		return Main.Builder_accessChainGetLValue(ptr);
	}

	public long accessChainGetInferredType() {
		return Main.Builder_accessChainGetInferredType(ptr);
	}

	public void postProcess() {
		Main.Builder_postProcess(ptr);
	}

	public void postProcessCFG() {
		Main.Builder_postProcessCFG(ptr);
	}

	public void postProcessFeatures() {
		Main.Builder_postProcessFeatures(ptr);
	}

	public void postProcess(Instruction instruction) {
		Main.Builder_postProcess(ptr, instruction.getPtr());
	}

	public void postProcessType(Instruction instruction, long typeId) {
		Main.Builder_postProcessType(ptr, instruction.getPtr(), typeId);
	}

	public void dump(long[][] l) {
		Main.Builder_dump(ptr, l);
	}

	public void createBranch(Block block) {
		Main.Builder_createBranch(ptr, block.getPtr());
	}

	public void createConditionalBranch(long condition, Block thenBlock, Block elseBlock) {
		Main.Builder_createConditionalBranch(ptr, condition, thenBlock.getPtr(), elseBlock.getPtr());
	}

	public void createLoopMerge(Block mergeBlock, Block continueBlock, long control, long[] operands) {
		Main.Builder_createLoopMerge(ptr, mergeBlock.getPtr(), continueBlock.getPtr(), control, operands);
	}

	public void setToSpecConstCodeGenMode() {
		Main.Builder_setToSpecConstCodeGenMode(ptr);
	}

	public void setToNormalCodeGenMode() {
		Main.Builder_setToNormalCodeGenMode(ptr);
	}

	public boolean isInSpecConstCodeGenMode() {
		return Main.Builder_isInSpecConstCodeGenMode(ptr);
	}

	public static class TextureParameters extends PointerBoundObject {

		protected final long sampler;
		protected final long coords;
		protected final long bias;
		protected final long lod;
		protected final long Dref;
		protected final long offset;
		protected final long offsets;
		protected final long gradX;
		protected final long gradY;
		protected final long sample;
		protected final long component;
		protected final long texelOut;
		protected final long lodClamp;
		protected final long granularity;
		protected final long coarse;
		protected final boolean nonprivate;
		protected final boolean volatil;
		private final int constructorIndex;

		public TextureParameters() {
			this.sampler = -1;
			this.coords = -1;
			this.bias = -1;
			this.lod = -1;
			this.Dref = -1;
			this.offset = -1;
			this.offsets = -1;
			this.gradX = -1;
			this.gradY = -1;
			this.sample = -1;
			this.component = -1;
			this.texelOut = -1;
			this.lodClamp = -1;
			this.granularity = -1;
			this.coarse = -1;
			this.nonprivate = false;
			this.volatil = false;
			this.constructorIndex = 0;
			load();
		}

		public TextureParameters(long sampler, long coords, long bias, long lod, long Dref, long offset, long offsets,
				long gradX, long gradY, long sample, long component, long texelOut, long lodClamp, long granularity,
				long coarse, boolean nonprivate, boolean volatil) {
			this.sampler = sampler;
			this.coords = coords;
			this.bias = bias;
			this.lod = lod;
			this.Dref = Dref;
			this.offset = offset;
			this.offsets = offsets;
			this.gradX = gradX;
			this.gradY = gradY;
			this.sample = sample;
			this.component = component;
			this.texelOut = texelOut;
			this.lodClamp = lodClamp;
			this.granularity = granularity;
			this.coarse = coarse;
			this.nonprivate = nonprivate;
			this.volatil = volatil;
			this.constructorIndex = 1;
			load();
		}

		protected TextureParameters(byte[] ptr) {
			this.sampler = -1;
			this.coords = -1;
			this.bias = -1;
			this.lod = -1;
			this.Dref = -1;
			this.offset = -1;
			this.offsets = -1;
			this.gradX = -1;
			this.gradY = -1;
			this.sample = -1;
			this.component = -1;
			this.texelOut = -1;
			this.lodClamp = -1;
			this.granularity = -1;
			this.coarse = -1;
			this.nonprivate = false;
			this.volatil = false;
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
						ptr = Main.Builder_TextureParameters();
						break;
					case 1:
						ptr = Main.Builder_TextureParameters(sampler, coords, bias, lod, Dref, offset, offsets, gradX,
								gradY, sample, component, texelOut, lodClamp, granularity, coarse, nonprivate, volatil);
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

		public void setSampler(long v) {
			Main.Builder_TextureParameters_setSampler(ptr, v);
		}

		public void setCoords(long v) {
			Main.Builder_TextureParameters_setCoords(ptr, v);
		}

		public void setBias(long v) {
			Main.Builder_TextureParameters_setBias(ptr, v);
		}

		public void setLod(long v) {
			Main.Builder_TextureParameters_setLod(ptr, v);
		}

		public void setDref(long v) {
			Main.Builder_TextureParameters_setDref(ptr, v);
		}

		public void setOffset(long v) {
			Main.Builder_TextureParameters_setOffset(ptr, v);
		}

		public void setOffsets(long v) {
			Main.Builder_TextureParameters_setOffsets(ptr, v);
		}

		public void setGradX(long v) {
			Main.Builder_TextureParameters_setGradX(ptr, v);
		}

		public void setGradY(long v) {
			Main.Builder_TextureParameters_setGradY(ptr, v);
		}

		public void setSample(long v) {
			Main.Builder_TextureParameters_setSample(ptr, v);
		}

		public void setComponent(long v) {
			Main.Builder_TextureParameters_setComponent(ptr, v);
		}

		public void setLodClamp(long v) {
			Main.Builder_TextureParameters_setLodClamp(ptr, v);
		}

		public void setGranularity(long v) {
			Main.Builder_TextureParameters_setGranularity(ptr, v);
		}

		public void setCoarse(long v) {
			Main.Builder_TextureParameters_setCoarse(ptr, v);
		}

		public void setNonprivate(boolean v) {
			Main.Builder_TextureParameters_setNonprivate(ptr, v);
		}

		public void setVolatil(boolean v) {
			Main.Builder_TextureParameters_setVolatil(ptr, v);
		}

		public long getSampler() {
			return Main.Builder_TextureParameters_getSampler(ptr);
		}

		public long getCoords() {
			return Main.Builder_TextureParameters_getCoords(ptr);
		}

		public long getBias() {
			return Main.Builder_TextureParameters_getBias(ptr);
		}

		public long getLod() {
			return Main.Builder_TextureParameters_getLod(ptr);
		}

		public long getDref() {
			return Main.Builder_TextureParameters_getDref(ptr);
		}

		public long getOffset() {
			return Main.Builder_TextureParameters_getOffset(ptr);
		}

		public long getOffsets() {
			return Main.Builder_TextureParameters_getOffsets(ptr);
		}

		public long getGradX() {
			return Main.Builder_TextureParameters_getGradX(ptr);
		}

		public long getGradY() {
			return Main.Builder_TextureParameters_getGradY(ptr);
		}

		public long getSample() {
			return Main.Builder_TextureParameters_getSample(ptr);
		}

		public long getComponent() {
			return Main.Builder_TextureParameters_getComponent(ptr);
		}

		public long getLodClamp() {
			return Main.Builder_TextureParameters_getLodClamp(ptr);
		}

		public long getGranularity() {
			return Main.Builder_TextureParameters_getGranularity(ptr);
		}

		public long getCoarse() {
			return Main.Builder_TextureParameters_getCoarse(ptr);
		}

		public boolean getNonprivate() {
			return Main.Builder_TextureParameters_getNonprivate(ptr);
		}

		public boolean getVolatil() {
			return Main.Builder_TextureParameters_getVolatil(ptr);
		}

	}

	public static class If extends PointerBoundObject {

		protected final long condition;
		protected final long ctrl;
		protected final Builder builder;
		private final int constructorIndex;

		public If(long condition, long ctrl, Builder builder) {
			this.condition = condition;
			this.ctrl = ctrl;
			this.builder = builder;
			this.constructorIndex = 0;
			load();
		}

		protected If(byte[] ptr) {
			this.ptr = ptr;
			this.condition = -1;
			this.ctrl = -1;
			this.builder = null;
			this.constructorIndex = -1;
		}

		@Override
		protected void load_intern() {
			if (ptr == null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
					case 0:
						ptr = Main.Builder_If(condition, ctrl, builder.getPtr());
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

		public void makeBeginElse() {
			Main.Builder_If_makeBeginElse(ptr);
		}

		public void makeEndIf() {
			Main.Builder_If_makeEndIf(ptr);
		}

	}

	public static class LoopBlocks extends PointerBoundObject {

		protected final Block head;
		protected final Block body;
		protected final Block merge;
		protected final Block continue_target;
		private final int constructorIndex;

		public LoopBlocks(Block head, Block body, Block merge, Block continue_target) {
			this.head = head;
			this.body = body;
			this.merge = merge;
			this.continue_target = continue_target;
			this.constructorIndex = 0;
			load();
		}

		protected LoopBlocks(byte[] ptr) {
			this.ptr = ptr;
			this.head = null;
			this.body = null;
			this.merge = null;
			this.continue_target = null;
			this.constructorIndex = -1;
		}

		@Override
		protected void load_intern() {
			if (ptr == null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
					case 0:
						ptr = Main.Builder_LoopBlocks(head.getPtr(), body.getPtr(), merge.getPtr(),
								continue_target.getPtr());
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

		public Block getHead() {
			return fromPtr(Main.Builder_LoopBlocks_getHead(ptr), Block.class);
		}

		public Block getBody() {
			return fromPtr(Main.Builder_LoopBlocks_getBody(ptr), Block.class);
		}

		public Block getMerge() {
			return fromPtr(Main.Builder_LoopBlocks_getMerge(ptr), Block.class);
		}

		public Block getContinue_target() {
			return fromPtr(Main.Builder_LoopBlocks_getContinue_target(ptr), Block.class);
		}

	}

	public static class AccessChain extends PointerBoundObject {

		protected final long base;
		protected final long[] indexChain;
		protected final long instr;
		protected final long[] swizzle;
		protected final long component;
		protected final long preSwizzleBaseType;
		protected final boolean isRValue;
		protected final long alignment;
		protected final CoherentFlags coherentFlags;
		private final int constructorIndex;

		public AccessChain() {
			this.base = -1;
			this.indexChain = null;
			this.instr = -1;
			this.swizzle = null;
			this.component = -1;
			this.preSwizzleBaseType = -1;
			this.isRValue = false;
			this.alignment = -1;
			this.coherentFlags = null;
			this.constructorIndex = 0;
			load();
		}

		public AccessChain(long base, long[] indexChain, long instr, long[] swizzle, long component,
				long preSwizzleBaseType, boolean isRValue, long alignment, CoherentFlags coherentFlags) {
			this.base = base;
			this.indexChain = indexChain;
			this.instr = instr;
			this.swizzle = swizzle;
			this.component = component;
			this.preSwizzleBaseType = preSwizzleBaseType;
			this.isRValue = isRValue;
			this.alignment = alignment;
			this.coherentFlags = coherentFlags;
			this.constructorIndex = 1;
			load();
		}

		protected AccessChain(byte[] ptr) {
			this.ptr = ptr;
			this.base = -1;
			this.indexChain = null;
			this.instr = -1;
			this.swizzle = null;
			this.component = -1;
			this.preSwizzleBaseType = -1;
			this.isRValue = false;
			this.alignment = -1;
			this.coherentFlags = null;
			this.constructorIndex = -1;
		}

		@Override
		protected void load_intern() {
			if (ptr == null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
					case 0:
						ptr = Main.Builder_AccessChain();
						break;
					case 1:
						ptr = Main.Builder_AccessChain(base, indexChain, instr, swizzle, component, preSwizzleBaseType,
								isRValue, alignment, coherentFlags.getPtr());
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

		public void setBase(long v) {
			Main.Builder_AccessChain_setBase(ptr, v);
		}

		public void setIndexChain(long[] v) {
			Main.Builder_AccessChain_setIndexChain(ptr, v);
		}

		public void setInstr(long v) {
			Main.Builder_AccessChain_setInstr(ptr, v);
		}

		public void setSwizzle(long[] v) {
			Main.Builder_AccessChain_setSwizzle(ptr, v);
		}

		public void setComponent(long v) {
			Main.Builder_AccessChain_setComponent(ptr, v);
		}

		public void setPreSwizzleBaseType(long v) {
			Main.Builder_AccessChain_setPreSwizzleBaseType(ptr, v);
		}

		public void setIsRValue(boolean v) {
			Main.Builder_AccessChain_setIsRValue(ptr, v);
		}

		public void setAlignment(long v) {
			Main.Builder_AccessChain_setAlignment(ptr, v);
		}

		public void setCoherentFlags(byte[] v) {
			Main.Builder_AccessChain_setCoherentFlags(ptr, v);
		}

		public long getBase() {
			return Main.Builder_AccessChain_getBase(ptr);
		}

		public long[] getIndexChain() {
			return Main.Builder_AccessChain_getIndexChain(ptr);
		}

		public long getInstr() {
			return Main.Builder_AccessChain_getInstr(ptr);
		}

		public long[] getSwizzle() {
			return Main.Builder_AccessChain_getSwizzle(ptr);
		}

		public long getComponent() {
			return Main.Builder_AccessChain_getComponent(ptr);
		}

		public long getPreSwizzleBaseType() {
			return Main.Builder_AccessChain_getPreSwizzleBaseType(ptr);
		}

		public boolean getIsRValue() {
			return Main.Builder_AccessChain_getIsRValue(ptr);
		}

		public long getAlignment() {
			return Main.Builder_AccessChain_getAlignment(ptr);
		}

		public byte[] getCoherentFlags() {
			return Main.Builder_AccessChain_getCoherentFlags(ptr);
		}

		public static class CoherentFlags extends PointerBoundObject {

			private final int constructorIndex;

			public CoherentFlags() {
				this.constructorIndex = 0;
				load();
			}

			protected CoherentFlags(byte[] ptr) {
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
							ptr = Main.Builder_AccessChain_CoherentFlags();
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

			public boolean isVolatile() {
				return Main.Builder_AccessChain_CoherentFlags_isVolatile(ptr);
			}

			public CoherentFlags operatorBitwiseOrAssign(CoherentFlags other) {
				return fromPtr(Main.Builder_AccessChain_CoherentFlags_operatorBitwiseOrAssign(ptr, other.getPtr()),
						CoherentFlags.class);
			}

			public boolean anyCoherent() {
				return Main.Builder_AccessChain_CoherentFlags_anyCoherent(ptr);
			}

			public void clear() {
				Main.Builder_AccessChain_CoherentFlags_clear(ptr);
			}

			public void setCoherent(long v) {
				Main.Builder_AccessChain_CoherentFlags_setCoherent(ptr, v);
			}

			public void setDevicecoherent(long v) {
				Main.Builder_AccessChain_CoherentFlags_setDevicecoherent(ptr, v);
			}

			public void setQueuefamilycoherent(long v) {
				Main.Builder_AccessChain_CoherentFlags_setQueuefamilycoherent(ptr, v);
			}

			public void setWorkgroupcoherent(long v) {
				Main.Builder_AccessChain_CoherentFlags_setWorkgroupcoherent(ptr, v);
			}

			public void setSubgroupcoherent(long v) {
				Main.Builder_AccessChain_CoherentFlags_setSubgroupcoherent(ptr, v);
			}

			public void setShadercallcoherent(long v) {
				Main.Builder_AccessChain_CoherentFlags_setShadercallcoherent(ptr, v);
			}

			public void setNonprivate(long v) {
				Main.Builder_AccessChain_CoherentFlags_setNonprivate(ptr, v);
			}

			public void setVolatil(long v) {
				Main.Builder_AccessChain_CoherentFlags_setVolatil(ptr, v);
			}

			public void setIsImage(long v) {
				Main.Builder_AccessChain_CoherentFlags_setIsImage(ptr, v);
			}

			public long getCoherent() {
				return Main.Builder_AccessChain_CoherentFlags_getCoherent(ptr);
			}

			public long getDevicecoherent() {
				return Main.Builder_AccessChain_CoherentFlags_getDevicecoherent(ptr);
			}

			public long getQueuefamilycoherent() {
				return Main.Builder_AccessChain_CoherentFlags_getQueuefamilycoherent(ptr);
			}

			public long getWorkgroupcoherent() {
				return Main.Builder_AccessChain_CoherentFlags_getWorkgroupcoherent(ptr);
			}

			public long getSubgroupcoherent() {
				return Main.Builder_AccessChain_CoherentFlags_getSubgroupcoherent(ptr);
			}

			public long getShadercallcoherent() {
				return Main.Builder_AccessChain_CoherentFlags_getShadercallcoherent(ptr);
			}

			public long getNonprivate() {
				return Main.Builder_AccessChain_CoherentFlags_getNonprivate(ptr);
			}

			public long getVolatil() {
				return Main.Builder_AccessChain_CoherentFlags_getVolatil(ptr);
			}

			public long getIsImage() {
				return Main.Builder_AccessChain_CoherentFlags_getIsImage(ptr);
			}

		}

	}

}