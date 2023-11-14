package PracticalTasks6.Practical3;

public class ColorLine extends Line {
    String color;

    public ColorLine(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " with color - " + color;
    }

    public void print() {
        System.out.println("Color line: " + toString());
    }
}
