package Java;

public enum EShOptimizationLevel {
	EShOptNoGeneration(Main.E_SH_OPT_NO_GENERATION),
    EShOptNone(Main.E_SH_OPT_NONE),
    EShOptSimple(Main.E_SH_OPT_SIMPLE),
    EShOptFull(Main.E_SH_OPT_FULL);
	
	private final int value;
	private EShOptimizationLevel(int value){
		this.value = value;
	}
	
	public int getConstant(){
    	return this.value;
    }
    
    public static EShOptimizationLevel valueByStr(String str){
    	switch(str){
    		case "EShOptNoGeneration":
    			return EShOptNoGeneration;
    		case "EShOptNone":
	    		return EShOptNone;
    		case "EShOptSimple":
    			return EShOptSimple;
    		case "EShOptFull":
	    		return EShOptFull;
    		default:
    			throw new IllegalArgumentException("Cannot translate string into enum value!");
    	}
    }
    
    public static EShOptimizationLevel valueByConstant(int constant){
    	switch(constant){
    		case Main.E_SH_OPT_NO_GENERATION:
    			return EShOptNoGeneration;
    		case Main.E_SH_OPT_NONE:
	    		return EShOptNone;
    		case Main.E_SH_OPT_SIMPLE:
    			return EShOptSimple;
    		case Main.E_SH_OPT_FULL:
	    		return EShOptFull;
    		default:
    			throw new IllegalArgumentException("Cannot translate constant into enum value!");
    	}
    }
}
