package practical1.p3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Input first number:" );
        byte num1 = sc.nextByte();

        System.out.println("Input second number:");
        byte num2 = sc.nextByte();




        System.out.println("Results is: ");
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
    }
}