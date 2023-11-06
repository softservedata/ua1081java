package com.softserve.edu07oop2;

class Cube extends Shape implements Vertexable, Volumetric {
    private double side;

    public Cube(double side, String name) {
        super(name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return 12 * side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public int getNumberOfVertex() {
        return 8;
    }
}