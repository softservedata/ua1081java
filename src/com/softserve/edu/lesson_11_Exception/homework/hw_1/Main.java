package com.softserve.edu.lesson_11_Exception.homework.hw_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter 1st number");
                double first = scanner.nextDouble();
                System.out.println("Enter 2nd number");
                double second = scanner.nextDouble();
                dev(first, second);
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
                scanner = new Scanner(System.in);
            }

        }


    }
    //it's not correct, did you try divide by zero? what will happen?
    static void dev(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("The second number cant be 0");
        }
        System.out.println(a / b);
    }
}
