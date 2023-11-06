package com.softserve.Homework06.Task1;

public abstract class Bird {
    private String feathers;
    private boolean layEggs;
    public abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
