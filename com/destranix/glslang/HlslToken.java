package com.destranix.glslang;

public class HlslToken extends PointerBoundObject {

	private final int constructorIndex;

	public HlslToken() {
		this.constructorIndex = 0;
		load();
	}

	protected HlslToken(byte[] ptr) {
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
					ptr = Main.HlslToken();
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

	public void setLoc(TSourceLoc loc) {
		Main.HlslToken_setLoc(ptr, loc.getPtr());
	}

	public void setTokenClass(EHlslTokenClass tokenClass) {
		Main.HlslToken_setTokenClass(ptr, tokenClass);
	}

	public void setString(String string) {
		Main.HlslToken_setString(ptr, string);
	}

	public void setI(int i) {
		Main.HlslToken_setI(ptr, i);
	}

	public void setU(long u) {
		Main.HlslToken_setU(ptr, u);
	}

	public void setB(boolean b) {
		Main.HlslToken_setB(ptr, b);
	}

	public void setD(double d) {
		Main.HlslToken_setD(ptr, d);
	}

	public TSourceLoc getLoc() {
		return fromPtr(Main.HlslToken_getLoc(ptr), TSourceLoc.class);
	}

	public EHlslTokenClass getTokenClass() {
		return EHlslTokenClass.valueByConstant(Main.HlslToken_getTokenClass(ptr));
	}

	public String getString() {
		return Main.HlslToken_getString(ptr);
	}

	public int getI() {
		return Main.HlslToken_getI(ptr);
	}

	public long getU() {
		return Main.HlslToken_getU(ptr);
	}

	public boolean getB() {
		return Main.HlslToken_getB(ptr);
	}

	public double getD() {
		return Main.HlslToken_getD(ptr);
	}

}
