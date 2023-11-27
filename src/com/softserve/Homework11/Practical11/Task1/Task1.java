package com.softserve.Homework11.Practical11.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter first string: ");
        String s1 = scanner.nextLine();
        System.out.println(" Enter second string: ");
        String s2 = scanner.nextLine();
        System.out.println(" s1 is"+(s2.contains(s1)?"":" no")+" substring s2");
    }
}
