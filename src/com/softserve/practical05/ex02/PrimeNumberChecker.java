package com.softserve.practical05.ex02;

import java.util.Scanner;

public class PrimeNumberChecker {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int input;
        boolean isPrime = true;
        boolean isPositive = true;

        System.out.println("Please, enter a whole positive number: ");

        if (!sc.hasNextInt()) {
            System.out.println("Please, enter a valid value");
        } else {
            input = sc.nextInt();

            if (input <= 0) {
                isPositive = false;
            }

            if (input == 1 || input % 2 == 0) {
                isPrime = false;
            }

            if (input == 2) {
                isPrime = true;
            }

            for (int i = 3; i <= Math.sqrt(input); i += 2) {
                if (input % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPositive && isPrime) {
                System.out.printf("%s is a prime number", input);
            } else if (isPositive) {
                System.out.printf("%s is not a prime number", input);
            } else
                System.out.println("Please, enter a positive number");
        }
    }
}


