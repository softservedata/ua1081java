package com.softserve.Homework04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("******* Task 2 *******");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" Enter  number: ");
            try {
                numbers[i] = scanner.nextInt();
                scanner.hasNextLine();
            } catch (InputMismatchException e) {
                throw new InputMismatchException(" Wrong entry!");
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int element: numbers){
            if(element>max){
                max=element;
            }
            if (element < min) {
                min = element;
            }
        }
//        for (int i = 0; i < numbers.length; i++) {//you can use here for-each loop
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//        }
        System.out.println(" Max value -> " + max + "\n Min value -> " + min);

    }

}
