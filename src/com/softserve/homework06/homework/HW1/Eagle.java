package com.softserve.homework06.homework.HW1;

public class Eagle extends FlyingBird {

    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
        this.setSpecies("Eagle");
    }



    @Override
    public void fly() {
        System.out.println("The " + getSpecies().toLowerCase() + " soars high above the ground.");
    }

    @Override
    public String toString() {
        return "Bird species: " + getSpecies().toLowerCase() + ".\nFeathers colour: " + getFeathers() + ".";
    }
}
