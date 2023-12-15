package com.softserve.HomeWorks.HomeWork05Ex2;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char userChoice;

        do {
            // Input two numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Calculate the sum
            double sum = num1 + num2;

            // Display the result
            System.out.println("Sum: " + sum);

            // Ask the user if they want to perform the operation again
            System.out.print("Do you want to perform the operation again? (y/n): ");
            userChoice = scanner.next().charAt(0);

        } while (Character.toLowerCase(userChoice) == 'y');

        System.out.println("Program terminated. Goodbye!");
    }
}

