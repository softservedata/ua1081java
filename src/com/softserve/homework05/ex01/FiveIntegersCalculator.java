package com.softserve.homework05.ex01;

import java.util.Arrays;
import java.util.Scanner;

public class FiveIntegersCalculator {
    static Scanner sc = new Scanner(System.in);
    int NUMBER_OF_INPUTS = 5;

    public int[] createInputArray() {
        int[] arr = new int[NUMBER_OF_INPUTS];
        System.out.println("Please, insert 5 integer values: ");
        for (int i = 0; i < NUMBER_OF_INPUTS; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public int findSecondMax(int[] arr) {
        int[] forSort = arr.clone();
        Arrays.sort(forSort);
        return forSort[forSort.length - 2];
    }

    public int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int findPos(int num, int[] arr) {
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                pos = i;
            }
        }
        return pos;
    }

    public int calculateProdOfEven(int[] arr) {
        int product = 1;
        for (int num : arr) {
            if (num % 2 == 0) {
                if (num == 0) continue;
                product *= num;
            }
        }
        if (product == 1) return 0;
        return product;
    }

    public static void main(String[] args) {
        FiveIntegersCalculator fiveIntegersCalculator = new FiveIntegersCalculator();
        int[] array = fiveIntegersCalculator.createInputArray();
        int secondMax = fiveIntegersCalculator.findSecondMax(array);
        int min = fiveIntegersCalculator.findMin(array);
        int prodOfEven = fiveIntegersCalculator.calculateProdOfEven(array);
        int posOfSecondMax = fiveIntegersCalculator.findPos(secondMax, array);
        int posOfMin = fiveIntegersCalculator.findPos(min, array);

        System.out.println(Arrays.toString(array));

        System.out.printf("Second maximal value is %s and its position is %s%n",
                secondMax, posOfSecondMax);

        System.out.printf("Minimal value is %s and its position is %s%n",
                min, posOfMin);

        if (prodOfEven != 0) {
            System.out.printf("Product of all entered even numbers is %s%n", prodOfEven);
        } else {
            System.out.println("There are no even values in the array");
        }
    }
}
