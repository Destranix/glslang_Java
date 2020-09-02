package Java;

import Java.Main.Void_String;

public class spirvbin_t extends PointerBoundObject {

	protected final int verbose;
	private final int constructorIndex;

	public spirvbin_t() {
		this.verbose = 0;
		this.constructorIndex = 0;
		load();
	}

	public spirvbin_t(int verbose) {
		this.verbose = verbose;
		this.constructorIndex = 0;
		load();
	}

	protected spirvbin_t(byte[] ptr) {
		this.ptr = ptr;
		this.verbose = 0;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.spirvbin_t(verbose);
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

	public void remap(long[] spv) {
		Main.spirvbin_t_remap(ptr, spv);
	}

	public void remap(long[] spv, long opts) {
		Main.spirvbin_t_remap(ptr, spv, opts);
	}

	public static void registerErrorHandler(Void_String handler) {
		Main.spirvbin_t_registerErrorHandler(handler);
	}

	public static void registerLogHandler(Void_String handler) {
		Main.spirvbin_t_registerLogHandler(handler);
	}

}