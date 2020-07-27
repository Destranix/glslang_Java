package Java;

public class Compiler {

	private byte[] ptr;
	
	private final EShLanguage language;
	private final int debugOptions;
	
	public Compiler(EShLanguage language, int debugOptions){
		this.language = language;
		this.debugOptions = debugOptions;
		load();
	}
	
	public void load(){
		if(ptr == null){
			ptr = Main.ShConstructCompiler(language, debugOptions);
		}
	}
	
	public void free(){
		if(ptr != null){
			Main.ShDestruct(ptr);
			ptr = null;
		}
	}
	
	protected byte[] getPtr(){
		return ptr;
	}
	
	public int compile(
			String[] shaderStrings,
		    EShOptimizationLevel optimizationLevel,
		    TBuiltInResource resources,
		    int debugOptions
			){
		return Main.ShCompile(ptr, shaderStrings, optimizationLevel, resources.getPtr(), debugOptions);
	}
	public int compile(
			String[] shaderStrings,
		    EShOptimizationLevel optimizationLevel,
		    TBuiltInResource resources,
		    int debugOptions,
		    int defaultVersion
			){
		return Main.ShCompile(ptr, shaderStrings, optimizationLevel, resources.getPtr(), debugOptions, defaultVersion);
	}
	public int compile(
			String[] shaderStrings,
		    EShOptimizationLevel optimizationLevel,
		    TBuiltInResource resources,
		    int debugOptions,
		    int defaultVersion,            
		    boolean forwardCompatible
			){
		return Main.ShCompile(ptr, shaderStrings, optimizationLevel, resources.getPtr(), debugOptions, defaultVersion, forwardCompatible);
	}
	public int compile(
			String[] shaderStrings,
		    EShOptimizationLevel optimizationLevel,
		    TBuiltInResource resources,
		    int debugOptions,
		    int defaultVersion,            
		    boolean forwardCompatible,      
		    EShMessages messages
			){
		return Main.ShCompile(ptr, shaderStrings, optimizationLevel, resources.getPtr(), debugOptions, defaultVersion, forwardCompatible, messages);
	}
	
	public String getInfoLog(){
		return Main.ShGetInfoLog(ptr);
	}
	
}
