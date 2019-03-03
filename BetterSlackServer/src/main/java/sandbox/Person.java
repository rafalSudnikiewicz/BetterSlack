package sandbox;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Person {
    private final String name;
    private final String lastName;
    private final int age;
    private final List<Purchase> purchases;
    private final List<Integer> integers;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        purchases = new ArrayList<>();
        integers = new ArrayList<>();
    }

    private Person() {
        name = "John";
        lastName = "Doe";
        age = 18;
        purchases = null;
        integers = null;
    }



    public Person(String name, String lastName, int age, List<Integer> integers) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        purchases = new ArrayList<>();
        this.integers = integers;
    }

    public void addInteger(int i) {
        integers.add(i);
    }

    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
    }
}