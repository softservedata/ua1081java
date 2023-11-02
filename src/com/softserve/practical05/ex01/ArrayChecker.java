package com.softserve.practical05.ex01;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class ArrayChecker {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //sorting
        String[] arrayOfString = {"elephant", "cat", "dog", "lion"};
        System.out.println(Arrays.toString(arrayOfString));
        Arrays.sort(arrayOfString);
        System.out.println(Arrays.toString(arrayOfString));

        //calculating average value
        double[] arrayOfDouble = {23, 34, 5, 17, 28};
        double sum = 0;
        for (double num : arrayOfDouble) {
            sum += num;
        }
        System.out.println(Arrays.toString(arrayOfDouble));
        System.out.println("Average is: " + (sum / arrayOfDouble.length));

        //checking value in arrays
        System.out.println("Please, input a value (word or number): ");
        double doubleInput;
        String stringInput;

        if (sc.hasNextDouble()) {
            doubleInput = sc.nextDouble();
            Arrays.sort(arrayOfDouble);

            if ((Arrays.binarySearch(arrayOfDouble, doubleInput)) >= 0) {
                System.out.printf("Value %s is found in a number array", doubleInput);
            } else {
                System.out.printf("Value %s is not found in a number array", doubleInput);
            }
        } else if (sc.hasNextLine()) {
            stringInput = sc.nextLine();
            if (Arrays.binarySearch(arrayOfString, stringInput) >= 0) {
                System.out.printf("Value %s is found in a string array", stringInput);
            } else {
                System.out.printf("Value %s is not found in a string array", stringInput);
            }
        } else {
            System.out.println("Please, input a word or number");
        }
    }
}
