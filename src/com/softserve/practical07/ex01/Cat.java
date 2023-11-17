package com.softserve.practical07.ex01;

public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.printf("%s (%s) says 'meow'%n", getName(), getClass().getSimpleName());
    }

    @Override
    public void feed() {
        System.out.printf("%s (%s) is fed with fish%n", getName(), getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }
}
