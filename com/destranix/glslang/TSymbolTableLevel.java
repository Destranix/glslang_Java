package com.destranix.glslang;

public class TSymbolTableLevel extends PointerBoundObject {

	private final int constructorIndex;

	public TSymbolTableLevel() {
		this.constructorIndex = 0;
		load();
	}

	protected TSymbolTableLevel(byte[] ptr) {
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
					ptr = Main.TSymbolTableLevel();
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
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public boolean insert(TSymbol symbol, boolean separateNameSpaces) {
		return Main.TSymbolTableLevel_insert(ptr, symbol.getPtr(), separateNameSpaces);
	}

	public boolean amend(TSymbol symbol, int firstNewMember) {
		return Main.TSymbolTableLevel_amend(ptr, symbol.getPtr(), firstNewMember);
	}

	public boolean insertAnonymousMembers(TSymbol symbol, int firstMember) {
		return Main.TSymbolTableLevel_insertAnonymousMembers(ptr, symbol.getPtr(), firstMember);
	}

	public TSymbol find(String name) {
		return fromPtr(Main.TSymbolTableLevel_find(ptr, name), TSymbol.class);
	}

	public void findFunctionNameList(String name, TVector<TFunction> list) {
		Main.TSymbolTableLevel_findFunctionNameList(ptr, name, list.getPtr());
	}

	public boolean hasFunctionName(String name) {
		return Main.TSymbolTableLevel_hasFunctionName(ptr, name);
	}

	public boolean findFunctionVariableName(String name, boolean variable) {
		return Main.TSymbolTableLevel_findFunctionVariableName(ptr, name, variable);
	}

	public void setPreviousDefaultPrecisions(TPrecisionQualifier p) {
		Main.TSymbolTableLevel_setPreviousDefaultPrecisions(ptr, p);
	}

	public void getPreviousDefaultPrecisions(TPrecisionQualifier p) {
		Main.TSymbolTableLevel_getPreviousDefaultPrecisions(ptr, p);
	}

	public void relateToOperator(String name, TOperator op) {
		Main.TSymbolTableLevel_relateToOperator(ptr, name, op);
	}

	public void setFunctionExtensions(String name, String[] extensions) {
		Main.TSymbolTableLevel_setFunctionExtensions(ptr, name, extensions);
	}

	public void dump(TInfoSink infoSink) {
		Main.TSymbolTableLevel_dump(ptr, infoSink.getPtr());
	}

	public void dump(TInfoSink infoSink, boolean complete) {
		Main.TSymbolTableLevel_dump(ptr, infoSink.getPtr(), complete);
	}

	@Override
	public TSymbolTableLevel clone() {
		return fromPtr(Main.TSymbolTableLevel_clone(ptr), TSymbolTableLevel.class);
	}

	public void readOnly() {
		Main.TSymbolTableLevel_readOnly(ptr);
	}

	public void setThisLevel() {
		Main.TSymbolTableLevel_setThisLevel(ptr);
	}

	public boolean isThisLevel() {
		return Main.TSymbolTableLevel_isThisLevel(ptr);
	}

}
