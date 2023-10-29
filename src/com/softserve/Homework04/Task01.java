package com.softserve.Homework04;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("******* Task 1 *******");
        Scanner scanner = new Scanner(System.in);
        double number1;
        double number2;
        double number3;
        System.out.print(" Enter float number1: ");
        number1 = scanner.nextDouble();
        System.out.print(" Enter float number2: ");
        number2 = scanner.nextDouble();
        System.out.print(" Enter float number3: ");
        number3 = scanner.nextDouble();
        if (inRange(number1) && inRange(number2) && inRange(number3)) {
            System.out.println(" All numbers in range [-5 ; 5]");
        } else {
            System.out.println("Not all numbers in range [-5 ; 5]");
        }
    }

    public static boolean inRange(double number) {
        return number >= -5 && number <= 5;
    }
}
