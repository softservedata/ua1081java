package com.softserve.edu.lesson_10_String.practice.practice_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"Hello","all in now", "Vitalik_1995", "Віталік", "ad"};
        for (String s : arr) {
            Pattern p = Pattern.compile("[a-zA-Z0-9_]{3,15}");
            Matcher matcher = p.matcher(s);
            if (matcher.matches()) {
                System.out.println(s + " - is valid ");
            } else {
                System.out.println(s + " - not valid");
            }
        }

    }
}
