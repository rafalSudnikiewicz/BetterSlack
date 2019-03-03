package sandbox.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarSelectionView {
    private int availableCars;
    private List<Car> originalList;
    private List<Car> displayedCars;

    public CarSelectionView() {
        displayedCars = new ArrayList<>();
        Random random = new Random();
        originalList = Arrays.asList(
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000,1959+random.nextInt(60)),
                new Car("Passat", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Passat", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Passat", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Passat", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Passat", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Passat", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Passat", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Passat", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000,1959+random.nextInt(60)),
                new Car("Tesla", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000,1959+random.nextInt(60)),
                new Car("Ferrari", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Tesla", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000,1959+random.nextInt(60)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000,1959+random.nextInt(60)),
                new Car("Ferrari", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000,1959+random.nextInt(60)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000,1959+random.nextInt(60)),
                new Car("Ferrari", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000,1959+random.nextInt(60)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000,1959+random.nextInt(60)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000,1959+random.nextInt(60)),
                new Car("Tesla", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000,1959+random.nextInt(60)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000,1959+random.nextInt(60)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, 1959+random.nextInt(60)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000,1959+random.nextInt(60))
        );
    }

    public void applyFilter(Predicate<Car> filter) {
        displayedCars =originalList.stream().filter(filter).collect(Collectors.toList());
        System.out.println(displayedCars.size());
        displayedCars.forEach(car -> System.out.println(car.toString()));

    }
}
