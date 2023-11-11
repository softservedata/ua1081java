package com.softserve.homework05.homework.HW1;

import java.util.Scanner;

public class TenIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = new int[10];
        int numbersSum = 0;
        int numbersProduct = 1;

        System.out.print("Please enter ten positive or negative numbers: ");

        for (int i = 0; i <= 9; i++) {
            intArray[i] = scanner.nextInt();
        }

        boolean fistFivePositive = intArray[0] >= 0 && intArray[1] >= 0 && intArray[2] >= 0 && intArray[3] >= 0 && intArray[4] >= 0;
        boolean lastFiveNegative = intArray[5] < 0 && intArray[6] < 0 && intArray[7] < 0 && intArray[8] < 0 && intArray[9] < 0;

        //Find sum of the first five numbers if they are positive
        if (fistFivePositive) {
            for (int i = 0; i <= 4; i++) {
                numbersSum += intArray[i];
            }
            System.out.println("All first five numbers are positive. Their sum is equal to " + numbersSum + ".");
        }

        //Find product of the last five numbers if they are negative
        if (lastFiveNegative) {
            for (int i = 5; i <= 9; i++) {
                numbersProduct = numbersProduct * intArray[i];
            }
            System.out.println("The last five numbers are all negative. Their product is equal to " + numbersProduct + ".");
        }

        //Response in case of non-fulfillment of conditions
        if (!fistFivePositive && !lastFiveNegative) {
            System.out.println("The entered numbers do not meet the conditions of the task.");
        }
    }
}
