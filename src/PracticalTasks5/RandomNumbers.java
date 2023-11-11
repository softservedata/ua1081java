package PracticalTasks5;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(201) - 100;
        }
        System.out.print("Random numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The biggest number in the array: " + max);

        int somOfPositive = 0;
        int countOfPositive = 0;
        int countOfNegative = 0;
        for (int number : numbers) {
            if (number > 0) {
                somOfPositive += number;
                countOfPositive++;
            } else if (number < 0) {
                countOfNegative++;
            }
        }
        System.out.println("The sum of positive numbers: " + somOfPositive);
        System.out.println("Number of negative numbers: " + countOfNegative);

        if (countOfPositive > countOfNegative) {
            System.out.println("There are more positive values in the array.");
        } else if (countOfNegative > countOfPositive) {
            System.out.println("There are more negative values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }
}
