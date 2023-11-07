package com.softserve.practicaltask05_oop_part1.practask03;

public class Line {

    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    public void print() {
        System.out.println("Line is printed");
    }
}
