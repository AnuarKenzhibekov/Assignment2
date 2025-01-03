public class Product {
    public String ProductId;
    public String Name;
    public double Price;
    public int stock;

    public Product(String productId, String name, double price, int stock) {
        ProductId = productId;
        Name = name;
        Price = price;
        this.stock = stock;
    }
}


