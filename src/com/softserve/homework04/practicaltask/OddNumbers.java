package com.softserve.homework04.practicaltask;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        int[] numbersArray = new int[3];
        int oddNumbersCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        numbersArray[0] = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        numbersArray[1] = scanner.nextInt();
        System.out.print("Please enter the third number: ");
        numbersArray[2] = scanner.nextInt();

        for (int number : numbersArray) {
            oddNumbersCount = (number % 2 != 0) ? ++oddNumbersCount : oddNumbersCount;
        }

        System.out.println("\nThe number of odd numbers is " + oddNumbersCount);

    }
}
