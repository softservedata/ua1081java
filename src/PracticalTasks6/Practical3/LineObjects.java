package PracticalTasks6.Practical3;

public class LineObjects {
    public static void main(String[] args) {
        Line[] lines = new Line[4];

        lines[0] = new ColorLine(1, 4, "Red");
        lines[1] = new ColorLine(5, 9, "Black");
        lines[2] = new ColorLine(10, 14, "Yellow");
        lines[3] = new ColorLine(15, 19, "Blue");

        for (Line line : lines){
            line.print();
        }
    }
}
