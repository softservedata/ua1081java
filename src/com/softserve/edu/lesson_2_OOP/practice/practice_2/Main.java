package com.softserve.edu.lesson_2_OOP.practice.practice_2;

import java.util.Scanner;

public class Main {

    public static double getTotal(double a, double b) {
        return a + b;
    }

    public static double getAvg(double a, double b) {
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num:");
        double first = sc.nextDouble();
        System.out.println("Enter second num:");
        double second = sc.nextDouble();
        System.out.println("Select options:");
        System.out.println("1.Get total.(total)");
        System.out.println("2.Get average.(avg)");
        String choice = sc.next();
        if (choice.toLowerCase().equals("total")) {
            System.out.print("The sum of " + first + " and " + second + " is = " + Main.getTotal(first, second));
        }
        if (choice.toLowerCase().equals("avg")) {
            System.out.print("The avg of " + first + " and " + second + " is = " + Main.getAvg(first, second));

        }


    }

}
