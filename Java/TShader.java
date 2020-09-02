package Java;

import java.util.EnumSet;

public class TShader extends PointerBoundObject {

	private final EShLanguage language;
	private final int constructorIndex;

	public TShader(EShLanguage language) {
		this.language = language;
		this.constructorIndex = 0;
		load();
	}

	protected TShader(byte[] ptr) {
		this.ptr = ptr;
		this.language = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TShader(language);
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

	public void setStrings(String[] s) {
		Main.TShader_setStrings(ptr, s);
	}

	public void setStringsWithLengths(String[] s, int[] l) {
		Main.TShader_setStringsWithLengths(ptr, s, l);
	}

	public void setStringsWithLengthsAndNames(String[] s, int[] l, String[] names) {
		Main.TShader_setStringsWithLengthsAndNames(ptr, s, l, names);
	}

	public void setPreamble(String s) {
		Main.TShader_setPreamble(ptr, s);
	}

	public void setEntryPoint(String entryPoint) {
		Main.TShader_setEntryPoint(ptr, entryPoint);
	}

	public void setSourceEntryPoint(String sourceEntryPointName) {
		Main.TShader_setSourceEntryPoint(ptr, sourceEntryPointName);
	}

	public void addProcesses(String[] processes) {
		Main.TShader_addProcesses(ptr, processes);
	}

	public void setShiftBinding(TResourceType res, long base) {
		Main.TShader_setShiftBinding(ptr, res, base);
	}

	public void setShiftSamplerBinding(long base) {
		Main.TShader_setShiftSamplerBinding(ptr, base);
	}

	public void setShiftTextureBinding(long base) {
		Main.TShader_setShiftTextureBinding(ptr, base);
	}

	public void setShiftImageBinding(long base) {
		Main.TShader_setShiftImageBinding(ptr, base);
	}

	public void setShiftUboBinding(long base) {
		Main.TShader_setShiftUboBinding(ptr, base);
	}

	public void setShiftUavBinding(long base) {
		Main.TShader_setShiftUavBinding(ptr, base);
	}

	public void setShiftCbufferBinding(long base) {
		Main.TShader_setShiftCbufferBinding(ptr, base);
	}

	public void setShiftSsboBinding(long base) {
		Main.TShader_setShiftSsboBinding(ptr, base);
	}

	public void setShiftBindingForSet(TResourceType res, long base, long set) {
		Main.TShader_setShiftBindingForSet(ptr, res, base, set);
	}

	public void setResourceSetBinding(String[] base) {
		Main.TShader_setResourceSetBinding(ptr, base);
	}

	public void setAutoMapBindings(boolean map) {
		Main.TShader_setAutoMapBindings(ptr, map);
	}

	public void setAutoMapLocations(boolean map) {
		Main.TShader_setAutoMapLocations(ptr, map);
	}

	public void addUniformLocationOverride(String name, int loc) {
		Main.TShader_addUniformLocationOverride(ptr, name, loc);
	}

	public void setUniformLocationBase(int base) {
		Main.TShader_setUniformLocationBase(ptr, base);
	}

	public void setInvertY(boolean invert) {
		Main.TShader_setInvertY(ptr, invert);
	}

	public void setHlslIoMapping(boolean hlslIoMap) {
		Main.TShader_setHlslIoMapping(ptr, hlslIoMap);
	}

	public void setFlattenUniformArrays(boolean flatten) {
		Main.TShader_setFlattenUniformArrays(ptr, flatten);
	}

	public void setNoStorageFormat(boolean useUnknownFormat) {
		Main.TShader_setNoStorageFormat(ptr, useUnknownFormat);
	}

	public void setNanMinMaxClamp(boolean nanMinMaxClamp) {
		Main.TShader_setNanMinMaxClamp(ptr, nanMinMaxClamp);
	}

	public void setTextureSamplerTransformMode(EShTextureSamplerTransformMode mode) {
		Main.TShader_setTextureSamplerTransformMode(ptr, mode);
	}

	public void setEnvInput(EShSource lang, EShLanguage envStage, EShClient client, int version) {
		Main.TShader_setEnvInput(ptr, lang, envStage, client, version);
	}

	public void setEnvClient(EShClient client, EShTargetClientVersion version) {
		Main.TShader_setEnvClient(ptr, client, version);
	}

	public void setEnvTarget(EShTargetLanguage lang, EShTargetLanguageVersion version) {
		Main.TShader_setEnvTarget(ptr, lang, version);
	}

	public String[] getStrings() {
		return Main.TShader_getStrings(ptr);
	}

	public void setEnvTargetHlslFunctionality1() {
		Main.TShader_setEnvTargetHlslFunctionality1(ptr);
	}

	public boolean getEnvTargetHlslFunctionality1() {
		return Main.TShader_getEnvTargetHlslFunctionality1(ptr);
	}

	public boolean parse(TBuiltInResource res, int defaultVersion, EProfile defaultProfile,
			boolean forceDefaultVersionAndProfile, boolean forwardCompatible, EnumSet<EShMessages> messages,
			byte[] includer) {
		return Main.TShader_parse(ptr, res.getPtr(), defaultVersion, defaultProfile, forceDefaultVersionAndProfile,
				forwardCompatible, messages, includer);
	}

	public boolean parse(TBuiltInResource res, int defaultVersion, EProfile defaultProfile,
			boolean forceDefaultVersionAndProfile, boolean forwardCompatible, EnumSet<EShMessages> messages) {
		return Main.TShader_parse(ptr, res.getPtr(), defaultVersion, defaultProfile, forceDefaultVersionAndProfile,
				forwardCompatible, messages);
	}

	public boolean parse(TBuiltInResource builtInResources, int defaultVersion, boolean forwardCompatible,
			EnumSet<EShMessages> messages) {
		return Main.TShader_parse(ptr, builtInResources.getPtr(), defaultVersion, forwardCompatible, messages);
	}

	public boolean parse(TBuiltInResource builtInResources, int defaultVersion, boolean forwardCompatible,
			EnumSet<EShMessages> messages, byte[] includer) {
		return Main.TShader_parse(ptr, builtInResources.getPtr(), defaultVersion, forwardCompatible, messages,
				includer);
	}

	public boolean preprocess(TBuiltInResource builtInResources, int defaultVersion, EProfile defaultProfile,
			boolean forceDefaultVersionAndProfile, boolean forwardCompatible, EnumSet<EShMessages> message,
			String[] outputString, Includer includer) {
		return Main.TShader_preprocess(ptr, builtInResources.getPtr(), defaultVersion, defaultProfile,
				forceDefaultVersionAndProfile, forwardCompatible, message, outputString, includer.getPtr());
	}

	public String getInfoLog() {
		return Main.TShader_getInfoLog(ptr);
	}

	public String getInfoDebugLog() {
		return Main.TShader_getInfoDebugLog(ptr);
	}

	public int getStage() {
		return Main.TShader_getStage(ptr);
	}

	public TIntermediate getIntermediate() {
		return fromPtr(Main.TShader_getIntermediate(ptr), TIntermediate.class);
	}

	public static abstract class Includer extends PointerBoundObject {

		private final int constructorIndex;

		protected Includer(PoisonClass p) {
			this.constructorIndex = -1;
		}

		protected Includer(byte[] ptr) {
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

		public abstract IncludeResult includeSystem(String headerName, String includerName, long inclusionDepth);// NOTE:
																													// Interface
																													// not
																													// exact.
																													// size_t
																													// might
																													// be
																													// larger
																													// than
																													// long.

		public abstract IncludeResult includeLocal(String headerName, String includerName, long inclusionDepth);// NOTE:
																												// Interface
																												// not
																												// exact.
																												// size_t
																												// might
																												// be
																												// larger
																												// than
																												// long.

		public abstract void releaseInclude(IncludeResult includeResult);

		public static class IncludeResult extends PointerBoundObject {

			private final String headerName;
			private final String headerData;
			private final long headerLength;
			private final byte[] userData;

			private final int constructorIndex;

			public IncludeResult(String headerName, String headerData, long headerLength, byte[] userData) {
				this.headerName = headerName;
				this.headerData = headerData;
				this.headerLength = headerLength;
				this.userData = userData;
				this.constructorIndex = 0;
				load();
			}

			protected IncludeResult(byte[] ptr) {
				this.ptr = ptr;
				this.headerName = null;
				this.headerData = null;
				this.headerLength = -1;
				this.userData = null;
				this.constructorIndex = -1;
			}

			@Override
			protected void load_intern() {
				if (ptr == null) {
					switch (constructorIndex) {
						case -1:
							throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
						case 0:
							ptr = Main.TShader_Includer_IncludeResult(headerName, headerData, headerLength, userData);
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

			public void setUserData(byte[] v) {
				Main.TShader_Includer_IncludeResult_setUserData(ptr, v);
			}

			public String getHeaderName() {
				return Main.TShader_Includer_IncludeResult_getHeaderName(ptr);
			}

			public String getHeaderData() {
				return Main.TShader_Includer_IncludeResult_getHeaderData(ptr);
			}

			public long getHeaderLength() {
				return Main.TShader_Includer_IncludeResult_getHeaderLength(ptr);
			}// NOTE: Interface not exact. size_t might be larger than long.

			public byte[] getUserData() {
				return Main.TShader_Includer_IncludeResult_getUserData(ptr);
			}

		}

	}

	public static class ForbidIncluder extends Includer {

		private final int constructorIndex;

		public ForbidIncluder() {
			super(PoisonClass.singleton);
			this.constructorIndex = 0;
			load();
		}

		protected ForbidIncluder(byte[] ptr) {
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
						ptr = Main.TShader_ForbidIncluder();
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

		public IncludeResult includeSystem(String headerName, String includerName, long inclusionDepth) {
			return fromPtr(Main.TShader_ForbidIncluder_includeSystem(ptr, headerName, includerName, inclusionDepth),
					IncludeResult.class);
		}// NOTE: Interface not exact. size_t might be larger than long.

		public IncludeResult includeLocal(String headerName, String includerName, long inclusionDepth) {
			return fromPtr(Main.TShader_ForbidIncluder_includeLocal(ptr, headerName, includerName, inclusionDepth),
					IncludeResult.class);
		}// NOTE: Interface not exact. size_t might be larger than long.

		@Override
		public void releaseInclude(IncludeResult result) {
			Main.TShader_ForbidIncluder_releaseInclude(ptr, result.getPtr());
		}

	}

}
