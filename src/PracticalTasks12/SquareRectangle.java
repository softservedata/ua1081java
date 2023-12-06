package PracticalTasks12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRectangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = userInput("Enter the length of the rectangle", scanner);
            int b = userInput("Enter the width of the rectangle", scanner);
            System.out.println("Area of the rectangle: " + squareRectangle(a, b));

        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Rectangle dimensions cannot be negative.");
        }
        return a * b;
    }

    private static int userInput(String offer, Scanner scanner) {
        int input = 0;
        while (true) {
            try {
                System.out.println(offer);
                input = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
        return input;
    }
}
