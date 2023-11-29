package com.softserve.edu.lesson_11_Exception.practice.practice_1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println("Please enter 1st number");
            try {
                first = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e){
                System.out.println("Please enter valid");
                sc.next();
            }
        }
        valid = false;
        while (!valid) {
            System.out.println("Please enter 2nd number");
            try {
                second = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e){
                System.out.println("Please enter valid");
            }
        }
        try {
            System.out.println(squareRectangle(first,second));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            sc.next();
        }
    }

    static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0 ) {
            throw new IllegalArgumentException("The a or b should be positive");
        }
        return a * b;
    }
}
