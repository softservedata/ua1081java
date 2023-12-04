package com.softserve.Homework12.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_Method_Div {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 ;
        double number2 ;
            try {
                System.out.print(" Enter x1: ");
                number1 = scanner.nextDouble();
                System.out.print("\n Enter x2: ");
                number2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                throw new InputMismatchException(" Wrong entry!");
            }
        System.out.println(number1+" / "+number2+" = "+div(number1, number2));
    }

    public static double div(double x1, double x2) {
        double result = x1 / x2;
        if (result == Double.NEGATIVE_INFINITY || result == Double.POSITIVE_INFINITY) {
            System.out.println(" Division by zero! ");
            return 0;
        }
        return result;
    }
}
