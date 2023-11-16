package com.softserve.homework01;

import java.util.Scanner;

public class HomeWork01Task02 {
    public static void main(String[] args) {

//        Task 2 Define two String variables name and address. Output question "What is your name?
//        to the console. Read the value of name and output next question: “Where do you live,
//        (name)?“ to the console. Read the value of address from the console and output the
//        complete information.

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Where do you live, " + name + "?");
        String address = sc.nextLine();
        System.out.println("Your name is " + name + " and you live at this address: " + address);
        sc.close();//don't forget to close scanner
    }

}
