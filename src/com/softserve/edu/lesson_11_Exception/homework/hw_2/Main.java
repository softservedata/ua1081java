package com.softserve.edu.lesson_11_Exception.homework.hw_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        try {
            int[] numbers = new int[10];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = readNumber(start, end);
            }
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }


    }

    static int readNumber(int start, int end) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Please enter number between " + start + " and " + end);
        String input = sc.nextLine();
        number = Integer.parseInt(input);
        if (number >= start && number <= end) {
            System.out.println("Your number " + number + " is correct between " + start + " and " + end);
        } else {
            throw new IllegalArgumentException("Invalid parameter");
        }
        return number;
    }
}



