package com.softserve.Homework07.Task2;

public class Boat extends WaterVehicle{
    private int volume;
    public Boat(){}
    @Override
    protected void isSailing(){//can be something like this
        System.out.println("Boat is sailing");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
