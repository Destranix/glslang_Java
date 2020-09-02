package com.destranix.glslang;

public class TIoMapper extends PointerBoundObject {

	private final int constructorIndex;

	public TIoMapper() {
		this.constructorIndex = 0;
		load();
	}

	protected TIoMapper(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected TIoMapper(byte[] ptr) {
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
					ptr = Main.TIoMapper();
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

	public boolean addStage(EShLanguage language, TIntermediate intermediate, TInfoSink sink, TIoMapResolver resolver) {
		return Main.TIoMapper_addStage(ptr, language, intermediate.getPtr(), sink.getPtr(), resolver.getPtr());
	}

	public boolean doMap(TIoMapResolver resolver, TInfoSink sink) {
		return Main.TIoMapper_doMap(ptr, resolver.getPtr(), sink.getPtr());
	}

}
