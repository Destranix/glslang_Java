package com.destranix.glslang;

public class HlslGrammar extends HlslTokenStream {

	private final HlslScanContext scanner;
	private final HlslParseContext parseContext;
	private final int constructorIndex;

	public HlslGrammar(HlslScanContext scanner, HlslParseContext parseContext) {
		super(PoisonClass.singleton);
		this.scanner = scanner;
		this.parseContext = parseContext;
		this.constructorIndex = 0;
		load();
	}

	protected HlslGrammar(byte[] ptr) {
		super(ptr);
		this.scanner = null;
		this.parseContext = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.HlslGrammar(scanner.getPtr(), parseContext.getPtr());
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

	public boolean parse() {
		return Main.HlslGrammar_parse(ptr);
	}

}
