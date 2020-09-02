package com.destranix.glslang;

import java.util.EnumSet;

public enum spirvbin_base_t_Options {
	NONE(Main.SPIRVBIN_BASE_T_OPTIONS_NONE),
	STRIP(Main.SPIRVBIN_BASE_T_OPTIONS_STRIP),
	MAP_TYPES(Main.SPIRVBIN_BASE_T_OPTIONS_MAP_TYPES),
	MAP_NAMES(Main.SPIRVBIN_BASE_T_OPTIONS_MAP_NAMES),
	MAP_FUNCS(Main.SPIRVBIN_BASE_T_OPTIONS_MAP_FUNCS),
	DCE_FUNCS(Main.SPIRVBIN_BASE_T_OPTIONS_DCE_FUNCS),
	DCE_VARS(Main.SPIRVBIN_BASE_T_OPTIONS_DCE_VARS),
	DCE_TYPES(Main.SPIRVBIN_BASE_T_OPTIONS_DCE_TYPES),
	OPT_LOADSTORE(Main.SPIRVBIN_BASE_T_OPTIONS_OPT_LOADSTORE),
	OPT_FWD_LS(Main.SPIRVBIN_BASE_T_OPTIONS_OPT_FWD_LS),
	MAP_ALL(Main.SPIRVBIN_BASE_T_OPTIONS_MAP_ALL),
	DCE_ALL(Main.SPIRVBIN_BASE_T_OPTIONS_DCE_ALL),
	OPT_ALL(Main.SPIRVBIN_BASE_T_OPTIONS_OPT_ALL),
	ALL_BUT_STRIP(Main.SPIRVBIN_BASE_T_OPTIONS_ALL_BUT_STRIP),
	DO_EVERYTHING(Main.SPIRVBIN_BASE_T_OPTIONS_DO_EVERYTHING);

	private final int value;

	private spirvbin_base_t_Options(int value) {
		this.value = value;
	}

	public int getConstant() {
		return this.value;
	}

	public static int setToInt(EnumSet<spirvbin_base_t_Options> set) {
		int ret = 0;
		for (spirvbin_base_t_Options val : set) {
			ret |= val.getConstant();
		}
		return ret;
	}

	public static spirvbin_base_t_Options valueByStr(String str) {
		switch (str) {
			case "NONE":
				return NONE;
			case "STRIP":
				return STRIP;
			case "MAP_TYPES":
				return MAP_TYPES;
			case "MAP_NAMES":
				return MAP_NAMES;
			case "MAP_FUNCS":
				return MAP_FUNCS;
			case "DCE_FUNCS":
				return DCE_FUNCS;
			case "DCE_VARS":
				return DCE_VARS;
			case "DCE_TYPES":
				return DCE_TYPES;
			case "OPT_LOADSTORE":
				return OPT_LOADSTORE;
			case "OPT_FWD_LS":
				return OPT_FWD_LS;
			case "MAP_ALL":
				return MAP_ALL;
			case "DCE_ALL":
				return DCE_ALL;
			case "OPT_ALL":
				return OPT_ALL;
			case "ALL_BUT_STRIP":
				return ALL_BUT_STRIP;
			case "DO_EVERYTHING":
				return DO_EVERYTHING;
			default:
				throw new IllegalArgumentException("Cannot translate string into enum value!");
		}
	}

	public static spirvbin_base_t_Options valueByConstant(int constant) {
		switch (constant) {
			case Main.SPIRVBIN_BASE_T_OPTIONS_NONE:
				return NONE;
			case Main.SPIRVBIN_BASE_T_OPTIONS_STRIP:
				return STRIP;
			case Main.SPIRVBIN_BASE_T_OPTIONS_MAP_TYPES:
				return MAP_TYPES;
			case Main.SPIRVBIN_BASE_T_OPTIONS_MAP_NAMES:
				return MAP_NAMES;
			case Main.SPIRVBIN_BASE_T_OPTIONS_MAP_FUNCS:
				return MAP_FUNCS;
			case Main.SPIRVBIN_BASE_T_OPTIONS_DCE_FUNCS:
				return DCE_FUNCS;
			case Main.SPIRVBIN_BASE_T_OPTIONS_DCE_VARS:
				return DCE_VARS;
			case Main.SPIRVBIN_BASE_T_OPTIONS_DCE_TYPES:
				return DCE_TYPES;
			case Main.SPIRVBIN_BASE_T_OPTIONS_OPT_LOADSTORE:
				return OPT_LOADSTORE;
			case Main.SPIRVBIN_BASE_T_OPTIONS_OPT_FWD_LS:
				return OPT_FWD_LS;
			case Main.SPIRVBIN_BASE_T_OPTIONS_MAP_ALL:
				return MAP_ALL;
			case Main.SPIRVBIN_BASE_T_OPTIONS_DCE_ALL:
				return DCE_ALL;
			// case Main.SPIRVBIN_BASE_T_OPTIONS_OPT_ALL:
			// return OPT_ALL;
			case Main.SPIRVBIN_BASE_T_OPTIONS_ALL_BUT_STRIP:
				return ALL_BUT_STRIP;
			case Main.SPIRVBIN_BASE_T_OPTIONS_DO_EVERYTHING:
				return DO_EVERYTHING;
			default:
				throw new IllegalArgumentException("Cannot translate constant into enum value!");
		}
	}
}
