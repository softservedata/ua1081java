package com.softserve.homework05.homework;

import java.util.Scanner;

public class DoWhilePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        int result;
        boolean repeatCycle;

        do {
            System.out.println("Please enter two numbers: ");
            numberOne = scanner.nextInt();
            numberTwo = scanner.nextInt();
            result = numberOne + numberTwo;
            scanner.nextLine();
            System.out.println("The sum of the two entered numbers is equal to " + result + ".");
            System.out.println("Do you want to perform the operation again?  If so, enter 'yes'.");
            repeatCycle = scanner.nextLine().equalsIgnoreCase("yes");
        } while (repeatCycle);
    }
}
