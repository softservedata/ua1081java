package com.softserve.Homework03.Practical03;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int number1 = getNumber(" Enter first number: ");
        int number2 = getNumber(" Enter second number: ");
        System.out.println(" Total of numbers: " + getTotal(number1, number2));
        System.out.println(" Average of numbers: " + getAverage(number1, number2));
    }

    public static int getTotal(int number1, int number2) {
        return number1 + number2;
    }

    public static double getAverage(int number1, int number2) {
        return (number1 + number2) / 2.0;
    }

    public static int getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
