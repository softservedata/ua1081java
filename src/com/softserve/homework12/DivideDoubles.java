package com.softserve.homework12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideDoubles {

    public static double div(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("You cannot divide by zero!");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the dividend: ");
            double dividend = scanner.nextDouble();
            System.out.println("Please enter the divisor: ");
            double divisor = scanner.nextDouble();
            System.out.println(div(dividend, divisor));
        } catch (InputMismatchException e) {
            System.out.println("The entered value must be numeric!");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
