package com.softserve.practical06.ex03;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.printf("This is the point with (%d, %d) coordinates", getX(), getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return '{' +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
