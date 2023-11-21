package Homework11;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence of five words:");
        String sentence = scanner.nextLine();

//        Identify the longest word in the sentence and display it on the console.
        String longestWord = longestWord(sentence);
        System.out.println("The longest word in the sentence is - " + longestWord);

//        Determine the number of letters in the longest word
        int numberOfLetters = longestWord.length();
        System.out.println("The number of letters in the longest word - " + numberOfLetters);

//        Display the second word of the sentence in reverse order on the console.
        String[] word = sentence.split("\\s+");
        String reverse = null;
        if (word.length >= 2) {
            String secondWord = word[1];
            reverse = new StringBuilder(secondWord).reverse().toString();
            System.out.println("The second word of the sentence in reverse order - " + reverse);
        }
        scanner.close();
    }

    private static String longestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
