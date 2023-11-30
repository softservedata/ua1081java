package com.softserve.Homework07.Task2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter() {
    }

    @Override
    protected void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    protected void land() {
    }

}
