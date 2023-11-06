package com.softserve.Homework07.Practical07.Task2;

public class Student extends Person {
    private final String TYPE_PERSON="STUDENT";
    public Student(){
        System.out.println(TYPE_PERSON);
    }
    @Override
    public void print(){
        System.out.println(" I'm student");
    }
}
