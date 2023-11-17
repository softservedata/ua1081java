package com.softserve.homework07.ex02;

public class Bus extends GroundVehicle{

    private String route;

    public Bus() {
    }

    @Override
    public void drive() {
        System.out.println("A bus is driven");
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
