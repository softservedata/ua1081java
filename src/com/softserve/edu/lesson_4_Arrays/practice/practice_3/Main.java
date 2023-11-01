package com.softserve.edu.lesson_4_Arrays.practice.practice_3;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        int max = arr[0];
        int sum = 0;
        int countNeg = 0;
        int countPos = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-1000, 1000);
        }
        System.out.println(Arrays.toString(arr));


        // biggest number
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The biggest " + max);


        //Sum positive numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println("The sum with positive " + sum);


        // Count neg numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                countNeg++;
            } else if (arr[i] > 0) {
                countPos++;
            }
        }
        System.out.println("Count negative numbers " + countNeg);


        if (countNeg > countPos) {
            System.out.println("There are more negative values in the array.");
        } else if (countNeg < countPos) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }


    }


}

