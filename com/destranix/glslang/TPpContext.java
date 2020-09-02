package com.destranix.glslang;

public class TPpContext extends PointerBoundObject {

	private final TParseContextBase contextBase;
	private final String rootFileName;
	private final TShader.Includer includer;
	private final int constructorIndex;

	public TPpContext(TParseContextBase contextBase, String rootFileName, TShader.Includer includer) {
		this.contextBase = contextBase;
		this.rootFileName = rootFileName;
		this.includer = includer;
		this.constructorIndex = 0;
		load();
	}

	protected TPpContext(byte[] ptr) {
		this.ptr = ptr;
		this.contextBase = null;
		this.rootFileName = null;
		this.includer = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TPpContext(contextBase.getPtr(), rootFileName, includer.getPtr());
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

	public void setPreamble(String preamble) {
		Main.TPpContext_setPreamble(ptr, preamble);
	}

	public int tokenize(TPpToken ppToken) {
		return Main.TPpContext_tokenize(ptr, ppToken.getPtr());
	}

	public int tokenPaste(int token, TPpToken ppToken) {
		return Main.TPpContext_tokenPaste(ptr, token, ppToken.getPtr());
	}

	public void setInput(TInputScanner input, boolean versionWillBeError) {
		Main.TPpContext_setInput(ptr, input.getPtr(), versionWillBeError);
	}

	public void pushInput(tInput in) {
		Main.TPpContext_pushInput(ptr, in.getPtr());
	}

	public void popInput() {
		Main.TPpContext_popInput(ptr);
	}

	public void setMacroDefs(IntKeyedCMap<MacroSymbol> v) {
		Main.TPpContext_setMacroDefs(ptr, v.getPtr());
	}

	public IntKeyedCMap<MacroSymbol> getMacroDefs() {
		@SuppressWarnings("unchecked") // Is checked
		IntKeyedCMap<MacroSymbol> tmp = (IntKeyedCMap<MacroSymbol>) fromPtr(Main.TPpContext_getMacroDefs(ptr),
				IntKeyedCMap.class);
		return tmp;
	}

	public MacroSymbol lookupMacroDef(int atom) {
		return fromPtr(Main.TPpContext_lookupMacroDef(ptr, atom), MacroSymbol.class);
	}

	public void addMacroDef(int atom, MacroSymbol macroDef) {
		Main.TPpContext_addMacroDef(ptr, atom, macroDef.getPtr());
	}

	public static abstract class tInput extends PointerBoundObject {

		private final int constructorIndex;

		protected tInput(byte[] ptr) {
			this.ptr = ptr;
			this.constructorIndex = -1;
		}

		@Override
		protected void load_intern() {
			if (ptr == null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
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
					default:
						throw new AssertionError("Reached unreachable state!");
				}
			}
		}

		public int scan(TPpToken ppToken) {
			return Main.TPpContext_tInput_scan(ptr, ppToken.getPtr());
		}

		public int getch() {
			return Main.TPpContext_tInput_getch(ptr);
		}

		public void ungetch() {
			Main.TPpContext_tInput_ungetch(ptr);
		}

		public boolean peekPasting() {
			return Main.TPpContext_tInput_peekPasting(ptr);
		}

		public boolean peekContinuedPasting(int i) {
			return Main.TPpContext_tInput_peekContinuedPasting(ptr, i);
		}

		public boolean endOfReplacementList() {
			return Main.TPpContext_tInput_endOfReplacementList(ptr);
		}

		public boolean isMacroInput() {
			return Main.TPpContext_tInput_isMacroInput(ptr);
		}

		public void notifyActivated() {
			Main.TPpContext_tInput_notifyActivated(ptr);
		}

		public void notifyDeleted() {
			Main.TPpContext_tInput_notifyDeleted(ptr);
		}

	}

	public static class TokenStream extends PointerBoundObject {

		private final int constructorIndex;

		public TokenStream() {
			this.constructorIndex = 0;
			load();
		}

		protected TokenStream(byte[] ptr) {
			this.ptr = ptr;
			this.constructorIndex = -1;
		}

