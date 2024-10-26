import java.time.LocalDate;

public class Sale {
    private int code;
    private Item model;
    private Customer customer;
    private LocalDate date;
    private double price;

    public Sale(int code, Item model, Customer customer, LocalDate date, double price) {
        this.code = code;
        this.model = model;
        this.customer = customer;
        this.date = date;
        this.price = price;
    }

    public int getCode() {
        return this.code;
    }

    public double getPrice() {
        return this.price;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Sale code: " + this.code + "\n" + this.model.toString() + "\n" + this.customer.toString() + "\n" + this.date + "\nPrice: " + this.price;
    }
}
