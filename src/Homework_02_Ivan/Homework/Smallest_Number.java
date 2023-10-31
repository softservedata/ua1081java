// // Java application with a method to find the smallest number among three integer numbers.

package Homework_02_Ivan.Homework;

import java.util.Scanner;

public class Smallest_Number {
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
        System.out.println("The smallest number is: " + minNumber);

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
    }

