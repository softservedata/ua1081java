package com.softserve.Homework07.Task2;

public class Car extends GroundVehicle{
    private String model;
    public Car(){}
    @Override
    protected void drive(){//can be something like this
        System.out.println("Car is driving");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
