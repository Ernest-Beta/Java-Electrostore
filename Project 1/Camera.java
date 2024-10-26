public class Camera extends ImageAndSound{
    private String resolution, opticalzoom, digitalzoom, screensize;
    public Camera(String code, String name, String manufacturer, String date, double price, String type, String resolution, String opticalzoom, String digitalzoom, String screensize ){
        super(code,name,manufacturer,date,price,type);
        this.resolution = resolution;
        this.opticalzoom = opticalzoom;
        this.digitalzoom = digitalzoom;
        this.screensize = screensize;
    }
    
    public String getResolution(){
        return this.resolution;
    }
    public void setResolution(String resolution){
        this.resolution = resolution;
    }
    public String getOpticalzoom(){
        return this.opticalzoom;
    }
    public void setOpticalzoom(String opticalzoom){
        this.opticalzoom = opticalzoom;
    }
    public String getDigitalzoom(){
        return this.digitalzoom;
    }
    public void setDigitalzoom(String digitalzoom){
        this.digitalzoom = digitalzoom;
    }
    public String getScreensize(){
        return this.screensize;
    }
    public void setScreensize(String screensize){
        this.screensize = screensize;
    }
	public String toString(){
		return super.toString()+"\nResolution: "+this.resolution+"\nOpticalzoom: "+this.opticalzoom+"\nDigitalzoom: "+this.digitalzoom+"\nScreen size: "+this.screensize;
	}
}