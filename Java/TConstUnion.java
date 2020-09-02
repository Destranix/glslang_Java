package Java;

import java.math.BigInteger;

public class TConstUnion extends PointerBoundObject {

	private final int constructorIndex;

	public TConstUnion() {
		this.constructorIndex = 0;
		load();
	}

	protected TConstUnion(byte[] ptr) {
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
					ptr = Main.TConstUnion();
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
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public void setI8Const(byte i) {
		Main.TConstUnion_setI8Const(ptr, i);
	}

	public void setU8Const(short u) {
		Main.TConstUnion_setU8Const(ptr, u);
	}

	public void setI16Const(short i) {
		Main.TConstUnion_setI16Const(ptr, i);
	}

	public void setU16Const(int u) {
		Main.TConstUnion_setU16Const(ptr, u);
	}

	public void setIConst(int i) {
		Main.TConstUnion_setIConst(ptr, i);
	}

	public void setUConst(long u) {
		Main.TConstUnion_setUConst(ptr, u);
	}

	public void setI64Const(BigInteger i64) {
		Main.TConstUnion_setI64Const(ptr, i64);
	}

	public void setU64Const(BigInteger u64) {
		Main.TConstUnion_setU64Const(ptr, u64);
	}

	public void setDConst(double d) {
		Main.TConstUnion_setDConst(ptr, d);
	}

	public void setBConst(boolean b) {
		Main.TConstUnion_setBConst(ptr, b);
	}

	public void setSConst(String s) {
		Main.TConstUnion_setSConst(ptr, s);
	}

	public byte getI8Const() {
		return Main.TConstUnion_getI8Const(ptr);
	}

	public short getU8Const() {
		return Main.TConstUnion_getU8Const(ptr);
	}

	public short getI16Const() {
		return Main.TConstUnion_getI16Const(ptr);
	}

	public int getU16Const() {
		return Main.TConstUnion_getU16Const(ptr);
	}

	public int getIConst() {
		return Main.TConstUnion_getIConst(ptr);
	}

	public long getUConst() {
		return Main.TConstUnion_getUConst(ptr);
	}

	public BigInteger getI64Const() {
		return Main.TConstUnion_getI64Const(ptr);
	}

	public BigInteger getU64Const() {
		return Main.TConstUnion_getU64Const(ptr);
	}

	public double getDConst() {
		return Main.TConstUnion_getDConst(ptr);
	}

	public boolean getBConst() {
		return Main.TConstUnion_getBConst(ptr);
	}

	public String getSConst() {
		return Main.TConstUnion_getSConst(ptr);
	}

	public TBasicType getType() {
		return TBasicType.valueByConstant(Main.TConstUnion_getType(ptr));
	}

	public boolean operatorEqual(byte i) {
		return Main.TConstUnion_operatorEqual(ptr, i);
	}

	public boolean operatorEqualUnsigned(short u) {
		return Main.TConstUnion_operatorEqualUnsigned(ptr, u);
	}

	public boolean operatorEqual(short i) {
		return Main.TConstUnion_operatorEqual(ptr, i);
	}

	public boolean operatorEqualUnsigned(int u) {
		return Main.TConstUnion_operatorEqualUnsigned(ptr, u);
	}

	public boolean operatorEqual(int i) {
		return Main.TConstUnion_operatorEqual(ptr, i);
	}

	public boolean operatorEqual(long u) {
		return Main.TConstUnion_operatorEqual(ptr, u);
	}

	public boolean operatorEqual(BigInteger i64) {
		return Main.TConstUnion_operatorEqual(ptr, i64);
	}

	public boolean operatorEqualUnsigned(BigInteger u64) {
		return Main.TConstUnion_operatorEqualUnsigned(ptr, u64);
	}

	public boolean operatorEqual(double d) {
		return Main.TConstUnion_operatorEqual(ptr, d);
	}

	public boolean operatorEqual(boolean b) {
		return Main.TConstUnion_operatorEqual(ptr, b);
	}

	public boolean operatorEqual(TConstUnion constant) {
		return Main.TConstUnion_operatorEqual(ptr, constant.getPtr());
	}

	public boolean operatorNotEqual(byte i) {
		return Main.TConstUnion_operatorNotEqual(ptr, i);
	}

	public boolean operatorNotEqualUnsigned(short u) {
		return Main.TConstUnion_operatorNotEqualUnsigned(ptr, u);
	}

	public boolean operatorNotEqual(short i) {
		return Main.TConstUnion_operatorNotEqual(ptr, i);
	}

	public boolean operatorNotEqualUnsigned(int u) {
		return Main.TConstUnion_operatorNotEqualUnsigned(ptr, u);
	}

	public boolean operatorNotEqual(int i) {
		return Main.TConstUnion_operatorNotEqual(ptr, i);
	}

	public boolean operatorNotEqual(long u) {
		return Main.TConstUnion_operatorNotEqual(ptr, u);
	}

	public boolean operatorNotEqual(BigInteger i64) {
		return Main.TConstUnion_operatorNotEqual(ptr, i64);
	}

	public boolean operatorNotEqualUnsigned(BigInteger u64) {
		return Main.TConstUnion_operatorNotEqualUnsigned(ptr, u64);
	}

	public boolean operatorNotEqual(float d) {
		return Main.TConstUnion_operatorNotEqual(ptr, d);
	}

	public boolean operatorNotEqual(boolean b) {
		return Main.TConstUnion_operatorNotEqual(ptr, b);
	}

	public boolean operatorNotEqual(TConstUnion constant) {
		return Main.TConstUnion_operatorNotEqual(ptr, constant.getPtr());
	}

	public boolean operatorGreaterThan(TConstUnion constant) {
		return Main.TConstUnion_operatorGreaterThan(ptr, constant.getPtr());
	}

	public boolean operatorLowerThan(TConstUnion constant) {
		return Main.TConstUnion_operatorLowerThan(ptr, constant.getPtr());
	}

	public TConstUnion operatorPlus(TConstUnion constant) {
		return fromPtr(Main.TConstUnion_operatorPlus(ptr, constant.getPtr()), TConstUnion.class);
	}

	public TConstUnion operatorMinus(TConstUnion constant) {
		return fromPtr(Main.TConstUnion_operatorMinus(ptr, constant.getPtr()), TConstUnion.class);
	}

	public TConstUnion operatorMul(TConstUnion constant) {
		return fromPtr(Main.TConstUnion_operatorMul(ptr, constant.getPtr()), TConstUnion.class);
	}

	public TConstUnion operatorMod(TConstUnion constant) {
		return fromPtr(Main.TConstUnion_operatorMod(ptr, constant.getPtr()), TConstUnion.class);
	}

	public TConstUnion operatorShiftRight(TConstUnion constant) {
		return fromPtr(Main.TConstUnion_operatorShiftRight(ptr, constant.getPtr()), TConstUnion.class);
	}

	public TConstUnion operatorShiftLeft(TConstUnion constant) {
		return fromPtr(Main.TConstUnion_operatorShiftLeft(ptr, constant.getPtr()), TConstUnion.class);
	}

	public TConstUnion operatorBitwiseAnd(TConstUnion constant) {
		return fromPtr(Main.TConstUnion_operatorBitwiseAnd(ptr, constant.getPtr()), TConstUnion.class);
	}

	public TConstUnion operatorBitwiseOr(TConstUnion constant) {
		return fromPtr(Main.TConstUnion_operatorBitwiseOr(ptr, constant.getPtr()), TConstUnion.class);
	}

	public TConstUnion operatorBitwiseXor(TConstUnion constant) {
		return fromPtr(Main.TConstUnion_operatorBitwiseXor(ptr, constant.getPtr()), TConstUnion.class);
	}

	public TConstUnion operatorBitwiseInvert() {
		return fromPtr(Main.TConstUnion_operatorBitwiseInvert(ptr), TConstUnion.class);
	}

	public TConstUnion operatorAnd(TConstUnion constant) {
		return fromPtr(Main.TConstUnion_operatorAnd(ptr, constant.getPtr()), TConstUnion.class);
	}

	public TConstUnion operatorOr(TConstUnion constant) {
		return fromPtr(Main.TConstUnion_operatorOr(ptr, constant.getPtr()), TConstUnion.class);
	}

}
