package com.softserve.homework06.ex01;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.printf("This is %s, it cannot fly%n", getClass().getSimpleName());
    }
}
