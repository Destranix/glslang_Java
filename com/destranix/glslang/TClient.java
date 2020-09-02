package com.destranix.glslang;

public class TClient extends PointerBoundObject {

	private final EShClient client;
	private final EShTargetClientVersion version;
	private final int constructorIndex;

	public TClient() {
		this.client = null;
		this.version = null;
		this.constructorIndex = 0;
		load();
	}

	public TClient(EShClient client, EShTargetClientVersion version) {
		this.client = client;
		this.version = version;
		this.constructorIndex = 1;
		load();
	}

	protected TClient(byte[] ptr) {
		this.ptr = ptr;
		this.client = null;
		this.version = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TClient();
					break;
				case 1:
					ptr = Main.TClient(client, version);
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

	public void setClient(EShClient v) {
		Main.TClient_setClient(ptr, v.getConstant());
	}

	public void setVersion(EShTargetClientVersion v) {
		Main.TClient_setVersion(ptr, v.getConstant());
	}

	public EShClient getClient() {
		return EShClient.valueByConstant(Main.TClient_getClient(ptr));
	}

	public EShTargetClientVersion getVersion() {
		return EShTargetClientVersion.valueByConstant(Main.TClient_getVersion(ptr));
	}

}
