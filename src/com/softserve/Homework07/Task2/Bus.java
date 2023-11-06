package com.softserve.Homework07.Task2;

public class Bus extends GroundVehicle{
    private String route;
    public Bus(){}
    @Override
    protected void drive(){}

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
