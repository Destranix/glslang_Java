package com.destranix.glslang;

import com.destranix.glslang.Main.String_Int;

public class EnumDefinition extends EnumParameters {

	private final int constructorIndex;

	public EnumDefinition() {
		super(PoisonClass.singleton);
		this.constructorIndex = 0;
		load();
	}

	protected EnumDefinition(byte[] ptr) {
		super(ptr);
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.EnumDefinition();
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

	public void set(int ceil, String_Int name, byte[] ep) {
		Main.EnumDefinition_set(ptr, ceil, name, ep);
	}

	public void set(int ceil, String_Int name, byte[] ep, boolean mask) {
		Main.EnumDefinition_set(ptr, ceil, name, ep, mask);
	}

	public void setOperands(OperandParameters op) {
		Main.EnumDefinition_setOperands(ptr, op.getPtr());
	}

	public void setCeiling(int v) {
		Main.EnumDefinition_setCeiling(ptr, v);
	}

	public void setBitmask(boolean v) {
		Main.EnumDefinition_setBitmask(ptr, v);
	}

	public void setGetName(String_Int v) {
		Main.EnumDefinition_setGetName(ptr, v);
	}

	public void setEnumParams(EnumParameters v) {
		Main.EnumDefinition_setEnumParams(ptr, v.getPtr());
	}

	public void setOperandParams(OperandParameters v) {
		Main.EnumDefinition_setOperandParams(ptr, v.getPtr());
	}

	public int getCeiling() {
		return Main.EnumDefinition_getCeiling(ptr);
	}

	public boolean getBitmask() {
		return Main.EnumDefinition_getBitmask(ptr);
	}

	public String_Int getGetName() {
		return fromPtr(Main.EnumDefinition_getGetName(ptr), Main.CString_Int.class);
	}

	public EnumParameters getEnumParams() {
		return fromPtr(Main.EnumDefinition_getEnumParams(ptr), EnumParameters.class);
	}

	public OperandParameters getOperandParams() {
		return fromPtr(Main.EnumDefinition_getOperandParams(ptr), OperandParameters.class);
	}

}