package com.softserve.Homework11.Task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String regex = "\\$\\d+\\.\\d{2}";
        Pattern p = Pattern.compile(regex);
        String text="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text containing US currency formats:");
        while (scanner.hasNextLine()) {
            text= scanner.nextLine();
            Matcher m = p.matcher(text);
            System.out.println("US Currency Formats found:");
            while(m.find()){
            System.out.println(m.group());
            }
        }
    }
}
