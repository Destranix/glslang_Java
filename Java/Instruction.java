package Java;

public class Instruction extends PointerBoundObject {

	protected final long resultId;
	protected final long typeId;
	protected final Op opCode;
	private final int constructorIndex;

	public Instruction(long resultId, long typeId, Op opCode) {
		this.resultId = resultId;
		this.typeId = typeId;
		this.opCode = opCode;
		this.constructorIndex = 0;
		load();
	}

	public Instruction(Op opCode) {
		this.resultId = -1;
		this.typeId = -1;
		this.opCode = opCode;
		this.constructorIndex = 1;
		load();
	}

	protected Instruction(byte[] ptr) {
		this.ptr = ptr;
		this.resultId = -1;
		this.typeId = -1;
		this.opCode = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.Instruction(resultId, typeId, opCode);
					break;
				case 1:
					ptr = Main.Instruction(opCode);
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

	public void addIdOperand(long id) {
		Main.Instruction_addIdOperand(ptr, id);
	}

	public void addImmediateOperand(long immediate) {
		Main.Instruction_addImmediateOperand(ptr, immediate);
	}

	public void setImmediateOperand(long idx, long immediate) {
		Main.Instruction_setImmediateOperand(ptr, idx, immediate);
	}

	public void addStringOperand(String str) {
		Main.Instruction_addStringOperand(ptr, str);
	}

	public boolean isIdOperand(int op) {
		return Main.Instruction_isIdOperand(ptr, op);
	}

	public void setBlock(Block b) {
		Main.Instruction_setBlock(ptr, b.getPtr());
	}

	public Block getBlock() {
		return fromPtr(Main.Instruction_getBlock(ptr), Block.class);
	}

	public Op getOpCode() {
		return Op.valueByConstant(Main.Instruction_getOpCode(ptr));
	}

	public int getNumOperands() {
		return Main.Instruction_getNumOperands(ptr);
	}

	public long getResultId() {
		return Main.Instruction_getResultId(ptr);
	}

	public long getTypeId() {
		return Main.Instruction_getTypeId(ptr);
	}

	public long getIdOperand(int op) {
		return Main.Instruction_getIdOperand(ptr, op);
	}

	public long getImmediateOperand(int op) {
		return Main.Instruction_getImmediateOperand(ptr, op);
	}

	public void dump(long[][] out) {
		Main.Instruction_dump(ptr, out);
	}

}