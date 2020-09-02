package com.destranix.glslang;

public abstract class TBuiltInParseables extends PointerBoundObject {

	private final int constructorIndex;

	protected TBuiltInParseables(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected TBuiltInParseables(byte[] ptr) {
		this.ptr = ptr;
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

	public void initialize(int version, EProfile profile, SpvVersionStruct spvVersion) {
		Main.TBuiltInParseables_initialize(ptr, version, profile, spvVersion.getPtr());
	}

	public void initialize(TBuiltInResource resources, int version, EProfile profile, SpvVersionStruct spvVersion,
			EShLanguage language) {
		Main.TBuiltInParseables_initialize(ptr, resources.getPtr(), version, profile, spvVersion.getPtr(), language);
	}

	public String getCommonString() {
		return Main.TBuiltInParseables_getCommonString(ptr);
	}

	public String getStageString(EShLanguage language) {
		return Main.TBuiltInParseables_getStageString(ptr, language);
	}

	public void identifyBuiltIns(int version, EProfile profile, SpvVersionStruct spvVersion, EShLanguage language,
			TSymbolTable symbolTable) {
		Main.TBuiltInParseables_identifyBuiltIns(ptr, version, profile, spvVersion.getPtr(), language,
				symbolTable.getPtr());
	}

	public void identifyBuiltIns(int version, EProfile profile, SpvVersionStruct spvVersion, EShLanguage language,
			TSymbolTable symbolTable, TBuiltInResource resources) {
		Main.TBuiltInParseables_identifyBuiltIns(ptr, version, profile, spvVersion.getPtr(), language,
				symbolTable.getPtr(), resources.getPtr());
	}

}
