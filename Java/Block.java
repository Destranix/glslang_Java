package Java;

public class Block extends PointerBoundObject {

	protected final long id;
	protected final Function parent;
	private final int constructorIndex;

	public Block(long id, Function parent) {
		this.id = id;
		this.parent = parent;
		this.constructorIndex = 0;
		load();
	}

	protected Block(byte[] ptr) {
		this.ptr = ptr;
		this.id = -1;
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
					ptr = Main.Block(id, parent.getPtr());
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
		return Main.Block_getId(ptr);
	}

	public Function getParent() {
		return fromPtr(Main.Block_getParent(ptr), Function.class);
	}

	public void addInstruction(Instruction inst) {
		Main.Block_addInstruction(ptr, inst.getPtr());
	}

	public void addPredecessor(Block pred) {
		Main.Block_addPredecessor(ptr, pred.getPtr());
	}

	public void addLocalVariable(Instruction inst) {
		Main.Block_addLocalVariable(ptr, inst.getPtr());
	}

	public CVector<Block> getPredecessors() {
		@SuppressWarnings("unchecked")
		CVector<Block> ret = (CVector<Block>) fromPtr(Main.Block_getPredecessors(ptr), CVector.class);
		return ret;
	}

	public CVector<Block> getSuccessors() {
		@SuppressWarnings("unchecked")
		CVector<Block> ret = (CVector<Block>) fromPtr(Main.Block_getSuccessors(ptr), CVector.class);
		return ret;
	}

	public CVector<Instruction> getInstructions() {
		@SuppressWarnings("unchecked")
		CVector<Instruction> ret = (CVector<Instruction>) fromPtr(Main.Block_getInstructions(ptr), CVector.class);
		return ret;
	}

	public CVector<Instruction> getLocalVariables() {
		@SuppressWarnings("unchecked")
		CVector<Instruction> ret = (CVector<Instruction>) fromPtr(Main.Block_getLocalVariables(ptr), CVector.class);
		return ret;
	}

	public void setUnreachable() {
		Main.Block_setUnreachable(ptr);
	}

	public boolean isUnreachable() {
		return Main.Block_isUnreachable(ptr);
	}

	public Instruction getMergeInstruction() {
		return fromPtr(Main.Block_getMergeInstruction(ptr), Instruction.class);
	}

	public void rewriteAsCanonicalUnreachableMerge() {
		Main.Block_rewriteAsCanonicalUnreachableMerge(ptr);
	}

	public void rewriteAsCanonicalUnreachableContinue(Block header) {
		Main.Block_rewriteAsCanonicalUnreachableContinue(ptr, header.getPtr());
	}

	public boolean isTerminated() {
		return Main.Block_isTerminated(ptr);
	}

	public void dump(long[][] out) {
		Main.Block_dump(ptr, out);
	}

}
