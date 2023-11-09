package PracticalTasks4;

import java.util.Scanner;

public class OddNumberCounter {
    static Scanner scanner = new Scanner(System.in);
    static int oddCounter = 0;

    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        if (num1 % 2 != 0) {
            oddCounter++;
        }
        if (num2 % 2 != 0) {
            oddCounter++;
        }
        if (num3 % 2 != 0) {
            oddCounter++;
        }
        System.out.println("NUmber of all odd numbers: " + oddCounter);
    }
}
