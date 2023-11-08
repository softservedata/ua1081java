package com.softserve.edu.lesson_6_OOP_Concepts2.homework.hw_2;

public class Bus extends GroundVehicle{

    private String route;

    public Bus() {
    }

    @Override
    void drive() {

    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
