package com.softserve.edu.lesson_5_OOP_Concepts.practice.practice_1;

public class Main {

    public static void main(String[] args) {
        Computer desktop = new DesktopComputer();
        Computer laptop = new LaptopComputer();
        desktop.turnOn();
        laptop.turnOn();
        desktop.shutDown();
        laptop.shutDown();
        DesktopComputer.printBrand();
        LaptopComputer.printBrand();
        Computer.printBrand();
    }
}

