package com.softserve.Homework06.Practical06.Task02;

import java.util.Arrays;

public abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();
    public abstract void stop();

    @Override
    public String toString() {
        return "\n Model: " + model +
                "\n maxSpeed: " + maxSpeed +
                "  yearOfProduction: " + yearOfProduction;
    }
}
class Truck extends Car{
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model,maxSpeed,yearOfProduction);
    }

    @Override
    public void run(){
        System.out.println(" The truck was started");
    }
    @Override
    public void stop(){
        System.out.println(" The truck was stopped");
    }

}
class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model,maxSpeed,yearOfProduction);
    }
    @Override
    public void run(){
        System.out.println(" The sedan was started");

    }
    @Override
    public void stop(){
        System.out.println(" The sedan was stopped");

    }
}
class Main{
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Truck("Ford", 150, 2015);
        cars[1] = new Sedan("Toyota", 120, 2020);
        cars[2] = new Sedan("Honda", 130, 2018);
        cars[3] = new Truck("Chevrolet", 160, 2019);
        System.out.println(Arrays.toString(cars));
    }

}
