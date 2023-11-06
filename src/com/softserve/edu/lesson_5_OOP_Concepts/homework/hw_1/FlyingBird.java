package com.softserve.edu.lesson_5_OOP_Concepts.homework.hw_1;

public class FlyingBird extends Bird{


    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("They CAN fly");
    }
}
