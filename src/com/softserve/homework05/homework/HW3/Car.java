package com.softserve.homework05.homework.HW3;

public class Car {
    private String type;
    private int productionYear;
    private double engineCapacity;

    public Car(String type, int productionYear, double engineCapacity) {
        this.type = type;
        this.productionYear = productionYear;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car type: '" + type +
                "'. Production Year: " + productionYear +
                ". Engine Capacity: " + engineCapacity;
    }
}
