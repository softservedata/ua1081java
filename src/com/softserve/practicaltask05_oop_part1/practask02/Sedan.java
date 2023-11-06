package com.softserve.practicaltask05_oop_part1.practask02;

public class Sedan extends Car2{
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan is running");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopped");
    }
}
