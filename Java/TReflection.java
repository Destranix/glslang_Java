package Java;

import java.util.EnumSet;

public class TReflection extends PointerBoundObject {

	private final EnumSet<EShReflectionOptions> opts;
	private final EShLanguage first;
	private final EShLanguage last;
	private final int constructorIndex;

	public TReflection(EnumSet<EShReflectionOptions> opts, EShLanguage first, EShLanguage last) {
		this.opts = opts;
		this.first = first;
		this.last = last;
		this.constructorIndex = 0;
		load();
	}

	protected TReflection(byte[] ptr) {
		this.ptr = ptr;
		this.opts = null;
		this.first = null;
		this.last = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TReflection(opts, first, last);
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

	public boolean addStage(EShLanguage language, TIntermediate intermediate) {
		return Main.TReflection_addStage(ptr, language, intermediate.getPtr());
	}

	public int getNumUniforms() {
		return Main.TReflection_getNumUniforms(ptr);
	}

	public TObjectReflection getUniform(int i) {
		return fromPtr(Main.TReflection_getUniform(ptr, i), TObjectReflection.class);
	}

	public int getNumUniformBlocks() {
		return Main.TReflection_getNumUniformBlocks(ptr);
	}

	public TObjectReflection getUniformBlock(int i) {
		return fromPtr(Main.TReflection_getUniformBlock(ptr, i), TObjectReflection.class);
	}

	public int getNumPipeInputs() {
		return Main.TReflection_getNumPipeInputs(ptr);
	}

	public TObjectReflection getPipeInput(int i) {
		return fromPtr(Main.TReflection_getPipeInput(ptr, i), TObjectReflection.class);
	}

	public int getNumPipeOutputs() {
		return Main.TReflection_getNumPipeOutputs(ptr);
	}

	public TObjectReflection getPipeOutput(int i) {
		return fromPtr(Main.TReflection_getPipeOutput(ptr, i), TObjectReflection.class);
	}

	public int getNumAtomicCounters() {
		return Main.TReflection_getNumAtomicCounters(ptr);
	}

	public TObjectReflection getAtomicCounter(int i) {
		return fromPtr(Main.TReflection_getAtomicCounter(ptr, i), TObjectReflection.class);
	}

	public int getNumBufferVariables() {
		return Main.TReflection_getNumBufferVariables(ptr);
	}

	public TObjectReflection getBufferVariable(int i) {
		return fromPtr(Main.TReflection_getBufferVariable(ptr, i), TObjectReflection.class);
	}

	public int getNumStorageBuffers() {
		return Main.TReflection_getNumStorageBuffers(ptr);
	}

	public TObjectReflection getStorageBufferBlock(int i) {
		return fromPtr(Main.TReflection_getStorageBufferBlock(ptr, i), TObjectReflection.class);
	}

	public int getIndex(String name) {
		return Main.TReflection_getIndex(ptr, name);
	}

	public int getPipeIOIndex(String name, boolean inOrOut) {
		return Main.TReflection_getPipeIOIndex(ptr, name, inOrOut);
	}

	public long getLocalSize(int dim) {
		return Main.TReflection_getLocalSize(ptr, dim);
	}

	public void dump() {
		Main.TReflection_dump(ptr);
	}

}
