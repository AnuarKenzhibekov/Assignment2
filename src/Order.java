public class Order {
    static int orderCount = 1;
    String orderId;
    Customer customer;
    Product product;
    int quantity;
    double totalPrice;
    String status;

    public Order(Customer customer, Product product, int quantity) {
        this.orderId = "ORDER" + orderCount++;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = product.getPrice() * quantity;
        this.status = "Placed";
    }

    public String getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
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



