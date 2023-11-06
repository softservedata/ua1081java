package com.softserve.Homework07.Task2;

public class Plane extends FlyingVehicle{
    private int maxDistance;
    public Plane(){}

    @Override
    protected void fly() {}
    @Override
    protected void land(){}

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
