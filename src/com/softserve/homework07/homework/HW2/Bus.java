package com.softserve.homework07.homework.HW2;

public class Bus extends GroundVehicle {
    private String route;

    public Bus() {
    }

    @Override
    public void drive() {
        System.out.println("The bus is driving.");
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
