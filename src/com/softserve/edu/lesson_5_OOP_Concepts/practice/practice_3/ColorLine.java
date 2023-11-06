package com.softserve.edu.lesson_5_OOP_Concepts.practice.practice_3;

public class ColorLine extends Line{

    private String color;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("Print color line");
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }
}
