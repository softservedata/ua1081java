package com.softserve.Homework05.Practical05.Task3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int n = 10;
        int[] numbers = generateArrayRandomInt(n);
        System.out.println(" Numbers:");
        System.out.println(Arrays.toString(numbers));
        System.out.println(" The biggest number in the array: " + maxNumber(numbers));
        System.out.println(" The sum of positive numbers: " + sumPositiveNumers(numbers));
        System.out.println(" Count the number of negative numbers: " + numberOfNegativeNumbers(numbers));
        morePosOrNegNumbers(numbers);
    }

    public static int[] generateArrayRandomInt(int n) {
        Random random = new Random();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(21);
        }
        return numbers;
    }

    public static int maxNumber(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static int sumPositiveNumers(int[] array) {
        int sum = 0;
        for (int x : array) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        return sum;
    }

    public static int numberOfNegativeNumbers(int[] array) {
        int counter = 0;
        for (int x : array) {
            if (x % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static void morePosOrNegNumbers(int[] array) {
        int counterPos = 0;
        int counterNeg = 0;
        for (int x : array) {
            if (x % 2 == 0) {
                counterPos++;
            } else {
                counterNeg++;
            }
        }
        if (counterPos == counterNeg) {
            System.out.println(" There are an equal number of positive and negative values in the array");
        } else if (counterPos > counterNeg) {
            System.out.println(" There are more positive values in the array");
        } else {
            System.out.println(" There are more negative values in the array");
        }
    }
}
