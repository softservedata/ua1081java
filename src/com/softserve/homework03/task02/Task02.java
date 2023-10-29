package com.softserve.homework03.task02;

import java.util.Scanner;

public class Task02 {
    static Scanner scanner = new Scanner(System.in);

    public static void findMinMaxNumbers(){
        System.out.println("Enter three integer numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int min = num1;
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        System.out.println("Min number: " + min + "\n" + "Max number: " + max);
    }
}
