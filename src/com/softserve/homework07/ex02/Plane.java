package com.softserve.homework07.ex02;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane() {
    }

    @Override
    public void fly() {
        System.out.println("A plane is flying");
    }

    @Override
    public void land() {
        System.out.println("A plane is landing");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
