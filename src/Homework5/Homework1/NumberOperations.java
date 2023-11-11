package Homework5.Homework1;

import java.util.Scanner;

public class NumberOperations {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int secondPosition = -1;
        int minValue = Integer.MAX_VALUE;
        int minPosition = -1;
        int productOfEvens = 1;

        System.out.println("Enter 5 integer numbers: ");

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > 0) {
                if (secondPosition == -1) {
                    secondPosition = i+1;
                }
            }
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minPosition = i+1;
            }
            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                productOfEvens *= numbers[i];
            }
        }
        System.out.println("Position of second positive number: " + secondPosition);
        System.out.println("Minimum value is " + minValue + " and its position: " + minPosition);
        System.out.println("Product of all entered even numbers: " + productOfEvens);
    }
}
