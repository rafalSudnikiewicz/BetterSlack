package sandbox.lambdas;

import java.util.Arrays;
import java.util.List;

public class LambdasDemo {
    public static void main(String[] args) {
//        Checker evenChecker = new Checker() {
//            @Override
//            public boolean check(int number) {
//                return number % 2 == 0;
//            }
//        };

        Checker evenChecker = number -> number % 2 == 0;
        Checker oddChecker = number -> number % 2 == 1;


        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);

        for (int number : numbers) {
            if (evenChecker.check(number)) {
                System.out.println(number + " jest parzysta");
            }
        }

        filter(numbers,number -> number % 2 == 0);
    }

    private static void filter(List<Integer> list, Checker checker) {
        for (int number : list) {
            if (checker.check(number)) {
                System.out.println(number + " jest parzysta");
            }
        }
    }
}
