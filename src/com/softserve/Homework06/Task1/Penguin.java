package com.softserve.Homework06.Task1;

public class Penguin extends NonFlyingBird{
    private String name = "Penguin";
    @Override
    public void fly() {
        System.out.println(" It's "+name);
        super.fly();
    }

    @Override
    public String toString() {
        return "\nPenguin{" +
                "name='" + name + '\'' +
                '}';
    }
}
