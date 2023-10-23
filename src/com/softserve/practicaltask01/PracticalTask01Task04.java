package com.softserve.practicaltask01;

import java.util.Scanner;

public class PracticalTask01Task04 {
    public static void main(String[] args) {
//        PracticalTask 4
//        Output question “How are you?“. Define string variable answer. Read the value
//        answer and output: “You are (answer)".

        Scanner sc = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = sc.nextLine();
        System.out.println("You are " + answer);
    }

}
