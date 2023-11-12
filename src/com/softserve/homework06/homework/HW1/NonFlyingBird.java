package com.softserve.homework06.homework.HW1;

public class NonFlyingBird extends  Bird {

    private boolean isFloating;

    public NonFlyingBird (String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void setFloating(boolean floating) {
        isFloating = floating;
    }

    public boolean isFloating() {
        return isFloating;
    }

    @Override
    public void fly() {
        System.out.println("Bird can`t fly.");
    }
}
