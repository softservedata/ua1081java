package com.softserve.edu.lesson_6_OOP_Concepts2.practice.practice_2;

public class Student extends Person{

    public static final String TYPE_PERSON = "Student";
    public Student(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I am " + TYPE_PERSON);
    }
}
