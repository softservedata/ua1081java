package homework11.h1;

import java.util.Scanner;

public class Words{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your sentence: ");
        String words = scanner.nextLine();

        String[] word = words.split(" ");

        String longestWord= "";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > longestWord.length()) {
                longestWord= word[i];
            }
        }
        System.out.println("Longest word: " + longestWord);

        int numberLongestWord = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > numberLongestWord) {
                numberLongestWord = word[i].length();
            }
        }
        System.out.println("Number of letters in the longest word: " + numberLongestWord);


        String secondWord= word[1];
        StringBuilder stringBuilder = new StringBuilder(secondWord);
        System.out.println(stringBuilder.reverse());


        }


    }


