package com.softserve.homework07.homework.HW2;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat() {
    }

    @Override
    public void isSailing() {
        System.out.println("The boat is sailing.");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
