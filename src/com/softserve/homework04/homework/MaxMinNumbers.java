package com.softserve.homework04.homework;

import java.util.Scanner;

public class MaxMinNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArray = new int[3];
        int maxNumber;
        int minNumber;
        int i;

        for (i = 0; i <= numbersArray.length - 1; i++) {
            System.out.print("Run " + (i + 1) + ": Please enter the number: ");
            numbersArray[i] = scanner.nextInt();
        }

        if (numbersArray[0] > numbersArray[1] && numbersArray[0] > numbersArray[2])
            maxNumber = numbersArray[0];
        else if (numbersArray[1] > numbersArray[0] && numbersArray[1] > numbersArray[2])
            maxNumber = numbersArray[1];
        else maxNumber = numbersArray[2];

        minNumber = (numbersArray[0] < numbersArray[1] && numbersArray[0] < numbersArray[2]) ? numbersArray[0] :
                    (numbersArray[1] < numbersArray[0] && numbersArray[1] < numbersArray[2]) ? numbersArray[1] : numbersArray[2];

        System.out.println("Minimum value is " + minNumber + ".\nMaximum value is " + maxNumber + ".");
    }
}