		@Override
		protected void load_intern() {
			if (ptr == null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
					case 0:
						ptr = Main.TPpContext_TokenStream();
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

		public void putToken(int token, TPpToken ppToken) {
			Main.TPpContext_TokenStream_putToken(ptr, token, ppToken.getPtr());
		}

		public boolean peekToken(int atom) {
			return Main.TPpContext_TokenStream_peekToken(ptr, atom);
		}

		public boolean peekContinuedPasting(int atom) {
			return Main.TPpContext_TokenStream_peekContinuedPasting(ptr, atom);
		}

		public int getToken(TParseContextBase contextBase, TPpToken ppToken) {
			return Main.TPpContext_TokenStream_getToken(ptr, contextBase.getPtr(), ppToken.getPtr());
		}

		public boolean atEnd() {
			return Main.TPpContext_TokenStream_atEnd(ptr);
		}

		public boolean peekTokenizedPasting(boolean lastTokenPastes) {
			return Main.TPpContext_TokenStream_peekTokenizedPasting(ptr, lastTokenPastes);
		}

		public boolean peekUntokenizedPasting() {
			return Main.TPpContext_TokenStream_peekUntokenizedPasting(ptr);
		}

		public void reset() {
			Main.TPpContext_TokenStream_reset(ptr);
		}

		public static class Token extends PointerBoundObject {

			private final int atom;
			private final TPpToken ppToken;
			private final int constructorIndex;

			public Token(int atom, TPpToken ppToken) {
				this.atom = atom;
				this.ppToken = ppToken;
				this.constructorIndex = 0;
				load();
			}

			protected Token(byte[] ptr) {
				this.ptr = ptr;
				this.atom = -1;
				this.ppToken = null;
				this.constructorIndex = -1;
			}

			@Override
			protected void load_intern() {
				if (ptr == null) {
					switch (constructorIndex) {
						case -1:
							throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
						case 0:
							ptr = Main.TPpContext_TokenStream_Token(atom, ppToken.getPtr());
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

			public int get(TPpToken ppToken) {
				return Main.TPpContext_TokenStream_Token_get(ptr, ppToken.getPtr());
			}

			public boolean isAtom(int a) {
				return Main.TPpContext_TokenStream_Token_isAtom(ptr, a);
			}

			public int getAtom() {
				return Main.TPpContext_TokenStream_Token_getAtom(ptr);
			}

			public boolean nonSpaced() {
				return Main.TPpContext_TokenStream_Token_nonSpaced(ptr);
			}

		}

	}

	public static class MacroSymbol extends PointerBoundObject {

		private final int constructorIndex;

		public MacroSymbol() {
			this.constructorIndex = 0;
			load();
		}

		protected MacroSymbol(byte[] ptr) {
			this.ptr = ptr;
			this.constructorIndex = -1;
		}

		@Override
		protected void load_intern() {
			if (ptr == null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
					case 0:
						ptr = Main.TPpContext_MacroSymbol();
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

		public void setArgs(int[] v) {
			Main.TPpContext_MacroSymbol_setArgs(ptr, v);
		}

		public void setBody(TokenStream v) {
			Main.TPpContext_MacroSymbol_setBody(ptr, v.getPtr());
		}

		public void setFunctionLike(long v) {
			Main.TPpContext_MacroSymbol_setFunctionLike(ptr, v);
		}

		public void setBusy(long v) {
			Main.TPpContext_MacroSymbol_setBusy(ptr, v);
		}

		public void setUndef(long v) {
			Main.TPpContext_MacroSymbol_setUndef(ptr, v);
		}

		public int[] getArgs() {
			return Main.TPpContext_MacroSymbol_getArgs(ptr);
		}

		public TokenStream getBody() {
			return fromPtr(Main.TPpContext_MacroSymbol_getBody(ptr), TokenStream.class);
		}

		public long getFunctionLike() {
			return Main.TPpContext_MacroSymbol_getFunctionLike(ptr);
		}

		public long getBusy() {
			return Main.TPpContext_MacroSymbol_getBusy(ptr);
		}

		public long getUndef() {
			return Main.TPpContext_MacroSymbol_getUndef(ptr);
		}

	}

}
