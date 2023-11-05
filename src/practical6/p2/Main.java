package practical6.p2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Car[] cars = new Car[]{
          new Sedan("BMW", 2023),
          new Truck("DAF", 2022)
        };
        System.out.println(Arrays.toString(cars));
    }
}