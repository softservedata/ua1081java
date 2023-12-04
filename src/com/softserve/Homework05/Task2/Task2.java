package com.softserve.Homework05.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isWorking = true;
        do {
            int number1;
            int number2;
            try {
                System.out.print(" Enter number1: ");
                number1 = scanner.nextInt();
                scanner.nextLine();
                System.out.print(" Enter number2: ");
                number2 = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                throw new InputMismatchException(" Wrong entry!");
            }
            System.out.println(" Sum of numbers: " + (number1 + number2));
            System.out.println(" Do you want to continue?\n Yes / No");
            if (scanner.nextLine().equalsIgnoreCase("No")) {
                isWorking = false;
            }
        } while (isWorking);
        scanner.close();
    }
}
