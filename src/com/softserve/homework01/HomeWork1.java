package com.softserve.homework01;

import java.util.Scanner;

public class HomeWork1 {
    static double pi = 3.14;

    public void circleCalculation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input radius = ");
        double radius = sc.nextDouble();
        double perimeter = 2 * pi * radius;
        double area = pi * Math.pow(radius,2);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }

    public void inputInformationAboutPeople(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("Where do you live " + name + "?");
        String address = sc.next();
        System.out.println(name + " lives in " +  address);
    }

    public void calculateTheCostOfCalls(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the tariff of a minute from the first country = ");
        double tariff1 =sc.nextDouble();
        System.out.println("Input the duration of the call = ");
        double time1 =sc.nextDouble();
        double fullCost1 = tariff1 * time1;
        System.out.println("The cost of a call from the first country = " + fullCost1);
        System.out.println("Input the tariff of a minute from the second country = ");
        double tariff2 =sc.nextDouble();
        System.out.println("Input the duration of the call = ");
        double time2 =sc.nextDouble();
        double fullCost2 = tariff2 * time2;
        System.out.println("The cost of a call from the second country = " + fullCost2);
        System.out.println("Input the tariff of a minute from the third country = ");
        double tariff3 =sc.nextDouble();
        System.out.println("Input the duration of the call = ");
        double time3 =sc.nextDouble();
        double fullCost3 = tariff3 * time3;
        System.out.println("The cost of a call from the third country = " + fullCost3);
        double fullCost = fullCost1 + fullCost2 + fullCost3;
        System.out.println("The full cost of a calls = " + fullCost);
    }


    public static void main(String[] args) {
       HomeWork1 homeWork1 = new HomeWork1();
       homeWork1.circleCalculation();
       System.out.println();
       homeWork1.inputInformationAboutPeople();
       System.out.println();
       homeWork1.calculateTheCostOfCalls();
    }
}
