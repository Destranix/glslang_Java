package Java;

public class Main {
	
	public static final int E_SH_LANG_VERTEX = 0;
	public static final int E_SH_LANG_TESS_CONTROL = 1;
	public static final int E_SH_LANG_TESS_EVALUATION = 2;
	public static final int E_SH_LANG_GEOMETRY= 3;
	public static final int E_SH_LANG_FRAGMENT = 4;
	public static final int E_SH_LANG_COMPUTE = 5;
	public static final int E_SH_LANG_RAY_GEN = 6;
	public static final int E_SH_LANG_INTERSECT = 7;
	public static final int E_SH_LANG_ANY_HIT = 8;
	public static final int E_SH_LANG_CLOSEST_HIT = 9;
	public static final int E_SH_LANG_MISS = 10;
	public static final int E_SH_LANG_CALLABLE = 11;
	public static final int E_SH_LANG_TASK_NV = 12;
	public static final int E_SH_LANG_MESH_NV = 13;
	
	public static final int E_SH_EX_VERTEX_FRAGMENT = 0;
	public static final int E_SH_EX_FRAGMENT = 1;
	
	public static final int E_SH_OPT_NO_GENERATION = 0;
	public static final int E_SH_OPT_NONE = 1;
	public static final int E_SH_OPT_SIMPLE = 2;
	public static final int E_SH_OPT_FULL = 3;
	
	public static final int E_SH_MSG_DEFAULT          = 0;
	public static final int E_SH_MSG_RELAXED_ERRORS    = (1 << 0);
	public static final int E_SH_MSG_SUPRESS_WARNINGS = (1 << 1);
	public static final int E_SH_MSG_AST              = (1 << 2);
	public static final int E_SH_MSG_SPV_RULES         = (1 << 3);
	public static final int E_SH_MSG_VULKAN_RULES     = (1 << 4);
	public static final int E_SH_MSG_ONLY_PREPROCESSOR = (1 << 5);
	public static final int E_SH_MSG_READ_HLSL         = (1 << 6);
	public static final int E_SH_MSG_CASCADING_ERRORS  = (1 << 7);
	public static final int E_SH_MSG_KEEP_UNCALLED    = (1 << 8);
	public static final int E_SH_MSG_HLSL_OFFSETS      = (1 << 9);
	public static final int E_SH_MSG_DEBUG_INFO       = (1 << 10);
	public static final int E_SH_MSG_HLSL_ENABLE_16BIT_TYPES  = (1 << 11);
	public static final int E_SH_MSG_HLSL_LEGALIZATION  = (1 << 12);
	public static final int E_SH_MSG_HLSL_DX9_COMPATIBLE = (1 << 13);
	public static final int E_SH_MSG_BUITLIN_SYMBOL_TABLE = (1 << 14);
	
	static {
        System.loadLibrary("Main");
    }
	
	public static native int ShInitialize();
	public static native int ShFinalize();
	
	public static native byte[] ShBinding(byte[] name, int binding);
	public static native byte[] ShBindingTable(int numBindings, byte[] bindings);
	
	public static byte[] ShConstructCompiler(EShLanguage language, int debugOptions){
		return ShConstructCompiler(language.getConstant(), debugOptions);
	}
	public static native byte[] ShConstructCompiler(int language, int debugOptions);
	public static byte[] ShConstructLinker(EShExecutable executable, int debugOptions){
		return ShConstructLinker(executable.getConstant(), debugOptions);
	}
	public static native byte[] ShConstructLinker(int executable, int debugOptions);
	public static native byte[] ShConstructUniformMap();
	public static native void ShDestruct(byte[] handle);
	
	public static native byte[] TBuiltInResource(int[] values, byte[] limits);
	public static native byte[] TLimits(boolean[] values);
	
