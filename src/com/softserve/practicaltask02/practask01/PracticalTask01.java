package com.softserve.practicaltask02.practask01;

import java.util.Scanner;

public class PracticalTask01 {
    static Scanner scanner = new Scanner(System.in);

    public static double getTotal(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double getAverage(double num1, double num2) {
        double avg = (num1 + num2) / 2;
        return avg;
    }

    public static void getNumber() {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double sum = getTotal(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        double average = getAverage(num1, num2);
        System.out.println("The average of " + num1 + " and " + num2 + " is " + average);
    }
}
