package com.softserve.edu.lesson_6_OOP_Concepts2.homework.hw_2;

public class Plane extends FlyingVehicle{

    private int maxDistance;

    public Plane() {
    }

    @Override
    void fly() {

    }

    @Override
    void land() {

    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
