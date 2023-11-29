package com.softserve.edu.lesson_10_String.homework.hw_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//static or don't forget to close
        System.out.println("Please enter sentence ");
        String sentence = sc.nextLine();
        String all = sentence.replaceAll("\\s+", " ");
        System.out.println(all);

    }
}
