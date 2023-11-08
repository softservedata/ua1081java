package com.softserve.homework05.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class CarAnalyst {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2012, 3.0);
        Car car2 = new Car("VW", 2018, 1.7);
        Car car3 = new Car("Mercedes", 2015, 2.0);
        Car car4 = new Car("Audi", 2017, 2.5);

        Car[] cars = {car1, car2, car3, car4};

        System.out.println("Please, enter year of production:");
        if (sc.hasNextInt()) {
            int input = sc.nextInt();

            for (Car car: cars) {
                if (car.getYearOfProduction() == input) {
                    System.out.println(car);
                }
            }
        } else {
            System.out.println("Please, enter a valid year of production");
        }

        Car[] sortedCarsDesc = cars.clone();
        Car[] sortedCarsAsc = cars.clone();

        for (int i = 0; i < sortedCarsDesc.length - 1; i++) {
            for (int j = sortedCarsDesc.length - 1; j > i; j--) {
                if (sortedCarsDesc[j].getYearOfProduction() > sortedCarsDesc[i].getYearOfProduction()) {
                    Car temp = sortedCarsDesc[i];
                    sortedCarsDesc[i] = sortedCarsDesc[j];
                    sortedCarsDesc[j] = temp;
                }
            }
        }

        for (int i = 0; i < sortedCarsAsc.length - 1; i++) {
            for (int j = sortedCarsAsc.length - 1; j > i; j--) {
                if (sortedCarsAsc[j].getYearOfProduction() < sortedCarsAsc[i].getYearOfProduction()) {
                    Car temp = sortedCarsAsc[i];
                    sortedCarsAsc[i] = sortedCarsAsc[j];
                    sortedCarsAsc[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(sortedCarsDesc));
        System.out.println(Arrays.toString(sortedCarsAsc));
    }
}
