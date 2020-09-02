package com.destranix.glslang;

public class TVariable extends TSymbol {

	private final String name;
	private final TType t;
	private final boolean uT;
	private final int constructorIndex;

	public TVariable(String name, TType t) {
		super(PoisonClass.singleton);
		this.name = name;
		this.t = t;
		this.uT = false;
		this.constructorIndex = 0;
		load();
	}

	public TVariable(String name, TType t, boolean uT) {
		super(PoisonClass.singleton);
		this.name = name;
		this.t = t;
		this.uT = uT;
		this.constructorIndex = 0;
		load();
	}

	protected TVariable(byte[] ptr) {
		super(ptr);
		this.name = null;
		this.t = null;
		this.uT = false;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TVariable(name, t.getPtr(), uT);
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

	@Override
	public TVariable clone() {
		return fromPtr(Main.TVariable_clone(ptr), TVariable.class);
	}

	@Override
	public TVariable getAsVariable() {
		return fromPtr(Main.TVariable_getAsVariable(ptr), TVariable.class);
	}

	@Override
	public TType getType() {
		return fromPtr(Main.TVariable_getType(ptr), TType.class);
	}

	@Override
	public TType getWritableType() {
		return fromPtr(Main.TVariable_getWritableType(ptr), TType.class);
	}

	public boolean isUserType() {
		return Main.TVariable_isUserType(ptr);
	}

	public TConstUnionArray getConstArray() {
		return fromPtr(Main.TVariable_getConstArray(ptr), TConstUnionArray.class);
	}

	public TConstUnionArray getWritableConstArray() {
		return fromPtr(Main.TVariable_getWritableConstArray(ptr), TConstUnionArray.class);
	}

	public void setConstArray(TConstUnionArray array) {
		Main.TVariable_setConstArray(ptr, array.getPtr());
	}

	public void setConstSubtree(TIntermTyped subtree) {
		Main.TVariable_setConstSubtree(ptr, subtree.getPtr());
	}

	public TIntermTyped getConstSubtree() {
		return fromPtr(Main.TVariable_getConstSubtree(ptr), TIntermTyped.class);
	}

	public void setAnonId(int i) {
		Main.TVariable_setAnonId(ptr, i);
	}

	public int getAnonId() {
		return Main.TVariable_getAnonId(ptr);
	}

	public void setMemberExtensions(int member, String[] exts) {
		Main.TVariable_setMemberExtensions(ptr, member, exts);
	}

	public boolean hasMemberExtensions() {
		return Main.TVariable_hasMemberExtensions(ptr);
	}

	public int getNumMemberExtensions(int member) {
		return Main.TVariable_getNumMemberExtensions(ptr, member);
	}

	public String[] getMemberExtensions(int member) {
		return Main.TVariable_getMemberExtensions(ptr, member);
	}

	@Override
	public void dump(TInfoSink infoSink) {
		Main.TVariable_dump(ptr, infoSink.getPtr());
	}

	@Override
	public void dump(TInfoSink infoSink, boolean complete) {
		Main.TVariable_dump(ptr, infoSink.getPtr(), complete);
	}

}
