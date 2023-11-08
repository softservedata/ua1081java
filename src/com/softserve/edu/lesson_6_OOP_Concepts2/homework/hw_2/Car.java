package com.softserve.edu.lesson_6_OOP_Concepts2.homework.hw_2;

public class Car extends GroundVehicle{

    private String model;

    public Car() {
    }

    @Override
    void drive() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
