package com.destranix.glslang;

public class TInputLanguage extends PointerBoundObject {

	private final EShSource languageFamily;
	private final EShLanguage stage;
	private final EShClient dialect;
	private final int dialectVersion;
	private final int constructorIndex;

	public TInputLanguage() {
		this.languageFamily = null;
		this.stage = null;
		this.dialect = null;
		this.dialectVersion = -1;
		this.constructorIndex = 0;
		load();
	}

	public TInputLanguage(EShSource languageFamily, EShLanguage stage, EShClient dialect, int dialectVersion) {
		this.languageFamily = languageFamily;
		this.stage = stage;
		this.dialect = dialect;
		this.dialectVersion = dialectVersion;
		this.constructorIndex = 1;
		load();
	}

	protected TInputLanguage(byte[] ptr) {
		this.ptr = ptr;
		this.languageFamily = null;
		this.stage = null;
		this.dialect = null;
		this.dialectVersion = -1;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TInputLanguage();
					break;
				case 1:
					ptr = Main.TInputLanguage(languageFamily, stage, dialect, dialectVersion);
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

	public void setLanguageFamily(EShSource v) {
		Main.TInputLanguage_setLanguageFamily(ptr, v.getConstant());
	}

	public void setStage(EShLanguage v) {
		Main.TInputLanguage_setStage(ptr, v.getConstant());
	}

	public void setDialect(EShClient v) {
		Main.TInputLanguage_setDialect(ptr, v.getConstant());
	}

	public void setDialectVersion(int v) {
		Main.TInputLanguage_setDialectVersion(ptr, v);
	}

	public EShSource getLanguageFamily() {
		return EShSource.valueByConstant(Main.TInputLanguage_getLanguageFamily(ptr));
	}

	public EShLanguage getStage() {
		return EShLanguage.valueByConstant(Main.TInputLanguage_getStage(ptr));
	}

	public EShClient getDialect() {
		return EShClient.valueByConstant(Main.TInputLanguage_getDialect(ptr));
	}

	public int getDialectVersion() {
		return Main.TInputLanguage_getDialectVersion(ptr);
	}

}
