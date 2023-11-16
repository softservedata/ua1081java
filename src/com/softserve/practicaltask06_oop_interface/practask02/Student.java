package com.softserve.practicaltask06_oop_interface.practask02;

public class Student extends Person {
    final String TYPE_PERSON;

    public Student(String name) {
        super(name);
        this.TYPE_PERSON = "Student";
    }

    @Override
    public void print() {
        System.out.println("My name is " + Student.super.name + " and I am " + TYPE_PERSON);
    }
}
