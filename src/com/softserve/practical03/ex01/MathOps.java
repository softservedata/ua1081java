package com.softserve.practical03.ex01;

import java.util.Scanner;

public class MathOps {

    public double getTotal(double num1, double num2) {
        double sum = num1 + num2;
        System.out.printf("The sum of %s and %s is %s%n", num1, num2, sum);
        return sum;
    }

    public double getAverage(double num1, double num2) {
        double avg = (num1 + num2) / 2;
        System.out.printf("The average of %s and %s is %s%n", num1, num2, avg);
        return avg;
    }

    public static double getNumber(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        return number;
    }
}
