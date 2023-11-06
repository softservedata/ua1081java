package com.softserve.edu.lesson_5_OOP_Concepts.practice.practice_2;

public class Truck extends Car{
    public Truck(String model, int maxSpeed, int year) {
        super(model, maxSpeed, year);
    }

    @Override
    void run() {
        System.out.println(this.getModel() + " truck run");
    }

    @Override
    void stop() {
        System.out.println(this.getModel() + " truck stop");
    }


}
