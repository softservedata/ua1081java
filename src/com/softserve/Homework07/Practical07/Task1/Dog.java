package com.softserve.Homework07.Practical07.Task1;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(" The dog  barks");
    }

    @Override
    public void feed() {
        System.out.println(" The dog is fed");
    }
    @Override
    public String name(){
        return  name;
    }
}
