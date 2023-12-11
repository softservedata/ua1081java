package com.softserve.edu.HW5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HomeWork3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Car car1 = new Car("SUV", 2);
        Car car2 = new Car("Minivan", 1.5);
        Car car3 = new Car("Sedan", 1);
        Car car4 = new Car();

        System.out.println("Input the year of poduction for car 1: ");
        car1.setYearOfProduction(sc.nextInt());

        System.out.println("Input the year of poduction for car 2: ");
        car2.setYearOfProduction(sc.nextInt());

        System.out.println("Input the year of poduction for car 3: ");
        car3.setYearOfProduction(sc.nextInt());

        System.out.println("Input the year of poduction for car 4: ");
        car4.setYearOfProduction(sc.nextInt());

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        System.out.println("\n Now you can see sorted List of Cars: \n");

        List<Car> myList = new ArrayList<>();
        myList.add(car1);
        myList.add(car2);
        myList.add(car3);
        myList.add(car4);
        Collections.sort(myList);

        for (Car obj : myList) {
            System.out.println(obj);
        }

    }
    
}
