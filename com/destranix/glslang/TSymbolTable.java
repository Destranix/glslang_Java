package com.destranix.glslang;

public class TSymbolTable extends PointerBoundObject {

	private final int constructorIndex;

	public TSymbolTable() {
		this.constructorIndex = 0;
		load();
	}

	protected TSymbolTable(byte[] ptr) {
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
					ptr = Main.TSymbolTable();
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

	public void adoptLevels(TSymbolTable symTable) {
		Main.TSymbolTable_adoptLevels(ptr, symTable.getPtr());
	}

	public boolean isEmpty() {
		return Main.TSymbolTable_isEmpty(ptr);
	}

	public boolean atBuiltInLevel() {
		return Main.TSymbolTable_atBuiltInLevel(ptr);
	}

	public boolean atGlobalLevel() {
		return Main.TSymbolTable_atGlobalLevel(ptr);
	}

	public void setNoBuiltInRedeclarations() {
		Main.TSymbolTable_setNoBuiltInRedeclarations(ptr);
	}

	public void setSeparateNameSpaces() {
		Main.TSymbolTable_setSeparateNameSpaces(ptr);
	}

	public void push() {
		Main.TSymbolTable_push(ptr);
	}

	public void pushThis(TSymbol thisSymbol) {
		Main.TSymbolTable_pushThis(ptr, thisSymbol.getPtr());
	}

	public void pop(TPrecisionQualifier p) {
		Main.TSymbolTable_pop(ptr, p);
	}

	public boolean insert(TSymbol symbol) {
		return Main.TSymbolTable_insert(ptr, symbol.getPtr());
	}

	public boolean amend(TSymbol symbol, int firstNewMember) {
		return Main.TSymbolTable_amend(ptr, symbol.getPtr(), firstNewMember);
	}

	public void makeInternalVariable(TSymbol symbol) {
		Main.TSymbolTable_makeInternalVariable(ptr, symbol.getPtr());
	}

	public TSymbol copyUpDeferredInsert(TSymbol shared) {
		return fromPtr(Main.TSymbolTable_copyUpDeferredInsert(ptr, shared.getPtr()), TSymbol.class);
	}

	public TSymbol copyUp(TSymbol shared) {
		return fromPtr(Main.TSymbolTable_copyUp(ptr, shared.getPtr()), TSymbol.class);
	}

	public TSymbol find(String name) {
		return fromPtr(Main.TSymbolTable_find(ptr, name), TSymbol.class);
	}

	public TSymbol find(String name, boolean builtIn) {
		return fromPtr(Main.TSymbolTable_find(ptr, name, builtIn), TSymbol.class);
	}

	public TSymbol find(String name, boolean builtIn, boolean currentScope) {
		return fromPtr(Main.TSymbolTable_find(ptr, name, builtIn, currentScope), TSymbol.class);
	}

	public TSymbol find(String name, boolean builtIn, boolean currentScope, int thisDepthP) {
		return fromPtr(Main.TSymbolTable_find(ptr, name, builtIn, currentScope, thisDepthP), TSymbol.class);
	}

	public TSymbol find(String name, int thisDepth) {
		return fromPtr(Main.TSymbolTable_find(ptr, name, thisDepth), TSymbol.class);
	}

	public boolean isFunctionNameVariable(String name) {
		return Main.TSymbolTable_isFunctionNameVariable(ptr, name);
	}

	public void findFunctionNameList(String name, TVector<TFunction> list, boolean builtIn) {
		Main.TSymbolTable_findFunctionNameList(ptr, name, list.getPtr(), builtIn);
	}

	public void relateToOperator(String name, TOperator op) {
		Main.TSymbolTable_relateToOperator(ptr, name, op);
	}

	public void setFunctionExtensions(String name, String[] extensions) {
		Main.TSymbolTable_setFunctionExtensions(ptr, name, extensions);
	}

	public void setVariableExtensions(String name, String[] extensions) {
		Main.TSymbolTable_setVariableExtensions(ptr, name, extensions);
	}

	public void setVariableExtensions(String blockName, String name, String[] extensions) {
		Main.TSymbolTable_setVariableExtensions(ptr, blockName, name, extensions);
	}

	public int getMaxSymbolId() {
		return Main.TSymbolTable_getMaxSymbolId(ptr);
	}

	public void dump(TInfoSink infoSink) {
		Main.TSymbolTable_dump(ptr, infoSink.getPtr());
	}

	public void dump(TInfoSink infoSink, boolean complete) {
		Main.TSymbolTable_dump(ptr, infoSink.getPtr(), complete);
	}

	public void copyTable(TSymbolTable copyOf) {
		Main.TSymbolTable_copyTable(ptr, copyOf.getPtr());
	}

	public void setPreviousDefaultPrecisions(TPrecisionQualifier p) {
		Main.TSymbolTable_setPreviousDefaultPrecisions(ptr, p);
	}

	public void readOnly() {
		Main.TSymbolTable_readOnly(ptr);
	}

}
