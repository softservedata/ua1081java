package com.softserve.HomeWorks.Homework05Ex1;

import java.util.Scanner;

public class SumProductCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 integer numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int result = calculateResult(numbers);

        System.out.println("Result: " + result);
    }

    private static int calculateResult(int[] numbers) {
        if (numbers.length >= 10) {
            int sum = 0;
            int product = 1;

            for (int i = 0; i < 5; i++) {
                if (numbers[i] > 0) {
                    sum += numbers[i];
                } else {
                    product *= numbers[i + 5];
                }
            }

            return (sum > 0) ? sum : product;
        } else {
            System.out.println("Not enough numbers entered.");
            return 0;
        }
    }
}

