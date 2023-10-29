package com.softserve.Homework04.Practical04.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(" ******  Practical Task1 *****");
        int number1;
        int number2;
        int number3;
        int oddNumbers = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter number1: ");
        number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Enter number2: ");
        number2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Enter number3: ");
        number3 = scanner.nextInt();
        scanner.nextLine();
        if (number1 % 2 == 1) {
            oddNumbers++;
        }
        if (number2 % 2 == 1) {
            oddNumbers++;
        }
        if (number3 % 2 == 1) {
            oddNumbers++;
        }
        System.out.println(" Odd numbers: " + oddNumbers);
    }
}
