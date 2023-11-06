package com.softserve.Homework05.Task1;

import java.util.Arrays;

public class Task1_03 {
    public static void main(String[] args) {
        System.out.print(" Enter 5 numbers: ");
        int[] arrayNumbers = Task1_02.entryNumbers(5);
        boolean findSecondPositive = false;
        boolean findFirstPositive = false;
        int indexSecondPositiveNumber = -1;
        int minValue = Integer.MAX_VALUE;
        int indexMinValue = -1;
        int productEvenNumbers = 1;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 2 == 0) {
                if (arrayNumbers[i] != 0) {
                    productEvenNumbers *= arrayNumbers[i];
                }
                if (findFirstPositive & !findSecondPositive) {
                    indexSecondPositiveNumber = i;
                    findSecondPositive = true;
                }
                findFirstPositive = true;

            }
            if (arrayNumbers[i] < minValue) {
                minValue = arrayNumbers[i];
                indexMinValue = i;
            }
        }
        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println(" Position of second positive number: " + indexSecondPositiveNumber +
                "\n Minimum value: " + minValue + " and its position in the array: " + indexMinValue +
                "\n Product of all entered even numbers: " + productEvenNumbers);
    }

}
