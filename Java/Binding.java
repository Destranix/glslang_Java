package Java;

public class Binding {
	
	private byte[] ptr;
	private byte[] namePtr;
	
	private final String name;
	private final int binding;
	
	public Binding(String name, int binding){
		this.name = name;
		this.binding = binding;
		load();
	}
	
	public void load(){
		if(ptr == null){
			this.namePtr = Main.allocString(name);
			ptr = Main.ShBinding(namePtr, binding);
		}
	}
	
	public void free(){
		if(ptr != null){
			Main.free(ptr);
			Main.free(namePtr);
			ptr = null;
		}
	}
	
	protected byte[] getPtr(){
		return ptr;
	}

}
