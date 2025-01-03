public class Order {
    public String orderID;
    public Customer customer;
    public Product product;
    public int quantity;
    public double totalPrice;
    public String status (Placed, Cancelled, Completed)

    public Order(String orderID, Customer customer, Product product, int quantity, double totalPrice) {
        this.orderID = orderID;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }
}


