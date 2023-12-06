package Homework12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            try {
                numbers[i] = readNumber(start, end);
                start = numbers[i] + 1;
            } catch (InputMismatchException | NumberOutOfNumericRangeException e) {
                System.out.println("Invalid input. " + e.getMessage());
                i--;
            }
        }
        System.out.println("Entered numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

    private static int readNumber(int start, int end) throws NumberOutOfNumericRangeException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a number in range: " + start + " - " + end);
            int number = scanner.nextInt();
            if (number < start || number > end) {
                throw new NumberOutOfNumericRangeException("Number is not in a specified range.");
            }
            return number;
        } catch (InputMismatchException e) {
            throw e;
        } finally {
            scanner.nextLine();
        }
    }
    static class NumberOutOfNumericRangeException extends Exception {
        public NumberOutOfNumericRangeException(String message) {
            super(message);
        }
    }
}
