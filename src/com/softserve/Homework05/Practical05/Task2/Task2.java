package com.softserve.Homework05.Practical05.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter prime number: ");
        int primeNumber = scanner.nextInt();
        if (isPrimeNumber(primeNumber)) {
            System.out.println(" Is a prime number");
        } else {
            System.out.println(" Is not prime number");
        }
        scanner.close();
    }

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
