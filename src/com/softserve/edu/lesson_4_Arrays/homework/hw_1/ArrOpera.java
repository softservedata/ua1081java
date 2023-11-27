package com.softserve.edu.lesson_4_Arrays.homework.hw_1;

import java.util.Arrays;
import java.util.Scanner;
//better to do two separate classes for logic and demonstration
public class ArrOpera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner should be closed after using or better to do it static
        System.out.println("Enter 5 numbers");//more informative message about what user should enter

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int secondPositivePosition = findSecondPositivePosition(arr);
        System.out.println(secondPositivePosition);
        int[] minValueAndPosition = findMinValueAndPosition(arr);
        System.out.println(Arrays.toString(minValueAndPosition));
        int evenProd = evenProd(arr);
        System.out.println(evenProd);


    }

    /**
     * Method returns second positive number in array
     * @param arr
     * @return
     */
    public static int findSecondPositivePosition(int[] arr) {
        int posCounter = 0;
        for (int j : arr) {
            if (j > 0) {
                posCounter++;
            }
            if (posCounter == 2) {
                return j;
            }
        }
        return -1;

    }
    /**
     * Method returns min value and position of min value in array
     * @param arr
     * @return
     */

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

    /**
     * Method returns product of even numbers in array
     * @param arr
     * @return
     */

    public static int evenProd(int[] arr) {
        int prod = 1;//what is prod? better to use more informative name
        for (int j : arr) {
            if (j == 0) {
                continue;
            }
            if (j % 2 == 0) {
                prod *= j;
            }
        }
        return prod;
    }
}
//Your method findSecondPositivePosition returns -1 if it doesn't find a second positive number,
// which is good.
// However, it might be helpful to print a message to the user indicating this situation for better clarity.
//
//In evenProd, if there are no even numbers (or they are all zeros),
// the method will return 1, which might be misleading.
