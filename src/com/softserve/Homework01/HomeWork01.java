package com.softserve.Homework01;
//don't forget formatting your code.
import java.util.Scanner;
public class HomeWork01 {

    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    task1(console);
    task2(console);
    task3(console);
    }
    public static void task1(Scanner console){
        System.out.println("******* Task 1 *******");
        System.out.print(" Enter radius: ");
        double R = console.nextDouble(); //better name is radius, and don't name variables with capital letter.
        console.nextLine();
        System.out.println(" Perimeter circle = "+(2*R*Math.PI));//Don`t forget formatting your code.
        System.out.println(" Area circle = " + (Math.PI*R*R)); //If you use library Math, use Math.pow(R,2) instead R*R.
    }

    public static void task2(Scanner console){
        System.out.println("******* Task 2 *******");
        System.out.println(" What is your name?");
        String name = console.nextLine();
        System.out.println("Where do you live," + name+"?");
        String address = console.nextLine();
        System.out.println(name+" lives in "+address);
    }

    public static void task3(Scanner console){
        System.out.println("******* Task 3 *******");
        System.out.println(" Enter cost per minute (c1,c2,c3): ");
        System.out.print("c1 = ");
        double c1 =console.nextDouble();
        console.nextLine();
        System.out.print("c2 = ");
        double c2 =console.nextDouble();
        console.nextLine();
        System.out.print("c3 = ");
        double c3 =console.nextDouble();
        console.nextLine();

        System.out.println(" Enter duration (t1,t2,t3): ");
        System.out.print("t1 = ");
        double t1 =console.nextDouble();
        console.nextLine();
        System.out.print("t2 = ");
        double t2 =console.nextDouble();
        console.nextLine();
        System.out.print("t3 = ");
        double t3 =console.nextDouble();
        console.nextLine();

        System.out.println(" Firs call ( c1 = "+c1+" ; t1 = "+t1+" )\n Result (c1*t1) = "+c1*t1);
        System.out.println("\n Second call ( c2 = "+c2+" ; t2 = "+t2+" )\n Result (c2*t2) = "+c2*t2);
        System.out.println("\n Thirst call ( c3 = "+c3+" ; t3 = "+t3+" )\n Result (c3*t3) = "+c3*t3);
    }
}