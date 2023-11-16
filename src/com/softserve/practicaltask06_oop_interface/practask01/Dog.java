package com.softserve.practicaltask06_oop_interface.practask01;

public class Dog implements Animal {
    @Override
    public String toString() {
        return "Dog";
    }

    @Override
    public void voice() {
        System.out.println("The dog is barking");
    }

    @Override
    public void feed() {
        System.out.println("The dog is eating a bone");
    }
}
