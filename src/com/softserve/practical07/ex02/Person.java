package com.softserve.practical07.ex02;

public abstract class Person {
    private String name;

    protected Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void print();


}
