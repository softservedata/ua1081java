/*
4.** Create a program that generates a random number and prompts to the user to guess what the number is.
If the user's guess is higher than the random number, the program should display "Too high, try again."
If the user's guess is lower than the random number, the program should display "Too low, try again."
The program should use a loop that repeats until the user correctly guesses the random number.
 */

package Homework_04_Ivan;

import java.util.Random;
import java.util.Scanner;

public class Randomizer {
    public static void main(String[] args) {
        Random random = new Random();
        int upperbound = 10;
        Scanner scanner = new Scanner(System.in);

        boolean playAgain = true;

        while (playAgain) {
            int int_random = random.nextInt(upperbound);
            System.out.println("Try to guess my number from 0 to " + upperbound);

            int attempts = 0;
            int number;

            while (true) {
                number = scanner.nextInt();
                attempts++;

                if (number < 0 || number > upperbound) {
                    System.out.println("Please enter a number between 0 and " + upperbound);
                } else if (number < int_random) {
                    System.out.println("Too low, try again.");
                } else if (number > int_random) {
                    System.out.println("Too high, try again.");
                } else {
                    System.out.println("Congratulations, you guessed the number! It was: " + int_random);
                    System.out.println("Number of attempts: " + attempts);
                    break;
                }
            }
            System.out.print("Do you want to play again? (y/n): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("y");

        }
        scanner.close();
    }
}




