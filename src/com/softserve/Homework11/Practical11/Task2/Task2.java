package com.softserve.Homework11.Practical11.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter first name: ");
        String firstName =scanner.nextLine();
        System.out.print(" Enter middle name: ");
        String middleName =scanner.nextLine();
        System.out.print(" Enter last name: ");
        String lastName =scanner.nextLine();
        System.out.println(" You are "+ lastName+" "+firstName.charAt(0)+"."+middleName.charAt(0)+".");
        System.out.println(" Your name: "+firstName);
        System.out.println(" Your full name: "+firstName+" "+middleName+" "+lastName);
    }
}
