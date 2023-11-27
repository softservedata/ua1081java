package com.softserve.edu.lesson_3_Enums.homework.hw_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code error");//more informative message about what user should enter
        int code = sc.nextInt();

        for (HTTPError value : HTTPError.values()) {
            if (value.getCode() == code) {
                System.out.println(code + " - " + value.getName());

            }//and what if code is not found?
            //you should add else statement with message that code is not found
        }

    }
}




