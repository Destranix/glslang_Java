package Java;

public class BindingTable extends PointerBoundObject {

	private byte[] bindingsPtr;

	private final Binding[] bindings;
	private final int constructorIndex;

	public BindingTable() {
		this.bindings = null;
		this.constructorIndex = 0;
		load();
	}

	public BindingTable(Binding[] bindings) {
		this.bindings = bindings;
		this.constructorIndex = 1;
		load();
	}

	protected BindingTable(byte[] ptr) {
		this.ptr = ptr;
		this.bindings = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.ShBindingTable();
					break;
				case 1:
					byte[][] bindingsPtrArray = new byte[bindings.length][];
					for (int i = 0; i < bindings.length; ++i) {
						bindingsPtrArray[i] = bindings[i].getPtr();
					}
					this.bindingsPtr = Main.createArray(bindingsPtrArray);
					ptr = Main.ShBindingTable(bindings.length, bindingsPtr);
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
					if (bindingsPtr != null) {
						Main.delete(bindingsPtr);
					}
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public void setNumBindings(int v) {
		Main.ShBindingTable_setNumBindings(ptr, v);
	}

	public void setBindings(Binding v) {
		Main.ShBindingTable_setBindings(ptr, v.getPtr());
	}

	public int getNumBindings() {
		return Main.ShBindingTable_getNumBindings(ptr);
	}

	public Binding getBindings() {
		return fromPtr(Main.ShBindingTable_getBindings(ptr), Binding.class);
	}

}
