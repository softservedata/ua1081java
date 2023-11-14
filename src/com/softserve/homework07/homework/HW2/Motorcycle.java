package com.softserve.homework07.homework.HW2;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("The motorcycle is driving.");
    }
}
