package com.softserve.practicaltask04_arrays_loops.practask01;

import java.util.Arrays;
import java.util.Scanner;

public class PracticalTask01 {
    static Scanner scanner = new Scanner(System.in);

    public static void createStringArrayAndSortArray() {
        String[] array = new String[]{"One", "Two", "Three", "Four", "Five"};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void calcAverageNumberUsingArray() {
        double average;
        int sum = 0;
        int[] array = new int[]{5, 6, 3, 4, 2};
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = (double) sum / array.length;
        System.out.println("Average is " + average);
    }

    public static void checkArrayContainsEnteredNumber() {
        System.out.println("Enter integer number: ");
        int enteredNumber = scanner.nextInt();
        int[] array = new int[]{2, 3, 5, 4, 7};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == enteredNumber) {
                System.out.println("Array contains this number: " + enteredNumber);
                return;
            }
        }
        System.out.println("Array does not contain this number: " + enteredNumber);
    }
}
