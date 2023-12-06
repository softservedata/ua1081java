package Homework12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivMethod {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            double a = inputNumber("Enter first number: ", scanner);
            double b = inputNumber("Enter second number: ", scanner);
            System.out.println("Result of dividing: " + div(a, b));

        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double div(double a, double b) {
        return a / b;
    }

//    private static double div(double a, double b) {
//        if (b == 0) {
//            throw new ArithmeticException("Cannot divide by zero");
//        }
//        return a / b;
//    }

    private static double inputNumber(String offer, Scanner scanner) {
        double input = 0;
        while (true) {
            try {
                System.out.println(offer);
                scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
        return input;
    }
}
