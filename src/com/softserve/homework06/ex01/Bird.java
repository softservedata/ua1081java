package com.softserve.homework06.ex01;

public abstract class Bird {
    private String feathers;
    private boolean layEggs;

    abstract void fly();

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
}
