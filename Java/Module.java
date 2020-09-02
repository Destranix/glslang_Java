package Java;

public class Module extends PointerBoundObject {

	private final int constructorIndex;

	public Module() {
		this.constructorIndex = 0;
		load();
	}

	protected Module(byte[] ptr) {
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
					ptr = Main.Module();
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

	public void addFunction(Function fun) {
		Main.Module_addFunction(ptr, fun.getPtr());
	}

	public void mapInstruction(Instruction instruction) {
		Main.Module_mapInstruction(ptr, instruction.getPtr());
	}

	public Instruction getInstruction(long id) {
		return fromPtr(Main.Module_getInstruction(ptr, id), Instruction.class);
	}

	public CVector<Function> getFunctions() {
		@SuppressWarnings("unchecked")
		CVector<Function> ret = (CVector<Function>) fromPtr(Main.Module_getFunctions(ptr), CVector.class);
		return ret;
	}

	public long getTypeId(long resultId) {
		return Main.Module_getTypeId(ptr, resultId);
	}

	public StorageClass getStorageClass(long typeId) {
		return StorageClass.valueByConstant(Main.Module_getStorageClass(ptr, typeId));
	}

	public void dump(long[][] out) {
		Main.Module_dump(ptr, out);
	}

}