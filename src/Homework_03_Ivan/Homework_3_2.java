/*
2. Write a program that prompts the user to input three integer numbers.
The program should determine the maximum and minimum values among the three numbers and output them to the console.
 */

package Homework_03_Ivan;

import java.util.Scanner;

public class Homework_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int [3];
        System.out.println("Enter the first number: ");
        numbers [0] = scanner.nextInt();
        System.out.println("Enter the second number: ");
        numbers [1] = scanner.nextInt();
        System.out.println("Enter the third number: ");
        numbers [2] = scanner.nextInt();

        System.out.println("You entered the following numbers: ");
        for (int number : numbers) {
            System.out.println(number);
        }

        int minNumber = getMinNumber(numbers);
        System.out.println("The minimum value is: " + minNumber);
        int maxNumber = getMaxNumber(numbers);
        System.out.println("The maximum value is: " + maxNumber);

    }

    public static int getMinNumber(int[] numbers) {
        int min = numbers [0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers [i] < min) {
                min = numbers [i];
            }
        }
        return min;
    }

    public static int getMaxNumber(int[] numbers) {
        int max = numbers [0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers [i] > max) {
                max = numbers [i];
            }
        }
        return max;
    }


}



