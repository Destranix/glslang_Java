package com.destranix.glslang;

public class TScanContext extends PointerBoundObject {

	private final TParseContextBase pc;
	private final int constructorIndex;

	public TScanContext(TParseContextBase pc) {
		this.pc = pc;
		this.constructorIndex = 0;
		load();
	}

	protected TScanContext(byte[] ptr) {
		this.ptr = ptr;
		this.pc = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TScanContext(pc.getPtr());
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

	// public int tokenize(TPpContext context, TParserToken token){
	// return Main.TScanContext_tokenize(ptr, context.getPtr(), token.getPtr());
	// }

	public static void fillInKeywordMap() {
		Main.TScanContext_fillInKeywordMap();
	}

	public static void deleteKeywordMap() {
		Main.TScanContext_deleteKeywordMap();
	}

}
