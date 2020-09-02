package com.destranix.glslang;

public enum TBlendEquationShift {
	EBlendMultiply(Main.E_BLEND_MULTIPLY),
	EBlendScreen(Main.E_BLEND_SCREEN),
	EBlendOverlay(Main.E_BLEND_OVERLAY),
	EBlendDarken(Main.E_BLEND_DARKEN),
	EBlendLighten(Main.E_BLEND_LIGHTEN),
	EBlendColordodge(Main.E_BLEND_COLORDODGE),
	EBlendColorburn(Main.E_BLEND_COLORBURN),
	EBlendHardlight(Main.E_BLEND_HARDLIGHT),
	EBlendSoftlight(Main.E_BLEND_SOFTLIGHT),
	EBlendDifference(Main.E_BLEND_DIFFERENCE),
	EBlendExclusion(Main.E_BLEND_EXCLUSION),
	EBlendHslHue(Main.E_BLEND_HSL_HUE),
	EBlendHslSaturation(Main.E_BLEND_HSL_SATURATION),
	EBlendHslColor(Main.E_BLEND_HSL_COLOR),
	EBlendHslLuminosity(Main.E_BLEND_HSL_LUMINOSITY),
	EBlendAllEquations(Main.E_BLEND_ALL_EQUATIONS);

	private final int value;

	private TBlendEquationShift(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static TBlendEquationShift valueByStr(String str) {
		switch (str) {
			case "EBlendMultiply":
				return EBlendMultiply;
			case "EBlendScreen":
				return EBlendScreen;
			case "EBlendOverlay":
				return EBlendOverlay;
			case "EBlendDarken":
				return EBlendDarken;
			case "EBlendLighten":
				return EBlendLighten;
			case "EBlendColordodge":
				return EBlendColordodge;
			case "EBlendColorburn":
				return EBlendColorburn;
			case "EBlendHardlight":
				return EBlendHardlight;
			case "EBlendSoftlight":
				return EBlendSoftlight;
			case "EBlendDifference":
				return EBlendDifference;
			case "EBlendExclusion":
				return EBlendExclusion;
			case "EBlendHslHue":
				return EBlendHslHue;
			case "EBlendHslSaturation":
				return EBlendHslSaturation;
			case "EBlendHslColor":
				return EBlendHslColor;
			case "EBlendHslLuminosity":
				return EBlendHslLuminosity;
			case "EBlendAllEquations":
				return EBlendAllEquations;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static TBlendEquationShift valueByConstant(int constant) {
		switch (constant) {
			case Main.E_BLEND_MULTIPLY:
				return EBlendMultiply;
			case Main.E_BLEND_SCREEN:
				return EBlendScreen;
			case Main.E_BLEND_OVERLAY:
				return EBlendOverlay;
			case Main.E_BLEND_DARKEN:
				return EBlendDarken;
			case Main.E_BLEND_LIGHTEN:
				return EBlendLighten;
			case Main.E_BLEND_COLORDODGE:
				return EBlendColordodge;
			case Main.E_BLEND_COLORBURN:
				return EBlendColorburn;
			case Main.E_BLEND_HARDLIGHT:
				return EBlendHardlight;
			case Main.E_BLEND_SOFTLIGHT:
				return EBlendSoftlight;
			case Main.E_BLEND_DIFFERENCE:
				return EBlendDifference;
			case Main.E_BLEND_EXCLUSION:
				return EBlendExclusion;
			case Main.E_BLEND_HSL_HUE:
				return EBlendHslHue;
			case Main.E_BLEND_HSL_SATURATION:
				return EBlendHslSaturation;
			case Main.E_BLEND_HSL_COLOR:
				return EBlendHslColor;
			case Main.E_BLEND_HSL_LUMINOSITY:
				return EBlendHslLuminosity;
			case Main.E_BLEND_ALL_EQUATIONS:
				return EBlendAllEquations;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
