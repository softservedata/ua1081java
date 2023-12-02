package practical12.p2;

enum Color {
    WHITE, RED, BLUE, GREEN, YELLOW
}
enum Type {
    ROSE, TULIP, LILY, ORCHID, IRIS
}
class ColorException extends Exception {
    public ColorException(String arg0) {
        super(arg0);
    }
}
class TypeException extends Exception {
    public TypeException(String arg0) {
        super(arg0);
    }
}
public class Plant {
    private Type type;
    private Color color;
    private int size;
    public Plant(String type, String color, int size) throws ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }
    private Color colorStrToEnum(String color) throws ColorException {
        return switch (color.toLowerCase()) {
            case "blue" -> Color.BLUE;
            case "red" -> Color.RED;
            case "white" -> Color.WHITE;
            case "green" -> Color.GREEN;
            case "yellow" -> Color.YELLOW;
            default -> throw new ColorException("Input only color blue, red, white, green or yellow");
        };
    }
    private Type typeStrToEnum(String type) throws TypeException {
        return switch (type.toLowerCase()) {
            case "lily" -> Type.LILY;
            case "rose" -> Type.ROSE;
            case "tulip" -> Type.TULIP;
            case "orchid" -> Type.ORCHID;
            case "iris" -> Type.IRIS;
            default -> throw new TypeException("Input only type lily, rose, tulip, orchid or iris");
        };
    }
    @Override
    public String toString() {
        return "Plant{" +
                "type=" + type +
                ", color=" + color +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        String[] types = {"rose", "tulip", "lily", "orchi", "iris"};
        String[] colors = {"blue", "red", "white", "gren", "yellow"};
        int[] sizes = {5, 10, 15, 20, 25};
        for (int i = 0; i < 5; i++) {
            try {
                Plant pl = new Plant(types[i], colors[i], sizes[i]);
                System.out.println(pl);
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            } catch (ColorException | TypeException e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
