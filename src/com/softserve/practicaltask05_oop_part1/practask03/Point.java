package com.softserve.practicaltask05_oop_part1.practask03;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
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

    public void print(){
        System.out.println("Point is printed");
    }

}
