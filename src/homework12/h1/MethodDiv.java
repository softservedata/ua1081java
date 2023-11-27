package homework12.h1;

import java.util.Scanner;

class MethodDiv {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Enter first number: ");
            double firstNumber = scanner.nextInt();
            System.out.println("Enter second number: ");
            double secondNumber = scanner.nextInt();
            double result = div(firstNumber, secondNumber);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

        static double div ( double firstNumber, double secondNumber){
            if (secondNumber == 0) {
                throw new ArithmeticException("Arithmetic has rules, you can't divide by zero");
            }
            return firstNumber / secondNumber;
        }

    }