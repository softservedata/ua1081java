package com.softserve.practicaltask05_oop_part1.practask03;

public class ColorLine extends Line {
    public String color;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }

    public void print() {
        System.out.println("Color line is printed");
    }

}
