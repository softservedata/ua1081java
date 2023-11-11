package com.softserve.homework06.ex01;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.printf("This is %s, it can fly%n", getClass().getSimpleName());
    }

}
