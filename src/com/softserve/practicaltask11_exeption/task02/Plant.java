package com.softserve.practicaltask11_exeption.task02;

public class Plant {
    private int s;
    private Color c;
    private Type t;

    public Plant(int size, String color, String type) throws ColorException, TypeException, SizeException {
        this.s = checkSizePlant(size);
        this.c = colorStringToEnum(color);
        this.t = typeStringToEnum(type);
    }


    private Color colorStringToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "red":
                return Color.RED;
            case "green":
                return Color.GREEN;
            case "blue":
                return Color.BLUE;
            case "yellow":
                return Color.YELLOW;
            case "purple":
                return Color.PURPLE;
            default:
                throw new ColorException("Input only color red, green, blue, yellow or purple");
        }
    }


    private Type typeStringToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "flower":
                return Type.FLOWER;
            case "tree":
                return Type.TREE;
            case "shrub":
                return Type.SHRUB;
            case "grass":
                return Type.GRASS;
            case "christmastree":
                return Type.CHRISTMASTREE;
            default:
                throw new TypeException("Input only type flower, tree, shrub, grass or christmastree");
        }
    }


    private int checkSizePlant(int size) throws SizeException {
        if (size >= 1 && size <= 100) {
            return size;
        } else {
            throw new SizeException("Size must be from 1 to 100");
        }
    }


    @Override
    public String toString() {
        return "Plant{" +
                "size=" + s +
                ", color=" + c +
                ", type=" + t +
                '}';
    }
}
