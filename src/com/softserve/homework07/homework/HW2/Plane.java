package com.softserve.homework07.homework.HW2;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane() {
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("The plane is flying.");
    }

    @Override
    public void land() {
        System.out.println("The plane landed.");
    }
}
