package com.destranix.glslang;

public class TGlslIoMapper extends TIoMapper {

	private final int constructorIndex;

	public TGlslIoMapper() {
		super(PoisonClass.singleton);
		this.constructorIndex = 0;
		load();
	}

	protected TGlslIoMapper(byte[] ptr) {
		super(ptr);
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TGlslIoMapper();
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

	@Override
	public boolean addStage(EShLanguage language, TIntermediate intermediate, TInfoSink sink, TIoMapResolver resolver) {
		return Main.TGlslIoMapper_addStage(ptr, language, intermediate.getPtr(), sink.getPtr(), resolver.getPtr());
	}

	@Override
	public boolean doMap(TIoMapResolver resolver, TInfoSink sink) {
		return Main.TGlslIoMapper_doMap(ptr, resolver.getPtr(), sink.getPtr());
	}

	public void setInVarMaps(CMap<TString, TVarEntryInfo>[] v) {
		byte[][] vPtrs = null;
		if (v != null) {
			vPtrs = new byte[v.length][];
			for (int i = 0; i < v.length; ++i) {
				vPtrs[i] = v[i].getPtr();
			}
		}
		byte[] array = Main.createArray(vPtrs);
		Main.TGlslIoMapper_setInVarMaps(ptr, array);
		Main.delete(array);
	}

	public void setOutVarMaps(CMap<TString, TVarEntryInfo>[] v) {
		byte[][] vPtrs = null;
		if (v != null) {
			vPtrs = new byte[v.length][];
			for (int i = 0; i < v.length; ++i) {
				vPtrs[i] = v[i].getPtr();
			}
		}
		byte[] array = Main.createArray(vPtrs);
		Main.TGlslIoMapper_setOutVarMaps(ptr, array);
		Main.delete(array);
	}

	public void setUniformVarMap(CMap<TString, TVarEntryInfo>[] v) {
		byte[][] vPtrs = null;
		if (v != null) {
			vPtrs = new byte[v.length][];
			for (int i = 0; i < v.length; ++i) {
				vPtrs[i] = v[i].getPtr();
			}
		}
		byte[] array = Main.createArray(vPtrs);
		Main.TGlslIoMapper_setUniformVarMap(ptr, array);
		Main.delete(array);
	}

	public void setIntermediates(TIntermediate[] v) {
		byte[][] vPtrs = null;
		if (v != null) {
			vPtrs = new byte[v.length][];
			for (int i = 0; i < v.length; ++i) {
				vPtrs[i] = v[i].getPtr();
			}
		}
		byte[] array = Main.createArray(vPtrs);
		Main.TGlslIoMapper_setIntermediates(ptr, array);
		Main.delete(array);
	}

	public void setHadError(boolean v) {
		Main.TGlslIoMapper_setHadError(ptr, v);
	}

	public CMap<TString, TVarEntryInfo>[] getInVarMaps() {
		byte[] array = Main.TGlslIoMapper_getInVarMaps(ptr);
		int size = Main.Array_size(array);
		@SuppressWarnings("unchecked") // Is checked
		CMap<TString, TVarEntryInfo>[] ret = (CMap<TString, TVarEntryInfo>[]) new CMap[size];
		for (int i = 0; i < size; ++i) {
			@SuppressWarnings("unchecked") // Is checked
			CMap<TString, TVarEntryInfo> tmp = (CMap<TString, TVarEntryInfo>) fromPtr(Main.Array_get(array, i),
					CMap.class);
			ret[i] = tmp;
		}
		Main.delete(array);
		return ret;
	}

	public CMap<TString, TVarEntryInfo>[] getOutVarMaps() {
		byte[] array = Main.TGlslIoMapper_getOutVarMaps(ptr);
		int size = Main.Array_size(array);
		@SuppressWarnings("unchecked") // Is checked
		CMap<TString, TVarEntryInfo>[] ret = (CMap<TString, TVarEntryInfo>[]) new CMap[size];
		for (int i = 0; i < size; ++i) {
			@SuppressWarnings("unchecked") // Is checked
			CMap<TString, TVarEntryInfo> tmp = (CMap<TString, TVarEntryInfo>) fromPtr(Main.Array_get(array, i),
					CMap.class);
			ret[i] = tmp;
		}
		Main.delete(array);
		return ret;
	}

	public CMap<TString, TVarEntryInfo>[] getUniformVarMap() {
		byte[] array = Main.TGlslIoMapper_getUniformVarMap(ptr);
		int size = Main.Array_size(array);
		@SuppressWarnings("unchecked") // Is checked
		CMap<TString, TVarEntryInfo>[] ret = (CMap<TString, TVarEntryInfo>[]) new CMap[size];
		for (int i = 0; i < size; ++i) {
			@SuppressWarnings("unchecked") // Is checked
			CMap<TString, TVarEntryInfo> tmp = (CMap<TString, TVarEntryInfo>) fromPtr(Main.Array_get(array, i),
					CMap.class);
			ret[i] = tmp;
		}
		Main.delete(array);
		return ret;
	}

	public TIntermediate[] getIntermediates() {
		byte[] array = Main.TGlslIoMapper_getIntermediates(ptr);
		int size = Main.Array_size(array);
		TIntermediate[] ret = new TIntermediate[size];
		for (int i = 0; i < size; ++i) {
			ret[i] = fromPtr(Main.Array_get(array, i), TIntermediate.class);
		}
		Main.delete(array);
		return ret;
	}

	public boolean getHadError() {
		return Main.TGlslIoMapper_getHadError(ptr);
	}

}