	public static int ShCompile(byte[] handle, String[] shaderStrings, EShOptimizationLevel optimizationLevel, byte[] resources, int debugOptions, int defaultVersion, boolean forwardCompatible){
		return ShCompile(handle, shaderStrings, optimizationLevel.getConstant(), resources, debugOptions, defaultVersion, forwardCompatible);
	}
	public static int ShCompile(byte[] handle, String[] shaderStrings, EShOptimizationLevel optimizationLevel, byte[] resources, int debugOptions, int defaultVersion){
		return ShCompile(handle, shaderStrings, optimizationLevel.getConstant(), resources, debugOptions, defaultVersion);
	}
	public static int ShCompile(byte[] handle, String[] shaderStrings, EShOptimizationLevel optimizationLevel, byte[] resources, int debugOptions){
		return ShCompile(handle, shaderStrings, optimizationLevel.getConstant(), resources, debugOptions);
	}
	public static int ShCompile(byte[] handle, String[] shaderStrings, EShOptimizationLevel optimizationLevel, byte[] resources, int debugOptions, int defaultVersion, boolean forwardCompatible, EShMessages messages){
		return ShCompile(handle, shaderStrings, optimizationLevel.getConstant(), resources, debugOptions, defaultVersion, forwardCompatible, messages);
	}
	public static int ShCompile(byte[] handle, String[] shaderStrings, EShOptimizationLevel optimizationLevel, byte[] resources, int debugOptions, int defaultVersion, boolean forwardCompatible, int messages){
		return ShCompile(handle, shaderStrings, optimizationLevel.getConstant(), resources, debugOptions, defaultVersion, forwardCompatible, messages);
	}
	public static int ShCompile(byte[] handle, String[] shaderStrings, int optimizationLevel, byte[] resources, int debugOptions, int defaultVersion, boolean forwardCompatible, EShMessages messages){
		return ShCompile(handle, shaderStrings, optimizationLevel, resources, debugOptions, defaultVersion, forwardCompatible, messages.getConstant());
	}
	
	public static  int ShCompile(
		    byte[] handle,
		    String[] shaderStrings,
		    int optimizationLevel,
		    byte[] resources,
		    int debugOptions
		    ){
		return ShCompile(handle, shaderStrings, optimizationLevel, resources, debugOptions, 110, false, E_SH_MSG_DEFAULT);
	}
	public static  int ShCompile(
		    byte[] handle,
		    String[] shaderStrings,
		    int optimizationLevel,
		    byte[] resources,
		    int debugOptions,
		    int defaultVersion
		    ){
		return ShCompile(handle, shaderStrings, optimizationLevel, resources, debugOptions, defaultVersion, false, E_SH_MSG_DEFAULT);
	}
	public static  int ShCompile(
		    byte[] handle,
		    String[] shaderStrings,
		    int optimizationLevel,
		    byte[] resources,
		    int debugOptions,
		    int defaultVersion,            
		    boolean forwardCompatible 
		    ){
		return ShCompile(handle, shaderStrings, optimizationLevel, resources, debugOptions, defaultVersion, forwardCompatible, E_SH_MSG_DEFAULT);
	}
	public static int ShCompile(
		    byte[] handle,
		    String[] shaderStrings,
		    int optimizationLevel,
		    byte[] resources,
		    int debugOptions,
		    int defaultVersion,            
		    boolean forwardCompatible,      
		    int messages 
		    ){
		return ShCompile(handle, shaderStrings, shaderStrings.length, optimizationLevel, resources, debugOptions, defaultVersion, forwardCompatible, messages);
	}
	private static native int ShCompile(
		    byte[] handle,
		    String[] shaderStrings,
		    int numStrings,
		    int optimizationLevel,
		    byte[] resources,
		    int debugOptions,
		    int defaultVersion,            
		    boolean forwardCompatible,      
		    int messages 
		    );
	
	public static native int ShLinkExt(
			    byte[] handle,
			    byte[] h,
			    int numHandles);
	
	public static native void ShSetEncryptionMethod(byte[] handle);
	
	public static native String ShGetInfoLog(byte[] handle);
	public static native byte[] ShGetExecutable(byte[] handle);
	public static native int ShSetVirtualAttributeBindings(byte[] handle, byte[] bindingTable);
	public static native int ShSetFixedAttributeBindings(byte[] handle, byte[] bindingTable);
	
	public static int ShExcludeAttributes(byte[] handle, int[] attributes){
		return ShExcludeAttributes(handle, attributes, attributes.length);
	}
	private static native int ShExcludeAttributes(byte[] handle, int[] attributes, int count);
	
	public static native int ShGetUniformLocation(byte[] handle, String name);
	
	public static native byte[] allocString(String str);
	
	public static native byte[] createArray(byte[][] pointers);
	
	public static native void free(byte[] pointer);
	
}
