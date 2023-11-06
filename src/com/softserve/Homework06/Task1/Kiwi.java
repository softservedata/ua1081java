package com.softserve.Homework06.Task1;

public class Kiwi extends NonFlyingBird{
    private String name = "Kiwi";
    @Override
    public void fly() {
        System.out.println( " "+name+" can't fly");
    }

    @Override
    public String toString() {
        return "\nKiwi{" +
                "name='" + name + '\'' +
                '}';
    }
}
