/*
  Output question “How are you?“.
  Define string variable answer.
  Read the value answer and output: “You are (answer)".
 */

package com.softserve.homework01.practicaltask;

import java.util.Scanner;

public class HowAreYou {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = sc.nextLine();
        System.out.println("You are " + answer.toLowerCase() + ".");
    }
}
