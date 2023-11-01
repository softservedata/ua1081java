package com.softserve.edu06;

class Rectangle {
    protected int width;
    protected int height;

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

class Parallelogram1 extends Rectangle {
    private int angle;


        public int getArea() {
            return (int) (width * height * Math.sin(angle * Math.PI / 180));
        }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
}
