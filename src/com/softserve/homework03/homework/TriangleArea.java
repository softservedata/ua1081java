package com.softserve.homework03.homework;

public class TriangleArea {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double getArea() {
        double semiperimeter = (getFirstSide() + getSecondSide() + getThirdSide()) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - getFirstSide()) * (semiperimeter - getSecondSide()) * (semiperimeter - getThirdSide()));
    }
}
