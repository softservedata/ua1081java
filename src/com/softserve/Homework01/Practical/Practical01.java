package com.softserve.Homework01.Practical;

import java.util.Scanner;

public class Practical01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        task1(console);
        task2(console);
        task3(console);
        task4(console);


    }
    public static void task1(Scanner console){
        System.out.println(" **************  Task 1  **************");
        System.out.println(" Input text: ");
        System.out.print(" Enter first string: ");
        String s1 = console.nextLine();
        System.out.print(" Enter second string: ");
        String s2 = console.nextLine();
        System.out.print(" Enter third string: ");
        String s3 = console.nextLine();
        System.out.println(" Output text: ");
        System.out.println(" "+s3+"\n "+s2+"\n "+s1);
    }
    public static void task2(Scanner console){
        System.out.println(" **************  Task 2  **************");
        System.out.println(" Input first number: ");
        int num1 = console.nextInt();
        console.nextLine();
        System.out.println(" Input second number: ");
        int num2 = console.nextInt();
        console.nextLine();
        System.out.println(" Input third number: ");
        int num3 = console.nextInt();
        console.nextLine();
        double avg = (num1+num2+num3)/3.0;
        System.out.println(" Average is "+avg);
    }
    public static void task3(Scanner console){
        int a, b;
        System.out.print(" Enter a: ");
        a= console.nextInt();
        console.nextLine();
        System.out.print(" Enter b: ");
        b= console.nextInt();
        console.nextLine();

        System.out.println(" a + b = " + (a+b)
                +"\n a - b = " + (a-b)
                +"\n a * b = " + (a*b)
                +"\n a / b = "+a/b);
    }

    public static void task4(Scanner console){
        System.out.println(" How are you?");
        String answer = console.nextLine();
        System.out.println(" You are "+answer);
    }

}
