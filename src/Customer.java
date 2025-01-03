import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private List<Order> orders;
    private String shippingAddress;

    public Customer(int userId, String name, String email, String shippingAddress) {
        super(userId, name, email);
        this.shippingAddress = shippingAddress;
        this.orders = new ArrayList<>();
    }

    @Override
    public void displayDetails() {
        System.out.println("Customer ID: " + getUserId());
        System.out.println("Customer Name: " + getName());
        System.out.println("Customer Email: " + getEmail());
        System.out.println("Customer Shipping Address: " + shippingAddress);
        System.out.println("Customer Orders: " + orders.size());
    }

    public void placeOrder(Product product, int quantity) {
        product.reduceStock(quantity);
        Order order = new Order (Product product, int quantity)
        orders.add(order)
        System.out.println("Order placed successfully: " + order);
    }

    public cancelOrder(Order order){
        orders.remove(order);
        System.out.println("Order cancelled: " + order);

    }
}
