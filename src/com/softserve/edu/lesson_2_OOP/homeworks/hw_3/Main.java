package com.softserve.edu.lesson_2_OOP.homeworks.hw_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Person person1 = new Person("Nazar", "Kovtalo", 1994);
            person1.changeName("Bohdan", "Koval");
            person1.output();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        try {
            Person person2 = new Person();
            person2.input();
            person2.output();
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.err.println(e.getMessage());
        }
        try {
            Person person3 = new Person("Vitali", "Bilobran", 1995);
            person3.output();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        try {
            Person person4 = new Person();
            person4.input();
            person4.changeName("Rahim", "Lian");
            person4.output();
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.err.println(e.getMessage());
        } finally {
            SCANNER.close();
        }
    }
}


