package com.softserve.homework06_oop_interface.task02;

public abstract class GroundVehicle extends Passengers implements Vehicle{

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public abstract void drive();
}
