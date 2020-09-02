package com.destranix.glslang;

import java.util.EnumSet;

public class Compiler extends PointerBoundObject {

	private final EShLanguage language;
	private final int debugOptions;
	private final int constructorIndex;

	public Compiler(EShLanguage language, int debugOptions) {
		this.language = language;
		this.debugOptions = debugOptions;
		this.constructorIndex = 0;
		load();
	}

	protected Compiler(byte[] ptr) {
		this.language = null;
		this.debugOptions = -1;
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
					ptr = Main.ShConstructCompiler(language, debugOptions);
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
					Main.ShDestruct(ptr);
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public int compile(String[] shaderStrings, EShOptimizationLevel optimizationLevel, TBuiltInResource resources,
			int debugOptions) {
		return Main.ShCompile(ptr, shaderStrings, optimizationLevel, resources.getPtr(), debugOptions);
	}

	public int compile(String[] shaderStrings, EShOptimizationLevel optimizationLevel, TBuiltInResource resources,
			int debugOptions, int defaultVersion) {
		return Main.ShCompile(ptr, shaderStrings, optimizationLevel, resources.getPtr(), debugOptions, defaultVersion);
	}

	public int compile(String[] shaderStrings, EShOptimizationLevel optimizationLevel, TBuiltInResource resources,
			int debugOptions, int defaultVersion, boolean forwardCompatible) {
		return Main.ShCompile(ptr, shaderStrings, optimizationLevel, resources.getPtr(), debugOptions, defaultVersion,
				forwardCompatible);
	}

	public int compile(String[] shaderStrings, EShOptimizationLevel optimizationLevel, TBuiltInResource resources,
			int debugOptions, int defaultVersion, boolean forwardCompatible, EnumSet<EShMessages> messages) {
		return Main.ShCompile(ptr, shaderStrings, optimizationLevel, resources.getPtr(), debugOptions, defaultVersion,
				forwardCompatible, messages);
	}

	public String getInfoLog() {
		return Main.ShGetInfoLog(ptr);
	}

}
