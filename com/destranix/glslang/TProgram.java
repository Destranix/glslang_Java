package com.destranix.glslang;

import java.util.EnumSet;

public class TProgram extends PointerBoundObject {

	private final int constructorIndex;

	public TProgram() {
		this.constructorIndex = 0;
		load();
	}

	protected TProgram(byte[] ptr) {
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
					ptr = Main.TProgram();
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

	public void addShader(TShader shader) {
		Main.TProgram_addShader(ptr, shader.getPtr());
	}

	public CList<TShader> getShaders(EShLanguage stage) {
		@SuppressWarnings("unchecked") // Is checked
		CList<TShader> tmp = (CList<TShader>) fromPtr(Main.TProgram_getShaders(ptr, stage), CList.class);
		return tmp;
	}

	public boolean link(EnumSet<EShMessages> messages) {
		return Main.TProgram_link(ptr, messages);
	}

	public String getInfoLog() {
		return Main.TProgram_getInfoLog(ptr);
	}

	public String getInfoDebugLog() {
		return Main.TProgram_getInfoDebugLog(ptr);
	}

	public TIntermediate getIntermediate(EShLanguage stage) {
		return fromPtr(Main.TProgram_getIntermediate(ptr, stage), TIntermediate.class);
	}

	public boolean buildReflection() {
		return Main.TProgram_buildReflection(ptr);
	}

	public boolean buildReflection(EnumSet<EShReflectionOptions> opts) {
		return Main.TProgram_buildReflection(ptr, opts);
	}

	public long getLocalSize(int dim) {
		return Main.TProgram_getLocalSize(ptr, dim);
	}

	public int getReflectionIndex(String name) {
		return Main.TProgram_getReflectionIndex(ptr, name);
	}

	public int getReflectionPipeIOIndex(String name, boolean inOrOut) {
		return Main.TProgram_getReflectionPipeIOIndex(ptr, name, inOrOut);
	}

	public int getNumUniformVariables() {
		return Main.TProgram_getNumUniformVariables(ptr);
	}

	public TObjectReflection getUniform(int index) {
		return fromPtr(Main.TProgram_getUniform(ptr, index), TObjectReflection.class);
	}

	public int getNumUniformBlocks() {
		return Main.TProgram_getNumUniformBlocks(ptr);
	}

	public TObjectReflection getUniformBlock(int index) {
		return fromPtr(Main.TProgram_getUniformBlock(ptr, index), TObjectReflection.class);
	}

	public int getNumPipeInputs() {
		return Main.TProgram_getNumPipeInputs(ptr);
	}

	public TObjectReflection getPipeInput(int index) {
		return fromPtr(Main.TProgram_getPipeInput(ptr, index), TObjectReflection.class);
	}

	public int getNumPipeOutputs() {
		return Main.TProgram_getNumPipeOutputs(ptr);
	}

	public TObjectReflection getPipeOutput(int index) {
		return fromPtr(Main.TProgram_getPipeOutput(ptr, index), TObjectReflection.class);
	}

	public int getNumBufferVariables() {
		return Main.TProgram_getNumBufferVariables(ptr);
	}

	public TObjectReflection getBufferVariable(int index) {
		return fromPtr(Main.TProgram_getBufferVariable(ptr, index), TObjectReflection.class);
	}

	public int getNumBufferBlocks() {
		return Main.TProgram_getNumBufferBlocks(ptr);
	}

	public TObjectReflection getBufferBlock(int index) {
		return fromPtr(Main.TProgram_getBufferBlock(ptr, index), TObjectReflection.class);
	}

	public int getNumAtomicCounters() {
		return Main.TProgram_getNumAtomicCounters(ptr);
	}

	public TObjectReflection getAtomicCounter(int index) {
		return fromPtr(Main.TProgram_getAtomicCounter(ptr, index), TObjectReflection.class);
	}

	public int getNumLiveUniformVariables() {
		return Main.TProgram_getNumLiveUniformVariables(ptr);
	}

	public int getNumLiveUniformBlocks() {
		return Main.TProgram_getNumLiveUniformBlocks(ptr);
	}

	public int getNumLiveAttributes() {
		return Main.TProgram_getNumLiveAttributes(ptr);
	}

	public int getUniformIndex(String name) {
		return Main.TProgram_getUniformIndex(ptr, name);
	}

	public int getPipeIOIndex(String name, boolean inOrOut) {
		return Main.TProgram_getPipeIOIndex(ptr, name, inOrOut);
	}

	public String getUniformName(int index) {
		return Main.TProgram_getUniformName(ptr, index);
	}

	public int getUniformBinding(int index) {
		return Main.TProgram_getUniformBinding(ptr, index);
	}

	public int getUniformStages(int index) {
		return Main.TProgram_getUniformStages(ptr, index);
	}

	public int getUniformBlockIndex(int index) {
		return Main.TProgram_getUniformBlockIndex(ptr, index);
	}

	public int getUniformType(int index) {
		return Main.TProgram_getUniformType(ptr, index);
	}

	public int getUniformBufferOffset(int index) {
		return Main.TProgram_getUniformBufferOffset(ptr, index);
	}

	public int getUniformArraySize(int index) {
		return Main.TProgram_getUniformArraySize(ptr, index);
	}

	public TType getUniformTType(int index) {
		return fromPtr(Main.TProgram_getUniformTType(ptr, index), TType.class);
	}

	public String getUniformBlockName(int index) {
		return Main.TProgram_getUniformBlockName(ptr, index);
	}

	public int getUniformBlockSize(int index) {
		return Main.TProgram_getUniformBlockSize(ptr, index);
	}

	public int getUniformBlockBinding(int index) {
		return Main.TProgram_getUniformBlockBinding(ptr, index);
	}

	public int getUniformBlockCounterIndex(int index) {
		return Main.TProgram_getUniformBlockCounterIndex(ptr, index);
	}

	public TType getUniformBlockTType(int index) {
		return fromPtr(Main.TProgram_getUniformBlockTType(ptr, index), TType.class);
	}

	public String getAttributeName(int index) {
		return Main.TProgram_getAttributeName(ptr, index);
	}

	public int getAttributeType(int index) {
		return Main.TProgram_getAttributeType(ptr, index);
	}

	public TType getAttributeTType(int index) {
		return fromPtr(Main.TProgram_getAttributeTType(ptr, index), TType.class);
	}

	public void dumpReflection() {
		Main.TProgram_dumpReflection(ptr);
	}

	public boolean mapIO() {
		return Main.TProgram_mapIO(ptr);
	}

	public boolean mapIO(TIoMapResolver pResolver) {
		return Main.TProgram_mapIO(ptr, pResolver.getPtr());
	}

	public boolean mapIO(TIoMapResolver pResolver, TIoMapper pIoMapper) {
		return Main.TProgram_mapIO(ptr, pResolver.getPtr(), pIoMapper.getPtr());
	}

}
