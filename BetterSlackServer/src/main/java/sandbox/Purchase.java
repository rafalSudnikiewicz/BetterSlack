package sandbox;

public class Purchase {
    private final String productName;
    private final double price;

    public Purchase() {
        productName = null;
        price = 0;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public Purchase(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}