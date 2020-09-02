package com.destranix.glslang;

public class HlslTokenStream extends PointerBoundObject {

	private final HlslScanContext scanner;
	private final int constructorIndex;

	public HlslTokenStream(HlslScanContext scanner) {
		this.scanner = scanner;
		this.constructorIndex = 0;
		load();
	}

	protected HlslTokenStream(PoisonClass p) {
		this.scanner = null;
		this.constructorIndex = -1;
	}

	protected HlslTokenStream(byte[] ptr) {
		this.ptr = ptr;
		this.scanner = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.HlslTokenStream(scanner.getPtr());
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

	public void advanceToken() {
		Main.HlslTokenStream_advanceToken(ptr);
	}

	public void recedeToken() {
		Main.HlslTokenStream_recedeToken(ptr);
	}

	public boolean acceptTokenClass(EHlslTokenClass tokenClass) {
		return Main.HlslTokenStream_acceptTokenClass(ptr, tokenClass);
	}

	public EHlslTokenClass peek() {
		return EHlslTokenClass.valueByConstant(Main.HlslTokenStream_peek(ptr));
	}

	public boolean peekTokenClass(EHlslTokenClass tokenClass) {
		return Main.HlslTokenStream_peekTokenClass(ptr, tokenClass);
	}

	public TBuiltInVariable mapSemantic(String upperCase) {
		return TBuiltInVariable.valueByConstant(Main.HlslTokenStream_mapSemantic(ptr, upperCase));
	}

	public void pushTokenStream(TVector<HlslToken> tokens) {
		Main.HlslTokenStream_pushTokenStream(ptr, tokens.getPtr());
	}

	public void popTokenStream() {
		Main.HlslTokenStream_popTokenStream(ptr);
	}

}
