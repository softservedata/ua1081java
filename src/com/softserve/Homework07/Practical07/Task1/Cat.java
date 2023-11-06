package com.softserve.Homework07.Practical07.Task1;

public class Cat implements Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice(){
        System.out.println(" The cat  barks");
    }

    @Override
    public void feed(){
        System.out.println(" The cat is fed");
    }
    @Override
    public String name(){
        return  name;
    }
}
