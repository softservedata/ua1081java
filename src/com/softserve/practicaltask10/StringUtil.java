package com.softserve.practicaltask10;

import java.util.Scanner;

public class StringUtil {
    public static void main(String[] args) {
//        Task 01 Input two String variables. Verify if the first variable is a substring of the second variable. For
//        instance, if you entered "SoftServe" and "SoftServe Academy", the expected result should be
//        true.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first string variable: ");
        String string1 = scanner.nextLine();
        System.out.println("Input second string variable: ");
        String string2 = scanner.nextLine();
        if (string2.contains(string1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

//        Task 02 Input the last name, first name, and middle name as String variables on the console. The
//        following outputs will be displayed on the console:
//          • Last name and initials
//          • First name
//          • First name, middle name, and last name.

        System.out.println("Input the last name, first name, and middle name: ");
        String name = scanner.nextLine();
        String[] names = name.split("\\s+");

        System.out.println("Last name and initials " + names[0] + " " + names[1].substring(0, 1) + "." + names[2].substring(0, 1) + ".");
        System.out.println("First name: " + names[1]);
        System.out.println("First name: " + names[1] + " middle name: " + names[2] + " and last name: " + names[0]);


//        Task 03 The task requires validation of usernames using regular expressions. The username should be
//        between 3 to 15 characters and can contain only Latin alphabet, numbers, and underscores. To
//        accomplish this, input five different usernames in the main method and output a message to the
//        console indicating whether each of the entered names is valid or not.

        validateUsername("Kate_1234567890");
        validateUsername("Kate_12345678901");
        validateUsername("Kate-1234567890");
        validateUsername("Ka");
        validateUsername("Kate#1234567890");
    }
    public static void validateUsername(String name){
        String usernameFormat = "^[A-Za-z0-9_]{3,15}$";
//        Pattern usernamePattern = Pattern.compile(usernameFormat);
        if(name.matches(usernameFormat)){
            System.out.println("This name is valid!");
        }else {
            System.out.println("This name is invalid!");
        }


    }
}
