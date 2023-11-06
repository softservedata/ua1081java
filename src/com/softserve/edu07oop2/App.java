package com.softserve.edu07oop2;

public class App {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Sphere(7.2, "MySphere"),
                new Cube(5.8, "MyCube"),
                new Cube(6.7, "MyCube"),
                new Sphere(6.3, "MySphere")
        };

        for (Shape shape : shapes) {
            double area = shape.getArea();
            System.out.println("\nShape area for " + shape + " " + area);

            if (shape instanceof Volumetric) {
                double volume = ((Volumetric) shape).getVolume();
                System.out.println("Shape volume for " + shape.getClass().getSimpleName() + " " + volume);
            }
            if (shape instanceof Vertexable) {
                double numberOfVertex = ((Vertexable) shape).getNumberOfVertex();
                System.out.println("Namber of vertex " + shape.getClass().getSimpleName() + " " + numberOfVertex);
            }
        }
    }
}
