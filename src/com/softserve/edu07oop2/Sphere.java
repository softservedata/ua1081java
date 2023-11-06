package com.softserve.edu07oop2;

public class Sphere extends Shape implements Volumetric {
    private double radius;

    public Sphere(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return 4.0 / 3 * Volumetric.PI * Math.pow(radius, 3);
    }
}
