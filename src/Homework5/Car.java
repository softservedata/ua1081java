package Homework5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Car {
    static Scanner scanner = new Scanner(System.in);
    private final String type;
    private final int yearOfProduction;
    private final double engineCapacity;

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Sedan", 2021, 3.5);
        Car car2 = new Car("Suv", 2020, 4.8);
        Car car3 = new Car("Minivan", 2022, 2.0);
        Car car4 = new Car("Roadster", 2023, 2.8);

        Car[] cars = {car1, car2, car3, car4};

        System.out.println("Enter a model year to filter cars: ");
        int targetYar = scanner.nextInt();
        filterCarByYear(cars, targetYar);

        sortByYear(cars);
        System.out.println("Cars sorted by year of production:");
        for (Car car : cars) {
            System.out.println("Year of production: " + car.yearOfProduction + "; Type: " + car.type + "; Engine capacity: " + car.engineCapacity);
        }

    }

    private static void filterCarByYear(Car[] cars, int year) {
        System.out.println("Cars of model year " + year + ":");
        for (Car car : cars) {
            if (car.yearOfProduction == year) {
                System.out.println("Type: " + car.type + "; Engine capacity: " + car.engineCapacity);
            } else {
                System.out.println("There is no car with this year of production on our list.");
                break;
            }
        }
    }

    private static void sortByYear(Car[] cars) {
        Arrays.sort(cars, Comparator.comparingInt(Car::getYearOfProduction));
    }
}
