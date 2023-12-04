package com.softserve.Homework05.Task4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(11);
        int playerNumber;
        do {
            try {
                System.out.print(" Guess the number:  ");
                playerNumber = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                throw new InputMismatchException(" Wrong entry!");
            }

            if (playerNumber > number) {
                System.out.println(" Too high, try again");
            }
            if (playerNumber < number) {
                System.out.println(" Too low, try again");
            }
        } while (playerNumber != number);
        System.out.println(" Congratulations !");
        scanner.close();
    }
}
