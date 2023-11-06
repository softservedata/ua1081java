package com.softserve.homework04_arrays_loops.task04;

import java.util.Scanner;

public class Task04 {
    static Scanner scanner = new Scanner(System.in);

    public static void guessRandomNumber() {
        System.out.println("Enter two integers for random minimum and maximum: ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Generated number is " + randomNumber);
        int enteredNumber;
        do {
            System.out.print("Let's guess a random number. Enter random number: ");
            System.out.println();
            enteredNumber = scanner.nextInt();
            if (randomNumber == enteredNumber) {
                System.out.println("You guessed!");
            } else if (enteredNumber > randomNumber) {
                System.out.println("Too high, try again");
                System.out.println();
            } else {
                System.out.println("Too low, try again");
                System.out.println();
            }
        } while (randomNumber != enteredNumber);
    }
}
