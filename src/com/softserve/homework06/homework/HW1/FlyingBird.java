package com.softserve.homework06.homework.HW1;

public class FlyingBird extends Bird {

    public FlyingBird (String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Bird can fly.");
    }
}
