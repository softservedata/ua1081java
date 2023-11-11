package com.softserve.practical06.ex02;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[] {
                new Truck("Ford Maverick", 191.0, 2022),
                new Truck("Hyundai Santa Cruz", 225.0,2023),
                new Sedan("Kia Rio", 199.0, 2020),
                new Sedan("Toyota Corolla", 235.0, 2018)
        };
        for (Car car : cars) {
            System.out.println(car.toString());
            car.run();
            car.stop();
        }
    }
}
