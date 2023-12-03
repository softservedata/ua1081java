/*
Create a console application that validates user input for their first and last name,
ensuring that they only contain English letters, spaces, and hyphens.
If the input data is incorrect, prompt the user to re-enter the data.
Upon successful entry of the user's first and last names, generate a random greeting message that includes the user's name.

To validate the user input, utilize String class methods, control loops, and regular expressions.
Generate the random greeting message (use printf() method for output) by creating an array of phrases
that contain various text options with the user's name inserted.
 */

package com.softserve.homework11.homework;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateName {

    public static boolean validateName (String name) {
        String pattern = "^([a-zA-Z-]+)(\\s)([a-zA-Z-]+)$";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] greetingPhrases = {"Hello", "Hi", "Long time no see", "Pleased to meet you", "Good to see you"};
        int randomIndex = new Random().nextInt(5);

        System.out.print("Please enter your full name: ");

        String fullName = scanner.nextLine().trim().replaceAll(" +", " ");

        while (!validateName(fullName)) {
            System.out.print("The entered name is not valid. Please enter the name again: ");
            fullName = scanner.nextLine().trim().replaceAll(" +", " ");
        }

        System.out.printf("%s, %s!", greetingPhrases[randomIndex], fullName);
    }
}
