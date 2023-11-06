package com.softserve.edu.lesson_5_OOP_Concepts.homework.hw_1;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("They CANT fly");
    }
}
