package com.softserve.Homework11.Task4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\w+[ -]\\w+";
        Pattern p = Pattern.compile(regex);
        System.out.print(" Enter user first and last name: ");
        Matcher m;
        String fullName;
        boolean isWorking;
        do{
             fullName= scanner.nextLine();
            m = p.matcher(fullName);
             isWorking = m.find();
            if(!isWorking) {
                System.out.println(" Wrong first name or last name");
                System.out.print(" (Example: Krilyshyn Andrian or Krilyshyn-Andrian)\n Try again: ");
            }
        }while(!isWorking);
        System.out.printf(" Successfully, your full name:  %s",fullName);
    }
}
