/*
  Write a program that takes three numbers from console as input to calculate and print output the average of the numbers
 */

package com.softserve.homework01.practicaltask;

import java.util.Scanner;

/**
 * Class allows to calculate the average value of the entered numbers.
 */
public class NumbersAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        double firstNumber = sc.nextDouble();

        System.out.println("Please enter the second number:");
        double secondNumber = sc.nextDouble();

        System.out.println("Please enter the third number:");
        double thirdNumber = sc.nextDouble();

        System.out.println("The average of entered numbers is: " + (firstNumber + secondNumber + thirdNumber) / 3 + ".");
    }
}
