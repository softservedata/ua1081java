/*
  Define two String variables name and address.
  Output question "What is your name? to the console.
  Read the value of name and output next question: “Where do you live, (name)?“ to the console.
  Read the value of address from the console and output the complete information.
 */

package com.softserve.homework01.homework;

import java.util.Scanner;

/**
 * Class allows to aggregate the passed personal information.
 * */
public class PersonalInfoPresentation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This class allows to aggregate your personal information. \nLet's get started! \n\nWhat is your name?");
        String name = sc.nextLine();
        System.out.println("Where do you live, " + name + "?");
        String address = sc.nextLine();
        System.out.println("So, let's summarize the received information: \nName: " + name + "\nAddress: " + address);
    }
}
