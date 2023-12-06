package com.softserve.homework12.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static double div(double num1, double num2) throws InphinityValueException {
        if (num2 == 0) {
            throw new InphinityValueException("Infinity values cannot be retrieved for further usage");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Please, input the first number:");
            double num1 = sc.nextDouble();
            System.out.println("Please, input the second number:");
            double num2 = sc.nextDouble();
            System.out.printf("The result of division is %s%n", div(num1, num2));
        } catch (InphinityValueException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input data format has been wrong");
        }

    }
}

class InphinityValueException extends Exception {
    public InphinityValueException() {
    }

    public InphinityValueException(String message) {
        super(message);
    }
}
