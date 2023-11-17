package com.softserve.practical07.ex01;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.printf("%s (%s) is barking%n", getName(), getClass().getSimpleName());
    }

    @Override
    public void feed() {
        System.out.printf("%s (%s) is fed with meat%n", getName(), getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }
}
