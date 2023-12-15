package com.softserve.HomeWorks.HomeWork05Ex4;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        int userGuess;
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            }

        } while (userGuess != randomNumber);

        scanner.close();
    }
}

