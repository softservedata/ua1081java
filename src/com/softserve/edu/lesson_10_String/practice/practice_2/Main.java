package com.softserve.edu.lesson_10_String.practice.practice_2;

public class Main {
    public static void main(String[] args) {
        String firstName = "Vitalii";
        String lastName = "Bilobran";
        String middleName = "Ihorovych";

        char charFirstName = firstName.charAt(0);
        char charMiddledName = middleName.charAt(0);

        System.out.println(lastName + " " + charFirstName + "." + charMiddledName);
        System.out.println(firstName);
        System.out.println(firstName + " " +  middleName + " " + lastName);

    }
}
