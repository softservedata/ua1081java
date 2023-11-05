package com.softserve.homework02;

import com.softserve.homework01.HomeWork1;

import java.util.Scanner;

public class HomeWork2 {

    double firstSide;
    double secondSide;
    double thirdSide;
    double semiPerimeter;
    double areaOfTriangle;
    int firstNumber;
    int secondNumber;
    int thirdNumber;
    int smallestNumber;

    public void calculateAreaOfATriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of a triangle");
        System.out.println("Input the first side of a triangle  =");
        firstSide = sc.nextDouble();
        System.out.println("Input the second side of a triangle  =");
        secondSide = sc.nextDouble();
        System.out.println("Input the third side of a triangle  =");
        thirdSide = sc.nextDouble();
        semiPerimeter = ((firstSide + secondSide + thirdSide) / 2);
        System.out.println("semiPerimeter " + semiPerimeter);
        areaOfTriangle = Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
        System.out.println("Area of a triangle = " + areaOfTriangle);
    }

    public void findTheSmallestNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("find the smallest number");
        System.out.println("Input the first number =");
        firstNumber = sc.nextInt();
        System.out.println("Input the second number =");
        secondNumber = sc.nextInt();
        System.out.println("Input the third number =");
        thirdNumber = sc.nextInt();
        smallestNumber = Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
        System.out.println("The smallest number is = " + smallestNumber);
    }

    public static void main(String[] args) {
        HomeWork2 homeWork2 = new HomeWork2();
        homeWork2.calculateAreaOfATriangle();
        homeWork2.findTheSmallestNumber();
    }


}
