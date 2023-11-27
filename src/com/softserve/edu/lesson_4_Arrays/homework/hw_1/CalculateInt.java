package com.softserve.edu.lesson_4_Arrays.homework.hw_1;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//use static import
        System.out.println("Please enter 10 integer numbers: ");
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int calculate = calculate(arr);
        System.out.println(calculate);
        sc.close();//scanner should be closed after using or better to do it static
    }

    /**
     * Method returns sum of positive numbers in array
     *
     * @param arr
     * @return
     */
    static int calculate(int[] arr) {
        int sum = 0;
        int produc = 1;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            } else {
                for (int j = 5; j < arr.length; j++) {
                    produc *= arr[j];
                }
                return produc;
            }
        }
        return sum;
    }

}

