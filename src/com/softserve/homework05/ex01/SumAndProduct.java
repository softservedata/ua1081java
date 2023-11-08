package com.softserve.homework05.ex01;

import java.util.Arrays;
import java.util.Scanner;

public class SumAndProduct {
    static Scanner sc = new Scanner(System.in);
    int NUMBER_OF_INPUTS = 10;

    public int[] createArrayOfInputs() {
        int[] arrayOfInputs = new int[NUMBER_OF_INPUTS];
        System.out.println("Please, insert 10 integers: ");
        for (int i = 0; i < NUMBER_OF_INPUTS; i++) {
            arrayOfInputs[i] = sc.nextInt();
        }
        return arrayOfInputs;
    }

    public int calculateSumOfFirstPosFive(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public int calculateProductOfLastNegFive(int[] array) {
        int product = 1;
        for (int i = array.length / 2; i < array.length; i++) {
            if (array[i] < 0) {
                product *= array[i];
            }
        }
        if (product == 1) return 0;
        return product;
    }

    public static void main(String[] args) {
        SumAndProduct sumAndProduct = new SumAndProduct();
        int[] inputArray = sumAndProduct.createArrayOfInputs();
        System.out.println(Arrays.toString(inputArray));
        System.out.printf("Sum of positive values in first half of elements is %s%n",
                sumAndProduct.calculateSumOfFirstPosFive(inputArray));
        if (sumAndProduct.calculateProductOfLastNegFive(inputArray) != 0) {
            System.out.printf("Product of negative values in last half of elements is %s%n",
                    sumAndProduct.calculateProductOfLastNegFive(inputArray));
        } else {
            System.out.println("There are no negative values in last half of elements");
        }
    }
}
