package com.destranix.glslang;

import java.util.EnumSet;

public abstract class TParseVersions extends PointerBoundObject {

	private final int constructorIndex;

	protected TParseVersions(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected TParseVersions(byte[] ptr) {
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

	public void requireStage(TSourceLoc loc, EnumSet<EShLanguageMask> languageMask, String featureDesc) {
		Main.TParseVersions_requireStageMask(ptr, loc.getPtr(), languageMask, featureDesc);
	}

	public void requireStage(TSourceLoc loc, EShLanguage language, String featureDesc) {
		Main.TParseVersions_requireStage(ptr, loc.getPtr(), language, featureDesc);
	}

	public boolean isEsProfile() {
		return Main.TParseVersions_isEsProfile(ptr);
	}

	public void requireProfile(TSourceLoc loc, int profileMask, String featureDesc) {
		Main.TParseVersions_requireProfile(ptr, loc.getPtr(), profileMask, featureDesc);
	}

	public void profileRequires(TSourceLoc loc, int profileMask, int minVersion, String[] extensions,
			String featureDesc) {
		Main.TParseVersions_profileRequires(ptr, loc.getPtr(), profileMask, minVersion, extensions, featureDesc);
	}

	public void profileRequires(TSourceLoc loc, int profileMask, int minVersion, String extension, String featureDesc) {
		Main.TParseVersions_profileRequires(ptr, loc.getPtr(), profileMask, minVersion, extension, featureDesc);
	}

	public void initializeExtensionBehavior() {
		Main.TParseVersions_initializeExtensionBehavior(ptr);
	}

	public void checkDeprecated(TSourceLoc loc, int queryProfiles, int depVersion, String featureDesc) {
		Main.TParseVersions_checkDeprecated(ptr, loc.getPtr(), queryProfiles, depVersion, featureDesc);
	}

	public void requireNotRemoved(TSourceLoc loc, int queryProfiles, int removedVersion, String featureDesc) {
		Main.TParseVersions_requireNotRemoved(ptr, loc.getPtr(), queryProfiles, removedVersion, featureDesc);
	}

	public void requireExtensions(TSourceLoc loc, String[] extensions, String featureDesc) {
		Main.TParseVersions_requireExtensions(ptr, loc.getPtr(), extensions, featureDesc);
	}

	public void ppRequireExtensions(TSourceLoc loc, String[] extensions, String featureDesc) {
		Main.TParseVersions_ppRequireExtensions(ptr, loc.getPtr(), extensions, featureDesc);
	}

	public TExtensionBehavior getExtensionBehavior(String s) {
		return TExtensionBehavior.valueByConstant(Main.TParseVersions_getExtensionBehavior(ptr, s));
	}

	public boolean extensionTurnedOn(String extension) {
		return Main.TParseVersions_extensionTurnedOn(ptr, extension);
	}

	public boolean extensionsTurnedOn(String[] extensions) {
		return Main.TParseVersions_extensionsTurnedOn(ptr, extensions);
	}

	public void updateExtensionBehavior(int line, String extension, String behavior) {
		Main.TParseVersions_updateExtensionBehavior(ptr, line, extension, behavior);
	}

	public void updateExtensionBehavior(String extension, TExtensionBehavior behavior) {
		Main.TParseVersions_updateExtensionBehavior(ptr, extension, behavior);
	}

	public boolean checkExtensionsRequested(TSourceLoc loc, String[] extensions, String featureDesc) {
		return Main.TParseVersions_checkExtensionsRequested(ptr, loc.getPtr(), extensions, featureDesc);
	}

	public void checkExtensionStage(TSourceLoc loc, String extension) {
		Main.TParseVersions_checkExtensionStage(ptr, loc.getPtr(), extension);
	}

	public void extensionRequires(TSourceLoc loc, String extension, String behavior) {
		Main.TParseVersions_extensionRequires(ptr, loc.getPtr(), extension, behavior);
	}

	public void fullIntegerCheck(TSourceLoc loc, String op) {
		Main.TParseVersions_fullIntegerCheck(ptr, loc.getPtr(), op);
	}

	public void unimplemented(TSourceLoc loc, String featureDesc) {
		Main.TParseVersions_unimplemented(ptr, loc.getPtr(), featureDesc);
	}

	public void doubleCheck(TSourceLoc loc, String op) {
		Main.TParseVersions_doubleCheck(ptr, loc.getPtr(), op);
	}

	public void float16Check(TSourceLoc loc, String op) {
		Main.TParseVersions_float16Check(ptr, loc.getPtr(), op);
	}

	public void float16Check(TSourceLoc loc, String op, boolean builtIn) {
		Main.TParseVersions_float16Check(ptr, loc.getPtr(), op, builtIn);
	}

	public void float16ScalarVectorCheck(TSourceLoc loc, String op) {
		Main.TParseVersions_float16ScalarVectorCheck(ptr, loc.getPtr(), op);
	}

	public void float16ScalarVectorCheck(TSourceLoc loc, String op, boolean builtIn) {
		Main.TParseVersions_float16ScalarVectorCheck(ptr, loc.getPtr(), op, builtIn);
	}

	public boolean float16Arithmetic() {
		return Main.TParseVersions_float16Arithmetic(ptr);
	}

	public void requireFloat16Arithmetic(TSourceLoc loc, String op, String featureDesc) {
		Main.TParseVersions_requireFloat16Arithmetic(ptr, loc.getPtr(), op, featureDesc);
	}

	public void int16ScalarVectorCheck(TSourceLoc loc, String op) {
		Main.TParseVersions_int16ScalarVectorCheck(ptr, loc.getPtr(), op);
	}

	public void int16ScalarVectorCheck(TSourceLoc loc, String op, boolean builtIn) {
		Main.TParseVersions_int16ScalarVectorCheck(ptr, loc.getPtr(), op, builtIn);
	}

	public boolean int16Arithmetic() {
		return Main.TParseVersions_int16Arithmetic(ptr);
	}

	public void requireInt16Arithmetic(TSourceLoc loc, String op, String featureDesc) {
		Main.TParseVersions_requireInt16Arithmetic(ptr, loc.getPtr(), op, featureDesc);
	}

	public void int8ScalarVectorCheck(TSourceLoc loc, String op) {
		Main.TParseVersions_int8ScalarVectorCheck(ptr, loc.getPtr(), op);
	}

	public void int8ScalarVectorCheck(TSourceLoc loc, String op, boolean builtIn) {
		Main.TParseVersions_int8ScalarVectorCheck(ptr, loc.getPtr(), op, builtIn);
	}

	public boolean int8Arithmetic() {
		return Main.TParseVersions_int8Arithmetic(ptr);
	}

	public void requireInt8Arithmetic(TSourceLoc loc, String op, String featureDesc) {
		Main.TParseVersions_requireInt8Arithmetic(ptr, loc.getPtr(), op, featureDesc);
	}

	public void float16OpaqueCheck(TSourceLoc loc, String op) {
		Main.TParseVersions_float16OpaqueCheck(ptr, loc.getPtr(), op);
	}

	public void float16OpaqueCheck(TSourceLoc loc, String op, boolean builtIn) {
		Main.TParseVersions_float16OpaqueCheck(ptr, loc.getPtr(), op, builtIn);
	}

	public void int64Check(TSourceLoc loc, String op) {
		Main.TParseVersions_int64Check(ptr, loc.getPtr(), op);
	}

	public void int64Check(TSourceLoc loc, String op, boolean builtIn) {
		Main.TParseVersions_int64Check(ptr, loc.getPtr(), op, builtIn);
	}

	public void explicitInt8Check(TSourceLoc loc, String op) {
		Main.TParseVersions_explicitInt8Check(ptr, loc.getPtr(), op);
	}

	public void explicitInt8Check(TSourceLoc loc, String op, boolean builtIn) {
		Main.TParseVersions_explicitInt8Check(ptr, loc.getPtr(), op, builtIn);
	}

	public void explicitInt16Check(TSourceLoc loc, String op) {
		Main.TParseVersions_explicitInt16Check(ptr, loc.getPtr(), op);
	}

	public void explicitInt16Check(TSourceLoc loc, String op, boolean builtIn) {
		Main.TParseVersions_explicitInt16Check(ptr, loc.getPtr(), op, builtIn);
	}

	public void explicitInt32Check(TSourceLoc loc, String op) {
		Main.TParseVersions_explicitInt32Check(ptr, loc.getPtr(), op);
	}

	public void explicitInt32Check(TSourceLoc loc, String op, boolean builtIn) {
		Main.TParseVersions_explicitInt32Check(ptr, loc.getPtr(), op, builtIn);
	}

	public void explicitFloat32Check(TSourceLoc loc, String op) {
		Main.TParseVersions_explicitFloat32Check(ptr, loc.getPtr(), op);
	}

	public void explicitFloat32Check(TSourceLoc loc, String op, boolean builtIn) {
		Main.TParseVersions_explicitFloat32Check(ptr, loc.getPtr(), op, builtIn);
	}

	public void explicitFloat64Check(TSourceLoc loc, String op) {
		Main.TParseVersions_explicitFloat64Check(ptr, loc.getPtr(), op);
	}

	public void explicitFloat64Check(TSourceLoc loc, String op, boolean builtIn) {
		Main.TParseVersions_explicitFloat64Check(ptr, loc.getPtr(), op, builtIn);
	}

	public void fcoopmatCheck(TSourceLoc loc, String op) {
		Main.TParseVersions_fcoopmatCheck(ptr, loc.getPtr(), op);
	}

	public void fcoopmatCheck(TSourceLoc loc, String op, boolean builtIn) {
		Main.TParseVersions_fcoopmatCheck(ptr, loc.getPtr(), op, builtIn);
	}

	public void intcoopmatCheck(TSourceLoc loc, String op) {
		Main.TParseVersions_intcoopmatCheck(ptr, loc.getPtr(), op);
	}

	public void intcoopmatCheck(TSourceLoc loc, String op, boolean builtIn) {
		Main.TParseVersions_intcoopmatCheck(ptr, loc.getPtr(), op, builtIn);
	}

	public boolean relaxedErrors() {
		return Main.TParseVersions_relaxedErrors(ptr);
	}

	public boolean suppressWarnings() {
		return Main.TParseVersions_suppressWarnings(ptr);
	}

	public boolean isForwardCompatible() {
		return Main.TParseVersions_isForwardCompatible(ptr);
	}

	public void spvRemoved(TSourceLoc loc, String op) {
		Main.TParseVersions_spvRemoved(ptr, loc.getPtr(), op);
	}

	public void vulkanRemoved(TSourceLoc loc, String op) {
		Main.TParseVersions_vulkanRemoved(ptr, loc.getPtr(), op);
	}

	public void requireVulkan(TSourceLoc loc, String op) {
		Main.TParseVersions_requireVulkan(ptr, loc.getPtr(), op);
	}

	public void requireSpv(TSourceLoc loc, String op) {
		Main.TParseVersions_requireSpv(ptr, loc.getPtr(), op);
	}

	public void requireSpv(TSourceLoc loc, String op, long version) {
		Main.TParseVersions_requireSpv(ptr, loc.getPtr(), op, version);
	}

	public void error(TSourceLoc loc, String szReason, String szToken, String szExtraInfoFormat,
			PointerBoundObject... additional) {
		byte[][] additionalPtr = null;
		if (additional != null) {
			additionalPtr = new byte[additional.length][];
			for (int i = 0; i < additional.length; ++i) {
				additionalPtr[i] = additional[i].getPtr();
			}
		}
		Main.TParseVersions_error(ptr, loc.getPtr(), szReason, szToken, szExtraInfoFormat, additionalPtr);
	}

	public void warn(TSourceLoc loc, String szReason, String szToken, String szExtraInfoFormat,
			PointerBoundObject... additional) {
		byte[][] additionalPtr = null;
		if (additional != null) {
			additionalPtr = new byte[additional.length][];
			for (int i = 0; i < additional.length; ++i) {
				additionalPtr[i] = additional[i].getPtr();
			}
		}
		Main.TParseVersions_warn(ptr, loc.getPtr(), szReason, szToken, szExtraInfoFormat, additionalPtr);
	}

	public void ppError(TSourceLoc loc, String szReason, String szToken, String szExtraInfoFormat,
			PointerBoundObject... additional) {
		byte[][] additionalPtr = null;
		if (additional != null) {
			additionalPtr = new byte[additional.length][];
			for (int i = 0; i < additional.length; ++i) {
				additionalPtr[i] = additional[i].getPtr();
			}
		}
		Main.TParseVersions_ppError(ptr, loc.getPtr(), szReason, szToken, szExtraInfoFormat, additionalPtr);
	}

	public void ppWarn(TSourceLoc loc, String szReason, String szToken, String szExtraInfoFormat,
			PointerBoundObject... additional) {
		byte[][] additionalPtr = null;
		if (additional != null) {
			additionalPtr = new byte[additional.length][];
			for (int i = 0; i < additional.length; ++i) {
				additionalPtr[i] = additional[i].getPtr();
			}
		}
		Main.TParseVersions_ppWarn(ptr, loc.getPtr(), szReason, szToken, szExtraInfoFormat, additionalPtr);
	}

	public void addError() {
		Main.TParseVersions_addError(ptr);
	}

	public int getNumErrors() {
		return Main.TParseVersions_getNumErrors(ptr);
	}

	public void setScanner(TInputScanner scanner) {
		Main.TParseVersions_setScanner(ptr, scanner.getPtr());
	}

	public TInputScanner getScanner() {
		return fromPtr(Main.TParseVersions_getScanner(ptr), TInputScanner.class);
	}

	public TSourceLoc getCurrentLoc() {
		return fromPtr(Main.TParseVersions_getCurrentLoc(ptr), TSourceLoc.class);
	}

	public void setCurrentLine(int line) {
		Main.TParseVersions_setCurrentLine(ptr, line);
	}

	public void setCurrentColumn(int col) {
		Main.TParseVersions_setCurrentColumn(ptr, col);
	}

	public void setCurrentSourceName(String name) {
		Main.TParseVersions_setCurrentSourceName(ptr, name);
	}

	public void setCurrentString(int string) {
		Main.TParseVersions_setCurrentString(ptr, string);
	}

	public String getPreamble() {
		return Main.TParseVersions_getPreamble(ptr);
	}

	public boolean isReadingHLSL() {
		return Main.TParseVersions_isReadingHLSL(ptr);
	}

	public boolean hlslEnable16BitTypes() {
		return Main.TParseVersions_hlslEnable16BitTypes(ptr);
	}

	public boolean hlslDX9Compatible() {
		return Main.TParseVersions_hlslDX9Compatible(ptr);
	}

	public void setForwardCompatible(boolean v) {
		Main.TParseVersions_setForwardCompatible(ptr, v);
	}

	public void setProfile(int v) {
		Main.TParseVersions_setProfile(ptr, v);
	}

	public void setInfoSink(TInfoSink v) {
		Main.TParseVersions_setInfoSink(ptr, v.getPtr());
	}

	public void setVersion(int v) {
		Main.TParseVersions_setVersion(ptr, v);
	}

	public void setLanguage(EShLanguage v) {
		Main.TParseVersions_setLanguage(ptr, v.getConstant());
	}

	public void setSpvVersion(SpvVersionStruct v) {
		Main.TParseVersions_setSpvVersion(ptr, v.getPtr());
	}

	public boolean getForwardCompatible() {
		return Main.TParseVersions_getForwardCompatible(ptr);
	}

	public EProfile getProfile() {
		return EProfile.valueByConstant(Main.TParseVersions_getProfile(ptr));
	}

	public TInfoSink getInfoSink() {
		return fromPtr(Main.TParseVersions_getInfoSink(ptr), TInfoSink.class);
	}

	public int getVersion() {
		return Main.TParseVersions_getVersion(ptr);
	}

	public EShLanguage getLanguage() {
		return EShLanguage.valueByConstant(Main.TParseVersions_getLanguage(ptr));
	}

	public SpvVersionStruct getSpvVersion() {
		return fromPtr(Main.TParseVersions_getSpvVersion(ptr), SpvVersionStruct.class);
	}

	public TIntermediate getIntermediate() {
		return fromPtr(Main.TParseVersions_getIntermediate(ptr), TIntermediate.class);
	}

}
