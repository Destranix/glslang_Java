package com.destranix.glslang;

public class TCall extends PointerBoundObject {

	private final String pCaller;
	private final String pCallee;
	private final int constructorIndex;

	public TCall(String pCaller, String pCallee) {
		this.pCaller = pCaller;
		this.pCallee = pCallee;
		this.constructorIndex = 0;
		load();
	}

	protected TCall(byte[] ptr) {
		this.ptr = ptr;
		this.pCaller = null;
		this.pCallee = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TCall(pCaller, pCallee);
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

	public void setCaller(String v) {
		Main.TCall_setCaller(ptr, v);
	}

	public void setCallee(String v) {
		Main.TCall_setCallee(ptr, v);
	}

	public void setVisited(boolean v) {
		Main.TCall_setVisited(ptr, v);
	}

	public void setCurrentPath(boolean v) {
		Main.TCall_setCurrentPath(ptr, v);
	}

	public void setErrorGiven(boolean v) {
		Main.TCall_setErrorGiven(ptr, v);
	}

	public void setCalleeBodyPosition(int v) {
		Main.TCall_setCalleeBodyPosition(ptr, v);
	}

	public String getCaller() {
		return Main.TCall_getCaller(ptr);
	}

	public String getCallee() {
		return Main.TCall_getCallee(ptr);
	}

	public boolean getVisited() {
		return Main.TCall_getVisited(ptr);
	}

	public boolean getCurrentPath() {
		return Main.TCall_getCurrentPath(ptr);
	}

	public boolean getErrorGiven() {
		return Main.TCall_getErrorGiven(ptr);
	}

	public int getCalleeBodyPosition() {
		return Main.TCall_getCalleeBodyPosition(ptr);
	}

}
