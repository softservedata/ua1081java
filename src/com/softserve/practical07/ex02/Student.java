package com.softserve.practical07.ex02;

public class Student extends Person{
    final String TYPE_OF_PERSON = "Student";
    protected Student(String name) {
        super(name);
        System.out.printf("This is a %s created %n", TYPE_OF_PERSON.toLowerCase());
    }

    @Override
    void print() {
        System.out.printf("I am a %s named %s%n", TYPE_OF_PERSON.toLowerCase(), getName());
    }
}
