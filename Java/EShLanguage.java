package Java;

public enum EShLanguage {
	EShLangVertex(Main.E_SH_LANG_VERTEX),
    EShLangTessControl(Main.E_SH_LANG_TESS_CONTROL),
    EShLangTessEvaluation(Main.E_SH_LANG_TESS_EVALUATION),
    EShLangGeometry(Main.E_SH_LANG_GEOMETRY),
    EShLangFragment(Main.E_SH_LANG_FRAGMENT),
    EShLangCompute(Main.E_SH_LANG_COMPUTE),
    EShLangRayGen(Main.E_SH_LANG_RAY_GEN),
    EShLangIntersect(Main.E_SH_LANG_INTERSECT),
    EShLangAnyHit(Main.E_SH_LANG_ANY_HIT),
    EShLangClosestHit(Main.E_SH_LANG_CLOSEST_HIT),
    EShLangMiss(Main.E_SH_LANG_MISS),
    EShLangCallable(Main.E_SH_LANG_CALLABLE),
    EShLangTaskNV(Main.E_SH_LANG_TASK_NV),
    EShLangMeshNV(Main.E_SH_LANG_MESH_NV);
	
	private final int value;
	private EShLanguage(int value){
		this.value = value;
	}
	
	public int getConstant(){
    	return this.value;
    }
    
    public static EShLanguage valueByStr(String str){
    	switch(str){
    		case "EShLangVertex":
    			return EShLangVertex;
    		case "EShLangTessControl":
	    		return EShLangTessControl;
    		case "EShLangTessEvaluation":
	    		return EShLangTessEvaluation;
    		case "EShLangGeometry":
	    		return EShLangGeometry;
    		case "EShLangFragment":
	    		return EShLangFragment;
    		case "EShLangCompute":
	    		return EShLangCompute;
    		case "EShLangRayGen":
    		case "EShLangRayGenNV":
	    		return EShLangRayGen;
    		case "EShLangIntersect":
    		case "EShLangIntersectNV":
	    		return EShLangIntersect;
    		case "EShLangAnyHit":
    		case "EShLangAnyHitNV":
	    		return EShLangAnyHit;
    		case "EShLangClosestHit":
    		case "EShLangClosestHitNV":
	    		return EShLangClosestHit;
    		case "EShLangMiss":
    		case "EShLangMissNV":
	    		return EShLangMiss;
    		case "EShLangCallable":
    		case "EShLangCallableNV":
	    		return EShLangCallable;
    		case "EShLangTaskNV":
	    		return EShLangTaskNV;
    		case "EShLangMeshNV":
	    		return EShLangMeshNV;
    		default:
    			throw new IllegalArgumentException("Cannot translate string into enum value!");
    	}
    }
    
    public static EShLanguage valueByConstant(int constant){
    	switch(constant){
    		case Main.E_SH_LANG_VERTEX:
    			return EShLangVertex;
    		case Main.E_SH_LANG_TESS_CONTROL:
	    		return EShLangTessControl;
    		case Main.E_SH_LANG_TESS_EVALUATION:
	    		return EShLangTessEvaluation;
    		case Main.E_SH_LANG_GEOMETRY:
	    		return EShLangGeometry;
    		case Main.E_SH_LANG_FRAGMENT:
	    		return EShLangFragment;
    		case Main.E_SH_LANG_COMPUTE:
	    		return EShLangCompute;
    		case Main.E_SH_LANG_RAY_GEN:
	    		return EShLangRayGen;
    		case Main.E_SH_LANG_INTERSECT:
	    		return EShLangIntersect;
    		case Main.E_SH_LANG_ANY_HIT:
	    		return EShLangAnyHit;
    		case Main.E_SH_LANG_CLOSEST_HIT:
	    		return EShLangClosestHit;
    		case Main.E_SH_LANG_MISS:
	    		return EShLangMiss;
    		case Main.E_SH_LANG_CALLABLE:
	    		return EShLangCallable;
    		case Main.E_SH_LANG_TASK_NV:
	    		return EShLangTaskNV;
    		case Main.E_SH_LANG_MESH_NV:
	    		return EShLangMeshNV;
    		default:
    			throw new IllegalArgumentException("Cannot translate constant into enum value!");
    	}
    }
}
