package com.softserve.homework02.task02;

import java.util.Scanner;

public class Numbers {
    static Scanner scanner = new Scanner(System.in);

    /**
     * This method finds the smallest number between numbers
     *
     * @param size - number of integer numbers entered
     */
    public static void findSmallestNumber(int size) {
        int[] arr = new int[size];
        for (int i = 0, j = 1; i < size; i++, j++) {
            System.out.print("Input the number " + j + ": ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The smallest number is " + min);
    }
}
