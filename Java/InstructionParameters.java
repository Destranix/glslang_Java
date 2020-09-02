package Java;

public class InstructionParameters extends PointerBoundObject {

	private final int constructorIndex;

	public InstructionParameters() {
		this.constructorIndex = 0;
		load();
	}

	protected InstructionParameters(byte[] ptr) {
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
					ptr = Main.InstructionParameters();
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

	public void setResultAndType(boolean r, boolean t) {
		Main.InstructionParameters_setResultAndType(ptr, r, t);
	}

	public boolean hasResult() {
		return Main.InstructionParameters_hasResult(ptr);
	}

	public boolean hasType() {
		return Main.InstructionParameters_hasType(ptr);
	}

	public void setOpDesc(String v) {
		Main.InstructionParameters_setOpDesc(ptr, v);
	}

	public void setOpClass(OperandClass v) {
		Main.InstructionParameters_setOpClass(ptr, v.getConstant());
	}

	public void setOperands(OperandParameters v) {
		Main.InstructionParameters_setOperands(ptr, v.getPtr());
	}

	public String getOpDesc() {
		return Main.InstructionParameters_getOpDesc(ptr);
	}

	public OperandClass getOpClass() {
		return OperandClass.valueByConstant(Main.InstructionParameters_getOpClass(ptr));
	}

	public OperandParameters getOperands() {
		return fromPtr(Main.InstructionParameters_getOperands(ptr), OperandParameters.class);
	}

}