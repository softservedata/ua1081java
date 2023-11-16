package com.softserve.homework06_oop_interface.task02;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int weight, int maxHeight, int passengers) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }


    @Override
    public void fly() {
        System.out.println("Helicopter can fly");
    }

    @Override
    public void land() {
        System.out.println("Helicopter can stand on land");
    }

}
