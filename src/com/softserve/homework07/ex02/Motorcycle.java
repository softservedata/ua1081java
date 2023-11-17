package com.softserve.homework07.ex02;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle() {
    }

    @Override
    public void drive() {
        System.out.println("A motorcycle is driven");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
