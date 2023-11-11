package Homework5;

import java.util.Scanner;

public class DoWhileLoop {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char continueOperation;
        do {
            int sum;
            int num1;
            int num2;
            System.out.println("Enter two numbers: ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            sum = num1 + num2;
            System.out.println("Sum of entered numbers: " + sum);
            System.out.println("Do you want to perform the operation again? (y/n): ");
            continueOperation = scanner.next().charAt(0);
        } while (Character.toLowerCase(continueOperation) == 'y');
        System.out.println("Program terminated.");
    }
}
