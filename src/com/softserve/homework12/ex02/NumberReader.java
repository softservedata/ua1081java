package com.softserve.homework12.ex02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NumberReader {
    static Scanner sc = new Scanner(System.in);
    int startOfRange;
    int endOfRange;
    int inputValue;

    public NumberReader(int startOfRange, int endOfRange) {
        this.startOfRange = startOfRange;
        this.endOfRange = endOfRange;
    }

    int readNumber(int start, int end) throws IllegalArgumentException {
        System.out.printf("\nPlease, input a number in range between %d and %d (range borders not included):%n",
                start, end);
        int input = sc.nextInt();

        if (input < start + 1 || input > end - 1) {
            throw new IllegalArgumentException();
        }
        System.out.printf("%d is in range between %d and %d%n", input, start, end);
        return input;
    }

    //the program works until 10 integers in ascending way are input or if a user entered end of range, so it's impossible to enter more
    //start and end of range are not included
    public static void main(String[] args) {
        NumberReader numberReader = new NumberReader(1, 100);
        int numberOfTries = 10;
        List<Integer> listOfInputs = new ArrayList<>();

        while (numberOfTries > 0) {
            try {
                numberReader.inputValue = numberReader.readNumber(numberReader.startOfRange, numberReader.endOfRange);
                numberReader.startOfRange = numberReader.inputValue;
                listOfInputs.add(numberReader.inputValue);

                if (numberReader.inputValue == numberReader.endOfRange - 1) {
                    System.out.println("\nYou have entered maximal value within range, so further input is not possible");
                    break;
                }
                numberOfTries--;

                if (numberOfTries > 0) {
                    System.out.printf("Remaining amount of attempts: %d, list of entered values:%s%n",
                            numberOfTries, listOfInputs);
                }

            } catch (IllegalArgumentException e) {
                System.out.printf("Input number was out of range between %d and %d%n",
                        numberReader.startOfRange, numberReader.endOfRange);
                System.out.printf("Remaining amount of attempts: %d, list of entered values:%s%n",
                        numberOfTries, listOfInputs);

            } catch (InputMismatchException e) {
                System.out.println("Please, input data in round number format");
                sc.nextLine();
                System.out.printf("Remaining amount of attempts: %d, list of entered values: %s%n",
                        numberOfTries, listOfInputs);
            }
        }

        System.out.printf("Final list of input values is: %s", listOfInputs);
    }
}
