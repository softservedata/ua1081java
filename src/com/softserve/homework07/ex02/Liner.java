package com.softserve.homework07.ex02;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner() {
    }

    @Override
    public void isSailing() {
        System.out.println("Liner is sailing");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
