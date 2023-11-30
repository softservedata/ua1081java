package homework3.h2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double a = sc.nextDouble();

        System.out.println("Enter the second number:");
        double b = sc.nextDouble();

        System.out.println("Enter the third number:");
        double c = sc.nextDouble();

        System.out.println(numMin(a, b, c));
        sc.close();
    }

    static double numMin(double a, double b, double c) {
        double s = Math.min(a, b);
        return Math.min(c, s);
    }
}



