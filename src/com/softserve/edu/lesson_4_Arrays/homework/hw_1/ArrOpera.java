package com.softserve.edu.lesson_4_Arrays.homework.hw_1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrOpera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x = false;
        try {
            System.out.println("Enter 5 numbers");
            int[] arr = new int[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }


            int secondPositivePosition = findSecondPositivePosition(arr);
            System.out.println("Second position " + secondPositivePosition);
            int[] minValueAndPosition = findMinValueAndPosition(arr);
            System.out.println("Min value and position " + Arrays.toString(minValueAndPosition));
            int evenProd = evenProd(arr);
            System.out.println("Even prod " + evenProd);
        } catch (InputMismatchException e) {
            System.err.println("Please enter only numbers");
        }
    }

    public static int findSecondPositivePosition(int[] arr) {
        int posCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posCounter++;
            }
            if (posCounter == 2) {
                return arr[i];
            }
        }
        return -1;

    }

    public static int[] findMinValueAndPosition(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        int minPosition = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minPosition = i;
            }
        }
        return new int[]{minValue, minPosition};

    }


    public static int evenProd(int[] arr) {
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            if (arr[i] % 2 == 0) {
                prod *= arr[i];
            }
        }
        return prod;
    }
}

