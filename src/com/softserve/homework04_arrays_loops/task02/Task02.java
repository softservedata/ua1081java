package com.softserve.homework04_arrays_loops.task02;

import java.util.Scanner;

public class Task02 {
    static Scanner scanner = new Scanner(System.in);

    public static void calcSumOfTwoNumbers() {
        do {
            System.out.println("Enter 2 numbers: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double sum = num1 + num2;
            System.out.println("Sum = " + sum);
            System.out.println("Do you want to perform the operation again? If yes, press 1, if no, any other number.");
        } while (scanner.nextInt() == 1);
    }

    //    Refactored method for Unit Tests
    public static double calcSumOfTwoNumbersForTest(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }
}
