package com.destranix.glslang;

public class Linker extends PointerBoundObject {

	private final EShExecutable language;
	private final int debugOptions;
	private final int constructorIndex;

	public Linker(EShExecutable language, int debugOptions) {
		this.language = language;
		this.debugOptions = debugOptions;
		this.constructorIndex = 0;
		load();
	}

	protected Linker(byte[] ptr) {
		this.ptr = ptr;
		this.language = null;
		this.debugOptions = -1;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.ShConstructLinker(language, debugOptions);
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
					Main.ShDestruct(ptr);
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public int linkExt(Compiler[] h) {
		byte[][] hPtrArray = new byte[h.length][];
		for (int i = 0; i < h.length; ++i) {
			hPtrArray[i] = h[i].getPtr();
		}
		byte[] hPtr = Main.createArray(hPtrArray);
		int ret = Main.ShLinkExt(ptr, hPtr, h.length);
		Main.delete(hPtr);
		return ret;
	}

	public String getInfoLog() {
		return Main.ShGetInfoLog(ptr);
	}

	public byte[] getExecutable() {
		return Main.ShGetExecutable(ptr);
	}

	public int setVirtualAttributeBindings(BindingTable table) {
		return Main.ShSetVirtualAttributeBindings(ptr, table.getPtr());
	}

	public int setFixedAttributeBindings(BindingTable table) {
		return Main.ShSetFixedAttributeBindings(ptr, table.getPtr());
	}

	public int excludeAttributes(int[] attributes) {
		return Main.ShExcludeAttributes(ptr, attributes);
	}

}
