package com.softserve.homework11_exeption.task02;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NumberRange {
    public static int readNumber(int start, int end) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int enteredNumber;
        try {
            enteredNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("You entered not integer number");
        }
        if (enteredNumber >= start && enteredNumber <= end) {
            return enteredNumber;
        } else {
            throw new Exception("Your number out of the range");
        }

    }


    public static Set<Integer> myMain(int start, int end) throws Exception {
        System.out.println("You must enter 10 numbers: a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100");
        int enteredNumber;
        Set<Integer> mySetOfNumbers = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            enteredNumber = readNumber(start, end);
            if (enteredNumber > start) {
                start = enteredNumber;
                mySetOfNumbers.add(enteredNumber);
            } else {
                throw new Exception("Your number out of the range: (a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100)");
            }
        }
        return mySetOfNumbers;
    }


}
