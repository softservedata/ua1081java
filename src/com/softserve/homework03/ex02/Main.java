package com.softserve.homework03.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the third number: ");
        int num3 = sc.nextInt();
        sc.close();
        System.out.printf("The smallest number is %s", IntCounter.minCounter(num1, num2, num3));
    }
}
