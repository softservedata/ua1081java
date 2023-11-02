package com.softserve.edu.lesson_4_Arrays.homework.hw_4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1, 10);
        int entered;
        Scanner sc = new Scanner(System.in);
//        System.out.println(number);
        do {
            System.out.println("Enter a number from 1 to 10 and try to guess it");
            entered = sc.nextInt();
            if (entered < number) {
                System.out.println("Too low, try again");

            }
            if (entered > number) {
                System.out.println("Too high, try again");

            }
        }while (number != entered);
        System.out.println("You guessed it!!!");

    }
}
