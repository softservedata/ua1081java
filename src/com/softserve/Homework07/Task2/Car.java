package com.softserve.Homework07.Task2;

public class Car extends GroundVehicle{
    private String model;
    public Car(){}
    @Override
    protected void drive(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
