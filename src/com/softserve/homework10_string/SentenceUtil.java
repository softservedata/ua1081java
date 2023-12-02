package com.softserve.homework10_string;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceUtil {
    public static void main(String[] args) {
//        Task 01 The task involves inputting a sentence of five words through the console. The following actions
//        must be performed:
//          • Identify the longest word in the sentence and display it on the console.
//          • Determine the number of letters in the longest word.
//          • Display the second word of the sentence in reverse order on the console.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence of five words: ");
        String inputString = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\s+");
        String[] strings = pattern.split(inputString);
        if (strings.length != 5) {
            System.out.println("You entered incorrect number of words!");
        } else {
            int sizeMax = 0;
            String word = null;
            for (String s : strings) {
                if (sizeMax < s.length()) {
                    sizeMax = s.length();
                    word = s;
                }
            }
            System.out.println("Longest word in a sentence is " + word);
            System.out.println("Number of letters in longest word: " + word + " = " + sizeMax);
            StringBuilder secondElement = new StringBuilder(strings[1]);
            System.out.println("Second word of the sentence in reverse order: " + secondElement.reverse());
        }

//        Task 02 Іnput a sentence that contains words separated by more than one space on the console. The
//        goal is to replace all consecutive spaces with a single space. For instance, if you entered the
//        sentence "I am learning Java Fundamental", the expected result should be "I am learning
//        Java Fundamental ".


        System.out.println("Input sentence that contains words separated by more than one space: ");
        String inputString2 = scanner.nextLine();
        System.out.println(inputString2.replaceAll("\\s+", " "));


//        Task 03 The task requires implementation of a pattern to match US currency format, which includes a
//        dollar sign ($) followed by any number of digits, a dot, and two digits after the dot. The next step
//        is to input a text containing several instances of US currency format via the console. Finally,
//                display all the occurrences of US currency format on the console screen


        String usCurrencyFormat = "\\$\\d+\\.\\d{2}";
        Pattern patternUSCurrencyFormat = Pattern.compile(usCurrencyFormat);
        System.out.println("Input a text containing several instances of US currency format e.g: 'I earn $100222.45 and $1199222.78': ");
        String inputString3 = scanner.nextLine();

        Matcher matcher = patternUSCurrencyFormat.matcher(inputString3);

        System.out.println("US currency format:");
        while (matcher.find()) {
//            System.out.println(inputString3.substring(matcher.start(), matcher.end()));
            System.out.println(matcher.group());
        }


//        Task 4* Create a console application that validates user input for their first and last name, ensuring that
//        they only contain English letters, spaces, and hyphens. If the input data is incorrect, prompt the user
//        to re-enter the data. Upon successful entry of the user's first and last names, generate a random
//        greeting message that includes the user's name.
//        To validate the user input, utilize String class methods, control loops, and regular expressions.
//        Generate the random greeting message (use printf() method for output) by creating an array of
//        phrases that contain various text options with the user's name inserted.

        String firstLastNameFormat = "^[A-Za-z\\s-]+$";
        Pattern patternFirstLastName = Pattern.compile(firstLastNameFormat);
        Matcher matcherFirstLastName;
        String inputFirstLastName;
        do {
            System.out.println("Input your first and last name, ensuring that they only contain English letters, spaces, and hyphens: ");
            inputFirstLastName = scanner.nextLine();
            matcherFirstLastName = patternFirstLastName.matcher(inputFirstLastName);
        } while (!matcherFirstLastName.find());
        String[] arrGreetings = {"Hello", "Hi", "Hey", "Good morning", "Good day", "Yo"};

        Random random = new Random();
        int greetingIndex = random.nextInt(arrGreetings.length);
        System.out.printf("%s! %S!",arrGreetings[greetingIndex], inputFirstLastName);
    }
}
