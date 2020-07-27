package Java;

public enum EShMessages {
	EShMsgDefault(Main.E_SH_MSG_DEFAULT),
	EShMsgRelaxedErrors(Main.E_SH_MSG_RELAXED_ERRORS),
	EShMsgSuppressWarnings(Main.E_SH_MSG_SUPRESS_WARNINGS),
	EShMsgAST(Main.E_SH_MSG_AST),
	EShMsgSpvRules(Main.E_SH_MSG_SPV_RULES),
	EShMsgVulkanRules(Main.E_SH_MSG_VULKAN_RULES),
	EShMsgOnlyPreprocessor(Main.E_SH_MSG_ONLY_PREPROCESSOR),
	EShMsgReadHlsl(Main.E_SH_MSG_READ_HLSL),
	EShMsgCascadingErrors(Main.E_SH_MSG_CASCADING_ERRORS),
	EShMsgKeepUncalled(Main.E_SH_MSG_KEEP_UNCALLED),
	EShMsgHlslOffsets(Main.E_SH_MSG_HLSL_OFFSETS),
	EShMsgDebugInfo(Main.E_SH_MSG_DEBUG_INFO),
	EShMsgHlslEnable16BitTypes(Main.E_SH_MSG_HLSL_ENABLE_16BIT_TYPES),
	EShMsgHlslLegalization(Main.E_SH_MSG_HLSL_LEGALIZATION),
	EShMsgHlslDX9Compatible(Main.E_SH_MSG_HLSL_DX9_COMPATIBLE),
	EShMsgBuiltinSymbolTable(Main.E_SH_MSG_BUITLIN_SYMBOL_TABLE);
	
	private final int value;
	private EShMessages(int value){
		this.value = value;
	}
	
	public int getConstant(){
    	return this.value;
    }
    
    public static EShMessages valueByStr(String str){
    	switch(str){
    		case "EShMsgDefault":
    			return EShMsgDefault;
    		case "EShMsgRelaxedErrors":
	    		return EShMsgRelaxedErrors;
    		case "EShMsgSuppressWarnings":
    			return EShMsgSuppressWarnings;
    		case "EShMsgAST":
	    		return EShMsgAST;
    		case "EShMsgSpvRules":
    			return EShMsgSpvRules;
    		case "EShMsgVulkanRules":
	    		return EShMsgVulkanRules;
    		case "EShMsgOnlyPreprocessor":
    			return EShMsgOnlyPreprocessor;
    		case "EShMsgReadHlsl":
	    		return EShMsgReadHlsl;
    		case "EShMsgCascadingErrors":
    			return EShMsgCascadingErrors;
    		case "EShMsgKeepUncalled":
	    		return EShMsgKeepUncalled;
    		case "EShMsgHlslOffsets":
    			return EShMsgHlslOffsets;
    		case "EShMsgDebugInfo":
	    		return EShMsgDebugInfo;
    		case "EShMsgHlslEnable16BitTypes":
    			return EShMsgHlslEnable16BitTypes;
    		case "EShMsgHlslLegalization":
	    		return EShMsgHlslLegalization;
    		case "EShMsgHlslDX9Compatible":
    			return EShMsgHlslDX9Compatible;
    		case "EShMsgBuiltinSymbolTable":
	    		return EShMsgBuiltinSymbolTable;
    		default:
    			throw new IllegalArgumentException("Cannot translate string into enum value!");
    	}
    }
    
    public static EShMessages valueByConstant(int constant){
    	switch(constant){
    		case Main.E_SH_MSG_DEFAULT:
    			return EShMsgDefault;
    		case Main.E_SH_MSG_RELAXED_ERRORS:
	    		return EShMsgRelaxedErrors;
    		case Main.E_SH_MSG_SUPRESS_WARNINGS:
    			return EShMsgSuppressWarnings;
    		case Main.E_SH_MSG_AST:
	    		return EShMsgAST;
    		case Main.E_SH_MSG_SPV_RULES:
    			return EShMsgSpvRules;
    		case Main.E_SH_MSG_VULKAN_RULES:
	    		return EShMsgVulkanRules;
    		case Main.E_SH_MSG_ONLY_PREPROCESSOR:
    			return EShMsgOnlyPreprocessor;
    		case Main.E_SH_MSG_READ_HLSL:
	    		return EShMsgReadHlsl;
    		case Main.E_SH_MSG_CASCADING_ERRORS:
    			return EShMsgCascadingErrors;
    		case Main.E_SH_MSG_KEEP_UNCALLED:
	    		return EShMsgKeepUncalled;
    		case Main.E_SH_MSG_HLSL_OFFSETS:
    			return EShMsgHlslOffsets;
    		case Main.E_SH_MSG_DEBUG_INFO:
	    		return EShMsgDebugInfo;
    		case Main.E_SH_MSG_HLSL_ENABLE_16BIT_TYPES:
    			return EShMsgHlslEnable16BitTypes;
    		case Main.E_SH_MSG_HLSL_LEGALIZATION:
	    		return EShMsgHlslLegalization;
    		case Main.E_SH_MSG_HLSL_DX9_COMPATIBLE:
    			return EShMsgHlslDX9Compatible;
    		case Main.E_SH_MSG_BUITLIN_SYMBOL_TABLE:
	    		return EShMsgBuiltinSymbolTable;
    		default:
    			throw new IllegalArgumentException("Cannot translate constant into enum value!");
    	}
    }
}
