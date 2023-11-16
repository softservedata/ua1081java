package com.softserve.practicaltask06_oop_interface.practask02;

public class Teacher extends Staff {
    final String TYPE_PERSON;

    public Teacher(String name) {
        super(name);
        TYPE_PERSON = "Teacher";
    }

    @Override
    public void salary() {
        System.out.println("Teacher's salary is 5000");
    }

    @Override
    public void print() {
        System.out.println("My name is " + Teacher.super.name + " and I am " + TYPE_PERSON);
    }
}
