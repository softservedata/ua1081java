package com.softserve.PracticalTasks.PracticalTask03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Get two numbers using the getNumber method
        double num1 = getNumber("Enter the first number: ");
        double num2 = getNumber("Enter the second number: ");

        // Call getTotal and getAverage methods
        double total = getTotal(num1, num2);
        double average = getAverage(num1, num2);

        // Print the results
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    // Method to get the total of two numbers
    public static double getTotal(double num1, double num2) {
        return num1 + num2;
    }

    // Method to get the average of two numbers
    public static double getAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    // Method to input a number using Scanner
    public static double getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);

        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            System.out.print(prompt);
            scanner.next(); // Consume the invalid input
        }

        return scanner.nextDouble();
    }
}

