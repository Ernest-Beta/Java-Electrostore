public class Console extends Gaming{
	String type,processor,graphics,sound,storage;
	public Console(String code, String name, String manufacturer, String date, double price,String type,String processor,String graphics,String sound,String storage){
		super(code,name,manufacturer,date,price,type);
		this.processor=processor;
		this.graphics=graphics;
		this.sound=sound;
	}

	public String getProcessor(){
		return this.processor;
	}
	public String getGraphics(){
		return this.graphics;
	}
	public String getSound(){
		return this.sound;
	}
	public String getStorage(){
		return this.storage;
	}
	public void setType(String type){
		this.type=type;
	}
	public void setProcessor(String processor){
		this.processor=processor;
	}
	public void setGraphics(String graphics){
		this.graphics=graphics;
	}
	public void setSound(String sound){
		this.sound=sound;
	}
	public void setStorage(String storage){
		this.storage=storage;
	}
	public String toString(){
		return super.toString()+"\nConsole Processor: "+this.processor+"\nConsole Graphics: "+this.graphics+"\nConsole Storage: "+this.storage+"Console Sound: "+this.sound;
	}
}