package com.softserve.edu.lesson_4_Arrays.homework.hw_3;

public class Car {
    Type type;
    int year;
    double engineCap;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(double engineCap) {
        this.engineCap = engineCap;
    }

    public Car(Type type, int year, double engineCap) {
        this.type = type;
        this.year = year;
        this.engineCap = engineCap;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", year=" + year +
                ", engineCap=" + engineCap +
                '}';
    }
}
