package com.softserve.homework06.homework.HW1;

public class Swallow extends FlyingBird {

    public Swallow (String feathers, boolean layEggs) {
        super(feathers, layEggs);
        this.setSpecies("Swallow");
    }

    @Override
    public void fly() {
        System.out.println("The " + getSpecies().toLowerCase() + " flies low to the ground.");
    }

    @Override
    public String toString() {
        return "Bird species: " + getSpecies().toLowerCase() + ".\nFeathers colour: " + getFeathers() + ".";
    }
}
