package com.softserve.edu.lesson_3_Enums.homework.hw_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code error");
        int code = sc.nextInt();

        for (HTTPError value : HTTPError.values()) {
            if (value.getCode() == code) {
                System.out.println(code + " - " + value.getName());
            }

        }
    }
}





