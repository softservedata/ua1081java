package homework4.h2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = sc.nextInt();

        System.out.println("Enter second number:");
        int number2 = sc.nextInt();

        System.out.println("Enter third number:");
        int number3 = sc.nextInt();

        int max = number1;
        int min = number1;

        if (number2>number1){
            max=number2;
        }
        if (number3>number1){
            max = number3;
        }
        if (number2<number1){
            min = number2;
        }
        if (number3<number1){
            min = number1;
        }
        System.out.println("Min " + min + "; Max " + max);

    }
}