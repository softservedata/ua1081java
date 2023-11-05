package practical6.p3;

public class Line extends Point {
    private String color;

    @Override
    void print() {
        super.print();
        System.out.println(color);
    }

    @Override
    public String toString() {
        return "Line{" +
                "color='" + color + '\'' +
                '}';
    }

    public Line(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
}
