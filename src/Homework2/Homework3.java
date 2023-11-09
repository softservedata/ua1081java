package Homework2;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coast for 1st call:");
        double c1 = scanner.nextDouble();
        System.out.println("Enter time for 1st call:");
        double t1 = scanner.nextDouble();

        System.out.println("Enter coast for 2nd call:");
        double c2 = scanner.nextDouble();
        System.out.println("Enter time for 2nd call:");
        double t2 = scanner.nextDouble();

        System.out.println("Enter coast for 3rd call:");
        double c3 = scanner.nextDouble();
        System.out.println("Enter time for 3rd call:");
        double t3 = scanner.nextDouble();

        double res1 = c1 * t1;
        double res2 = c2 * t2;
        double res3 = c3 * t3;
        double res4 = res1 + res2 + res3;

        System.out.println("Coast per 1st call - " + res1);
        System.out.println("Coast per 1st call - " + res2);
        System.out.println("Coast per 1st call - " + res3);
        System.out.println("Coast per all call - " + res4);

    }
}
