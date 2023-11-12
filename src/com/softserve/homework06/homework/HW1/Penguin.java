package com.softserve.homework06.homework.HW1;

public class Penguin extends NonFlyingBird {

    public Penguin (String feathers, boolean layEggs) {
        super(feathers, layEggs);
        this.setSpecies("Penguin");
        this.setFloating(true);
    }

    @Override
    public void fly() {
        System.out.println(getSpecies() + " can't fly.");
    }

    @Override
    public String toString() {
        return "Bird species: " + getSpecies().toLowerCase() + ".\nFeathers colour: " + getFeathers() + ".\nCan swim: " + (isFloating() ? "yes." : "no.");
    }
}
