package com.softserve.edu.lesson_2_OOP.homeworks.hw_1;

import java.util.Scanner;

//for this task you should create Triangle class and move all logic to this class
//additional you can create method isTriangle() which will check if triangle can be created with such sides
//class Triangle {
//    private int firstSide = 0;
//    private int secondSide = 0;
//    private int thirdSide = 0;
//
//    public Triangle() {
//    }
//
//    public Triangle(int firstSide, int secondSide, int thirdSide) {
//        this.firstSide = firstSide;
//        this.secondSide = secondSide;
//        this.thirdSide = thirdSide;
//    }
//
//    public boolean isTriangle() {
//        return firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide;
//    }
//
//    public double countArea() {
//        double perimeter = firstSide + secondSide + thirdSide;
//        double halfPerimeter = perimeter / 2;
//        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
//    }
//
//    public int getFirstSide() {
//        return firstSide;
//    }
//
//    public int getSecondSide() {
//        return secondSide;
//    }
//
//    public int getThirdSide() {
//        return thirdSide;
//    }
//}

public class Main {//class name should be more informative
    static int first_side;//not convenient name for variable
    static int second_side;
    static int third_side;

    public static double countArea(double s) {
        return Math.sqrt(s * (s - first_side) * (s - second_side) * (s - third_side));
    }

    public static void main(String[] args) {
        // Calculate area of a triangle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side:");
        int first_side = sc.nextInt();//can be
        // Main.first_side = sc.nextInt();
        System.out.println("Enter second side:");
        Main.second_side = sc.nextInt();
        System.out.println("Enter third side:");
        Main.third_side = sc.nextInt();

        double perimetr = first_side + second_side + third_side;
        double s = perimetr / 2; //dont use s, use more informative name for variable -->halfPerimeter
        double area = Main.countArea(s);
        String area_res = String.format("%.2f", area);

        System.out.println("The area of the triangle is " + area_res);

    }
}
