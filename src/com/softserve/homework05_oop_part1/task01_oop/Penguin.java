package com.softserve.homework05_oop_part1.task01_oop;

public class Penguin extends NonFlyingBird {

    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly() {
        System.out.println("Penguin can not fly");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
