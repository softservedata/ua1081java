package com.softserve.homework04.ex1;

import java.util.Scanner;

public class NumberChecker {
    float LOWER_LIMIT = -5;
    float HIGHER_LIMIT = 5;

    String checkNumber(float num1, float num2, float num3) {
        if (num1 < LOWER_LIMIT || num1 > HIGHER_LIMIT) {
            return "Not all numbers belong to the range between -5.0 and 5.0";
        } else if (num2 < LOWER_LIMIT || num2 > HIGHER_LIMIT) {
            return "Not all numbers belong to the range between -5.0 and 5.0";
        } else if (num3 < LOWER_LIMIT || num3 > HIGHER_LIMIT) {
            return "Not all numbers belong to the range between -5.0 and 5.0";
        }
        return "All numbers belong to the range between -5.0 and 5.0";
    }

    public static void main(String[] args) {
        NumberChecker numberChecker = new NumberChecker();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input three float numbers:");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        String result = numberChecker.checkNumber(num1, num2, num3);
        System.out.println(result);
        sc.close();// Close the scanner
    }
}
