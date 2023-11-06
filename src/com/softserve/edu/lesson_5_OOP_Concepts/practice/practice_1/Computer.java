package com.softserve.edu.lesson_5_OOP_Concepts.practice.practice_1;

public abstract class Computer {

    static String brand = "Generic";

    public abstract void turnOn();

    public abstract void shutDown();

    static void printBrand() {
        System.out.println("Computer brand: " + brand);
    }
}
