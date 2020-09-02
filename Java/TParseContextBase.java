package Java;

import Java.Main.Void_IntIntBooleanIntString;
import Java.Main.Void_IntIntString;
import Java.Main.Void_IntString;
import Java.Main.Void_IntStringString;
import Java.Main.Void_IntStringarray;

public abstract class TParseContextBase extends TParseVersions {
	private final int constructorIndex;

	protected TParseContextBase(PoisonClass p) {
		super(PoisonClass.singleton);
		this.constructorIndex = -1;
	}

	protected TParseContextBase(byte[] ptr) {
		super(ptr);
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
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
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	@Override
	public void error(TSourceLoc loc, String szReason, String szToken, String szExtraInfoFormat,
			PointerBoundObject... additional) {
		byte[][] additionalPtr = null;
		if (additional != null) {
			additionalPtr = new byte[additional.length][];
			for (int i = 0; i < additional.length; ++i) {
				additionalPtr[i] = additional[i].getPtr();
			}
		}
		Main.TParseContextBase_error(ptr, loc.getPtr(), szReason, szToken, szExtraInfoFormat, additionalPtr);
	}

	@Override
	public void warn(TSourceLoc loc, String szReason, String szToken, String szExtraInfoFormat,
			PointerBoundObject... additional) {
		byte[][] additionalPtr = null;
		if (additional != null) {
			additionalPtr = new byte[additional.length][];
			for (int i = 0; i < additional.length; ++i) {
				additionalPtr[i] = additional[i].getPtr();
			}
		}
		Main.TParseContextBase_warn(ptr, loc.getPtr(), szReason, szToken, szExtraInfoFormat, additionalPtr);
	}

	@Override
	public void ppError(TSourceLoc loc, String szReason, String szToken, String szExtraInfoFormat,
			PointerBoundObject... additional) {
		byte[][] additionalPtr = null;
		if (additional != null) {
			additionalPtr = new byte[additional.length][];
			for (int i = 0; i < additional.length; ++i) {
				additionalPtr[i] = additional[i].getPtr();
			}
		}
		Main.TParseContextBase_ppError(ptr, loc.getPtr(), szReason, szToken, szExtraInfoFormat, additionalPtr);
	}

	@Override
	public void ppWarn(TSourceLoc loc, String szReason, String szToken, String szExtraInfoFormat,
			PointerBoundObject... additional) {
		byte[][] additionalPtr = null;
		if (additional != null) {
			additionalPtr = new byte[additional.length][];
			for (int i = 0; i < additional.length; ++i) {
				additionalPtr[i] = additional[i].getPtr();
			}
		}
		Main.TParseContextBase_ppWarn(ptr, loc.getPtr(), szReason, szToken, szExtraInfoFormat, additionalPtr);
	}

	public void setLimits(TBuiltInResource resources) {
		Main.TParseContextBase_setLimits(ptr, resources.getPtr());
	}

	public void checkIndex(TSourceLoc loc, TType t, int index) {
		Main.TParseContextBase_checkIndex(ptr, loc.getPtr(), t.getPtr(), index);
	}

	@Override
	public EShLanguage getLanguage() {
		return EShLanguage.valueByConstant(Main.TParseContextBase_getLanguage(ptr));
	}

	public void setScanContext(TScanContext c) {
		Main.TParseContextBase_setScanContext(ptr, c.getPtr());
	}

	public TScanContext getScanContext() {
		return fromPtr(Main.TParseContextBase_getScanContext(ptr), TScanContext.class);
	}

	public void setPpContext(TPpContext c) {
		Main.TParseContextBase_setPpContext(ptr, c.getPtr());
	}

	public TPpContext getPpContext() {
		return fromPtr(Main.TParseContextBase_getPpContext(ptr), TPpContext.class);
	}

	public void setLineCallback(Void_IntIntBooleanIntString func) {
		Main.TParseContextBase_setLineCallback(ptr, func);
	}

	public void setExtensionCallback(Void_IntStringString func) {
		Main.TParseContextBase_setExtensionCallback(ptr, func);
	}

	public void setVersionCallback(Void_IntIntString func) {
		Main.TParseContextBase_setVersionCallback(ptr, func);
	}

	public void setPragmaCallback(Void_IntStringarray func) {
		Main.TParseContextBase_setPragmaCallback(ptr, func);
	}

	public void setErrorCallback(Void_IntString func) {
		Main.TParseContextBase_setErrorCallback(ptr, func);
	}

	public void reservedPpErrorCheck(TSourceLoc loc, String name, String op) {
		Main.TParseContextBase_reservedPpErrorCheck(ptr, loc.getPtr(), name, op);
	}

	public boolean lineContinuationCheck(TSourceLoc loc, boolean endOfComment) {
		return Main.TParseContextBase_lineContinuationCheck(ptr, loc.getPtr(), endOfComment);
	}

	public boolean lineDirectiveShouldSetNextLine() {
		return Main.TParseContextBase_lineDirectiveShouldSetNextLine(ptr);
	}

	public void handlePragma(TSourceLoc loc, String[] strings) {
		Main.TParseContextBase_handlePragma(ptr, loc.getPtr(), strings);
	}

	public boolean parseShaderStrings(TPpContext c, TInputScanner input) {
		return Main.TParseContextBase_parseShaderStrings(ptr, c.getPtr(), input.getPtr());
	}

	public boolean parseShaderStrings(TPpContext c, TInputScanner input, boolean versionWillBeError) {
		return Main.TParseContextBase_parseShaderStrings(ptr, c.getPtr(), input.getPtr(), versionWillBeError);
	}

	public void notifyVersion(int line, int version, String type_string) {
		Main.TParseContextBase_notifyVersion(ptr, line, version, type_string);
	}

	public void notifyErrorDirective(int line, String error_message) {
		Main.TParseContextBase_notifyErrorDirective(ptr, line, error_message);
	}

	public void notifyLineDirective(int curLineNo, int newLineNo, boolean hasSource, int sourceNum, String sourceName) {
		Main.TParseContextBase_notifyLineDirective(ptr, curLineNo, newLineNo, hasSource, sourceNum, sourceName);
	}

	public void notifyExtensionDirective(int line, String extension, String behavior) {
		Main.TParseContextBase_notifyExtensionDirective(ptr, line, extension, behavior);
	}

	public void growGlobalUniformBlock(TSourceLoc loc, TType t, String memberName) {
		Main.TParseContextBase_growGlobalUniformBlock(ptr, loc.getPtr(), t.getPtr(), memberName);
	}

	public void growGlobalUniformBlock(TSourceLoc loc, TType t, String memberName, TVector<TTypeLoc> typeList) {
		Main.TParseContextBase_growGlobalUniformBlock(ptr, loc.getPtr(), t.getPtr(), memberName, typeList.getPtr());
	}

	public void renameShaderFunction(String name) {
		Main.TParseContextBase_renameShaderFunction(ptr, name);
	}

	public boolean lValueErrorCheck(TSourceLoc loc, String op, TIntermTyped node) {
		return Main.TParseContextBase_lValueErrorCheck(ptr, loc.getPtr(), op, node.getPtr());
	}

	public void rValueErrorCheck(TSourceLoc loc, String op, TIntermTyped node) {
		Main.TParseContextBase_rValueErrorCheck(ptr, loc.getPtr(), op, node.getPtr());
	}

	public void setSymbolTable(TSymbolTable v) {
		Main.TParseContextBase_setSymbolTable(ptr, v.getPtr());
	}

	public void setStatementNestingLevel(int v) {
		Main.TParseContextBase_setStatementNestingLevel(ptr, v);
	}

	public void setLoopNestingLevel(int v) {
		Main.TParseContextBase_setLoopNestingLevel(ptr, v);
	}

	public void setStructNestingLevel(int v) {
		Main.TParseContextBase_setStructNestingLevel(ptr, v);
	}

	public void setControlFlowNestingLevel(int v) {
		Main.TParseContextBase_setControlFlowNestingLevel(ptr, v);
	}

	public void setFunctionReturnsValue(boolean v) {
		Main.TParseContextBase_setFunctionReturnsValue(ptr, v);
	}

	public void setPostEntryPointReturn(boolean v) {
		Main.TParseContextBase_setPostEntryPointReturn(ptr, v);
	}

	public void setSwitchSequenceStack(TList<TVector<TIntermNode>> v) {
		Main.TParseContextBase_setSwitchSequenceStack(ptr, v.getPtr());
	}

	public void setSwitchLevel(int[] v) {
		Main.TParseContextBase_setSwitchLevel(ptr, v);
	}

	public void setContextPragma(byte[] v) {
		Main.TParseContextBase_setContextPragma(ptr, v);
	}

	public void setBeginInvocationInterlockCount(int v) {
		Main.TParseContextBase_setBeginInvocationInterlockCount(ptr, v);
	}

	public void setEndInvocationInterlockCount(int v) {
		Main.TParseContextBase_setEndInvocationInterlockCount(ptr, v);
	}

	public String getScopeMangler() {
		return Main.TParseContextBase_getScopeMangler(ptr);
	}

	public TSymbolTable getSymbolTable() {
		return fromPtr(Main.TParseContextBase_getSymbolTable(ptr), TSymbolTable.class);
	}

	public int getStatementNestingLevel() {
		return Main.TParseContextBase_getStatementNestingLevel(ptr);
	}

	public int getLoopNestingLevel() {
		return Main.TParseContextBase_getLoopNestingLevel(ptr);
	}

	public int getStructNestingLevel() {
		return Main.TParseContextBase_getStructNestingLevel(ptr);
	}

	public int getControlFlowNestingLevel() {
		return Main.TParseContextBase_getControlFlowNestingLevel(ptr);
	}

	public TType getCurrentFunctionType() {
		return fromPtr(Main.TParseContextBase_getCurrentFunctionType(ptr), TType.class);
	}

	public boolean getFunctionReturnsValue() {
		return Main.TParseContextBase_getFunctionReturnsValue(ptr);
	}

	public boolean getPostEntryPointReturn() {
		return Main.TParseContextBase_getPostEntryPointReturn(ptr);
	}

	public TList<TVector<TIntermNode>> getSwitchSequenceStack() {
		@SuppressWarnings("unchecked") // Is checked
		TList<TVector<TIntermNode>> tmp = (TList<TVector<TIntermNode>>) fromPtr(
				Main.TParseContextBase_getSwitchSequenceStack(ptr), TList.class);
		return tmp;
	}

	public int[] getSwitchLevel() {
		return Main.TParseContextBase_getSwitchLevel(ptr);
	}

	public byte[] getContextPragma() {
		return Main.TParseContextBase_getContextPragma(ptr);
	}

	public int getBeginInvocationInterlockCount() {
		return Main.TParseContextBase_getBeginInvocationInterlockCount(ptr);
	}

	public int getEndInvocationInterlockCount() {
		return Main.TParseContextBase_getEndInvocationInterlockCount(ptr);
	}

}
