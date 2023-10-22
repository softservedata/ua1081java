package com.softserve.edu.lesson_1.practice.practice_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st num:");
        double a = sc.nextDouble();
        System.out.println("Please enter 2nd num:");
        double b = sc.nextDouble();
        System.out.println("Please enter a calculation action '+' , '-', '*', '/' :");
        String action = sc.next();
        System.out.println("Reesult:");
        if (action.equals("+")) {
            System.out.println(a + b);
        }
        if (action.equals("-")) {
            System.out.println(a - b);
        }
        if (action.equals("*")) {
            System.out.println(a * b);
        }
        if (action.equals("/") && b != 0) {
            System.out.println(a / b);
        } else
            System.out.println("No division by 0!");
    }

}

