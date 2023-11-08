package com.softserve.edu.lesson_6_OOP_Concepts2.practice.practice_2;

public class Teacher extends Staff{

    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
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
