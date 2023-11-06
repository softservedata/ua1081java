package com.softserve.edu07oop2;

public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return name;
//        return "Shape{" +
//                "name='" + name + '\'' +
//                '}';
    }
}
