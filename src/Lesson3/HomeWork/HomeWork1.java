package Lesson3.HomeWork;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class HomeWork1 {

    static double CalculateArea(double a, double b, double c){
        double p = (a+b+c)/2;
        double s = sqrt(p*(p-a)*(p-b)*(p-c));
        return s;

    }


    public static void main(String[] args) {

        double a;
        double b;
        double c;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input side 1:");
        a = scan.nextDouble();

        System.out.println("Input side 2:");
        b = scan.nextDouble();

        System.out.println("Input side 3:");
        c = scan.nextDouble();

        double result = CalculateArea(a, b, c);
        System.out.printf("The area of triangle is: %.2f" , result);
    }

}
