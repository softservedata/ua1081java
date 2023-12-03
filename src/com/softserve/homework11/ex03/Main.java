package com.softserve.homework11.ex03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please, input a sentence:");
        String input = sc.nextLine();

        String pattern = "\\$( )*\\d+[.,]?\\d{0,2}"; //also reads whole numbers and numbers with comma separator
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(input);
        while (matcher.find()) {
            String matchedSubstring = input.substring(matcher.start(), matcher.end());
            if (matchedSubstring.endsWith(".") || matchedSubstring.endsWith(",") ) { //to eliminate whole numbers followed by dot or comma
                System.out.println(matchedSubstring.substring(0, matchedSubstring.length() - 1));
            } else System.out.println(matchedSubstring);
        }
    }
}
