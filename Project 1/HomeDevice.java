public class HomeDevice extends Item{
	private  String energyClass;
	//private double  ekpt;
	public HomeDevice(String code, String name, String manufacturer, String date, double price, String energyClass){
		super(code,name,manufacturer,date,price);
		this.energyClass=energyClass;
		//this.ekpt=0.10;
	}
	public void energyClass(String t){
        this.energyClass = t;
    }
    public String energyClass(){
        return this.energyClass;
    }
	public double getEkpt(){
		return 0.20;
	}
	public String toString(){
		return super.toString()+"\nEnergy Class is: "+this.energyClass;
	}
}