package com.softserve.practical06.ex02;

public class Truck extends Car{

    public Truck(String model, double maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck, " + getModel() + ", has been started");
    }

    @Override
    public void stop() {
        System.out.println("Truck, " + getModel() + ", has been stopped");
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='Truck'" +
                ", model='" + getModel() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                ", yearOfProduction=" + getYearOfProduction() +
                '}';
    }
}
