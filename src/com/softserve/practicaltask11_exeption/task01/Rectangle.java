package com.softserve.practicaltask11_exeption.task01;

public class Rectangle {
    public static int squareRectangle(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("User entered negative values");
        } else {
            int squareOfRectangle = a * b;
            return squareOfRectangle;
        }
    }
}
