package com.softserve.practicaltask05_oop_part1.practask02;

public abstract class Car2 {

    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public Car2(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public abstract void run();

    public abstract void stop();

}
