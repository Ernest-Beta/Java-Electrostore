public class Customer {

   private String phone;
   private String name;
   
       
    public Customer (String name, String phone)  {
        this.name = name;
		this.phone = phone;
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
	
	public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
       
    public String toString(){
        return  "Customer Name: " + this.name+ "\nPhone: " + this.phone;
    } 
}  	