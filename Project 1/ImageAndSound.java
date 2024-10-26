public class ImageAndSound extends Item{
	private  String type;
	//private  double ekpt;
	public ImageAndSound(String code, String name, String manufacturer, String date, double price, String type){
		super(code,name,manufacturer,date,price);
		this.type=type;
		//this.ekpt=0.25;
	}
    public String getType(){
        return this.type;
    }
	public double getEkpt(){
		return 0.25;
	}
	public String toString(){
		return super.toString()+"\nType is: "+this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
}