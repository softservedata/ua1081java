package com.softserve.practical06.ex01;

abstract class Computer {
    static String brand ="Generic";

    public abstract void turnOn();

    public abstract void shutDown();

    public abstract void printBrand();
}

class DesktopComputer extends Computer {
    public void turnOn() {
        System.out.println("Turning on desktop computer...");
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down desktop computer...");
    }

    @Override
    public void printBrand() {
        System.out.println("Desktop computer brand: " + brand);
    }
}

class LaptopComputer extends Computer {

    @Override
    public void turnOn() {
        System.out.println("Turning on laptop computer...");
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down laptop computer...");
    }

    @Override
    public void printBrand() {
        System.out.println("Laptop computer brand: " + brand);
    }
}
public class Main {
    public static void main(String[] args) {
        Computer desktop = new DesktopComputer();
        Computer laptop = new LaptopComputer();
        desktop.turnOn();
        laptop.turnOn();
        desktop.shutDown();
        laptop.shutDown();
        desktop.printBrand();
        laptop.printBrand();
    }
}
