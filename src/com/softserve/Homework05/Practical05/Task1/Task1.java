package com.softserve.Homework05.Practical05.Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String[] strings = execute01();
        int[] numbers = execute02();
        if(hasValueInNumberArray(numbers)){
            System.out.println(" Yes");
        }else {
            System.out.println(" No");
        }
    }

    public static String[] execute01() {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[4];
        for (int i = 0; i < strings.length; i++) {
            System.out.print(" Enter string: ");
            strings[i] = scanner.nextLine();
        }
        System.out.println(" Before sort");
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println(" After sort");
        System.out.println(Arrays.toString(strings));
        return strings;
    }

    public static int[] execute02() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int average = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" Enter number: ");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
            average += numbers[i];
        }
        System.out.println(" Average of numbers: " + (average / numbers.length));
        return numbers;
    }

    public static boolean hasValueInNumberArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter value: ");
        int value = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
