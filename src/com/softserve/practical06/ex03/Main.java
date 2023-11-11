package com.softserve.practical06.ex03;

public class Main {
    public static void main(String[] args) {
        Line[] lines = new Line[] {
                new ColorLine(new Point(1,2), new Point(6,7), "orange"),
                new Line(new Point(3,5), new Point(10,8)),
                new ColorLine(new Point(5,6), new Point(12,14), "green")
        };

        for (Line line : lines) {
            line.print();
        }
    }
}
