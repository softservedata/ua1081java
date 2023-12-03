package com.softserve.homework11.ex02;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please, input a sentence with words, separated by more than one space:");
        String input = sc.nextLine();
        String editedInput = input.trim().replaceAll(" +", " ");
        System.out.println(editedInput);
    }
}
