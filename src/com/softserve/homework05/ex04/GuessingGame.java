package com.softserve.homework05.ex04;

import java.util.*;

public class GuessingGame {
    static Scanner sc = new Scanner(System.in);
    private int numberToGuess;
    private int attempts = 0;
    private boolean gameContinues = true;
    int LOWER_RANGE = 1;
    int HIGHER_RANGE = 11;
    int MAX_TRIES = 10;
    ArrayList<Integer> unluckyTries = new ArrayList<Integer>(); //needed to collect wrong guesses

    public GuessingGame() {
        Random rand = new Random();
        numberToGuess = rand.nextInt(LOWER_RANGE, HIGHER_RANGE);
        System.out.printf("Welcome to the game of higher-lower game with the range of %s to %s. " +
                "Maximal number of tries will be %s.%n", LOWER_RANGE, HIGHER_RANGE - 1, MAX_TRIES);
    }

    public int guessNumber() {
        if (sc.hasNextInt()) {//checks if input value is int type
            int guess = sc.nextInt();
            sc.nextLine();//eats Enter after nextInt, without that program will bug out if String is input
            if (guess >= LOWER_RANGE && guess < HIGHER_RANGE) {//checks if input value falls in range
                attempts ++;
                return guess;
            } else {
                System.out.println("You have entered the number out of range. This will not count as an attempt. " +
                        "Please, enter a number from 1 to 10.");
                return LOWER_RANGE - 1;
            }
        } else {
            sc.nextLine();//eats Enter after nextInt, without that program will bug out if String is input
            System.out.println("This will not count as an attempt. Please, enter a numeric value from 1 to 10.");
            return LOWER_RANGE - 1;
        }
    }

    public void checkIfWin(int guess) {
        if (guess >= LOWER_RANGE) {
            if (guess == numberToGuess) {
                System.out.printf("You win. Number was %s, you have guessed in %s tries.%n", guess, attempts);
                gameContinues = false;
            } else if (guess < numberToGuess) {
                unluckyTries.add(guess);
                System.out.printf("Too low, try again. Amount of attempts: %s. Unsuccessful tries: %s%n",
                        attempts, Arrays.toString(unluckyTries.toArray()));
            } else {
                unluckyTries.add(guess);
                System.out.printf("Too high, try again. Amount of attempts: %s. Unsuccessful tries: %s%n",
                        attempts, Arrays.toString(unluckyTries.toArray()));
            }
        }

        if (attempts == MAX_TRIES && gameContinues) {
            gameContinues = false;
            System.out.printf("Sorry, you have exceeded maximal amount %s of tries. You have lost.%n",
                    MAX_TRIES);
        }

    }

    public boolean isGameContinues() {
        return gameContinues;
    }

    public int getNumberToGuess() {//not needed in the program, used just to easily check functionality
        return numberToGuess;
    }
}


