package com.softserve.practicaltask03.practask01;

import java.util.Scanner;

public class PracticalTask01 {
    static Scanner scanner = new Scanner(System.in);

    public static void findNumberOfOddNumbers() {
        System.out.println("Enter three integer numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int count = 0;
        if (num1 % 2 != 0) {
            count++;
        }
        if (num2 % 2 != 0) {
            count++;
        }
        if (num3 % 2 != 0) {
            count++;
        }
        System.out.println("Number of odd numbers: " + count);
    }
}
