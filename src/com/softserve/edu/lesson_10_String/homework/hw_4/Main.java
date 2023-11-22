package com.softserve.edu.lesson_10_String.homework.hw_4;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] greeting = new String[]{"Hello %s", "Welcome back %s", "Hey, how are you %s", "Nice to see you again %s"};
        Random random = new Random();
        int pos = random.nextInt(greeting.length);
        String s = greeting[pos];

        String fullyName;
        boolean matches;

        do {
            System.out.println("Enter first name");
            String name = sc.nextLine();
            System.out.println("Enter last name");
            String surname = sc.nextLine();
            fullyName = name.concat(" " + surname);
            matches = name.matches("^[a-zA-Z\\s\\-]+$");

            if (!matches) {
                System.out.println("Invalid name or surname , please use only English letters");
            }
        } while (!matches);

        System.out.printf(s, fullyName);
    }

}

