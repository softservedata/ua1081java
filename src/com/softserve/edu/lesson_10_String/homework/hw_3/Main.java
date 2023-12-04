package com.softserve.edu.lesson_10_String.homework.hw_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//static or don't forget to close
        System.out.println("Please enter the text which has a US dollar format ");
        String text = sc.nextLine();
        String p = "\\$\\d+\\.\\d{2}";
        Pattern compile = Pattern.compile(p);
        Matcher m = compile.matcher(text);

        System.out.println("US dollar");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
