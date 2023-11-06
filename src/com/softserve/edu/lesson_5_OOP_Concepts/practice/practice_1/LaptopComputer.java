package com.softserve.edu.lesson_5_OOP_Concepts.practice.practice_1;

public class LaptopComputer extends Computer{
    @Override
    public void turnOn() {
        System.out.println("Turning on laptop computer...");
    }

    @Override
    public void shutDown() {
        System.out.println("Shut down laptop computer...");
    }

    static void printBrand() {
        System.out.println("Laptop computer brand: " + brand);
    }
}
