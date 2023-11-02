package com.softserve.practical05.ex03;

import java.util.Arrays;
import java.util.Random;

public class RandomIntegers {
    
    static Random rand = new Random();

    public static void main(String[] args) {
        int LOWERBOUND = -100;
        int UPPERBOUND = 100;
        int ARRAY_SIZE = 10;
        int max = 0;
        int sumOfPositive = 0;
        int countOfNegative = 0;
        int countOfPositive = 0;

        int[] randomArray = new int[ARRAY_SIZE];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(LOWERBOUND, UPPERBOUND);
        }
        System.out.println(Arrays.toString(randomArray));

        for (int j : randomArray) {
            if (j > max) {
                max = j;
            }
            if (j > 0) {
                sumOfPositive += j;
                countOfPositive++;
            }
            if (j < 0) {
                countOfNegative++;
            }
        }
        System.out.printf("Max value is %s%n", max);
        System.out.printf("Sum of positive values is %s%n", sumOfPositive);

        if (countOfPositive > countOfNegative) {
            System.out.println("There are more positive values in the array");
        } else if (countOfNegative > countOfPositive) {
            System.out.println("There are more negative values in the array");
        } else
            System.out.println("There is an equal number of positive and negative values in the array");
    }
}
