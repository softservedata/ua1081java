package com.softserve.edu.lesson_10_String.homework.hw_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 words");
        System.out.println("First");
        String first = sc.next();
        System.out.println("Second");
        String second = sc.next();
        System.out.println("Third");
        String third = sc.next();
        System.out.println("Fourth");
        String fourth = sc.next();
        System.out.println("Fifth");
        String fifth = sc.next();
        String[] arr = new String[]{first, second, third, fourth, fifth};

        longestWord(arr);
        reversedSecondWord(arr);
    }

    static void longestWord(String[] arr) {
        String longest = "";
        for (String s : arr) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        System.out.println("LONGEST WORD " + longest);
        System.out.println("LONGEST WORD HAS " + longest.length() + " letters");
    }

    static void reversedSecondWord(String[]arr){
        String second = arr[1];
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder append = stringBuilder.append(second);
        StringBuilder reverse = append.reverse();
        String stringSecond = reverse.toString();
        System.out.println("REVERSED SECOND WORD " + stringSecond );
    }
}
