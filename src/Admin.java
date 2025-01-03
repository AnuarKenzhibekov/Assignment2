import java.util.List;
import java.util.ArrayList;

public class Admin extends User {
    private List<Product> products;

    public Admin(int userId, String name, String email) {
        super(userId, name, email);
        this.products = new ArrayList<>();
    }

    @Override
    public void displayDetails() {
        System.out.println("Admin ID: " + getUserId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Number of Products Managed: " + products.size());
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    public void removeProduct(String productId) {
        products.remove(productId);
    }

}
