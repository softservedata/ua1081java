package Homework3.Homework1;

import java.util.Scanner;

public class Main {
    static public final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        Triangle sideA = new Triangle();
        Triangle.promtSideA(sideA);
        Triangle sideB = new Triangle();
        Triangle.promtSideB(sideB);
        Triangle sideC = new Triangle();
        Triangle.promtSideC(sideC);

        System.out.println("The area of the triangle is " + String.format("%.2f", Triangle.getTotArea()));

    }
}
