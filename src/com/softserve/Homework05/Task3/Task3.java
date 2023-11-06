package com.softserve.Homework05.Task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[4];
        cars[0] = new Car("Sedan", 2019, 2.0);
        cars[1] = new Car("SUV", 2021, 3.5);
        cars[2] = new Car("Hatchback", 2017, 1.6);
        cars[3] = new Car("Convertible", 2020, 2.5);
        System.out.print(" Enter year of production: ");
        int yearProduction = scanner.nextInt();
        scanner.close();
        System.out.println(" Cars with " + yearProduction + " year production:");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearProduction() == yearProduction) {
                System.out.println(cars[i]);
            }
        }
        System.out.println(" Cars, sorted by year of production:");
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length - 1; j++) {
                if (cars[j].getYearProduction() > cars[j + 1].getYearProduction()) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(cars));
    }
}
