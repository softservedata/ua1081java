package com.softserve.edu.lesson_11_Exception.practice.practice_2;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Plant(int size, String color, String type) throws SizeException,ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.color = c;
        this.type = t;
        checkSize(size);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    private Color colorStrToEnum(String color) throws ColorException {
        return switch (color.toLowerCase()) {
            case "blue" -> Color.BLUE;
            case "yellow" -> Color.YELLOW;
            case "green" -> Color.GREEN;
            default -> throw new ColorException("Enter only blue,yellow,green");
        };
    }

    private Type typeStrToEnum(String type) throws TypeException {
        return switch (type.toLowerCase()) {
            case "rose" -> Type.ROSE;
            case "lily" -> Type.LILY;
            case "orchid" -> Type.ORCHID;
            default -> throw new TypeException("Enter only rose,lily,orchid");
        };
    }

    static void checkSize(int size) throws SizeException {
        if (size > 5 || size < 2) {
            throw new SizeException("Enter a size larger than or equal to 2 or smaller than or equal to 5");
        }
    }
}
