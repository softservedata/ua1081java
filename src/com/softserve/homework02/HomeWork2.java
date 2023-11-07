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
    static Scanner sc = new Scanner(System.in);//better to use static Scanner. I deleted  Scanner in methods
    public void calculateAreaOfATriangle() {
        System.out.println("Area of a triangle");
        System.out.println("Input the first side of a triangle = ");
        firstSide = sc.nextDouble();
        System.out.println("Input the second side of a triangle = ");
        secondSide = sc.nextDouble();
        System.out.println("Input the third side of a triangle = ");
        thirdSide = sc.nextDouble();
        semiPerimeter = ((firstSide + secondSide + thirdSide) / 2);
        System.out.println("semiPerimeter " + semiPerimeter);
        areaOfTriangle = Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
        System.out.println("Area of a triangle = " + areaOfTriangle);
        sc.nextLine();//for cleaning the buffer
    }
//For this task,
// the condition did not require checking the possibility of a triangle's existence with the side lengths entered by the user.
// However, it is good to think through such details.
// After you have learned about conditional statements,
// it would be wise to set a constraint on the semiperimeter, at least that it is positive.
    public void findTheSmallestNumber() {
        System.out.println("find the smallest number");
        System.out.println("Input the first number =");
        firstNumber = sc.nextInt();
        System.out.println("Input the second number =");
        secondNumber = sc.nextInt();
        System.out.println("Input the third number =");
        thirdNumber = sc.nextInt();
        smallestNumber = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
        System.out.println("The smallest number is = " + smallestNumber);
    }


    public static void main(String[] args) {
        HomeWork2 homeWork2 = new HomeWork2();//better to use static methods how in HomeWork1
        homeWork2.calculateAreaOfATriangle();
        homeWork2.findTheSmallestNumber();
    }
}
