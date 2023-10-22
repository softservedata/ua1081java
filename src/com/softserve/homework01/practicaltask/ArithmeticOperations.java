/*
  Create Console Application project in Java.
  In main() method write code for solving next tasks:
  Define integer variables a and b. Read values a and b from Console and calculate:
    a + b
    a - b
    a * b
    a / b.
  Output obtained results.
 */

package com.softserve.homework01.practicaltask;

import java.util.Scanner;

/**
 * Class performs simple arithmetic operations.
 */
public class ArithmeticOperations {

    /**
     * Method returns the result of adding two numbers.
     * */
    public double addNumbers (double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Method returns the result of the subtraction of two numbers.
     * */
    public double subtractNumbers (double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    /**
     * Method returns the result of multiplying two numbers.
     * */
    public double multiplyNumbers (double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    /**
     * Method returns the result of dividing two numbers.
     * */
    public double divideNumbers (double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        ArithmeticOperations ao = new ArithmeticOperations();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        double firstNumber = sc.nextDouble();

        System.out.println("Please enter the second number:");
        double secondNumber = sc.nextDouble();

        double addingResult = ao.addNumbers(firstNumber, secondNumber);
        double subtractionResult = ao.subtractNumbers(firstNumber, secondNumber);
        double multiplyingResult = ao.multiplyNumbers(firstNumber, secondNumber);

        System.out.println("The results of arithmetic operations for your numbers: \n" +
                firstNumber + " + " + secondNumber + " = " + addingResult + "\n" +
                firstNumber + " - " + secondNumber + " = " + subtractionResult + "\n" +
                firstNumber + " * " + secondNumber + " = " + multiplyingResult);

        if (secondNumber != 0.0) {
            double dividingResult = ao.divideNumbers(firstNumber, secondNumber);
            System.out.println(firstNumber + " / " + secondNumber + " = " + dividingResult);
        } else {
            System.out.println("The division operation failed. Number can`t be divided by zero.");
        }
    }
}
