package com.destranix.glslang;

public class TInfoSinkBase extends PointerBoundObject {

	private final int constructorIndex;

	public TInfoSinkBase() {
		this.constructorIndex = 0;
		load();
	}

	protected TInfoSinkBase(byte[] ptr) {
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
					ptr = Main.TInfoSinkBase();
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

	public void erase() {
		Main.TInfoSinkBase_erase(ptr);
	}

	public String c_str() {
		return Main.TInfoSinkBase_c_str(ptr);
	}

	public void prefix(TPrefixType message) {
		Main.TInfoSinkBase_prefix(ptr, message);
	}

	public void location(TSourceLoc loc) {
		Main.TInfoSinkBase_location(ptr, loc.getPtr());
	}

	public void message(TPrefixType message, String s) {
		Main.TInfoSinkBase_message(ptr, message, s);
	}

	public void message(TPrefixType message, String s, TSourceLoc loc) {
		Main.TInfoSinkBase_message(ptr, message, s, loc.getPtr());
	}

	public void setOutputStream() {
		Main.TInfoSinkBase_setOutputStream(ptr);
	}

	public void setOutputStream(int output) {
		Main.TInfoSinkBase_setOutputStream(ptr, output);
	}

	public TInfoSinkBase operatorShiftLeft(char c) {
		return fromPtr(Main.TInfoSinkBase_operatorShiftLeft(ptr, c), TInfoSinkBase.class);
	}

	public TInfoSinkBase operatorShiftLeft(String s) {
		return fromPtr(Main.TInfoSinkBase_operatorShiftLeft(ptr, s), TInfoSinkBase.class);
	}

	public TInfoSinkBase operatorShiftLeft(int n) {
		return fromPtr(Main.TInfoSinkBase_operatorShiftLeft(ptr, n), TInfoSinkBase.class);
	}

	public TInfoSinkBase operatorShiftLeft(long n) {
		return fromPtr(Main.TInfoSinkBase_operatorShiftLeft(ptr, n), TInfoSinkBase.class);
	}

	public TInfoSinkBase operatorShiftLeft(float n) {
		return fromPtr(Main.TInfoSinkBase_operatorShiftLeft(ptr, n), TInfoSinkBase.class);
	}

	public TInfoSinkBase operatorPlus(String t) {
		return fromPtr(Main.TInfoSinkBase_operatorPlus(ptr, t), TInfoSinkBase.class);
	}

}
