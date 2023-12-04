package com.softserve.Homework12.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_ReadNumber {
    public static void main(String[] args) {
        int start = 1;
        for (int i = 10; i < 101; i += 10) {
            start = readNumber(start, i);
        }

    }

    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            System.out.print(" Enter number in range [ " + start + " ; " + end + " ] : ");
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException(" Wrong entry!");
        }
        if (number < start || number > end) {
            throw new RuntimeException("Number value out of range");
        }
        System.out.println(" Successfully");
        return number;
    }
}
