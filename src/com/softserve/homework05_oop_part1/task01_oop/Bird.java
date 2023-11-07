package com.softserve.homework05_oop_part1.task01_oop;

public abstract class Bird {
    public String feathers;
    public boolean layEggs;

    public abstract void fly();

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

}
