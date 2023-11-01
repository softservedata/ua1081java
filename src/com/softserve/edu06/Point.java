package com.softserve.edu06;

public class Point  {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
class Square extends Point{
    private int side;
    public Square() {
    }

    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

}
class Test{
    Square square = new Square(23,-50,4);
}
//composition
class Square1{
    private Point point;
    private int side;

    public Square1(Point point, int side) {
        this.point = point;
        this.side = side;
    }
}
class Test1{
    public static void main(String[] args) {
        Square1 square1 = new Square1(new Point(26,50),7);
    }
}