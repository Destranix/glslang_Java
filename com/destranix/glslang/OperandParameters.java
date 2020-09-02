package com.destranix.glslang;

public class OperandParameters extends PointerBoundObject {

	private final int constructorIndex;

	public OperandParameters() {
		this.constructorIndex = 0;
		load();
	}

	protected OperandParameters(byte[] ptr) {
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
					ptr = Main.OperandParameters();
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

	public void push(OperandClass oc, String d) {
		Main.OperandParameters_push(ptr, oc, d);
	}

	public void push(OperandClass oc, String d, boolean opt) {
		Main.OperandParameters_push(ptr, oc, d, opt);
	}

	public void setOptional() {
		Main.OperandParameters_setOptional(ptr);
	}

	public OperandClass getClass(int op) {
		return OperandClass.valueByConstant(Main.OperandParameters_getClass(ptr, op));
	}

	public String getDesc(int op) {
		return Main.OperandParameters_getDesc(ptr, op);
	}

	public boolean isOptional(int op) {
		return Main.OperandParameters_isOptional(ptr, op);
	}

	public int getNum() {
		return Main.OperandParameters_getNum(ptr);
	}

}