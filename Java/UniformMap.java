package Java;

public class UniformMap {
	
	private byte[] ptr;
	
	public UniformMap(){
		load();
	}
	
	public void load(){
		if(ptr == null){
			ptr = Main.ShConstructUniformMap();
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
	
	public String getInfoLog(){
		return Main.ShGetInfoLog(ptr);
	}
	
	public int getUniformLocation(String name){
		return Main.ShGetUniformLocation(ptr, name);
	}
}
