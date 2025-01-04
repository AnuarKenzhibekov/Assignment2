import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    List<Order> orders;
    String shippingAddress;

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
        if (product.getStock() >= quantity) {
            Order order = new Order( this, product, quantity);
            orders.add(order);
            product.reduceStock(quantity);
            System.out.println("Order placed: " + order.orderId);
        } else {
            System.out.println("Not enough stock");
        }
    }

    public cancelOrder(Order order){
        orders.remove(order);
        System.out.println("Order cancelled: " + order);

    }

    public void cancelOrder(Order order) {
        order.cancelOrder();
        orders.remove(order);
        order.product.increaseStock(order.quantity);
    }
}
