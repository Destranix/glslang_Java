package com.destranix.glslang;

public class TPrecisionManager extends PointerBoundObject {

	private final int constructorIndex;

	public TPrecisionManager() {
		this.constructorIndex = 0;
		load();
	}

	protected TPrecisionManager(byte[] ptr) {
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
					ptr = Main.TPrecisionManager();
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

	public void respectPrecisionQualifiers() {
		Main.TPrecisionManager_respectPrecisionQualifiers(ptr);
	}

	public boolean respectingPrecisionQualifiers() {
		return Main.TPrecisionManager_respectingPrecisionQualifiers(ptr);
	}

	public boolean shouldWarnAboutDefaults() {
		return Main.TPrecisionManager_shouldWarnAboutDefaults(ptr);
	}

	public void defaultWarningGiven() {
		Main.TPrecisionManager_defaultWarningGiven(ptr);
	}

	public void warnAboutDefaults() {
		Main.TPrecisionManager_warnAboutDefaults(ptr);
	}

	public void explicitIntDefaultSeen() {
		Main.TPrecisionManager_explicitIntDefaultSeen(ptr);
	}

	public void explicitFloatDefaultSeen() {
		Main.TPrecisionManager_explicitFloatDefaultSeen(ptr);
	}

}
