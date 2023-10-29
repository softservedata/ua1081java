package com.softserve.homework04.ex3;

import java.util.Scanner;

public class ErrorNumberParser {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please, input an error code from 400 to 407: ");
        int input = sc.nextInt();
        if (input >= 400 && input <= 407) {
            String inputString = "CODE" + input;
            System.out.println(HTTPErrors.valueOf(inputString).getDescription());
        } else System.out.println("Please, input a valid number from 400 to 407");

    }
}

