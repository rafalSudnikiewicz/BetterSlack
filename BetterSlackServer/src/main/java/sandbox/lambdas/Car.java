package sandbox.lambdas;

import lombok.Getter;

@Getter
public class Car {
    private final String brand;
    private final double price;
    private final int producedIn;

    public Car(String brand, double price, int producedIn) {
        this.brand = brand;
        this.price = price;
        this.producedIn = producedIn;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", producedIn=" + producedIn +
                '}';
    }
}