package com.softserve.homework02.task02;

import java.util.Scanner;

public class Numbers {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * This method finds the smallest number between numbers
     *
     * @param size - number of integer numbers entered
     */
    public static void findSmallestNumber(int size,Scanner scanner) {
        int[] arr = new int[size];

        for (int i = 0, j = 1; i < size; i++, j++) {
            System.out.print("Input the number " + j + ": ");
            arr[i] = scanner.nextInt();
        }
// you don't need j
        //for (int i = 0; i < size; i++) {
        //            System.out.print("Input the number " + (i + 1) + ": ");
        //            arr[i] = scanner.nextInt();
        //        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The smallest number is " + min);
    }
}
// We don't study arrays yet, and in first homework you used library Math.
// So, you can use Math.min() method to find the smallest number.

// For example:
//public static int findSmallest(int a, int b, int c) {
//        return Math.min(a, Math.min(b, c));
//    }

//or
//private static int findSmallest(int a, int b, int c) {
//        int smallest = a;
//
//        if (b < smallest) {
//            smallest = b;
//        }
//
//        if (c < smallest) {
//            smallest = c;
//        }
//
//        return smallest;
//    }