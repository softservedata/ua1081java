package com.softserve.edu.lesson_6_OOP_Concepts2.practice.practice_2;

public class Cleaner extends Staff{

    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    void salary() {
        System.out.println("Salary for " + TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I'am " + TYPE_PERSON);
    }
}
