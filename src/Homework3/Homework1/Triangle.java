package Homework3.Homework1;

import static Homework3.Homework1.Main.SCANNER;

public class Triangle {
    private static int sideA;
    private static int sideB;
    private static int sideC;
    private static double totArea;


    public Triangle() {
    }


    public Triangle(int sideA, int sideB, int sideC) {
        Triangle.sideA = sideA;
        Triangle.sideB = sideB;
        Triangle.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        Triangle.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        Triangle.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        Triangle.sideC = sideC;
    }


    public static void promtSideA(Triangle sideA) {
        System.out.print("Input side 1: ");
        sideA.setSideA(SCANNER.nextInt());
    }

    public static void promtSideB(Triangle sideA) {
        System.out.print("Input side 2: ");
        sideA.setSideB(SCANNER.nextInt());
    }

    public static void promtSideC(Triangle sideA) {
        System.out.print("Input side 3: ");
        sideA.setSideC(SCANNER.nextInt());
    }


    public static double getTotArea() {
        double sp = (double) (sideA + sideB + sideC) / 2;
        return Math.sqrt(sp * (sp - sideA) * (sp - sideB) * (sp - sideC));
    }

    public static void setTotArea(double totArea) {
        Triangle.totArea = totArea;
    }
}
