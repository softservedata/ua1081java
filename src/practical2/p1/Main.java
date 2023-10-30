package practical2.p1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a = getNumber("Enter first number");
        int b = getNumber("Enter second number");


        System.out.println("The sum of " + a + " and " + b + " is " + getTotal(a, b));
        System.out.println("The average of " + a + " and " + b + " is " + getAverage(a, b));

    }

    static int getNumber(String promt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(promt);
        return sc.nextInt();
    }

    static int getTotal(int a, int b) {
        return a + b;
    }

    static double getAverage(int a, int b) {
        return (a + b) / 2.0;
    }
}





