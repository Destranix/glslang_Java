package com.destranix.glslang;

public class TAttributeArgs extends PointerBoundObject {

	private final TAttributeType name;
	private final TIntermAggregate args;
	private final int constructorIndex;

	public TAttributeArgs() {
		this.name = null;
		this.args = null;
		this.constructorIndex = 0;
		load();
	}

	public TAttributeArgs(TAttributeType name, TIntermAggregate args) {
		this.name = name;
		this.args = args;
		this.constructorIndex = 1;
		load();
	}

	protected TAttributeArgs(byte[] ptr) {
		this.ptr = ptr;
		this.name = null;
		this.args = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TAttributeArgs();
					break;
				case 1:
					ptr = Main.TAttributeArgs(name, args.getPtr());
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

	public boolean getInt(int value) {
		return Main.TAttributeArgs_getInt(ptr, value);
	}

	public boolean getInt(int value, int argNum) {
		return Main.TAttributeArgs_getInt(ptr, value, argNum);
	}

	public boolean getString(String value) {
		return Main.TAttributeArgs_getString(ptr, value);
	}

	public boolean getString(String value, int argNum) {
		return Main.TAttributeArgs_getString(ptr, value, argNum);
	}

	public boolean getString(String value, int argNum, boolean convertToLower) {
		return Main.TAttributeArgs_getString(ptr, value, argNum, convertToLower);
	}

	public int size() {
		return Main.TAttributeArgs_size(ptr);
	}

	public void setName(TAttributeType v) {
		Main.TAttributeArgs_setName(ptr, v.getConstant());
	}

	public TAttributeType getName() {
		return TAttributeType.valueByConstant(Main.TAttributeArgs_getName(ptr));
	}

	public TIntermAggregate getArgs() {
		return fromPtr(Main.TAttributeArgs_getArgs(ptr), TIntermAggregate.class);
	}

}
