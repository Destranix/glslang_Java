package com.destranix.glslang;

public class TPragma extends PointerBoundObject {

	private final boolean optimize;
	private final boolean debug;
	private final int constructorIndex;

	public TPragma(boolean optimize, boolean debug) {
		this.optimize = optimize;
		this.debug = debug;
		this.constructorIndex = 0;
		load();
	}

	protected TPragma(byte[] ptr) {
		this.ptr = ptr;
		this.optimize = false;
		this.debug = false;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TPragma(optimize, debug);
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

	public void setOptimize(boolean v) {
		Main.TPragma_setOptimize(ptr, v);
	}

	public void setDebug(boolean v) {
		Main.TPragma_setDebug(ptr, v);
	}

	public void setPragmaTable(TPragmaTable v) {
		Main.TPragma_setPragmaTable(ptr, v.getPtr());
	}

	public boolean getOptimize() {
		return Main.TPragma_getOptimize(ptr);
	}

	public boolean getDebug() {
		return Main.TPragma_getDebug(ptr);
	}

	public TPragmaTable getPragmaTable() {
		return fromPtr(Main.TPragma_getPragmaTable(ptr), TPragmaTable.class);
	}

}
