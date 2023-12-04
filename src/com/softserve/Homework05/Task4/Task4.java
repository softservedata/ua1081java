package com.softserve.Homework05.Task4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {

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
        scanner.close();//cannot close scanner here, because I did Scanner as static
    }
}
