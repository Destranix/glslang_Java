package com.destranix.glslang;

public class Function extends PointerBoundObject {

	protected final long id;
	protected final long resultType;
	protected final long functionType;
	protected final long firstParam;
	protected final Module parent;
	private final int constructorIndex;

	public Function(long id, long resultType, long functionType, long firstParam, Module parent) {
		this.id = id;
		this.resultType = resultType;
		this.functionType = functionType;
		this.firstParam = firstParam;
		this.parent = parent;
		this.constructorIndex = 0;
		load();
	}

	protected Function(byte[] ptr) {
		this.ptr = ptr;
		this.id = -1;
		this.resultType = -1;
		this.functionType = -1;
		this.firstParam = -1;
		this.parent = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.Function(id, resultType, functionType, firstParam, parent.getPtr());
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

	public long getId() {
		return Main.Function_getId(ptr);
	}

	public long getParamId(int p) {
		return Main.Function_getParamId(ptr, p);
	}

	public long getParamType(int p) {
		return Main.Function_getParamType(ptr, p);
	}

	public void addBlock(Block block) {
		Main.Function_addBlock(ptr, block.getPtr());
	}

	public void removeBlock(Block block) {
		Main.Function_removeBlock(ptr, block.getPtr());
	}

	public Module getParent() {
		return fromPtr(Main.Function_getParent(ptr), Module.class);
	}

	public Block getEntryBlock() {
		return fromPtr(Main.Function_getEntryBlock(ptr), Block.class);
	}

	public Block getLastBlock() {
		return fromPtr(Main.Function_getLastBlock(ptr), Block.class);
	}

	public CVector<Block> getBlocks() {
		@SuppressWarnings("unchecked")
		CVector<Block> ret = (CVector<Block>) fromPtr(Main.Function_getBlocks(ptr), CVector.class);
		return ret;
	}

	public void addLocalVariable(Instruction inst) {
		Main.Function_addLocalVariable(ptr, inst.getPtr());
	}

	public long getReturnType() {
		return Main.Function_getReturnType(ptr);
	}

	public void setReturnPrecision(Decoration precision) {
		Main.Function_setReturnPrecision(ptr, precision);
	}

	public Decoration getReturnPrecision() {
		return Decoration.valueByConstant(Main.Function_getReturnPrecision(ptr));
	}

	public void setImplicitThis() {
		Main.Function_setImplicitThis(ptr);
	}

	public boolean hasImplicitThis() {
		return Main.Function_hasImplicitThis(ptr);
	}

	public void addParamPrecision(long param, Decoration precision) {
		Main.Function_addParamPrecision(ptr, param, precision);
	}

	public Decoration getParamPrecision(long param) {
		return Decoration.valueByConstant(Main.Function_getParamPrecision(ptr, param));
	}

	public void dump(long[][] out) {
		Main.Function_dump(ptr, out);
	}

}