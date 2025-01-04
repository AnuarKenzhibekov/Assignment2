public class Order {
    private static int orderCount = 1;
    public String orderId;
    public Customer customer;
    public Product product;
    public int quantity;
    public double totalPrice;
    public String status;

    public Order(Customer customer, Product product, int quantity, double totalPrice) {
        this.orderId = "ORDER" + orderCount++;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = product.getPrice() * quantity;
        this.status = 'Placed';
    }

    public void cancelOrder() {
        status = "Cancelled";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.name);
        System.out.println("Product: " + product.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Status: " + status);
    }
}



