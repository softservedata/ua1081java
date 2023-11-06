package com.softserve.homework04_arrays_loops.Task03;

import java.util.Objects;
import java.util.Scanner;

public class Car {
    static Scanner scanner = new Scanner(System.in);
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public static void findCarByModelYear(Car car1, Car car2, Car car3, Car car4) {
        System.out.println("Enter car model year: ");
        int year = scanner.nextInt();
        Car[] array = new Car[]{car1, car2, car3, car4};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (year == array[i].getYearOfProduction()) {
                System.out.println(array[i].getType() + " " + year + " year of release");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no cars " + year + " year");
        }
    }

    //    Refactored method for Unit Tests
    public static Car findCarByModelYearForTest(Car car1, Car car2, Car car3, Car car4, int year) {
        Car[] array = new Car[]{car1, car2, car3, car4};
        int count = 0;
        Car car = null;
        for (int i = 0; i < array.length; i++) {
            if (year == array[i].getYearOfProduction()) {
                car = array[i];
            }
        }
        return car;
    }

    public static void sortCarsByYearOfProduction(Car car1, Car car2, Car car3, Car car4) {
        Car[] arr = new Car[]{car1, car2, car3, car4};
        Car temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getYearOfProduction() < arr[j].getYearOfProduction()) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //    Refactored method for Unit Tests
    public static Car[] sortCarsByYearOfProductionForTest(Car car1, Car car2, Car car3, Car car4) {
        Car[] arr = {car1, car2, car3, car4};
        Car temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getYearOfProduction() < arr[j].getYearOfProduction()) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
