package com.softserve.practicaltask04_arrays_loops.practask02;

import java.util.Scanner;

public class PracticalTask02 {
    static Scanner scanner = new Scanner(System.in);

    public static void isPrimeNumber() {
        System.out.print("Enter positive integer number: ");
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Is a prime number");
        } else {
            System.out.println("Is not prime number");
        }
    }
}
