package com.softserve.Homework05.Task3;

public class Car {
    private String type;
    private int yearProduction;
    private double engineCapacity;

    public Car(String type, int yearProduction, double engineCapacity) {
        this.type = type;
        this.yearProduction = yearProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearProduction() {
        return yearProduction;
    }


    @Override
    public String toString() {
        return " Car{" +
                "type='" + type + '\'' +
                ", yearProduction=" + yearProduction +
                ", engineCapacity=" + engineCapacity +
                "} ";
    }
}
