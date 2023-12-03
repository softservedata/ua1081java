package com.softserve.homework11.ex01;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please, input a sentence:");
        String input = sc.nextLine();
        String[] inputArray = input.trim().replaceAll(" +", " ").split(" ");

        String theLongestWord = "";
        for (String s : inputArray) {
            if (s.length() > theLongestWord.length()) {
                theLongestWord = s;
            }
        }

        if (theLongestWord.endsWith("!") || theLongestWord.endsWith(",") ||
            theLongestWord.endsWith("?") || theLongestWord.endsWith(".") || theLongestWord.endsWith(";")) {
            theLongestWord = theLongestWord.substring(0, theLongestWord.length() - 1);
        }

        System.out.printf("The longest word is '%s', it has %d letters%n", theLongestWord, theLongestWord.length());

        if (inputArray.length > 1) {
            StringBuilder sb = new StringBuilder(inputArray[1]);
            String reversedString = sb.reverse().toString();
            System.out.printf("The second word reversed is '%s'%n", reversedString);
        } else {
            System.out.println("This is a one-word sentence");
        }
    }
}
