package Homework7.Homework2;

abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }

    abstract void fly();

    abstract void land();
}
