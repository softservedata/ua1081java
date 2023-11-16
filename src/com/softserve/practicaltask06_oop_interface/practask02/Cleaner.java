package com.softserve.practicaltask06_oop_interface.practask02;

public class Cleaner extends Staff {
    final String TYPE_PERSON;

    public Cleaner(String name) {
        super(name);
        this.TYPE_PERSON = "Cleaner";
    }

    @Override
    public void salary() {
        System.out.println("Cleaner's salary is 1000");
    }

    @Override
    public void print() {
        System.out.println("My name is " + Cleaner.super.name + " and I am " + TYPE_PERSON);
    }
}
