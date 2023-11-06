package com.softserve.Homework07.Task2;

public class Liner extends WaterVehicle{
    public int floors;
    public Liner(){}

    @Override
    protected void isSailing() {}

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
