package com.softserve.Homework05.Task2;

import java.util.Scanner;

public class Task2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean isWorking = true;
        do {
            int number1;//better declare and initialize variables in the same line, but it's not a big deal
            System.out.print(" Enter number1: ");
            number1 = scanner.nextInt();
            scanner.nextLine();
            System.out.print(" Enter number2: ");
            int number2 = scanner.nextInt();// I did it here
            scanner.nextLine();
            System.out.println(" Sum of numbers: " + (number1 + number2));
            System.out.println(" Do you want to continue?\n Yes / No");
            if (scanner.nextLine().equalsIgnoreCase("No")) {
                isWorking = false;
            }
        } while (isWorking);

    }
}

