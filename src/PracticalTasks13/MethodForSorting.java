package PracticalTasks13;

import java.util.ArrayList;
import java.util.List;

public class MethodForSorting {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Mercedes-Benz");
        cars.add("Volkswagen");
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("BMW");
        cars.add("Audi");

        System.out.println("Origin list: " + cars);

        cars.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
//        cars.sort(String::compareToIgnoreCase);

        System.out.println("Sorted list: " + cars);
    }
}
