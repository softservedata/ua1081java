package com.softserve.edu06;

public abstract class Shape {
    public abstract double getArea();

    public abstract double getPerimeter();

    public void print() {
        System.out.println("Hello");
    }
}

abstract class Parallelogram extends Shape {
    private int width;
    private int height;
    private int angle;

    public Parallelogram(int width, int height, int angle) {
        this.width = width;
        this.height = height;
        this.angle = angle;
    }

    public Parallelogram(int width, int height) {
        this.width = width;
        this.height = height;
    }
    //    @Override
//    public double getArea() {
//        return (width * height * Math.sin(angle * Math.PI / 180));
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * (width + height);
//    }
}

class A extends Parallelogram {
    private int a;

    public A(int width, int height, int a) {
        super(width, height);
        this.a = a;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}