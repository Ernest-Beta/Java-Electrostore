public class Item{
    private String code, name, manufacturer, date;
	private double price;
    private double ekpt;
    
    public Item(String code, String name, String manufacturer, String date, double price){
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.date = date;
        this.price = price;
    }
    public void setCode(String c){
        this.code = c;
    }
    public String getCode(){
        return this.code;
    }
    public double getEkpt() {
        return ekpt;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public void setManufacturer(String m){
        this.manufacturer = m;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public void setDate(String d){
        this.date = d;
    }
    public String getDate(){
        return this.date;
    }
    public void setPrice(double p){
        this.price = p;
    }
    public double getPrice(){
        return this.price;
    }
    public String toString(){
        return "\nCode: "+this.code+"\nName: "+this.name+"\nManufacturer: "+this.manufacturer+"\nRelease date: "+this.date+"\nPrice: "+this.price;
    }
}