package Java;

public class Linker {

	private byte[] ptr;
	
	private final EShExecutable language;
	private final int debugOptions;
	
	public Linker(EShExecutable language, int debugOptions){
		this.language = language;
		this.debugOptions = debugOptions;
		load();
	}
	
	public void load(){
		if(ptr == null){
			ptr = Main.ShConstructLinker(language, debugOptions);
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
	
	public int linkExt(Compiler[] h){
		byte[][] hPtrArray = new byte[h.length][];
		for(int i=0;i<h.length;++i){
			hPtrArray[i] = h[i].getPtr();
		}
		byte[] hPtr = Main.createArray(hPtrArray);
		int ret = Main.ShLinkExt(ptr, hPtr, h.length);
		Main.free(hPtr);
		return ret;
	}
	
	public String getInfoLog(){
		return Main.ShGetInfoLog(ptr);
	}
	
	public byte[] getExecutable(){
		return Main.ShGetExecutable(ptr);
	}
	
	public int setVirtualAttributeBindings(BindingTable table){
		return Main.ShSetVirtualAttributeBindings(ptr, table.getPtr());
	}
	
	public int setFixedAttributeBindings(BindingTable table){
		return Main.ShSetFixedAttributeBindings(ptr, table.getPtr());
	}
	
	public int excludeAttributes(int[] attributes){
		return Main.ShExcludeAttributes(ptr, attributes);
	}
	
}
