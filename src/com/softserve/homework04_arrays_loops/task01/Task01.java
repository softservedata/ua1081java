package com.softserve.homework04_arrays_loops.task01;

import java.util.Scanner;

public class Task01 {
    static Scanner scanner = new Scanner(System.in);

    public static void calcDaysInMonth() {
        int[] arrMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Enter the number of month: ");
        int numberMonth = scanner.nextInt();
        int num = 0;
        if (numberMonth <= 12 && numberMonth > 0) {
            for (int i = 0, j = 1; i < arrMonths.length; i++, j++) {
                if (numberMonth == j) {
                    num = arrMonths[i];
                }
            }
            System.out.println("The number of days in " + numberMonth + " month is " + num);
        } else {
            System.out.println("You entered incorrect month number");
        }
    }

    //    Refactored method for Unit Tests
    public static int calcDaysInMonthForTest(int numberMonth) {
        int[] arrMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;
        for (int i = 0; i < arrMonths.length; i++) {
            if (numberMonth == i - 1) {
                count = arrMonths[i];
            }
        }
        return count;
    }


    public static void sumFirstFiveOrMultiplicationLastFive() {
        System.out.println("Enter 10 integers numbers: ");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] >= 0) {
                sum = sum + array[i];
            } else {
                for (int j = 5; j < array.length; j++) {
                    prod *= array[j];
                }
                System.out.println("Multiplication = " + prod);
                return;
            }
        }
        System.out.println("Sum = " + sum);
    }


    //    Refactored method for Unit Tests
    public static int sumFirstFiveOrMultiplicationLastFiveForTest(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10) {
        int[] array = new int[]{
                num1, num2, num3, num4, num5, num6, num7, num8, num9, num10
        };
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] >= 0) {
                sum = sum + array[i];
            } else {
                for (int j = 5; j < array.length; j++) {
                    prod *= array[j];
                }
                return prod;
            }
        }
        return sum;
    }


    public static void findPositionOfSecondPositiveNumber() {
        System.out.println("Enter 5 integers numbers: ");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
                if (count == 2) {
                    System.out.println("The position of the second positive number is in cell: " + i);
                    return;
                }
            }
        }
        System.out.println("You did not enter at least two positive numbers");
    }

    //    Refactored method for Unit Tests
    public static int findPositionOfSecondPositiveNumberForTest(int num1, int num2, int num3, int num4, int num5) {
        int[] array = new int[]{num1, num2, num3, num4, num5};
        int count = 0;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
                if (count == 2) {
                    index = i;
                }
            }
        }
        return index;
    }

    public static void findMinValueAndPositionInArray() {
        System.out.println("Enter 5 integers numbers: ");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("Minimum value is " + min + " and its position in the array is : " + index);
    }

    //    Refactored method for Unit Tests
    public static int findMinValueAndPositionInArrayForTest(int num1, int num2, int num3, int num4, int num5) {
        int[] array = new int[]{num1, num2, num3, num4, num5};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void calcMultiplicationOfAllEnteredEvenNumbers() {
        System.out.println("Enter 5 integers numbers: ");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int prod = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                prod *= array[i];
            }
        }
        System.out.println("Multiplication entered even numbers = " + prod);
    }


    //    Refactored method for Unit Tests
    public static int calcMultiplicationOfAllEnteredEvenNumbersForTest(int num1, int num2, int num3, int num4, int num5) {
        int[] array = new int[]{num1, num2, num3, num4, num5};
        int prod = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                prod *= array[i];
            }
        }
        return prod;
    }
}



