package com.softserve.HomeWorks.HomeWork03_Ex1_2;

import java.util.Scanner;


// In this program tasks 1 and 2 from theme 3(Introduction to OOP)
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Task selection menu:");
            System.out.println("1. Task 1");
            System.out.println("2. Task 2");
            System.out.println("3. Exit");

            System.out.println("Select a task (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Task1();
                    break;

                case 2:
                    Task2();
                    break;

                case 3:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Incorrect selection. Try again");
                    break;
            }


        } while (choice != 3);


    }

    public static void Task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input side 1: ");
        double a = scanner.nextDouble();

        System.out.println("Input side 2: ");
        double b = scanner.nextDouble();

        System.out.println("Input side 3: ");
        double c = scanner.nextDouble();

        if ((a >= 0) && (b >= 0) && (c >= 0)) {
            double p = (a + b + c) / 2;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("The area of the triangle is: " + S);

        } else {
            System.out.println("The sides of triangle should be more than zero");
        }
    }

    public static void Task2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Input the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Input the third number: ");
        int num3 = scanner.nextInt();

        int smallest = findSmallestNumber(num1, num2, num3);

        if (smallest == Integer.MIN_VALUE) {
            System.out.println("All three numbers are equal.");
        } else {
            System.out.println("The smallest number is: "  + smallest);
        }

    }

    public static int findSmallestNumber(int a, int b, int c) {

        if (a == b && b == c) {
            return Integer.MIN_VALUE;
        }

        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }

    }
}