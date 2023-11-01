package PracticalTasks01;

import java.util.Scanner;

public class Practical02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number");
        double num1 = scan.nextDouble();
        System.out.println("Input second number");
        double num2 = scan.nextDouble();
        System.out.println("Input third number");
        double num3 = scan.nextDouble();

        double res = (num1 + num2 + num3) / 3;
        System.out.println("Avarage is " + res);
    }
}
