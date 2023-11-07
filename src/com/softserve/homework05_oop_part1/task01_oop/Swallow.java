package com.softserve.homework05_oop_part1.task01_oop;

public class Swallow extends FlyingBird {

    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly() {
        System.out.println("Swallow can fly");
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
