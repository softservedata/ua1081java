package com.softserve.Homework11.Practical11.Task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[\\w\\d]{3,15}";
        Pattern p = Pattern.compile(regex);
        System.out.print(" Enter user name: ");
        Matcher m;
        String userName;
        boolean isWorking;
        do{
            userName= scanner.nextLine();
            m=p.matcher(userName);
            isWorking = m.find();
            if(!isWorking){
                System.out.print(" Wrong entry!\n Try again: ");
            }
        }while (!isWorking);
        System.out.println(" Your user name: "+userName);
    }
}
