public class WashingMachine extends HomeDevice{
	private String energyClass,storage,speed;
	public WashingMachine(String code, String name, String manufacturer, String date, double price,String energyClass, String storage, String speed){
		super(code,name,manufacturer,date,price,energyClass);
		this.storage=storage;
		this.speed=speed;
		this.energyClass = energyClass;
	}
	public String getEnergyClass(){
		return this.energyClass;
	}
	public String getSpeed(){
		return this.speed;
	}
	public String getStorage(){
		return this.storage;
	}
	public void setEnergyClass(String energyClass){
		this.energyClass = energyClass;
	}
	public void setSpeed(String speed){
		this.speed = speed;
	}
	public void setStorage(String storage){
		this.storage =storage;
	}
	public String toString(){
		return super.toString()+"\nWashingmachine Speed: "+this.speed+"\nWashingmachine Storage: "+this.storage;
	}	
}
