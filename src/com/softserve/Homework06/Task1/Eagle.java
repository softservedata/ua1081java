package com.softserve.Homework06.Task1;

public class Eagle extends FlyingBird{
private String name = "Eagle";
    @Override
    public void fly() {
        System.out.println(" " +name+" flying now");
    }

    @Override
    public String toString() {
        return "\nEagle{" +
                "name='" + name + '\'' +
                '}';
    }
}
