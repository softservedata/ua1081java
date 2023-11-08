package com.softserve.edu.lesson_6_OOP_Concepts2.practice.practice_1;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = new Animal[]{new Dog("Bethoven",2),
        new Dog("Karas",12),
        new Cat("Miki",3)};

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
            animals[i].feed();
        }
    }
}
