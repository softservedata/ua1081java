package SoftServPracticalOnline;

import java.util.Scanner;

public class CalculatingOperatingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        double squareRoot = calculateSquareRoot(number);
        double square = calculateSquare(number);
        double cube = calculateCube(number);
        System.out.println("SquareRoot of " + number + " is " + squareRoot);
        System.out.println("Square of " + number + " is " + square);
        System.out.println("Cube of " + number + " is " + cube);
    }

    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double calculateSquare(double number) {
        return Math.pow(number, 2);
    }

    public static double calculateCube(double number) {
        return Math.pow(number, 3);

    }

}
