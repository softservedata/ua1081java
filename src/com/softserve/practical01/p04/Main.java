package com.softserve.practical01.p04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = sc.nextLine();
        System.out.printf("You are %s.", answer);

        sc.close();
    }
}