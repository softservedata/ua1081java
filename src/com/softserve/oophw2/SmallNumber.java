package com.softserve.oophw2;

import java.util.Scanner;

public class SmallNumber {
    public static void main(String[] args) {
        System.out.println("=== Write three integer numbers === ");
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Write number " + (i + 1) + ":");
            numbers[i] = scan.nextInt();
        }

        int min = numbers[0];
        for (int i = 0; i < 3; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("the smallest number is: " + min );
    }
}
