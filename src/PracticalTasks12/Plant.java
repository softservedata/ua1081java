package PracticalTasks12;

import java.awt.*;
import java.lang.reflect.Type;

class ColorException extends Exception {
    public ColorException(String message) {
        super(message);
    }
}

class TypeException extends Exception {
    public TypeException(String message) {
        super(message);
    }
}

public class Plant {
    int size;
    Color color;
    Type type;

    enum Color {
        RED, PINK, YELLOW, GREEN;
    }

    enum Type {
        FLOWERS, TREES, BUSHES;
    }

    public Plant(int size, Color color, Type type) throws ColorException, TypeException {
        validSize(size);
        validColor(color);
        validType(type);
        this.size = size;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    private void validSize(int size) {
        if (size < 1 || size > 100) {
            throw new IllegalArgumentException("Invalid size. Size should be between 1 to 100.");
        }
    }

    private void validColor(Color color) throws ColorException {
        if (color != Color.RED && color != Color.PINK && color != Color.YELLOW && color != Color.GREEN) {
            throw new ColorException("Invalid color. Allowed colors are: Red, Pink, Yellow, Green.");
        }
    }

    private void validType(Type type) throws TypeException {
        if (type != Type.FLOWERS && type != Type.TREES && type != Type.BUSHES) {
            throw new TypeException("Invalid type. Allowed type are: Flowers, Trees, Bushes");
        }
    }

}
