package com.softserve.HomeWorks.Homework05Ex1;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 integer numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        findSecondPositivePosition(numbers);
        findMinValueAndPosition(numbers);
        calculateProductOfEvenNumbers(numbers);
    }

    private static void findSecondPositivePosition(int[] numbers) {
        int countPositives = 0;
        int position = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                countPositives++;
                if (countPositives == 2) {
                    position = i + 1; // Positions are 1-based
                    System.out.println("Position of the second positive number: " + position);
                    return;
                }
            }
        }

        System.out.println("Less than two positive numbers entered.");
    }

    private static void findMinValueAndPosition(int[] numbers) {
        int minValue = Integer.MAX_VALUE;
        int minPosition = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minPosition = i + 1; // Positions are 1-based
            }
        }

        System.out.println("Minimum value: " + minValue);
        System.out.println("Position of minimum value: " + minPosition);
    }

    private static void calculateProductOfEvenNumbers(int[] numbers) {
        int product = 1;

        for (int num : numbers) {
            if (num % 2 == 0 && num != 0) {
                product *= num;
            }
        }

        System.out.println("Product of all entered even numbers (excluding 0): " + product);
    }
}

