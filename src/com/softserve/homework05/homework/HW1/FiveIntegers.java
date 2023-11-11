package com.softserve.homework05.homework.HW1;

import java.util.Scanner;

public class FiveIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = new int[10];

        System.out.print("Please enter five positive or negative numbers: ");

        for (int i = 0; i <= 4; i++) {
            intArray[i] = scanner.nextInt();
        }

        //Find position of second positive number
        int counter = 0;
        int secondPositiveNumberPosition = 0;
        for (int i = 0; i <= intArray.length - 1 && counter < 2; i++) {
            counter = intArray[i] > 0 ? counter + 1 : counter;
            secondPositiveNumberPosition = counter == 2 ? i : secondPositiveNumberPosition;
        }
        System.out.println(secondPositiveNumberPosition == 0 && counter == 0 ? "No positive numbers were entered." :
                "The position of the second positive number is " + secondPositiveNumberPosition + ".");

        //Find minimum value and its position in the array
        int minValue = intArray[0];
        int minValuePosition = 0;
        int k = 0;
        while (k < intArray.length) {
            if (intArray[k] < minValue) {
                minValue = intArray[k];
                minValuePosition = k;
            }
            k++;
        }
        System.out.println("The minimum value among the entered numbers is " + minValue + ".\n" +
                "Its position in the array is " + minValuePosition + ".");

        //Calculate the product of all entered even numbers
        int numbersProduct = 1;
        for (int number : intArray) {
            numbersProduct = (number > 0 && number % 2 == 0) ? numbersProduct * number : numbersProduct;
        }

        System.out.println(numbersProduct == 1 ? "No even numbers were entered." : "The product of all entered even numbers is " + numbersProduct + ".");

    }
}
