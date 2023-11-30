package com.softserve.homework11.homework;

import java.util.Scanner;

public class FiveWordsProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the sentence of five words: ");

        String inputString = scanner.nextLine();
        String[] separateWords = inputString.split("\\s+");

        //Identify the longest word in the sentence and display it on the console.
        String longestWord = "";

        for(String word : separateWords){
            longestWord = word.length() > longestWord.length() ? word : longestWord;
        }

        System.out.println("The longest word in the sentence is: " + longestWord);

        //Determine the number of letters in the longest word

        System.out.println("The number of letters in the longest word is: " + longestWord.length());

        //Display the second word of the sentence in reverse order on the console

        StringBuilder reverse = new StringBuilder(separateWords[1]);

        System.out.println("The second word of the sentence in reverse order: " + reverse.reverse());
    }
}
