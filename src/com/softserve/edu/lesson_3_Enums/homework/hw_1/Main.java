package com.softserve.edu.lesson_3_Enums.homework.hw_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Please enter first num");
            float first = sc.nextFloat();
            System.out.println("Please enter second num");
            float second = sc.nextFloat();
            System.out.println("Please enter third num");
            float third = sc.nextFloat();
            if ((range(first)) && (range(second)) && (range(third))) {
                System.out.println("All numbers belong to the range [-5, 5] ");
            } else {
                System.out.println("Not all numbers belong to the range [-5, 5]");
            }
        }catch (InputMismatchException e){
            System.err.println("Please enter only numbers");
        }
    }

    private static boolean range(float num) {
        return ((num >= -5) && (num <= 5));
    }
}
