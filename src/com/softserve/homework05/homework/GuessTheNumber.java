package com.softserve.homework05.homework;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempt = 1;
        int minNumber = 0;
        int maxNumber = 100;
        int randomNumber = (int)Math.floor(Math.random() * (maxNumber - minNumber + 1) + minNumber);

        System.out.print("I guessed a number from 0 to 100.\n" +
                "Try to guess it!\n" +
                "Please enter a number: ");
        guess = scanner.nextInt();
        while (guess != randomNumber) {
            System.out.print(guess > randomNumber ? "Too high, try again! " : "Too low, try again! ");
            attempt++;
            guess = scanner.nextInt();
        }

        System.out.println("You guessed it!\n" +
                "This is indeed the number " + randomNumber + ".\n" +
                "You managed to guess it in " + attempt + " tries.");
    }
}
