package com.softserve.homework04.homework;

import java.util.Scanner;

public class NumbersRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean allNumbersInRange = true;
        int inputNumber;
        int i;

        for (i = 1; i <= 3; i++) {
            System.out.print("Run " + i + ": Please enter the number: ");
            inputNumber = scanner.nextInt();
            if (inputNumber >= -5 && inputNumber <= 5) {
                continue;
            };
            allNumbersInRange = false;
        }

        System.out.println((allNumbersInRange == true) ? "All numbers are in the range [-5, 5]." : "NOT all numbers are in the range [-5, 5].");
    }
}
