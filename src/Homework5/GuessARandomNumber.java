package Homework5;

import java.util.Random;
import java.util.Scanner;

public class GuessARandomNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(50) - 1;

        int userGuess;
        int attempts = 0;

        do {
            System.out.println("Guess a random number (between 1 and 50): ");
            userGuess = scanner.nextInt();
            attempts++;
            if (userGuess == randomNumber) {
                System.out.println("Congratulation. You guess a random number.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            }
        } while (userGuess != randomNumber);
    }
}
