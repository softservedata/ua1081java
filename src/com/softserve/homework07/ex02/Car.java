package com.softserve.homework07.ex02;

public class Car extends GroundVehicle{
    private String model;

    public Car() {
    }

    @Override
    public void drive() {
        System.out.println("A car is driven");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
