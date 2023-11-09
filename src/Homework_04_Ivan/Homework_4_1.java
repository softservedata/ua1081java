/*
1. Create a program (in different java documents) that prompts the user to enter:
• a month number and calculates the number of days in that month based on an array
that contains the number of days in each month. (done)
• 10 integers numbers and calculates the sum of the first five elements if they are
positive, or the product of the last five elements if they are not and output the result.
• 5 integer numbers and find:
    o position of second positive number;
    o minimum value and its position in the array.
    o calculate the product of all entered even numbers (exclude 0 from even if entered by
    user).
 */

package Homework_04_Ivan;

import java.util.Scanner;

public class Homework_4_1 {
    public static void main(String[] args) {

        // Calculate Days in the Month
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int monthNumber = scanner.nextInt();
        int days = MonthDaysApp.calculateDaysInMonth(monthNumber);

        if (days != -1) {
            System.out.println("Number of days in month " + monthNumber + " is " + days);
        } else {
            System.out.println("Invalid month number.");
        }


        //Sum of Numbers
        int[] numbersTen = new int[10];

        System.out.println("Enter 10 integer numbers:");

        for (int i = 0; i < 10; i++) {
            numbersTen[i] = scanner.nextInt();
        }

        int sum = SumOfNumbers.sumFirstFivePositive(numbersTen);
        long product = SumOfNumbers.productLastFiveNonPositive(numbersTen);

        if (sum != -1) {
            System.out.println("Sum of the first five positive numbers: " + sum);
        } else if (product != -1) {
            System.out.println("Product of the last five non-positive numbers: " + product);
        } else {
            System.out.println("No suitable numbers found.");
        }

        // five integer numbers

        int[] numbersFive = new int[5];

        System.out.println("Enter 5 integer numbers:");

        for (int i = 0; i < 5; i++) {
            numbersFive[i] = scanner.nextInt();
        }

        int secondPositivePosition = NumberProcessor.findSecondPositive(numbersFive);
        int[] minInfo = NumberProcessor.findMinValueAndPosition(numbersFive);
        long evenProduct = NumberProcessor.calculateProductOfEvenNumbers(numbersFive);

        if (secondPositivePosition != -1) {
            System.out.println("Position of the second positive number: " + secondPositivePosition);
        } else {
            System.out.println("There are not enough positive numbers.");
        }

        System.out.println("Minimum value: " + minInfo[0]);
        System.out.println("Position of the minimum value: " + minInfo[1]);
        System.out.println("Product of all entered even numbers (excluding 0): " + evenProduct);
    }
}


