/*
Іnput a sentence that contains words separated by more than one space on the console.
The goal is to replace all consecutive spaces with a single space.
For instance, if you entered the sentence "I    am    learning     Java    Fundamental",
the expected result should be "I am learning Java Fundamental ".
 */

package com.softserve.homework11.homework;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the sentence: ");

        String inputString = scanner.nextLine();
        String fixedString = inputString.replaceAll(" +", " ");

        System.out.println("Original sentence: " + inputString);

        System.out.println("Sentence after fix: " + fixedString);
    }
}
