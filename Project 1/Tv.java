public class Tv extends ImageAndSound{
	private String ports, resolution,size;
	public Tv(String code, String name, String manufacturer, String date, double price, String type, String s, String r, String p){
		super(code,name,manufacturer,date,price,type);
		this.ports=p;
		this.size=s;
		this.resolution=r;
	}
	public String getPorts(){
		return this.ports;
	}
	public String getSize(){
		return this.size;
	}
	public String getResolution(){
		return this.resolution;
	}
	public void setPorts(String ports){
		this.ports=ports;
	}
	public void setResolution(String resolution){
		this.resolution=resolution;
	}
	public void setSize(String size){
		this.size=size;
	}
	public String toString(){
		return super.toString()+"\nTv size: "+this.size+"\nTv ports: "+this.ports+"\nTv resolution: "+this.resolution;
	}
}