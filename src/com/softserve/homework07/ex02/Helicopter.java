package com.softserve.homework07.ex02;

public class Helicopter extends FlyingVehicle {
    public int weight;
    public int maxHeight;

    public Helicopter() {
    }

    @Override
    public void fly() {
        System.out.println("A helicopter is flying");
    }

    @Override
    public void land() {
        System.out.println("A helicopter is landing");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }
}
