package com.softserve.edu.lesson_3_Enums.homework.hw_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Show MIN and MAX num

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num:");
        int first = sc.nextInt();
        System.out.println("Enter second num:");
        int second = sc.nextInt();
        System.out.println("Enter third num:");
        int third = sc.nextInt();

        int max = Math.max(Math.max(first, second), third);
        int min = Math.min(Math.min(first, second), third);

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        sc.close();//don't forget to close scanner
    }
}
