package com.softserve.practicaltask06_oop_interface.practask01;

public class Cat implements Animal {
    @Override
    public String toString() {
        return "Cat";
    }

    @Override
    public void voice() {
        System.out.println("The cat is meowing");
    }

    @Override
    public void feed() {
        System.out.println("The cat is eating milk");
    }
}
