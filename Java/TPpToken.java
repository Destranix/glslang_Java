package Java;

import java.math.BigInteger;

public class TPpToken extends PointerBoundObject {

	private final int constructorIndex;

	public TPpToken() {
		this.constructorIndex = 0;
		load();
	}

	protected TPpToken(byte[] ptr) {
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
					ptr = Main.TPpToken();
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

	public void clear() {
		Main.TPpToken_clear(ptr);
	}

	public void setLoc(TSourceLoc v) {
		Main.TPpToken_setLoc(ptr, v.getPtr());
	}

	public void setSpace(boolean v) {
		Main.TPpToken_setSpace(ptr, v);
	}

	public void setIval(int v) {
		Main.TPpToken_setIval(ptr, v);
	}

	public void setDval(double v) {
		Main.TPpToken_setDval(ptr, v);
	}

	public void setI64val(BigInteger v) {
		Main.TPpToken_setI64val(ptr, v);
	}

	public void setName(String v) {
		Main.TPpToken_setName(ptr, v);
	}

	public TSourceLoc getLoc() {
		return fromPtr(Main.TPpToken_getLoc(ptr), TSourceLoc.class);
	}

	public boolean getSpace() {
		return Main.TPpToken_getSpace(ptr);
	}

	public int getIval() {
		return Main.TPpToken_getIval(ptr);
	}

	public double getDval() {
		return Main.TPpToken_getDval(ptr);
	}

	public BigInteger getI64val() {
		return Main.TPpToken_getI64val(ptr);
	}

	public String getName() {
		return Main.TPpToken_getName(ptr);
	}

	public boolean operatorEqual(TPpToken right) {
		return Main.TPpToken_operatorEqual(ptr, right.getPtr());
	}

	public boolean operatorNotEqual(TPpToken right) {
		return Main.TPpToken_operatorNotEqual(ptr, right.getPtr());
	}

}
