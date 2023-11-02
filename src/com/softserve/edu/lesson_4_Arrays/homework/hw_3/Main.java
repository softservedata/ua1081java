package com.softserve.edu.lesson_4_Arrays.homework.hw_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{new Car(Type.COUPE, 2008, 3.0),
                new Car(Type.HATCHBACK, 1995, 4.3),
                new Car(Type.COUPE, 2008, 2.0),
                new Car(Type.SEDAN, 2010, 2.2)
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year for the car");
        int year = sc.nextInt();

        for (Car car : cars) {
            if (car.getYear() == year) {
                System.out.println(car);
            }
        }
        Car temp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYear() < cars[j].getYear()) {
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(cars));
    }

}


