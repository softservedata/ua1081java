package com.softserve.HomeWorks.HomeWork05Ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void displayCarInfo() {
        System.out.println("Type: " + type);
        System.out.println("Year of Production: " + yearOfProduction);
        System.out.println("Engine Capacity: " + engineCapacity + " liters");
        System.out.println();
    }

    public static void main(String[] args) {
        Car[] cars = new Car[4];

        // Initialize four instances of class Car
        cars[0] = new Car("Sedan", 2022, 2.0);
        cars[1] = new Car("SUV", 2019, 3.5);
        cars[2] = new Car("Hatchback", 2021, 1.8);
        cars[3] = new Car("Convertible", 2020, 2.5);

        // Output result for cars with a certain model year
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year to display cars of that model year: ");
        int inputYear = scanner.nextInt();
        displayCarsByYear(cars, inputYear);

        // Sort cars by the field "year of production"
        Arrays.sort(cars, (car1, car2) -> Integer.compare(car1.getYearOfProduction(), car2.getYearOfProduction()));

        // Output sorted cars
        System.out.println("Cars sorted by the field 'year of production':");
        for (Car car : cars) {
            car.displayCarInfo();
        }
    }

    private static void displayCarsByYear(Car[] cars, int year) {
        System.out.println("Cars of model year " + year + ":");
        for (Car car : cars) {
            if (car.getYearOfProduction() == year) {
                car.displayCarInfo();
            }
        }
    }
}

