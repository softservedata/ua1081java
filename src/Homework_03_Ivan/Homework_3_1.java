/* 1. Write a program that prompts the user to input three float numbers.
The program should check if all three numbers fall within the range of -5 and 5 (inclusive).
If all three numbers are within this range, the program should output a message
indicating that they belong to the range [-5, 5].
If any of the numbers are outside the specified range, the program should output a message
indicating that not all numbers belong to the range [-5, 5].
Please note that the range includes the values -5 and 5 as well. */

package Homework_03_Ivan;

import java.util.Scanner;

public class Homework_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three float numbers. Enter the first number: ");
        float a = scanner.nextFloat();
        System.out.println("Enter the second number: ");
        float b = scanner.nextFloat();
        System.out.println("Enter the third number: ");
        float c = scanner.nextFloat();

        if (a >= -5 && a <= 5 && b >= -5 && b <= 5 && c >= -5 && c <= 5) {
            System.out.println("All inputted numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }
}
