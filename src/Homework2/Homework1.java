package Homework2;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = scanner.nextInt();
        double pi = 3.14159;
        double per = 2 * pi * r;
        double area = pi * (r * r);
        System.out.println("Perimeter = " + per);
        System.out.println("Area = " + area);
    }
}
