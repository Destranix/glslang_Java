package com.destranix.glslang;

public class HlslScanContext extends PointerBoundObject {

	private final TParseContextBase parseContext;
	private final TPpContext ppContext;
	private final int constructorIndex;

	public HlslScanContext(TParseContextBase parseContext, TPpContext ppContext) {
		this.parseContext = parseContext;
		this.ppContext = ppContext;
		this.constructorIndex = 0;
		load();
	}

	protected HlslScanContext(byte[] ptr) {
		this.ptr = ptr;
		this.parseContext = null;
		this.ppContext = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.HlslScanContext(parseContext.getPtr(), ppContext.getPtr());
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

	public void tokenize(HlslToken token) {
		Main.HlslScanContext_tokenize(ptr, token.getPtr());
	}

	public TBuiltInVariable mapSemantic(String s) {
		return TBuiltInVariable.valueByConstant(Main.HlslScanContext_mapSemantic(ptr, s));
	}

	public static void fillInKeywordMap() {
		Main.HlslScanContext_fillInKeywordMap();
	}

	public static void deleteKeywordMap() {
		Main.HlslScanContext_deleteKeywordMap();
	}

}
