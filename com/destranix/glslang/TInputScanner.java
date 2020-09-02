package com.destranix.glslang;

public class TInputScanner extends PointerBoundObject {

	private final int n;
	private final String[] s;
	private final long[] L;
	private final String[] names;
	private final int b;
	private final int f;
	private final boolean single;
	private final int constructorIndex;

	public TInputScanner(int n, String[] s, long[] L) {
		this.n = n;
		this.s = s;
		this.L = L;
		this.names = null;
		this.b = 0;
		this.f = 0;
		this.single = false;
		this.constructorIndex = 0;
		load();
	}

	public TInputScanner(int n, String[] s, long[] L, String[] names) {
		this.n = n;
		this.s = s;
		this.L = L;
		this.names = names;
		this.b = 0;
		this.f = 0;
		this.single = false;
		this.constructorIndex = 0;
		load();
	}

	public TInputScanner(int n, String[] s, long[] L, String[] names, int b) {
		this.n = n;
		this.s = s;
		this.L = L;
		this.names = names;
		this.b = b;
		this.f = 0;
		this.single = false;
		this.constructorIndex = 0;
		load();
	}

	public TInputScanner(int n, String[] s, long[] L, String[] names, int b, int f) {
		this.n = n;
		this.s = s;
		this.L = L;
		this.names = names;
		this.b = b;
		this.f = f;
		this.single = false;
		this.constructorIndex = 0;
		load();
	}

	public TInputScanner(int n, String[] s, long[] L, String[] names, int b, int f, boolean single) {
		this.n = n;
		this.s = s;
		this.L = L;
		this.names = names;
		this.b = b;
		this.f = f;
		this.single = single;
		this.constructorIndex = 0;
		load();
	}

	protected TInputScanner(byte[] ptr) {
		this.ptr = ptr;
		this.n = -1;
		this.s = null;
		this.L = null;
		this.names = null;
		this.b = -1;
		this.f = -1;
		this.single = false;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TInputScanner(n, s, L, names, b, f, single);
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

	public int get() {
		return Main.TInputScanner_get(ptr);
	}

	public int peek() {
		return Main.TInputScanner_peek(ptr);
	}

	public void unget() {
		Main.TInputScanner_unget(ptr);
	}

	public void setLine(int newLine) {
		Main.TInputScanner_setLine(ptr, newLine);
	}

	public void setFile(String filename) {
		Main.TInputScanner_setFile(ptr, filename);
	}

	public void setFile(String filename, int i) {
		Main.TInputScanner_setFile(ptr, filename, i);
	}

	public void setString(int newString) {
		Main.TInputScanner_setString(ptr, newString);
	}

	public void setColumn(int col) {
		Main.TInputScanner_setColumn(ptr, col);
	}

	public void setEndOfInput() {
		Main.TInputScanner_setEndOfInput(ptr);
	}

	public boolean atEndOfInput() {
		return Main.TInputScanner_atEndOfInput(ptr);
	}

	public TSourceLoc getSourceLoc() {
		return fromPtr(Main.TInputScanner_getSourceLoc(ptr), TSourceLoc.class);
	}

	public int getLastValidSourceIndex() {
		return Main.TInputScanner_getLastValidSourceIndex(ptr);
	}

	public void consumeWhiteSpace(boolean foundNonSpaceTab) {
		Main.TInputScanner_consumeWhiteSpace(ptr, foundNonSpaceTab);
	}

	public boolean consumeComment() {
		return Main.TInputScanner_consumeComment(ptr);
	}

	public void consumeWhitespaceComment(boolean foundNonSpaceTab) {
		Main.TInputScanner_consumeWhitespaceComment(ptr, foundNonSpaceTab);
	}

	public boolean scanVersion(int version, EProfile profile, boolean notFirstToken) {
		return Main.TInputScanner_scanVersion(ptr, version, profile, notFirstToken);
	}

}
