package practical1.p2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Input first number:" );
        double num1 = sc.nextDouble();

        System.out.println("Input second number:");
        double num2 = sc.nextDouble();

        System.out.println("Input third number:");
        double num3 = sc.nextDouble();



        System.out.println("Average is: ");
        System.out.println((num1+num2+num3)/3);

    }
}