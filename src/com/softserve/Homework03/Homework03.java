package com.softserve.Homework03;

import com.softserve.Homework03.Task01.Triangle;
import com.softserve.Homework03.Task02.Numbers;
import com.softserve.Homework03.Task03.Person;


import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("******* Task 1 *******");
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter side a: ");
        triangle.setSideA(scanner.nextDouble());
        System.out.print(" Enter side b: ");
        triangle.setSideB(scanner.nextDouble());
        System.out.print(" Enter side c: ");
        triangle.setSideC(scanner.nextDouble());
        System.out.print(" Area of triangle -> " + triangle.calculateArea());
    }

    public static void task2() {
        System.out.println("\n******* Task 2 *******");
        Numbers task2 = new Numbers();
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter number1: ");
        task2.setNumber1(scanner.nextInt());
        scanner.nextLine();
        System.out.print(" Enter number2: ");
        task2.setNumber2(scanner.nextInt());
        scanner.nextLine();
        System.out.print(" Enter number3: ");
        task2.setNumber3(scanner.nextInt());
        scanner.nextLine();
        System.out.print(" The smallest number -> " + task2.getTheSmallestNumber());
    }

    public static void task3() {
        System.out.println("\n******* Task 3 *******");
        Person[] personArray = new Person[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < personArray.length; i++) {
            System.out.println(" Creating person #" + (i + 1));
            personArray[i] = new Person();
            personArray[i].input();
            personArray[i].output();
            String newFirstName;
            String newLastName;
            System.out.println("If u wanna change first name or/and last name, enter a value. Press enter to skip.");
            System.out.print(" Enter first name: ");
            newFirstName = scanner.nextLine();
            System.out.print(" Enter last name: ");
            newLastName = scanner.nextLine();
            personArray[i].changeName(newFirstName, newLastName);

        }
    }
}
