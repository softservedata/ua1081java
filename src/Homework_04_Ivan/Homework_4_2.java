/*
Create a do-while loop that prompts the user to enter two numbers and calculates their sum.
After displaying the result, the program should ask the user if they want to perform the operation again.
If the user inputs a positive response, the loop should repeat; otherwise, it should terminate.
 */

package Homework_04_Ivan;

import java.util.Scanner;

public class Homework_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Enter two numbers: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = a + b;

            System.out.println("The sum of entered numbers is: " + sum);
            System.out.println("Do you want to do the operation again? Please enter Yes / No");

            // Read the user's response
            answer = scanner.next();

        } while (answer.equalsIgnoreCase("yes"));
    }
}
