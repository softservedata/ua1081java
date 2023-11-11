package Homework5.Homework1;

import java.util.Scanner;

public class IntegerNumbersCalculates {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Enter 10 integers numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        int result;
        if (numbers[0] > 0 && numbers[1] > 0 && numbers[2] > 0 && numbers[3] > 0 && numbers[4] > 0) {
            result = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
            System.out.println("The sum of the first five elements: " + result);
        } else {
            result = numbers[5] * numbers[6] * numbers[7] * numbers[8] * numbers[9];
            System.out.println("The product of the last five elements: " + result);
        }
    }
}
