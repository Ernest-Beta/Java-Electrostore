public class Disk extends ImageAndSound{
    String type, resolution, format;
    public Disk(String type, String resolution, String format, String code, String name, String manufacturer, String date, double price){
        super(code, name, manufacturer, date, price,type);
        this.resolution = resolution;
        this.format = format;
    }
    public void setResolution(String r){
        this.resolution = r;
    }
    public String getResolution(){
        return this.resolution;
    }
    public void setFormat(String f){
        this.format = f;
    }
    public String getFormat(){
        return this.format;
    }
    public String toString(){
        return super.toString()+"\nResolution: "+this.resolution+"\nFormat: "+this.format;
    }
}