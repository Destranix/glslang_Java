package Java;

public class Binding extends PointerBoundObject {

	private final String name;
	private final int binding;
	private final int constructorIndex;

	public Binding() {
		this.name = null;
		this.binding = -1;
		this.constructorIndex = 0;
		load();
	}

	public Binding(String name, int binding) {
		this.name = name;
		this.binding = binding;
		this.constructorIndex = 1;
		load();
	}

	protected Binding(byte[] ptr) {
		this.ptr = ptr;
		this.name = null;
		this.binding = -1;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.ShBinding();
					break;
				case 1:
					ptr = Main.ShBinding(name, binding);
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

	public void setName(String v) {
		Main.ShBinding_setName(ptr, v);
	}

	public void setBinding(int v) {
		Main.ShBinding_setBinding(ptr, v);
	}

	public String getName() {
		return Main.ShBinding_getName(ptr);
	}

	public int getBinding() {
		return Main.ShBinding_getBinding(ptr);
	}

}
