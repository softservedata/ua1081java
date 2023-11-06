package com.softserve.practicaltask04_arrays_loops.practask03;

import java.util.Arrays;

public class PracticalTask03 {
    public static void getCalculationUsingRandomNumbers() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
        }
        System.out.println(Arrays.toString(array));

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Biggest number in the array is " + max);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println("Sum of positive numbers is " + sum);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        System.out.println("Number of negative numbers is " + count);
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPositive++;
            } else if (array[i] < 0) {
                countNegative++;
            }
        }
        if (countPositive > countNegative) {
            System.out.println("There are more positive values in the array");
        } else if (countPositive < countNegative) {
            System.out.println("There are more negative values in the array");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }
    }
}
