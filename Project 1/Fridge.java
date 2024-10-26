public class Fridge extends HomeDevice{
	private String type,storagebody,storagefrezzer;
	public Fridge(String code, String name, String manufacturer, String date, double price,String type,String energyClass,String storagebody,String storagefrezzer){
		super(code,name,manufacturer,date,price,energyClass);
		this.type=type;
		this.storagebody=storagebody;
		this.storagefrezzer=storagefrezzer;
	}
	public String getType(){
		return this.type;
	}
	public String getStoragebody(){
		return this.storagebody;
	}
	public String getStoragefrezzer(){
		return this.storagefrezzer;
	}
	public void setType(String type){
		this.type = type;
	}
	public void setStoragebody(String storagebody){
		this.storagebody = storagebody;
	}
	public void setStoragefrezzer(String storagefrezzer){
		this.storagefrezzer = storagefrezzer;
	}
	public String toString(){
		return super.toString()+"Fridge Type: "+"\nFridge Storage in Body: "+this.storagebody+"\nFridge Storage in Frezzer: "+this.storagefrezzer;
	}
}