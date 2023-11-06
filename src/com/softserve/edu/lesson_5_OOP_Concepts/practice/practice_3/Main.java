package com.softserve.edu.lesson_5_OOP_Concepts.practice.practice_3;

public class Main {
    public static void main(String[] args) {
        Line[] lines = new Line[]{new Line(new Point(2, 4), new Point(6, 4)),
                new ColorLine(new Point(5, 4), new Point(6, 1), "Yellow"),
                new Line(new Point(10, 3), new Point(4, 4))
        };


        for (Line line : lines) {
            line.print();
            System.out.println(line.getPoint1());
            System.out.println(line.getPoint2());
        }
    }
}
