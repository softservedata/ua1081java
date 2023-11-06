package com.softserve.Homework06.Practical06.Task03;



public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,5);
        Point point2 = new Point(0.5,7);
        Line line = new Line(point1,point2);
        ColorLine colorLine = new ColorLine("Red", point1,point2);
        point1.print();
        point2.print();
        line.print();
        colorLine.print();
    }
}

 class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }
}

class Line {
    private Point point1;
    private Point point2;

    protected Line(Point point1, Point point2) {
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
        System.out.println(this.toString());
    }
}

class ColorLine extends Line {
    private String color;

    public ColorLine(String color, Point point1, Point point2) {
        super(point1, point2);
        this.color = color;

    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                "}\n"+super.toString();
    }

    public void print() {
        System.out.println(this.toString());
    }
}

