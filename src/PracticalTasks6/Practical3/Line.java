package PracticalTasks6.Practical3;

public class Line extends Point {

    public Line(int x, int y) {
        super(x, y);
    }


    @Override
    public String toString() {
        return "Line from " + x + " to " + y;
    }

    public void print() {
        System.out.println("Line: " + toString());
    }
}
