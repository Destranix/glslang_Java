package com.destranix.glslang;

public class TTarget extends PointerBoundObject {

	private final EShTargetLanguage language;
	private final EShTargetLanguageVersion version;
	private final boolean hlslFunctionality1;

	private final int constructorIndex;

	public TTarget() {
		this.language = null;
		this.version = null;
		this.hlslFunctionality1 = false;
		this.constructorIndex = 0;
		load();
	}

	public TTarget(EShTargetLanguage language, EShTargetLanguageVersion version, boolean hlslFunctionality1) {
		this.language = language;
		this.version = version;
		this.hlslFunctionality1 = hlslFunctionality1;
		this.constructorIndex = 1;
		load();
	}

	protected TTarget(byte[] ptr) {
		this.ptr = ptr;
		this.language = null;
		this.version = null;
		this.hlslFunctionality1 = false;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TTarget();
					break;
				case 1:
					ptr = Main.TTarget(language, version, hlslFunctionality1);
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

	public void setLanguage(EShTargetLanguage v) {
		Main.TTarget_setLanguage(ptr, v.getConstant());
	}

	public void setVersion(EShTargetLanguageVersion v) {
		Main.TTarget_setVersion(ptr, v.getConstant());
	}

	public void setHlslFunctionality1(boolean v) {
		Main.TTarget_setHlslFunctionality1(ptr, v);
	}

	public EShTargetLanguage getLanguage() {
		return EShTargetLanguage.valueByConstant(Main.TTarget_getLanguage(ptr));
	}

	public EShTargetLanguageVersion getVersion() {
		return EShTargetLanguageVersion.valueByConstant(Main.TTarget_getVersion(ptr));
	}

	public boolean getHlslFunctionality1() {
		return Main.TTarget_getHlslFunctionality1(ptr);
	}

}
