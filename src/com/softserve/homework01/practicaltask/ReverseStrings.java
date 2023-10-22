/*
  Write a program that reads three strings and outputs them in the reverse order, each on a new line.
 */

package com.softserve.homework01.practicaltask;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Class allows to return strings in reverse order.
 */
public class ReverseStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first word:");
        String firstString = sc.nextLine();

        System.out.println("Please enter the second word:");
        String secondString = sc.nextLine();

        System.out.println("Please enter the third word:");
        String thirdString = sc.nextLine();

        System.out.println("So, the input words were: \n" + firstString + "\n" + secondString + "\n" + thirdString +
                "\n\nThe same words, but in reverse order: \n" + thirdString + "\n" + secondString + "\n" + firstString);

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three words separated by a space:");
        String inputString = sc.nextLine();
        String[] splittedString = inputString.split("\\s+");
        Arrays.sort(splittedString, Collections.reverseOrder());
        for(int i = 0; i <= splittedString.length - 1; i++){
            if (i != splittedString.length - 1)
                System.out.print(splittedString[i] + "\n");
            else
                System.out.print(splittedString[i]);
        }
        */
    }
}
