package Java;

public class TLimits {
	
	private byte[] ptr;
	
	private boolean[] values;
	
	public TLimits(){
		this(new Values());
	}
	
	public TLimits(Values values){
		this.values = values.asBooleanArray();
		load();
	}
	
	public TLimits(boolean[] values){
		this.values = values;
		load();
	}
	
	public void load(){
		if(ptr == null){
			ptr = Main.TLimits(values);
		}
	}
	
	public void free(){
		if(ptr != null){
			Main.free(ptr);
			ptr = null;
		}
	}
	
	protected byte[] getPtr(){
		return ptr;
	}
	
	public static class Values{
		public boolean nonInductiveForLoops = true;
		public boolean whileLoops = true;
		public boolean doWhileLoops = true;
		public boolean generalUniformIndexing = true;
		public boolean generalAttributeMatrixVectorIndexing = true;
		public boolean generalVaryingIndexing = true;
		public boolean generalSamplerIndexing = true;
		public boolean generalVariableIndexing = true;
		public boolean generalConstantMatrixVectorIndexing = true;
		
		public boolean[] asBooleanArray(){
			boolean[] ret = new boolean[9];
			int i = 0;
			ret[i++] = nonInductiveForLoops;
			ret[i++] = whileLoops;
			ret[i++] = doWhileLoops;
			ret[i++] = generalUniformIndexing;
			ret[i++] = generalAttributeMatrixVectorIndexing;
			ret[i++] = generalVaryingIndexing;
			ret[i++] = generalSamplerIndexing;
			ret[i++] = generalVariableIndexing;
			ret[i++] = generalConstantMatrixVectorIndexing;
			
			return ret;
		}
	}
}
