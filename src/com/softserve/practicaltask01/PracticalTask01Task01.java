package com.softserve.practicaltask01;

import java.util.Scanner;

public class PracticalTask01Task01 {
    public static void main(String[] args) {

//        PracticalTask 1
//        Write a program that reads three strings and outputs them in the reverse order, each
//        on a new line.

        Scanner sc = new Scanner(System.in);
        System.out.println("Input text: ");
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        String string3 = sc.nextLine();
        System.out.println("Output text: ");
        System.out.println(string3);
        System.out.println(string2);
        System.out.println(string1);
    }

}
