package com.softserve.edu.lesson_2_OOP.homeworks.hw_3;

import java.util.Scanner;

public class Main {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
      Person person1 = new Person("Nazar", "Kovtalo", 1994);
        person1.changeName("Bohdan","Koval");
        person1.output();

        Person person2 = new Person();
        person2.input();
        person2.output();

        Person person3 = new Person("Vitali","Bilobran",1995);
        person3.output();

        Person person4 = new Person();
        person4.input();
        person4.changeName("Rahim","Lian");
        person4.output();

    }
}
