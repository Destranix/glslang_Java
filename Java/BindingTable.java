package Java;

public class BindingTable {

	private byte[] ptr;
	private byte[] bindingsPtr;
	
	private final Binding[] bindings;
	
	public BindingTable(Binding[] bindings){
		this.bindings = bindings;
		load();
	}
	
	public void load(){
		if(ptr == null){
			byte[][] bindingsPtrArray = new byte[bindings.length][];
			for(int i=0;i<bindings.length;++i){
				bindingsPtrArray[i] = bindings[i].getPtr();
			}
			this.bindingsPtr = Main.createArray(bindingsPtrArray);
			ptr = Main.ShBindingTable(bindings.length, bindingsPtr);
		}
	}
	
	public void free(){
		if(ptr != null){
			Main.free(ptr);
			Main.free(bindingsPtr);
			ptr = null;
		}
	}
	
	protected byte[] getPtr(){
		return ptr;
	}
	
}
