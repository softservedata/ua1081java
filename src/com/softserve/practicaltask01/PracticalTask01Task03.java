package com.softserve.practicaltask01;

import java.util.Scanner;

public class PracticalTask01Task03 {
    public static void main(String[] args) {

//        PracticalTask 3
//        Create Console Application project in Java.
//        In main() method write code for solving next tasks:
//        1) 1. Define integer variables a and b. Read values a and b from Console and calculate:
//        • a + b
//        • a - b
//        • a * b
//        • a / b.
//        Output obtained results

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number 'a': ");
        int a = sc.nextInt();
        System.out.print("Enter an integer number 'b': ");
        int b = sc.nextInt();
        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        double division = (double) a / b;
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + subtraction);
        System.out.println("a * b = " + multiplication);
        System.out.println("a / b = " + division);
    }

}
