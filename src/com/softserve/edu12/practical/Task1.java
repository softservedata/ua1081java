package com.softserve.edu12.practical;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Enter integer value of a:");
            try {
                a = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter valid value");
                sc.next();
            }
        }
         validInput = false;
        while (!validInput) {
            System.out.println("Enter integer value of b:");
            try {
                b = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter valid value");
                sc.next();
            }
        }
        try {
            int squareOfRectangle = squareRectangle(a, b);
            System.out.println(squareOfRectangle);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a and b must be positive");
        }
        return a * b;
    }
}
