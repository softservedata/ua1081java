package com.softserve.Homework05.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_02 {
    public static void main(String[] args) {
        System.out.println(" Enter 10 numbers: ");
        int[] arrayNumbers = entryNumbers(10);
        int sumNumbers = sumNumbers(arrayNumbers);
        int productNumbers = productNumbers(arrayNumbers);
        if (sumNumbers != Integer.MIN_VALUE) {
            System.out.println(" Sum of the first five elements = " + sumNumbers);
        } else {
            System.out.println(" Numbers are not positive!");
        }
        if (productNumbers != Integer.MIN_VALUE) {
            System.out.println(" Product of the last five elements = " + productNumbers);
        } else {
            System.out.println(" Numbers are not negative!");
        }


    }

    public static int productNumbers(int[] arrayNumbers) {
        int product = 1;
        for (int i = arrayNumbers.length / 2; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] < 0) {
                product *= arrayNumbers[i];
            } else {
                return Integer.MIN_VALUE;
            }
        }
        return product;
    }

    public static int sumNumbers(int[] arrayNumbers) {
        int sum = 0;
        for (int i = 0; i < arrayNumbers.length / 2; i++) {
            if (arrayNumbers[i] > 0) {
                sum += arrayNumbers[i];
            } else {
                return Integer.MIN_VALUE;
            }
        }
        return sum;
    }

    public static int[] entryNumbers(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            try {
                arrayNumbers[i] = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                throw new InputMismatchException(" Wrong entry!");
            }
        }
        return arrayNumbers;
    }
}
