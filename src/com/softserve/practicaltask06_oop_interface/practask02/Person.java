package com.softserve.practicaltask06_oop_interface.practask02;

public abstract class Person {
    public String name;
    public Person(String name) {
        this.name = name;
    }

    public abstract void print();
}
