package com.softserve.edu.lesson_5_OOP_Concepts.practice.practice_1;

public class DesktopComputer extends Computer {

    public void turnOn() {
        System.out.println("Turning on desktop computer...");
    }

    @Override
    public void shutDown() {
        System.out.println("Shut Down desktop computer...");
    }

    static void printBrand() {
        System.out.println("Desktop computer brand: " + brand);
    }
}

