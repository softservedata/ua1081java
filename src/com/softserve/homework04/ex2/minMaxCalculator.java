package com.softserve.homework04.ex2;

import java.util.Scanner;

public class minMaxCalculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please, input three integer numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = num1;
        int min = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        if (num2 < min) {
            min = num2;
        }

        if (num3 < min) {
            min = num3;
        }
        System.out.printf("Maximal number is %s. Minimal number is %s.", max, min);
    }
}
