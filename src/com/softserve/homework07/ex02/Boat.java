package com.softserve.homework07.ex02;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat() {
    }

    @Override
    public void isSailing() {
        System.out.println("Boat is sailing");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
