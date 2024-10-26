import java.time.LocalDate;

public class Order {
    private int orderCode;
    private Item deviceOrdered;
    private Customer customer;
    private LocalDate orderDate;
    private LocalDate expectedArrivalDate;
    private double finalCost;
    private boolean isExecuted;

    public Order(int orderCode, Item deviceOrdered, Customer customer, LocalDate orderDate, LocalDate expectedArrivalDate, double finalCost) {
        this.orderCode = orderCode;
        this.deviceOrdered = deviceOrdered;
        this.customer = customer;
        this.orderDate = orderDate;
        this.expectedArrivalDate = expectedArrivalDate;
        this.finalCost = finalCost;
        this.isExecuted = false;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public Item getDeviceOrdered() {
        return deviceOrdered;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getExpectedArrivalDate() {
        return expectedArrivalDate;
    }

    public double getFinalCost() {
        return finalCost;
    }

    public boolean getIsExecuted() {
        return isExecuted;
    }

    public void setIsExecuted(boolean executed) {
        isExecuted = executed;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String toString() {
        return "Order code: " + this.orderCode + "\nDevice ordered: " + "\n" + this.deviceOrdered.toString() + "\n" + this.customer.toString() + "\n" + this.orderDate + "\n" + this.expectedArrivalDate + "\nFinal price: " + this.finalCost;
    }
}
