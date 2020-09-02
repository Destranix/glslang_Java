package com.destranix.glslang;

public class TLimits extends PointerBoundObject {

	private boolean[] values;
	private final int constructorIndex;

	public TLimits() {
		this.values = null;
		this.constructorIndex = 0;
		load();
	}

	public TLimits(Values values) {
		this.values = values.asBooleanArray();
		this.constructorIndex = 1;
		load();
	}

	public TLimits(boolean[] values) {
		this.values = values;
		this.constructorIndex = 1;
		load();
	}

	protected TLimits(byte[] ptr) {
		this.ptr = ptr;
		this.values = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TLimits();
					break;
				case 1:
					ptr = Main.TLimits(values);
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

	public static class Values {
		public boolean nonInductiveForLoops = true;
		public boolean whileLoops = true;
		public boolean doWhileLoops = true;
		public boolean generalUniformIndexing = true;
		public boolean generalAttributeMatrixVectorIndexing = true;
		public boolean generalVaryingIndexing = true;
		public boolean generalSamplerIndexing = true;
		public boolean generalVariableIndexing = true;
		public boolean generalConstantMatrixVectorIndexing = true;

		public boolean[] asBooleanArray() {
			boolean[] ret = new boolean[9];
			int i = 0;
			ret[i++] = nonInductiveForLoops;
			ret[i++] = whileLoops;
			ret[i++] = doWhileLoops;
			ret[i++] = generalUniformIndexing;
			ret[i++] = generalAttributeMatrixVectorIndexing;
			ret[i++] = generalVaryingIndexing;
			ret[i++] = generalSamplerIndexing;
			ret[i++] = generalVariableIndexing;
			ret[i++] = generalConstantMatrixVectorIndexing;

			return ret;
		}
	}
}
