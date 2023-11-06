package com.softserve.edu.lesson_5_OOP_Concepts.practice.practice_2;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{new Sedan("Audi", 270, 2017),
                new Sedan("Skoda", 220, 2015),
                new Truck("MAN", 200, 2010),
                new Sedan("BMW", 250, 1999),
                new Truck("Dodge", 250, 2011)
        };

        for (Car car : cars) {
            System.out.println(car);
            car.run();
            car.stop();
            System.out.println();
        }
    }
}
