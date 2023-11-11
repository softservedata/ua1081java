package com.softserve.practical06.ex02;

public class Sedan extends Car{

    public Sedan(String model, double maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan, " + getModel() + ", has been started");
    }

    @Override
    public void stop() {
        System.out.println("Sedan, " + getModel() + ", has been stopped");
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='Sedan'" +
                ", model='" + getModel() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                ", yearOfProduction=" + getYearOfProduction() +
                '}';
    }
}
