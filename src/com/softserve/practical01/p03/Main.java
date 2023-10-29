package com.softserve.practical01.p03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, input two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum is " + (a + b));
        System.out.println("Subtraction is " + (a - b));
        System.out.println("Multiplication is " + (a * b));
        System.out.println("Division is " + ((double)a / b));

        sc.close();

    }
}