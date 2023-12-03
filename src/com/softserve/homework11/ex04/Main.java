package com.softserve.homework11.ex04;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] randomGreetings = {"Hey, %s, nice to meet you!%n", "%s, welcome to our resource.%n",
            "Hi, %s, hope you will like being here!%n", "Hello, %s, let your stay here be effective for you.%n",
            "Hi, %s, enjoy your stay!%n", "Dear %s, please, feel comfortable here.%n"};

    public static boolean inputMatcher(String name) {
        String pattern = "[A-Za-z]+-?[A-Za-z]*[ ]+[A-Za-z]+-?[A-Za-z]*"; //accepts double name and double surname, like "Ivan-Andriy Ivanov-Petrenko"
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(name);
        return m.matches();
    }

    public static String randomGreeting(String name) {
        Random rand = new Random();
        return String.format(randomGreetings[rand.nextInt(randomGreetings.length)], name);
    }

    public static String format(String name) {
        String removedExtraSpaces = name.trim().replaceAll(" +", " ");
        String[] nameArr = removedExtraSpaces.split(" ");

        for (int i = 0; i < nameArr.length; i++) {

            if (nameArr[i].contains("-")) { //case of double name/surname
                String lowerCased = nameArr[i].toLowerCase();
                String nameFormatted = lowerCased.substring(0, 1).toUpperCase()
                        + lowerCased.substring(1, lowerCased.indexOf("-"))
                        + "-" + lowerCased.substring(lowerCased.indexOf("-") + 1, lowerCased.indexOf("-") + 2).toUpperCase()
                        + lowerCased.substring(lowerCased.indexOf("-") + 2);
                nameArr[i] = nameFormatted;
            } else {
                String lowerCased = nameArr[i].toLowerCase();
                String nameFormatted = lowerCased.substring(0, 1).toUpperCase() + lowerCased.substring(1);
                nameArr[i] = nameFormatted;
            }
        }
        return nameArr[0] + " " + nameArr[1];
    }

    public static void main(String[] args) {
        boolean isInputInTrueFormat = false;
        System.out.println("Please, input your first and last name:");
        while (!isInputInTrueFormat) {

            String input = sc.nextLine();

            if (inputMatcher(input)) {
                System.out.println(randomGreeting(format(input)));
                isInputInTrueFormat = true;
            } else {
                System.out.println("Please, input both first and last name, using correct data (English letters, hyphens or spaces):");
            }
        }
    }
}
