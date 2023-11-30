package homework3.h1;

import java.util.Scanner;

public class Main {//use more informative names for classes

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side a");
        double a = sc.nextInt();

        System.out.println("Enter side b");
        double b = sc.nextInt();

        System.out.println("Enter side c");
        double c = sc.nextInt();

        System.out.printf("Area =% .2f%n", areaT(a, b, c));
        sc.close();//close the scanner, remember
    }

    static double areaT(double a, double b, double c) {//for naming methods use verbs or verb phrases,eg. calculateArea
        double s = (a + b + c) / 2;//use more informative names for variables and methods
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
