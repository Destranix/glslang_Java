package com.destranix.glslang;

public class TParameter extends PointerBoundObject {

	private final String name;
	private final TType type;
	private final TIntermTyped defaultValue;
	private final int constructorIndex;

	public TParameter() {
		this.name = null;
		this.type = null;
		this.defaultValue = null;
		this.constructorIndex = 0;
		load();
	}

	public TParameter(String name, TType type, TIntermTyped defaultValue) {
		this.name = name;
		this.type = type;
		this.defaultValue = defaultValue;
		this.constructorIndex = 1;
		load();
	}

	protected TParameter(byte[] ptr) {
		this.ptr = ptr;
		this.name = null;
		this.type = null;
		this.defaultValue = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TParameter();
					break;
				case 1:
					ptr = Main.TParameter(name, type.getPtr(), defaultValue.getPtr());
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

	public void copyParam(TParameter param) {
		Main.TParameter_copyParam(ptr, param.getPtr());
	}

	public TBuiltInVariable getDeclaredBuiltIn() {
		return TBuiltInVariable.valueByConstant(Main.TParameter_getDeclaredBuiltIn(ptr));
	}

	public void setName(String v) {
		Main.TParameter_setName(ptr, v);
	}

	public void setType(TType v) {
		Main.TParameter_setType(ptr, v.getPtr());
	}

	public void setDefaultValue(TIntermTyped v) {
		Main.TParameter_setDefaultValue(ptr, v.getPtr());
	}

	public String getName() {
		return Main.TParameter_getName(ptr);
	}

	public TType getType() {
		return fromPtr(Main.TParameter_getType(ptr), TType.class);
	}

	public TIntermTyped getDefaultValue() {
		return fromPtr(Main.TParameter_getDefaultValue(ptr), TIntermTyped.class);
	}

}
