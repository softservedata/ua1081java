package com.softserve.homework07.ex02;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }

    public abstract void fly();

    public abstract void land();
}
