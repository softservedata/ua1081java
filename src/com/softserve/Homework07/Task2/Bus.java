package com.softserve.Homework07.Task2;

public class Bus extends GroundVehicle{
    private String route;
    public Bus(){}
    @Override
    protected void drive(){//can be something like this
        System.out.println("Bus is driving");
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
