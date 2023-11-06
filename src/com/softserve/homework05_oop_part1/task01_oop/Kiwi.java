package com.softserve.homework05_oop_part1.task01_oop;

public class Kiwi extends NonFlyingBird {

    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly() {
        System.out.println("Kiwi can not fly");
    }


    @Override
    public String toString() {
        return "Kiwi{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
