package practical6.p3;

public class Main {

    public static void main(String[] args) {
        Line[] lines = new Line[]{
          new Line(2,5,"Black"),
          new ColorLine(1,2,"White")
        };
        for (Line line : lines){
            line.print();
        }

    }
}