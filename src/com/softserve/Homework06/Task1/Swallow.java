package com.softserve.Homework06.Task1;

public class Swallow extends FlyingBird{
    private String name="Swallow";
    @Override
    public void fly() {
        System.out.println(" It's "+name);
        super.fly();
    }

    @Override
    public String toString() {
        return "\nSwallow{" +
                "name='" + name + '\'' +
                '}';
    }
}
