package com.softserve.homework05_oop_part1.task01_oop;

public class FlyingBird extends Bird{
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird can fly");
    }
}
