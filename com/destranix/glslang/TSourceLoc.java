package com.destranix.glslang;

public class TSourceLoc extends PointerBoundObject {

	private final String name;
	private final int string;
	private final int line;
	private final int column;
	private final int constructorIndex;

	public TSourceLoc() {
		this.name = null;
		this.string = -1;
		this.line = -1;
		this.column = -1;
		this.constructorIndex = 0;
		load();
	}

	public TSourceLoc(String name, int string, int line, int column) {
		this.name = name;
		this.string = string;
		this.line = line;
		this.column = column;
		this.constructorIndex = 1;
		load();
	}

	protected TSourceLoc(byte[] ptr) {
		this.ptr = ptr;
		this.name = null;
		this.string = -1;
		this.line = -1;
		this.column = -1;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TSourceLoc();
					break;
				case 1:
					ptr = Main.TSourceLoc(name, string, line, column);
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

	public void init() {
		Main.TSourceLoc_init(ptr);
	}

	public void init(int stringNum) {
		Main.TSourceLoc_init(ptr, stringNum);
	}

	public String getStringNameOrNum() {
		return Main.TSourceLoc_getStringNameOrNum(ptr);
	}

	public String getStringNameOrNum(boolean quoteStringName) {
		return Main.TSourceLoc_getStringNameOrNum(ptr, quoteStringName);
	}

	public String getFilename() {
		return Main.TSourceLoc_getFilename(ptr);
	}

	public String getFilenameStr() {
		return Main.TSourceLoc_getFilenameStr(ptr);
	}

	public void setName(String name) {
		Main.TSourceLoc_setName(ptr, name);
	}

	public void setString(int string) {
		Main.TSourceLoc_setString(ptr, string);
	}

	public void setLine(int line) {
		Main.TSourceLoc_setLine(ptr, line);
	}

	public void setColumn(int column) {
		Main.TSourceLoc_setColumn(ptr, column);
	}

	public String getName() {
		return Main.TSourceLoc_getName(ptr);
	}

	public int getString() {
		return Main.TSourceLoc_getString(ptr);
	}

	public int getLine() {
		return Main.TSourceLoc_getLine(ptr);
	}

	public int getColumn() {
		return Main.TSourceLoc_getColumn(ptr);
	}
}
