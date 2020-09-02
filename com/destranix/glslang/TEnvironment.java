package com.destranix.glslang;

public class TEnvironment extends PointerBoundObject {

	private final TInputLanguage input;
	private final TClient client;
	private final TTarget target;
	private final int constructorIndex;

	public TEnvironment() {
		this.input = null;
		this.client = null;
		this.target = null;
		this.constructorIndex = 0;
		load();
	}

	public TEnvironment(TInputLanguage input, TClient client, TTarget target) {
		this.input = input;
		this.client = client;
		this.target = target;
		this.constructorIndex = 1;
		load();
	}

	protected TEnvironment(byte[] ptr) {
		this.ptr = ptr;
		this.input = null;
		this.client = null;
		this.target = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TEnvironment();
					break;
				case 1:
					ptr = Main.TEnvironment(input.getPtr(), client.getPtr(), target.getPtr());
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

	public void setInput(TInputLanguage v) {
		Main.TEnvironment_setInput(ptr, v.getPtr());
	}

	public void setClient(TClient v) {
		Main.TEnvironment_setClient(ptr, v.getPtr());
	}

	public void setTarget(TTarget v) {
		Main.TEnvironment_setTarget(ptr, v.getPtr());
	}

	public TInputLanguage getInput() {
		return fromPtr(Main.TEnvironment_getInput(ptr), TInputLanguage.class);
	}

	public TClient getClient() {
		return fromPtr(Main.TEnvironment_getClient(ptr), TClient.class);
	}

	public TTarget getTarget() {
		return fromPtr(Main.TEnvironment_getTarget(ptr), TTarget.class);
	}

}
